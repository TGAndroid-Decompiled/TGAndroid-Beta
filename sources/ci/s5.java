package ci;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;
public final class s5 implements pg.u {
    public boolean f5511a;
    public final pg.u0 f5512b;
    public final qb f5513c;

    public s5(qb qbVar, pg.u0 u0Var) {
        this.f5513c = qbVar;
        this.f5512b = u0Var;
    }

    @Override
    public final void a() {
        this.f5511a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        g6 g6Var = this.f5513c.O0;
        Matrix matrix = g6Var.getMatrix();
        canvas.save();
        canvas.translate(g6Var.getX(), g6Var.getY());
        canvas.concat(matrix);
        g6Var.getWidth();
        throw null;
    }

    @Override
    public final boolean c() {
        return this.f5511a;
    }

    @Override
    public final void d() {
        this.f5511a = false;
    }

    @Override
    public final View e() {
        return this.f5513c;
    }

    @Override
    public final FrameLayout f() {
        return this.f5513c.V0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void h(int i10) {
        qb qbVar = this.f5513c;
        qbVar.I0(false);
        pg.u0 u0Var = this.f5512b;
        u0Var.h(i10, true);
        u0Var.g();
        qbVar.setNewColor(i10);
        r5 r5Var = qbVar.f5450w1;
        r5Var.setSelectedColorIndex(u0Var.d());
        r5Var.getAdapter().l();
    }
}
