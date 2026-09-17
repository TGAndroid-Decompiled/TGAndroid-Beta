package di;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;
public final class s5 implements qg.u {
    public boolean f8120a;
    public final qg.s0 f8121b;
    public final rb f8122c;

    public s5(rb rbVar, qg.s0 s0Var) {
        this.f8122c = rbVar;
        this.f8121b = s0Var;
    }

    @Override
    public final void a() {
        this.f8120a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        g6 g6Var = this.f8122c.O0;
        Matrix matrix = g6Var.getMatrix();
        canvas.save();
        canvas.translate(g6Var.getX(), g6Var.getY());
        canvas.concat(matrix);
        g6Var.getWidth();
        throw null;
    }

    @Override
    public final boolean c() {
        return this.f8120a;
    }

    @Override
    public final void d() {
        this.f8120a = false;
    }

    @Override
    public final View e() {
        return this.f8122c;
    }

    @Override
    public final FrameLayout f() {
        return this.f8122c.V0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void h(int i10) {
        rb rbVar = this.f8122c;
        rbVar.I0(false);
        qg.s0 s0Var = this.f8121b;
        s0Var.h(i10, true);
        s0Var.g();
        rbVar.setNewColor(i10);
        r5 r5Var = rbVar.f7995w1;
        r5Var.setSelectedColorIndex(s0Var.d());
        r5Var.getAdapter().l();
    }
}
