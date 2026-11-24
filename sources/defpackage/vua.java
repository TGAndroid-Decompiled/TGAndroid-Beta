package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class vua extends fy0 implements gk7 {
    public final zf2 S1;
    public final FrameLayout T1;
    public final TLRPC.User U1;
    public final Runnable V1;
    public l5c W1;
    public boolean X1;

    public vua(Context context, wjb wjbVar, TLRPC.User user, Runnable runnable) {
        super(context, null, false, false, wjbVar);
        this.U1 = user;
        this.V1 = runnable;
        this.u1 = 0.2f;
        kk7.f(this.a).b(this, kk7.x3);
        kk7.f(this.a).b(this, kk7.z3);
        K();
        o39 o39Var = this.n1;
        int i = this.u0;
        o39Var.setPadding(i, 0, i, 0);
        this.n1.setOnItemClickListener(new f09(this, (byte) 12));
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33.h);
        gb3Var.n(350L);
        this.n1.setItemAnimator(gb3Var);
        t0(bkb.h5);
        zf2 zf2Var = new zf2(context, wjbVar, (byte) 6);
        this.S1 = zf2Var;
        ((TextView) zf2Var.c).setText(k96.M0(2131749432, null));
        l46 l46Var = (l46) zf2Var.d;
        l46Var.setText(TextUtils.concat(gl.S2(k96.a0(null, null, 2131749434, l7c.l(user))), " ", gl.D2(gl.P2(k96.M0(2131749433, null).replace(' ', (char) 160), new Runnable(this) {
            public final vua b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                d dVar;
                byte b = r2;
                vua vuaVar = this.b;
                switch (b) {
                    case 0:
                        zma zmaVar = new zma(vuaVar.getContext());
                        if (!gl.O1() && !gl.s1(vuaVar.i1) && (dVar = vuaVar.i1) != null) {
                            zmaVar.X(dVar);
                        }
                        zmaVar.show();
                        return;
                    default:
                        d01.t(vuaVar.getContext(), k96.M0(2131744729, null));
                        return;
                }
            }
        }), true)));
        l46Var.setMaxWidth(je5.a(l46Var.getText(), l46Var.getPaint()) + 1);
        this.o1.setTitle(J0());
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.q(user);
        ((be0) zf2Var.b).f(user, pb0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        l46 l46Var2 = new l46(context, wjbVar);
        frameLayout.setPadding(0, gl.L(11.0f), 0, gl.L(11.0f));
        l46Var2.setTextSize(1, 12.0f);
        zkb.X(l46Var2, bkb.A6, wjbVar);
        zkb.G(l46Var2, bkb.Wc, wjbVar);
        l46Var2.setText(gl.N2(k96.M0(2131744730, null), -1, 0, new Runnable(this) {
            public final vua b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                d dVar;
                byte b = r2;
                vua vuaVar = this.b;
                switch (b) {
                    case 0:
                        zma zmaVar = new zma(vuaVar.getContext());
                        if (!gl.O1() && !gl.s1(vuaVar.i1) && (dVar = vuaVar.i1) != null) {
                            zmaVar.X(dVar);
                        }
                        zmaVar.show();
                        return;
                    default:
                        d01.t(vuaVar.getContext(), k96.M0(2131744729, null));
                        return;
                }
            }
        }, null));
        l46Var2.setGravity(17);
        l46Var2.setMaxWidth(je5.a(l46Var2.getText(), l46Var2.getPaint()));
        frameLayout.addView(l46Var2, nme.e(-2, -1, 17));
        zkb.h(bkb.g5, wjbVar, frameLayout);
        this.b.addView(new qh4(getContext()), nme.c(-1.0f, -1));
        l5c l5cVar = this.W1;
        if (l5cVar != null) {
            l5cVar.O(false);
        }
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(this.n1, getContext(), this.a, 0, true, new tf8(this, (byte) 25), this.J0);
        this.W1 = l5cVar;
        return l5cVar;
    }

    @Override
    public final void I() {
        super.I();
        kk7.f(this.a).n(this, kk7.x3);
        kk7.f(this.a).n(this, kk7.z3);
    }

    @Override
    public final CharSequence J0() {
        zf2 zf2Var = this.S1;
        if (zf2Var == null) {
            return null;
        }
        return ((TextView) zf2Var.c).getText();
    }

    public final void Y0(c4c c4cVar, long j, Boolean bool, String str) {
        Runnable runnable;
        if (getContext() != null) {
            if ((bool.booleanValue() || str != null) && (runnable = this.V1) != null) {
                runnable.run();
            }
            super.dismiss();
            d S = LaunchActivity.S();
            vz5 vz5Var = LaunchActivity.H1.w0;
            if (S != null) {
                if (bool.booleanValue()) {
                    m21 L = u21.b0(S).L(2131624220, k96.M0(2131744863, null), gl.S2(k96.G((int) c4cVar.C, "StarsGiftSentPopupInfo", l7c.l(this.U1))), k96.M0(2131743310, null), new px6((byte) 5, j));
                    L.j = 5000;
                    L.k(true);
                    if (vz5Var != null) {
                        vz5Var.c(true);
                    }
                    gta.v(this.a, false).P(true);
                } else if (str != null) {
                    u21.b0(S).Q(2131624012, 36, k96.a0(null, null, 2131743639, str)).j();
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l5c l5cVar;
        if ((i == kk7.x3 || i == kk7.z3) && (l5cVar = this.W1) != null) {
            l5cVar.O(true);
        }
    }

    @Override
    public final void show() {
        ar1 ar1Var;
        d Q = LaunchActivity.Q();
        if (Q instanceof mu1) {
            mu1 mu1Var = (mu1) Q;
            if (mu1Var.Q7() && (ar1Var = mu1Var.a0) != null) {
                ar1Var.S();
            }
        }
        super.show();
    }
}
