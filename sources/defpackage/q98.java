package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class q98 extends View {
    public final Paint a;
    public final TextPaint b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final String h;
    public final String n;
    public int r;
    public final PhotoViewer s;

    public q98(Context context, PhotoViewer photoViewer) {
        super(context);
        this.s = photoViewer;
        this.a = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setTextSize(gl.L(14.0f));
        textPaint.setColor(-3289651);
        this.h = k96.M0(2131754736, "AccDescrVideoCompressLow");
        this.n = k96.M0(2131754737, "AccDescrVideoCompressHigh");
        setImportantForAccessibility(1);
        setFocusable(true);
        setAccessibilityDelegate(new i66(this, (byte) 1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        if (this.s.f8 != 1) {
            this.f = (((getMeasuredWidth() - (this.c * this.s.f8)) - (((this.s.f8 << 1) - 2) * this.d)) - (this.e << 1)) / (this.s.f8 - 1);
        } else {
            this.f = ((getMeasuredWidth() - (this.c * this.s.f8)) - (this.d << 1)) - (this.e << 1);
        }
        int L = gl.L(6.0f) + (getMeasuredHeight() / 2);
        for (int i2 = 0; i2 < this.s.f8; i2++) {
            int i3 = this.e;
            int i4 = this.f + (this.d << 1);
            int i5 = this.c;
            int i6 = (i5 / 2) + ((i4 + i5) * i2) + i3;
            int i7 = this.s.e8;
            Paint paint = this.a;
            if (i2 <= i7) {
                paint.setColor(-11292945);
            } else {
                paint.setColor(1728053247);
            }
            float f2 = i6;
            float f3 = L;
            if (i2 == this.s.e8) {
                i = gl.L(6.0f);
            } else {
                i = this.c / 2;
            }
            canvas.drawCircle(f2, f3, i, this.a);
            if (i2 != 0) {
                int i8 = ((i6 - (this.c / 2)) - this.d) - this.f;
                float f4 = 0.0f;
                if (i2 == this.s.e8 + 1) {
                    f = gl.N(2.0f);
                } else {
                    f = 0.0f;
                }
                if (i2 == this.s.e8) {
                    f4 = gl.N(2.0f);
                }
                canvas.drawRect(f + i8, L - gl.L(1.0f), (i8 + this.f) - f4, gl.L(2.0f) + L, this.a);
            }
        }
        canvas.drawText(this.h, this.e, L - gl.L(16.0f), this.b);
        canvas.drawText(this.n, (getMeasuredWidth() - this.e) - this.b.measureText(this.n), L - gl.L(16.0f), this.b);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.c = gl.L(8.0f);
        this.d = gl.L(2.0f);
        this.e = gl.L(18.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.r = this.s.e8;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int i = 0;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            while (true) {
                if (i >= this.s.f8) {
                    break;
                }
                int i2 = this.e;
                int i3 = this.f;
                int i4 = this.d;
                int i5 = this.c;
                int i6 = i5 / 2;
                int i7 = (((i4 << 1) + i3 + i5) * i) + i2 + i6;
                int i8 = (i3 / 2) + i6 + i4;
                if (x > i7 - i8 && x < i7 + i8) {
                    if (this.s.e8 != i) {
                        this.s.e8 = i;
                        this.s.O();
                        invalidate();
                        return true;
                    }
                } else {
                    i++;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.s.e8 != this.r) {
                this.s.w1(1);
            }
            this.s.L6 = false;
            return true;
        }
        return true;
    }
}
