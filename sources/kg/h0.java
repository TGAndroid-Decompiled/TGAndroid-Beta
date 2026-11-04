package kg;

import android.view.View;
import android.view.ViewPropertyAnimator;
public final class h0 extends u4.k {
    @Override
    public final void D(u4.d1 d1Var) {
        View view = d1Var.f55540a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(d1Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new g0(this, d1Var, animate, view, 0)).start();
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
    public final void p(u4.d1 d1Var) {
        super.p(d1Var);
        View view = d1Var.f55540a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
