package ci;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;
public final class s5 implements pg.u {
    public boolean f5512a;
    public final pg.s0 f5513b;
    public final qb f5514c;

    public s5(qb qbVar, pg.s0 s0Var) {
        this.f5514c = qbVar;
        this.f5513b = s0Var;
    }

    @Override
    public final void a() {
        this.f5512a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        g6 g6Var = this.f5514c.O0;
        Matrix matrix = g6Var.getMatrix();
        canvas.save();
        canvas.translate(g6Var.getX(), g6Var.getY());
        canvas.concat(matrix);
        g6Var.getWidth();
        throw null;
    }

    @Override
    public final boolean c() {
        return this.f5512a;
    }

    @Override
    public final void d() {
        this.f5512a = false;
    }

    @Override
    public final View e() {
        return this.f5514c;
    }

    @Override
    public final FrameLayout f() {
        return this.f5514c.V0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void h(int i10) {
        qb qbVar = this.f5514c;
        qbVar.I0(false);
        pg.s0 s0Var = this.f5513b;
        s0Var.h(i10, true);
        s0Var.g();
        qbVar.setNewColor(i10);
        r5 r5Var = qbVar.f5451w1;
        r5Var.setSelectedColorIndex(s0Var.d());
        r5Var.getAdapter().l();
    }
}
