package kh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;
public final class i5 implements xf.u {
    public boolean f15425a;
    public final xf.s0 f15426b;
    public final ya f15427c;

    public i5(ya yaVar, xf.s0 s0Var) {
        this.f15427c = yaVar;
        this.f15426b = s0Var;
    }

    @Override
    public final void a() {
        this.f15425a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        w5 w5Var = this.f15427c.K0;
        Matrix matrix = w5Var.getMatrix();
        canvas.save();
        canvas.translate(w5Var.getX(), w5Var.getY());
        canvas.concat(matrix);
        w5Var.getWidth();
        throw null;
    }

    @Override
    public final boolean c() {
        return this.f15425a;
    }

    @Override
    public final void d() {
        this.f15425a = false;
    }

    @Override
    public final View e() {
        return this.f15427c;
    }

    @Override
    public final FrameLayout f() {
        return this.f15427c.R0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void h(int i9) {
        ya yaVar = this.f15427c;
        yaVar.I0(false);
        xf.s0 s0Var = this.f15426b;
        s0Var.h(i9, true);
        s0Var.g();
        yaVar.setNewColor(i9);
        h5 h5Var = yaVar.f15302s1;
        h5Var.setSelectedColorIndex(s0Var.d());
        h5Var.getAdapter().l();
    }
}
