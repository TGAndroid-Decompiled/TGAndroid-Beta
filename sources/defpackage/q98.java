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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class q98 extends wma {
    public int g0;
    public boolean h0;
    public boolean i0;
    public int j0;
    public int k0;
    public VelocityTracker l0;
    public boolean m0;
    public final s98 n0;

    public q98(s98 s98Var, Context context) {
        super(context, null);
        this.n0 = s98Var;
    }

    public final boolean X() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q98.X():boolean");
    }

    public final boolean Y(MotionEvent motionEvent, boolean z) {
        int i;
        a aVar;
        s98 s98Var = this.n0;
        r98[] r98VarArr = s98Var.n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = s98Var.h;
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
        this.i0 = false;
        this.h0 = true;
        this.j0 = (int) motionEvent.getX();
        aVar = ((e) s98Var).actionBar;
        aVar.setEnabled(false);
        s98Var.h.setEnabled(false);
        r98 r98Var = r98VarArr[1];
        r98Var.b = i3;
        r98Var.setVisibility(0);
        s98Var.w = z;
        s98Var.n0(true);
        if (z) {
            r98VarArr[1].setTranslationX(r98VarArr[0].getMeasuredWidth());
            return true;
        }
        r98VarArr[1].setTranslationX(-r98VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a aVar;
        a aVar2;
        super.dispatchDraw(canvas);
        s98 s98Var = this.n0;
        aVar = ((e) s98Var).actionBar;
        int measuredHeight = aVar.getMeasuredHeight();
        aVar2 = ((e) s98Var).actionBar;
        float translationY = measuredHeight + ((int) aVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, aob.j0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar;
        a aVar2;
        s98 s98Var = this.n0;
        Paint paint = s98Var.f;
        paint.setColor(aob.w0(null, aob.a7, false));
        aVar = ((e) s98Var).actionBar;
        aVar2 = ((e) s98Var).actionBar;
        canvas.drawRect(0.0f, aVar2.getTranslationY() + aVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!X() && !this.n0.h.I && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q98.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q98.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wk5 wk5Var;
        float f;
        float f2;
        a aVar;
        boolean z;
        float measuredWidth;
        r98 r98Var;
        r98 r98Var2;
        int measuredWidth2;
        r98 r98Var3;
        r98 r98Var4;
        boolean z2;
        boolean z3;
        int i;
        s98 s98Var = this.n0;
        r98[] r98VarArr = s98Var.n;
        wk5Var = ((e) s98Var).parentLayout;
        boolean z4 = false;
        if (((ActionBarLayout) wk5Var).h() || X()) {
            return false;
        }
        if (motionEvent != null) {
            VelocityTracker velocityTracker = this.l0;
            if (velocityTracker == null) {
                velocityTracker = VelocityTracker.obtain();
                this.l0 = velocityTracker;
            }
            velocityTracker.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.h0 && !this.i0) {
            this.g0 = motionEvent.getPointerId(0);
            this.i0 = true;
            this.j0 = (int) motionEvent.getX();
            this.k0 = (int) motionEvent.getY();
            this.l0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.g0) {
            int x = (int) (motionEvent.getX() - this.j0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.k0);
            if (this.h0 && (!s98Var.w ? x < 0 : x > 0)) {
                if (x < 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!Y(motionEvent, z3)) {
                    this.i0 = true;
                    this.h0 = false;
                    r98VarArr[0].setTranslationX(0.0f);
                    r98 r98Var5 = r98VarArr[1];
                    if (s98Var.w) {
                        i = r98VarArr[0].getMeasuredWidth();
                    } else {
                        i = -r98VarArr[0].getMeasuredWidth();
                    }
                    r98Var5.setTranslationX(i);
                    s98Var.h.i(0.0f, r98VarArr[1].b);
                }
            }
            if (this.i0 && !this.h0) {
                if (Math.abs(x) >= hl.Z0(true, 0.3f) && Math.abs(x) > abs) {
                    if (x < 0) {
                        z4 = true;
                    }
                    Y(motionEvent, z4);
                }
            } else if (this.h0) {
                r98VarArr[0].setTranslationX(x);
                if (s98Var.w) {
                    r98VarArr[1].setTranslationX(r98VarArr[0].getMeasuredWidth() + x);
                } else {
                    r98VarArr[1].setTranslationX(x - r98VarArr[0].getMeasuredWidth());
                }
                s98Var.h.i(Math.abs(x) / r98VarArr[0].getMeasuredWidth(), r98VarArr[1].b);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.g0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.l0.computeCurrentVelocity(1000, s98Var.y);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f = this.l0.getXVelocity();
                f2 = this.l0.getYVelocity();
                if (!this.h0 && Math.abs(f) >= 3000.0f && Math.abs(f) > Math.abs(f2)) {
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
            if (this.h0) {
                float x2 = r98VarArr[0].getX();
                s98Var.r = new AnimatorSet();
                if (Math.abs(x2) < r98VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2))) {
                    z = true;
                } else {
                    z = false;
                }
                s98Var.x = z;
                Property property = View.TRANSLATION_X;
                if (z) {
                    measuredWidth = Math.abs(x2);
                    boolean z5 = s98Var.w;
                    AnimatorSet animatorSet = s98Var.r;
                    if (z5) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(r98VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(r98VarArr[1], property, r98Var4.getMeasuredWidth()));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(r98VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(r98VarArr[1], property, -r98Var3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = r98VarArr[0].getMeasuredWidth() - Math.abs(x2);
                    boolean z6 = s98Var.w;
                    AnimatorSet animatorSet2 = s98Var.r;
                    if (z6) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(r98VarArr[0], property, -r98Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(r98VarArr[1], property, 0.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(r98VarArr[0], property, r98Var.getMeasuredWidth()), ObjectAnimator.ofFloat(r98VarArr[1], property, 0.0f));
                    }
                }
                s98Var.r.setInterpolator(s98.E);
                int measuredWidth3 = getMeasuredWidth();
                float f3 = measuredWidth3 / 2;
                float I = (hl.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f3) + f3;
                float abs2 = Math.abs(f);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs2) * 1000.0f) << 2;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                s98Var.r.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                s98Var.r.addListener(new n88(this, (byte) 2));
                s98Var.r.start();
                s98Var.s = true;
                this.h0 = false;
            } else {
                this.i0 = false;
                aVar = ((e) s98Var).actionBar;
                aVar.setEnabled(true);
                s98Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker2 = this.l0;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.l0 = null;
            }
        }
        return this.h0;
    }

    @Override
    public final void requestLayout() {
        if (this.m0) {
            return;
        }
        super.requestLayout();
    }
}
