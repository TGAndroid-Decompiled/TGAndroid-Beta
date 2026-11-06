package di;

import android.view.View;
import bi.ab;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;
import org.telegram.messenger.ez;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
public final class d3 implements c20 {
    public final int f8915a = 0;
    public final boolean f8916b;
    public final Object f8917c;
    public final Object d;
    public final Object f8918e;

    public d3(e3 e3Var, boolean z9, ch.o0 o0Var, View view) {
        this.f8917c = e3Var;
        this.f8916b = z9;
        this.d = o0Var;
        this.f8918e = view;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        ch.k0 k0Var;
        TLRPC.Document e10;
        hc hcVar;
        int i10;
        int i11;
        int i12;
        int i13 = this.f8915a;
        boolean z9 = this.f8916b;
        Object obj2 = this.f8918e;
        Object obj3 = this.d;
        Object obj4 = this.f8917c;
        switch (i13) {
            case 0:
                e3 e3Var = (e3) obj4;
                ch.o0 o0Var = (ch.o0) obj3;
                View view = (View) obj2;
                Long l10 = (Long) obj;
                i4 i4Var = e3Var.f8958a;
                if (z9 && o0Var.f6356f != null) {
                    try {
                        i4Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    i7 = 0;
                    k0Var = new ch.k0(view.getContext(), null, i4Var.O1, null, view, i4Var.getMeasuredWidth() / 2.0f, i4Var.getMeasuredHeight() / 2.0f, o0Var, i4Var.f9168l2, 0, true);
                } else {
                    i7 = 0;
                    k0Var = new ch.k0(view.getContext(), null, i4Var.O1, null, view, i4Var.getMeasuredWidth() / 2.0f, i4Var.getMeasuredHeight() / 2.0f, o0Var, i4Var.f9168l2, 2, true);
                    o0Var = o0Var;
                }
                ch.k0.B = k0Var;
                ch.h0 h0Var = k0Var.f6288i;
                h0Var.setTag(2131296591, 1);
                i4Var.addView(h0Var);
                g4 g4Var = i4Var.f9213x1;
                k0Var.f6298s = true;
                k0Var.f6303y = System.currentTimeMillis();
                if (o0Var.f6356f != null) {
                    e10 = ui.b0(i4Var.f9168l2).T(o0Var.f6356f);
                    ez a10 = ez.a(i4Var.f9164k1, o0Var.f6356f);
                    a10.H = g4Var.f9038a;
                    a10.Q = l10.longValue();
                    gz.C(i4Var.f9168l2).r0(a10);
                } else {
                    e10 = org.telegram.ui.Components.i5.e(i4Var.f9168l2, o0Var.f6357g);
                    String V = ij.V(e10, null, null);
                    if (V == null) {
                        if (i4Var.O1.getReactionsWindow() != null) {
                            i4Var.O1.getReactionsWindow().e();
                        }
                        i4Var.q0();
                        return;
                    }
                    ez a11 = ez.a(i4Var.f9164k1, V);
                    a11.f22312w = new ArrayList();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = o0Var.f6357g;
                    tL_messageEntityCustomEmoji.offset = i7;
                    tL_messageEntityCustomEmoji.length = V.length();
                    a11.f22312w.add(tL_messageEntityCustomEmoji);
                    a11.H = g4Var.f9038a;
                    a11.Q = l10.longValue();
                    gz.C(i4Var.f9168l2).r0(a11);
                }
                if (l10.longValue() <= 0) {
                    cc r10 = new hc(i4Var.L0, i4Var.f9163k0).r(e10, hd.M0(2131746388, null), hd.M0(2131743553, null), new ab(e3Var, 19));
                    r10.f32514j = 5000;
                    r10.j();
                }
                if (i4Var.O1.getReactionsWindow() != null) {
                    i4Var.O1.getReactionsWindow().e();
                }
                i4Var.q0();
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                i4 i4Var2 = ((z3) obj4).f10013x;
                j3 j3Var = i4Var2.L0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z9;
                    boolean z10 = i4Var2.l1;
                    i10 = 2131623979;
                    if (z10) {
                        hc hcVar2 = new hc(j3Var, f6Var);
                        if (z9) {
                            i10 = 2131623989;
                        }
                        if (z9) {
                            i12 = 2131744583;
                        } else {
                            i12 = 2131744728;
                        }
                        hcVar2.Q(i10, 36, hd.M0(i12, null)).j();
                        return;
                    } else if (z9) {
                        new hc(j3Var, f6Var).I(2131623989, hd.M0(2131744585, null), hd.M0(2131744584, null)).j();
                        return;
                    } else {
                        hcVar = new hc(j3Var, f6Var);
                        i11 = 2131744455;
                    }
                } else {
                    hcVar = new hc(j3Var, f6Var);
                    i10 = 2131624011;
                    i11 = 2131743880;
                }
                org.telegram.messenger.k5.o(null, i11, hcVar, i10, 36);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i14 = ChatActivityEnterView.s5;
                ((org.telegram.ui.ActionBar.u1) obj3).dismiss();
                zh.h1 h1Var = new zh.h1(chatActivityEnterView.getContext(), chatActivityEnterView.Q, ((TLRPC.User) obj2).f27102id, wg.s.c(wg.s.b(1, (List) obj)), null);
                h1Var.e1(z9);
                h1Var.show();
                return;
        }
    }

    public d3(z3 z3Var, TL_stories.StoryItem storyItem, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f8917c = z3Var;
        this.d = storyItem;
        this.f8916b = z9;
        this.f8918e = f6Var;
    }

    public d3(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.u1 u1Var, TLRPC.User user, boolean z9) {
        this.f8917c = chatActivityEnterView;
        this.d = u1Var;
        this.f8918e = user;
        this.f8916b = z9;
    }
}
