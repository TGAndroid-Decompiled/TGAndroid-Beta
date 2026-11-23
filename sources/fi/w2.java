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
    public final int f12668a = 1;
    public final boolean f12669b;
    public final Object f12670c;
    public final Object d;
    public final Object f12671e;

    public w2(x2 x2Var, boolean z10, ch.p0 p0Var, View view) {
        this.f12670c = x2Var;
        this.f12669b = z10;
        this.d = p0Var;
        this.f12671e = view;
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
        int i13 = this.f12668a;
        boolean z10 = this.f12669b;
        Object obj2 = this.f12671e;
        Object obj3 = this.d;
        Object obj4 = this.f12670c;
        switch (i13) {
            case 0:
                x2 x2Var = (x2) obj4;
                ch.p0 p0Var = (ch.p0) obj3;
                View view = (View) obj2;
                Long l10 = (Long) obj;
                z3 z3Var = x2Var.f12714a;
                if (z10 && p0Var.f5470f != null) {
                    try {
                        z3Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    i7 = 0;
                    l0Var = new ch.l0(view.getContext(), null, z3Var.P1, null, view, z3Var.getMeasuredWidth() / 2.0f, z3Var.getMeasuredHeight() / 2.0f, p0Var, z3Var.f12842m2, 0, true);
                } else {
                    i7 = 0;
                    l0Var = new ch.l0(view.getContext(), null, z3Var.P1, null, view, z3Var.getMeasuredWidth() / 2.0f, z3Var.getMeasuredHeight() / 2.0f, p0Var, z3Var.f12842m2, 2, true);
                    p0Var = p0Var;
                }
                ch.l0.B = l0Var;
                ch.i0 i0Var = l0Var.f5401i;
                i0Var.setTag(2131296593, 1);
                z3Var.addView(i0Var);
                x3 x3Var = z3Var.f12888y1;
                l0Var.f5411s = true;
                l0Var.f5416y = System.currentTimeMillis();
                if (p0Var.f5470f != null) {
                    e10 = si.d0(z3Var.f12842m2).V(p0Var.f5470f);
                    yy a10 = yy.a(z3Var.l1, p0Var.f5470f);
                    a10.H = x3Var.f12715a;
                    a10.Q = l10.longValue();
                    az.C(z3Var.f12842m2).r0(a10);
                } else {
                    e10 = org.telegram.ui.Components.p5.e(z3Var.f12842m2, p0Var.f5471g);
                    String V = gj.V(e10, null, null);
                    if (V == null) {
                        if (z3Var.P1.getReactionsWindow() != null) {
                            z3Var.P1.getReactionsWindow().e();
                        }
                        z3Var.q0();
                        return;
                    }
                    yy a11 = yy.a(z3Var.l1, V);
                    a11.f28230w = new ArrayList();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = p0Var.f5471g;
                    tL_messageEntityCustomEmoji.offset = i7;
                    tL_messageEntityCustomEmoji.length = V.length();
                    a11.f28230w.add(tL_messageEntityCustomEmoji);
                    a11.H = x3Var.f12715a;
                    a11.Q = l10.longValue();
                    az.C(z3Var.f12842m2).r0(a11);
                }
                if (l10.longValue() <= 0) {
                    gc r10 = new lc(z3Var.M0, z3Var.f12838l0).r(e10, hd.N0(2131746193, null), hd.N0(2131743309, null), new f2.a(x2Var, 6));
                    r10.f35489j = 5000;
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
                z3 z3Var2 = ((r3) obj4).f12493x;
                c3 c3Var = z3Var2.M0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    boolean z11 = z3Var2.f12841m1;
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
                        lcVar2.Q(i10, 36, hd.N0(i12, null)).j();
                        return;
                    } else if (z10) {
                        new lc(c3Var, h6Var).I(2131623990, hd.N0(2131744343, null), hd.N0(2131744342, null)).j();
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
                int i14 = ChatActivityEnterView.f32535s7;
                ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                bi.p3 p3Var = new bi.p3(chatActivityEnterView.getContext(), chatActivityEnterView.R, ((TLRPC.User) obj2).f28547id, wg.s.c(wg.s.b(1, (List) obj)), null);
                p3Var.g1(z10);
                p3Var.show();
                return;
        }
    }

    public w2(r3 r3Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f12670c = r3Var;
        this.d = storyItem;
        this.f12669b = z10;
        this.f12671e = h6Var;
    }

    public w2(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.t1 t1Var, TLRPC.User user, boolean z10) {
        this.f12670c = chatActivityEnterView;
        this.d = t1Var;
        this.f12671e = user;
        this.f12669b = z10;
    }
}
