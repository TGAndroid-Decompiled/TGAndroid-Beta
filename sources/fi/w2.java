package fi;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.az;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.si;
import org.telegram.messenger.y10;
import org.telegram.messenger.yy;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
public final class w2 implements y10 {
    public final int f12718a = 1;
    public final boolean f12719b;
    public final Object f12720c;
    public final Object d;
    public final Object f12721e;

    public w2(x2 x2Var, boolean z10, ch.p0 p0Var, View view) {
        this.f12720c = x2Var;
        this.f12719b = z10;
        this.d = p0Var;
        this.f12721e = view;
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
        int i13 = this.f12718a;
        boolean z10 = this.f12719b;
        Object obj2 = this.f12721e;
        Object obj3 = this.d;
        Object obj4 = this.f12720c;
        switch (i13) {
            case 0:
                x2 x2Var = (x2) obj4;
                ch.p0 p0Var = (ch.p0) obj3;
                View view = (View) obj2;
                Long l10 = (Long) obj;
                z3 z3Var = x2Var.f12764a;
                if (z10 && p0Var.f5507f != null) {
                    try {
                        z3Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    i7 = 0;
                    l0Var = new ch.l0(view.getContext(), null, z3Var.P1, null, view, z3Var.getMeasuredWidth() / 2.0f, z3Var.getMeasuredHeight() / 2.0f, p0Var, z3Var.f12891m2, 0, true);
                } else {
                    i7 = 0;
                    l0Var = new ch.l0(view.getContext(), null, z3Var.P1, null, view, z3Var.getMeasuredWidth() / 2.0f, z3Var.getMeasuredHeight() / 2.0f, p0Var, z3Var.f12891m2, 2, true);
                    p0Var = p0Var;
                }
                ch.l0.B = l0Var;
                ch.i0 i0Var = l0Var.f5438i;
                i0Var.setTag(2131296593, 1);
                z3Var.addView(i0Var);
                x3 x3Var = z3Var.f12937y1;
                l0Var.f5448s = true;
                l0Var.f5453y = System.currentTimeMillis();
                if (p0Var.f5507f != null) {
                    e10 = si.d0(z3Var.f12891m2).V(p0Var.f5507f);
                    yy a10 = yy.a(z3Var.l1, p0Var.f5507f);
                    a10.H = x3Var.f12765a;
                    a10.Q = l10.longValue();
                    az.C(z3Var.f12891m2).r0(a10);
                } else {
                    e10 = org.telegram.ui.Components.p5.e(z3Var.f12891m2, p0Var.f5508g);
                    String V = gj.V(e10, null, null);
                    if (V == null) {
                        if (z3Var.P1.getReactionsWindow() != null) {
                            z3Var.P1.getReactionsWindow().e();
                        }
                        z3Var.q0();
                        return;
                    }
                    yy a11 = yy.a(z3Var.l1, V);
                    a11.f28266w = new ArrayList();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = p0Var.f5508g;
                    tL_messageEntityCustomEmoji.offset = i7;
                    tL_messageEntityCustomEmoji.length = V.length();
                    a11.f28266w.add(tL_messageEntityCustomEmoji);
                    a11.H = x3Var.f12765a;
                    a11.Q = l10.longValue();
                    az.C(z3Var.f12891m2).r0(a11);
                }
                if (l10.longValue() <= 0) {
                    gc r10 = new lc(z3Var.M0, z3Var.f12887l0).r(e10, hd.N0(2131746193, null), hd.N0(2131743307, null), new f2.a(x2Var, 7));
                    r10.f35527j = 5000;
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
                z3 z3Var2 = ((r3) obj4).f12532x;
                c3 c3Var = z3Var2.M0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    boolean z11 = z3Var2.f12890m1;
                    i10 = 2131623980;
                    if (z11) {
                        lc lcVar2 = new lc(c3Var, h6Var);
                        if (z10) {
                            i10 = 2131623990;
                        }
                        if (z10) {
                            i12 = 2131744339;
                        } else {
                            i12 = 2131744484;
                        }
                        lcVar2.Q(i10, 36, hd.N0(i12, null)).j();
                        return;
                    } else if (z10) {
                        new lc(c3Var, h6Var).I(2131623990, hd.N0(2131744341, null), hd.N0(2131744340, null)).j();
                        return;
                    } else {
                        lcVar = new lc(c3Var, h6Var);
                        i11 = 2131744211;
                    }
                } else {
                    lcVar = new lc(c3Var, h6Var);
                    i10 = 2131624012;
                    i11 = 2131743634;
                }
                org.telegram.messenger.f3.n(null, i11, lcVar, i10, 36);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i14 = ChatActivityEnterView.f32569s7;
                ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                bi.n3 n3Var = new bi.n3(chatActivityEnterView.getContext(), chatActivityEnterView.R, ((TLRPC.User) obj2).f28583id, wg.s.c(wg.s.b(1, (List) obj)), null);
                n3Var.g1(z10);
                n3Var.show();
                return;
        }
    }

    public w2(r3 r3Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f12720c = r3Var;
        this.d = storyItem;
        this.f12719b = z10;
        this.f12721e = h6Var;
    }

    public w2(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.t1 t1Var, TLRPC.User user, boolean z10) {
        this.f12720c = chatActivityEnterView;
        this.d = t1Var;
        this.f12721e = user;
        this.f12719b = z10;
    }
}
