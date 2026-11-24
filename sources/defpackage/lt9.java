package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
public abstract class lt9 extends HorizontalScrollView {
    public boolean a;
    public LinearLayout b;
    public ValueAnimator c;
    public boolean d;
    public int e;
    public ValueAnimator f;

    public lt9(Context context) {
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
            ofFloat.addUpdateListener(new p29(this, (byte) 12));
            this.f.setInterpolator(d53.h);
            this.f.setDuration(250L);
            this.f.addListener(new c39(this, (byte) 5));
            this.f.start();
        }
    }

    public final void b(int i, int i2) {
        int measuredWidth;
        if (getChildCount() > 0) {
            int L = gm.L(50.0f);
            if (i < getScrollX() + L) {
                measuredWidth = i - L;
            } else {
                if (i2 > (getMeasuredWidth() - L) + getScrollX()) {
                    measuredWidth = (i2 - getMeasuredWidth()) + L;
                } else {
                    return;
                }
            }
            a(pqe.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
        }
    }

    public final void c() {
        boolean z;
        boolean z2;
        vm vmVar;
        mm mmVar;
        p09 p09Var;
        ValueAnimator valueAnimator;
        int childCount = this.b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.b.getChildAt(i);
            if (childAt instanceof jz3) {
                jz3 jz3Var = (jz3) childAt;
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
                if (!jz3Var.E && z && (p09Var = jz3Var.e) != null && !p09Var.l0 && !z2) {
                    jz3Var.e.O(true, 0.0f);
                    jz3Var.e.start();
                }
                if (jz3Var.E != z) {
                    jz3Var.E = z;
                    if (z) {
                        jz3Var.invalidate();
                        pj8 pj8Var = jz3Var.f;
                        if (pj8Var != null) {
                            pj8Var.invalidate();
                        }
                        pj8 pj8Var2 = jz3Var.f;
                        if (pj8Var2 != null && (vmVar = jz3Var.x) != null && (mmVar = vmVar.k) != null) {
                            pj8Var2.setImageReceiver(mmVar);
                        }
                        bf0 bf0Var = jz3Var.d;
                        if (bf0Var != null) {
                            bf0Var.invalidate();
                        }
                    } else {
                        jz3Var.b();
                    }
                    jz3Var.c();
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
