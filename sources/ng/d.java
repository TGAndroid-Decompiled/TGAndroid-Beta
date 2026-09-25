package ng;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import i2.h0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.z5;
import org.telegram.ui.wf1;
import org.telegram.ui.wn;
public abstract class d {
    public static final int f15457a = 0;

    static {
        new SparseArray();
    }

    public static void a(wn wnVar, MessagesStorage.TopicKey topicKey) {
        TLRPC.TL_forumTopic findTopic;
        if (topicKey.topicId != 0 && (findTopic = wnVar.getMessagesController().getTopicsController().findTopic(-topicKey.dialogId, topicKey.topicId)) != null) {
            if (topicKey.dialogId > 0) {
                if (UserObject.isBotForum(wnVar.getMessagesController().getUser(Long.valueOf(topicKey.dialogId)))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new MessageObject(wnVar.getCurrentAccount(), findTopic.topicStartMessage, false, false));
                    wnVar.pb(arrayList, null, findTopic.f18388id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
                    wnVar.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = wnVar.getMessagesController().getChat(Long.valueOf(-topicKey.dialogId));
            if (chat == null) {
                return;
            }
            if (ChatObject.isMonoForum(chat)) {
                if (ChatObject.canManageMonoForum(UserConfig.selectedAccount, chat)) {
                    int i10 = findTopic.read_inbox_max_id;
                    int i11 = findTopic.read_outbox_max_id;
                    wnVar.f39537k4 = i10;
                    wnVar.l4 = i11;
                    wnVar.f39560m4 = Math.max(1, i10);
                    wnVar.f39452d4 = DialogObject.getPeerDialogId(findTopic.from_id);
                    wnVar.zc();
                    wnVar.Qc(false);
                    wnVar.hc(false);
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new MessageObject(wnVar.getCurrentAccount(), findTopic.topicStartMessage, false, false));
                wnVar.pb(arrayList2, chat, findTopic.f18388id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
            }
            wnVar.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
        }
    }

    public static void b(MessageObject messageObject) {
        TLRPC.TL_forumTopic findTopic;
        if (messageObject.getDialogId() <= 0 && (findTopic = MessagesController.getInstance(messageObject.currentAccount).getTopicsController().findTopic(-messageObject.getDialogId(), MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
            Drawable drawable = messageObject.topicIconDrawable[0];
            if (drawable instanceof a) {
                ((a) drawable).b(findTopic.icon_color);
            }
        }
    }

    public static c c(Context context, float f7, int i10, boolean z10) {
        int i11;
        if (context == null) {
            return null;
        }
        ?? drawable = new Drawable();
        Resources resources = context.getResources();
        if (z10) {
            i11 = R.drawable.msg_filled_general_large;
        } else {
            i11 = R.drawable.msg_filled_general;
        }
        drawable.f15454a = resources.getDrawable(i11).mutate();
        drawable.f15455b = f7;
        drawable.a(i10);
        return drawable;
    }

    public static qq d(int i10, String str) {
        String str2;
        a aVar = new a(i10);
        w80 w80Var = new w80(1, null);
        String trim = str.trim();
        if (trim.length() >= 1) {
            str2 = trim.substring(0, 1).toUpperCase();
        } else {
            str2 = "";
        }
        w80Var.a(str2);
        qq qqVar = new qq(aVar, w80Var, 0, 0);
        qqVar.f27740w = true;
        return qqVar;
    }

    public static qq e(TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic == null) {
            return null;
        }
        return d(tL_forumTopic.icon_color, tL_forumTopic.title);
    }

    public static void f(long j3, ArrayList arrayList) {
        if (arrayList != null) {
            int i10 = 0;
            while (i10 < arrayList.size()) {
                if (j3 != MessageObject.getTopicId(((MessageObject) arrayList.get(i10)).currentAccount, ((MessageObject) arrayList.get(i10)).messageOwner, true)) {
                    arrayList.remove(i10);
                    i10--;
                }
                i10++;
            }
        }
    }

    public static wn g(m2 m2Var, long j3, TLRPC.TL_forumTopic tL_forumTopic, int i10, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic findTopic;
        if (m2Var != null && tL_forumTopic != null) {
            TLRPC.Chat chat = m2Var.getMessagesController().getChat(Long.valueOf(j3));
            bundle.putLong("chat_id", j3);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            } else if (tL_forumTopic.read_inbox_max_id == 0) {
                bundle.putInt("message_id", tL_forumTopic.f18388id);
            }
            bundle.putInt("unread_count", tL_forumTopic.unread_count);
            bundle.putBoolean("historyPreloaded", false);
            wn wnVar = new wn(bundle);
            TLRPC.Message message = tL_forumTopic.topicStartMessage;
            if (message == null && (findTopic = m2Var.getMessagesController().getTopicsController().findTopic(j3, tL_forumTopic.f18388id)) != null) {
                message = findTopic.topicStartMessage;
                tL_forumTopic2 = findTopic;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MessageObject(m2Var.getCurrentAccount(), message, false, false));
                wnVar.pb(arrayList, chat, tL_forumTopic2.f18388id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                if (i10 != 0) {
                    wnVar.L7 = i10;
                }
                return wnVar;
            }
            return null;
        }
        return null;
    }

    public static String h(int i10, long j3) {
        return i(MessagesController.getInstance(i10).getChat(Long.valueOf(-j3)), i10, true);
    }

    public static String i(TLRPC.Chat chat, int i10, boolean z10) {
        if (ChatObject.isMonoForum(chat)) {
            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat2 != null) {
                if (z10) {
                    return chat2.title;
                }
                return LocaleController.formatString(R.string.MonoforumTitle, chat2.title);
            }
        } else if (chat != null && chat.linked_monoforum_id != 0) {
            if (z10) {
                return chat.title;
            }
            return LocaleController.formatString(R.string.MonoforumTitle, chat.title);
        }
        if (chat != null) {
            return chat.title;
        }
        return null;
    }

    public static CharSequence j(TLRPC.ForumTopic forumTopic, Paint paint, Drawable[] drawableArr) {
        int color;
        int textSize;
        int textSize2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (forumTopic instanceof TLRPC.TL_forumTopic) {
            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) forumTopic;
            Paint.FontMetricsInt fontMetricsInt = null;
            if (tL_forumTopic.f18388id == 1) {
                try {
                    Context context = ApplicationLoader.applicationContext;
                    if (paint == null) {
                        color = h6.w0(null, h6.Ac, false);
                    } else {
                        color = paint.getColor();
                    }
                    c c10 = c(context, 1.0f, color, false);
                    if (paint == null) {
                        textSize = AndroidUtilities.dp(14.0f);
                    } else {
                        textSize = (int) paint.getTextSize();
                    }
                    if (paint == null) {
                        textSize2 = AndroidUtilities.dp(14.0f);
                    } else {
                        textSize2 = (int) paint.getTextSize();
                    }
                    c10.setBounds(0, 0, textSize, textSize2);
                    spannableStringBuilder.append((CharSequence) " ");
                    if (drawableArr != null) {
                        drawableArr[0] = c10;
                    }
                    spannableStringBuilder.setSpan(new ImageSpan(c10, 2), 0, 1, 33);
                } catch (Exception unused) {
                }
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                spannableStringBuilder.append((CharSequence) " ");
                long j3 = tL_forumTopic.icon_emoji_id;
                if (paint != null) {
                    fontMetricsInt = paint.getFontMetricsInt();
                }
                z5 z5Var = new z5(j3, 0.95f, fontMetricsInt);
                spannableStringBuilder.setSpan(z5Var, 0, 1, 33);
                z5Var.top = true;
                z5Var.cacheType = 13;
            } else {
                spannableStringBuilder.append((CharSequence) " ");
                qq e = e(tL_forumTopic);
                if (drawableArr != null) {
                    drawableArr[0] = e.f27733a;
                }
                e.setBounds(0, 0, (int) (e.getIntrinsicWidth() * 0.65f), (int) (e.getIntrinsicHeight() * 0.65f));
                Drawable drawable = e.f27734b;
                if (drawable instanceof w80) {
                    ((w80) drawable).f29932i = 0.7f;
                }
                if (paint != null) {
                    pq pqVar = new pq(0, e);
                    pqVar.setSize((int) (Math.abs(paint.getFontMetrics().ascent) + Math.abs(paint.getFontMetrics().descent)));
                    spannableStringBuilder.setSpan(pqVar, 0, 1, 33);
                } else {
                    spannableStringBuilder.setSpan(new ImageSpan(e), 0, 1, 33);
                }
            }
            if (!TextUtils.isEmpty(tL_forumTopic.title)) {
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
            }
            return spannableStringBuilder;
        }
        return "DELETED";
    }

    public static boolean k(MessageObject messageObject) {
        if (messageObject != null && (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate)) {
            return true;
        }
        return false;
    }

    public static ArrayList l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TLRPC.savedDialog saveddialog = (TLRPC.savedDialog) obj;
            if (saveddialog instanceof TLRPC.TL_monoForumDialog) {
                TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) saveddialog;
                long peerDialogId = DialogObject.getPeerDialogId(tL_monoForumDialog.peer);
                TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                tL_forumTopic.f18388id = (int) ((peerDialogId >>> 32) ^ peerDialogId);
                tL_forumTopic.title = Long.toString(peerDialogId);
                tL_forumTopic.top_message = tL_monoForumDialog.top_message;
                tL_forumTopic.read_inbox_max_id = tL_monoForumDialog.read_inbox_max_id;
                tL_forumTopic.read_outbox_max_id = tL_monoForumDialog.read_outbox_max_id;
                tL_forumTopic.unread_reactions_count = tL_monoForumDialog.unread_reactions_count;
                tL_forumTopic.unread_count = tL_monoForumDialog.unread_count;
                tL_forumTopic.draft = tL_monoForumDialog.draft;
                tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                tL_forumTopic.from_id = tL_monoForumDialog.peer;
                tL_forumTopic.nopaid_messages_exception = tL_monoForumDialog.nopaid_messages_exception;
                arrayList2.add(tL_forumTopic);
            }
        }
        return arrayList2;
    }

    public static void m(m2 m2Var, long j3, TLRPC.TL_forumTopic tL_forumTopic, int i10) {
        wn g10 = g(m2Var, j3, tL_forumTopic, i10, new Bundle());
        if (g10 != null) {
            m2Var.presentFragment(g10);
        }
    }

    public static void n(int i10, TLRPC.Chat chat, h9 h9Var, ImageReceiver imageReceiver) {
        TLObject tLObject;
        if (ChatObject.isMonoForum(chat)) {
            tLObject = MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id));
        } else {
            tLObject = null;
        }
        if (tLObject != null) {
            chat = tLObject;
        }
        h9Var.k(i10, chat);
        imageReceiver.setForUserOrChat(tLObject, h9Var);
    }

    public static void o(int i10, TLRPC.Chat chat, h9 h9Var, w9 w9Var) {
        TLObject tLObject;
        if (ChatObject.isMonoForum(chat)) {
            tLObject = MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id));
        } else {
            tLObject = null;
        }
        if (tLObject != null) {
            chat = tLObject;
        }
        h9Var.k(i10, chat);
        w9Var.e(tLObject, h9Var);
    }

    public static void p(w9 w9Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11, d6 d6Var) {
        int i10;
        ColorFilter n02;
        if (tL_forumTopic != null && w9Var != null) {
            if (tL_forumTopic.f18388id == 1) {
                w9Var.setAnimatedEmojiDrawable(null);
                w9Var.setImageDrawable(c(w9Var.getContext(), 0.75f, h6.v0(h6.f19393v8, d6Var), z11));
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                w9Var.setImageDrawable(null);
                q5 q5Var = w9Var.e;
                if (q5Var == null || tL_forumTopic.icon_emoji_id != q5Var.i()) {
                    if (z11) {
                        i10 = 11;
                    } else {
                        i10 = 10;
                    }
                    q5 q5Var2 = new q5(i10, UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id);
                    if (z10) {
                        n02 = new PorterDuffColorFilter(h6.w0(null, h6.A8, false), PorterDuff.Mode.SRC_IN);
                    } else {
                        n02 = h6.n0(d6Var);
                    }
                    q5Var2.setColorFilter(n02);
                    w9Var.setAnimatedEmojiDrawable(q5Var2);
                }
            } else {
                w9Var.setAnimatedEmojiDrawable(null);
                w9Var.setImageDrawable(e(tL_forumTopic));
            }
        }
    }

    public static void q(long j3, ActionBarLayout actionBarLayout) {
        m2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof wn) {
            wn wnVar = (wn) lastFragment;
            if ((-wnVar.a()) == j3 && wnVar.getMessagesController().getChat(Long.valueOf(j3)).forum && wnVar.getParentLayout() != null) {
                if (((ActionBarLayout) wnVar.getParentLayout()).j()) {
                    AndroidUtilities.runOnUIThread(new b(wnVar, 0), 500L);
                } else {
                    wf1.I0(wnVar);
                }
            }
        }
        if (lastFragment instanceof wf1) {
            wf1 wf1Var = (wf1) lastFragment;
            long j10 = wf1Var.f39309a;
            if ((-(-j10)) == j3 && !wf1Var.getMessagesController().getChat(Long.valueOf(j3)).forum) {
                if (wf1Var.getParentLayout() != null && ((ActionBarLayout) wf1Var.getParentLayout()).j()) {
                    AndroidUtilities.runOnUIThread(new h0(wf1Var, 15), 500L);
                    return;
                }
                wf1Var.H = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                wn wnVar2 = new wn(bundle);
                wnVar2.f39530ja = true;
                wf1Var.presentFragment(wnVar2);
            }
        }
    }
}
