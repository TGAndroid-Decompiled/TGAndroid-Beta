package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class shb extends ny0 implements fn7 {
    public final oj S1;
    public final rg2 T1;
    public final FrameLayout U1;
    public Runnable V1;
    public int W1;
    public l9c X1;

    public shb(Context context, vnb vnbVar, oj ojVar, Runnable runnable) {
        super(context, null, false, false, vnbVar);
        this.u1 = 0.2f;
        this.V1 = runnable;
        J();
        d79 d79Var = this.n1;
        int i = this.u0;
        d79Var.setPadding(i, 0, i, 0);
        this.n1.setOnItemClickListener(new t39(this, (byte) 20));
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43.h);
        zb3Var.n(350L);
        this.n1.setItemAnimator(zb3Var);
        s0(aob.v0(aob.h5, vnbVar));
        this.S1 = ojVar;
        rg2 rg2Var = new rg2(context, vnbVar, (byte) 8);
        this.T1 = rg2Var;
        ((TextView) rg2Var.c).setText(ob6.a0(null, null, 2131743698, oj.j(ojVar.b - jxa.v(this.a, true).p().b, pj.b).d()));
        ((TextView) rg2Var.d).setVisibility(8);
        this.o1.setTitle(K0());
        FrameLayout frameLayout = new FrameLayout(context);
        this.U1 = frameLayout;
        c51 c51Var = new c51(this.J0, getContext(), true);
        c51Var.setRoundRadius(24);
        frameLayout.addView(c51Var, tre.t(-1, 48, 17, 20, 24, 20, 20));
        c51Var.i(ob6.M0(2131752006, null), false, true);
        c51Var.setOnClickListener(new kla(this, (byte) 17));
        l9c l9cVar = this.X1;
        if (l9cVar != null) {
            l9cVar.O(false);
        }
    }

    @Override
    public final void H() {
        super.H();
        jn7.f(this.a).n(this, jn7.x3);
        jn7.f(this.a).n(this, jn7.A3);
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(this.n1, getContext(), this.a, 0, true, new l8b(this, (byte) 4), this.J0);
        this.X1 = l9cVar;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        rg2 rg2Var = this.T1;
        if (rg2Var == null) {
            return null;
        }
        return ((TextView) rg2Var.c).getText();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Runnable runnable;
        if (i == jn7.x3 || i == jn7.A3) {
            l9c l9cVar = this.X1;
            if (l9cVar != null) {
                l9cVar.O(true);
            }
            oj p = jxa.v(this.a, true).p();
            oj ojVar = this.S1;
            ((TextView) this.T1.c).setText(ob6.a0(null, null, 2131743698, oj.j(ojVar.b - p.b, pj.b).d()));
            jy0 jy0Var = this.o1;
            if (jy0Var != null) {
                jy0Var.setTitle(K0());
            }
            if (p.b >= ojVar.b && (runnable = this.V1) != null) {
                runnable.run();
                this.V1 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        rg2 rg2Var = this.T1;
        if (rg2Var != null) {
            ((yrc) rg2Var.b).setPaused(true);
        }
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            int v0 = aob.v0(aob.h5, this.J0);
            if (v0 != this.W1) {
                this.W1 = v0;
                s0(v0);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void show() {
        nr1 nr1Var;
        if (jxa.v(this.a, true).p().b >= this.S1.b) {
            Runnable runnable = this.V1;
            if (runnable != null) {
                runnable.run();
                this.V1 = null;
                return;
            }
            return;
        }
        e Q = LaunchActivity.Q();
        if (Q instanceof zu1) {
            zu1 zu1Var = (zu1) Q;
            if (zu1Var.Y7() && (nr1Var = zu1Var.a0) != null) {
                nr1Var.U();
            }
        }
        super.show();
        jn7.f(this.a).b(this, jn7.x3);
        jn7.f(this.a).b(this, jn7.A3);
    }
}
