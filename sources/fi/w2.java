package fi;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ri;
import org.telegram.messenger.x10;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
public final class w2 implements x10 {
    public final int f12715a = 1;
    public final boolean f12716b;
    public final Object f12717c;
    public final Object d;
    public final Object f12718e;

    public w2(x2 x2Var, boolean z10, ch.p0 p0Var, View view) {
        this.f12717c = x2Var;
        this.f12716b = z10;
        this.d = p0Var;
        this.f12718e = view;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        ch.l0 l0Var;
        TLRPC.Document e10;
        lc lcVar;
        int i10;
        int i11;
        int i12;
        int i13 = this.f12715a;
        boolean z10 = this.f12716b;
        Object obj2 = this.f12718e;
        Object obj3 = this.d;
        Object obj4 = this.f12717c;
        switch (i13) {
            case 0:
                x2 x2Var = (x2) obj4;
                ch.p0 p0Var = (ch.p0) obj3;
                View view = (View) obj2;
                Long l10 = (Long) obj;
                z3 z3Var = x2Var.f12761a;
                if (z10 && p0Var.f5504f != null) {
                    try {
                        z3Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    i7 = 0;
                    l0Var = new ch.l0(view.getContext(), null, z3Var.P1, null, view, z3Var.getMeasuredWidth() / 2.0f, z3Var.getMeasuredHeight() / 2.0f, p0Var, z3Var.f12888m2, 0, true);
                } else {
                    i7 = 0;
                    l0Var = new ch.l0(view.getContext(), null, z3Var.P1, null, view, z3Var.getMeasuredWidth() / 2.0f, z3Var.getMeasuredHeight() / 2.0f, p0Var, z3Var.f12888m2, 2, true);
                    p0Var = p0Var;
                }
                ch.l0.B = l0Var;
                ch.i0 i0Var = l0Var.f5435i;
                i0Var.setTag(2131296593, 1);
                z3Var.addView(i0Var);
                x3 x3Var = z3Var.f12934y1;
                l0Var.f5445s = true;
                l0Var.f5450y = System.currentTimeMillis();
                if (p0Var.f5504f != null) {
                    e10 = ri.d0(z3Var.f12888m2).V(p0Var.f5504f);
                    xy a10 = xy.a(z3Var.l1, p0Var.f5504f);
                    a10.H = x3Var.f12762a;
                    a10.Q = l10.longValue();
                    zy.C(z3Var.f12888m2).r0(a10);
                } else {
                    e10 = org.telegram.ui.Components.p5.e(z3Var.f12888m2, p0Var.f5505g);
                    String V = fj.V(e10, null, null);
                    if (V == null) {
                        if (z3Var.P1.getReactionsWindow() != null) {
                            z3Var.P1.getReactionsWindow().e();
                        }
                        z3Var.q0();
                        return;
                    }
                    xy a11 = xy.a(z3Var.l1, V);
                    a11.f28082w = new ArrayList();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = p0Var.f5505g;
                    tL_messageEntityCustomEmoji.offset = i7;
                    tL_messageEntityCustomEmoji.length = V.length();
                    a11.f28082w.add(tL_messageEntityCustomEmoji);
                    a11.H = x3Var.f12762a;
                    a11.Q = l10.longValue();
                    zy.C(z3Var.f12888m2).r0(a11);
                }
                if (l10.longValue() <= 0) {
                    gc r10 = new lc(z3Var.M0, z3Var.f12884l0).r(e10, gd.N0(2131746193, null), gd.N0(2131743309, null), new f2.a(x2Var, 7));
                    r10.f35508j = 5000;
                    r10.j();
                }
                if (z3Var.P1.getReactionsWindow() != null) {
                    z3Var.P1.getReactionsWindow().e();
                }
                z3Var.q0();
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                z3 z3Var2 = ((r3) obj4).f12529x;
                c3 c3Var = z3Var2.M0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    boolean z11 = z3Var2.f12887m1;
                    i10 = 2131623980;
                    if (z11) {
                        lc lcVar2 = new lc(c3Var, h6Var);
                        if (z10) {
                            i10 = 2131623990;
                        }
                        if (z10) {
                            i12 = 2131744341;
                        } else {
                            i12 = 2131744486;
                        }
                        lcVar2.Q(i10, 36, gd.N0(i12, null)).j();
                        return;
                    } else if (z10) {
                        new lc(c3Var, h6Var).I(2131623990, gd.N0(2131744343, null), gd.N0(2131744342, null)).j();
                        return;
                    } else {
                        lcVar = new lc(c3Var, h6Var);
                        i11 = 2131744213;
                    }
                } else {
                    lcVar = new lc(c3Var, h6Var);
                    i10 = 2131624012;
                    i11 = 2131743636;
                }
                org.telegram.messenger.f3.n(null, i11, lcVar, i10, 36);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i14 = ChatActivityEnterView.f32566s7;
                ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                bi.n3 n3Var = new bi.n3(chatActivityEnterView.getContext(), chatActivityEnterView.R, ((TLRPC.User) obj2).f28580id, wg.s.c(wg.s.b(1, (List) obj)), null);
                n3Var.g1(z10);
                n3Var.show();
                return;
        }
    }

    public w2(r3 r3Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f12717c = r3Var;
        this.d = storyItem;
        this.f12716b = z10;
        this.f12718e = h6Var;
    }

    public w2(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.t1 t1Var, TLRPC.User user, boolean z10) {
        this.f12717c = chatActivityEnterView;
        this.d = t1Var;
        this.f12718e = user;
        this.f12716b = z10;
    }
}
