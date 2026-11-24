package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
public final class o3c extends ela {
    public final Paint m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public ValueAnimator q0;
    public float r0;
    public final float[] s0;
    public boolean t0;
    public final p3c u0;

    public o3c(p3c p3cVar, Context context) {
        super(context, null);
        this.u0 = p3cVar;
        this.m0 = new Paint(1);
        this.n0 = false;
        this.o0 = false;
        this.p0 = false;
        this.r0 = 0.0f;
        this.s0 = new float[8];
        setWillNotDraw(false);
        int i = p3cVar.u0;
        setPadding(i, 0, i, 0);
        setDelegate(new n3c(this));
    }

    public final float X() {
        p3c p3cVar = this.u0;
        return Math.min(1.0f, Math.max(0.0f, p3cVar.o1 / (p3cVar.l1 * 2.0f)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        Canvas canvas2;
        int v0;
        int max;
        boolean z3;
        float f;
        float f2;
        p3c p3cVar = this.u0;
        d4c d4cVar = p3cVar.n1;
        int i = p3cVar.l1;
        GradientDrawable gradientDrawable = p3cVar.m1;
        float X = X();
        boolean z4 = false;
        if (X == 0.0f && !p3cVar.J) {
            z = true;
        } else {
            z = false;
        }
        if (this.p0 != z) {
            ValueAnimator valueAnimator = this.q0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.p0 = z;
            ValueAnimator valueAnimator2 = this.q0;
            float f3 = this.r0;
            if (valueAnimator2 == null) {
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f2);
                this.q0 = ofFloat;
                ofFloat.addUpdateListener(new oxb(this, (byte) 4));
                this.q0.setDuration(200L);
            } else {
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                valueAnimator2.setFloatValues(f3, f);
            }
            this.q0.start();
        }
        if (this.r0 > 0.5f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.t0 != z2) {
            this.t0 = z2;
            if (gm.B(cmb.v0(cmb.g5, p3cVar.J0)) > 0.721f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (gm.B(cmb.v(cmb.v0(cmb.r8, p3cVar.J0), 855638016)) > 0.721f) {
                z4 = true;
            }
            if (!z2) {
                z3 = z4;
            }
            gm.n3(p3cVar.getWindow(), z3);
        }
        if (this.r0 > 0.0f) {
            int v02 = cmb.v0(cmb.g5, p3cVar.J0);
            Paint paint = this.m0;
            paint.setColor(v02);
            float max2 = (int) Math.max(0.0f, d4cVar.getTranslationY() + (gm.m - i) + ((1.0f - X()) * i) + p3cVar.o1 + gm.L(24.0f));
            canvas2 = canvas;
            canvas2.drawRect(p3cVar.u0, gm.U1(this.r0, max, -gm.m), getMeasuredWidth() - p3cVar.u0, max2, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (d4cVar.getTranslationY() + gm.m) - i);
        int L = gm.L(36.0f);
        int L2 = gm.L(4.0f);
        int i2 = (int) ((1.0f - X) * L2 * 2.0f);
        gradientDrawable.setCornerRadius(gm.L(2.0f));
        gradientDrawable.setColor(on2.p(cmb.v0(cmb.yj, p3cVar.J0), (int) (Color.alpha(v0) * X)));
        gradientDrawable.setBounds((getWidth() - L) / 2, hg9.v(10.0f, p3cVar.o1, i2), (getWidth() + L) / 2, gm.L(10.0f) + p3cVar.o1 + i2 + L2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public final float getTranslationY() {
        return this.u0.n1.getTranslationY();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        gm.d3(new zcb(this, (byte) 26), 200L);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        p3c p3cVar = this.u0;
        GradientDrawable gradientDrawable = p3cVar.m1;
        d4c d4cVar = p3cVar.n1;
        if (d4cVar.c()) {
            p3cVar.o1 = d4cVar.getContentTopOffset();
            p3cVar.b.invalidate();
        }
        super.onDraw(canvas);
        float X = X();
        int i2 = p3cVar.l1;
        int i3 = (int) ((1.0f - X) * i2);
        int i4 = gm.m - i2;
        canvas.save();
        canvas.translate(0.0f, d4cVar.getTranslationY() + i4);
        Drawable drawable = p3cVar.s0;
        int i5 = (p3cVar.o1 - p3cVar.t0) + i3;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (i4 < 0) {
            i = -i4;
        } else {
            i = 0;
        }
        drawable.setBounds(0, i5, measuredWidth, measuredHeight + i);
        p3cVar.s0.draw(canvas);
        if (X > 0.0f && X < 1.0f) {
            float L = gm.L(12.0f) * X;
            gradientDrawable.setColor(cmb.v0(cmb.g5, p3cVar.J0));
            float[] fArr = this.s0;
            fArr[3] = L;
            fArr[2] = L;
            fArr[1] = L;
            fArr[0] = L;
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setBounds(p3cVar.u0, p3cVar.o1 + i3, getWidth() - p3cVar.u0, gm.L(24.0f) + p3cVar.o1 + i3);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            p3c p3cVar = this.u0;
            if (p3cVar.o1 != 0 && motionEvent.getY() < p3cVar.o1) {
                p3cVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = gm.m;
        int Q = Q();
        int size = (int) (((View.MeasureSpec.getSize(getMeasuredHeight()) - i5) + Q) * 0.2f);
        this.o0 = true;
        int L = gm.L(20.0f);
        p3c p3cVar = this.u0;
        d4c d4cVar = p3cVar.n1;
        if (Q > L) {
            d4cVar.a(true);
            p3cVar.r0 = false;
            this.n0 = true;
        } else {
            d4cVar.a(false);
            p3cVar.r0 = true;
            this.n0 = false;
        }
        d4cVar.setContentViewPaddingTop(size);
        if (getPaddingTop() != i5) {
            int i6 = p3cVar.u0;
            setPadding(i6, i5, i6, 0);
        }
        this.o0 = false;
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.u0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (!this.o0) {
            super.requestLayout();
        }
    }

    @Override
    public final void setTranslationY(float f) {
        this.u0.n1.setTranslationY(f);
        invalidate();
    }
}
