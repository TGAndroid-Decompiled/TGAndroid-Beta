package dg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.mt0;
public final class i0 implements cg.y {
    public boolean f4573a;
    public final Bitmap f4574b;
    public final mt0 f4575c;

    public i0(mt0 mt0Var, Bitmap bitmap) {
        this.f4575c = mt0Var;
        this.f4574b = bitmap;
    }

    @Override
    public final void a() {
        this.f4573a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        s0 s0Var = this.f4575c.T0;
        Matrix matrix = s0Var.getMatrix();
        canvas.save();
        canvas.translate(s0Var.getX(), s0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f4574b;
        canvas.scale(s0Var.getWidth() / bitmap.getWidth(), s0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f4573a;
    }

    @Override
    public final void d() {
        this.f4573a = false;
    }

    @Override
    public final View e() {
        return this.f4575c;
    }

    @Override
    public final FrameLayout f() {
        return this.f4575c.f4465b1;
    }

    @Override
    public final boolean g() {
        if (this.f4574b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10) {
        mt0 mt0Var = this.f4575c;
        mt0Var.w0(false);
        cg.f1 f1Var = mt0Var.S1;
        f1Var.h(i10, true);
        f1Var.g();
        mt0Var.setNewColor(i10);
        z0 z0Var = mt0Var.D1;
        z0Var.setSelectedColorIndex(f1Var.d());
        z0Var.getAdapter().l();
    }
}
