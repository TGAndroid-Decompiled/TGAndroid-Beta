package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
public abstract class gv7 extends d79 {
    public static final Paint k3;
    public static final Paint l3;
    public static final Path m3;
    public static final Paint n3;
    public final Paint f3;
    public final Paint g3;
    public int h3;
    public a78 i3;
    public pt2 j3;

    static {
        Paint paint = new Paint(1);
        k3 = paint;
        Paint paint2 = new Paint(1);
        l3 = paint2;
        paint.setColor(-2013265920);
        paint2.setColor(-1996488705);
        m3 = new Path();
        n3 = new Paint(1);
    }

    public gv7(Context context) {
        super(context, null);
        this.f3 = new Paint(1);
        Paint paint = new Paint(1);
        this.g3 = paint;
        this.h3 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(2.0f));
        setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        setLayoutManager(new u55(7));
        setAdapter(new ev7(this, context));
        setOverScrollMode(2);
        setOnItemClickListener(new zg4(this, (byte) 14));
    }

    public static void A1(Canvas canvas, RectF rectF, int i) {
        float f = rectF.left;
        while (f <= rectF.right) {
            float f2 = rectF.top;
            while (f2 <= rectF.bottom) {
                float f3 = i;
                float f4 = f + f3;
                float f5 = f2 + f3;
                Paint paint = k3;
                Canvas canvas2 = canvas;
                canvas2.drawRect(f, f2, f4, f5, paint);
                float f6 = i << 1;
                float f7 = f + f6;
                Paint paint2 = l3;
                float f8 = f2;
                canvas2.drawRect(f4, f8, f7, f5, paint2);
                float f9 = f8 + f6;
                canvas2.drawRect(f4, f5, f7, f9, paint);
                canvas2.drawRect(f, f5, f4, f9, paint2);
                canvas = canvas2;
                f2 = f9;
            }
            f += i << 1;
            canvas = canvas;
        }
    }

    public static void B1(float f, float f2, float f3, int i, Canvas canvas) {
        Paint paint = n3;
        paint.setColor(i);
        if (paint.getAlpha() != 255) {
            RectF rectF = hl.P;
            rectF.set(f - f3, f2 - f3, f + f3, f2 + f3);
            paint.setAlpha(255);
            canvas.drawArc(rectF, -45.0f, -180.0f, true, paint);
            Path path = m3;
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.lineTo((float) (((rectF.width() / 2.0f) * 6.123233995736766E-17d) + rectF.centerX()), (float) (((rectF.height() / 2.0f) * (-1.0d)) + rectF.centerY()));
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.lineTo((float) (((rectF.width() / 2.0f) * (-1.8369701987210297E-16d)) + rectF.centerX()), (float) (((rectF.height() / 2.0f) * (-1.0d)) + rectF.centerY()));
            path.addArc(rectF, -45.0f, 180.0f);
            canvas.save();
            canvas.clipPath(path);
            A1(canvas, rectF, hl.L(4.0f));
            canvas.restore();
            paint.setColor(i);
            canvas.drawArc(rectF, -45.0f, 180.0f, true, paint);
            return;
        }
        canvas.drawCircle(f, f2, f3, paint);
    }

    public final void C1(boolean z, float f) {
        float interpolation;
        float f2;
        if (z) {
            interpolation = k43.g.getInterpolation(f);
        } else {
            interpolation = k43.i.getInterpolation(f);
        }
        float childCount = 1.0f / (getChildCount() - 1);
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (i == 0) {
                if (interpolation == 1.0f) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                childAt.setAlpha(f2);
            } else {
                float f3 = i * childCount;
                float min = Math.min(interpolation, f3) / f3;
                childAt.setScaleX(min);
                childAt.setScaleY(min);
            }
        }
        invalidate();
    }

    public int getSelectedColorIndex() {
        return this.h3;
    }

    public void setColorListener(pt2 pt2Var) {
        this.j3 = pt2Var;
    }

    public void setColorPalette(a78 a78Var) {
        this.i3 = a78Var;
        getAdapter().f();
    }

    public void setSelectedColorIndex(int i) {
        this.h3 = i;
        getAdapter().f();
    }
}
