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
public final class n5c extends wma {
    public final Paint g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public ValueAnimator k0;
    public float l0;
    public final float[] m0;
    public boolean n0;
    public final o5c o0;

    public n5c(o5c o5cVar, Context context) {
        super(context, null);
        this.o0 = o5cVar;
        this.g0 = new Paint(1);
        this.h0 = false;
        this.i0 = false;
        this.j0 = false;
        this.l0 = 0.0f;
        this.m0 = new float[8];
        setWillNotDraw(false);
        int i = o5cVar.u0;
        setPadding(i, 0, i, 0);
        setDelegate(new m5c(this));
    }

    public final float X() {
        o5c o5cVar = this.o0;
        return Math.min(1.0f, Math.max(0.0f, o5cVar.o1 / (o5cVar.l1 * 2.0f)));
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
        o5c o5cVar = this.o0;
        d6c d6cVar = o5cVar.n1;
        int i = o5cVar.l1;
        GradientDrawable gradientDrawable = o5cVar.m1;
        float X = X();
        boolean z4 = false;
        if (X == 0.0f && !o5cVar.J) {
            z = true;
        } else {
            z = false;
        }
        if (this.j0 != z) {
            ValueAnimator valueAnimator = this.k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.j0 = z;
            ValueAnimator valueAnimator2 = this.k0;
            float f3 = this.l0;
            if (valueAnimator2 == null) {
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f2);
                this.k0 = ofFloat;
                ofFloat.addUpdateListener(new pzb(this, (byte) 4));
                this.k0.setDuration(200L);
            } else {
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                valueAnimator2.setFloatValues(f3, f);
            }
            this.k0.start();
        }
        if (this.l0 > 0.5f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.n0 != z2) {
            this.n0 = z2;
            if (hl.B(aob.v0(aob.h5, o5cVar.J0)) > 0.721f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (hl.B(aob.v(aob.v0(aob.s8, o5cVar.J0), 855638016)) > 0.721f) {
                z4 = true;
            }
            if (!z2) {
                z3 = z4;
            }
            hl.n3(o5cVar.getWindow(), z3);
        }
        if (this.l0 > 0.0f) {
            int v02 = aob.v0(aob.h5, o5cVar.J0);
            Paint paint = this.g0;
            paint.setColor(v02);
            float max2 = (int) Math.max(0.0f, d6cVar.getTranslationY() + (hl.m - i) + ((1.0f - X()) * i) + o5cVar.o1 + hl.L(24.0f));
            canvas2 = canvas;
            canvas2.drawRect(o5cVar.u0, hl.U1(this.l0, max, -hl.m), getMeasuredWidth() - o5cVar.u0, max2, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (d6cVar.getTranslationY() + hl.m) - i);
        int L = hl.L(36.0f);
        int L2 = hl.L(4.0f);
        int i2 = (int) ((1.0f - X) * L2 * 2.0f);
        gradientDrawable.setCornerRadius(hl.L(2.0f));
        gradientDrawable.setColor(vm2.o(aob.v0(aob.zj, o5cVar.J0), (int) (Color.alpha(v0) * X)));
        gradientDrawable.setBounds((getWidth() - L) / 2, uh9.w(10.0f, o5cVar.o1, i2), (getWidth() + L) / 2, hl.L(10.0f) + o5cVar.o1 + i2 + L2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public final float getTranslationY() {
        return this.o0.n1.getTranslationY();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        hl.d3(new azb(this, (byte) 5), 200L);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        o5c o5cVar = this.o0;
        GradientDrawable gradientDrawable = o5cVar.m1;
        d6c d6cVar = o5cVar.n1;
        if (d6cVar.c()) {
            o5cVar.o1 = d6cVar.getContentTopOffset();
            o5cVar.b.invalidate();
        }
        super.onDraw(canvas);
        float X = X();
        int i2 = o5cVar.l1;
        int i3 = (int) ((1.0f - X) * i2);
        int i4 = hl.m - i2;
        canvas.save();
        canvas.translate(0.0f, d6cVar.getTranslationY() + i4);
        Drawable drawable = o5cVar.s0;
        int i5 = (o5cVar.o1 - o5cVar.t0) + i3;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (i4 < 0) {
            i = -i4;
        } else {
            i = 0;
        }
        drawable.setBounds(0, i5, measuredWidth, measuredHeight + i);
        o5cVar.s0.draw(canvas);
        if (X > 0.0f && X < 1.0f) {
            float L = hl.L(12.0f) * X;
            gradientDrawable.setColor(aob.v0(aob.h5, o5cVar.J0));
            float[] fArr = this.m0;
            fArr[3] = L;
            fArr[2] = L;
            fArr[1] = L;
            fArr[0] = L;
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setBounds(o5cVar.u0, o5cVar.o1 + i3, getWidth() - o5cVar.u0, hl.L(24.0f) + o5cVar.o1 + i3);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            o5c o5cVar = this.o0;
            if (o5cVar.o1 != 0 && motionEvent.getY() < o5cVar.o1) {
                o5cVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = hl.m;
        int Q = Q();
        int size = (int) (((View.MeasureSpec.getSize(getMeasuredHeight()) - i5) + Q) * 0.2f);
        this.i0 = true;
        int L = hl.L(20.0f);
        o5c o5cVar = this.o0;
        d6c d6cVar = o5cVar.n1;
        if (Q > L) {
            d6cVar.a(true);
            o5cVar.r0 = false;
            this.h0 = true;
        } else {
            d6cVar.a(false);
            o5cVar.r0 = true;
            this.h0 = false;
        }
        d6cVar.setContentViewPaddingTop(size);
        if (getPaddingTop() != i5) {
            int i6 = o5cVar.u0;
            setPadding(i6, i5, i6, 0);
        }
        this.i0 = false;
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.o0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (!this.i0) {
            super.requestLayout();
        }
    }

    @Override
    public final void setTranslationY(float f) {
        this.o0.n1.setTranslationY(f);
        invalidate();
    }
}
