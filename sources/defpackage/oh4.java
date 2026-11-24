package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
public final class oh4 extends sc3 {
    @Override
    public final void D(u69 u69Var) {
        View view = u69Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(u69Var);
        animate.setDuration(this.d).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new rb2(this, u69Var, animate, view)).start();
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
    public final void p(u69 u69Var) {
        super.p(u69Var);
        View view = u69Var.a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
