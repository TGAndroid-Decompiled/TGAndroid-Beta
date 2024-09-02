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
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatPhoto;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserProfilePhoto;
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
    private LongSparseArray<TLRPC$Dialog> dialogs = new LongSparseArray<>();

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public RemoteViews getLoadingView() {
        return null;
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
    public void onDestroy() {
    }

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
    public void onCreate() {
        ApplicationLoader.postInitApplication();
    }

    @Override
    public int getCount() {
        if (this.deleted) {
            return 1;
        }
        return ((int) Math.ceil(this.dids.size() / 2.0f)) + 1;
    }

    @Override
    public RemoteViews getViewAt(int i) {
        String str;
        TLRPC$Chat tLRPC$Chat;
        TLRPC$User tLRPC$User;
        TLRPC$FileLocation tLRPC$FileLocation;
        Bitmap decodeFile;
        int i2;
        AvatarDrawable avatarDrawable;
        TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto;
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
        int i3 = 0;
        while (i3 < 2) {
            int i4 = (i * 2) + i3;
            if (i4 >= this.dids.size()) {
                remoteViews3.setViewVisibility(i3 == 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, 4);
            } else {
                remoteViews3.setViewVisibility(i3 == 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, 0);
                Long l = this.dids.get(i4);
                if (DialogObject.isUserDialog(l.longValue())) {
                    tLRPC$User = this.accountInstance.getMessagesController().getUser(l);
                    if (UserObject.isUserSelf(tLRPC$User)) {
                        str = LocaleController.getString(R.string.SavedMessages);
                    } else if (UserObject.isReplyUser(tLRPC$User)) {
                        str = LocaleController.getString(R.string.RepliesTitle);
                    } else if (UserObject.isDeleted(tLRPC$User)) {
                        str = LocaleController.getString(R.string.HiddenName);
                    } else {
                        str = UserObject.getFirstName(tLRPC$User);
                    }
                    if (UserObject.isReplyUser(tLRPC$User) || UserObject.isUserSelf(tLRPC$User) || tLRPC$User == null || (tLRPC$UserProfilePhoto = tLRPC$User.photo) == null || (tLRPC$FileLocation = tLRPC$UserProfilePhoto.photo_small) == null || tLRPC$FileLocation.volume_id == 0 || tLRPC$FileLocation.local_id == 0) {
                        tLRPC$Chat = null;
                        tLRPC$FileLocation = null;
                    } else {
                        tLRPC$Chat = null;
                    }
                } else {
                    TLRPC$Chat chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-l.longValue()));
                    if (chat != null) {
                        str = chat.title;
                        TLRPC$ChatPhoto tLRPC$ChatPhoto = chat.photo;
                        if (tLRPC$ChatPhoto != null && (tLRPC$FileLocation = tLRPC$ChatPhoto.photo_small) != null && tLRPC$FileLocation.volume_id != 0 && tLRPC$FileLocation.local_id != 0) {
                            tLRPC$Chat = chat;
                            tLRPC$User = null;
                        }
                    } else {
                        str = "";
                    }
                    tLRPC$Chat = chat;
                    tLRPC$User = null;
                    tLRPC$FileLocation = null;
                }
                remoteViews3.setTextViewText(i3 == 0 ? R.id.contacts_widget_item_text1 : R.id.contacts_widget_item_text2, str);
                if (tLRPC$FileLocation != null) {
                    try {
                        decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tLRPC$FileLocation, true).toString());
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
                    if (tLRPC$User != null) {
                        avatarDrawable = new AvatarDrawable(tLRPC$User);
                        if (UserObject.isReplyUser(tLRPC$User)) {
                            avatarDrawable.setAvatarType(12);
                        } else if (UserObject.isUserSelf(tLRPC$User)) {
                            avatarDrawable.setAvatarType(1);
                        }
                    } else {
                        AvatarDrawable avatarDrawable2 = new AvatarDrawable();
                        avatarDrawable2.setInfo(this.accountInstance.getCurrentAccount(), tLRPC$Chat);
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
                remoteViews3.setImageViewBitmap(i3 == 0 ? R.id.contacts_widget_item_avatar1 : R.id.contacts_widget_item_avatar2, createBitmap);
                TLRPC$Dialog tLRPC$Dialog = this.dialogs.get(l.longValue());
                if (tLRPC$Dialog != null && (i2 = tLRPC$Dialog.unread_count) > 0) {
                    remoteViews3.setTextViewText(i3 == 0 ? R.id.contacts_widget_item_badge1 : R.id.contacts_widget_item_badge2, i2 > 99 ? String.format("%d+", 99) : String.format("%d", Integer.valueOf(i2)));
                    remoteViews3.setViewVisibility(i3 == 0 ? R.id.contacts_widget_item_badge_bg1 : R.id.contacts_widget_item_badge_bg2, 0);
                } else {
                    remoteViews3.setViewVisibility(i3 == 0 ? R.id.contacts_widget_item_badge_bg1 : R.id.contacts_widget_item_badge_bg2, 8);
                }
                Bundle bundle2 = new Bundle();
                if (DialogObject.isUserDialog(l.longValue())) {
                    bundle2.putLong("userId", l.longValue());
                } else {
                    bundle2.putLong("chatId", -l.longValue());
                }
                bundle2.putInt("currentAccount", this.accountInstance.getCurrentAccount());
                Intent intent2 = new Intent();
                intent2.putExtras(bundle2);
                remoteViews3.setOnClickFillInIntent(i3 == 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, intent2);
            }
            i3++;
        }
        return remoteViews3;
    }

    @Override
    public void onDataSetChanged() {
        this.dids.clear();
        AccountInstance accountInstance = this.accountInstance;
        if (accountInstance == null || !accountInstance.getUserConfig().isClientActivated()) {
            return;
        }
        ArrayList<TLRPC$User> arrayList = new ArrayList<>();
        ArrayList<TLRPC$Chat> arrayList2 = new ArrayList<>();
        this.accountInstance.getMessagesStorage().getWidgetDialogs(this.appWidgetId, 1, this.dids, this.dialogs, new LongSparseArray<>(), arrayList, arrayList2);
        this.accountInstance.getMessagesController().putUsers(arrayList, true);
        this.accountInstance.getMessagesController().putChats(arrayList2, true);
    }
}
