package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class zwa extends mz0 implements jm7 {
    public final nh2 S1;
    public final FrameLayout T1;
    public final TLRPC.User U1;
    public final Runnable V1;
    public l7c W1;
    public boolean X1;

    public zwa(Context context, ylb ylbVar, TLRPC.User user, Runnable runnable) {
        super(context, null, false, false, ylbVar);
        this.U1 = user;
        this.V1 = runnable;
        this.u1 = 0.2f;
        nm7.f(this.a).b(this, nm7.y3);
        nm7.f(this.a).b(this, nm7.A3);
        J();
        r59 r59Var = this.n1;
        int i = this.u0;
        r59Var.setPadding(i, 0, i, 0);
        this.n1.setOnItemClickListener(new s19(this, (byte) 13));
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53.h);
        sc3Var.n(350L);
        this.n1.setItemAnimator(sc3Var);
        t0(cmb.h5);
        nh2 nh2Var = new nh2(context, ylbVar, (byte) 6);
        this.S1 = nh2Var;
        ((TextView) nh2Var.c).setText(jb6.M0(2131749381, null));
        l66 l66Var = (l66) nh2Var.d;
        l66Var.setText(TextUtils.concat(gm.S2(jb6.a0(null, null, 2131749383, m9c.l(user))), " ", gm.D2(gm.P2(jb6.M0(2131749382, null).replace(' ', (char) 160), new Runnable(this) {
            public final zwa b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                d dVar;
                byte b = r2;
                zwa zwaVar = this.b;
                switch (b) {
                    case 0:
                        apa apaVar = new apa(zwaVar.getContext());
                        if (!gm.O1() && !gm.s1(zwaVar.i1) && (dVar = zwaVar.i1) != null) {
                            apaVar.X(dVar);
                        }
                        apaVar.show();
                        return;
                    default:
                        l11.u(zwaVar.getContext(), jb6.M0(2131744655, null));
                        return;
                }
            }
        }), true)));
        l66Var.setMaxWidth(hg5.a(l66Var.getText(), l66Var.getPaint()) + 1);
        this.o1.setTitle(J0());
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.q(user);
        ((bf0) nh2Var.b).f(user, pc0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        l66 l66Var2 = new l66(context, ylbVar);
        frameLayout.setPadding(0, gm.L(11.0f), 0, gm.L(11.0f));
        l66Var2.setTextSize(1, 12.0f);
        anb.X(l66Var2, cmb.A6, ylbVar);
        anb.G(l66Var2, cmb.Wc, ylbVar);
        l66Var2.setText(gm.N2(jb6.M0(2131744656, null), -1, 0, new Runnable(this) {
            public final zwa b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                d dVar;
                byte b = r2;
                zwa zwaVar = this.b;
                switch (b) {
                    case 0:
                        apa apaVar = new apa(zwaVar.getContext());
                        if (!gm.O1() && !gm.s1(zwaVar.i1) && (dVar = zwaVar.i1) != null) {
                            apaVar.X(dVar);
                        }
                        apaVar.show();
                        return;
                    default:
                        l11.u(zwaVar.getContext(), jb6.M0(2131744655, null));
                        return;
                }
            }
        }, null));
        l66Var2.setGravity(17);
        l66Var2.setMaxWidth(hg5.a(l66Var2.getText(), l66Var2.getPaint()));
        frameLayout.addView(l66Var2, qoe.e(-2, -1, 17));
        anb.h(cmb.g5, ylbVar, frameLayout);
        this.b.addView(new uj4(getContext()), qoe.c(-1.0f, -1));
        l7c l7cVar = this.W1;
        if (l7cVar != null) {
            l7cVar.O(false);
        }
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(this.n1, getContext(), this.a, 0, true, new vh8(this, (byte) 25), this.J0);
        this.W1 = l7cVar;
        return l7cVar;
    }

    @Override
    public final void H() {
        super.H();
        nm7.f(this.a).n(this, nm7.y3);
        nm7.f(this.a).n(this, nm7.A3);
    }

    @Override
    public final CharSequence J0() {
        nh2 nh2Var = this.S1;
        if (nh2Var == null) {
            return null;
        }
        return ((TextView) nh2Var.c).getText();
    }

    public final void Y0(c6c c6cVar, long j, Boolean bool, String str) {
        Runnable runnable;
        if (getContext() != null) {
            if ((bool.booleanValue() || str != null) && (runnable = this.V1) != null) {
                runnable.run();
            }
            super.dismiss();
            d S = LaunchActivity.S();
            v16 v16Var = LaunchActivity.H1.w0;
            if (S != null) {
                if (bool.booleanValue()) {
                    u31 L = c41.b0(S).L(2131624220, jb6.M0(2131744789, null), gm.S2(jb6.G((int) c6cVar.C, "StarsGiftSentPopupInfo", m9c.l(this.U1))), jb6.M0(2131743236, null), new pz6((byte) 5, j));
                    L.j = 5000;
                    L.k(true);
                    if (v16Var != null) {
                        v16Var.c(true);
                    }
                    jva.v(this.a, false).P(true);
                } else if (str != null) {
                    c41.b0(S).Q(2131624012, 36, jb6.a0(null, null, 2131743565, str)).j();
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l7c l7cVar;
        if ((i == nm7.y3 || i == nm7.A3) && (l7cVar = this.W1) != null) {
            l7cVar.O(true);
        }
    }

    @Override
    public final void show() {
        ms1 ms1Var;
        d Q = LaunchActivity.Q();
        if (Q instanceof yv1) {
            yv1 yv1Var = (yv1) Q;
            if (yv1Var.Y7() && (ms1Var = yv1Var.a0) != null) {
                ms1Var.R();
            }
        }
        super.show();
    }
}
