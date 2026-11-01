package gg;

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.hs;
import org.telegram.messenger.i0;
import org.telegram.messenger.i20;
import org.telegram.messenger.kj;
import org.telegram.messenger.o5;
import org.telegram.messenger.w0;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.z70;
import org.telegram.ui.nb1;
import org.telegram.ui.un;
public abstract class e {
    public static final int f7508a = 0;

    static {
        new SparseArray();
    }

    public static void a(un unVar, hs hsVar) {
        TLRPC.TL_forumTopic f7;
        if (hsVar.f16110b != 0 && (f7 = unVar.getMessagesController().f19234r7.f(-hsVar.f16109a, hsVar.f16110b)) != null) {
            if (hsVar.f16109a > 0) {
                if (i20.u(unVar.getMessagesController().Z1(Long.valueOf(hsVar.f16109a)))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new kj(unVar.getCurrentAccount(), f7.topicStartMessage, false, false));
                    unVar.Mb(arrayList, null, f7.f19846id, f7.read_inbox_max_id, f7.read_outbox_max_id, f7);
                    unVar.getMessagesController().G4(-hsVar.f16109a, hsVar.f16110b);
                    return;
                }
                return;
            }
            TLRPC.Chat L0 = unVar.getMessagesController().L0(Long.valueOf(-hsVar.f16109a));
            if (L0 == null) {
                return;
            }
            if (w3.p0(L0)) {
                if (w3.A(e20.f15506s0, L0, 24)) {
                    int i10 = f7.read_inbox_max_id;
                    int i11 = f7.read_outbox_max_id;
                    unVar.f42294y4 = i10;
                    unVar.f42307z4 = i11;
                    unVar.A4 = Math.max(1, i10);
                    unVar.f42205r4 = o5.o(f7.from_id);
                    unVar.Yc();
                    unVar.qd(false);
                    unVar.Gc(false);
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new kj(unVar.getCurrentAccount(), f7.topicStartMessage, false, false));
                unVar.Mb(arrayList2, L0, f7.f19846id, f7.read_inbox_max_id, f7.read_outbox_max_id, f7);
            }
            unVar.getMessagesController().G4(-hsVar.f16109a, hsVar.f16110b);
        }
    }

    public static void b(kj kjVar) {
        TLRPC.TL_forumTopic f7;
        TLRPC.Message message = kjVar.f16690k;
        int i10 = kjVar.I1;
        if (kj.B0(message) <= 0 && (f7 = wp.r1(i10).f19234r7.f(-kj.B0(kjVar.f16690k), kj.c2(i10, kjVar.f16690k, true, false))) != null) {
            Drawable drawable = kjVar.f16677g2[0];
            if (drawable instanceof a) {
                ((a) drawable).b(f7.icon_color);
            }
        }
    }

    public static d c(Context context, float f7, int i10, boolean z10) {
        int i11;
        if (context == null) {
            return null;
        }
        ?? drawable = new Drawable();
        Resources resources = context.getResources();
        if (z10) {
            i11 = 2131232144;
        } else {
            i11 = 2131232143;
        }
        drawable.f7505a = resources.getDrawable(i11).mutate();
        drawable.f7506b = f7;
        drawable.a(i10);
        return drawable;
    }

    public static eq d(int i10, String str) {
        String str2;
        a aVar = new a(i10);
        z70 z70Var = new z70(1, null);
        String trim = str.trim();
        if (trim.length() >= 1) {
            str2 = trim.substring(0, 1).toUpperCase();
        } else {
            str2 = "";
        }
        z70Var.a(str2);
        eq eqVar = new eq(aVar, z70Var, 0, 0);
        eqVar.f25909x = true;
        return eqVar;
    }

    public static eq e(TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic == null) {
            return null;
        }
        return d(tL_forumTopic.icon_color, tL_forumTopic.title);
    }

    public static void f(ArrayList arrayList, long j10) {
        if (arrayList != null) {
            int i10 = 0;
            while (i10 < arrayList.size()) {
                if (j10 != kj.c2(((kj) arrayList.get(i10)).I1, ((kj) arrayList.get(i10)).f16690k, true, false)) {
                    arrayList.remove(i10);
                    i10--;
                }
                i10++;
            }
        }
    }

    public static un g(k2 k2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i10, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic f7;
        if (k2Var != null && tL_forumTopic != null) {
            TLRPC.Chat L0 = k2Var.getMessagesController().L0(Long.valueOf(j10));
            bundle.putLong("chat_id", j10);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            } else if (tL_forumTopic.read_inbox_max_id == 0) {
                bundle.putInt("message_id", tL_forumTopic.f19846id);
            }
            bundle.putInt("unread_count", tL_forumTopic.unread_count);
            bundle.putBoolean("historyPreloaded", false);
            un unVar = new un(bundle);
            TLRPC.Message message = tL_forumTopic.topicStartMessage;
            if (message == null && (f7 = k2Var.getMessagesController().f19234r7.f(j10, tL_forumTopic.f19846id)) != null) {
                message = f7.topicStartMessage;
                tL_forumTopic2 = f7;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new kj(k2Var.getCurrentAccount(), message, false, false));
                unVar.Mb(arrayList, L0, tL_forumTopic2.f19846id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                if (i10 != 0) {
                    unVar.f42011b8 = i10;
                }
                return unVar;
            }
            return null;
        }
        return null;
    }

    public static String h(int i10, long j10) {
        return i(i10, wp.r1(i10).L0(Long.valueOf(-j10)), true);
    }

    public static String i(int i10, TLRPC.Chat chat, boolean z10) {
        if (w3.p0(chat)) {
            TLRPC.Chat L0 = wp.r1(i10).L0(Long.valueOf(chat.linked_monoforum_id));
            if (L0 != null) {
                String str = L0.title;
                if (z10) {
                    return str;
                }
                return dd.a0(null, null, 2131748361, str);
            }
        } else if (chat != null && chat.linked_monoforum_id != 0) {
            String str2 = chat.title;
            if (z10) {
                return str2;
            }
            return dd.a0(null, null, 2131748361, str2);
        }
        if (chat == null) {
            return null;
        }
        return chat.title;
    }

    public static CharSequence j(TLRPC.ForumTopic forumTopic, Paint paint, Drawable[] drawableArr) {
        int color;
        int textSize;
        int textSize2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (forumTopic instanceof TLRPC.TL_forumTopic) {
            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) forumTopic;
            Paint.FontMetricsInt fontMetricsInt = null;
            if (tL_forumTopic.f19846id == 1) {
                try {
                    Context context = w0.f18945b;
                    if (paint == null) {
                        color = t6.x0(null, t6.f21142od, false);
                    } else {
                        color = paint.getColor();
                    }
                    d c10 = c(context, 1.0f, color, false);
                    if (paint == null) {
                        textSize = i0.L(14.0f);
                    } else {
                        textSize = (int) paint.getTextSize();
                    }
                    if (paint == null) {
                        textSize2 = i0.L(14.0f);
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
                org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(j10, 0.95f, fontMetricsInt);
                spannableStringBuilder.setSpan(o5Var, 0, 1, 33);
                o5Var.top = true;
                o5Var.cacheType = 13;
            } else {
                spannableStringBuilder.append((CharSequence) " ");
                eq e = e(tL_forumTopic);
                if (drawableArr != null) {
                    drawableArr[0] = e.f25901a;
                }
                e.setBounds(0, 0, (int) (e.getIntrinsicWidth() * 0.65f), (int) (e.getIntrinsicHeight() * 0.65f));
                Drawable drawable = e.f25902b;
                if (drawable instanceof z70) {
                    ((z70) drawable).f33064i = 0.7f;
                }
                if (paint != null) {
                    dq dqVar = new dq(0, e);
                    dqVar.c((int) (Math.abs(paint.getFontMetrics().ascent) + Math.abs(paint.getFontMetrics().descent)));
                    spannableStringBuilder.setSpan(dqVar, 0, 1, 33);
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

    public static boolean k(kj kjVar) {
        if (kjVar != null && (kjVar.f16690k.action instanceof TLRPC.TL_messageActionTopicCreate)) {
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
                long o10 = o5.o(tL_monoForumDialog.peer);
                TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                tL_forumTopic.f19846id = (int) ((o10 >>> 32) ^ o10);
                tL_forumTopic.title = Long.toString(o10);
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

    public static void m(k2 k2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i10) {
        un g10 = g(k2Var, j10, tL_forumTopic, i10, new Bundle());
        if (g10 != null) {
            k2Var.presentFragment(g10);
        }
    }

    public static void n(int i10, TLRPC.Chat chat, r8 r8Var, ImageReceiver imageReceiver) {
        TLRPC.Chat chat2;
        if (w3.p0(chat)) {
            chat2 = wp.r1(i10).L0(Long.valueOf(chat.linked_monoforum_id));
        } else {
            chat2 = null;
        }
        if (chat2 != null) {
            chat = chat2;
        }
        r8Var.q(chat);
        imageReceiver.i0(chat2, r8Var, null);
    }

    public static void o(int i10, TLRPC.Chat chat, r8 r8Var, g9 g9Var) {
        TLObject tLObject;
        if (w3.p0(chat)) {
            tLObject = wp.r1(i10).L0(Long.valueOf(chat.linked_monoforum_id));
        } else {
            tLObject = null;
        }
        if (tLObject != null) {
            chat = tLObject;
        }
        r8Var.q(chat);
        g9Var.e(tLObject, r8Var);
    }

    public static void p(g9 g9Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11, p6 p6Var) {
        int i10;
        ColorFilter o02;
        if (tL_forumTopic != null && g9Var != null) {
            if (tL_forumTopic.f19846id == 1) {
                g9Var.setAnimatedEmojiDrawable(null);
                Context context = g9Var.getContext();
                int i11 = t6.f21262v8;
                d c10 = c(context, 0.75f, t6.w0(i11, p6Var), z11);
                g9Var.setImageDrawable(c10);
                if (c10 != null) {
                    a7.y(g9Var, c10, i11, p6Var, PorterDuff.Mode.MULTIPLY);
                }
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                g9Var.setImageDrawable(null);
                f5 f5Var = g9Var.e;
                if (f5Var == null || tL_forumTopic.icon_emoji_id != f5Var.h()) {
                    if (z11) {
                        i10 = 11;
                    } else {
                        i10 = 10;
                    }
                    f5 f5Var2 = new f5(i10, e20.f15506s0, tL_forumTopic.icon_emoji_id);
                    if (z10) {
                        o02 = new PorterDuffColorFilter(t6.x0(null, t6.A8, false), PorterDuff.Mode.SRC_IN);
                    } else {
                        o02 = t6.o0(p6Var);
                    }
                    f5Var2.setColorFilter(o02);
                    g9Var.setAnimatedEmojiDrawable(f5Var2);
                }
            } else {
                g9Var.setAnimatedEmojiDrawable(null);
                g9Var.setImageDrawable(e(tL_forumTopic));
            }
        }
    }

    public static void q(long j10, ActionBarLayout actionBarLayout) {
        k2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof un) {
            un unVar = (un) lastFragment;
            if ((-unVar.a()) == j10 && unVar.getMessagesController().L0(Long.valueOf(j10)).forum && unVar.getParentLayout() != null) {
                if (((ActionBarLayout) unVar.getParentLayout()).i()) {
                    i0.h3(new b(unVar, 0), 500L);
                } else {
                    nb1.M0(unVar);
                }
            }
        }
        if (lastFragment instanceof nb1) {
            nb1 nb1Var = (nb1) lastFragment;
            long j11 = nb1Var.f39797a;
            if ((-(-j11)) == j10 && !nb1Var.getMessagesController().L0(Long.valueOf(j10)).forum) {
                if (nb1Var.getParentLayout() != null && ((ActionBarLayout) nb1Var.getParentLayout()).i()) {
                    i0.h3(new c(nb1Var, 0), 500L);
                    return;
                }
                nb1Var.H = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j11);
                un unVar2 = new un(bundle);
                unVar2.Ca = true;
                nb1Var.presentFragment(unVar2);
            }
        }
    }
}
