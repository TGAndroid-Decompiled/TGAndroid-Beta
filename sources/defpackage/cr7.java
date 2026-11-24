package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class cr7 extends n29 implements sp3 {
    public static final Paint I;
    public static final Paint J;
    public static final TextPaint K;
    public static final TextPaint L;
    public static final TextPaint M;
    public static final TextPaint N;
    public static final TextPaint O;
    public static final TextPaint P;
    public static final DecelerateInterpolator Q;
    public String E;
    public String F;
    public String G;
    public String H;
    public long a;
    public float b;
    public float c;
    public long d;
    public float e;
    public float f;
    public boolean h;
    public View n;
    public k27 r;
    public int s;
    public boolean w;
    public boolean x;
    public Drawable y;

    static {
        Paint paint = new Paint();
        I = paint;
        Paint paint2 = new Paint(1);
        J = paint2;
        TextPaint textPaint = new TextPaint(1);
        K = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        L = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        M = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        N = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        O = textPaint5;
        TextPaint textPaint6 = new TextPaint(1);
        P = textPaint6;
        Q = new DecelerateInterpolator();
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-14209998);
        textPaint.setColor(-1);
        textPaint2.setColor(-1);
        textPaint3.setColor(-10327179);
        textPaint4.setColor(-10327179);
        textPaint5.setColor(-1);
        textPaint6.setColor(-1);
        textPaint.setTypeface(gl.o());
        textPaint2.setTypeface(gl.o());
        textPaint4.setTypeface(gl.o());
        textPaint5.setTypeface(gl.o());
        textPaint6.setTypeface(gl.o());
    }

    @Override
    public final void B(boolean z) {
        a();
    }

    @Override
    public final void N(String str) {
        b(true, 1.0f);
        a();
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cr7.a():void");
    }

    public final void b(boolean z, float f) {
        if (!z) {
            this.e = f;
            this.c = f;
        } else {
            this.c = this.e;
        }
        this.H = String.format("%d%%", Integer.valueOf((int) (100.0f * f)));
        if (f != 1.0f) {
            this.f = 1.0f;
        }
        this.b = f;
        this.d = 0L;
        this.a = System.currentTimeMillis();
        this.n.invalidate();
    }

    @Override
    public final void draw(Canvas canvas) {
        String str;
        TextPaint textPaint;
        String str2;
        TextPaint textPaint2;
        String str3;
        TextPaint textPaint3;
        String M0;
        int L2;
        TextPaint textPaint4;
        String str4;
        TextPaint textPaint5;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        canvas.drawRect(0.0f, 0.0f, width, height, I);
        int D = ug8.D(240.0f, height, 2);
        int D2 = ug8.D(48.0f, width, 2);
        Drawable drawable = this.y;
        drawable.setBounds(D2, D, gl.L(48.0f) + D2, gl.L(48.0f) + D);
        drawable.draw(canvas);
        canvas.drawText(this.E, (width - ((int) Math.ceil(textPaint.measureText(str)))) / 2, gl.L(31.0f) + D, K);
        canvas.drawText(this.F, (width - ((int) Math.ceil(textPaint2.measureText(str2)))) / 2, gl.L(96.0f) + D, L);
        canvas.drawText(this.G, (width - ((int) Math.ceil(textPaint3.measureText(str3)))) / 2, gl.L(125.0f) + D, M);
        if (this.x) {
            M0 = k96.M0(2131747613, null);
            textPaint4 = P;
            L2 = 0;
        } else {
            if (this.w) {
                M0 = k96.M0(2131752577, null).toUpperCase();
            } else {
                M0 = k96.M0(2131744017, null);
            }
            L2 = gl.L(28.0f);
            textPaint4 = N;
        }
        canvas.drawText(M0, (width - ((int) Math.ceil(textPaint4.measureText(M0)))) / 2, de9.w(235.0f, D, L2), textPaint4);
        if (this.h) {
            if (this.H != null) {
                canvas.drawText(this.H, (width - ((int) Math.ceil(textPaint5.measureText(str4)))) / 2, gl.L(210.0f) + D, O);
            }
            int D3 = ug8.D(240.0f, width, 2);
            int L3 = gl.L(232.0f) + D;
            Paint paint = J;
            paint.setColor(-10327179);
            paint.setAlpha((int) (this.f * 255.0f));
            float f = L3;
            canvas.drawRect(((int) (gl.L(240.0f) * this.e)) + D3, f, gl.L(240.0f) + D3, gl.L(2.0f) + L3, paint);
            paint.setColor(-1);
            paint.setAlpha((int) (this.f * 255.0f));
            float f2 = D3;
            canvas.drawRect(f2, f, (gl.L(240.0f) * this.e) + f2, gl.L(2.0f) + L3, paint);
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.a;
            this.a = currentTimeMillis;
            float f3 = this.e;
            if (f3 != 1.0f) {
                float f4 = this.b;
                if (f3 != f4) {
                    float f5 = this.c;
                    float f6 = f4 - f5;
                    if (f6 > 0.0f) {
                        long j2 = this.d + j;
                        this.d = j2;
                        if (j2 >= 300) {
                            this.e = f4;
                            this.c = f4;
                            this.d = 0L;
                        } else {
                            this.e = (Q.getInterpolation(((float) j2) / 300.0f) * f6) + f5;
                        }
                    }
                    this.n.invalidate();
                }
            }
            int i = (this.e > 1.0f ? 1 : (this.e == 1.0f ? 0 : -1));
            if (i >= 0 && i == 0) {
                float f7 = this.f;
                if (f7 != 0.0f) {
                    float f8 = f7 - (((float) j) / 200.0f);
                    this.f = f8;
                    if (f8 <= 0.0f) {
                        this.f = 0.0f;
                    }
                    this.n.invalidate();
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.n.getMeasuredHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.n.getMeasuredWidth();
    }

    @Override
    public final int getMinimumHeight() {
        return this.n.getMeasuredHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.n.getMeasuredWidth();
    }

    @Override
    public final int getObserverTag() {
        return this.s;
    }

    @Override
    public final int getOpacity() {
        return -1;
    }

    @Override
    public final void i(long j, long j2) {
        if (!this.h) {
            a();
        }
        b(true, Math.min(1.0f, ((float) j) / ((float) j2)));
    }

    @Override
    public final void setAlpha(int i) {
        Drawable drawable = this.y;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        I.setAlpha(i);
        K.setAlpha(i);
        L.setAlpha(i);
        M.setAlpha(i);
        N.setAlpha(i);
        O.setAlpha(i);
        P.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override
    public final void l(long j, long j2) {
    }
}
