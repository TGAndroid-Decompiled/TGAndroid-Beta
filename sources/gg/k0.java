package gg;

import android.view.View;
import android.view.ViewPropertyAnimator;
public final class k0 extends s4.j {
    @Override
    public final void D(s4.d1 d1Var) {
        View view = d1Var.f47656a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(d1Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new j0(this, d1Var, animate, view, 0)).start();
    }

    @Override
    public final long K(long j3, long j10, long j11) {
        return 0L;
    }

    @Override
    public final long L() {
        return 0L;
    }

    @Override
    public final long h() {
        return 220L;
    }

    @Override
    public final long j() {
        return 220L;
    }

    @Override
    public final void p(s4.d1 d1Var) {
        super.p(d1Var);
        View view = d1Var.f47656a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
