package di;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.rj;
import org.telegram.ui.u80;
public final class ab extends org.telegram.ui.Components.sa implements gs {
    public final za T1;
    public final FrameLayout U1;
    public final TLRPC.User V1;
    public final Runnable W1;
    public c51 X1;
    public boolean Y1;

    public ab(Context context, org.telegram.ui.ActionBar.h6 h6Var, TLRPC.User user, Runnable runnable) {
        super(context, null, false, false, h6Var);
        this.V1 = user;
        this.W1 = runnable;
        this.f39494v1 = 0.2f;
        ls.f(this.f30139a).c(this, ls.f25386y3);
        ls.f(this.f30139a).c(this, ls.A3);
        O();
        ek0 ek0Var = this.f39487o1;
        int i7 = this.f30177u0;
        ek0Var.setPadding(i7, 0, i7, 0);
        this.f39487o1.setOnItemClickListener(new bi.n8(this, 3));
        v4.k kVar = new v4.k();
        kVar.f59139m = false;
        kVar.C = false;
        kVar.o(nr.h);
        kVar.n(350L);
        this.f39487o1.setItemAnimator(kVar);
        w0(org.telegram.ui.ActionBar.m6.f29438i5);
        za zaVar = new za(0, context, h6Var);
        this.T1 = zaVar;
        ((TextView) zaVar.f10169c).setText(hd.N0(2131749431, null));
        m80 m80Var = (m80) zaVar.d;
        m80Var.setText(TextUtils.concat(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749433, p10.l(user))), " ", org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(hd.N0(2131749432, null).replace(' ', (char) 160), new Runnable(this) {
            public final ab f10080b;

            {
                this.f10080b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.g2 g2Var;
                int i10 = r2;
                ab abVar = this.f10080b;
                switch (i10) {
                    case 0:
                        tu0 tu0Var = new tu0(abVar.getContext());
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(abVar.f30163j1) && (g2Var = abVar.f30163j1) != null) {
                            tu0Var.a0(g2Var);
                        }
                        tu0Var.show();
                        return;
                    default:
                        vf.c.t(abVar.getContext(), hd.N0(2131744725, null));
                        return;
                }
            }
        }), true)));
        m80Var.setMaxWidth(hi.l3.a(m80Var.getText(), m80Var.getPaint()) + 1);
        this.f39488p1.setTitle(P0());
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        b9Var.r(user);
        ((org.telegram.ui.Components.q9) zaVar.f10168b).f(user, b9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U1 = frameLayout;
        m80 m80Var2 = new m80(context, h6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        m80Var2.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.t6.U(m80Var2, org.telegram.ui.ActionBar.m6.B6, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var2, org.telegram.ui.ActionBar.m6.Xc, h6Var);
        m80Var2.setText(org.telegram.messenger.g0.T2(hd.N0(2131744726, null), new Runnable(this) {
            public final ab f10080b;

            {
                this.f10080b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.g2 g2Var;
                int i10 = r2;
                ab abVar = this.f10080b;
                switch (i10) {
                    case 0:
                        tu0 tu0Var = new tu0(abVar.getContext());
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(abVar.f30163j1) && (g2Var = abVar.f30163j1) != null) {
                            tu0Var.a0(g2Var);
                        }
                        tu0Var.show();
                        return;
                    default:
                        vf.c.t(abVar.getContext(), hd.N0(2131744725, null));
                        return;
                }
            }
        }));
        m80Var2.setGravity(17);
        m80Var2.setMaxWidth(hi.l3.a(m80Var2.getText(), m80Var2.getPaint()));
        frameLayout.addView(m80Var2, c8.na.e(-2, -1, 17));
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29420h5, frameLayout, h6Var);
        this.f30142b.addView(new wz(getContext()), c8.na.c(-1.0f, -1));
        c51 c51Var = this.X1;
        if (c51Var != null) {
            c51Var.O(false);
        }
    }

    public static void e1(ab abVar, o41 o41Var, long j3, Boolean bool, String str) {
        Runnable runnable;
        if (abVar.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (runnable = abVar.W1) != null) {
                runnable.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
            u80 u80Var = LaunchActivity.H1.f43118w0;
            if (T != null) {
                if (bool.booleanValue()) {
                    org.telegram.ui.Components.gc L = org.telegram.ui.Components.lc.b0(T).L(2131624226, hd.N0(2131744859, null), org.telegram.messenger.g0.W2(hd.G((int) o41Var.C, "StarsGiftSentPopupInfo", p10.l(abVar.V1))), hd.N0(2131743309, null), new g3(j3, 1));
                    L.f35489j = 5000;
                    L.k(true);
                    if (u80Var != null) {
                        u80Var.c(true);
                    }
                    y8.y(abVar.f30139a, false).R(true);
                } else if (str != null) {
                    org.telegram.ui.Components.lc.b0(T).Q(2131624012, 36, hd.a0(null, null, 2131743635, str)).j();
                }
            }
        }
    }

    @Override
    public final void L() {
        super.L();
        ls.f(this.f30139a).n(this, ls.f25386y3);
        ls.f(this.f30139a).n(this, ls.A3);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(this.f39487o1, getContext(), this.f30139a, 0, true, new bi.b(this, 19), this.J0);
        this.X1 = c51Var;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        za zaVar = this.T1;
        if (zaVar == null) {
            return null;
        }
        return ((TextView) zaVar.f10169c).getText();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        c51 c51Var;
        if ((i7 == ls.f25386y3 || i7 == ls.A3) && (c51Var = this.X1) != null) {
            c51Var.O(true);
        }
    }

    @Override
    public final void show() {
        rj rjVar;
        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
        if (Q instanceof bn) {
            bn bnVar = (bn) Q;
            if (bnVar.V9() && (rjVar = bnVar.f45903a0) != null) {
                rjVar.U();
            }
        }
        super.show();
    }
}
