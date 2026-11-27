package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
public final class lh4 extends zb3 {
    @Override
    public final void D(f89 f89Var) {
        View view = f89Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(f89Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new wa2(this, f89Var, animate, view)).start();
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
    public final void p(f89 f89Var) {
        super.p(f89Var);
        View view = f89Var.a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
