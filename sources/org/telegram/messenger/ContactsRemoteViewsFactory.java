package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;

class ContactsRemoteViewsFactory implements RemoteViewsService.RemoteViewsFactory {
    private AccountInstance accountInstance;
    private int appWidgetId;
    private RectF bitmapRect;
    private boolean deleted;
    private Context mContext;
    private Paint roundPaint;
    private ArrayList<Long> dids = new ArrayList<>();
    private LongSparseArray dialogs = new LongSparseArray();

    public ContactsRemoteViewsFactory(Context context, Intent intent) {
        this.mContext = context;
        Theme.createDialogsResources(context);
        this.appWidgetId = intent.getIntExtra("appWidgetId", 0);
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        int i = sharedPreferences.getInt("account" + this.appWidgetId, -1);
        if (i >= 0) {
            this.accountInstance = AccountInstance.getInstance(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("deleted");
        sb.append(this.appWidgetId);
        this.deleted = sharedPreferences.getBoolean(sb.toString(), false) || this.accountInstance == null;
    }

    @Override
    public int getCount() {
        if (this.deleted) {
            return 1;
        }
        return ((int) Math.ceil(this.dids.size() / 2.0f)) + 1;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public RemoteViews getLoadingView() {
        return null;
    }

    @Override
    public RemoteViews getViewAt(int i) {
        String str;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.FileLocation fileLocation;
        Bitmap decodeFile;
        long j;
        String str2;
        int i2;
        AvatarDrawable avatarDrawable;
        int i3;
        TLRPC.UserProfilePhoto userProfilePhoto;
        if (this.deleted) {
            RemoteViews remoteViews = new RemoteViews(this.mContext.getPackageName(), R.layout.widget_deleted);
            remoteViews.setTextViewText(R.id.widget_deleted_text, LocaleController.getString(R.string.WidgetLoggedOff));
            return remoteViews;
        }
        if (i >= getCount() - 1) {
            RemoteViews remoteViews2 = new RemoteViews(this.mContext.getPackageName(), R.layout.widget_edititem);
            remoteViews2.setTextViewText(R.id.widget_edititem_text, LocaleController.getString(R.string.TapToEditWidgetShort));
            Bundle bundle = new Bundle();
            bundle.putInt("appWidgetId", this.appWidgetId);
            bundle.putInt("appWidgetType", 1);
            bundle.putInt("currentAccount", this.accountInstance.getCurrentAccount());
            Intent intent = new Intent();
            intent.putExtras(bundle);
            remoteViews2.setOnClickFillInIntent(R.id.widget_edititem, intent);
            return remoteViews2;
        }
        RemoteViews remoteViews3 = new RemoteViews(this.mContext.getPackageName(), R.layout.contacts_widget_item);
        int i4 = 0;
        while (i4 < 2) {
            int i5 = (i * 2) + i4;
            if (i5 >= this.dids.size()) {
                remoteViews3.setViewVisibility(i4 == 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, 4);
            } else {
                remoteViews3.setViewVisibility(i4 == 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, 0);
                Long l = this.dids.get(i5);
                if (DialogObject.isUserDialog(l.longValue())) {
                    user = this.accountInstance.getMessagesController().getUser(l);
                    if (UserObject.isUserSelf(user)) {
                        i3 = R.string.SavedMessages;
                    } else if (UserObject.isReplyUser(user)) {
                        i3 = R.string.RepliesTitle;
                    } else if (UserObject.isDeleted(user)) {
                        i3 = R.string.HiddenName;
                    } else {
                        str = UserObject.getFirstName(user);
                        if (!UserObject.isReplyUser(user) || UserObject.isUserSelf(user) || user == null || (userProfilePhoto = user.photo) == null || (fileLocation = userProfilePhoto.photo_small) == null || fileLocation.volume_id == 0 || fileLocation.local_id == 0) {
                            chat = null;
                            fileLocation = null;
                        } else {
                            chat = null;
                        }
                    }
                    str = LocaleController.getString(i3);
                    if (UserObject.isReplyUser(user)) {
                    }
                    chat = null;
                    fileLocation = null;
                } else {
                    TLRPC.Chat chat2 = this.accountInstance.getMessagesController().getChat(Long.valueOf(-l.longValue()));
                    if (chat2 != null) {
                        str = chat2.title;
                        TLRPC.ChatPhoto chatPhoto = chat2.photo;
                        if (chatPhoto != null && (fileLocation = chatPhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                            chat = chat2;
                            user = null;
                        }
                    } else {
                        str = "";
                    }
                    chat = chat2;
                    user = null;
                    fileLocation = null;
                }
                remoteViews3.setTextViewText(i4 == 0 ? R.id.contacts_widget_item_text1 : R.id.contacts_widget_item_text2, str);
                if (fileLocation != null) {
                    try {
                        decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(fileLocation, true).toString());
                    } catch (Throwable th) {
                        FileLog.e(th);
                    }
                } else {
                    decodeFile = null;
                }
                int dp = AndroidUtilities.dp(48.0f);
                Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                if (decodeFile == null) {
                    if (user != null) {
                        avatarDrawable = new AvatarDrawable(user);
                        if (UserObject.isReplyUser(user)) {
                            avatarDrawable.setAvatarType(12);
                        } else if (UserObject.isUserSelf(user)) {
                            avatarDrawable.setAvatarType(1);
                        }
                    } else {
                        AvatarDrawable avatarDrawable2 = new AvatarDrawable();
                        avatarDrawable2.setInfo(this.accountInstance.getCurrentAccount(), chat);
                        avatarDrawable = avatarDrawable2;
                    }
                    avatarDrawable.setBounds(0, 0, dp, dp);
                    avatarDrawable.draw(canvas);
                } else {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(decodeFile, tileMode, tileMode);
                    if (this.roundPaint == null) {
                        this.roundPaint = new Paint(1);
                        this.bitmapRect = new RectF();
                    }
                    float width = dp / decodeFile.getWidth();
                    canvas.save();
                    canvas.scale(width, width);
                    this.roundPaint.setShader(bitmapShader);
                    this.bitmapRect.set(0.0f, 0.0f, decodeFile.getWidth(), decodeFile.getHeight());
                    canvas.drawRoundRect(this.bitmapRect, decodeFile.getWidth(), decodeFile.getHeight(), this.roundPaint);
                    canvas.restore();
                }
                canvas.setBitmap(null);
                remoteViews3.setImageViewBitmap(i4 == 0 ? R.id.contacts_widget_item_avatar1 : R.id.contacts_widget_item_avatar2, createBitmap);
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.dialogs.get(l.longValue());
                if (dialog == null || (i2 = dialog.unread_count) <= 0) {
                    remoteViews3.setViewVisibility(i4 == 0 ? R.id.contacts_widget_item_badge_bg1 : R.id.contacts_widget_item_badge_bg2, 8);
                } else {
                    remoteViews3.setTextViewText(i4 == 0 ? R.id.contacts_widget_item_badge1 : R.id.contacts_widget_item_badge2, i2 > 99 ? String.format("%d+", 99) : String.format("%d", Integer.valueOf(i2)));
                    remoteViews3.setViewVisibility(i4 == 0 ? R.id.contacts_widget_item_badge_bg1 : R.id.contacts_widget_item_badge_bg2, 0);
                }
                Bundle bundle2 = new Bundle();
                if (DialogObject.isUserDialog(l.longValue())) {
                    j = l.longValue();
                    str2 = "userId";
                } else {
                    j = -l.longValue();
                    str2 = "chatId";
                }
                bundle2.putLong(str2, j);
                bundle2.putInt("currentAccount", this.accountInstance.getCurrentAccount());
                Intent intent2 = new Intent();
                intent2.putExtras(bundle2);
                remoteViews3.setOnClickFillInIntent(i4 == 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, intent2);
            }
            i4++;
        }
        return remoteViews3;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
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
        this.dids.clear();
        AccountInstance accountInstance = this.accountInstance;
        if (accountInstance == null || !accountInstance.getUserConfig().isClientActivated()) {
            return;
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList2 = new ArrayList<>();
        this.accountInstance.getMessagesStorage().getWidgetDialogs(this.appWidgetId, 1, this.dids, this.dialogs, new LongSparseArray(), arrayList, arrayList2);
        this.accountInstance.getMessagesController().putUsers(arrayList, true);
        this.accountInstance.getMessagesController().putChats(arrayList2, true);
    }

    @Override
    public void onDestroy() {
    }
}
