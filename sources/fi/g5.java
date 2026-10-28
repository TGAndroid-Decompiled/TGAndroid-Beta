package fi;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;
public final class g5 implements rg.v {
    public boolean f10902a;
    public final rg.s0 f10903b;
    public final ta f10904c;

    public g5(ta taVar, rg.s0 s0Var) {
        this.f10904c = taVar;
        this.f10903b = s0Var;
    }

    @Override
    public final void a() {
        this.f10902a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        u5 u5Var = this.f10904c.D0;
        Matrix matrix = u5Var.getMatrix();
        canvas.save();
        canvas.translate(u5Var.getX(), u5Var.getY());
        canvas.concat(matrix);
        u5Var.getWidth();
        throw null;
    }

    @Override
    public final boolean c() {
        return this.f10902a;
    }

    @Override
    public final void d() {
        this.f10902a = false;
    }

    @Override
    public final View e() {
        return this.f10904c;
    }

    @Override
    public final FrameLayout f() {
        return this.f10904c.K0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void h(int i10) {
        ta taVar = this.f10904c;
        taVar.F0(false);
        rg.s0 s0Var = this.f10903b;
        s0Var.h(i10, true);
        s0Var.g();
        taVar.setNewColor(i10);
        f5 f5Var = taVar.l1;
        f5Var.setSelectedColorIndex(s0Var.d());
        f5Var.getAdapter().l();
    }
}
