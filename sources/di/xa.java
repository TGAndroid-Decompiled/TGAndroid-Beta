package di;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.qj;
import org.telegram.ui.r80;
public final class xa extends org.telegram.ui.Components.ja implements is {
    public final wa T1;
    public final FrameLayout U1;
    public final TLRPC.User V1;
    public final wg.v0 W1;
    public p41 X1;
    public boolean Y1;

    public xa(Context context, org.telegram.ui.ActionBar.e6 e6Var, TLRPC.User user, wg.v0 v0Var) {
        super(context, null, false, false, e6Var);
        this.V1 = user;
        this.W1 = v0Var;
        this.f35943v1 = 0.2f;
        ns.f(this.f29679a).c(this, ns.f25596w3);
        ns.f(this.f29679a).c(this, ns.f25610y3);
        O();
        uj0 uj0Var = this.f35936o1;
        int i7 = this.f29717u0;
        uj0Var.setPadding(i7, 0, i7, 0);
        this.f35936o1.setOnItemClickListener(new bi.b6(this, 3));
        v4.k kVar = new v4.k();
        kVar.f58564m = false;
        kVar.C = false;
        kVar.o(er.h);
        kVar.n(350L);
        this.f35936o1.setItemAnimator(kVar);
        w0(org.telegram.ui.ActionBar.j6.f28940i5);
        wa waVar = new wa(0, context, e6Var);
        this.T1 = waVar;
        ((TextView) waVar.f9709c).setText(hd.M0(2131749607, null));
        z70 z70Var = (z70) waVar.d;
        z70Var.setText(TextUtils.concat(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749609, q10.k(user))), " ", org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(hd.M0(2131749608, null).replace(' ', (char) 160), new Runnable(this) {
            public final xa f9630b;

            {
                this.f9630b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.e2 e2Var;
                int i10 = r2;
                xa xaVar = this.f9630b;
                switch (i10) {
                    case 0:
                        iu0 iu0Var = new iu0(xaVar.getContext());
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(xaVar.f29703j1) && (e2Var = xaVar.f29703j1) != null) {
                            iu0Var.a0(e2Var);
                        }
                        iu0Var.show();
                        return;
                    default:
                        vf.c.t(xaVar.getContext(), hd.M0(2131744966, null));
                        return;
                }
            }
        }), true)));
        z70Var.setMaxWidth(hi.l3.a(z70Var.getText(), z70Var.getPaint()) + 1);
        this.f35937p1.setTitle(O0());
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        t8Var.r(user);
        ((org.telegram.ui.Components.i9) waVar.f9708b).f(user, t8Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U1 = frameLayout;
        z70 z70Var2 = new z70(context, e6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        z70Var2.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.q6.U(z70Var2, org.telegram.ui.ActionBar.j6.B6, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var2, org.telegram.ui.ActionBar.j6.Xc, e6Var);
        z70Var2.setText(org.telegram.messenger.g0.U2(hd.M0(2131744967, null), new Runnable(this) {
            public final xa f9630b;

            {
                this.f9630b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.e2 e2Var;
                int i10 = r2;
                xa xaVar = this.f9630b;
                switch (i10) {
                    case 0:
                        iu0 iu0Var = new iu0(xaVar.getContext());
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(xaVar.f29703j1) && (e2Var = xaVar.f29703j1) != null) {
                            iu0Var.a0(e2Var);
                        }
                        iu0Var.show();
                        return;
                    default:
                        vf.c.t(xaVar.getContext(), hd.M0(2131744966, null));
                        return;
                }
            }
        }));
        z70Var2.setGravity(17);
        z70Var2.setMaxWidth(hi.l3.a(z70Var2.getText(), z70Var2.getPaint()));
        frameLayout.addView(z70Var2, c8.ja.e(-2, -1, 17));
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28922h5, frameLayout, e6Var);
        this.f29682b.addView(new nz(getContext()), c8.ja.c(-1.0f, -1));
        p41 p41Var = this.X1;
        if (p41Var != null) {
            p41Var.O(false);
        }
    }

    public static void d1(xa xaVar, b41 b41Var, long j3, Boolean bool, String str) {
        wg.v0 v0Var;
        if (xaVar.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (v0Var = xaVar.W1) != null) {
                v0Var.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
            r80 r80Var = LaunchActivity.H1.f42663w0;
            if (T != null) {
                if (bool.booleanValue()) {
                    org.telegram.ui.Components.xb L = org.telegram.ui.Components.cc.a0(T).L(2131624226, hd.M0(2131745100, null), org.telegram.messenger.g0.X2(hd.G((int) b41Var.B, "StarsGiftSentPopupInfo", q10.k(xaVar.V1))), hd.M0(2131743552, null), new l3(j3, 1));
                    L.f41643j = 5000;
                    L.k(true);
                    if (r80Var != null) {
                        r80Var.c(true);
                    }
                    v8.y(xaVar.f29679a, false).S(true);
                } else if (str != null) {
                    org.telegram.ui.Components.cc.a0(T).Q(2131624012, 36, hd.a0(null, null, 2131743878, str)).j();
                }
            }
        }
    }

    @Override
    public final void L() {
        super.L();
        ns.f(this.f29679a).n(this, ns.f25596w3);
        ns.f(this.f29679a).n(this, ns.f25610y3);
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(this.f35936o1, getContext(), this.f29679a, 0, true, new bi.b(this, 20), this.J0);
        this.X1 = p41Var;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        wa waVar = this.T1;
        if (waVar == null) {
            return null;
        }
        return ((TextView) waVar.f9709c).getText();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        p41 p41Var;
        if ((i7 == ns.f25596w3 || i7 == ns.f25610y3) && (p41Var = this.X1) != null) {
            p41Var.O(true);
        }
    }

    @Override
    public final void show() {
        qj qjVar;
        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
        if (Q instanceof an) {
            an anVar = (an) Q;
            if (anVar.V9() && (qjVar = anVar.f45118a0) != null) {
                qjVar.S();
            }
        }
        super.show();
    }
}
