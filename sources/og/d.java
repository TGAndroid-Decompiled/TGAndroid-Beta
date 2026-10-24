package og;

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
import ki.u;
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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.y5;
import org.telegram.ui.sn;
import org.telegram.ui.xe1;
public abstract class d {
    public static final int f17806a = 0;

    static {
        new SparseArray();
    }

    public static void a(sn snVar, MessagesStorage.TopicKey topicKey) {
        TLRPC.TL_forumTopic findTopic;
        if (topicKey.topicId != 0 && (findTopic = snVar.getMessagesController().getTopicsController().findTopic(-topicKey.dialogId, topicKey.topicId)) != null) {
            if (topicKey.dialogId > 0) {
                if (UserObject.isBotForum(snVar.getMessagesController().getUser(Long.valueOf(topicKey.dialogId)))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new MessageObject(snVar.getCurrentAccount(), findTopic.topicStartMessage, false, false));
                    snVar.vb(arrayList, null, findTopic.f20396id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
                    snVar.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = snVar.getMessagesController().getChat(Long.valueOf(-topicKey.dialogId));
            if (chat == null) {
                return;
            }
            if (ChatObject.isMonoForum(chat)) {
                if (ChatObject.canManageMonoForum(UserConfig.selectedAccount, chat)) {
                    int i10 = findTopic.read_inbox_max_id;
                    int i11 = findTopic.read_outbox_max_id;
                    snVar.f41725w4 = i10;
                    snVar.f41738x4 = i11;
                    snVar.f41751y4 = Math.max(1, i10);
                    snVar.f41635p4 = DialogObject.getPeerDialogId(findTopic.from_id);
                    snVar.Gc();
                    snVar.Xc(false);
                    snVar.oc(false);
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new MessageObject(snVar.getCurrentAccount(), findTopic.topicStartMessage, false, false));
                snVar.vb(arrayList2, chat, findTopic.f20396id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
            }
            snVar.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
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
        drawable.f17803a = resources.getDrawable(i11).mutate();
        drawable.f17804b = f7;
        drawable.a(i10);
        return drawable;
    }

    public static wq d(int i10, String str) {
        String str2;
        a aVar = new a(i10);
        e90 e90Var = new e90(1, null);
        String trim = str.trim();
        if (trim.length() >= 1) {
            str2 = trim.substring(0, 1).toUpperCase();
        } else {
            str2 = "";
        }
        e90Var.a(str2);
        wq wqVar = new wq(aVar, e90Var, 0, 0);
        wqVar.f32329w = true;
        return wqVar;
    }

    public static wq e(TLRPC.TL_forumTopic tL_forumTopic) {
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

    public static sn g(o2 o2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i10, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic findTopic;
        if (o2Var != null && tL_forumTopic != null) {
            TLRPC.Chat chat = o2Var.getMessagesController().getChat(Long.valueOf(j10));
            bundle.putLong("chat_id", j10);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            } else if (tL_forumTopic.read_inbox_max_id == 0) {
                bundle.putInt("message_id", tL_forumTopic.f20396id);
            }
            bundle.putInt("unread_count", tL_forumTopic.unread_count);
            bundle.putBoolean("historyPreloaded", false);
            sn snVar = new sn(bundle);
            TLRPC.Message message = tL_forumTopic.topicStartMessage;
            if (message == null && (findTopic = o2Var.getMessagesController().getTopicsController().findTopic(j10, tL_forumTopic.f20396id)) != null) {
                message = findTopic.topicStartMessage;
                tL_forumTopic2 = findTopic;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MessageObject(o2Var.getCurrentAccount(), message, false, false));
                snVar.vb(arrayList, chat, tL_forumTopic2.f20396id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                if (i10 != 0) {
                    snVar.X7 = i10;
                }
                return snVar;
            }
            return null;
        }
        return null;
    }

    public static String h(int i10, long j10) {
        return i(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), i10, true);
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
            if (tL_forumTopic.f20396id == 1) {
                try {
                    Context context = ApplicationLoader.applicationContext;
                    if (paint == null) {
                        color = k6.x0(null, k6.Ac, false);
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
                long j10 = tL_forumTopic.icon_emoji_id;
                if (paint != null) {
                    fontMetricsInt = paint.getFontMetricsInt();
                }
                y5 y5Var = new y5(j10, 0.95f, fontMetricsInt);
                spannableStringBuilder.setSpan(y5Var, 0, 1, 33);
                y5Var.top = true;
                y5Var.cacheType = 13;
            } else {
                spannableStringBuilder.append((CharSequence) " ");
                wq e = e(tL_forumTopic);
                if (drawableArr != null) {
                    drawableArr[0] = e.f32322a;
                }
                e.setBounds(0, 0, (int) (e.getIntrinsicWidth() * 0.65f), (int) (e.getIntrinsicHeight() * 0.65f));
                Drawable drawable = e.f32323b;
                if (drawable instanceof e90) {
                    ((e90) drawable).f26004i = 0.7f;
                }
                if (paint != null) {
                    vq vqVar = new vq(0, e);
                    vqVar.setSize((int) (Math.abs(paint.getFontMetrics().ascent) + Math.abs(paint.getFontMetrics().descent)));
                    spannableStringBuilder.setSpan(vqVar, 0, 1, 33);
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
                tL_forumTopic.f20396id = (int) ((peerDialogId >>> 32) ^ peerDialogId);
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

    public static void m(o2 o2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i10) {
        sn g10 = g(o2Var, j10, tL_forumTopic, i10, new Bundle());
        if (g10 != null) {
            o2Var.presentFragment(g10);
        }
    }

    public static void n(int i10, TLRPC.Chat chat, f9 f9Var, ImageReceiver imageReceiver) {
        TLObject tLObject;
        if (ChatObject.isMonoForum(chat)) {
            tLObject = MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id));
        } else {
            tLObject = null;
        }
        if (tLObject != null) {
            chat = tLObject;
        }
        f9Var.k(i10, chat);
        imageReceiver.setForUserOrChat(tLObject, f9Var);
    }

    public static void o(int i10, TLRPC.Chat chat, f9 f9Var, u9 u9Var) {
        TLObject tLObject;
        if (ChatObject.isMonoForum(chat)) {
            tLObject = MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id));
        } else {
            tLObject = null;
        }
        if (tLObject != null) {
            chat = tLObject;
        }
        f9Var.k(i10, chat);
        u9Var.e(tLObject, f9Var);
    }

    public static void p(u9 u9Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11, g6 g6Var) {
        int i10;
        ColorFilter o02;
        if (tL_forumTopic != null && u9Var != null) {
            if (tL_forumTopic.f20396id == 1) {
                u9Var.setAnimatedEmojiDrawable(null);
                Context context = u9Var.getContext();
                int i11 = k6.f21519v8;
                c c10 = c(context, 0.75f, k6.w0(i11, g6Var), z11);
                u9Var.setImageDrawable(c10);
                if (c10 != null) {
                    r6.z(u9Var, c10, i11, g6Var, PorterDuff.Mode.MULTIPLY);
                }
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                u9Var.setImageDrawable(null);
                p5 p5Var = u9Var.e;
                if (p5Var == null || tL_forumTopic.icon_emoji_id != p5Var.i()) {
                    if (z11) {
                        i10 = 11;
                    } else {
                        i10 = 10;
                    }
                    p5 p5Var2 = new p5(i10, UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id);
                    if (z10) {
                        o02 = new PorterDuffColorFilter(k6.x0(null, k6.A8, false), PorterDuff.Mode.SRC_IN);
                    } else {
                        o02 = k6.o0(g6Var);
                    }
                    p5Var2.setColorFilter(o02);
                    u9Var.setAnimatedEmojiDrawable(p5Var2);
                }
            } else {
                u9Var.setAnimatedEmojiDrawable(null);
                u9Var.setImageDrawable(e(tL_forumTopic));
            }
        }
    }

    public static void q(long j10, ActionBarLayout actionBarLayout) {
        o2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof sn) {
            sn snVar = (sn) lastFragment;
            if ((-snVar.a()) == j10 && snVar.getMessagesController().getChat(Long.valueOf(j10)).forum && snVar.getParentLayout() != null) {
                if (((ActionBarLayout) snVar.getParentLayout()).i()) {
                    AndroidUtilities.runOnUIThread(new b(snVar, 0), 500L);
                } else {
                    xe1.H0(snVar);
                }
            }
        }
        if (lastFragment instanceof xe1) {
            xe1 xe1Var = (xe1) lastFragment;
            long j11 = xe1Var.f43545a;
            if ((-(-j11)) == j10 && !xe1Var.getMessagesController().getChat(Long.valueOf(j10)).forum) {
                if (xe1Var.getParentLayout() != null && ((ActionBarLayout) xe1Var.getParentLayout()).i()) {
                    AndroidUtilities.runOnUIThread(new u(xe1Var, 11), 500L);
                    return;
                }
                xe1Var.H = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j11);
                sn snVar2 = new sn(bundle);
                snVar2.f41717va = true;
                xe1Var.presentFragment(snVar2);
            }
        }
    }
}
