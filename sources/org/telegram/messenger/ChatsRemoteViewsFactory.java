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
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.s00;

class ChatsRemoteViewsFactory implements RemoteViewsService.RemoteViewsFactory {
    private AccountInstance accountInstance;
    private int appWidgetId;
    private RectF bitmapRect;
    private boolean deleted;
    private Context mContext;
    private Paint roundPaint;
    private ArrayList<Long> dids = new ArrayList<>();
    private a0.h dialogs = new a0.h();
    private a0.h messageObjects = new a0.h();

    public ChatsRemoteViewsFactory(Context context, Intent intent) {
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
        return this.dids.size() + 1;
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
        TLRPC.Chat chat;
        String str;
        TLRPC.User user;
        TLRPC.FileLocation fileLocation;
        String strI;
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        char c10;
        Bitmap bitmapDecodeFile;
        MessageObject messageObject;
        TLRPC.Dialog dialog;
        int i11;
        Bundle bundle;
        int i12;
        long fromChatId;
        TLRPC.Chat chat2;
        TLRPC.User user2;
        int color;
        String str2;
        TLRPC.MessageMedia messageMedia;
        CharSequence charSequenceN;
        CharSequence charSequence;
        String strReplace;
        SpannableStringBuilder spannableStringBuilderValueOf;
        String strJ;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence string;
        CharSequence charSequence2;
        TLRPC.MessageAction messageAction;
        org.telegram.ui.Components.y8 y8Var;
        String string2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.FileLocation fileLocation3;
        if (this.deleted) {
            RemoteViews remoteViews = new RemoteViews(this.mContext.getPackageName(), R.layout.widget_deleted);
            remoteViews.setTextViewText(R.id.widget_deleted_text, LocaleController.getString(R.string.WidgetLoggedOff));
            return remoteViews;
        }
        if (i10 >= this.dids.size()) {
            RemoteViews remoteViews2 = new RemoteViews(this.mContext.getPackageName(), R.layout.widget_edititem);
            remoteViews2.setTextViewText(R.id.widget_edititem_text, LocaleController.getString(R.string.TapToEditWidget));
            Bundle bundle2 = new Bundle();
            bundle2.putInt("appWidgetId", this.appWidgetId);
            bundle2.putInt("appWidgetType", 0);
            bundle2.putInt("currentAccount", this.accountInstance.getCurrentAccount());
            Intent intent = new Intent();
            intent.putExtras(bundle2);
            remoteViews2.setOnClickFillInIntent(R.id.widget_edititem, intent);
            return remoteViews2;
        }
        Long l10 = this.dids.get(i10);
        String str3 = "";
        if (DialogObject.isUserDialog(l10.longValue())) {
            user = this.accountInstance.getMessagesController().getUser(l10);
            if (user != null) {
                if (UserObject.isUserSelf(user)) {
                    string2 = LocaleController.getString(R.string.SavedMessages);
                } else if (UserObject.isReplyUser(user)) {
                    string2 = LocaleController.getString(R.string.RepliesTitle);
                } else {
                    string2 = UserObject.isDeleted(user) ? LocaleController.getString(R.string.HiddenName) : ContactsController.formatName(user.first_name, user.last_name);
                }
                if (UserObject.isReplyUser(user) || UserObject.isUserSelf(user) || (userProfilePhoto = user.photo) == null || (fileLocation3 = userProfilePhoto.photo_small) == null || fileLocation3.volume_id == 0 || fileLocation3.local_id == 0) {
                    fileLocation = null;
                    str = string2;
                    chat = null;
                } else {
                    fileLocation = fileLocation3;
                    str = string2;
                    chat = null;
                }
            } else {
                str = "";
                chat = null;
                fileLocation = null;
            }
        } else {
            TLRPC.Chat chat3 = this.accountInstance.getMessagesController().getChat(Long.valueOf(-l10.longValue()));
            if (chat3 != null) {
                if (ChatObject.isMonoForum(chat3)) {
                    strI = wf.c.i(chat3, this.accountInstance.getCurrentAccount(), false);
                    TLRPC.Chat chat4 = this.accountInstance.getMessagesController().getChat(Long.valueOf(chat3.linked_monoforum_id));
                    if (chat4 == null || (chatPhoto = chat4.photo) == null || (fileLocation2 = chatPhoto.photo_small) == null || fileLocation2.volume_id == 0 || fileLocation2.local_id == 0) {
                        fileLocation2 = null;
                    }
                } else {
                    strI = chat3.title;
                    TLRPC.ChatPhoto chatPhoto2 = chat3.photo;
                    if (chatPhoto2 == null || (fileLocation2 = chatPhoto2.photo_small) == null || fileLocation2.volume_id == 0 || fileLocation2.local_id == 0) {
                        fileLocation = null;
                        str = strI;
                        chat = chat3;
                        user = null;
                    }
                }
                fileLocation = fileLocation2;
                str = strI;
                chat = chat3;
                user = null;
            } else {
                chat = chat3;
                str = "";
                user = null;
                fileLocation = null;
            }
        }
        RemoteViews remoteViews3 = new RemoteViews(this.mContext.getPackageName(), R.layout.shortcut_widget_item);
        remoteViews3.setTextViewText(R.id.shortcut_widget_item_text, str);
        if (fileLocation != null) {
            try {
                bitmapDecodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(fileLocation, true).toString());
            } catch (Throwable th) {
                th = th;
                c10 = 1;
                FileLog.e(th);
                messageObject = (MessageObject) this.messageObjects.f(l10.longValue());
                dialog = (TLRPC.Dialog) this.dialogs.f(l10.longValue());
                if (messageObject != null) {
                    fromChatId = messageObject.getFromChatId();
                    if (DialogObject.isUserDialog(fromChatId)) {
                        user2 = this.accountInstance.getMessagesController().getUser(Long.valueOf(fromChatId));
                        chat2 = null;
                    } else {
                        chat2 = this.accountInstance.getMessagesController().getChat(Long.valueOf(-fromChatId));
                        user2 = null;
                    }
                    color = this.mContext.getResources().getColor(R.color.widget_text);
                    if (messageObject.messageOwner instanceof TLRPC.TL_messageService) {
                        if (ChatObject.isChannel(chat)) {
                            messageAction = messageObject.messageOwner.action;
                            if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                                charSequence2 = str3;
                                charSequence2 = str3;
                                charSequence2 = messageObject.messageText;
                            }
                        } else {
                            charSequence2 = str3;
                            charSequence2 = str3;
                            charSequence2 = messageObject.messageText;
                        }
                        charSequence2 = str3;
                        charSequence2 = str3;
                        charSequence2 = str3;
                        color = this.mContext.getResources().getColor(R.color.widget_action_text);
                        string = charSequence2;
                    } else {
                        str2 = "📎 ";
                        if (chat == null) {
                            messageMedia = messageObject.messageOwner.media;
                            if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto)) {
                                if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument)) {
                                    if (messageObject.caption != null) {
                                        if (messageObject.isVideo()) {
                                            str2 = "📹 ";
                                        } else if (messageObject.isVoice()) {
                                            str2 = "🎤 ";
                                        } else if (messageObject.isMusic()) {
                                            str2 = "🎧 ";
                                        } else if (messageObject.isPhoto()) {
                                            str2 = "🖼 ";
                                        }
                                        StringBuilder sbO = com.google.android.recaptcha.internal.a.o(str2);
                                        sbO.append((Object) messageObject.caption);
                                        string = sbO.toString();
                                    } else {
                                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                            charSequenceN = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                            charSequenceN = "🎮 " + messageObject.messageOwner.media.game.title;
                                        } else if (messageObject.type == 14) {
                                            charSequenceN = i0.a.n("🎧 ", messageObject.getMusicAuthor(), " - ", messageObject.getMusicTitle());
                                        } else {
                                            charSequenceN = messageObject.messageText;
                                            AndroidUtilities.highlightText(charSequenceN, messageObject.highlightedWords, (org.telegram.ui.ActionBar.c6) null);
                                        }
                                        charSequence = charSequenceN;
                                        string = charSequence;
                                        if (messageObject.messageOwner.media != null) {
                                            string = charSequence;
                                            color = this.mContext.getResources().getColor(R.color.widget_action_text);
                                            string = charSequence;
                                        }
                                    }
                                } else if (messageObject.caption != null) {
                                    if (messageObject.isVideo()) {
                                        str2 = "📹 ";
                                    } else if (messageObject.isVoice()) {
                                        str2 = "🎤 ";
                                    } else if (messageObject.isMusic()) {
                                        str2 = "🎧 ";
                                    } else if (messageObject.isPhoto()) {
                                        str2 = "🖼 ";
                                    }
                                    StringBuilder sbO2 = com.google.android.recaptcha.internal.a.o(str2);
                                    sbO2.append((Object) messageObject.caption);
                                    string = sbO2.toString();
                                } else {
                                    if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                        charSequenceN = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                        charSequenceN = "🎮 " + messageObject.messageOwner.media.game.title;
                                    } else if (messageObject.type == 14) {
                                        charSequenceN = i0.a.n("🎧 ", messageObject.getMusicAuthor(), " - ", messageObject.getMusicTitle());
                                    } else {
                                        charSequenceN = messageObject.messageText;
                                        AndroidUtilities.highlightText(charSequenceN, messageObject.highlightedWords, (org.telegram.ui.ActionBar.c6) null);
                                    }
                                    charSequence = charSequenceN;
                                    string = charSequence;
                                    if (messageObject.messageOwner.media != null) {
                                        string = charSequence;
                                        color = this.mContext.getResources().getColor(R.color.widget_action_text);
                                        string = charSequence;
                                    }
                                }
                            } else if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument)) {
                                if (messageObject.caption != null) {
                                    if (messageObject.isVideo()) {
                                        str2 = "📹 ";
                                    } else if (messageObject.isVoice()) {
                                        str2 = "🎤 ";
                                    } else if (messageObject.isMusic()) {
                                        str2 = "🎧 ";
                                    } else if (messageObject.isPhoto()) {
                                        str2 = "🖼 ";
                                    }
                                    StringBuilder sbO3 = com.google.android.recaptcha.internal.a.o(str2);
                                    sbO3.append((Object) messageObject.caption);
                                    string = sbO3.toString();
                                } else {
                                    if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                        charSequenceN = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                        charSequenceN = "🎮 " + messageObject.messageOwner.media.game.title;
                                    } else if (messageObject.type == 14) {
                                        charSequenceN = i0.a.n("🎧 ", messageObject.getMusicAuthor(), " - ", messageObject.getMusicTitle());
                                    } else {
                                        charSequenceN = messageObject.messageText;
                                        AndroidUtilities.highlightText(charSequenceN, messageObject.highlightedWords, (org.telegram.ui.ActionBar.c6) null);
                                    }
                                    charSequence = charSequenceN;
                                    string = charSequence;
                                    if (messageObject.messageOwner.media != null) {
                                        string = charSequence;
                                        color = this.mContext.getResources().getColor(R.color.widget_action_text);
                                        string = charSequence;
                                    }
                                }
                            } else if (messageObject.caption != null) {
                                if (messageObject.isVideo()) {
                                    str2 = "📹 ";
                                } else if (messageObject.isVoice()) {
                                    str2 = "🎤 ";
                                } else if (messageObject.isMusic()) {
                                    str2 = "🎧 ";
                                } else if (messageObject.isPhoto()) {
                                    str2 = "🖼 ";
                                }
                                StringBuilder sbO4 = com.google.android.recaptcha.internal.a.o(str2);
                                sbO4.append((Object) messageObject.caption);
                                string = sbO4.toString();
                            } else {
                                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                    charSequenceN = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                                } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                    charSequenceN = "🎮 " + messageObject.messageOwner.media.game.title;
                                } else if (messageObject.type == 14) {
                                    charSequenceN = i0.a.n("🎧 ", messageObject.getMusicAuthor(), " - ", messageObject.getMusicTitle());
                                } else {
                                    charSequenceN = messageObject.messageText;
                                    AndroidUtilities.highlightText(charSequenceN, messageObject.highlightedWords, (org.telegram.ui.ActionBar.c6) null);
                                }
                                charSequence = charSequenceN;
                                string = charSequence;
                                if (messageObject.messageOwner.media != null) {
                                    string = charSequence;
                                    color = this.mContext.getResources().getColor(R.color.widget_action_text);
                                    string = charSequence;
                                }
                            }
                        } else {
                            messageMedia = messageObject.messageOwner.media;
                            if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto)) {
                                if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument)) {
                                    if (messageObject.caption != null) {
                                        if (messageObject.isVideo()) {
                                            str2 = "📹 ";
                                        } else if (messageObject.isVoice()) {
                                            str2 = "🎤 ";
                                        } else if (messageObject.isMusic()) {
                                            str2 = "🎧 ";
                                        } else if (messageObject.isPhoto()) {
                                            str2 = "🖼 ";
                                        }
                                        StringBuilder sbO5 = com.google.android.recaptcha.internal.a.o(str2);
                                        sbO5.append((Object) messageObject.caption);
                                        string = sbO5.toString();
                                    } else {
                                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                            charSequenceN = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                            charSequenceN = "🎮 " + messageObject.messageOwner.media.game.title;
                                        } else if (messageObject.type == 14) {
                                            charSequenceN = i0.a.n("🎧 ", messageObject.getMusicAuthor(), " - ", messageObject.getMusicTitle());
                                        } else {
                                            charSequenceN = messageObject.messageText;
                                            AndroidUtilities.highlightText(charSequenceN, messageObject.highlightedWords, (org.telegram.ui.ActionBar.c6) null);
                                        }
                                        charSequence = charSequenceN;
                                        string = charSequence;
                                        if (messageObject.messageOwner.media != null) {
                                            string = charSequence;
                                            color = this.mContext.getResources().getColor(R.color.widget_action_text);
                                            string = charSequence;
                                        }
                                    }
                                } else if (messageObject.caption != null) {
                                    if (messageObject.isVideo()) {
                                        str2 = "📹 ";
                                    } else if (messageObject.isVoice()) {
                                        str2 = "🎤 ";
                                    } else if (messageObject.isMusic()) {
                                        str2 = "🎧 ";
                                    } else if (messageObject.isPhoto()) {
                                        str2 = "🖼 ";
                                    }
                                    StringBuilder sbO6 = com.google.android.recaptcha.internal.a.o(str2);
                                    sbO6.append((Object) messageObject.caption);
                                    string = sbO6.toString();
                                } else {
                                    if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                        charSequenceN = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                        charSequenceN = "🎮 " + messageObject.messageOwner.media.game.title;
                                    } else if (messageObject.type == 14) {
                                        charSequenceN = i0.a.n("🎧 ", messageObject.getMusicAuthor(), " - ", messageObject.getMusicTitle());
                                    } else {
                                        charSequenceN = messageObject.messageText;
                                        AndroidUtilities.highlightText(charSequenceN, messageObject.highlightedWords, (org.telegram.ui.ActionBar.c6) null);
                                    }
                                    charSequence = charSequenceN;
                                    string = charSequence;
                                    if (messageObject.messageOwner.media != null) {
                                        string = charSequence;
                                        color = this.mContext.getResources().getColor(R.color.widget_action_text);
                                        string = charSequence;
                                    }
                                }
                            } else if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument)) {
                                if (messageObject.caption != null) {
                                    if (messageObject.isVideo()) {
                                        str2 = "📹 ";
                                    } else if (messageObject.isVoice()) {
                                        str2 = "🎤 ";
                                    } else if (messageObject.isMusic()) {
                                        str2 = "🎧 ";
                                    } else if (messageObject.isPhoto()) {
                                        str2 = "🖼 ";
                                    }
                                    StringBuilder sbO7 = com.google.android.recaptcha.internal.a.o(str2);
                                    sbO7.append((Object) messageObject.caption);
                                    string = sbO7.toString();
                                } else {
                                    if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                        charSequenceN = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                        charSequenceN = "🎮 " + messageObject.messageOwner.media.game.title;
                                    } else if (messageObject.type == 14) {
                                        charSequenceN = i0.a.n("🎧 ", messageObject.getMusicAuthor(), " - ", messageObject.getMusicTitle());
                                    } else {
                                        charSequenceN = messageObject.messageText;
                                        AndroidUtilities.highlightText(charSequenceN, messageObject.highlightedWords, (org.telegram.ui.ActionBar.c6) null);
                                    }
                                    charSequence = charSequenceN;
                                    string = charSequence;
                                    if (messageObject.messageOwner.media != null) {
                                        string = charSequence;
                                        color = this.mContext.getResources().getColor(R.color.widget_action_text);
                                        string = charSequence;
                                    }
                                }
                            } else if (messageObject.caption != null) {
                                if (messageObject.isVideo()) {
                                    str2 = "📹 ";
                                } else if (messageObject.isVoice()) {
                                    str2 = "🎤 ";
                                } else if (messageObject.isMusic()) {
                                    str2 = "🎧 ";
                                } else if (messageObject.isPhoto()) {
                                    str2 = "🖼 ";
                                }
                                StringBuilder sbO8 = com.google.android.recaptcha.internal.a.o(str2);
                                sbO8.append((Object) messageObject.caption);
                                string = sbO8.toString();
                            } else {
                                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                    charSequenceN = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                                } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                    charSequenceN = "🎮 " + messageObject.messageOwner.media.game.title;
                                } else if (messageObject.type == 14) {
                                    charSequenceN = i0.a.n("🎧 ", messageObject.getMusicAuthor(), " - ", messageObject.getMusicTitle());
                                } else {
                                    charSequenceN = messageObject.messageText;
                                    AndroidUtilities.highlightText(charSequenceN, messageObject.highlightedWords, (org.telegram.ui.ActionBar.c6) null);
                                }
                                charSequence = charSequenceN;
                                string = charSequence;
                                if (messageObject.messageOwner.media != null) {
                                    string = charSequence;
                                    color = this.mContext.getResources().getColor(R.color.widget_action_text);
                                    string = charSequence;
                                }
                            }
                        }
                    }
                    string = charSequence;
                    remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, LocaleController.stringForMessageListDate(messageObject.messageOwner.date));
                    remoteViews3.setTextViewText(R.id.shortcut_widget_item_message, string.toString());
                    remoteViews3.setTextColor(R.id.shortcut_widget_item_message, color);
                } else {
                    if (dialog != null) {
                        remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, "");
                    } else {
                        remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, "");
                    }
                    remoteViews3.setTextViewText(R.id.shortcut_widget_item_message, "");
                }
                if (dialog != null) {
                    remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
                } else {
                    remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
                }
                bundle = new Bundle();
                if (DialogObject.isUserDialog(l10.longValue())) {
                    bundle.putLong("userId", l10.longValue());
                } else {
                    bundle.putLong("chatId", -l10.longValue());
                }
                bundle.putInt("currentAccount", this.accountInstance.getCurrentAccount());
                Intent intent2 = new Intent();
                intent2.putExtras(bundle);
                remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent2);
                remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i10 == getCount() ? 8 : 0);
                return remoteViews3;
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
                y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
                y8Var.k(this.accountInstance.getCurrentAccount(), chat);
            }
            y8Var.setBounds(0, 0, iDp, iDp);
            y8Var.draw(canvas);
            c10 = 1;
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
            c10 = 1;
            try {
                this.bitmapRect.set(0.0f, 0.0f, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight());
                canvas.drawRoundRect(this.bitmapRect, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), this.roundPaint);
                canvas.restore();
            } catch (Throwable th2) {
                th = th2;
                FileLog.e(th);
            }
        }
        canvas.setBitmap(null);
        remoteViews3.setImageViewBitmap(R.id.shortcut_widget_item_avatar, bitmapCreateBitmap);
        messageObject = (MessageObject) this.messageObjects.f(l10.longValue());
        dialog = (TLRPC.Dialog) this.dialogs.f(l10.longValue());
        if (messageObject != null) {
            fromChatId = messageObject.getFromChatId();
            if (DialogObject.isUserDialog(fromChatId)) {
                user2 = this.accountInstance.getMessagesController().getUser(Long.valueOf(fromChatId));
                chat2 = null;
            } else {
                chat2 = this.accountInstance.getMessagesController().getChat(Long.valueOf(-fromChatId));
                user2 = null;
            }
            color = this.mContext.getResources().getColor(R.color.widget_text);
            if (messageObject.messageOwner instanceof TLRPC.TL_messageService) {
                if (ChatObject.isChannel(chat)) {
                    messageAction = messageObject.messageOwner.action;
                    if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear) && !(messageAction instanceof TLRPC.TL_messageActionChannelMigrateFrom)) {
                        charSequence2 = str3;
                        charSequence2 = str3;
                        charSequence2 = messageObject.messageText;
                    }
                } else {
                    charSequence2 = str3;
                    charSequence2 = str3;
                    charSequence2 = messageObject.messageText;
                }
                charSequence2 = str3;
                charSequence2 = str3;
                charSequence2 = str3;
                color = this.mContext.getResources().getColor(R.color.widget_action_text);
                string = charSequence2;
            } else {
                str2 = "📎 ";
                if (chat == null && chat2 == null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat))) {
                    if (messageObject.isOutOwner()) {
                        strReplace = LocaleController.getString(R.string.FromYou);
                    } else {
                        strReplace = user2 != null ? UserObject.getFirstName(user2).replace("\n", "") : "DELETED";
                    }
                    String str4 = strReplace;
                    CharSequence charSequence3 = messageObject.caption;
                    try {
                        if (charSequence3 != null) {
                            String string3 = charSequence3.toString();
                            if (string3.length() > 150) {
                                string3 = string3.substring(0, 150);
                            }
                            if (messageObject.isVideo()) {
                                str2 = "📹 ";
                            } else if (messageObject.isVoice()) {
                                str2 = "🎤 ";
                            } else if (messageObject.isMusic()) {
                                str2 = "🎧 ";
                            } else if (messageObject.isPhoto()) {
                                str2 = "🖼 ";
                            }
                            StringBuilder sbO9 = com.google.android.recaptcha.internal.a.o(str2);
                            sbO9.append(string3.replace('\n', ' '));
                            String string4 = sbO9.toString();
                            Object[] objArr = new Object[2];
                            objArr[0] = string4;
                            objArr[c10] = str4;
                            spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr));
                        } else {
                            if (messageObject.messageOwner.media == null || messageObject.isMediaEmpty()) {
                                String strSubstring = messageObject.messageOwner.message;
                                if (strSubstring != null) {
                                    if (strSubstring.length() > 150) {
                                        strSubstring = strSubstring.substring(0, 150);
                                    }
                                    Object[] objArr2 = new Object[2];
                                    objArr2[0] = strSubstring.replace('\n', ' ').trim();
                                    objArr2[c10] = str4;
                                    spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr2));
                                } else {
                                    spannableStringBuilderValueOf = SpannableStringBuilder.valueOf("");
                                }
                            } else {
                                color = this.mContext.getResources().getColor(R.color.widget_action_text);
                                TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                    strJ = a9.p.m("📊 \u2068", ((TLRPC.TL_messageMediaPoll) messageMedia2).poll.question.text, "\u2069");
                                } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                    strJ = a9.p.m("🎮 \u2068", messageMedia2.game.title, "\u2069");
                                } else {
                                    strJ = messageObject.type == 14 ? org.telegram.ui.Cells.pa.j("🎧 \u2068", messageObject.getMusicAuthor(), " - ", messageObject.getMusicTitle(), "\u2069") : messageObject.messageText.toString();
                                }
                                Object[] objArr3 = new Object[2];
                                objArr3[0] = strJ.replace('\n', ' ');
                                objArr3[c10] = str4;
                                SpannableStringBuilder spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr3));
                                try {
                                    spannableStringBuilderValueOf2.setSpan(new s00(org.telegram.ui.ActionBar.g6.f23254o9, null), str4.length() + 2, spannableStringBuilderValueOf2.length(), 33);
                                    spannableStringBuilder = spannableStringBuilderValueOf2;
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                    spannableStringBuilder = spannableStringBuilderValueOf2;
                                }
                            }
                            spannableStringBuilder.setSpan(new s00(org.telegram.ui.ActionBar.g6.f23184k9, null), 0, str4.length() + 1, 33);
                            string = spannableStringBuilder;
                        }
                        spannableStringBuilder.setSpan(new s00(org.telegram.ui.ActionBar.g6.f23184k9, null), 0, str4.length() + 1, 33);
                        string = spannableStringBuilder;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        string = spannableStringBuilder;
                    }
                    spannableStringBuilder = spannableStringBuilderValueOf;
                } else {
                    messageMedia = messageObject.messageOwner.media;
                    if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                        string = LocaleController.getString(R.string.AttachPhotoExpired);
                    } else if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument) && (messageMedia.document instanceof TLRPC.TL_documentEmpty) && messageMedia.ttl_seconds != 0) {
                        string = LocaleController.getString(R.string.AttachVideoExpired);
                    } else if (messageObject.caption != null) {
                        if (messageObject.isVideo()) {
                            str2 = "📹 ";
                        } else if (messageObject.isVoice()) {
                            str2 = "🎤 ";
                        } else if (messageObject.isMusic()) {
                            str2 = "🎧 ";
                        } else if (messageObject.isPhoto()) {
                            str2 = "🖼 ";
                        }
                        StringBuilder sbO10 = com.google.android.recaptcha.internal.a.o(str2);
                        sbO10.append((Object) messageObject.caption);
                        string = sbO10.toString();
                    } else {
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            charSequenceN = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                            charSequenceN = "🎮 " + messageObject.messageOwner.media.game.title;
                        } else if (messageObject.type == 14) {
                            charSequenceN = i0.a.n("🎧 ", messageObject.getMusicAuthor(), " - ", messageObject.getMusicTitle());
                        } else {
                            charSequenceN = messageObject.messageText;
                            AndroidUtilities.highlightText(charSequenceN, messageObject.highlightedWords, (org.telegram.ui.ActionBar.c6) null);
                        }
                        charSequence = charSequenceN;
                        string = charSequence;
                        if (messageObject.messageOwner.media != null && !messageObject.isMediaEmpty()) {
                            string = charSequence;
                            color = this.mContext.getResources().getColor(R.color.widget_action_text);
                            string = charSequence;
                        }
                    }
                }
            }
            string = charSequence;
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, LocaleController.stringForMessageListDate(messageObject.messageOwner.date));
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_message, string.toString());
            remoteViews3.setTextColor(R.id.shortcut_widget_item_message, color);
        } else {
            if (dialog != null || (i11 = dialog.last_message_date) == 0) {
                remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, "");
            } else {
                remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, LocaleController.stringForMessageListDate(i11));
            }
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_message, "");
        }
        if (dialog != null || (i12 = dialog.unread_count) <= 0) {
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
        } else {
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_badge, String.format("%d", Integer.valueOf(i12)));
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 0);
            if (this.accountInstance.getMessagesController().isDialogMuted(dialog.f22384id, 0L)) {
                remoteViews3.setBoolean(R.id.shortcut_widget_item_badge, "setEnabled", false);
                remoteViews3.setInt(R.id.shortcut_widget_item_badge, "setBackgroundResource", R.drawable.widget_badge_muted_background);
            } else {
                remoteViews3.setBoolean(R.id.shortcut_widget_item_badge, "setEnabled", true);
                remoteViews3.setInt(R.id.shortcut_widget_item_badge, "setBackgroundResource", R.drawable.widget_badge_background);
            }
        }
        bundle = new Bundle();
        if (DialogObject.isUserDialog(l10.longValue())) {
            bundle.putLong("userId", l10.longValue());
        } else {
            bundle.putLong("chatId", -l10.longValue());
        }
        bundle.putInt("currentAccount", this.accountInstance.getCurrentAccount());
        Intent intent3 = new Intent();
        intent3.putExtras(bundle);
        remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent3);
        remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i10 == getCount() ? 8 : 0);
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
        this.messageObjects.b();
        AccountInstance accountInstance = this.accountInstance;
        if (accountInstance == null || !accountInstance.getUserConfig().isClientActivated()) {
            return;
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList2 = new ArrayList<>();
        a0.h hVar = new a0.h();
        this.accountInstance.getMessagesStorage().getWidgetDialogs(this.appWidgetId, 0, this.dids, this.dialogs, hVar, arrayList, arrayList2);
        this.accountInstance.getMessagesController().putUsers(arrayList, true);
        this.accountInstance.getMessagesController().putChats(arrayList2, true);
        this.messageObjects.b();
        int iM = hVar.m();
        for (int i10 = 0; i10 < iM; i10++) {
            this.messageObjects.k(new MessageObject(this.accountInstance.getCurrentAccount(), (TLRPC.Message) hVar.n(i10), (a0.h) null, (a0.h) null, false, true), hVar.j(i10));
        }
    }

    @Override
    public void onDestroy() {
    }
}
