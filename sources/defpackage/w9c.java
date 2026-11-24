package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public class w9c extends FrameLayout {
    public ValueAnimator a;
    public float b;
    public boolean c;
    public Boolean d;
    public final y9c e;

    public w9c(y9c y9cVar, Context context) {
        super(context);
        this.e = y9cVar;
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
        y9c y9cVar = this.e;
        Drawable drawable = y9cVar.q1;
        RectF rectF = y9cVar.w1;
        int L = gm.L(6.0f) + (y9cVar.x1 - y9cVar.t0);
        int L2 = (y9cVar.x1 - y9cVar.t0) - gm.L(13.0f);
        int L3 = gm.L(50.0f) + getMeasuredHeight();
        int i4 = y9cVar.t0;
        int i5 = gm.m;
        int i6 = L2 + i5;
        int i7 = L + i5;
        int i8 = (L3 + i4) - i5;
        float translationY = getTranslationY() + i4 + i6;
        int i9 = gm.m;
        boolean z3 = true;
        if (translationY < (i9 << 1)) {
            int min = (int) Math.min(i9, ((i - i6) - y9cVar.t0) - getTranslationY());
            i6 -= min;
            i8 += min;
            f = 1.0f - Math.min(1.0f, (min << 1) / gm.m);
        } else {
            f = 1.0f;
        }
        float translationY2 = getTranslationY() + y9cVar.t0 + i6;
        float f2 = gm.m;
        if (translationY2 < f2) {
            i3 = (int) Math.min(f2, ((i2 - i6) - y9cVar.t0) - getTranslationY());
        } else {
            i3 = 0;
        }
        drawable.setBounds(0, i6, getMeasuredWidth(), i8);
        drawable.draw(canvas);
        if (!y9cVar.M1) {
            if (f != 1.0f) {
                cmb.s0.setColor(y9cVar.z1);
                rectF.set(y9cVar.u0, y9cVar.t0 + i6, getMeasuredWidth() - y9cVar.u0, gm.L(24.0f) + y9cVar.t0 + i6);
                canvas.drawRoundRect(rectF, gm.L(12.0f) * f, gm.L(12.0f) * f, cmb.s0);
            }
            int L4 = gm.L(36.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, i7, (getMeasuredWidth() + L4) / 2, gm.L(4.0f) + i7);
            cmb.s0.setColor(cmb.w0(null, y9cVar.C1, false));
            canvas.drawRoundRect(rectF, gm.L(2.0f), gm.L(2.0f), cmb.s0);
        }
        if (i3 > 0) {
            cmb.s0.setColor(y9cVar.z1);
        }
        if (i3 > gm.m / 2) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z) {
            if (gm.B(cmb.v0(cmb.g5, y9cVar.J0)) > 0.721f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (gm.B(cmb.v(cmb.v0(cmb.r8, y9cVar.J0), 855638016)) <= 0.721f) {
                z3 = false;
            }
            this.d = Boolean.valueOf(z);
            if (!z) {
                z2 = z3;
            }
            gm.n3(y9cVar.getWindow(), z2);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            y9c y9cVar = this.e;
            if (y < y9cVar.x1) {
                y9cVar.dismiss();
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
        y9c y9cVar = this.e;
        pu9 pu9Var = y9cVar.n1;
        int i3 = y9cVar.u0;
        setPadding(i3, gm.m, i3, 0);
        this.c = false;
        int paddingTop = size - getPaddingTop();
        if (y9cVar.d) {
            L = gm.L(8.0f);
            y9cVar.r0(false);
            int i4 = y9cVar.x1;
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
                ofFloat.addUpdateListener(new oxb(this, (byte) 6));
                this.a.setDuration(250L);
                this.a.setInterpolator(gb.w);
                this.a.addListener(new q7b(this, (byte) 16));
                this.a.start();
            } else if (this.a != null) {
                setTranslationY(this.b);
            }
        } else {
            L = (paddingTop - ((paddingTop / 5) * 3)) + gm.L(8.0f);
            y9cVar.r0 = true;
        }
        if (pu9Var.getPaddingTop() != L) {
            this.c = true;
            pu9Var.setPadding(0, L, 0, 0);
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
