package lh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;

public final class h5 implements yf.u {

    public boolean f16062a;

    public final yf.r0 f16063b;

    public final va f16064c;

    public h5(va vaVar, yf.r0 r0Var) {
        this.f16064c = vaVar;
        this.f16063b = r0Var;
    }

    @Override
    public final void a() {
        this.f16062a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        v5 v5Var = this.f16064c.K0;
        Matrix matrix = v5Var.getMatrix();
        canvas.save();
        canvas.translate(v5Var.getX(), v5Var.getY());
        canvas.concat(matrix);
        v5Var.getWidth();
        throw null;
    }

    @Override
    public final boolean c() {
        return this.f16062a;
    }

    @Override
    public final void d() {
        this.f16062a = false;
    }

    @Override
    public final View e() {
        return this.f16064c;
    }

    @Override
    public final FrameLayout f() {
        return this.f16064c.R0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void h(int i10) {
        va vaVar = this.f16064c;
        vaVar.I0(false);
        yf.r0 r0Var = this.f16063b;
        r0Var.h(i10, true);
        r0Var.g();
        vaVar.setNewColor(i10);
        g5 g5Var = vaVar.f15992s1;
        g5Var.setSelectedColorIndex(r0Var.d());
        g5Var.getAdapter().l();
    }
}
