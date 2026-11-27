package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
public final class q88 extends View {
    public Paint a;
    public Paint b;
    public int c;
    public int d;
    public float e;
    public boolean f;
    public int h;
    public byte n;
    public p88 r;

    public final void a(int i, boolean z) {
        p88 p88Var;
        int i2 = this.h;
        if (i < i2) {
            i = i2;
        } else {
            byte b = this.n;
            if (i > b) {
                i = b;
            }
        }
        this.e = (i - i2) / (this.n - i2);
        invalidate();
        if (z && (p88Var = this.r) != null) {
            p88Var.i(((Integer) getTag()).intValue(), getProgress());
        }
    }

    public int getProgress() {
        int i = this.h;
        return (int) ((this.e * (this.n - i)) + i);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        Paint paint = this.b;
        int measuredHeight = getMeasuredHeight();
        int i2 = this.c;
        int i3 = (measuredHeight - i2) / 2;
        int measuredWidth = (int) ((getMeasuredWidth() - i2) * this.e);
        float f2 = i2 / 2;
        canvas.drawRect(f2, (getMeasuredHeight() / 2) - hl.L(1.0f), getMeasuredWidth() - i, hl.L(1.0f) + (getMeasuredHeight() / 2), this.a);
        if (this.h == 0) {
            canvas.drawRect(f2, (getMeasuredHeight() / 2) - hl.L(1.0f), measuredWidth, hl.L(1.0f) + (getMeasuredHeight() / 2), paint);
            f = f2;
        } else {
            f = f2;
            if (this.e > 0.5f) {
                canvas.drawRect((getMeasuredWidth() / 2) - hl.L(1.0f), (getMeasuredHeight() - i2) / 2, getMeasuredWidth() / 2, (getMeasuredHeight() + i2) / 2, paint);
                paint = paint;
                canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - hl.L(1.0f), measuredWidth, hl.L(1.0f) + (getMeasuredHeight() / 2), paint);
            } else {
                canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() - i2) / 2, hl.L(1.0f) + (getMeasuredWidth() / 2), (getMeasuredHeight() + i2) / 2, paint);
                paint = paint;
                canvas.drawRect(measuredWidth, (getMeasuredHeight() / 2) - hl.L(1.0f), getMeasuredWidth() / 2, hl.L(1.0f) + (getMeasuredHeight() / 2), paint);
            }
        }
        canvas.drawCircle(measuredWidth + i, i + i3, f, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i = this.c;
        if (motionEvent != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float measuredWidth = (int) ((getMeasuredWidth() - i) * this.e);
            float f = 0.0f;
            if (motionEvent.getAction() == 0) {
                float measuredHeight = (getMeasuredHeight() - i) / 2;
                if (measuredWidth - measuredHeight <= x && x <= i + measuredWidth + measuredHeight && y >= 0.0f && y <= getMeasuredHeight()) {
                    this.f = true;
                    this.d = (int) (x - measuredWidth);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && this.f) {
                    float f2 = (int) (x - this.d);
                    if (f2 >= 0.0f) {
                        if (f2 > getMeasuredWidth() - i) {
                            f = getMeasuredWidth() - i;
                        } else {
                            f = f2;
                        }
                    }
                    this.e = f / (getMeasuredWidth() - i);
                    p88 p88Var = this.r;
                    if (p88Var != null) {
                        p88Var.i(((Integer) getTag()).intValue(), getProgress());
                    }
                    invalidate();
                    return true;
                }
            } else if (this.f) {
                this.f = false;
                invalidate();
                return true;
            }
        }
        return false;
    }

    public void setDelegate(p88 p88Var) {
        this.r = p88Var;
    }

    public void setProgress(int i) {
        a(i, true);
    }
}
