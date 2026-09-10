package mg;

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
import gg.v1;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.y5;
import org.telegram.ui.eo;
import org.telegram.ui.ig1;
public abstract class d {
    public static final int f13659a = 0;

    static {
        new SparseArray();
    }

    public static void a(eo eoVar, MessagesStorage.TopicKey topicKey) {
        TLRPC.TL_forumTopic findTopic;
        if (topicKey.topicId != 0 && (findTopic = eoVar.getMessagesController().getTopicsController().findTopic(-topicKey.dialogId, topicKey.topicId)) != null) {
            if (topicKey.dialogId > 0) {
                if (UserObject.isBotForum(eoVar.getMessagesController().getUser(Long.valueOf(topicKey.dialogId)))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new MessageObject(eoVar.getCurrentAccount(), findTopic.topicStartMessage, false, false));
                    eoVar.pb(arrayList, null, findTopic.f17247id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
                    eoVar.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = eoVar.getMessagesController().getChat(Long.valueOf(-topicKey.dialogId));
            if (chat == null) {
                return;
            }
            if (ChatObject.isMonoForum(chat)) {
                if (ChatObject.canManageMonoForum(UserConfig.selectedAccount, chat)) {
                    int i10 = findTopic.read_inbox_max_id;
                    int i11 = findTopic.read_outbox_max_id;
                    eoVar.f32383k4 = i10;
                    eoVar.l4 = i11;
                    eoVar.f32406m4 = Math.max(1, i10);
                    eoVar.f32298d4 = DialogObject.getPeerDialogId(findTopic.from_id);
                    eoVar.zc();
                    eoVar.Qc(false);
                    eoVar.hc(false);
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new MessageObject(eoVar.getCurrentAccount(), findTopic.topicStartMessage, false, false));
                eoVar.pb(arrayList2, chat, findTopic.f17247id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
            }
            eoVar.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
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
        drawable.f13656a = resources.getDrawable(i11).mutate();
        drawable.f13657b = f7;
        drawable.a(i10);
        return drawable;
    }

    public static vq d(int i10, String str) {
        String str2;
        a aVar = new a(i10);
        v80 v80Var = new v80(1, null);
        String trim = str.trim();
        if (trim.length() >= 1) {
            str2 = trim.substring(0, 1).toUpperCase();
        } else {
            str2 = "";
        }
        v80Var.a(str2);
        vq vqVar = new vq(aVar, v80Var, 0, 0);
        vqVar.f28580w = true;
        return vqVar;
    }

    public static vq e(TLRPC.TL_forumTopic tL_forumTopic) {
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

    public static eo g(p2 p2Var, long j3, TLRPC.TL_forumTopic tL_forumTopic, int i10, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic findTopic;
        if (p2Var != null && tL_forumTopic != null) {
            TLRPC.Chat chat = p2Var.getMessagesController().getChat(Long.valueOf(j3));
            bundle.putLong("chat_id", j3);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            } else if (tL_forumTopic.read_inbox_max_id == 0) {
                bundle.putInt("message_id", tL_forumTopic.f17247id);
            }
            bundle.putInt("unread_count", tL_forumTopic.unread_count);
            bundle.putBoolean("historyPreloaded", false);
            eo eoVar = new eo(bundle);
            TLRPC.Message message = tL_forumTopic.topicStartMessage;
            if (message == null && (findTopic = p2Var.getMessagesController().getTopicsController().findTopic(j3, tL_forumTopic.f17247id)) != null) {
                message = findTopic.topicStartMessage;
                tL_forumTopic2 = findTopic;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MessageObject(p2Var.getCurrentAccount(), message, false, false));
                eoVar.pb(arrayList, chat, tL_forumTopic2.f17247id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                if (i10 != 0) {
                    eoVar.L7 = i10;
                }
                return eoVar;
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
            if (tL_forumTopic.f17247id == 1) {
                try {
                    Context context = ApplicationLoader.applicationContext;
                    if (paint == null) {
                        color = j6.w0(null, j6.Ac, false);
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
                y5 y5Var = new y5(j3, 0.95f, fontMetricsInt);
                spannableStringBuilder.setSpan(y5Var, 0, 1, 33);
                y5Var.top = true;
                y5Var.cacheType = 13;
            } else {
                spannableStringBuilder.append((CharSequence) " ");
                vq e = e(tL_forumTopic);
                if (drawableArr != null) {
                    drawableArr[0] = e.f28573a;
                }
                e.setBounds(0, 0, (int) (e.getIntrinsicWidth() * 0.65f), (int) (e.getIntrinsicHeight() * 0.65f));
                Drawable drawable = e.f28574b;
                if (drawable instanceof v80) {
                    ((v80) drawable).f27884i = 0.7f;
                }
                if (paint != null) {
                    uq uqVar = new uq(0, e);
                    uqVar.setSize((int) (Math.abs(paint.getFontMetrics().ascent) + Math.abs(paint.getFontMetrics().descent)));
                    spannableStringBuilder.setSpan(uqVar, 0, 1, 33);
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
                tL_forumTopic.f17247id = (int) ((peerDialogId >>> 32) ^ peerDialogId);
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

    public static void m(p2 p2Var, long j3, TLRPC.TL_forumTopic tL_forumTopic, int i10) {
        eo g10 = g(p2Var, j3, tL_forumTopic, i10, new Bundle());
        if (g10 != null) {
            p2Var.presentFragment(g10);
        }
    }

    public static void n(int i10, TLRPC.Chat chat, g9 g9Var, ImageReceiver imageReceiver) {
        TLObject tLObject;
        if (ChatObject.isMonoForum(chat)) {
            tLObject = MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id));
        } else {
            tLObject = null;
        }
        if (tLObject != null) {
            chat = tLObject;
        }
        g9Var.k(i10, chat);
        imageReceiver.setForUserOrChat(tLObject, g9Var);
    }

    public static void o(int i10, TLRPC.Chat chat, g9 g9Var, w9 w9Var) {
        TLObject tLObject;
        if (ChatObject.isMonoForum(chat)) {
            tLObject = MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id));
        } else {
            tLObject = null;
        }
        if (tLObject != null) {
            chat = tLObject;
        }
        g9Var.k(i10, chat);
        w9Var.e(tLObject, g9Var);
    }

    public static void p(w9 w9Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11, f6 f6Var) {
        int i10;
        ColorFilter n02;
        if (tL_forumTopic != null && w9Var != null) {
            if (tL_forumTopic.f17247id == 1) {
                w9Var.setAnimatedEmojiDrawable(null);
                w9Var.setImageDrawable(c(w9Var.getContext(), 0.75f, j6.v0(j6.f18256v8, f6Var), z11));
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                w9Var.setImageDrawable(null);
                p5 p5Var = w9Var.e;
                if (p5Var == null || tL_forumTopic.icon_emoji_id != p5Var.i()) {
                    if (z11) {
                        i10 = 11;
                    } else {
                        i10 = 10;
                    }
                    p5 p5Var2 = new p5(i10, UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id);
                    if (z10) {
                        n02 = new PorterDuffColorFilter(j6.w0(null, j6.A8, false), PorterDuff.Mode.SRC_IN);
                    } else {
                        n02 = j6.n0(f6Var);
                    }
                    p5Var2.setColorFilter(n02);
                    w9Var.setAnimatedEmojiDrawable(p5Var2);
                }
            } else {
                w9Var.setAnimatedEmojiDrawable(null);
                w9Var.setImageDrawable(e(tL_forumTopic));
            }
        }
    }

    public static void q(long j3, ActionBarLayout actionBarLayout) {
        p2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof eo) {
            eo eoVar = (eo) lastFragment;
            if ((-eoVar.a()) == j3 && eoVar.getMessagesController().getChat(Long.valueOf(j3)).forum && eoVar.getParentLayout() != null) {
                if (((ActionBarLayout) eoVar.getParentLayout()).j()) {
                    AndroidUtilities.runOnUIThread(new b(eoVar, 0), 500L);
                } else {
                    ig1.I0(eoVar);
                }
            }
        }
        if (lastFragment instanceof ig1) {
            ig1 ig1Var = (ig1) lastFragment;
            long j10 = ig1Var.f33681a;
            if ((-(-j10)) == j3 && !ig1Var.getMessagesController().getChat(Long.valueOf(j3)).forum) {
                if (ig1Var.getParentLayout() != null && ((ActionBarLayout) ig1Var.getParentLayout()).j()) {
                    AndroidUtilities.runOnUIThread(new v1(ig1Var, 20), 500L);
                    return;
                }
                ig1Var.H = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                eo eoVar2 = new eo(bundle);
                eoVar2.f32376ja = true;
                ig1Var.presentFragment(eoVar2);
            }
        }
    }
}
