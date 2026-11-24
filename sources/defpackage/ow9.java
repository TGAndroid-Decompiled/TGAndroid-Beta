package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class ow9 extends FrameLayout {
    public final Path a;
    public final Paint b;
    public final boolean c;
    public final boolean d;
    public final wjb e;
    public final Integer f;
    public final tx9 h;

    public ow9(tx9 tx9Var, Context context, boolean z, boolean z2, wjb wjbVar, Integer num) {
        super(context);
        this.h = tx9Var;
        this.c = z;
        this.d = z2;
        this.e = wjbVar;
        this.f = num;
        this.a = new Path();
        this.b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        RectF rectF;
        tx9 tx9Var = this.h;
        if (!tx9Var.R0) {
            super.dispatchDraw(canvas);
        } else if (this.c) {
            canvas.save();
            boolean z = this.d;
            Paint paint = this.b;
            if (z) {
                bkb.m(paint);
            }
            paint.setColor(bkb.v0(bkb.F8, this.e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float L = intValue + gl.L(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (tx9Var.m()) {
                rectF = gl.P;
                rectF.set((L - (tx9Var.b1 * L)) + getPaddingLeft(), tb4.A(1.0f, tx9Var.c1, height, getPaddingTop()), ((width - L) * tx9Var.b1) + getPaddingLeft() + L, getPaddingTop() + height);
            } else {
                rectF = gl.P;
                rectF.set((L - (tx9Var.b1 * L)) + getPaddingLeft(), getPaddingTop(), ((width - L) * tx9Var.b1) + getPaddingLeft() + L, (height * tx9Var.c1) + getPaddingTop());
            }
            Path path = this.a;
            path.rewind();
            path.addRoundRect(rectF, gl.L(12.0f), gl.L(12.0f), Path.Direction.CW);
            canvas.drawPath(path, paint);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
        } else {
            super.dispatchDraw(canvas);
        }
    }
}
