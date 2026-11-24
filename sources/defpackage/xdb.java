package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class xdb extends fy0 implements gk7 {
    public final nj S1;
    public final zf2 T1;
    public final FrameLayout U1;
    public Runnable V1;
    public int W1;
    public l5c X1;

    public xdb(Context context, wjb wjbVar, nj njVar, Runnable runnable) {
        super(context, null, false, false, wjbVar);
        this.u1 = 0.2f;
        this.V1 = runnable;
        K();
        o39 o39Var = this.n1;
        int i = this.u0;
        o39Var.setPadding(i, 0, i, 0);
        this.n1.setOnItemClickListener(new f09(this, (byte) 20));
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33.h);
        gb3Var.n(350L);
        this.n1.setItemAnimator(gb3Var);
        s0(bkb.v0(bkb.g5, wjbVar));
        this.S1 = njVar;
        zf2 zf2Var = new zf2(context, wjbVar, (byte) 7);
        this.T1 = zf2Var;
        ((TextView) zf2Var.c).setText(k96.a0(null, null, 2131743804, nj.j(njVar.b - gta.v(this.a, true).p().b, oj.b).d()));
        ((TextView) zf2Var.d).setVisibility(8);
        this.o1.setTitle(J0());
        FrameLayout frameLayout = new FrameLayout(context);
        this.U1 = frameLayout;
        u41 u41Var = new u41(this.J0, getContext(), true);
        u41Var.setRoundRadius(24);
        frameLayout.addView(u41Var, nme.t(-1, 48, 17, 20, 24, 20, 20));
        u41Var.i(k96.M0(2131752029, null), false, true);
        u41Var.setOnClickListener(new bna(this, (byte) 16));
        l5c l5cVar = this.X1;
        if (l5cVar != null) {
            l5cVar.O(false);
        }
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(this.n1, getContext(), this.a, 0, true, new n4b(this, (byte) 4), this.J0);
        this.X1 = l5cVar;
        return l5cVar;
    }

    @Override
    public final void I() {
        super.I();
        kk7.f(this.a).n(this, kk7.w3);
        kk7.f(this.a).n(this, kk7.z3);
    }

    @Override
    public final CharSequence J0() {
        zf2 zf2Var = this.T1;
        if (zf2Var == null) {
            return null;
        }
        return ((TextView) zf2Var.c).getText();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Runnable runnable;
        if (i == kk7.w3 || i == kk7.z3) {
            l5c l5cVar = this.X1;
            if (l5cVar != null) {
                l5cVar.O(true);
            }
            nj p = gta.v(this.a, true).p();
            nj njVar = this.S1;
            ((TextView) this.T1.c).setText(k96.a0(null, null, 2131743804, nj.j(njVar.b - p.b, oj.b).d()));
            by0 by0Var = this.o1;
            if (by0Var != null) {
                by0Var.setTitle(J0());
            }
            if (p.b >= njVar.b && (runnable = this.V1) != null) {
                runnable.run();
                this.V1 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        zf2 zf2Var = this.T1;
        if (zf2Var != null) {
            ((lnc) zf2Var.b).setPaused(true);
        }
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            int v0 = bkb.v0(bkb.g5, this.J0);
            if (v0 != this.W1) {
                this.W1 = v0;
                s0(v0);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void show() {
        ar1 ar1Var;
        if (gta.v(this.a, true).p().b >= this.S1.b) {
            Runnable runnable = this.V1;
            if (runnable != null) {
                runnable.run();
                this.V1 = null;
                return;
            }
            return;
        }
        d Q = LaunchActivity.Q();
        if (Q instanceof mu1) {
            mu1 mu1Var = (mu1) Q;
            if (mu1Var.O7() && (ar1Var = mu1Var.a0) != null) {
                ar1Var.S();
            }
        }
        super.show();
        kk7.f(this.a).b(this, kk7.w3);
        kk7.f(this.a).b(this, kk7.z3);
    }
}
