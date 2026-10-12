package ci;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;
public final class q5 implements pg.u {
    public boolean f5785a;
    public final pg.t0 f5786b;
    public final nb f5787c;

    public q5(nb nbVar, pg.t0 t0Var) {
        this.f5787c = nbVar;
        this.f5786b = t0Var;
    }

    @Override
    public final void a() {
        this.f5785a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        f6 f6Var = this.f5787c.O0;
        Matrix matrix = f6Var.getMatrix();
        canvas.save();
        canvas.translate(f6Var.getX(), f6Var.getY());
        canvas.concat(matrix);
        f6Var.getWidth();
        throw null;
    }

    @Override
    public final boolean c() {
        return this.f5785a;
    }

    @Override
    public final void d() {
        this.f5785a = false;
    }

    @Override
    public final View e() {
        return this.f5787c;
    }

    @Override
    public final FrameLayout f() {
        return this.f5787c.V0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void h(int i10) {
        nb nbVar = this.f5787c;
        nbVar.H0(false);
        pg.t0 t0Var = this.f5786b;
        t0Var.h(i10, true);
        t0Var.g();
        nbVar.setNewColor(i10);
        p5 p5Var = nbVar.f5830w1;
        p5Var.setSelectedColorIndex(t0Var.d());
        p5Var.getAdapter().l();
    }
}
