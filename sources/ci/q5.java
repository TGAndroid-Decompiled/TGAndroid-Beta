package ci;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;
public final class q5 implements pg.u {
    public boolean f5786a;
    public final pg.u0 f5787b;
    public final nb f5788c;

    public q5(nb nbVar, pg.u0 u0Var) {
        this.f5788c = nbVar;
        this.f5787b = u0Var;
    }

    @Override
    public final void a() {
        this.f5786a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        f6 f6Var = this.f5788c.O0;
        Matrix matrix = f6Var.getMatrix();
        canvas.save();
        canvas.translate(f6Var.getX(), f6Var.getY());
        canvas.concat(matrix);
        f6Var.getWidth();
        throw null;
    }

    @Override
    public final boolean c() {
        return this.f5786a;
    }

    @Override
    public final void d() {
        this.f5786a = false;
    }

    @Override
    public final View e() {
        return this.f5788c;
    }

    @Override
    public final FrameLayout f() {
        return this.f5788c.V0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void h(int i10) {
        nb nbVar = this.f5788c;
        nbVar.H0(false);
        pg.u0 u0Var = this.f5787b;
        u0Var.h(i10, true);
        u0Var.g();
        nbVar.setNewColor(i10);
        p5 p5Var = nbVar.f5831w1;
        p5Var.setSelectedColorIndex(u0Var.d());
        p5Var.getAdapter().l();
    }
}
