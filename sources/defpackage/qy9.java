package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class qy9 extends FrameLayout {
    public final Path a;
    public final Paint b;
    public final boolean c;
    public final boolean d;
    public final ylb e;
    public final Integer f;
    public final vz9 h;

    public qy9(vz9 vz9Var, Context context, boolean z, boolean z2, ylb ylbVar, Integer num) {
        super(context);
        this.h = vz9Var;
        this.c = z;
        this.d = z2;
        this.e = ylbVar;
        this.f = num;
        this.a = new Path();
        this.b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        RectF rectF;
        vz9 vz9Var = this.h;
        if (!vz9Var.R0) {
            super.dispatchDraw(canvas);
        } else if (this.c) {
            canvas.save();
            boolean z = this.d;
            Paint paint = this.b;
            if (z) {
                cmb.m(paint);
            }
            paint.setColor(cmb.v0(cmb.F8, this.e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float L = intValue + gm.L(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (vz9Var.m()) {
                rectF = gm.P;
                rectF.set((L - (vz9Var.b1 * L)) + getPaddingLeft(), td4.A(1.0f, vz9Var.c1, height, getPaddingTop()), ((width - L) * vz9Var.b1) + getPaddingLeft() + L, getPaddingTop() + height);
            } else {
                rectF = gm.P;
                rectF.set((L - (vz9Var.b1 * L)) + getPaddingLeft(), getPaddingTop(), ((width - L) * vz9Var.b1) + getPaddingLeft() + L, (height * vz9Var.c1) + getPaddingTop());
            }
            Path path = this.a;
            path.rewind();
            path.addRoundRect(rectF, gm.L(12.0f), gm.L(12.0f), Path.Direction.CW);
            canvas.drawPath(path, paint);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
        } else {
            super.dispatchDraw(canvas);
        }
    }
}
