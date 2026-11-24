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
public abstract class no4 {
    public static final int a = 0;

    public static void a(yv1 yv1Var, bf7 bf7Var) {
        TLRPC.TL_forumTopic f;
        if (bf7Var.b != 0 && (f = yv1Var.getMessagesController().g4.f(-bf7Var.a, bf7Var.b)) != null) {
            if (bf7Var.a > 0) {
                if (m9c.w(yv1Var.getMessagesController().W1(Long.valueOf(bf7Var.a)))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new k47(yv1Var.getCurrentAccount(), f.topicStartMessage, false, false));
                    yv1Var.Nb(arrayList, null, f.id, f.read_inbox_max_id, f.read_outbox_max_id, f);
                    yv1Var.getMessagesController().R4(-bf7Var.a, bf7Var.b);
                    return;
                }
                return;
            }
            TLRPC.Chat L0 = yv1Var.getMessagesController().L0(Long.valueOf(-bf7Var.a));
            if (L0 == null) {
                return;
            }
            if (sd2.p0(L0)) {
                if (sd2.A(z8c.t0, L0, 24)) {
                    int i = f.read_inbox_max_id;
                    int i2 = f.read_outbox_max_id;
                    yv1Var.A4 = i;
                    yv1Var.B4 = i2;
                    yv1Var.C4 = Math.max(1, i);
                    yv1Var.s4 = pg3.n(f.from_id);
                    yv1Var.hd();
                    yv1Var.zd(false);
                    yv1Var.Pc(false);
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new k47(yv1Var.getCurrentAccount(), f.topicStartMessage, false, false));
                yv1Var.Nb(arrayList2, L0, f.id, f.read_inbox_max_id, f.read_outbox_max_id, f);
            }
            yv1Var.getMessagesController().R4(-bf7Var.a, bf7Var.b);
        }
    }

    public static void b(k47 k47Var) {
        TLRPC.TL_forumTopic f;
        TLRPC.Message message = k47Var.k;
        int i = k47Var.K1;
        if (k47.B0(message) <= 0 && (f = oc7.r1(i).g4.f(-k47.B0(k47Var.k), k47.b2(i, k47Var.k, true, false))) != null) {
            Drawable drawable = k47Var.i2[0];
            if (drawable instanceof ko4) {
                ((ko4) drawable).b(f.icon_color);
            }
        }
    }

    public static SpannableStringBuilder c(TLRPC.TL_forumTopic tL_forumTopic, k47 k47Var) {
        TLRPC.Chat L0;
        TLRPC.User user;
        String str;
        int i;
        int i2;
        if (tL_forumTopic != null) {
            TLRPC.MessageAction messageAction = k47Var.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionTopicCreate) {
                return gm.G2(jb6.M0(2131743688, null), k(tL_forumTopic, null, null), "%s");
            }
            if (messageAction instanceof TLRPC.TL_messageActionTopicEdit) {
                TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction;
                long Z0 = k47Var.Z0();
                boolean D = pg3.D(Z0);
                int i3 = k47Var.K1;
                if (D) {
                    user = oc7.r1(i3).W1(Long.valueOf(Z0));
                    L0 = null;
                } else {
                    L0 = oc7.r1(i3).L0(Long.valueOf(-Z0));
                    user = null;
                }
                if (user != null) {
                    str = bw2.m(0, user.first_name, user.last_name);
                } else if (L0 != null) {
                    str = L0.title;
                } else {
                    str = null;
                }
                int i4 = tL_messageActionTopicEdit.flags;
                if ((i4 & 8) != 0) {
                    if (tL_messageActionTopicEdit.hidden) {
                        i2 = 2131743706;
                    } else {
                        i2 = 2131743692;
                    }
                    return gm.G2(jb6.M0(i2, null), str, "%s");
                } else if ((i4 & 4) != 0) {
                    if (tL_messageActionTopicEdit.closed) {
                        i = 2131743689;
                    } else {
                        i = 2131743684;
                    }
                    return gm.G2(gm.G2(jb6.M0(i, null), k(tL_forumTopic, null, null), "%2$s"), str, "%1$s");
                } else {
                    int i5 = i4 & 1;
                    int i6 = i4 & 2;
                    if (i5 != 0) {
                        if (i6 != 0) {
                            TLRPC.TL_forumTopic tL_forumTopic2 = new TLRPC.TL_forumTopic();
                            tL_forumTopic2.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                            tL_forumTopic2.title = tL_messageActionTopicEdit.title;
                            return gm.G2(gm.G2(jb6.M0(2131743685, null), k(tL_forumTopic2, null, null), "%2$s"), str, "%1$s");
                        }
                        return gm.G2(gm.G2(jb6.M0(2131743686, null), tL_messageActionTopicEdit.title, "%2$s"), str, "%1$s");
                    } else if (i6 != 0) {
                        TLRPC.TL_forumTopic tL_forumTopic3 = new TLRPC.TL_forumTopic();
                        tL_forumTopic3.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                        tL_forumTopic3.title = "";
                        return gm.G2(gm.G2(jb6.M0(2131743687, null), k(tL_forumTopic3, null, null), "%2$s"), str, "%1$s");
                    }
                }
            }
        }
        return null;
    }

    public static mo4 d(Context context, float f, int i, boolean z) {
        int i2;
        if (context == null) {
            return null;
        }
        ?? drawable = new Drawable();
        Resources resources = context.getResources();
        if (z) {
            i2 = 2131232151;
        } else {
            i2 = 2131232150;
        }
        drawable.a = resources.getDrawable(i2).mutate();
        drawable.b = f;
        drawable.a(i);
        return drawable;
    }

    public static sn2 e(int i, String str) {
        String str2;
        ko4 ko4Var = new ko4(i);
        o26 o26Var = new o26(1, null);
        String trim = str.trim();
        if (trim.length() >= 1) {
            str2 = trim.substring(0, 1).toUpperCase();
        } else {
            str2 = "";
        }
        o26Var.a(str2);
        sn2 sn2Var = new sn2(ko4Var, o26Var, 0, 0);
        sn2Var.x = true;
        return sn2Var;
    }

    public static sn2 f(TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic == null) {
            return null;
        }
        return e(tL_forumTopic.icon_color, tL_forumTopic.title);
    }

    public static void g(ArrayList arrayList, long j) {
        if (arrayList != null) {
            int i = 0;
            while (i < arrayList.size()) {
                if (j != k47.b2(((k47) arrayList.get(i)).K1, ((k47) arrayList.get(i)).k, true, false)) {
                    arrayList.remove(i);
                    i--;
                }
                i++;
            }
        }
    }

    public static yv1 h(d dVar, long j, TLRPC.TL_forumTopic tL_forumTopic, int i, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic f;
        if (dVar != null && tL_forumTopic != null) {
            TLRPC.Chat L0 = dVar.getMessagesController().L0(Long.valueOf(j));
            bundle.putLong("chat_id", j);
            if (i != 0) {
                bundle.putInt("message_id", i);
            } else if (tL_forumTopic.read_inbox_max_id == 0) {
                bundle.putInt("message_id", tL_forumTopic.id);
            }
            bundle.putInt("unread_count", tL_forumTopic.unread_count);
            bundle.putBoolean("historyPreloaded", false);
            yv1 yv1Var = new yv1(bundle);
            TLRPC.Message message = tL_forumTopic.topicStartMessage;
            if (message == null && (f = dVar.getMessagesController().g4.f(j, tL_forumTopic.id)) != null) {
                message = f.topicStartMessage;
                tL_forumTopic2 = f;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new k47(dVar.getCurrentAccount(), message, false, false));
                yv1Var.Nb(arrayList, L0, tL_forumTopic2.id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                if (i != 0) {
                    yv1Var.d8 = i;
                }
                return yv1Var;
            }
            return null;
        }
        return null;
    }

    public static String i(int i, long j) {
        return j(i, oc7.r1(i).L0(Long.valueOf(-j)), true);
    }

    public static String j(int i, TLRPC.Chat chat, boolean z) {
        if (sd2.p0(chat)) {
            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(chat.linked_monoforum_id));
            if (L0 != null) {
                String str = L0.title;
                if (z) {
                    return str;
                }
                return jb6.a0(null, null, 2131748103, str);
            }
        } else if (chat != null && chat.linked_monoforum_id != 0) {
            String str2 = chat.title;
            if (z) {
                return str2;
            }
            return jb6.a0(null, null, 2131748103, str2);
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
                        color = cmb.w0(null, cmb.qd, false);
                    } else {
                        color = textPaint.getColor();
                    }
                    mo4 d = d(context, 1.0f, color, false);
                    if (textPaint == null) {
                        textSize = gm.L(14.0f);
                    } else {
                        textSize = (int) textPaint.getTextSize();
                    }
                    if (textPaint == null) {
                        textSize2 = gm.L(14.0f);
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
                gn gnVar = new gn(j, 0.95f, fontMetricsInt);
                spannableStringBuilder.setSpan(gnVar, 0, 1, 33);
                gnVar.top = true;
                gnVar.cacheType = 13;
            } else {
                spannableStringBuilder.append((CharSequence) " ");
                sn2 f = f(tL_forumTopic);
                if (drawableArr != null) {
                    drawableArr[0] = f.a;
                }
                f.setBounds(0, 0, (int) (f.getIntrinsicWidth() * 0.65f), (int) (f.getIntrinsicHeight() * 0.65f));
                Drawable drawable = f.b;
                if (drawable instanceof o26) {
                    ((o26) drawable).i = 0.7f;
                }
                if (textPaint != null) {
                    pn2 pn2Var = new pn2(0, f);
                    pn2Var.c((int) (Math.abs(textPaint.getFontMetrics().ascent) + Math.abs(textPaint.getFontMetrics().descent)));
                    spannableStringBuilder.setSpan(pn2Var, 0, 1, 33);
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

    public static boolean l(k47 k47Var) {
        if (k47Var != null && (k47Var.k.action instanceof TLRPC.TL_messageActionTopicCreate)) {
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
                long n = pg3.n(tL_monoForumDialog.peer);
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
        yv1 h = h(dVar, j, tL_forumTopic, i, new Bundle());
        if (h != null) {
            dVar.presentFragment(h);
        }
    }

    public static void o(int i, TLRPC.Chat chat, pc0 pc0Var, bf0 bf0Var) {
        TLObject tLObject;
        if (sd2.p0(chat)) {
            tLObject = oc7.r1(i).L0(Long.valueOf(chat.linked_monoforum_id));
        } else {
            tLObject = null;
        }
        if (tLObject != null) {
            chat = tLObject;
        }
        pc0Var.p(chat);
        bf0Var.f(tLObject, pc0Var);
    }

    public static void p(int i, TLRPC.Chat chat, pc0 pc0Var, ImageReceiver imageReceiver) {
        TLRPC.Chat chat2;
        if (sd2.p0(chat)) {
            chat2 = oc7.r1(i).L0(Long.valueOf(chat.linked_monoforum_id));
        } else {
            chat2 = null;
        }
        if (chat2 != null) {
            chat = chat2;
        }
        pc0Var.p(chat);
        imageReceiver.U(chat2, pc0Var, null);
    }

    public static void q(bf0 bf0Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z, boolean z2, ylb ylbVar) {
        int i;
        ColorFilter n0;
        if (tL_forumTopic != null && bf0Var != null) {
            if (tL_forumTopic.id == 1) {
                bf0Var.setAnimatedEmojiDrawable(null);
                Context context = bf0Var.getContext();
                int i2 = cmb.u8;
                mo4 d = d(context, 0.75f, cmb.v0(i2, ylbVar), z2);
                bf0Var.setImageDrawable(d);
                if (d != null) {
                    anb.x(bf0Var, d, i2, ylbVar, PorterDuff.Mode.MULTIPLY);
                }
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                bf0Var.setImageDrawable(null);
                vm vmVar = bf0Var.e;
                if (vmVar == null || tL_forumTopic.icon_emoji_id != vmVar.h()) {
                    if (z2) {
                        i = 11;
                    } else {
                        i = 10;
                    }
                    vm vmVar2 = new vm(i, z8c.t0, tL_forumTopic.icon_emoji_id);
                    if (z) {
                        n0 = new PorterDuffColorFilter(cmb.w0(null, cmb.z8, false), PorterDuff.Mode.SRC_IN);
                    } else {
                        n0 = cmb.n0(ylbVar);
                    }
                    vmVar2.setColorFilter(n0);
                    bf0Var.setAnimatedEmojiDrawable(vmVar2);
                }
            } else {
                bf0Var.setAnimatedEmojiDrawable(null);
                bf0Var.setImageDrawable(f(tL_forumTopic));
            }
        }
    }

    public static void r(long j, ActionBarLayout actionBarLayout) {
        d lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof yv1) {
            yv1 yv1Var = (yv1) lastFragment;
            if ((-yv1Var.a()) == j && yv1Var.getMessagesController().L0(Long.valueOf(j)).forum && yv1Var.getParentLayout() != null) {
                if (((ActionBarLayout) yv1Var.getParentLayout()).h()) {
                    gm.d3(new pp1(yv1Var, (byte) 17), 500L);
                } else {
                    sxb.M0(yv1Var);
                }
            }
        }
        if (lastFragment instanceof sxb) {
            sxb sxbVar = (sxb) lastFragment;
            long j2 = sxbVar.a;
            if ((-(-j2)) == j && !sxbVar.getMessagesController().L0(Long.valueOf(j)).forum) {
                if (sxbVar.getParentLayout() != null && ((ActionBarLayout) sxbVar.getParentLayout()).h()) {
                    gm.d3(new lo4(sxbVar, (byte) 0), 500L);
                    return;
                }
                sxbVar.I = true;
                yv1 yv1Var2 = new yv1(kt6.k(j2, "chat_id"));
                yv1Var2.Ga = true;
                sxbVar.presentFragment(yv1Var2);
            }
        }
    }
}
