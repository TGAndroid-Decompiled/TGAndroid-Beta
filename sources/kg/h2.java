package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.ui.k4;
public final class h2 extends k4 {
    public final Path h;
    public final k2 f11106n;

    public h2(k2 k2Var, Context context) {
        super(context);
        this.f11106n = k2Var;
        this.h = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.h);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Path path = this.h;
        path.reset();
        k2 k2Var = this.f11106n;
        if (k2Var.d) {
            org.telegram.messenger.i0.P.set(0.0f, -k2Var.M, getMeasuredWidth(), getMeasuredHeight());
        } else {
            org.telegram.messenger.i0.P.set(0.0f, 0.0f, getMeasuredWidth(), (int) (getMeasuredHeight() + k2Var.M));
        }
        float L = k2Var.M - org.telegram.messenger.i0.L(3.0f);
        path.addRoundRect(org.telegram.messenger.i0.P, L, L, Path.Direction.CW);
    }
}
