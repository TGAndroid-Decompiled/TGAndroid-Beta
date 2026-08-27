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
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

class ContactsRemoteViewsFactory implements RemoteViewsService.RemoteViewsFactory {
    private AccountInstance accountInstance;
    private int appWidgetId;
    private RectF bitmapRect;
    private boolean deleted;
    private Context mContext;
    private Paint roundPaint;
    private ArrayList<Long> dids = new ArrayList<>();
    private a0.h dialogs = new a0.h();

    public ContactsRemoteViewsFactory(Context context, Intent intent) {
        this.mContext = context;
        org.telegram.ui.ActionBar.g6.R(context);
        this.appWidgetId = intent.getIntExtra("appWidgetId", 0);
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        int i10 = sharedPreferences.getInt("account" + this.appWidgetId, -1);
        if (i10 >= 0) {
            this.accountInstance = AccountInstance.getInstance(i10);
        }
        StringBuilder sb2 = new StringBuilder("deleted");
        sb2.append(this.appWidgetId);
        this.deleted = sharedPreferences.getBoolean(sb2.toString(), false) || this.accountInstance == null;
    }

    @Override
    public int getCount() {
        if (this.deleted) {
            return 1;
        }
        return ((int) Math.ceil(this.dids.size() / 2.0f)) + 1;
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
        String string;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.FileLocation fileLocation;
        Bitmap bitmapDecodeFile;
        int i11;
        org.telegram.ui.Components.y8 y8Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        if (this.deleted) {
            RemoteViews remoteViews = new RemoteViews(this.mContext.getPackageName(), R.layout.widget_deleted);
            remoteViews.setTextViewText(R.id.widget_deleted_text, LocaleController.getString(R.string.WidgetLoggedOff));
            return remoteViews;
        }
        if (i10 >= getCount() - 1) {
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
        int i12 = 0;
        while (i12 < 2) {
            int i13 = (i10 * 2) + i12;
            if (i13 >= this.dids.size()) {
                remoteViews3.setViewVisibility(i12 == 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, 4);
            } else {
                remoteViews3.setViewVisibility(i12 == 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, 0);
                Long l10 = this.dids.get(i13);
                if (DialogObject.isUserDialog(l10.longValue())) {
                    user = this.accountInstance.getMessagesController().getUser(l10);
                    if (UserObject.isUserSelf(user)) {
                        string = LocaleController.getString(R.string.SavedMessages);
                    } else if (UserObject.isReplyUser(user)) {
                        string = LocaleController.getString(R.string.RepliesTitle);
                    } else {
                        string = UserObject.isDeleted(user) ? LocaleController.getString(R.string.HiddenName) : UserObject.getFirstName(user);
                    }
                    if (UserObject.isReplyUser(user) || UserObject.isUserSelf(user) || user == null || (userProfilePhoto = user.photo) == null || (fileLocation = userProfilePhoto.photo_small) == null || fileLocation.volume_id == 0 || fileLocation.local_id == 0) {
                        chat = null;
                        fileLocation = null;
                    } else {
                        chat = null;
                    }
                } else {
                    TLRPC.Chat chat2 = this.accountInstance.getMessagesController().getChat(Long.valueOf(-l10.longValue()));
                    if (chat2 != null) {
                        string = chat2.title;
                        TLRPC.ChatPhoto chatPhoto = chat2.photo;
                        if (chatPhoto != null && (fileLocation = chatPhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                            chat = chat2;
                            user = null;
                        }
                    } else {
                        string = "";
                    }
                    chat = chat2;
                    user = null;
                    fileLocation = null;
                }
                remoteViews3.setTextViewText(i12 == 0 ? R.id.contacts_widget_item_text1 : R.id.contacts_widget_item_text2, string);
                if (fileLocation != null) {
                    try {
                        bitmapDecodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(fileLocation, true).toString());
                    } catch (Throwable th) {
                        FileLog.e(th);
                    }
                } else {
                    bitmapDecodeFile = null;
                }
                int iDp = AndroidUtilities.dp(48.0f);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iDp, iDp, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.eraseColor(0);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                if (bitmapDecodeFile == null) {
                    if (user != null) {
                        y8Var = new org.telegram.ui.Components.y8(0, user);
                        if (UserObject.isReplyUser(user)) {
                            y8Var.g(12);
                        } else if (UserObject.isUserSelf(user)) {
                            y8Var.g(1);
                        }
                    } else {
                        org.telegram.ui.Components.y8 y8Var2 = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
                        y8Var2.k(this.accountInstance.getCurrentAccount(), chat);
                        y8Var = y8Var2;
                    }
                    y8Var.setBounds(0, 0, iDp, iDp);
                    y8Var.draw(canvas);
                } else {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmapDecodeFile, tileMode, tileMode);
                    if (this.roundPaint == null) {
                        this.roundPaint = new Paint(1);
                        this.bitmapRect = new RectF();
                    }
                    float width = iDp / bitmapDecodeFile.getWidth();
                    canvas.save();
                    canvas.scale(width, width);
                    this.roundPaint.setShader(bitmapShader);
                    this.bitmapRect.set(0.0f, 0.0f, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight());
                    canvas.drawRoundRect(this.bitmapRect, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), this.roundPaint);
                    canvas.restore();
                }
                canvas.setBitmap(null);
                remoteViews3.setImageViewBitmap(i12 == 0 ? R.id.contacts_widget_item_avatar1 : R.id.contacts_widget_item_avatar2, bitmapCreateBitmap);
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.dialogs.f(l10.longValue());
                if (dialog == null || (i11 = dialog.unread_count) <= 0) {
                    remoteViews3.setViewVisibility(i12 == 0 ? R.id.contacts_widget_item_badge_bg1 : R.id.contacts_widget_item_badge_bg2, 8);
                } else {
                    remoteViews3.setTextViewText(i12 == 0 ? R.id.contacts_widget_item_badge1 : R.id.contacts_widget_item_badge2, i11 > 99 ? String.format("%d+", 99) : String.format("%d", Integer.valueOf(i11)));
                    remoteViews3.setViewVisibility(i12 == 0 ? R.id.contacts_widget_item_badge_bg1 : R.id.contacts_widget_item_badge_bg2, 0);
                }
                Bundle bundle2 = new Bundle();
                if (DialogObject.isUserDialog(l10.longValue())) {
                    bundle2.putLong("userId", l10.longValue());
                } else {
                    bundle2.putLong("chatId", -l10.longValue());
                }
                bundle2.putInt("currentAccount", this.accountInstance.getCurrentAccount());
                Intent intent2 = new Intent();
                intent2.putExtras(bundle2);
                remoteViews3.setOnClickFillInIntent(i12 == 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, intent2);
            }
            i12++;
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
        this.accountInstance.getMessagesStorage().getWidgetDialogs(this.appWidgetId, 1, this.dids, this.dialogs, new a0.h(), arrayList, arrayList2);
        this.accountInstance.getMessagesController().putUsers(arrayList, true);
        this.accountInstance.getMessagesController().putChats(arrayList2, true);
    }

    @Override
    public void onDestroy() {
    }
}
