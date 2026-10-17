package ei;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;
public final class h5 implements qg.v {
    public boolean f9157a;
    public final qg.u0 f9158b;
    public final xa f9159c;

    public h5(xa xaVar, qg.u0 u0Var) {
        this.f9159c = xaVar;
        this.f9158b = u0Var;
    }

    @Override
    public final void a() {
        this.f9157a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        v5 v5Var = this.f9159c.O0;
        Matrix matrix = v5Var.getMatrix();
        canvas.save();
        canvas.translate(v5Var.getX(), v5Var.getY());
        canvas.concat(matrix);
        v5Var.getWidth();
        throw null;
    }

    @Override
    public final boolean c() {
        return this.f9157a;
    }

    @Override
    public final void d() {
        this.f9157a = false;
    }

    @Override
    public final View e() {
        return this.f9159c;
    }

    @Override
    public final FrameLayout f() {
        return this.f9159c.V0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void h(int i10) {
        xa xaVar = this.f9159c;
        xaVar.H0(false);
        qg.u0 u0Var = this.f9158b;
        u0Var.h(i10, true);
        u0Var.g();
        xaVar.setNewColor(i10);
        g5 g5Var = xaVar.f9043w1;
        g5Var.setSelectedColorIndex(u0Var.d());
        g5Var.getAdapter().l();
    }
}
