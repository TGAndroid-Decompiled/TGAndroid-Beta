package bi;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;
public final class q6 implements og.v {
    public boolean f3455a;
    public final og.x0 f3456b;
    public final ad f3457c;

    public q6(ad adVar, og.x0 x0Var) {
        this.f3457c = adVar;
        this.f3456b = x0Var;
    }

    @Override
    public final void a() {
        this.f3455a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        f7 f7Var = this.f3457c.O0;
        Matrix matrix = f7Var.getMatrix();
        canvas.save();
        canvas.translate(f7Var.getX(), f7Var.getY());
        canvas.concat(matrix);
        f7Var.getWidth();
        throw null;
    }

    @Override
    public final boolean c() {
        return this.f3455a;
    }

    @Override
    public final void d() {
        this.f3455a = false;
    }

    @Override
    public final View e() {
        return this.f3457c;
    }

    @Override
    public final FrameLayout f() {
        return this.f3457c.V0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void h(int i10) {
        ad adVar = this.f3457c;
        adVar.I0(false);
        og.x0 x0Var = this.f3456b;
        x0Var.h(i10, true);
        x0Var.g();
        adVar.setNewColor(i10);
        p6 p6Var = adVar.f3542w1;
        p6Var.setSelectedColorIndex(x0Var.d());
        p6Var.getAdapter().l();
    }
}
