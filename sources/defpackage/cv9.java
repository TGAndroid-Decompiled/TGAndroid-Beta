package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
public abstract class cv9 extends HorizontalScrollView {
    public boolean a;
    public LinearLayout b;
    public ValueAnimator c;
    public boolean d;
    public int e;
    public ValueAnimator f;

    public cv9(Context context) {
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
            ofFloat.addUpdateListener(new b49(this, (byte) 12));
            this.f.setInterpolator(k43.h);
            this.f.setDuration(250L);
            this.f.addListener(new po9(this, (byte) 2));
            this.f.start();
        }
    }

    public final void b(int i, int i2) {
        int measuredWidth;
        if (getChildCount() > 0) {
            int L = hl.L(50.0f);
            if (i < getScrollX() + L) {
                measuredWidth = i - L;
            } else {
                if (i2 > (getMeasuredWidth() - L) + getScrollX()) {
                    measuredWidth = (i2 - getMeasuredWidth()) + L;
                } else {
                    return;
                }
            }
            a(ete.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
        }
    }

    public final void c() {
        boolean z;
        boolean z2;
        wl wlVar;
        nl nlVar;
        b29 b29Var;
        ValueAnimator valueAnimator;
        int childCount = this.b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.b.getChildAt(i);
            if (childAt instanceof uy3) {
                uy3 uy3Var = (uy3) childAt;
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
                if (!uy3Var.E && z && (b29Var = uy3Var.e) != null && !b29Var.l0 && !z2) {
                    uy3Var.e.O(true, 0.0f);
                    uy3Var.e.start();
                }
                if (uy3Var.E != z) {
                    uy3Var.E = z;
                    if (z) {
                        uy3Var.invalidate();
                        cl8 cl8Var = uy3Var.f;
                        if (cl8Var != null) {
                            cl8Var.invalidate();
                        }
                        cl8 cl8Var2 = uy3Var.f;
                        if (cl8Var2 != null && (wlVar = uy3Var.x) != null && (nlVar = wlVar.k) != null) {
                            cl8Var2.setImageReceiver(nlVar);
                        }
                        de0 de0Var = uy3Var.d;
                        if (de0Var != null) {
                            de0Var.invalidate();
                        }
                    } else {
                        uy3Var.b();
                    }
                    uy3Var.c();
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
