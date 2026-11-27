package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
public final class im7 extends q9c implements t94 {
    public final int n3;
    public final int o3;
    public v94 p3;
    public float q3;
    public float r3;
    public float s3;
    public boolean t3;
    public boolean u3;
    public boolean v3;
    public boolean w3;
    public ValueAnimator x3;
    public boolean y3;
    public final lm7 z3;

    public im7(defpackage.lm7 r10, android.content.Context r11, int r12, defpackage.f r13, defpackage.bf r14, defpackage.wg r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im7.<init>(lm7, android.content.Context, int, f, bf, wg):void");
    }

    @Override
    public final boolean J0(View view, float f, float f2) {
        if (view instanceof v94) {
            v94 v94Var = (v94) view;
            HorizontalScrollView horizontalScrollView = v94Var.y;
            if (v94Var.R > 0.0f && horizontalScrollView.getVisibility() == 0 && f2 >= horizontalScrollView.getTop() && f2 <= horizontalScrollView.getBottom()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean M1(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im7.M1(android.view.MotionEvent):boolean");
    }

    public final void N1(float f) {
        boolean z;
        float L = hl.L(88.0f);
        float max = Math.max(0.0f, f);
        if (max > L) {
            max = qd4.A(max, L, 0.3f, L);
        }
        this.s3 = max;
        if (max >= L) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.v3) {
            this.v3 = z;
            if (z) {
                try {
                    View view = this.z3.fragmentView;
                    if (view != null) {
                        view.performHapticFeedback(3, 2);
                    }
                } catch (Exception unused) {
                }
            }
        }
        this.p3.o(this.w3, max);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (!this.y3 && (view instanceof v94) && ((v94) view).n0) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void i0(View view) {
        super.i0(view);
        if (view instanceof v94) {
            ((v94) view).p();
        }
    }

    @Override
    public final void m(Canvas canvas, View view, long j) {
        this.y3 = true;
        drawChild(canvas, view, j);
        this.y3 = false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (M1(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.u3) {
            M1(motionEvent);
            return true;
        } else if (motionEvent.getActionMasked() != 0 && M1(motionEvent)) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            super.onTouchEvent(obtain);
            obtain.recycle();
            return true;
        } else {
            return super.onTouchEvent(motionEvent);
        }
    }
}
