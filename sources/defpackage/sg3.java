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
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class sg3 extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final ug3 n;

    public sg3(ug3 ug3Var, Context context) {
        super(context);
        this.n = ug3Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sg3.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z) {
        int i;
        a aVar;
        ug3 ug3Var = this.n;
        tg3[] tg3VarArr = ug3Var.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = ug3Var.e;
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
        this.c = false;
        this.b = true;
        this.d = (int) motionEvent.getX();
        aVar = ((d) ug3Var).actionBar;
        aVar.setEnabled(false);
        ug3Var.e.setEnabled(false);
        tg3 tg3Var = tg3VarArr[1];
        tg3Var.f = i3;
        tg3Var.setVisibility(0);
        ug3Var.r = z;
        ug3Var.r0(true);
        if (z) {
            tg3VarArr[1].setTranslationX(tg3VarArr[0].getMeasuredWidth());
            return true;
        }
        tg3VarArr[1].setTranslationX(-tg3VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        tk5 tk5Var;
        tk5 tk5Var2;
        a aVar;
        a aVar2;
        super.dispatchDraw(canvas);
        ug3 ug3Var = this.n;
        tk5Var = ((d) ug3Var).parentLayout;
        if (tk5Var != null) {
            tk5Var2 = ((d) ug3Var).parentLayout;
            aVar = ((d) ug3Var).actionBar;
            int measuredHeight = aVar.getMeasuredHeight();
            aVar2 = ((d) ug3Var).actionBar;
            ((ActionBarLayout) tk5Var2).o(canvas, measuredHeight + ((int) aVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar;
        a aVar2;
        ug3 ug3Var = this.n;
        Paint paint = ug3Var.d;
        paint.setColor(cmb.w0(null, cmb.c6, false));
        aVar = ((d) ug3Var).actionBar;
        aVar2 = ((d) ug3Var).actionBar;
        canvas.drawRect(0.0f, aVar2.getTranslationY() + aVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.n.e.I && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        a aVar;
        a aVar2;
        a aVar3;
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        ug3 ug3Var = this.n;
        tg3[] tg3VarArr = ug3Var.f;
        aVar = ((d) ug3Var).actionBar;
        measureChildWithMargins(aVar, i, 0, i2, 0);
        aVar2 = ((d) ug3Var).actionBar;
        int measuredHeight = aVar2.getMeasuredHeight();
        this.h = true;
        for (int i3 = 0; i3 < tg3VarArr.length; i3++) {
            tg3 tg3Var = tg3VarArr[i3];
            if (tg3Var != null) {
                r59 r59Var = tg3Var.d;
                if (r59Var != null) {
                    r59Var.setPadding(0, measuredHeight, 0, 0);
                }
                pu9 pu9Var = tg3VarArr[i3].e;
                if (pu9Var != null) {
                    pu9Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8) {
                aVar3 = ((d) ug3Var).actionBar;
                if (childAt != aVar3) {
                    measureChildWithMargins(childAt, i, 0, i2, 0);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tk5 tk5Var;
        float f;
        float f2;
        a aVar;
        boolean z;
        float measuredWidth;
        tg3 tg3Var;
        tg3 tg3Var2;
        int measuredWidth2;
        tg3 tg3Var3;
        tg3 tg3Var4;
        boolean z2;
        boolean z3;
        int i;
        ug3 ug3Var = this.n;
        tg3[] tg3VarArr = ug3Var.f;
        tk5Var = ((d) ug3Var).parentLayout;
        boolean z4 = false;
        if (((ActionBarLayout) tk5Var).h() || a()) {
            return false;
        }
        if (motionEvent != null) {
            VelocityTracker velocityTracker = this.f;
            if (velocityTracker == null) {
                velocityTracker = VelocityTracker.obtain();
                this.f = velocityTracker;
            }
            velocityTracker.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.b && !this.c) {
            this.a = motionEvent.getPointerId(0);
            this.c = true;
            this.d = (int) motionEvent.getX();
            this.e = (int) motionEvent.getY();
            this.f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.a) {
            int x = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.e);
            if (this.b && (!ug3Var.r ? x < 0 : x > 0)) {
                if (x < 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!b(motionEvent, z3)) {
                    this.c = true;
                    this.b = false;
                    tg3VarArr[0].setTranslationX(0.0f);
                    tg3 tg3Var5 = tg3VarArr[1];
                    if (ug3Var.r) {
                        i = tg3VarArr[0].getMeasuredWidth();
                    } else {
                        i = -tg3VarArr[0].getMeasuredWidth();
                    }
                    tg3Var5.setTranslationX(i);
                    ug3Var.e.i(0.0f, tg3VarArr[1].f);
                }
            }
            if (this.c && !this.b) {
                if (Math.abs(x) >= gm.Z0(true, 0.3f) && Math.abs(x) > abs) {
                    if (x < 0) {
                        z4 = true;
                    }
                    b(motionEvent, z4);
                }
            } else if (this.b) {
                tg3VarArr[0].setTranslationX(x);
                if (ug3Var.r) {
                    tg3VarArr[1].setTranslationX(tg3VarArr[0].getMeasuredWidth() + x);
                } else {
                    tg3VarArr[1].setTranslationX(x - tg3VarArr[0].getMeasuredWidth());
                }
                ug3Var.e.i(Math.abs(x) / tg3VarArr[0].getMeasuredWidth(), tg3VarArr[1].f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(1000, ug3Var.w);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f = this.f.getXVelocity();
                f2 = this.f.getYVelocity();
                if (!this.b && Math.abs(f) >= 3000.0f && Math.abs(f) > Math.abs(f2)) {
                    if (f < 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    b(motionEvent, z2);
                }
            } else {
                f = 0.0f;
                f2 = 0.0f;
            }
            if (this.b) {
                float x2 = tg3VarArr[0].getX();
                ug3Var.h = new AnimatorSet();
                if (Math.abs(x2) < tg3VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2))) {
                    z = true;
                } else {
                    z = false;
                }
                ug3Var.s = z;
                Property property = View.TRANSLATION_X;
                if (z) {
                    measuredWidth = Math.abs(x2);
                    boolean z5 = ug3Var.r;
                    AnimatorSet animatorSet = ug3Var.h;
                    if (z5) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(tg3VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(tg3VarArr[1], property, tg3Var4.getMeasuredWidth()));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(tg3VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(tg3VarArr[1], property, -tg3Var3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = tg3VarArr[0].getMeasuredWidth() - Math.abs(x2);
                    boolean z6 = ug3Var.r;
                    AnimatorSet animatorSet2 = ug3Var.h;
                    if (z6) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(tg3VarArr[0], property, -tg3Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(tg3VarArr[1], property, 0.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(tg3VarArr[0], property, tg3Var.getMeasuredWidth()), ObjectAnimator.ofFloat(tg3VarArr[1], property, 0.0f));
                    }
                }
                ug3Var.h.setInterpolator(ug3.y);
                int measuredWidth3 = getMeasuredWidth();
                float f3 = measuredWidth3 / 2;
                float I = (gm.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f3) + f3;
                float abs2 = Math.abs(f);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs2) * 1000.0f) << 2;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                ug3Var.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                ug3Var.h.addListener(new kh2(this, (byte) 7));
                ug3Var.h.start();
                ug3Var.n = true;
                this.b = false;
            } else {
                this.c = false;
                aVar = ((d) ug3Var).actionBar;
                aVar.setEnabled(true);
                ug3Var.e.setEnabled(true);
            }
            VelocityTracker velocityTracker2 = this.f;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f = null;
            }
        }
        return this.b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
