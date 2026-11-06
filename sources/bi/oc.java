package bi;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.qj;
import org.telegram.ui.r80;
public final class oc extends org.telegram.ui.Components.na implements ls {
    public final nc P1;
    public final FrameLayout Q1;
    public final TLRPC.User R1;
    public final wg.x0 S1;
    public k41 T1;
    public boolean U1;

    public oc(Context context, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.User user, wg.x0 x0Var) {
        super(context, null, false, false, f6Var);
        this.R1 = user;
        this.S1 = x0Var;
        this.f36227r1 = 0.2f;
        qs.f(this.f28612a).c(this, qs.f25083w3);
        qs.f(this.f28612a).c(this, qs.f25097y3);
        N();
        pj0 pj0Var = this.f36222k1;
        int i7 = this.f28645t0;
        pj0Var.setPadding(i7, 0, i7, 0);
        this.f36222k1.setOnItemClickListener(new ai.k(this, 2));
        v4.k kVar = new v4.k();
        kVar.f56979m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.f36222k1.setItemAnimator(kVar);
        w0(org.telegram.ui.ActionBar.k6.f27939i5);
        nc ncVar = new nc(0, context, f6Var);
        this.P1 = ncVar;
        ((TextView) ncVar.f4436c).setText(org.telegram.messenger.hd.M0(2131749606, null));
        w70 w70Var = (w70) ncVar.d;
        w70Var.setText(TextUtils.concat(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131749608, t10.k(user))), " ", org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131749607, null).replace(' ', (char) 160), new Runnable(this) {
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
                        hu0 hu0Var = new hu0(ocVar.getContext());
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(ocVar.f28628f1) && (f2Var = ocVar.f28628f1) != null) {
                            hu0Var.a0(f2Var);
                        }
                        hu0Var.show();
                        return;
                    default:
                        vf.c.t(ocVar.getContext(), org.telegram.messenger.hd.M0(2131744967, null));
                        return;
                }
            }
        }), true)));
        w70Var.setMaxWidth(fi.m3.a(w70Var.getText(), w70Var.getPaint()) + 1);
        this.l1.setTitle(O0());
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        w8Var.r(user);
        ((org.telegram.ui.Components.l9) ncVar.f4435b).e(user, w8Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q1 = frameLayout;
        w70 w70Var2 = new w70(context, f6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        w70Var2.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(w70Var2, org.telegram.ui.ActionBar.k6.B6, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var2, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        w70Var2.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131744968, null), new Runnable(this) {
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
                        hu0 hu0Var = new hu0(ocVar.getContext());
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(ocVar.f28628f1) && (f2Var = ocVar.f28628f1) != null) {
                            hu0Var.a0(f2Var);
                        }
                        hu0Var.show();
                        return;
                    default:
                        vf.c.t(ocVar.getContext(), org.telegram.messenger.hd.M0(2131744967, null));
                        return;
                }
            }
        }));
        w70Var2.setGravity(17);
        w70Var2.setMaxWidth(fi.m3.a(w70Var2.getText(), w70Var2.getPaint()));
        frameLayout.addView(w70Var2, c8.ha.e(-2, -1, 17));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27921h5, frameLayout, f6Var);
        this.f28615b.addView(new jz(getContext()), c8.ha.c(-1.0f, -1));
        k41 k41Var = this.T1;
        if (k41Var != null) {
            k41Var.O(false);
        }
    }

    public static void d1(oc ocVar, w31 w31Var, long j3, Boolean bool, String str) {
        wg.x0 x0Var;
        if (ocVar.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (x0Var = ocVar.S1) != null) {
                x0Var.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
            r80 r80Var = LaunchActivity.G1.f41290v0;
            if (T != null) {
                if (bool.booleanValue()) {
                    org.telegram.ui.Components.cc L = org.telegram.ui.Components.hc.a0(T).L(2131624225, org.telegram.messenger.hd.M0(2131745101, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G((int) w31Var.B, "StarsGiftSentPopupInfo", t10.k(ocVar.R1))), org.telegram.messenger.hd.M0(2131743553, null), new k4(j3, 1));
                    L.f32527j = 5000;
                    L.k(true);
                    if (r80Var != null) {
                        r80Var.c(true);
                    }
                    ea.y(ocVar.f28612a, false).S(true);
                } else if (str != null) {
                    org.telegram.ui.Components.hc.a0(T).Q(2131624011, 36, org.telegram.messenger.hd.a0(null, null, 2131743879, str)).j();
                }
            }
        }
    }

    @Override
    public final void K() {
        super.K();
        qs.f(this.f28612a).n(this, qs.f25083w3);
        qs.f(this.f28612a).n(this, qs.f25097y3);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        k41 k41Var = new k41(this.f36222k1, getContext(), this.f28612a, 0, true, new ai.e(this, 9), this.I0);
        this.T1 = k41Var;
        return k41Var;
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
        k41 k41Var;
        if ((i7 == qs.f25083w3 || i7 == qs.f25097y3) && (k41Var = this.T1) != null) {
            k41Var.O(true);
        }
    }

    @Override
    public final void show() {
        qj qjVar;
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q instanceof an) {
            an anVar = (an) Q;
            if (anVar.T9() && (qjVar = anVar.Z) != null) {
                qjVar.L();
            }
        }
        super.show();
    }
}
