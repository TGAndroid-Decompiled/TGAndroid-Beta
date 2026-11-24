package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class xfb extends mz0 implements jm7 {
    public final nk S1;
    public final nh2 T1;
    public final FrameLayout U1;
    public Runnable V1;
    public int W1;
    public l7c X1;

    public xfb(Context context, ylb ylbVar, nk nkVar, Runnable runnable) {
        super(context, null, false, false, ylbVar);
        this.u1 = 0.2f;
        this.V1 = runnable;
        J();
        r59 r59Var = this.n1;
        int i = this.u0;
        r59Var.setPadding(i, 0, i, 0);
        this.n1.setOnItemClickListener(new s19(this, (byte) 21));
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53.h);
        sc3Var.n(350L);
        this.n1.setItemAnimator(sc3Var);
        s0(cmb.v0(cmb.g5, ylbVar));
        this.S1 = nkVar;
        nh2 nh2Var = new nh2(context, ylbVar, (byte) 7);
        this.T1 = nh2Var;
        ((TextView) nh2Var.c).setText(jb6.a0(null, null, 2131743730, nk.j(nkVar.b - jva.v(this.a, true).p().b, ok.b).d()));
        ((TextView) nh2Var.d).setVisibility(8);
        this.o1.setTitle(J0());
        FrameLayout frameLayout = new FrameLayout(context);
        this.U1 = frameLayout;
        b61 b61Var = new b61(this.J0, getContext(), true);
        b61Var.setRoundRadius(24);
        frameLayout.addView(b61Var, qoe.t(-1, 48, 17, 20, 24, 20, 20));
        b61Var.i(jb6.M0(2131751978, null), false, true);
        b61Var.setOnClickListener(new oha(this, (byte) 19));
        l7c l7cVar = this.X1;
        if (l7cVar != null) {
            l7cVar.O(false);
        }
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(this.n1, getContext(), this.a, 0, true, new o6b(this, (byte) 4), this.J0);
        this.X1 = l7cVar;
        return l7cVar;
    }

    @Override
    public final void H() {
        super.H();
        nm7.f(this.a).n(this, nm7.x3);
        nm7.f(this.a).n(this, nm7.A3);
    }

    @Override
    public final CharSequence J0() {
        nh2 nh2Var = this.T1;
        if (nh2Var == null) {
            return null;
        }
        return ((TextView) nh2Var.c).getText();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Runnable runnable;
        if (i == nm7.x3 || i == nm7.A3) {
            l7c l7cVar = this.X1;
            if (l7cVar != null) {
                l7cVar.O(true);
            }
            nk p = jva.v(this.a, true).p();
            nk nkVar = this.S1;
            ((TextView) this.T1.c).setText(jb6.a0(null, null, 2131743730, nk.j(nkVar.b - p.b, ok.b).d()));
            iz0 iz0Var = this.o1;
            if (iz0Var != null) {
                iz0Var.setTitle(J0());
            }
            if (p.b >= nkVar.b && (runnable = this.V1) != null) {
                runnable.run();
                this.V1 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        nh2 nh2Var = this.T1;
        if (nh2Var != null) {
            ((npc) nh2Var.b).setPaused(true);
        }
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            int v0 = cmb.v0(cmb.g5, this.J0);
            if (v0 != this.W1) {
                this.W1 = v0;
                s0(v0);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void show() {
        ms1 ms1Var;
        if (jva.v(this.a, true).p().b >= this.S1.b) {
            Runnable runnable = this.V1;
            if (runnable != null) {
                runnable.run();
                this.V1 = null;
                return;
            }
            return;
        }
        d Q = LaunchActivity.Q();
        if (Q instanceof yv1) {
            yv1 yv1Var = (yv1) Q;
            if (yv1Var.Y7() && (ms1Var = yv1Var.a0) != null) {
                ms1Var.R();
            }
        }
        super.show();
        nm7.f(this.a).b(this, nm7.x3);
        nm7.f(this.a).b(this, nm7.A3);
    }
}
