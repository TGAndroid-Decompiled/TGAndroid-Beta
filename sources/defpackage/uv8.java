package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.Button;
public final class uv8 extends Button {
    public final RectF a;
    public final Paint b;
    public boolean c;
    public float d;
    public long e;
    public int f;

    public uv8(Context context) {
        super(context);
        setAllCaps(false);
        setTextSize(1, 14.0f);
        setTypeface(hl.o());
        setOutlineProvider(null);
        l2f.a(this, 8.0f, 0.0f, 8.0f, 0.0f);
        int L = hl.L(60.0f);
        setMinWidth(L);
        setMinimumWidth(L);
        this.a = new RectF();
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(2.0f));
    }

    public final void a(boolean z, boolean z2) {
        float f;
        if (this.c != z) {
            this.c = z;
            if (!z2) {
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                this.d = f;
            }
            this.e = System.currentTimeMillis();
            invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.c && this.d == 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth() - hl.L(11.0f);
        RectF rectF = this.a;
        rectF.set(measuredWidth, hl.L(3.0f), hl.L(8.0f) + measuredWidth, hl.L(11.0f));
        int min = Math.min(255, (int) (this.d * 255.0f));
        Paint paint = this.b;
        paint.setAlpha(min);
        canvas.drawArc(rectF, this.f, 220.0f, false, paint);
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(this.e - System.currentTimeMillis()) < 1000) {
            long j = currentTimeMillis - this.e;
            int i = (int) (this.f + (((float) (360 * j)) / 2000.0f));
            this.f = i - ((i / 360) * 360);
            boolean z = this.c;
            float f = this.d;
            if (z) {
                if (f < 1.0f) {
                    float f2 = (((float) j) / 200.0f) + f;
                    this.d = f2;
                    if (f2 > 1.0f) {
                        this.d = 1.0f;
                    }
                }
            } else if (f > 0.0f) {
                float f3 = f - (((float) j) / 200.0f);
                this.d = f3;
                if (f3 < 0.0f) {
                    this.d = 0.0f;
                }
            }
        }
        this.e = currentTimeMillis;
        postInvalidateOnAnimation();
    }

    public void setProgressColor(int i) {
        this.b.setColor(i);
    }
}
