package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
public final class cw2 extends View implements tjb {
    public final Paint a;
    public final Paint b;
    public final RectF c;
    public int d;
    public long e;
    public int f;
    public int h;
    public int n;
    public int r;

    public cw2(Context context, int i) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.c = new RectF();
        this.d = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(gl.L(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(gl.L(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        if (i == 0) {
            this.f = bkb.A7;
            this.h = bkb.B7;
        } else if (i == 1) {
            this.f = bkb.C7;
            this.h = bkb.D7;
        } else if (i == 2) {
            this.f = bkb.E7;
            this.h = bkb.F7;
        } else if (i == 3) {
            this.f = bkb.G7;
            this.h = bkb.H7;
        }
        updateColors();
    }

    public final void a(int i, int i2) {
        this.f = -1;
        this.h = -1;
        this.n = i;
        this.r = i2;
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.e;
        this.e = currentTimeMillis;
        this.d = (int) ((((float) (j * 360)) / 1000.0f) + this.d);
        int measuredWidth = (getMeasuredWidth() / 2) - gl.L(9.0f);
        int measuredHeight = (getMeasuredHeight() / 2) - gl.L(9.0f);
        RectF rectF = this.c;
        rectF.set(measuredWidth, measuredHeight, gl.L(18.0f) + measuredWidth, gl.L(18.0f) + measuredHeight);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, gl.L(9.0f), this.a);
        canvas.drawArc(rectF, this.d - 90, 90.0f, false, this.b);
        invalidate();
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.e = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void updateColors() {
        int i = this.f;
        Paint paint = this.a;
        if (i >= 0) {
            paint.setColor(bkb.w0(null, i, false));
        } else {
            paint.setColor(this.n);
        }
        int i2 = this.h;
        Paint paint2 = this.b;
        if (i2 >= 0) {
            paint2.setColor(bkb.w0(null, i2, false));
        } else {
            paint2.setColor(this.r);
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
