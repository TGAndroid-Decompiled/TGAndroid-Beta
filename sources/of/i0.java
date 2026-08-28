package of;

import android.view.View;
import android.view.ViewPropertyAnimator;
public final class i0 extends f2.n {
    @Override
    public final void D(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(q1Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new h0(this, q1Var, animate, view, 0)).start();
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
    public final void p(f2.q1 q1Var) {
        super.p(q1Var);
        View view = q1Var.f5501a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
