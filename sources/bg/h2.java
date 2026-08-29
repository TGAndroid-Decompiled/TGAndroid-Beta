package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
public abstract class h2 extends jl0 {
    public static final Paint Y2;
    public static final Paint Z2;
    public static final Path f2288a3;
    public static final Paint f2289b3;
    public final Paint T2;
    public final Paint U2;
    public int V2;
    public ag.h1 W2;
    public q0.a X2;

    static {
        Paint paint = new Paint(1);
        Y2 = paint;
        Paint paint2 = new Paint(1);
        Z2 = paint2;
        paint.setColor(-2013265920);
        paint2.setColor(-1996488705);
        f2288a3 = new Path();
        f2289b3 = new Paint(1);
    }

    public h2(Context context) {
        super(context, null);
        this.T2 = new Paint(1);
        Paint paint = new Paint(1);
        this.U2 = paint;
        this.V2 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setLayoutManager(new f2.w(7));
        setAdapter(new f2(this, context));
        setOverScrollMode(2);
        setOnItemClickListener(new o(this, 1));
    }

    public static void w1(Canvas canvas, RectF rectF, int i10) {
        float f9 = rectF.left;
        while (f9 <= rectF.right) {
            float f10 = rectF.top;
            while (f10 <= rectF.bottom) {
                float f11 = i10;
                float f12 = f9 + f11;
                float f13 = f10 + f11;
                Paint paint = Y2;
                Canvas canvas2 = canvas;
                canvas2.drawRect(f9, f10, f12, f13, paint);
                float f14 = i10 * 2;
                float f15 = f9 + f14;
                Paint paint2 = Z2;
                float f16 = f10;
                canvas2.drawRect(f12, f16, f15, f13, paint2);
                float f17 = f16 + f14;
                canvas2.drawRect(f12, f13, f15, f17, paint);
                canvas2.drawRect(f9, f13, f12, f17, paint2);
                canvas = canvas2;
                f10 = f17;
            }
            f9 += i10 * 2;
            canvas = canvas;
        }
    }

    public static void x1(float f9, float f10, float f11, int i10, Canvas canvas) {
        Paint paint = f2289b3;
        paint.setColor(i10);
        if (paint.getAlpha() != 255) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f9 - f11, f10 - f11, f9 + f11, f10 + f11);
            paint.setAlpha(255);
            canvas.drawArc(rectF, -45.0f, -180.0f, true, paint);
            Path path = f2288a3;
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.lineTo((float) j7.l1.b(-1.5707963267948966d, rectF.width() / 2.0f, rectF.centerX()), (float) ((Math.sin(-1.5707963267948966d) * (rectF.height() / 2.0f)) + rectF.centerY()));
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.lineTo((float) j7.l1.b(4.71238898038469d, rectF.width() / 2.0f, rectF.centerX()), (float) ((Math.sin(4.71238898038469d) * (rectF.height() / 2.0f)) + rectF.centerY()));
            path.addArc(rectF, -45.0f, 180.0f);
            canvas.save();
            canvas.clipPath(path);
            w1(canvas, rectF, AndroidUtilities.dp(4.0f));
            canvas.restore();
            paint.setColor(i10);
            canvas.drawArc(rectF, -45.0f, 180.0f, true, paint);
            return;
        }
        canvas.drawCircle(f9, f10, f11, paint);
    }

    public int getSelectedColorIndex() {
        return this.V2;
    }

    public void setColorListener(q0.a aVar) {
        this.X2 = aVar;
    }

    public void setColorPalette(ag.h1 h1Var) {
        this.W2 = h1Var;
        getAdapter().l();
    }

    public void setSelectedColorIndex(int i10) {
        this.V2 = i10;
        getAdapter().l();
    }

    public final void y1(float f9, boolean z10) {
        float interpolation;
        float f10;
        if (z10) {
            interpolation = jr.f29801g.getInterpolation(f9);
        } else {
            interpolation = jr.f29802i.getInterpolation(f9);
        }
        float childCount = 1.0f / (getChildCount() - 1);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (i10 == 0) {
                if (interpolation == 1.0f) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                childAt.setAlpha(f10);
            } else {
                float f11 = i10 * childCount;
                float min = Math.min(interpolation, f11) / f11;
                childAt.setScaleX(min);
                childAt.setScaleY(min);
            }
        }
        invalidate();
    }
}
