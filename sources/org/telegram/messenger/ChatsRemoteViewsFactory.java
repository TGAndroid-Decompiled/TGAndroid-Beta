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
import android.text.SpannableStringBuilder;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ForegroundColorSpanThemable;
import org.telegram.ui.Components.Forum.ForumUtilities;

class ChatsRemoteViewsFactory implements RemoteViewsService.RemoteViewsFactory {
    private AccountInstance accountInstance;
    private int appWidgetId;
    private RectF bitmapRect;
    private boolean deleted;
    private Context mContext;
    private Paint roundPaint;
    private ArrayList<Long> dids = new ArrayList<>();
    private LongSparseArray dialogs = new LongSparseArray();
    private LongSparseArray messageObjects = new LongSparseArray();

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

    public ChatsRemoteViewsFactory(Context context, Intent intent) {
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
        return this.dids.size() + 1;
    }

    @Override
    public RemoteViews getViewAt(int i) {
        TLRPC.Chat chat;
        String str;
        TLRPC.User user;
        TLRPC.FileLocation fileLocation;
        String monoForumTitle;
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        Bitmap bitmapDecodeFile;
        int i2;
        int i3;
        TLRPC.Chat chat2;
        TLRPC.User user2;
        CharSequence charSequence;
        CharSequence charSequence2;
        String strReplace;
        SpannableStringBuilder spannableStringBuilderValueOf;
        char c;
        int i4;
        String string;
        char c2;
        SpannableStringBuilder spannableStringBuilderValueOf2;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence string2;
        CharSequence charSequence3;
        AvatarDrawable avatarDrawable;
        String name;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.FileLocation fileLocation3;
        if (this.deleted) {
            RemoteViews remoteViews = new RemoteViews(this.mContext.getPackageName(), R.layout.widget_deleted);
            remoteViews.setTextViewText(R.id.widget_deleted_text, LocaleController.getString(R.string.WidgetLoggedOff));
            return remoteViews;
        }
        if (i >= this.dids.size()) {
            RemoteViews remoteViews2 = new RemoteViews(this.mContext.getPackageName(), R.layout.widget_edititem);
            remoteViews2.setTextViewText(R.id.widget_edititem_text, LocaleController.getString(R.string.TapToEditWidget));
            Bundle bundle = new Bundle();
            bundle.putInt("appWidgetId", this.appWidgetId);
            bundle.putInt("appWidgetType", 0);
            bundle.putInt("currentAccount", this.accountInstance.getCurrentAccount());
            Intent intent = new Intent();
            intent.putExtras(bundle);
            remoteViews2.setOnClickFillInIntent(R.id.widget_edititem, intent);
            return remoteViews2;
        }
        Long l = this.dids.get(i);
        String str2 = "";
        if (DialogObject.isUserDialog(l.longValue())) {
            user = this.accountInstance.getMessagesController().getUser(l);
            if (user != null) {
                if (UserObject.isUserSelf(user)) {
                    name = LocaleController.getString(R.string.SavedMessages);
                } else if (UserObject.isReplyUser(user)) {
                    name = LocaleController.getString(R.string.RepliesTitle);
                } else if (UserObject.isDeleted(user)) {
                    name = LocaleController.getString(R.string.HiddenName);
                } else {
                    name = ContactsController.formatName(user.first_name, user.last_name);
                }
                if (UserObject.isReplyUser(user) || UserObject.isUserSelf(user) || (userProfilePhoto = user.photo) == null || (fileLocation3 = userProfilePhoto.photo_small) == null || fileLocation3.volume_id == 0 || fileLocation3.local_id == 0) {
                    fileLocation = null;
                    str = name;
                    chat = null;
                } else {
                    fileLocation = fileLocation3;
                    str = name;
                    chat = null;
                }
            } else {
                str = "";
                chat = null;
                fileLocation = null;
            }
        } else {
            TLRPC.Chat chat3 = this.accountInstance.getMessagesController().getChat(Long.valueOf(-l.longValue()));
            if (chat3 == null) {
                chat = chat3;
                str = "";
                user = null;
                fileLocation = null;
            } else if (ChatObject.isMonoForum(chat3)) {
                monoForumTitle = ForumUtilities.getMonoForumTitle(this.accountInstance.getCurrentAccount(), chat3);
                TLRPC.Chat chat4 = this.accountInstance.getMessagesController().getChat(Long.valueOf(chat3.linked_monoforum_id));
                if (chat4 == null || (chatPhoto = chat4.photo) == null || (fileLocation2 = chatPhoto.photo_small) == null || fileLocation2.volume_id == 0 || fileLocation2.local_id == 0) {
                    fileLocation = null;
                    str = monoForumTitle;
                    chat = chat3;
                    user = null;
                } else {
                    fileLocation = fileLocation2;
                    str = monoForumTitle;
                    chat = chat3;
                    user = null;
                }
            } else {
                monoForumTitle = chat3.title;
                TLRPC.ChatPhoto chatPhoto2 = chat3.photo;
                if (chatPhoto2 == null || (fileLocation2 = chatPhoto2.photo_small) == null || fileLocation2.volume_id == 0 || fileLocation2.local_id == 0) {
                    fileLocation = null;
                    str = monoForumTitle;
                    chat = chat3;
                    user = null;
                } else {
                    fileLocation = fileLocation2;
                    str = monoForumTitle;
                    chat = chat3;
                    user = null;
                }
            }
        }
        RemoteViews remoteViews3 = new RemoteViews(this.mContext.getPackageName(), R.layout.shortcut_widget_item);
        remoteViews3.setTextViewText(R.id.shortcut_widget_item_text, str);
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
                avatarDrawable = new AvatarDrawable(user);
                if (UserObject.isReplyUser(user)) {
                    avatarDrawable.setAvatarType(12);
                } else if (UserObject.isUserSelf(user)) {
                    avatarDrawable.setAvatarType(1);
                }
            } else {
                avatarDrawable = new AvatarDrawable();
                avatarDrawable.setInfo(this.accountInstance.getCurrentAccount(), chat);
            }
            avatarDrawable.setBounds(0, 0, iDp, iDp);
            avatarDrawable.draw(canvas);
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
        remoteViews3.setImageViewBitmap(R.id.shortcut_widget_item_avatar, bitmapCreateBitmap);
        MessageObject messageObject = (MessageObject) this.messageObjects.get(l.longValue());
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.dialogs.get(l.longValue());
        if (messageObject != null) {
            long fromChatId = messageObject.getFromChatId();
            if (DialogObject.isUserDialog(fromChatId)) {
                user2 = this.accountInstance.getMessagesController().getUser(Long.valueOf(fromChatId));
                chat2 = null;
            } else {
                chat2 = this.accountInstance.getMessagesController().getChat(Long.valueOf(-fromChatId));
                user2 = null;
            }
            int color = this.mContext.getResources().getColor(R.color.widget_text);
            if (messageObject.messageOwner instanceof TLRPC.TL_messageService) {
                if (ChatObject.isChannel(chat)) {
                    TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                    if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear) && !(messageAction instanceof TLRPC.TL_messageActionChannelMigrateFrom)) {
                        charSequence3 = str2;
                        charSequence3 = str2;
                        charSequence3 = messageObject.messageText;
                    }
                } else {
                    charSequence3 = str2;
                    charSequence3 = str2;
                    charSequence3 = messageObject.messageText;
                }
                charSequence3 = str2;
                charSequence3 = str2;
                charSequence3 = str2;
                color = this.mContext.getResources().getColor(R.color.widget_action_text);
                string2 = charSequence3;
            } else {
                String str3 = "📎 ";
                if (chat != null && chat2 == null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat))) {
                    if (messageObject.isOutOwner()) {
                        strReplace = LocaleController.getString(R.string.FromYou);
                    } else if (user2 != null) {
                        strReplace = UserObject.getFirstName(user2).replace("\n", "");
                    } else {
                        strReplace = "DELETED";
                    }
                    String str4 = strReplace;
                    CharSequence charSequence4 = messageObject.caption;
                    char c3 = ' ';
                    try {
                        if (charSequence4 != null) {
                            String string3 = charSequence4.toString();
                            if (string3.length() > 150) {
                                string3 = string3.substring(0, 150);
                            }
                            if (messageObject.isVideo()) {
                                str3 = "📹 ";
                            } else if (messageObject.isVoice()) {
                                str3 = "🎤 ";
                            } else if (messageObject.isMusic()) {
                                str3 = "🎧 ";
                            } else if (messageObject.isPhoto()) {
                                str3 = "🖼 ";
                            }
                            spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", str3 + string3.replace('\n', ' '), str4));
                        } else {
                            if (messageObject.messageOwner.media != null && !messageObject.isMediaEmpty()) {
                                color = this.mContext.getResources().getColor(R.color.widget_action_text);
                                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                                try {
                                    if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                        c = 1;
                                        string = String.format("📊 \u2068%s\u2069", ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text);
                                    } else {
                                        c = 1;
                                        if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                            string = String.format("🎮 \u2068%s\u2069", messageMedia.game.title);
                                        } else {
                                            if (messageObject.type == 14) {
                                                i4 = 2;
                                                string = String.format("🎧 \u2068%s - %s\u2069", messageObject.getMusicAuthor(), messageObject.getMusicTitle());
                                            } else {
                                                i4 = 2;
                                                string = messageObject.messageText.toString();
                                            }
                                            c3 = ' ';
                                            c2 = '\n';
                                        }
                                        String strReplace2 = string.replace(c2, c3);
                                        Object[] objArr = new Object[i4];
                                        objArr[0] = strReplace2;
                                        objArr[c] = str4;
                                        spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr));
                                        spannableStringBuilderValueOf2.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_attachMessage), str4.length() + 2, spannableStringBuilderValueOf2.length(), 33);
                                        spannableStringBuilder = spannableStringBuilderValueOf2;
                                    }
                                    spannableStringBuilderValueOf2.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_attachMessage), str4.length() + 2, spannableStringBuilderValueOf2.length(), 33);
                                    spannableStringBuilder = spannableStringBuilderValueOf2;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    spannableStringBuilder = spannableStringBuilderValueOf2;
                                }
                                c2 = '\n';
                                i4 = 2;
                                String strReplace3 = string.replace(c2, c3);
                                Object[] objArr2 = new Object[i4];
                                objArr2[0] = strReplace3;
                                objArr2[c] = str4;
                                spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr2));
                            } else {
                                String strSubstring = messageObject.messageOwner.message;
                                if (strSubstring != null) {
                                    if (strSubstring.length() > 150) {
                                        strSubstring = strSubstring.substring(0, 150);
                                    }
                                    spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", strSubstring.replace('\n', ' ').trim(), str4));
                                } else {
                                    spannableStringBuilderValueOf = SpannableStringBuilder.valueOf("");
                                }
                            }
                            spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_nameMessage), 0, str4.length() + 1, 33);
                            string2 = spannableStringBuilder;
                        }
                        spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_nameMessage), 0, str4.length() + 1, 33);
                        string2 = spannableStringBuilder;
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        string2 = spannableStringBuilder;
                    }
                    spannableStringBuilder = spannableStringBuilderValueOf;
                } else {
                    TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
                    if ((messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia2.photo instanceof TLRPC.TL_photoEmpty) && messageMedia2.ttl_seconds != 0) {
                        string2 = LocaleController.getString(R.string.AttachPhotoExpired);
                    } else if ((messageMedia2 instanceof TLRPC.TL_messageMediaDocument) && (messageMedia2.document instanceof TLRPC.TL_documentEmpty) && messageMedia2.ttl_seconds != 0) {
                        string2 = LocaleController.getString(R.string.AttachVideoExpired);
                    } else if (messageObject.caption != null) {
                        if (messageObject.isVideo()) {
                            str3 = "📹 ";
                        } else if (messageObject.isVoice()) {
                            str3 = "🎤 ";
                        } else if (messageObject.isMusic()) {
                            str3 = "🎧 ";
                        } else if (messageObject.isPhoto()) {
                            str3 = "🖼 ";
                        }
                        string2 = str3 + ((Object) messageObject.caption);
                    } else {
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                            charSequence = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia2).poll.question.text;
                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                            charSequence = "🎮 " + messageObject.messageOwner.media.game.title;
                        } else if (messageObject.type == 14) {
                            charSequence = String.format("🎧 %s - %s", messageObject.getMusicAuthor(), messageObject.getMusicTitle());
                        } else {
                            charSequence = messageObject.messageText;
                            AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (Theme.ResourcesProvider) null);
                        }
                        charSequence2 = charSequence;
                        string2 = charSequence2;
                        if (messageObject.messageOwner.media != null && !messageObject.isMediaEmpty()) {
                            string2 = charSequence2;
                            color = this.mContext.getResources().getColor(R.color.widget_action_text);
                            string2 = charSequence2;
                        }
                    }
                }
            }
            string2 = charSequence2;
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, LocaleController.stringForMessageListDate(messageObject.messageOwner.date));
            int i5 = R.id.shortcut_widget_item_message;
            remoteViews3.setTextViewText(i5, string2.toString());
            remoteViews3.setTextColor(i5, color);
        } else {
            if (dialog != null && (i2 = dialog.last_message_date) != 0) {
                remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, LocaleController.stringForMessageListDate(i2));
            } else {
                remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, "");
            }
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_message, "");
        }
        if (dialog != null && (i3 = dialog.unread_count) > 0) {
            int i6 = R.id.shortcut_widget_item_badge;
            remoteViews3.setTextViewText(i6, String.format("%d", Integer.valueOf(i3)));
            remoteViews3.setViewVisibility(i6, 0);
            if (this.accountInstance.getMessagesController().isDialogMuted(dialog.id, 0L)) {
                remoteViews3.setBoolean(i6, "setEnabled", false);
                remoteViews3.setInt(i6, "setBackgroundResource", R.drawable.widget_badge_muted_background);
            } else {
                remoteViews3.setBoolean(i6, "setEnabled", true);
                remoteViews3.setInt(i6, "setBackgroundResource", R.drawable.widget_badge_background);
            }
        } else {
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
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
        remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent2);
        remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i == getCount() ? 8 : 0);
        return remoteViews3;
    }

    @Override
    public void onDataSetChanged() {
        this.dids.clear();
        this.messageObjects.clear();
        AccountInstance accountInstance = this.accountInstance;
        if (accountInstance == null || !accountInstance.getUserConfig().isClientActivated()) {
            return;
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList2 = new ArrayList<>();
        LongSparseArray longSparseArray = new LongSparseArray();
        this.accountInstance.getMessagesStorage().getWidgetDialogs(this.appWidgetId, 0, this.dids, this.dialogs, longSparseArray, arrayList, arrayList2);
        this.accountInstance.getMessagesController().putUsers(arrayList, true);
        this.accountInstance.getMessagesController().putChats(arrayList2, true);
        this.messageObjects.clear();
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            this.messageObjects.put(longSparseArray.keyAt(i), new MessageObject(this.accountInstance.getCurrentAccount(), (TLRPC.Message) longSparseArray.valueAt(i), (LongSparseArray) null, (LongSparseArray) null, false, true));
        }
    }
}
