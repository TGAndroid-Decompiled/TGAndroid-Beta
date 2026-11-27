package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
public final class x10 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public int c;
    public int d;
    public final j20 e;

    public x10(j20 j20Var, Activity activity) {
        super(activity);
        this.e = j20Var;
        this.a = new RectF();
        this.b = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296353, new t10(this, (byte) 0));
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
        j20 j20Var = this.e;
        q10 q10Var = j20Var.r1;
        y10 y10Var = j20Var.m1;
        boolean z = j20Var.n2;
        if (j20Var.q2.size() <= 1) {
            j20Var.s0.setBounds(0, (getMeasuredHeight() - j20Var.x1.getMeasuredHeight()) - j20Var.t0, getMeasuredWidth(), getMeasuredHeight());
            j20Var.s0.draw(canvas);
            if (z) {
                y10Var.setVisibility(8);
            }
        } else if (q10Var.getVisibility() == 0) {
            int L = hl.L(13.0f);
            int translationY = (int) (q10Var.getTranslationY() + ((j20Var.t2 - j20Var.t0) - L));
            if (z) {
                translationY = (translationY - a.getCurrentActionBarHeight()) + hl.L(10.0f);
            }
            int L2 = hl.L(20.0f) + translationY;
            int L3 = hl.L(15.0f) + getMeasuredHeight();
            int i = j20Var.t0;
            int i2 = L3 + i;
            if (!z && i + translationY < a.getCurrentActionBarHeight()) {
                float L4 = hl.L(4.0f) + L;
                f = Math.min(1.0f, ((a.getCurrentActionBarHeight() - translationY) - j20Var.t0) / L4);
                int currentActionBarHeight = (int) ((a.getCurrentActionBarHeight() - L4) * f);
                translationY -= currentActionBarHeight;
                L2 -= currentActionBarHeight;
                i2 += currentActionBarHeight;
                f2 = 1.0f - f;
            } else {
                f = 0.0f;
                f2 = 1.0f;
            }
            int i3 = (int) ((1.0f - f) * hl.m);
            int i4 = translationY + i3;
            int i5 = L2 + i3;
            j20Var.s0.setBounds(0, i4, getMeasuredWidth(), i2);
            j20Var.s0.draw(canvas);
            RectF rectF = this.a;
            if (!z && f2 != 1.0f) {
                f3 = 20.0f;
                aob.s0.setColor(aob.v0(aob.h5, j20Var.J0));
                f4 = 4.0f;
                rectF.set(j20Var.u0, j20Var.t0 + i4, getMeasuredWidth() - j20Var.u0, hl.L(24.0f) + j20Var.t0 + i4);
                canvas.drawRoundRect(rectF, hl.L(12.0f) * f2, hl.L(12.0f) * f2, aob.s0);
            } else {
                f3 = 20.0f;
                f4 = 4.0f;
            }
            if (!z && f2 != 0.0f) {
                int L5 = hl.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, i5, (getMeasuredWidth() + L5) / 2, hl.L(f4) + i5);
                int v0 = aob.v0(aob.zj, j20Var.J0);
                int alpha = Color.alpha(v0);
                aob.s0.setColor(v0);
                aob.s0.setAlpha((int) (alpha * 1.0f * f2));
                canvas.drawRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), aob.s0);
            }
            if (z) {
                y10Var.setVisibility(0);
                int i6 = (i4 - hl.m) - j20Var.t0;
                float max = Math.max(0.0f, qd4.A(1.0f, j20Var.K2, hl.L(6.0f), hl.L(f3) + i6) - y10Var.getTop());
                y10Var.setTranslationY(max);
                j20Var.n1.setTranslationY(max);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x10.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        j20 j20Var = this.e;
        j20Var.V0();
        j20Var.U0();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int L;
        int paddingBottom;
        int i5;
        j20 j20Var = this.e;
        l10 l10Var = j20Var.x1;
        l10 l10Var2 = j20Var.b2;
        q10 q10Var = j20Var.r1;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (size != this.c || size2 != this.d) {
            if (l10Var2.getTag() != null) {
                j20Var.R0(false, false);
            }
            this.d = size2;
            this.c = size;
        }
        this.b = true;
        if (!j20Var.p1 && !j20Var.d) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        l10Var.setVisibility(i3);
        j20Var.o1.setVisibility(l10Var.getVisibility());
        int paddingTop = size - getPaddingTop();
        ((FrameLayout.LayoutParams) q10Var.getLayoutParams()).topMargin = a.getCurrentActionBarHeight() + hl.m;
        ((FrameLayout.LayoutParams) j20Var.n1.getLayoutParams()).topMargin = a.getCurrentActionBarHeight() + hl.m;
        ((FrameLayout.LayoutParams) l10Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int i6 = 52;
        if (!j20Var.J0() && !j20Var.s2) {
            i4 = 52;
        } else {
            i4 = 0;
        }
        int L2 = hl.L(179 + i4);
        if (j20Var.q2.size() > 1) {
            L2 += (hl.L(56.0f) * j20Var.q2.size()) + j20Var.t0;
        }
        if (!j20Var.q1 && !j20Var.d) {
            if (L2 >= paddingTop) {
                L2 = (int) ((paddingTop / 5) * 3.5f);
            }
            L = hl.L(8.0f) + (paddingTop - L2);
            if (!j20Var.J0() && !j20Var.s2) {
                i5 = 52;
            } else {
                i5 = 0;
            }
            if (L > paddingTop - hl.L(i5 + 329)) {
                if (j20Var.J0() || j20Var.s2) {
                    i6 = 0;
                }
                L = paddingTop - hl.L(i6 + 329);
            }
            if (L < 0) {
                L = 0;
            }
        } else {
            L = hl.L(8.0f);
        }
        if (j20Var.o2) {
            L = 0;
        }
        if (q10Var.getPaddingTop() != L) {
            if (j20Var.q1 && j20Var.d) {
                paddingBottom = 0;
            } else {
                paddingBottom = q10Var.getPaddingBottom();
            }
            q10Var.setPadding(0, L, 0, paddingBottom);
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
