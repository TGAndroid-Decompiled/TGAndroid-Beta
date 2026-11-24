package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
public abstract class mm4 {
    public static final int a = 0;

    public static void a(mu1 mu1Var, zc7 zc7Var) {
        TLRPC.TL_forumTopic f;
        if (zc7Var.b != 0 && (f = mu1Var.getMessagesController().g4.f(-zc7Var.a, zc7Var.b)) != null) {
            if (zc7Var.a > 0) {
                if (l7c.w(mu1Var.getMessagesController().V1(Long.valueOf(zc7Var.a)))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new k27(mu1Var.getCurrentAccount(), f.topicStartMessage, false, false));
                    mu1Var.Db(arrayList, null, f.id, f.read_inbox_max_id, f.read_outbox_max_id, f);
                    mu1Var.getMessagesController().P4(-zc7Var.a, zc7Var.b);
                    return;
                }
                return;
            }
            TLRPC.Chat K0 = mu1Var.getMessagesController().K0(Long.valueOf(-zc7Var.a));
            if (K0 == null) {
                return;
            }
            if (hc2.p0(K0)) {
                if (hc2.A(y6c.t0, K0, 24)) {
                    int i = f.read_inbox_max_id;
                    int i2 = f.read_outbox_max_id;
                    mu1Var.A4 = i;
                    mu1Var.B4 = i2;
                    mu1Var.C4 = Math.max(1, i);
                    mu1Var.s4 = cf3.n(f.from_id);
                    mu1Var.Vc();
                    mu1Var.nd(false);
                    mu1Var.Dc(false);
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new k27(mu1Var.getCurrentAccount(), f.topicStartMessage, false, false));
                mu1Var.Db(arrayList2, K0, f.id, f.read_inbox_max_id, f.read_outbox_max_id, f);
            }
            mu1Var.getMessagesController().P4(-zc7Var.a, zc7Var.b);
        }
    }

    public static void b(k27 k27Var) {
        TLRPC.TL_forumTopic f;
        TLRPC.Message message = k27Var.k;
        int i = k27Var.K1;
        if (k27.B0(message) <= 0 && (f = na7.q1(i).g4.f(-k27.B0(k27Var.k), k27.b2(i, k27Var.k, true, false))) != null) {
            Drawable drawable = k27Var.i2[0];
            if (drawable instanceof jm4) {
                ((jm4) drawable).b(f.icon_color);
            }
        }
    }

    public static SpannableStringBuilder c(TLRPC.TL_forumTopic tL_forumTopic, k27 k27Var) {
        TLRPC.Chat K0;
        TLRPC.User user;
        String str;
        int i;
        int i2;
        if (tL_forumTopic != null) {
            TLRPC.MessageAction messageAction = k27Var.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionTopicCreate) {
                return gl.G2(k96.M0(2131743762, null), k(tL_forumTopic, null, null), "%s");
            }
            if (messageAction instanceof TLRPC.TL_messageActionTopicEdit) {
                TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction;
                long Z0 = k27Var.Z0();
                boolean D = cf3.D(Z0);
                int i3 = k27Var.K1;
                if (D) {
                    user = na7.q1(i3).V1(Long.valueOf(Z0));
                    K0 = null;
                } else {
                    K0 = na7.q1(i3).K0(Long.valueOf(-Z0));
                    user = null;
                }
                if (user != null) {
                    str = qu2.m(0, user.first_name, user.last_name);
                } else if (K0 != null) {
                    str = K0.title;
                } else {
                    str = null;
                }
                int i4 = tL_messageActionTopicEdit.flags;
                if ((i4 & 8) != 0) {
                    if (tL_messageActionTopicEdit.hidden) {
                        i2 = 2131743780;
                    } else {
                        i2 = 2131743766;
                    }
                    return gl.G2(k96.M0(i2, null), str, "%s");
                } else if ((i4 & 4) != 0) {
                    if (tL_messageActionTopicEdit.closed) {
                        i = 2131743763;
                    } else {
                        i = 2131743758;
                    }
                    return gl.G2(gl.G2(k96.M0(i, null), k(tL_forumTopic, null, null), "%2$s"), str, "%1$s");
                } else {
                    int i5 = i4 & 1;
                    int i6 = i4 & 2;
                    if (i5 != 0) {
                        if (i6 != 0) {
                            TLRPC.TL_forumTopic tL_forumTopic2 = new TLRPC.TL_forumTopic();
                            tL_forumTopic2.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                            tL_forumTopic2.title = tL_messageActionTopicEdit.title;
                            return gl.G2(gl.G2(k96.M0(2131743759, null), k(tL_forumTopic2, null, null), "%2$s"), str, "%1$s");
                        }
                        return gl.G2(gl.G2(k96.M0(2131743760, null), tL_messageActionTopicEdit.title, "%2$s"), str, "%1$s");
                    } else if (i6 != 0) {
                        TLRPC.TL_forumTopic tL_forumTopic3 = new TLRPC.TL_forumTopic();
                        tL_forumTopic3.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                        tL_forumTopic3.title = "";
                        return gl.G2(gl.G2(k96.M0(2131743761, null), k(tL_forumTopic3, null, null), "%2$s"), str, "%1$s");
                    }
                }
            }
        }
        return null;
    }

    public static lm4 d(Context context, float f, int i, boolean z) {
        int i2;
        if (context == null) {
            return null;
        }
        ?? drawable = new Drawable();
        Resources resources = context.getResources();
        if (z) {
            i2 = 2131232150;
        } else {
            i2 = 2131232149;
        }
        drawable.a = resources.getDrawable(i2).mutate();
        drawable.b = f;
        drawable.a(i);
        return drawable;
    }

    public static fm2 e(int i, String str) {
        String str2;
        jm4 jm4Var = new jm4(i);
        o06 o06Var = new o06(1, null);
        String trim = str.trim();
        if (trim.length() >= 1) {
            str2 = trim.substring(0, 1).toUpperCase();
        } else {
            str2 = "";
        }
        o06Var.a(str2);
        fm2 fm2Var = new fm2(jm4Var, o06Var, 0, 0);
        fm2Var.x = true;
        return fm2Var;
    }

    public static fm2 f(TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic == null) {
            return null;
        }
        return e(tL_forumTopic.icon_color, tL_forumTopic.title);
    }

    public static void g(ArrayList arrayList, long j) {
        if (arrayList != null) {
            int i = 0;
            while (i < arrayList.size()) {
                if (j != k27.b2(((k27) arrayList.get(i)).K1, ((k27) arrayList.get(i)).k, true, false)) {
                    arrayList.remove(i);
                    i--;
                }
                i++;
            }
        }
    }

    public static mu1 h(d dVar, long j, TLRPC.TL_forumTopic tL_forumTopic, int i, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic f;
        if (dVar != null && tL_forumTopic != null) {
            TLRPC.Chat K0 = dVar.getMessagesController().K0(Long.valueOf(j));
            bundle.putLong("chat_id", j);
            if (i != 0) {
                bundle.putInt("message_id", i);
            } else if (tL_forumTopic.read_inbox_max_id == 0) {
                bundle.putInt("message_id", tL_forumTopic.id);
            }
            bundle.putInt("unread_count", tL_forumTopic.unread_count);
            bundle.putBoolean("historyPreloaded", false);
            mu1 mu1Var = new mu1(bundle);
            TLRPC.Message message = tL_forumTopic.topicStartMessage;
            if (message == null && (f = dVar.getMessagesController().g4.f(j, tL_forumTopic.id)) != null) {
                message = f.topicStartMessage;
                tL_forumTopic2 = f;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new k27(dVar.getCurrentAccount(), message, false, false));
                mu1Var.Db(arrayList, K0, tL_forumTopic2.id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                if (i != 0) {
                    mu1Var.d8 = i;
                }
                return mu1Var;
            }
            return null;
        }
        return null;
    }

    public static String i(int i, long j) {
        return j(i, na7.q1(i).K0(Long.valueOf(-j)), true);
    }

    public static String j(int i, TLRPC.Chat chat, boolean z) {
        if (hc2.p0(chat)) {
            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(chat.linked_monoforum_id));
            if (K0 != null) {
                String str = K0.title;
                if (z) {
                    return str;
                }
                return k96.a0(null, null, 2131748154, str);
            }
        } else if (chat != null && chat.linked_monoforum_id != 0) {
            String str2 = chat.title;
            if (z) {
                return str2;
            }
            return k96.a0(null, null, 2131748154, str2);
        }
        if (chat == null) {
            return null;
        }
        return chat.title;
    }

    public static CharSequence k(TLRPC.ForumTopic forumTopic, TextPaint textPaint, Drawable[] drawableArr) {
        int color;
        int textSize;
        int textSize2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (forumTopic instanceof TLRPC.TL_forumTopic) {
            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) forumTopic;
            Paint.FontMetricsInt fontMetricsInt = null;
            if (tL_forumTopic.id == 1) {
                try {
                    Context context = a.b;
                    if (textPaint == null) {
                        color = bkb.w0(null, bkb.qd, false);
                    } else {
                        color = textPaint.getColor();
                    }
                    lm4 d = d(context, 1.0f, color, false);
                    if (textPaint == null) {
                        textSize = gl.L(14.0f);
                    } else {
                        textSize = (int) textPaint.getTextSize();
                    }
                    if (textPaint == null) {
                        textSize2 = gl.L(14.0f);
                    } else {
                        textSize2 = (int) textPaint.getTextSize();
                    }
                    d.setBounds(0, 0, textSize, textSize2);
                    spannableStringBuilder.append((CharSequence) " ");
                    if (drawableArr != null) {
                        drawableArr[0] = d;
                    }
                    spannableStringBuilder.setSpan(new ImageSpan(d, 2), 0, 1, 33);
                } catch (Exception unused) {
                }
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                spannableStringBuilder.append((CharSequence) " ");
                long j = tL_forumTopic.icon_emoji_id;
                if (textPaint != null) {
                    fontMetricsInt = textPaint.getFontMetricsInt();
                }
                gm gmVar = new gm(j, 0.95f, fontMetricsInt);
                spannableStringBuilder.setSpan(gmVar, 0, 1, 33);
                gmVar.top = true;
                gmVar.cacheType = 13;
            } else {
                spannableStringBuilder.append((CharSequence) " ");
                fm2 f = f(tL_forumTopic);
                if (drawableArr != null) {
                    drawableArr[0] = f.a;
                }
                f.setBounds(0, 0, (int) (f.getIntrinsicWidth() * 0.65f), (int) (f.getIntrinsicHeight() * 0.65f));
                Drawable drawable = f.b;
                if (drawable instanceof o06) {
                    ((o06) drawable).i = 0.7f;
                }
                if (textPaint != null) {
                    cm2 cm2Var = new cm2(0, f);
                    cm2Var.c((int) (Math.abs(textPaint.getFontMetrics().ascent) + Math.abs(textPaint.getFontMetrics().descent)));
                    spannableStringBuilder.setSpan(cm2Var, 0, 1, 33);
                } else {
                    spannableStringBuilder.setSpan(new ImageSpan(f), 0, 1, 33);
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

    public static boolean l(k27 k27Var) {
        if (k27Var != null && (k27Var.k.action instanceof TLRPC.TL_messageActionTopicCreate)) {
            return true;
        }
        return false;
    }

    public static ArrayList m(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TLRPC.savedDialog saveddialog = (TLRPC.savedDialog) obj;
            if (saveddialog instanceof TLRPC.TL_monoForumDialog) {
                TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) saveddialog;
                long n = cf3.n(tL_monoForumDialog.peer);
                TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                tL_forumTopic.id = (int) ((n >>> 32) ^ n);
                tL_forumTopic.title = Long.toString(n);
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

    public static void n(d dVar, long j, TLRPC.TL_forumTopic tL_forumTopic, int i) {
        mu1 h = h(dVar, j, tL_forumTopic, i, new Bundle());
        if (h != null) {
            dVar.presentFragment(h);
        }
    }

    public static void o(int i, TLRPC.Chat chat, pb0 pb0Var, be0 be0Var) {
        TLObject tLObject;
        if (hc2.p0(chat)) {
            tLObject = na7.q1(i).K0(Long.valueOf(chat.linked_monoforum_id));
        } else {
            tLObject = null;
        }
        if (tLObject != null) {
            chat = tLObject;
        }
        pb0Var.p(chat);
        be0Var.f(tLObject, pb0Var);
    }

    public static void p(int i, TLRPC.Chat chat, pb0 pb0Var, ImageReceiver imageReceiver) {
        TLRPC.Chat chat2;
        if (hc2.p0(chat)) {
            chat2 = na7.q1(i).K0(Long.valueOf(chat.linked_monoforum_id));
        } else {
            chat2 = null;
        }
        if (chat2 != null) {
            chat = chat2;
        }
        pb0Var.p(chat);
        imageReceiver.U(chat2, pb0Var, null);
    }

    public static void q(be0 be0Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z, boolean z2, wjb wjbVar) {
        int i;
        ColorFilter n0;
        if (tL_forumTopic != null && be0Var != null) {
            if (tL_forumTopic.id == 1) {
                be0Var.setAnimatedEmojiDrawable(null);
                Context context = be0Var.getContext();
                int i2 = bkb.u8;
                lm4 d = d(context, 0.75f, bkb.v0(i2, wjbVar), z2);
                be0Var.setImageDrawable(d);
                if (d != null) {
                    zkb.x(be0Var, d, i2, wjbVar, PorterDuff.Mode.MULTIPLY);
                }
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                be0Var.setImageDrawable(null);
                vl vlVar = be0Var.e;
                if (vlVar == null || tL_forumTopic.icon_emoji_id != vlVar.h()) {
                    if (z2) {
                        i = 11;
                    } else {
                        i = 10;
                    }
                    vl vlVar2 = new vl(i, y6c.t0, tL_forumTopic.icon_emoji_id);
                    if (z) {
                        n0 = new PorterDuffColorFilter(bkb.w0(null, bkb.z8, false), PorterDuff.Mode.SRC_IN);
                    } else {
                        n0 = bkb.n0(wjbVar);
                    }
                    vlVar2.setColorFilter(n0);
                    be0Var.setAnimatedEmojiDrawable(vlVar2);
                }
            } else {
                be0Var.setAnimatedEmojiDrawable(null);
                be0Var.setImageDrawable(f(tL_forumTopic));
            }
        }
    }

    public static void r(long j, ActionBarLayout actionBarLayout) {
        d lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof mu1) {
            mu1 mu1Var = (mu1) lastFragment;
            if ((-mu1Var.a()) == j && mu1Var.getMessagesController().K0(Long.valueOf(j)).forum && mu1Var.getParentLayout() != null) {
                if (((ActionBarLayout) mu1Var.getParentLayout()).h()) {
                    gl.d3(new ho1(mu1Var, (byte) 13), 500L);
                } else {
                    qvb.L0(mu1Var);
                }
            }
        }
        if (lastFragment instanceof qvb) {
            qvb qvbVar = (qvb) lastFragment;
            long j2 = qvbVar.a;
            if ((-(-j2)) == j && !qvbVar.getMessagesController().K0(Long.valueOf(j)).forum) {
                if (qvbVar.getParentLayout() != null && ((ActionBarLayout) qvbVar.getParentLayout()).h()) {
                    gl.d3(new km4(qvbVar, (byte) 0), 500L);
                    return;
                }
                qvbVar.I = true;
                mu1 mu1Var2 = new mu1(ls6.k(j2, "chat_id"));
                mu1Var2.Ga = true;
                qvbVar.presentFragment(mu1Var2);
            }
        }
    }
}
