package bg;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.z8;
import org.telegram.ui.sf1;
import org.telegram.ui.xn;
public abstract class e {
    public static final int f1980a = 0;

    static {
        new SparseArray();
    }

    public static void a(xn xnVar, MessagesStorage.TopicKey topicKey) {
        TLRPC.TL_forumTopic findTopic;
        if (topicKey.topicId != 0 && (findTopic = xnVar.getMessagesController().getTopicsController().findTopic(-topicKey.dialogId, topicKey.topicId)) != null) {
            if (topicKey.dialogId > 0) {
                if (UserObject.isBotForum(xnVar.getMessagesController().getUser(Long.valueOf(topicKey.dialogId)))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new MessageObject(xnVar.getCurrentAccount(), findTopic.topicStartMessage, false, false));
                    xnVar.pb(arrayList, null, findTopic.f20897id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
                    xnVar.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = xnVar.getMessagesController().getChat(Long.valueOf(-topicKey.dialogId));
            if (chat == null) {
                return;
            }
            if (ChatObject.isMonoForum(chat)) {
                if (ChatObject.canManageMonoForum(UserConfig.selectedAccount, chat)) {
                    int i10 = findTopic.read_inbox_max_id;
                    int i11 = findTopic.read_outbox_max_id;
                    xnVar.f43186h4 = i10;
                    xnVar.f43198i4 = i11;
                    xnVar.f43210j4 = Math.max(1, i10);
                    xnVar.f43094a4 = DialogObject.getPeerDialogId(findTopic.from_id);
                    xnVar.zc();
                    xnVar.Qc(false);
                    xnVar.hc(false);
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new MessageObject(xnVar.getCurrentAccount(), findTopic.topicStartMessage, false, false));
                xnVar.pb(arrayList2, chat, findTopic.f20897id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
            }
            xnVar.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
        }
    }

    public static void b(MessageObject messageObject) {
        TLRPC.TL_forumTopic findTopic;
        if (messageObject.getDialogId() <= 0 && (findTopic = MessagesController.getInstance(messageObject.currentAccount).getTopicsController().findTopic(-messageObject.getDialogId(), MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
            Drawable drawable = messageObject.topicIconDrawable[0];
            if (drawable instanceof b) {
                ((b) drawable).b(findTopic.icon_color);
            }
        }
    }

    public static d c(Context context, float f10, int i10, boolean z4) {
        int i11;
        if (context == null) {
            return null;
        }
        ?? drawable = new Drawable();
        Resources resources = context.getResources();
        if (z4) {
            i11 = R.drawable.msg_filled_general_large;
        } else {
            i11 = R.drawable.msg_filled_general;
        }
        drawable.f1977a = resources.getDrawable(i11).mutate();
        drawable.f1978b = f10;
        drawable.a(i10);
        return drawable;
    }

    public static pq d(int i10, String str) {
        String str2;
        b bVar = new b(i10);
        o80 o80Var = new o80(1, null);
        String trim = str.trim();
        if (trim.length() >= 1) {
            str2 = trim.substring(0, 1).toUpperCase();
        } else {
            str2 = "";
        }
        o80Var.a(str2);
        pq pqVar = new pq(bVar, o80Var, 0, 0);
        pqVar.f30166w = true;
        return pqVar;
    }

    public static pq e(TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic == null) {
            return null;
        }
        return d(tL_forumTopic.icon_color, tL_forumTopic.title);
    }

    public static void f(long j10, ArrayList arrayList) {
        if (arrayList != null) {
            int i10 = 0;
            while (i10 < arrayList.size()) {
                if (j10 != MessageObject.getTopicId(((MessageObject) arrayList.get(i10)).currentAccount, ((MessageObject) arrayList.get(i10)).messageOwner, true)) {
                    arrayList.remove(i10);
                    i10--;
                }
                i10++;
            }
        }
    }

    public static xn g(p2 p2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i10, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic findTopic;
        if (p2Var != null && tL_forumTopic != null) {
            TLRPC.Chat chat = p2Var.getMessagesController().getChat(Long.valueOf(j10));
            bundle.putLong("chat_id", j10);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            } else if (tL_forumTopic.read_inbox_max_id == 0) {
                bundle.putInt("message_id", tL_forumTopic.f20897id);
            }
            bundle.putInt("unread_count", tL_forumTopic.unread_count);
            bundle.putBoolean("historyPreloaded", false);
            xn xnVar = new xn(bundle);
            TLRPC.Message message = tL_forumTopic.topicStartMessage;
            if (message == null && (findTopic = p2Var.getMessagesController().getTopicsController().findTopic(j10, tL_forumTopic.f20897id)) != null) {
                message = findTopic.topicStartMessage;
                tL_forumTopic2 = findTopic;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MessageObject(p2Var.getCurrentAccount(), message, false, false));
                xnVar.pb(arrayList, chat, tL_forumTopic2.f20897id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                if (i10 != 0) {
                    xnVar.I7 = i10;
                }
                return xnVar;
            }
            return null;
        }
        return null;
    }

    public static String h(int i10, long j10) {
        return i(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), i10, true);
    }

    public static String i(TLRPC.Chat chat, int i10, boolean z4) {
        if (ChatObject.isMonoForum(chat)) {
            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat2 != null) {
                if (z4) {
                    return chat2.title;
                }
                return LocaleController.formatString(R.string.MonoforumTitle, chat2.title);
            }
        } else if (chat != null && chat.linked_monoforum_id != 0) {
            if (z4) {
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
            if (tL_forumTopic.f20897id == 1) {
                try {
                    Context context = ApplicationLoader.applicationContext;
                    if (paint == null) {
                        color = k6.w0(null, k6.Ac, false);
                    } else {
                        color = paint.getColor();
                    }
                    d c3 = c(context, 1.0f, color, false);
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
                    c3.setBounds(0, 0, textSize, textSize2);
                    spannableStringBuilder.append((CharSequence) " ");
                    if (drawableArr != null) {
                        drawableArr[0] = c3;
                    }
                    spannableStringBuilder.setSpan(new ImageSpan(c3, 2), 0, 1, 33);
                } catch (Exception unused) {
                }
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                spannableStringBuilder.append((CharSequence) " ");
                long j10 = tL_forumTopic.icon_emoji_id;
                if (paint != null) {
                    fontMetricsInt = paint.getFontMetricsInt();
                }
                u5 u5Var = new u5(j10, 0.95f, fontMetricsInt);
                spannableStringBuilder.setSpan(u5Var, 0, 1, 33);
                u5Var.top = true;
                u5Var.cacheType = 13;
            } else {
                spannableStringBuilder.append((CharSequence) " ");
                pq e6 = e(tL_forumTopic);
                if (drawableArr != null) {
                    drawableArr[0] = e6.f30158a;
                }
                e6.setBounds(0, 0, (int) (e6.getIntrinsicWidth() * 0.65f), (int) (e6.getIntrinsicHeight() * 0.65f));
                Drawable drawable = e6.f30159b;
                if (drawable instanceof o80) {
                    ((o80) drawable).f29708i = 0.7f;
                }
                if (paint != null) {
                    oq oqVar = new oq(0, e6);
                    oqVar.setSize((int) (Math.abs(paint.getFontMetrics().ascent) + Math.abs(paint.getFontMetrics().descent)));
                    spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
                } else {
                    spannableStringBuilder.setSpan(new ImageSpan(e6), 0, 1, 33);
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
                tL_forumTopic.f20897id = (int) ((peerDialogId >>> 32) ^ peerDialogId);
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

    public static void m(p2 p2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i10) {
        xn g10 = g(p2Var, j10, tL_forumTopic, i10, new Bundle());
        if (g10 != null) {
            p2Var.presentFragment(g10);
        }
    }

    public static void n(int i10, TLRPC.Chat chat, z8 z8Var, ImageReceiver imageReceiver) {
        TLObject tLObject;
        if (ChatObject.isMonoForum(chat)) {
            tLObject = MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id));
        } else {
            tLObject = null;
        }
        if (tLObject != null) {
            chat = tLObject;
        }
        z8Var.k(i10, chat);
        imageReceiver.setForUserOrChat(tLObject, z8Var);
    }

    public static void o(int i10, TLRPC.Chat chat, z8 z8Var, p9 p9Var) {
        TLObject tLObject;
        if (ChatObject.isMonoForum(chat)) {
            tLObject = MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id));
        } else {
            tLObject = null;
        }
        if (tLObject != null) {
            chat = tLObject;
        }
        z8Var.k(i10, chat);
        p9Var.e(tLObject, z8Var);
    }

    public static void p(p9 p9Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z4, boolean z10, g6 g6Var) {
        int i10;
        ColorFilter n02;
        if (tL_forumTopic != null && p9Var != null) {
            if (tL_forumTopic.f20897id == 1) {
                p9Var.setAnimatedEmojiDrawable(null);
                p9Var.setImageDrawable(c(p9Var.getContext(), 0.75f, k6.v0(k6.f21983v8, g6Var), z10));
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                p9Var.setImageDrawable(null);
                l5 l5Var = p9Var.f30014e;
                if (l5Var == null || tL_forumTopic.icon_emoji_id != l5Var.i()) {
                    if (z10) {
                        i10 = 11;
                    } else {
                        i10 = 10;
                    }
                    l5 l5Var2 = new l5(i10, UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id);
                    if (z4) {
                        n02 = new PorterDuffColorFilter(k6.w0(null, k6.A8, false), PorterDuff.Mode.SRC_IN);
                    } else {
                        n02 = k6.n0(g6Var);
                    }
                    l5Var2.setColorFilter(n02);
                    p9Var.setAnimatedEmojiDrawable(l5Var2);
                }
            } else {
                p9Var.setAnimatedEmojiDrawable(null);
                p9Var.setImageDrawable(e(tL_forumTopic));
            }
        }
    }

    public static void q(long j10, ActionBarLayout actionBarLayout) {
        p2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof xn) {
            xn xnVar = (xn) lastFragment;
            if ((-xnVar.a()) == j10 && xnVar.getMessagesController().getChat(Long.valueOf(j10)).forum && xnVar.getParentLayout() != null) {
                if (((ActionBarLayout) xnVar.getParentLayout()).j()) {
                    AndroidUtilities.runOnUIThread(new c(xnVar, 0), 500L);
                } else {
                    sf1.I0(xnVar);
                }
            }
        }
        if (lastFragment instanceof sf1) {
            sf1 sf1Var = (sf1) lastFragment;
            long j11 = sf1Var.f41188a;
            if ((-(-j11)) == j10 && !sf1Var.getMessagesController().getChat(Long.valueOf(j10)).forum) {
                if (sf1Var.getParentLayout() != null && ((ActionBarLayout) sf1Var.getParentLayout()).j()) {
                    AndroidUtilities.runOnUIThread(new ag.e(sf1Var, 8), 500L);
                    return;
                }
                sf1Var.E = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j11);
                xn xnVar2 = new xn(bundle);
                xnVar2.f43179ga = true;
                sf1Var.presentFragment(xnVar2);
            }
        }
    }
}
