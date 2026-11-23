package fi;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ri;
import org.telegram.messenger.w10;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kc;
public final class w2 implements w10 {
    public final int f12680a = 1;
    public final boolean f12681b;
    public final Object f12682c;
    public final Object d;
    public final Object f12683e;

    public w2(x2 x2Var, boolean z10, ch.p0 p0Var, View view) {
        this.f12682c = x2Var;
        this.f12681b = z10;
        this.d = p0Var;
        this.f12683e = view;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        ch.l0 l0Var;
        TLRPC.Document e10;
        kc kcVar;
        int i10;
        int i11;
        int i12;
        int i13 = this.f12680a;
        boolean z10 = this.f12681b;
        Object obj2 = this.f12683e;
        Object obj3 = this.d;
        Object obj4 = this.f12682c;
        switch (i13) {
            case 0:
                x2 x2Var = (x2) obj4;
                ch.p0 p0Var = (ch.p0) obj3;
                View view = (View) obj2;
                Long l10 = (Long) obj;
                z3 z3Var = x2Var.f12726a;
                if (z10 && p0Var.f5470f != null) {
                    try {
                        z3Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    i7 = 0;
                    l0Var = new ch.l0(view.getContext(), null, z3Var.P1, null, view, z3Var.getMeasuredWidth() / 2.0f, z3Var.getMeasuredHeight() / 2.0f, p0Var, z3Var.f12853m2, 0, true);
                } else {
                    i7 = 0;
                    l0Var = new ch.l0(view.getContext(), null, z3Var.P1, null, view, z3Var.getMeasuredWidth() / 2.0f, z3Var.getMeasuredHeight() / 2.0f, p0Var, z3Var.f12853m2, 2, true);
                    p0Var = p0Var;
                }
                ch.l0.B = l0Var;
                ch.i0 i0Var = l0Var.f5401i;
                i0Var.setTag(2131296593, 1);
                z3Var.addView(i0Var);
                x3 x3Var = z3Var.f12899y1;
                l0Var.f5411s = true;
                l0Var.f5416y = System.currentTimeMillis();
                if (p0Var.f5470f != null) {
                    e10 = ri.d0(z3Var.f12853m2).V(p0Var.f5470f);
                    xy a10 = xy.a(z3Var.l1, p0Var.f5470f);
                    a10.H = x3Var.f12727a;
                    a10.Q = l10.longValue();
                    zy.C(z3Var.f12853m2).r0(a10);
                } else {
                    e10 = org.telegram.ui.Components.o5.e(z3Var.f12853m2, p0Var.f5471g);
                    String V = fj.V(e10, null, null);
                    if (V == null) {
                        if (z3Var.P1.getReactionsWindow() != null) {
                            z3Var.P1.getReactionsWindow().e();
                        }
                        z3Var.q0();
                        return;
                    }
                    xy a11 = xy.a(z3Var.l1, V);
                    a11.f28170w = new ArrayList();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = p0Var.f5471g;
                    tL_messageEntityCustomEmoji.offset = i7;
                    tL_messageEntityCustomEmoji.length = V.length();
                    a11.f28170w.add(tL_messageEntityCustomEmoji);
                    a11.H = x3Var.f12727a;
                    a11.Q = l10.longValue();
                    zy.C(z3Var.f12853m2).r0(a11);
                }
                if (l10.longValue() <= 0) {
                    fc r10 = new kc(z3Var.M0, z3Var.f12849l0).r(e10, gd.N0(2131746193, null), gd.N0(2131743302, null), new f2.a(x2Var, 6));
                    r10.f35091j = 5000;
                    r10.j();
                }
                if (z3Var.P1.getReactionsWindow() != null) {
                    z3Var.P1.getReactionsWindow().e();
                }
                z3Var.q0();
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj2;
                z3 z3Var2 = ((r3) obj4).f12494x;
                c3 c3Var = z3Var2.M0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    boolean z11 = z3Var2.f12852m1;
                    i10 = 2131623980;
                    if (z11) {
                        kc kcVar2 = new kc(c3Var, i6Var);
                        if (z10) {
                            i10 = 2131623990;
                        }
                        if (z10) {
                            i12 = 2131744338;
                        } else {
                            i12 = 2131744486;
                        }
                        kcVar2.Q(i10, 36, gd.N0(i12, null)).j();
                        return;
                    } else if (z10) {
                        new kc(c3Var, i6Var).I(2131623990, gd.N0(2131744340, null), gd.N0(2131744339, null)).j();
                        return;
                    } else {
                        kcVar = new kc(c3Var, i6Var);
                        i11 = 2131744210;
                    }
                } else {
                    kcVar = new kc(c3Var, i6Var);
                    i10 = 2131624012;
                    i11 = 2131743632;
                }
                org.telegram.messenger.f3.n(null, i11, kcVar, i10, 36);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i14 = ChatActivityEnterView.f32633s7;
                ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                bi.p3 p3Var = new bi.p3(chatActivityEnterView.getContext(), chatActivityEnterView.R, ((TLRPC.User) obj2).f28641id, wg.r.c(wg.r.b(1, (List) obj)), null);
                p3Var.g1(z10);
                p3Var.show();
                return;
        }
    }

    public w2(r3 r3Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f12682c = r3Var;
        this.d = storyItem;
        this.f12681b = z10;
        this.f12683e = i6Var;
    }

    public w2(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.t1 t1Var, TLRPC.User user, boolean z10) {
        this.f12682c = chatActivityEnterView;
        this.d = t1Var;
        this.f12683e = user;
        this.f12681b = z10;
    }
}
