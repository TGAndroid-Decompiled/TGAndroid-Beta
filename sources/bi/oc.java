package bi;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.sj;
import org.telegram.ui.u80;
public final class oc extends org.telegram.ui.Components.ma implements ls {
    public final nc S1;
    public final FrameLayout T1;
    public final TLRPC.User U1;
    public final wg.x0 V1;
    public m41 W1;
    public boolean X1;

    public oc(Context context, org.telegram.ui.ActionBar.h6 h6Var, TLRPC.User user, wg.x0 x0Var) {
        super(context, null, false, false, h6Var);
        this.U1 = user;
        this.V1 = x0Var;
        this.f35908u1 = 0.2f;
        qs.f(this.f28669a).c(this, qs.f25104w3);
        qs.f(this.f28669a).c(this, qs.f25118y3);
        N();
        pj0 pj0Var = this.n1;
        int i7 = this.f28705t0;
        pj0Var.setPadding(i7, 0, i7, 0);
        this.n1.setOnItemClickListener(new ai.k(this, 2));
        v4.k kVar = new v4.k();
        kVar.f57079m = false;
        kVar.C = false;
        kVar.o(wq.h);
        kVar.n(350L);
        this.n1.setItemAnimator(kVar);
        w0(org.telegram.ui.ActionBar.m6.f27981i5);
        nc ncVar = new nc(0, context, h6Var);
        this.S1 = ncVar;
        ((TextView) ncVar.f4436c).setText(org.telegram.messenger.id.M0(2131749607, null));
        w70 w70Var = (w70) ncVar.d;
        w70Var.setText(TextUtils.concat(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749609, t10.k(user))), " ", org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131749608, null).replace(' ', (char) 160), new Runnable(this) {
            public final oc f4294b;

            {
                this.f4294b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.f2 f2Var;
                int i10 = r2;
                oc ocVar = this.f4294b;
                switch (i10) {
                    case 0:
                        iu0 iu0Var = new iu0(ocVar.getContext());
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(ocVar.f28691i1) && (f2Var = ocVar.f28691i1) != null) {
                            iu0Var.a0(f2Var);
                        }
                        iu0Var.show();
                        return;
                    default:
                        vf.c.t(ocVar.getContext(), org.telegram.messenger.id.M0(2131744966, null));
                        return;
                }
            }
        }), true)));
        w70Var.setMaxWidth(fi.m3.a(w70Var.getText(), w70Var.getPaint()) + 1);
        this.f35902o1.setTitle(O0());
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        v8Var.r(user);
        ((org.telegram.ui.Components.k9) ncVar.f4435b).e(user, v8Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        w70 w70Var2 = new w70(context, h6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        w70Var2.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.t6.U(w70Var2, org.telegram.ui.ActionBar.m6.B6, h6Var);
        org.telegram.ui.ActionBar.t6.G(w70Var2, org.telegram.ui.ActionBar.m6.Uc, h6Var);
        w70Var2.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131744967, null), new Runnable(this) {
            public final oc f4294b;

            {
                this.f4294b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.f2 f2Var;
                int i10 = r2;
                oc ocVar = this.f4294b;
                switch (i10) {
                    case 0:
                        iu0 iu0Var = new iu0(ocVar.getContext());
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(ocVar.f28691i1) && (f2Var = ocVar.f28691i1) != null) {
                            iu0Var.a0(f2Var);
                        }
                        iu0Var.show();
                        return;
                    default:
                        vf.c.t(ocVar.getContext(), org.telegram.messenger.id.M0(2131744966, null));
                        return;
                }
            }
        }));
        w70Var2.setGravity(17);
        w70Var2.setMaxWidth(fi.m3.a(w70Var2.getText(), w70Var2.getPaint()));
        frameLayout.addView(w70Var2, c8.ha.e(-2, -1, 17));
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27963h5, frameLayout, h6Var);
        this.f28672b.addView(new jz(getContext()), c8.ha.c(-1.0f, -1));
        m41 m41Var = this.W1;
        if (m41Var != null) {
            m41Var.O(false);
        }
    }

    public static void d1(oc ocVar, x31 x31Var, long j3, Boolean bool, String str) {
        wg.x0 x0Var;
        if (ocVar.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (x0Var = ocVar.V1) != null) {
                x0Var.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
            u80 u80Var = LaunchActivity.G1.f41291v0;
            if (T != null) {
                if (bool.booleanValue()) {
                    org.telegram.ui.Components.bc L = org.telegram.ui.Components.gc.a0(T).L(2131624225, org.telegram.messenger.id.M0(2131745100, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.G((int) x31Var.B, "StarsGiftSentPopupInfo", t10.k(ocVar.U1))), org.telegram.messenger.id.M0(2131743552, null), new k4(j3, 1));
                    L.f32203j = 5000;
                    L.k(true);
                    if (u80Var != null) {
                        u80Var.c(true);
                    }
                    ea.y(ocVar.f28669a, false).S(true);
                } else if (str != null) {
                    org.telegram.ui.Components.gc.a0(T).Q(2131624011, 36, org.telegram.messenger.id.a0(null, null, 2131743878, str)).j();
                }
            }
        }
    }

    @Override
    public final void K() {
        super.K();
        qs.f(this.f28669a).n(this, qs.f25104w3);
        qs.f(this.f28669a).n(this, qs.f25118y3);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(this.n1, getContext(), this.f28669a, 0, true, new ai.e(this, 9), this.I0);
        this.W1 = m41Var;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        nc ncVar = this.S1;
        if (ncVar == null) {
            return null;
        }
        return ((TextView) ncVar.f4436c).getText();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        m41 m41Var;
        if ((i7 == qs.f25104w3 || i7 == qs.f25118y3) && (m41Var = this.W1) != null) {
            m41Var.O(true);
        }
    }

    @Override
    public final void show() {
        sj sjVar;
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q instanceof cn) {
            cn cnVar = (cn) Q;
            if (cnVar.U9() && (sjVar = cnVar.Z) != null) {
                sjVar.L();
            }
        }
        super.show();
    }
}
