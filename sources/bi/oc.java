package bi;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.sj;
import org.telegram.ui.t80;
public final class oc extends org.telegram.ui.Components.na implements ls {
    public final nc P1;
    public final FrameLayout Q1;
    public final TLRPC.User R1;
    public final wg.x0 S1;
    public m41 T1;
    public boolean U1;

    public oc(Context context, org.telegram.ui.ActionBar.g6 g6Var, TLRPC.User user, wg.x0 x0Var) {
        super(context, null, false, false, g6Var);
        this.R1 = user;
        this.S1 = x0Var;
        this.f36308r1 = 0.2f;
        qs.f(this.f28621a).c(this, qs.f25100w3);
        qs.f(this.f28621a).c(this, qs.f25114y3);
        N();
        qj0 qj0Var = this.f36303k1;
        int i7 = this.f28654t0;
        qj0Var.setPadding(i7, 0, i7, 0);
        this.f36303k1.setOnItemClickListener(new ai.k(this, 2));
        v4.k kVar = new v4.k();
        kVar.f57083m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.f36303k1.setItemAnimator(kVar);
        w0(org.telegram.ui.ActionBar.l6.f27956i5);
        nc ncVar = new nc(0, context, g6Var);
        this.P1 = ncVar;
        ((TextView) ncVar.f4436c).setText(org.telegram.messenger.id.M0(2131749607, null));
        x70 x70Var = (x70) ncVar.d;
        x70Var.setText(TextUtils.concat(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749609, t10.k(user))), " ", org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131749608, null).replace(' ', (char) 160), new Runnable(this) {
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
                        ju0 ju0Var = new ju0(ocVar.getContext());
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(ocVar.f28637f1) && (f2Var = ocVar.f28637f1) != null) {
                            ju0Var.a0(f2Var);
                        }
                        ju0Var.show();
                        return;
                    default:
                        vf.c.t(ocVar.getContext(), org.telegram.messenger.id.M0(2131744966, null));
                        return;
                }
            }
        }), true)));
        x70Var.setMaxWidth(fi.m3.a(x70Var.getText(), x70Var.getPaint()) + 1);
        this.l1.setTitle(O0());
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        w8Var.r(user);
        ((org.telegram.ui.Components.l9) ncVar.f4435b).e(user, w8Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q1 = frameLayout;
        x70 x70Var2 = new x70(context, g6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        x70Var2.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.s6.U(x70Var2, org.telegram.ui.ActionBar.l6.B6, g6Var);
        org.telegram.ui.ActionBar.s6.G(x70Var2, org.telegram.ui.ActionBar.l6.Uc, g6Var);
        x70Var2.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131744967, null), new Runnable(this) {
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
                        ju0 ju0Var = new ju0(ocVar.getContext());
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(ocVar.f28637f1) && (f2Var = ocVar.f28637f1) != null) {
                            ju0Var.a0(f2Var);
                        }
                        ju0Var.show();
                        return;
                    default:
                        vf.c.t(ocVar.getContext(), org.telegram.messenger.id.M0(2131744966, null));
                        return;
                }
            }
        }));
        x70Var2.setGravity(17);
        x70Var2.setMaxWidth(fi.m3.a(x70Var2.getText(), x70Var2.getPaint()));
        frameLayout.addView(x70Var2, c8.ha.e(-2, -1, 17));
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27938h5, frameLayout, g6Var);
        this.f28624b.addView(new kz(getContext()), c8.ha.c(-1.0f, -1));
        m41 m41Var = this.T1;
        if (m41Var != null) {
            m41Var.O(false);
        }
    }

    public static void d1(oc ocVar, y31 y31Var, long j3, Boolean bool, String str) {
        wg.x0 x0Var;
        if (ocVar.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (x0Var = ocVar.S1) != null) {
                x0Var.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
            t80 t80Var = LaunchActivity.G1.f41300v0;
            if (T != null) {
                if (bool.booleanValue()) {
                    org.telegram.ui.Components.cc L = org.telegram.ui.Components.hc.a0(T).L(2131624225, org.telegram.messenger.id.M0(2131745100, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.G((int) y31Var.B, "StarsGiftSentPopupInfo", t10.k(ocVar.R1))), org.telegram.messenger.id.M0(2131743552, null), new k4(j3, 1));
                    L.f32627j = 5000;
                    L.k(true);
                    if (t80Var != null) {
                        t80Var.c(true);
                    }
                    ea.y(ocVar.f28621a, false).S(true);
                } else if (str != null) {
                    org.telegram.ui.Components.hc.a0(T).Q(2131624011, 36, org.telegram.messenger.id.a0(null, null, 2131743878, str)).j();
                }
            }
        }
    }

    @Override
    public final void K() {
        super.K();
        qs.f(this.f28621a).n(this, qs.f25100w3);
        qs.f(this.f28621a).n(this, qs.f25114y3);
    }

    @Override
    public final pj0 L0(qj0 qj0Var) {
        m41 m41Var = new m41(this.f36303k1, getContext(), this.f28621a, 0, true, new ai.e(this, 9), this.I0);
        this.T1 = m41Var;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        nc ncVar = this.P1;
        if (ncVar == null) {
            return null;
        }
        return ((TextView) ncVar.f4436c).getText();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        m41 m41Var;
        if ((i7 == qs.f25100w3 || i7 == qs.f25114y3) && (m41Var = this.T1) != null) {
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
