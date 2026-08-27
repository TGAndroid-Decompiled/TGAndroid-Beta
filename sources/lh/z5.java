package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

public final class z5 extends zf.d {
    public final Paint h;

    public long f17186n;

    public float f17187r;

    public float f17188s;
    public int v;

    public int f17189w;

    public final va f17190x;

    public z5(va vaVar, Context context, y5 y5Var) {
        super(context, y5Var);
        this.f17190x = vaVar;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f17190x.f15974i2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int stickyX;
        int stickyY;
        float f10;
        float f11;
        Canvas canvas2;
        int measuredWidth;
        float measuredWidth2;
        int measuredHeight;
        float measuredHeight2;
        super.onDraw(canvas);
        long jMin = Math.min(16L, System.currentTimeMillis() - this.f17186n);
        this.f17186n = System.currentTimeMillis();
        va vaVar = this.f17190x;
        zf.j jVar = vaVar.F0;
        if (jVar == null || jVar.f50464r || !jVar.f50463n) {
            stickyX = 0;
            stickyY = 0;
        } else {
            stickyX = jVar.getStickyX();
            stickyY = vaVar.F0.getStickyY();
        }
        if (stickyX != 0) {
            this.v = stickyX;
        }
        if (stickyY != 0) {
            this.f17189w = stickyY;
        }
        if (stickyX != 0) {
            float f12 = this.f17187r;
            if (f12 != 1.0f) {
                this.f17187r = Math.min(1.0f, (jMin / 150.0f) + f12);
                invalidate();
            } else if (stickyX == 0) {
                f10 = this.f17187r;
                if (f10 != 0.0f) {
                    this.f17187r = Math.max(0.0f, f10 - (jMin / 150.0f));
                    invalidate();
                }
            }
        } else if (stickyX == 0) {
            f10 = this.f17187r;
            if (f10 != 0.0f) {
                this.f17187r = Math.max(0.0f, f10 - (jMin / 150.0f));
                invalidate();
            }
        }
        if (stickyY != 0) {
            float f13 = this.f17188s;
            if (f13 != 1.0f) {
                this.f17188s = Math.min(1.0f, (jMin / 150.0f) + f13);
                invalidate();
            } else if (stickyY == 0) {
                f11 = this.f17188s;
                if (f11 != 0.0f) {
                    this.f17188s = Math.max(0.0f, f11 - (jMin / 150.0f));
                    invalidate();
                }
            }
        } else if (stickyY == 0) {
            f11 = this.f17188s;
            if (f11 != 0.0f) {
                this.f17188s = Math.max(0.0f, f11 - (jMin / 150.0f));
                invalidate();
            }
        }
        float f14 = this.f17188s;
        Paint paint = this.h;
        if (f14 != 0.0f) {
            paint.setAlpha((int) (f14 * 255.0f));
            int i10 = this.f17189w;
            if (i10 == 1) {
                measuredHeight = AndroidUtilities.dp(64.0f);
            } else {
                if (i10 == 2) {
                    measuredHeight2 = getMeasuredHeight() / 2.0f;
                } else {
                    measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(64.0f);
                }
                float f15 = measuredHeight2;
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f15, getMeasuredWidth(), f15, paint);
            }
            measuredHeight2 = measuredHeight;
            float f16 = measuredHeight2;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, f16, getMeasuredWidth(), f16, paint);
        } else {
            canvas2 = canvas;
        }
        float f17 = this.f17187r;
        if (f17 != 0.0f) {
            paint.setAlpha((int) (f17 * 255.0f));
            int i11 = this.v;
            if (i11 != 1) {
                if (i11 == 2) {
                    measuredWidth2 = getMeasuredWidth() / 2.0f;
                } else {
                    measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                }
                float f18 = measuredWidth2;
                canvas2.drawLine(f18, 0.0f, f18, getMeasuredHeight(), paint);
            }
            measuredWidth = AndroidUtilities.dp(8.0f);
            measuredWidth2 = measuredWidth;
            float f19 = measuredWidth2;
            canvas2.drawLine(f19, 0.0f, f19, getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        va vaVar = this.f17190x;
        z5 z5Var = vaVar.N0;
        if (vaVar.N1 <= 0) {
            vaVar.N1 = z5Var.getMeasuredWidth();
        }
        if (vaVar.O1 <= 0) {
            vaVar.O1 = z5Var.getMeasuredHeight();
        }
        vaVar.H0();
    }
}
