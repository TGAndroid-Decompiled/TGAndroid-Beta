package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
public final class c04 extends FrameLayout {
    public final Paint a;
    public final o24 b;

    public c04(o24 o24Var, Context context) {
        super(context);
        this.b = o24Var;
        this.a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        o24 o24Var = this.b;
        b04 b04Var = o24Var.C0;
        float L = hl.L(50.0f) * o24Var.u1.o();
        if (L > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (L != 0.0f) {
            canvas.clipRect(0.0f, L, getMeasuredWidth(), getMeasuredHeight());
        }
        int y = o24Var.y(aob.zf);
        Paint paint = this.a;
        paint.setColor(y);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), b04Var.getExpandedOffset() + hl.L(36.0f), paint);
        super.dispatchDraw(canvas);
        if (b04Var.s != null) {
            canvas.save();
            float f = b04Var.d0 - b04Var.e0;
            float f2 = b04Var.w;
            if (f2 > 0.0f) {
                f = ((b04Var.s.getX() - b04Var.getScrollX()) * b04Var.w) + ((1.0f - f2) * f);
            }
            canvas.translate(f, 0.0f);
            b04Var.s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.Y();
    }
}
