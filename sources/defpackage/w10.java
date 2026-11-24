package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
public final class w10 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public int c;
    public int d;
    public final i20 e;

    public w10(i20 i20Var, Activity activity) {
        super(activity);
        this.e = i20Var;
        this.a = new RectF();
        this.b = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296353, new s10(this, (byte) 0));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296353, null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        i20 i20Var = this.e;
        p10 p10Var = i20Var.r1;
        x10 x10Var = i20Var.m1;
        boolean z = i20Var.n2;
        if (i20Var.q2.size() <= 1) {
            i20Var.s0.setBounds(0, (getMeasuredHeight() - i20Var.x1.getMeasuredHeight()) - i20Var.t0, getMeasuredWidth(), getMeasuredHeight());
            i20Var.s0.draw(canvas);
            if (z) {
                x10Var.setVisibility(8);
            }
        } else if (p10Var.getVisibility() == 0) {
            int L = gl.L(13.0f);
            int translationY = (int) (p10Var.getTranslationY() + ((i20Var.t2 - i20Var.t0) - L));
            if (z) {
                translationY = (translationY - a.getCurrentActionBarHeight()) + gl.L(10.0f);
            }
            int L2 = gl.L(20.0f) + translationY;
            int L3 = gl.L(15.0f) + getMeasuredHeight();
            int i = i20Var.t0;
            int i2 = L3 + i;
            if (!z && i + translationY < a.getCurrentActionBarHeight()) {
                float L4 = gl.L(4.0f) + L;
                f = Math.min(1.0f, ((a.getCurrentActionBarHeight() - translationY) - i20Var.t0) / L4);
                int currentActionBarHeight = (int) ((a.getCurrentActionBarHeight() - L4) * f);
                translationY -= currentActionBarHeight;
                L2 -= currentActionBarHeight;
                i2 += currentActionBarHeight;
                f2 = 1.0f - f;
            } else {
                f = 0.0f;
                f2 = 1.0f;
            }
            int i3 = (int) ((1.0f - f) * gl.m);
            int i4 = translationY + i3;
            int i5 = L2 + i3;
            i20Var.s0.setBounds(0, i4, getMeasuredWidth(), i2);
            i20Var.s0.draw(canvas);
            RectF rectF = this.a;
            if (!z && f2 != 1.0f) {
                f3 = 20.0f;
                bkb.s0.setColor(bkb.v0(bkb.g5, i20Var.J0));
                f4 = 4.0f;
                rectF.set(i20Var.u0, i20Var.t0 + i4, getMeasuredWidth() - i20Var.u0, gl.L(24.0f) + i20Var.t0 + i4);
                canvas.drawRoundRect(rectF, gl.L(12.0f) * f2, gl.L(12.0f) * f2, bkb.s0);
            } else {
                f3 = 20.0f;
                f4 = 4.0f;
            }
            if (!z && f2 != 0.0f) {
                int L5 = gl.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, i5, (getMeasuredWidth() + L5) / 2, gl.L(f4) + i5);
                int v0 = bkb.v0(bkb.yj, i20Var.J0);
                int alpha = Color.alpha(v0);
                bkb.s0.setColor(v0);
                bkb.s0.setAlpha((int) (alpha * 1.0f * f2));
                canvas.drawRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), bkb.s0);
            }
            if (z) {
                x10Var.setVisibility(0);
                int i6 = (i4 - gl.m) - i20Var.t0;
                float max = Math.max(0.0f, tb4.A(1.0f, i20Var.K2, gl.L(6.0f), gl.L(f3) + i6) - x10Var.getTop());
                x10Var.setTranslationY(max);
                i20Var.n1.setTranslationY(max);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w10.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        i20 i20Var = this.e;
        i20Var.U0();
        i20Var.T0();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int L;
        int paddingBottom;
        int i5;
        i20 i20Var = this.e;
        k10 k10Var = i20Var.x1;
        k10 k10Var2 = i20Var.b2;
        p10 p10Var = i20Var.r1;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (size != this.c || size2 != this.d) {
            if (k10Var2.getTag() != null) {
                i20Var.Q0(false, false);
            }
            this.d = size2;
            this.c = size;
        }
        this.b = true;
        if (!i20Var.p1 && !i20Var.d) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        k10Var.setVisibility(i3);
        i20Var.o1.setVisibility(k10Var.getVisibility());
        int paddingTop = size - getPaddingTop();
        ((FrameLayout.LayoutParams) p10Var.getLayoutParams()).topMargin = a.getCurrentActionBarHeight() + gl.m;
        ((FrameLayout.LayoutParams) i20Var.n1.getLayoutParams()).topMargin = a.getCurrentActionBarHeight() + gl.m;
        ((FrameLayout.LayoutParams) k10Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int i6 = 52;
        if (!i20Var.I0() && !i20Var.s2) {
            i4 = 52;
        } else {
            i4 = 0;
        }
        int L2 = gl.L(179 + i4);
        if (i20Var.q2.size() > 1) {
            L2 += (gl.L(56.0f) * i20Var.q2.size()) + i20Var.t0;
        }
        if (!i20Var.q1 && !i20Var.d) {
            if (L2 >= paddingTop) {
                L2 = (int) ((paddingTop / 5) * 3.5f);
            }
            L = gl.L(8.0f) + (paddingTop - L2);
            if (!i20Var.I0() && !i20Var.s2) {
                i5 = 52;
            } else {
                i5 = 0;
            }
            if (L > paddingTop - gl.L(i5 + 329)) {
                if (i20Var.I0() || i20Var.s2) {
                    i6 = 0;
                }
                L = paddingTop - gl.L(i6 + 329);
            }
            if (L < 0) {
                L = 0;
            }
        } else {
            L = gl.L(8.0f);
        }
        if (i20Var.o2) {
            L = 0;
        }
        if (p10Var.getPaddingTop() != L) {
            if (i20Var.q1 && i20Var.d) {
                paddingBottom = 0;
            } else {
                paddingBottom = p10Var.getPaddingBottom();
            }
            p10Var.setPadding(0, L, 0, paddingBottom);
        }
        this.b = false;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        getMeasuredHeight();
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
        if (this.b) {
            return;
        }
        super.requestLayout();
    }
}
