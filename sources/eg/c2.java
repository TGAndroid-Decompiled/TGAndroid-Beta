package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tl0;
public abstract class c2 extends tl0 {
    public static final Paint Z2;
    public static final Paint f5139a3;
    public static final Path f5140b3;
    public static final Paint c3;
    public final Paint U2;
    public final Paint V2;
    public int W2;
    public dg.e1 X2;
    public q0.a Y2;

    static {
        Paint paint = new Paint(1);
        Z2 = paint;
        Paint paint2 = new Paint(1);
        f5139a3 = paint2;
        paint.setColor(-2013265920);
        paint2.setColor(-1996488705);
        f5140b3 = new Path();
        c3 = new Paint(1);
    }

    public c2(Context context) {
        super(context, null);
        this.U2 = new Paint(1);
        Paint paint = new Paint(1);
        this.V2 = paint;
        this.W2 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setLayoutManager(new f2.w(7));
        setAdapter(new a2(this, context));
        setOverScrollMode(2);
        setOnItemClickListener(new ag.h(this, 2));
    }

    public static void w1(Canvas canvas, RectF rectF, int i10) {
        float f10 = rectF.left;
        while (f10 <= rectF.right) {
            float f11 = rectF.top;
            while (f11 <= rectF.bottom) {
                float f12 = i10;
                float f13 = f10 + f12;
                float f14 = f11 + f12;
                Paint paint = Z2;
                Canvas canvas2 = canvas;
                canvas2.drawRect(f10, f11, f13, f14, paint);
                float f15 = i10 * 2;
                float f16 = f10 + f15;
                Paint paint2 = f5139a3;
                float f17 = f11;
                canvas2.drawRect(f13, f17, f16, f14, paint2);
                float f18 = f17 + f15;
                canvas2.drawRect(f13, f14, f16, f18, paint);
                canvas2.drawRect(f10, f14, f13, f18, paint2);
                canvas = canvas2;
                f11 = f18;
            }
            f10 += i10 * 2;
            canvas = canvas;
        }
    }

    public static void x1(float f10, float f11, float f12, int i10, Canvas canvas) {
        Paint paint = c3;
        paint.setColor(i10);
        if (paint.getAlpha() != 255) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
            paint.setAlpha(255);
            canvas.drawArc(rectF, -45.0f, -180.0f, true, paint);
            Path path = f5140b3;
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.lineTo((float) l.d.a(-1.5707963267948966d, rectF.width() / 2.0f, rectF.centerX()), (float) ((Math.sin(-1.5707963267948966d) * (rectF.height() / 2.0f)) + rectF.centerY()));
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.lineTo((float) l.d.a(4.71238898038469d, rectF.width() / 2.0f, rectF.centerX()), (float) ((Math.sin(4.71238898038469d) * (rectF.height() / 2.0f)) + rectF.centerY()));
            path.addArc(rectF, -45.0f, 180.0f);
            canvas.save();
            canvas.clipPath(path);
            w1(canvas, rectF, AndroidUtilities.dp(4.0f));
            canvas.restore();
            paint.setColor(i10);
            canvas.drawArc(rectF, -45.0f, 180.0f, true, paint);
            return;
        }
        canvas.drawCircle(f10, f11, f12, paint);
    }

    public int getSelectedColorIndex() {
        return this.W2;
    }

    public void setColorListener(q0.a aVar) {
        this.Y2 = aVar;
    }

    public void setColorPalette(dg.e1 e1Var) {
        this.X2 = e1Var;
        getAdapter().l();
    }

    public void setSelectedColorIndex(int i10) {
        this.W2 = i10;
        getAdapter().l();
    }

    public final void y1(float f10, boolean z4) {
        float interpolation;
        float f11;
        if (z4) {
            interpolation = pr.f30184g.getInterpolation(f10);
        } else {
            interpolation = pr.f30185i.getInterpolation(f10);
        }
        float childCount = 1.0f / (getChildCount() - 1);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (i10 == 0) {
                if (interpolation == 1.0f) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                childAt.setAlpha(f11);
            } else {
                float f12 = i10 * childCount;
                float min = Math.min(interpolation, f12) / f12;
                childAt.setScaleX(min);
                childAt.setScaleY(min);
            }
        }
        invalidate();
    }
}
