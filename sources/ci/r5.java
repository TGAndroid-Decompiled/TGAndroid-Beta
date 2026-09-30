package ci;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;
public final class r5 implements pg.u {
    public boolean f5462a;
    public final pg.u0 f5463b;
    public final nb f5464c;

    public r5(nb nbVar, pg.u0 u0Var) {
        this.f5464c = nbVar;
        this.f5463b = u0Var;
    }

    @Override
    public final void a() {
        this.f5462a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        f6 f6Var = this.f5464c.O0;
        Matrix matrix = f6Var.getMatrix();
        canvas.save();
        canvas.translate(f6Var.getX(), f6Var.getY());
        canvas.concat(matrix);
        f6Var.getWidth();
        throw null;
    }

    @Override
    public final boolean c() {
        return this.f5462a;
    }

    @Override
    public final void d() {
        this.f5462a = false;
    }

    @Override
    public final View e() {
        return this.f5464c;
    }

    @Override
    public final FrameLayout f() {
        return this.f5464c.V0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void h(int i10) {
        nb nbVar = this.f5464c;
        nbVar.I0(false);
        pg.u0 u0Var = this.f5463b;
        u0Var.h(i10, true);
        u0Var.g();
        nbVar.setNewColor(i10);
        q5 q5Var = nbVar.f5382w1;
        q5Var.setSelectedColorIndex(u0Var.d());
        q5Var.getAdapter().l();
    }
}
