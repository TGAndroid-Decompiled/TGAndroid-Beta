package ci;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;
public final class r5 implements pg.u {
    public boolean f5863a;
    public final pg.u0 f5864b;
    public final mb f5865c;

    public r5(mb mbVar, pg.u0 u0Var) {
        this.f5865c = mbVar;
        this.f5864b = u0Var;
    }

    @Override
    public final void a() {
        this.f5863a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        f6 f6Var = this.f5865c.O0;
        Matrix matrix = f6Var.getMatrix();
        canvas.save();
        canvas.translate(f6Var.getX(), f6Var.getY());
        canvas.concat(matrix);
        f6Var.getWidth();
        throw null;
    }

    @Override
    public final boolean c() {
        return this.f5863a;
    }

    @Override
    public final void d() {
        this.f5863a = false;
    }

    @Override
    public final View e() {
        return this.f5865c;
    }

    @Override
    public final FrameLayout f() {
        return this.f5865c.V0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void h(int i10) {
        mb mbVar = this.f5865c;
        mbVar.I0(false);
        pg.u0 u0Var = this.f5864b;
        u0Var.h(i10, true);
        u0Var.g();
        mbVar.setNewColor(i10);
        q5 q5Var = mbVar.f5787w1;
        q5Var.setSelectedColorIndex(u0Var.d());
        q5Var.getAdapter().l();
    }
}
