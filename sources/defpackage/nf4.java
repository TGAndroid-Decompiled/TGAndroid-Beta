package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
public final class nf4 extends gb3 {
    @Override
    public final void D(s49 s49Var) {
        View view = s49Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(s49Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new ga2(this, s49Var, animate, view)).start();
    }

    @Override
    public final long K(long j, long j2, long j3) {
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
    public final void p(s49 s49Var) {
        super.p(s49Var);
        View view = s49Var.a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
