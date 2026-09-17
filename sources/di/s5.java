package di;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;
public final class s5 implements qg.u {
    public boolean f8148a;
    public final qg.s0 f8149b;
    public final rb f8150c;

    public s5(rb rbVar, qg.s0 s0Var) {
        this.f8150c = rbVar;
        this.f8149b = s0Var;
    }

    @Override
    public final void a() {
        this.f8148a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        g6 g6Var = this.f8150c.O0;
        Matrix matrix = g6Var.getMatrix();
        canvas.save();
        canvas.translate(g6Var.getX(), g6Var.getY());
        canvas.concat(matrix);
        g6Var.getWidth();
        throw null;
    }

    @Override
    public final boolean c() {
        return this.f8148a;
    }

    @Override
    public final void d() {
        this.f8148a = false;
    }

    @Override
    public final View e() {
        return this.f8150c;
    }

    @Override
    public final FrameLayout f() {
        return this.f8150c.V0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void h(int i10) {
        rb rbVar = this.f8150c;
        rbVar.I0(false);
        qg.s0 s0Var = this.f8149b;
        s0Var.h(i10, true);
        s0Var.g();
        rbVar.setNewColor(i10);
        r5 r5Var = rbVar.f8023w1;
        r5Var.setSelectedColorIndex(s0Var.d());
        r5Var.getAdapter().l();
    }
}
