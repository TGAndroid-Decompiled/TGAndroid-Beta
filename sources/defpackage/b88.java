package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class b88 extends ela {
    public int m0;
    public boolean n0;
    public boolean o0;
    public int p0;
    public int q0;
    public VelocityTracker r0;
    public boolean s0;
    public final d88 t0;

    public b88(d88 d88Var, Context context) {
        super(context, null);
        this.t0 = d88Var;
    }

    public final boolean X() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b88.X():boolean");
    }

    public final boolean Y(MotionEvent motionEvent, boolean z) {
        int i;
        a aVar;
        d88 d88Var = this.t0;
        c88[] c88VarArr = d88Var.n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = d88Var.h;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.P;
        int i2 = scrollSlidingTextTabStrip.n;
        if (z) {
            i = 1;
        } else {
            i = -1;
        }
        int i3 = sparseIntArray.get(i2 + i, -1);
        if (i3 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.o0 = false;
        this.n0 = true;
        this.p0 = (int) motionEvent.getX();
        aVar = ((d) d88Var).actionBar;
        aVar.setEnabled(false);
        d88Var.h.setEnabled(false);
        c88 c88Var = c88VarArr[1];
        c88Var.b = i3;
        c88Var.setVisibility(0);
        d88Var.w = z;
        d88Var.o0(true);
        if (z) {
            c88VarArr[1].setTranslationX(c88VarArr[0].getMeasuredWidth());
            return true;
        }
        c88VarArr[1].setTranslationX(-c88VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a aVar;
        a aVar2;
        super.dispatchDraw(canvas);
        d88 d88Var = this.t0;
        aVar = ((d) d88Var).actionBar;
        int measuredHeight = aVar.getMeasuredHeight();
        aVar2 = ((d) d88Var).actionBar;
        float translationY = measuredHeight + ((int) aVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, cmb.j0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar;
        a aVar2;
        d88 d88Var = this.t0;
        Paint paint = d88Var.f;
        paint.setColor(cmb.w0(null, cmb.Z6, false));
        aVar = ((d) d88Var).actionBar;
        aVar2 = ((d) d88Var).actionBar;
        canvas.drawRect(0.0f, aVar2.getTranslationY() + aVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!X() && !this.t0.h.I && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b88.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b88.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tk5 tk5Var;
        float f;
        float f2;
        a aVar;
        boolean z;
        float measuredWidth;
        c88 c88Var;
        c88 c88Var2;
        int measuredWidth2;
        c88 c88Var3;
        c88 c88Var4;
        boolean z2;
        boolean z3;
        int i;
        d88 d88Var = this.t0;
        c88[] c88VarArr = d88Var.n;
        tk5Var = ((d) d88Var).parentLayout;
        boolean z4 = false;
        if (((ActionBarLayout) tk5Var).h() || X()) {
            return false;
        }
        if (motionEvent != null) {
            VelocityTracker velocityTracker = this.r0;
            if (velocityTracker == null) {
                velocityTracker = VelocityTracker.obtain();
                this.r0 = velocityTracker;
            }
            velocityTracker.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.n0 && !this.o0) {
            this.m0 = motionEvent.getPointerId(0);
            this.o0 = true;
            this.p0 = (int) motionEvent.getX();
            this.q0 = (int) motionEvent.getY();
            this.r0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.m0) {
            int x = (int) (motionEvent.getX() - this.p0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.q0);
            if (this.n0 && (!d88Var.w ? x < 0 : x > 0)) {
                if (x < 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!Y(motionEvent, z3)) {
                    this.o0 = true;
                    this.n0 = false;
                    c88VarArr[0].setTranslationX(0.0f);
                    c88 c88Var5 = c88VarArr[1];
                    if (d88Var.w) {
                        i = c88VarArr[0].getMeasuredWidth();
                    } else {
                        i = -c88VarArr[0].getMeasuredWidth();
                    }
                    c88Var5.setTranslationX(i);
                    d88Var.h.i(0.0f, c88VarArr[1].b);
                }
            }
            if (this.o0 && !this.n0) {
                if (Math.abs(x) >= gm.Z0(true, 0.3f) && Math.abs(x) > abs) {
                    if (x < 0) {
                        z4 = true;
                    }
                    Y(motionEvent, z4);
                }
            } else if (this.n0) {
                c88VarArr[0].setTranslationX(x);
                if (d88Var.w) {
                    c88VarArr[1].setTranslationX(c88VarArr[0].getMeasuredWidth() + x);
                } else {
                    c88VarArr[1].setTranslationX(x - c88VarArr[0].getMeasuredWidth());
                }
                d88Var.h.i(Math.abs(x) / c88VarArr[0].getMeasuredWidth(), c88VarArr[1].b);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.m0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.r0.computeCurrentVelocity(1000, d88Var.y);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f = this.r0.getXVelocity();
                f2 = this.r0.getYVelocity();
                if (!this.n0 && Math.abs(f) >= 3000.0f && Math.abs(f) > Math.abs(f2)) {
                    if (f < 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Y(motionEvent, z2);
                }
            } else {
                f = 0.0f;
                f2 = 0.0f;
            }
            if (this.n0) {
                float x2 = c88VarArr[0].getX();
                d88Var.r = new AnimatorSet();
                if (Math.abs(x2) < c88VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2))) {
                    z = true;
                } else {
                    z = false;
                }
                d88Var.x = z;
                Property property = View.TRANSLATION_X;
                if (z) {
                    measuredWidth = Math.abs(x2);
                    boolean z5 = d88Var.w;
                    AnimatorSet animatorSet = d88Var.r;
                    if (z5) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(c88VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(c88VarArr[1], property, c88Var4.getMeasuredWidth()));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(c88VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(c88VarArr[1], property, -c88Var3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = c88VarArr[0].getMeasuredWidth() - Math.abs(x2);
                    boolean z6 = d88Var.w;
                    AnimatorSet animatorSet2 = d88Var.r;
                    if (z6) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(c88VarArr[0], property, -c88Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(c88VarArr[1], property, 0.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(c88VarArr[0], property, c88Var.getMeasuredWidth()), ObjectAnimator.ofFloat(c88VarArr[1], property, 0.0f));
                    }
                }
                d88Var.r.setInterpolator(d88.E);
                int measuredWidth3 = getMeasuredWidth();
                float f3 = measuredWidth3 / 2;
                float I = (gm.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f3) + f3;
                float abs2 = Math.abs(f);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs2) * 1000.0f) << 2;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                d88Var.r.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                d88Var.r.addListener(new s38(this, (byte) 5));
                d88Var.r.start();
                d88Var.s = true;
                this.n0 = false;
            } else {
                this.o0 = false;
                aVar = ((d) d88Var).actionBar;
                aVar.setEnabled(true);
                d88Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker2 = this.r0;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.r0 = null;
            }
        }
        return this.n0;
    }

    @Override
    public final void requestLayout() {
        if (this.s0) {
            return;
        }
        super.requestLayout();
    }
}
