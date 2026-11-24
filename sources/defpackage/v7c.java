package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public class v7c extends FrameLayout {
    public ValueAnimator a;
    public float b;
    public boolean c;
    public Boolean d;
    public final x7c e;

    public v7c(x7c x7cVar, Context context) {
        super(context);
        this.e = x7cVar;
        this.c = false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        canvas.save();
        x7c x7cVar = this.e;
        Drawable drawable = x7cVar.q1;
        RectF rectF = x7cVar.w1;
        int L = gl.L(6.0f) + (x7cVar.x1 - x7cVar.t0);
        int L2 = (x7cVar.x1 - x7cVar.t0) - gl.L(13.0f);
        int L3 = gl.L(50.0f) + getMeasuredHeight();
        int i4 = x7cVar.t0;
        int i5 = gl.m;
        int i6 = L2 + i5;
        int i7 = L + i5;
        int i8 = (L3 + i4) - i5;
        float translationY = getTranslationY() + i4 + i6;
        int i9 = gl.m;
        boolean z3 = true;
        if (translationY < (i9 << 1)) {
            int min = (int) Math.min(i9, ((i - i6) - x7cVar.t0) - getTranslationY());
            i6 -= min;
            i8 += min;
            f = 1.0f - Math.min(1.0f, (min << 1) / gl.m);
        } else {
            f = 1.0f;
        }
        float translationY2 = getTranslationY() + x7cVar.t0 + i6;
        float f2 = gl.m;
        if (translationY2 < f2) {
            i3 = (int) Math.min(f2, ((i2 - i6) - x7cVar.t0) - getTranslationY());
        } else {
            i3 = 0;
        }
        drawable.setBounds(0, i6, getMeasuredWidth(), i8);
        drawable.draw(canvas);
        if (!x7cVar.M1) {
            if (f != 1.0f) {
                bkb.s0.setColor(x7cVar.z1);
                rectF.set(x7cVar.u0, x7cVar.t0 + i6, getMeasuredWidth() - x7cVar.u0, gl.L(24.0f) + x7cVar.t0 + i6);
                canvas.drawRoundRect(rectF, gl.L(12.0f) * f, gl.L(12.0f) * f, bkb.s0);
            }
            int L4 = gl.L(36.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, i7, (getMeasuredWidth() + L4) / 2, gl.L(4.0f) + i7);
            bkb.s0.setColor(bkb.w0(null, x7cVar.C1, false));
            canvas.drawRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), bkb.s0);
        }
        if (i3 > 0) {
            bkb.s0.setColor(x7cVar.z1);
        }
        if (i3 > gl.m / 2) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z) {
            if (gl.B(bkb.v0(bkb.g5, x7cVar.J0)) > 0.721f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (gl.B(bkb.v(bkb.v0(bkb.r8, x7cVar.J0), 855638016)) <= 0.721f) {
                z3 = false;
            }
            this.d = Boolean.valueOf(z);
            if (!z) {
                z2 = z3;
            }
            gl.n3(x7cVar.getWindow(), z2);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            x7c x7cVar = this.e;
            if (y < x7cVar.x1) {
                x7cVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.e.L0();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        int size = View.MeasureSpec.getSize(i2);
        this.c = true;
        x7c x7cVar = this.e;
        ns9 ns9Var = x7cVar.n1;
        int i3 = x7cVar.u0;
        setPadding(i3, gl.m, i3, 0);
        this.c = false;
        int paddingTop = size - getPaddingTop();
        if (x7cVar.d) {
            L = gl.L(8.0f);
            x7cVar.r0(false);
            int i4 = x7cVar.x1;
            if (i4 != 0) {
                float f = i4;
                this.b = f;
                setTranslationY(f);
                ValueAnimator valueAnimator = this.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b, 0.0f);
                this.a = ofFloat;
                ofFloat.addUpdateListener(new uwb(this, (byte) 4));
                this.a.setDuration(250L);
                this.a.setInterpolator(gb.w);
                this.a.addListener(new iab(this, (byte) 14));
                this.a.start();
            } else if (this.a != null) {
                setTranslationY(this.b);
            }
        } else {
            L = (paddingTop - ((paddingTop / 5) * 3)) + gl.L(8.0f);
            x7cVar.r0 = true;
        }
        if (ns9Var.getPaddingTop() != L) {
            this.c = true;
            ns9Var.setPadding(0, L, 0, 0);
            this.c = false;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.e.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        invalidate();
    }
}
