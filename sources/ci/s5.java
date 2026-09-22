package ci;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;
public final class s5 implements pg.u {
    public boolean f5509a;
    public final pg.s0 f5510b;
    public final qb f5511c;

    public s5(qb qbVar, pg.s0 s0Var) {
        this.f5511c = qbVar;
        this.f5510b = s0Var;
    }

    @Override
    public final void a() {
        this.f5509a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        g6 g6Var = this.f5511c.O0;
        Matrix matrix = g6Var.getMatrix();
        canvas.save();
        canvas.translate(g6Var.getX(), g6Var.getY());
        canvas.concat(matrix);
        g6Var.getWidth();
        throw null;
    }

    @Override
    public final boolean c() {
        return this.f5509a;
    }

    @Override
    public final void d() {
        this.f5509a = false;
    }

    @Override
    public final View e() {
        return this.f5511c;
    }

    @Override
    public final FrameLayout f() {
        return this.f5511c.V0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void h(int i10) {
        qb qbVar = this.f5511c;
        qbVar.I0(false);
        pg.s0 s0Var = this.f5510b;
        s0Var.h(i10, true);
        s0Var.g();
        qbVar.setNewColor(i10);
        r5 r5Var = qbVar.f5448w1;
        r5Var.setSelectedColorIndex(s0Var.d());
        r5Var.getAdapter().l();
    }
}
