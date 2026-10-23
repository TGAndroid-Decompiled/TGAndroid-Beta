package hg;

import android.view.View;
import android.view.ViewPropertyAnimator;
public final class k0 extends s4.k {
    @Override
    public final void D(s4.b1 b1Var) {
        View view = b1Var.f46343a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(b1Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new j0(this, b1Var, animate, view, 0)).start();
    }

    @Override
    public final long K(long j10, long j11, long j12) {
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
    public final void p(s4.b1 b1Var) {
        super.p(b1Var);
        View view = b1Var.f46343a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
