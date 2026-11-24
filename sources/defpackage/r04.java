package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
public final class r04 extends FrameLayout {
    public final Paint a;
    public final e34 b;

    public r04(e34 e34Var, Context context) {
        super(context);
        this.b = e34Var;
        this.a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e34 e34Var = this.b;
        q04 q04Var = e34Var.C0;
        float L = gm.L(50.0f) * e34Var.u1.o();
        if (L > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (L != 0.0f) {
            canvas.clipRect(0.0f, L, getMeasuredWidth(), getMeasuredHeight());
        }
        int x = e34Var.x(cmb.yf);
        Paint paint = this.a;
        paint.setColor(x);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), q04Var.getExpandedOffset() + gm.L(36.0f), paint);
        super.dispatchDraw(canvas);
        if (q04Var.s != null) {
            canvas.save();
            float f = q04Var.d0 - q04Var.e0;
            float f2 = q04Var.w;
            if (f2 > 0.0f) {
                f = ((q04Var.s.getX() - q04Var.getScrollX()) * q04Var.w) + ((1.0f - f2) * f);
            }
            canvas.translate(f, 0.0f);
            q04Var.s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.Z();
    }
}
