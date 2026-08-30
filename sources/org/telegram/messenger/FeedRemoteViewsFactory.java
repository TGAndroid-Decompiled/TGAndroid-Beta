package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public class FeedRemoteViewsFactory implements RemoteViewsService.RemoteViewsFactory, NotificationCenter.NotificationCenterDelegate {
    private AccountInstance accountInstance;
    private int classGuid;
    private long dialogId;
    private Context mContext;
    private ArrayList<MessageObject> messages = new ArrayList<>();
    private CountDownLatch countDownLatch = new CountDownLatch(1);

    public FeedRemoteViewsFactory(Context context, Intent intent) {
        this.mContext = context;
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        int i10 = sharedPreferences.getInt("account" + intExtra, -1);
        if (i10 >= 0) {
            this.dialogId = sharedPreferences.getLong("dialogId" + intExtra, 0L);
            this.accountInstance = AccountInstance.getInstance(i10);
        }
    }

    public void lambda$onDataSetChanged$0() {
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        if (this.classGuid == 0) {
            this.classGuid = ConnectionsManager.generateClassGuid();
        }
        this.accountInstance.getMessagesController().loadMessages(this.dialogId, 0L, false, 20, 0, 0, true, 0, this.classGuid, 0, 0, 0, 0L, 0, 1, false);
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.messagesDidLoad && ((Integer) objArr[10]).intValue() == this.classGuid) {
            this.messages.clear();
            this.messages.addAll((ArrayList) objArr[2]);
            this.countDownLatch.countDown();
        }
    }

    @Override
    public int getCount() {
        return this.messages.size();
    }

    @Override
    public long getItemId(int i10) {
        return i10;
    }

    @Override
    public RemoteViews getLoadingView() {
        return null;
    }

    @Override
    public RemoteViews getViewAt(int i10) {
        MessageObject messageObject = this.messages.get(i10);
        RemoteViews remoteViews = new RemoteViews(this.mContext.getPackageName(), R.layout.feed_widget_item);
        if (messageObject.type == 0) {
            remoteViews.setTextViewText(R.id.feed_widget_item_text, messageObject.messageText);
            remoteViews.setViewVisibility(R.id.feed_widget_item_text, 0);
        } else if (TextUtils.isEmpty(messageObject.caption)) {
            remoteViews.setViewVisibility(R.id.feed_widget_item_text, 8);
        } else {
            remoteViews.setTextViewText(R.id.feed_widget_item_text, messageObject.caption);
            remoteViews.setViewVisibility(R.id.feed_widget_item_text, 0);
        }
        ArrayList<TLRPC.PhotoSize> arrayList = messageObject.photoThumbs;
        if (arrayList != null && !arrayList.isEmpty()) {
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize()));
            if (pathToAttach.exists()) {
                remoteViews.setViewVisibility(R.id.feed_widget_item_image, 0);
                Context context = this.mContext;
                Uri d = FileProvider.d(context, ApplicationLoader.getApplicationId() + ".provider", pathToAttach);
                grantUriAccessToWidget(this.mContext, d);
                remoteViews.setImageViewUri(R.id.feed_widget_item_image, d);
            } else {
                remoteViews.setViewVisibility(R.id.feed_widget_item_image, 8);
            }
        } else {
            remoteViews.setViewVisibility(R.id.feed_widget_item_image, 8);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chatId", -messageObject.getDialogId());
        bundle.putInt("message_id", messageObject.getId());
        bundle.putInt("currentAccount", this.accountInstance.getCurrentAccount());
        Intent intent = new Intent();
        intent.putExtras(bundle);
        remoteViews.setOnClickFillInIntent(R.id.shortcut_widget_item, intent);
        return remoteViews;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    public void grantUriAccessToWidget(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
            context.grantUriPermission(resolveInfo.activityInfo.packageName, uri, 1);
        }
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public void onCreate() {
        ApplicationLoader.postInitApplication();
    }

    @Override
    public void onDataSetChanged() {
        AccountInstance accountInstance = this.accountInstance;
        if (accountInstance != null && accountInstance.getUserConfig().isClientActivated()) {
            AndroidUtilities.runOnUIThread(new e1(this, 1));
            try {
                this.countDownLatch.await();
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.messages.clear();
    }

    @Override
    public void onDestroy() {
    }
}
