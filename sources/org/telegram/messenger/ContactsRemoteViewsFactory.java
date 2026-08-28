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
        org.telegram.ui.ActionBar.f6.R(context);
        boolean z10 = false;
        this.appWidgetId = intent.getIntExtra("appWidgetId", 0);
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        int i9 = sharedPreferences.getInt("account" + this.appWidgetId, -1);
        if (i9 >= 0) {
            this.accountInstance = AccountInstance.getInstance(i9);
        }
        StringBuilder sb2 = new StringBuilder("deleted");
        sb2.append(this.appWidgetId);
        this.deleted = (sharedPreferences.getBoolean(sb2.toString(), false) || this.accountInstance == null) ? true : true;
    }

    @Override
    public int getCount() {
        if (this.deleted) {
            return 1;
        }
        return ((int) Math.ceil(this.dids.size() / 2.0f)) + 1;
    }

    @Override
    public long getItemId(int i9) {
        return i9;
    }

    @Override
    public RemoteViews getLoadingView() {
        return null;
    }

    @Override
    public RemoteViews getViewAt(int i9) {
        int i10;
        String str;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.FileLocation fileLocation;
        int i11;
        Bitmap decodeFile;
        int i12;
        int i13;
        int i14;
        String format;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.Components.z8 z8Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        int i18;
        if (this.deleted) {
            RemoteViews remoteViews = new RemoteViews(this.mContext.getPackageName(), R.layout.widget_deleted);
            remoteViews.setTextViewText(R.id.widget_deleted_text, LocaleController.getString(R.string.WidgetLoggedOff));
            return remoteViews;
        } else if (i9 >= getCount() - 1) {
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
        } else {
            RemoteViews remoteViews3 = new RemoteViews(this.mContext.getPackageName(), R.layout.contacts_widget_item);
            for (int i19 = 0; i19 < 2; i19++) {
                int i20 = (i9 * 2) + i19;
                if (i20 >= this.dids.size()) {
                    if (i19 == 0) {
                        i18 = R.id.contacts_widget_item1;
                    } else {
                        i18 = R.id.contacts_widget_item2;
                    }
                    remoteViews3.setViewVisibility(i18, 4);
                } else {
                    if (i19 == 0) {
                        i10 = R.id.contacts_widget_item1;
                    } else {
                        i10 = R.id.contacts_widget_item2;
                    }
                    remoteViews3.setViewVisibility(i10, 0);
                    Long l10 = this.dids.get(i20);
                    if (DialogObject.isUserDialog(l10.longValue())) {
                        user = this.accountInstance.getMessagesController().getUser(l10);
                        if (UserObject.isUserSelf(user)) {
                            str = LocaleController.getString(R.string.SavedMessages);
                        } else if (UserObject.isReplyUser(user)) {
                            str = LocaleController.getString(R.string.RepliesTitle);
                        } else if (UserObject.isDeleted(user)) {
                            str = LocaleController.getString(R.string.HiddenName);
                        } else {
                            str = UserObject.getFirstName(user);
                        }
                        if (!UserObject.isReplyUser(user) && !UserObject.isUserSelf(user) && user != null && (userProfilePhoto = user.photo) != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                            chat = null;
                        } else {
                            chat = null;
                            fileLocation = null;
                        }
                    } else {
                        TLRPC.Chat chat2 = this.accountInstance.getMessagesController().getChat(Long.valueOf(-l10.longValue()));
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
                    if (i19 == 0) {
                        i11 = R.id.contacts_widget_item_text1;
                    } else {
                        i11 = R.id.contacts_widget_item_text2;
                    }
                    remoteViews3.setTextViewText(i11, str);
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
                            z8Var = new org.telegram.ui.Components.z8(0, user);
                            if (UserObject.isReplyUser(user)) {
                                z8Var.g(12);
                            } else if (UserObject.isUserSelf(user)) {
                                z8Var.g(1);
                            }
                        } else {
                            org.telegram.ui.Components.z8 z8Var2 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
                            z8Var2.k(this.accountInstance.getCurrentAccount(), chat);
                            z8Var = z8Var2;
                        }
                        z8Var.setBounds(0, 0, dp, dp);
                        z8Var.draw(canvas);
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
                    if (i19 == 0) {
                        i17 = R.id.contacts_widget_item_avatar1;
                    } else {
                        i17 = R.id.contacts_widget_item_avatar2;
                    }
                    remoteViews3.setImageViewBitmap(i17, createBitmap);
                    TLRPC.Dialog dialog = (TLRPC.Dialog) this.dialogs.f(l10.longValue());
                    if (dialog != null && (i14 = dialog.unread_count) > 0) {
                        if (i14 > 99) {
                            format = String.format("%d+", 99);
                        } else {
                            format = String.format("%d", Integer.valueOf(i14));
                        }
                        if (i19 == 0) {
                            i15 = R.id.contacts_widget_item_badge1;
                        } else {
                            i15 = R.id.contacts_widget_item_badge2;
                        }
                        remoteViews3.setTextViewText(i15, format);
                        if (i19 == 0) {
                            i16 = R.id.contacts_widget_item_badge_bg1;
                        } else {
                            i16 = R.id.contacts_widget_item_badge_bg2;
                        }
                        remoteViews3.setViewVisibility(i16, 0);
                    } else {
                        if (i19 == 0) {
                            i12 = R.id.contacts_widget_item_badge_bg1;
                        } else {
                            i12 = R.id.contacts_widget_item_badge_bg2;
                        }
                        remoteViews3.setViewVisibility(i12, 8);
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
                    if (i19 == 0) {
                        i13 = R.id.contacts_widget_item1;
                    } else {
                        i13 = R.id.contacts_widget_item2;
                    }
                    remoteViews3.setOnClickFillInIntent(i13, intent2);
                }
            }
            return remoteViews3;
        }
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
        if (accountInstance != null && accountInstance.getUserConfig().isClientActivated()) {
            ArrayList<TLRPC.User> arrayList = new ArrayList<>();
            ArrayList<TLRPC.Chat> arrayList2 = new ArrayList<>();
            this.accountInstance.getMessagesStorage().getWidgetDialogs(this.appWidgetId, 1, this.dids, this.dialogs, new a0.h(), arrayList, arrayList2);
            this.accountInstance.getMessagesController().putUsers(arrayList, true);
            this.accountInstance.getMessagesController().putChats(arrayList2, true);
        }
    }

    @Override
    public void onDestroy() {
    }
}
