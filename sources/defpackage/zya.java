package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class zya extends ny0 implements fn7 {
    public final rg2 S1;
    public final FrameLayout T1;
    public final TLRPC.User U1;
    public final Runnable V1;
    public l9c W1;
    public boolean X1;

    public zya(Context context, vnb vnbVar, TLRPC.User user, Runnable runnable) {
        super(context, null, false, false, vnbVar);
        this.U1 = user;
        this.V1 = runnable;
        this.u1 = 0.2f;
        jn7.f(this.a).b(this, jn7.y3);
        jn7.f(this.a).b(this, jn7.A3);
        J();
        d79 d79Var = this.n1;
        int i = this.u0;
        d79Var.setPadding(i, 0, i, 0);
        this.n1.setOnItemClickListener(new t39(this, (byte) 12));
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43.h);
        zb3Var.n(350L);
        this.n1.setItemAnimator(zb3Var);
        t0(aob.i5);
        rg2 rg2Var = new rg2(context, vnbVar, (byte) 7);
        this.S1 = rg2Var;
        ((TextView) rg2Var.c).setText(ob6.M0(2131749378, null));
        p66 p66Var = (p66) rg2Var.d;
        p66Var.setText(TextUtils.concat(hl.S2(ob6.a0(null, null, 2131749380, lbc.l(user))), " ", hl.D2(hl.P2(ob6.M0(2131749379, null).replace(' ', (char) 160), new Runnable(this) {
            public final zya b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                e eVar;
                byte b = r2;
                zya zyaVar = this.b;
                switch (b) {
                    case 0:
                        wqa wqaVar = new wqa(zyaVar.getContext());
                        if (!hl.O1() && !hl.s1(zyaVar.i1) && (eVar = zyaVar.i1) != null) {
                            wqaVar.X(eVar);
                        }
                        wqaVar.show();
                        return;
                    default:
                        m01.u(zyaVar.getContext(), ob6.M0(2131744623, null));
                        return;
                }
            }
        }), true)));
        p66Var.setMaxWidth(kg5.a(p66Var.getText(), p66Var.getPaint()) + 1);
        this.o1.setTitle(K0());
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.q(user);
        ((de0) rg2Var.b).f(user, rb0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        p66 p66Var2 = new p66(context, vnbVar);
        frameLayout.setPadding(0, hl.L(11.0f), 0, hl.L(11.0f));
        p66Var2.setTextSize(1, 12.0f);
        yob.X(p66Var2, aob.B6, vnbVar);
        yob.G(p66Var2, aob.Xc, vnbVar);
        p66Var2.setText(hl.N2(ob6.M0(2131744624, null), -1, 0, new Runnable(this) {
            public final zya b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                e eVar;
                byte b = r2;
                zya zyaVar = this.b;
                switch (b) {
                    case 0:
                        wqa wqaVar = new wqa(zyaVar.getContext());
                        if (!hl.O1() && !hl.s1(zyaVar.i1) && (eVar = zyaVar.i1) != null) {
                            wqaVar.X(eVar);
                        }
                        wqaVar.show();
                        return;
                    default:
                        m01.u(zyaVar.getContext(), ob6.M0(2131744623, null));
                        return;
                }
            }
        }, null));
        p66Var2.setGravity(17);
        p66Var2.setMaxWidth(kg5.a(p66Var2.getText(), p66Var2.getPaint()));
        frameLayout.addView(p66Var2, tre.e(-2, -1, 17));
        yob.h(aob.h5, vnbVar, frameLayout);
        this.b.addView(new tj4(getContext()), tre.c(-1.0f, -1));
        l9c l9cVar = this.W1;
        if (l9cVar != null) {
            l9cVar.O(false);
        }
    }

    @Override
    public final void H() {
        super.H();
        jn7.f(this.a).n(this, jn7.y3);
        jn7.f(this.a).n(this, jn7.A3);
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(this.n1, getContext(), this.a, 0, true, new hj8(this, (byte) 25), this.J0);
        this.W1 = l9cVar;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        rg2 rg2Var = this.S1;
        if (rg2Var == null) {
            return null;
        }
        return ((TextView) rg2Var.c).getText();
    }

    public final void Z0(b8c b8cVar, long j, Boolean bool, String str) {
        Runnable runnable;
        if (getContext() != null) {
            if ((bool.booleanValue() || str != null) && (runnable = this.V1) != null) {
                runnable.run();
            }
            super.dismiss();
            e S = LaunchActivity.S();
            y16 y16Var = LaunchActivity.H1.w0;
            if (S != null) {
                if (bool.booleanValue()) {
                    v21 L = d31.b0(S).L(2131624220, ob6.M0(2131744757, null), hl.S2(ob6.G((int) b8cVar.C, "StarsGiftSentPopupInfo", lbc.l(this.U1))), ob6.M0(2131743204, null), new tz6((byte) 5, j));
                    L.j = 5000;
                    L.k(true);
                    if (y16Var != null) {
                        y16Var.c(true);
                    }
                    jxa.v(this.a, false).Q(true);
                } else if (str != null) {
                    d31.b0(S).Q(2131624012, 36, ob6.a0(null, null, 2131743533, str)).j();
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l9c l9cVar;
        if ((i == jn7.y3 || i == jn7.A3) && (l9cVar = this.W1) != null) {
            l9cVar.O(true);
        }
    }

    @Override
    public final void show() {
        nr1 nr1Var;
        e Q = LaunchActivity.Q();
        if (Q instanceof zu1) {
            zu1 zu1Var = (zu1) Q;
            if (zu1Var.Y7() && (nr1Var = zu1Var.a0) != null) {
                nr1Var.U();
            }
        }
        super.show();
    }
}
