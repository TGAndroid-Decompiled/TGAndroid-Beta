package ag;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.z8;
import org.telegram.ui.sf1;
import org.telegram.ui.zn;
public abstract class f {
    public static final int f202a = 0;

    static {
        new SparseArray();
    }

    public static void a(zn znVar, MessagesStorage.TopicKey topicKey) {
        TLRPC.TL_forumTopic findTopic;
        if (topicKey.topicId != 0 && (findTopic = znVar.getMessagesController().getTopicsController().findTopic(-topicKey.dialogId, topicKey.topicId)) != null) {
            if (topicKey.dialogId > 0) {
                if (UserObject.isBotForum(znVar.getMessagesController().getUser(Long.valueOf(topicKey.dialogId)))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new MessageObject(znVar.getCurrentAccount(), findTopic.topicStartMessage, false, false));
                    znVar.pb(arrayList, null, findTopic.f19211id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
                    znVar.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = znVar.getMessagesController().getChat(Long.valueOf(-topicKey.dialogId));
            if (chat == null) {
                return;
            }
            if (ChatObject.isMonoForum(chat)) {
                if (ChatObject.canManageMonoForum(UserConfig.selectedAccount, chat)) {
                    int i10 = findTopic.read_inbox_max_id;
                    int i11 = findTopic.read_outbox_max_id;
                    znVar.f40605h4 = i10;
                    znVar.f40617i4 = i11;
                    znVar.f40629j4 = Math.max(1, i10);
                    znVar.f40514a4 = DialogObject.getPeerDialogId(findTopic.from_id);
                    znVar.zc();
                    znVar.Qc(false);
                    znVar.hc(false);
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new MessageObject(znVar.getCurrentAccount(), findTopic.topicStartMessage, false, false));
                znVar.pb(arrayList2, chat, findTopic.f19211id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
            }
            znVar.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
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

    public static e c(Context context, float f10, int i10, boolean z4) {
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
        drawable.f199a = resources.getDrawable(i11).mutate();
        drawable.f200b = f10;
        drawable.a(i10);
        return drawable;
    }

    public static mq d(int i10, String str) {
        String str2;
        b bVar = new b(i10);
        n80 n80Var = new n80(1, null);
        String trim = str.trim();
        if (trim.length() >= 1) {
            str2 = trim.substring(0, 1).toUpperCase();
        } else {
            str2 = "";
        }
        n80Var.a(str2);
        mq mqVar = new mq(bVar, n80Var, 0, 0);
        mqVar.f27116w = true;
        return mqVar;
    }

    public static mq e(TLRPC.TL_forumTopic tL_forumTopic) {
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

    public static zn g(p2 p2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i10, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic findTopic;
        if (p2Var != null && tL_forumTopic != null) {
            TLRPC.Chat chat = p2Var.getMessagesController().getChat(Long.valueOf(j10));
            bundle.putLong("chat_id", j10);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            } else if (tL_forumTopic.read_inbox_max_id == 0) {
                bundle.putInt("message_id", tL_forumTopic.f19211id);
            }
            bundle.putInt("unread_count", tL_forumTopic.unread_count);
            bundle.putBoolean("historyPreloaded", false);
            zn znVar = new zn(bundle);
            TLRPC.Message message = tL_forumTopic.topicStartMessage;
            if (message == null && (findTopic = p2Var.getMessagesController().getTopicsController().findTopic(j10, tL_forumTopic.f19211id)) != null) {
                message = findTopic.topicStartMessage;
                tL_forumTopic2 = findTopic;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MessageObject(p2Var.getCurrentAccount(), message, false, false));
                znVar.pb(arrayList, chat, tL_forumTopic2.f19211id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                if (i10 != 0) {
                    znVar.I7 = i10;
                }
                return znVar;
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
            if (tL_forumTopic.f19211id == 1) {
                try {
                    Context context = ApplicationLoader.applicationContext;
                    if (paint == null) {
                        color = j6.w0(null, j6.Ac, false);
                    } else {
                        color = paint.getColor();
                    }
                    e c3 = c(context, 1.0f, color, false);
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
                mq e = e(tL_forumTopic);
                if (drawableArr != null) {
                    drawableArr[0] = e.f27109a;
                }
                e.setBounds(0, 0, (int) (e.getIntrinsicWidth() * 0.65f), (int) (e.getIntrinsicHeight() * 0.65f));
                Drawable drawable = e.f27110b;
                if (drawable instanceof n80) {
                    ((n80) drawable).f27229i = 0.7f;
                }
                if (paint != null) {
                    lq lqVar = new lq(0, e);
                    lqVar.setSize((int) (Math.abs(paint.getFontMetrics().ascent) + Math.abs(paint.getFontMetrics().descent)));
                    spannableStringBuilder.setSpan(lqVar, 0, 1, 33);
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
                tL_forumTopic.f19211id = (int) ((peerDialogId >>> 32) ^ peerDialogId);
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
        zn g10 = g(p2Var, j10, tL_forumTopic, i10, new Bundle());
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

    public static void p(p9 p9Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z4, boolean z10, f6 f6Var) {
        int i10;
        ColorFilter n02;
        if (tL_forumTopic != null && p9Var != null) {
            if (tL_forumTopic.f19211id == 1) {
                p9Var.setAnimatedEmojiDrawable(null);
                p9Var.setImageDrawable(c(p9Var.getContext(), 0.75f, j6.v0(j6.f20202v8, f6Var), z10));
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                p9Var.setImageDrawable(null);
                l5 l5Var = p9Var.e;
                if (l5Var == null || tL_forumTopic.icon_emoji_id != l5Var.i()) {
                    if (z10) {
                        i10 = 11;
                    } else {
                        i10 = 10;
                    }
                    l5 l5Var2 = new l5(i10, UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id);
                    if (z4) {
                        n02 = new PorterDuffColorFilter(j6.w0(null, j6.A8, false), PorterDuff.Mode.SRC_IN);
                    } else {
                        n02 = j6.n0(f6Var);
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
        if (lastFragment instanceof zn) {
            zn znVar = (zn) lastFragment;
            if ((-znVar.a()) == j10 && znVar.getMessagesController().getChat(Long.valueOf(j10)).forum && znVar.getParentLayout() != null) {
                if (((ActionBarLayout) znVar.getParentLayout()).j()) {
                    AndroidUtilities.runOnUIThread(new c(znVar, 0), 500L);
                } else {
                    sf1.I0(znVar);
                }
            }
        }
        if (lastFragment instanceof sf1) {
            sf1 sf1Var = (sf1) lastFragment;
            long j11 = sf1Var.f38175a;
            if ((-(-j11)) == j10 && !sf1Var.getMessagesController().getChat(Long.valueOf(j10)).forum) {
                if (sf1Var.getParentLayout() != null && ((ActionBarLayout) sf1Var.getParentLayout()).j()) {
                    AndroidUtilities.runOnUIThread(new d(sf1Var, 0), 500L);
                    return;
                }
                sf1Var.E = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j11);
                zn znVar2 = new zn(bundle);
                znVar2.f40598ga = true;
                sf1Var.presentFragment(znVar2);
            }
        }
    }
}
