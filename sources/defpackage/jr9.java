package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
public abstract class jr9 extends HorizontalScrollView {
    public boolean a;
    public LinearLayout b;
    public ValueAnimator c;
    public boolean d;
    public int e;
    public ValueAnimator f;

    public jr9(Context context) {
        super(context);
        this.e = -1;
    }

    public final void a(int i) {
        if (this.e != i) {
            this.e = i;
            ValueAnimator valueAnimator = this.f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i);
            this.f = ofFloat;
            ofFloat.addUpdateListener(new x89(this, (byte) 10));
            this.f.setInterpolator(s33.h);
            this.f.setDuration(250L);
            this.f.addListener(new ng9(this, (byte) 3));
            this.f.start();
        }
    }

    public final void b(int i, int i2) {
        int measuredWidth;
        if (getChildCount() > 0) {
            int L = gl.L(50.0f);
            if (i < getScrollX() + L) {
                measuredWidth = i - L;
            } else {
                if (i2 > (getMeasuredWidth() - L) + getScrollX()) {
                    measuredWidth = (i2 - getMeasuredWidth()) + L;
                } else {
                    return;
                }
            }
            a(moe.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
        }
    }

    public final void c() {
        boolean z;
        boolean z2;
        vl vlVar;
        ml mlVar;
        oy8 oy8Var;
        ValueAnimator valueAnimator;
        int childCount = this.b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.b.getChildAt(i);
            if (childAt instanceof zx3) {
                zx3 zx3Var = (zx3) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.d && ((valueAnimator = this.c) == null || !valueAnimator.isRunning())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!zx3Var.E && z && (oy8Var = zx3Var.e) != null && !oy8Var.l0 && !z2) {
                    zx3Var.e.O(true, 0.0f);
                    zx3Var.e.start();
                }
                if (zx3Var.E != z) {
                    zx3Var.E = z;
                    if (z) {
                        zx3Var.invalidate();
                        oh8 oh8Var = zx3Var.f;
                        if (oh8Var != null) {
                            oh8Var.invalidate();
                        }
                        oh8 oh8Var2 = zx3Var.f;
                        if (oh8Var2 != null && (vlVar = zx3Var.x) != null && (mlVar = vlVar.k) != null) {
                            oh8Var2.setImageReceiver(mlVar);
                        }
                        be0 be0Var = zx3Var.d;
                        if (be0Var != null) {
                            be0Var.invalidate();
                        }
                    } else {
                        zx3Var.b();
                    }
                    zx3Var.c();
                }
            }
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c();
    }

    @Override
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if ((Math.abs(i2 - i4) < 2 || i2 >= getMeasuredHeight() || i2 == 0) && !this.a) {
            requestDisallowInterceptTouchEvent(false);
        }
        c();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 1) {
            motionEvent.getAction();
        }
        return super.onTouchEvent(motionEvent);
    }
}
