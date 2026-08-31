package eg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ht0;
public final class g0 implements dg.y {
    public boolean f5217a;
    public final Bitmap f5218b;
    public final ht0 f5219c;

    public g0(ht0 ht0Var, Bitmap bitmap) {
        this.f5219c = ht0Var;
        this.f5218b = bitmap;
    }

    @Override
    public final void a() {
        this.f5217a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        q0 q0Var = this.f5219c.T0;
        Matrix matrix = q0Var.getMatrix();
        canvas.save();
        canvas.translate(q0Var.getX(), q0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f5218b;
        canvas.scale(q0Var.getWidth() / bitmap.getWidth(), q0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f5217a;
    }

    @Override
    public final void d() {
        this.f5217a = false;
    }

    @Override
    public final View e() {
        return this.f5219c;
    }

    @Override
    public final FrameLayout f() {
        return this.f5219c.f5102b1;
    }

    @Override
    public final boolean g() {
        if (this.f5218b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10) {
        ht0 ht0Var = this.f5219c;
        ht0Var.w0(false);
        dg.e1 e1Var = ht0Var.S1;
        e1Var.h(i10, true);
        e1Var.g();
        ht0Var.setNewColor(i10);
        x0 x0Var = ht0Var.D1;
        x0Var.setSelectedColorIndex(e1Var.d());
        x0Var.getAdapter().l();
    }
}
