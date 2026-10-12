package di;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;
public final class q5 implements qg.u {
    public boolean f7644a;
    public final qg.s0 f7645b;
    public final mb f7646c;

    public q5(mb mbVar, qg.s0 s0Var) {
        this.f7646c = mbVar;
        this.f7645b = s0Var;
    }

    @Override
    public final void a() {
        this.f7644a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        e6 e6Var = this.f7646c.O0;
        Matrix matrix = e6Var.getMatrix();
        canvas.save();
        canvas.translate(e6Var.getX(), e6Var.getY());
        canvas.concat(matrix);
        e6Var.getWidth();
        throw null;
    }

    @Override
    public final boolean c() {
        return this.f7644a;
    }

    @Override
    public final void d() {
        this.f7644a = false;
    }

    @Override
    public final View e() {
        return this.f7646c;
    }

    @Override
    public final FrameLayout f() {
        return this.f7646c.V0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void h(int i10) {
        mb mbVar = this.f7646c;
        mbVar.H0(false);
        qg.s0 s0Var = this.f7645b;
        s0Var.h(i10, true);
        s0Var.g();
        mbVar.setNewColor(i10);
        p5 p5Var = mbVar.f7554w1;
        p5Var.setSelectedColorIndex(s0Var.d());
        p5Var.getAdapter().l();
    }
}
