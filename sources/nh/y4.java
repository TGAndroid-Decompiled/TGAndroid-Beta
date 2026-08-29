package nh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;
public final class y4 implements ag.z {
    public boolean f18872a;
    public final ag.h1 f18873b;
    public final ja f18874c;

    public y4(ja jaVar, ag.h1 h1Var) {
        this.f18874c = jaVar;
        this.f18873b = h1Var;
    }

    @Override
    public final void a() {
        this.f18872a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        j5 j5Var = this.f18874c.K0;
        Matrix matrix = j5Var.getMatrix();
        canvas.save();
        canvas.translate(j5Var.getX(), j5Var.getY());
        canvas.concat(matrix);
        j5Var.getWidth();
        throw null;
    }

    @Override
    public final boolean c() {
        return this.f18872a;
    }

    @Override
    public final void d() {
        this.f18872a = false;
    }

    @Override
    public final View e() {
        return this.f18874c;
    }

    @Override
    public final FrameLayout f() {
        return this.f18874c.R0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void h(int i10) {
        ja jaVar = this.f18874c;
        jaVar.I0(false);
        ag.h1 h1Var = this.f18873b;
        h1Var.h(i10, true);
        h1Var.g();
        jaVar.setNewColor(i10);
        x4 x4Var = jaVar.f18657s1;
        x4Var.setSelectedColorIndex(h1Var.d());
        x4Var.getAdapter().l();
    }
}
