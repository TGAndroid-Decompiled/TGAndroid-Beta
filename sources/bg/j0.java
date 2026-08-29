package bg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ws0;
public final class j0 implements ag.z {
    public boolean f2329a;
    public final Bitmap f2330b;
    public final ws0 f2331c;

    public j0(ws0 ws0Var, Bitmap bitmap) {
        this.f2331c = ws0Var;
        this.f2330b = bitmap;
    }

    @Override
    public final void a() {
        this.f2329a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        t0 t0Var = this.f2331c.S0;
        Matrix matrix = t0Var.getMatrix();
        canvas.save();
        canvas.translate(t0Var.getX(), t0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f2330b;
        canvas.scale(t0Var.getWidth() / bitmap.getWidth(), t0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f2329a;
    }

    @Override
    public final void d() {
        this.f2329a = false;
    }

    @Override
    public final View e() {
        return this.f2331c;
    }

    @Override
    public final FrameLayout f() {
        return this.f2331c.f2224a1;
    }

    @Override
    public final boolean g() {
        if (this.f2330b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10) {
        ws0 ws0Var = this.f2331c;
        ws0Var.w0(false);
        ag.h1 h1Var = ws0Var.R1;
        h1Var.h(i10, true);
        h1Var.g();
        ws0Var.setNewColor(i10);
        a1 a1Var = ws0Var.C1;
        a1Var.setSelectedColorIndex(h1Var.d());
        a1Var.getAdapter().l();
    }
}
