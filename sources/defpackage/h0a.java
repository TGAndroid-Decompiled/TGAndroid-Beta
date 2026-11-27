package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class h0a extends FrameLayout {
    public final Path a;
    public final Paint b;
    public final boolean c;
    public final boolean d;
    public final vnb e;
    public final Integer f;
    public final n1a h;

    public h0a(n1a n1aVar, Context context, boolean z, boolean z2, vnb vnbVar, Integer num) {
        super(context);
        this.h = n1aVar;
        this.c = z;
        this.d = z2;
        this.e = vnbVar;
        this.f = num;
        this.a = new Path();
        this.b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        RectF rectF;
        n1a n1aVar = this.h;
        if (!n1aVar.R0) {
            super.dispatchDraw(canvas);
        } else if (this.c) {
            canvas.save();
            boolean z = this.d;
            Paint paint = this.b;
            if (z) {
                aob.m(paint);
            }
            paint.setColor(aob.v0(aob.G8, this.e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float L = intValue + hl.L(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (n1aVar.m()) {
                rectF = hl.P;
                rectF.set((L - (n1aVar.b1 * L)) + getPaddingLeft(), qd4.A(1.0f, n1aVar.c1, height, getPaddingTop()), ((width - L) * n1aVar.b1) + getPaddingLeft() + L, getPaddingTop() + height);
            } else {
                rectF = hl.P;
                rectF.set((L - (n1aVar.b1 * L)) + getPaddingLeft(), getPaddingTop(), ((width - L) * n1aVar.b1) + getPaddingLeft() + L, (height * n1aVar.c1) + getPaddingTop());
            }
            Path path = this.a;
            path.rewind();
            path.addRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), Path.Direction.CW);
            canvas.drawPath(path, paint);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
        } else {
            super.dispatchDraw(canvas);
        }
    }
}
