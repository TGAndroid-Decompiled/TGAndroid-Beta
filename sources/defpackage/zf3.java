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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class zf3 extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final bg3 n;

    public zf3(bg3 bg3Var, Context context) {
        super(context);
        this.n = bg3Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zf3.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z) {
        int i;
        a aVar;
        bg3 bg3Var = this.n;
        ag3[] ag3VarArr = bg3Var.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = bg3Var.e;
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
        aVar = ((e) bg3Var).actionBar;
        aVar.setEnabled(false);
        bg3Var.e.setEnabled(false);
        ag3 ag3Var = ag3VarArr[1];
        ag3Var.f = i3;
        ag3Var.setVisibility(0);
        bg3Var.r = z;
        bg3Var.q0(true);
        if (z) {
            ag3VarArr[1].setTranslationX(ag3VarArr[0].getMeasuredWidth());
            return true;
        }
        ag3VarArr[1].setTranslationX(-ag3VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        wk5 wk5Var;
        wk5 wk5Var2;
        a aVar;
        a aVar2;
        super.dispatchDraw(canvas);
        bg3 bg3Var = this.n;
        wk5Var = ((e) bg3Var).parentLayout;
        if (wk5Var != null) {
            wk5Var2 = ((e) bg3Var).parentLayout;
            aVar = ((e) bg3Var).actionBar;
            int measuredHeight = aVar.getMeasuredHeight();
            aVar2 = ((e) bg3Var).actionBar;
            ((ActionBarLayout) wk5Var2).o(canvas, measuredHeight + ((int) aVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar;
        a aVar2;
        bg3 bg3Var = this.n;
        Paint paint = bg3Var.d;
        paint.setColor(aob.w0(null, aob.d6, false));
        aVar = ((e) bg3Var).actionBar;
        aVar2 = ((e) bg3Var).actionBar;
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
        bg3 bg3Var = this.n;
        ag3[] ag3VarArr = bg3Var.f;
        aVar = ((e) bg3Var).actionBar;
        measureChildWithMargins(aVar, i, 0, i2, 0);
        aVar2 = ((e) bg3Var).actionBar;
        int measuredHeight = aVar2.getMeasuredHeight();
        this.h = true;
        for (int i3 = 0; i3 < ag3VarArr.length; i3++) {
            ag3 ag3Var = ag3VarArr[i3];
            if (ag3Var != null) {
                d79 d79Var = ag3Var.d;
                if (d79Var != null) {
                    d79Var.setPadding(0, measuredHeight, 0, 0);
                }
                gw9 gw9Var = ag3VarArr[i3].e;
                if (gw9Var != null) {
                    gw9Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8) {
                aVar3 = ((e) bg3Var).actionBar;
                if (childAt != aVar3) {
                    measureChildWithMargins(childAt, i, 0, i2, 0);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wk5 wk5Var;
        float f;
        float f2;
        a aVar;
        boolean z;
        float measuredWidth;
        ag3 ag3Var;
        ag3 ag3Var2;
        int measuredWidth2;
        ag3 ag3Var3;
        ag3 ag3Var4;
        boolean z2;
        boolean z3;
        int i;
        bg3 bg3Var = this.n;
        ag3[] ag3VarArr = bg3Var.f;
        wk5Var = ((e) bg3Var).parentLayout;
        boolean z4 = false;
        if (((ActionBarLayout) wk5Var).h() || a()) {
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
            if (this.b && (!bg3Var.r ? x < 0 : x > 0)) {
                if (x < 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!b(motionEvent, z3)) {
                    this.c = true;
                    this.b = false;
                    ag3VarArr[0].setTranslationX(0.0f);
                    ag3 ag3Var5 = ag3VarArr[1];
                    if (bg3Var.r) {
                        i = ag3VarArr[0].getMeasuredWidth();
                    } else {
                        i = -ag3VarArr[0].getMeasuredWidth();
                    }
                    ag3Var5.setTranslationX(i);
                    bg3Var.e.i(0.0f, ag3VarArr[1].f);
                }
            }
            if (this.c && !this.b) {
                if (Math.abs(x) >= hl.Z0(true, 0.3f) && Math.abs(x) > abs) {
                    if (x < 0) {
                        z4 = true;
                    }
                    b(motionEvent, z4);
                }
            } else if (this.b) {
                ag3VarArr[0].setTranslationX(x);
                if (bg3Var.r) {
                    ag3VarArr[1].setTranslationX(ag3VarArr[0].getMeasuredWidth() + x);
                } else {
                    ag3VarArr[1].setTranslationX(x - ag3VarArr[0].getMeasuredWidth());
                }
                bg3Var.e.i(Math.abs(x) / ag3VarArr[0].getMeasuredWidth(), ag3VarArr[1].f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(1000, bg3Var.w);
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
                float x2 = ag3VarArr[0].getX();
                bg3Var.h = new AnimatorSet();
                if (Math.abs(x2) < ag3VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2))) {
                    z = true;
                } else {
                    z = false;
                }
                bg3Var.s = z;
                Property property = View.TRANSLATION_X;
                if (z) {
                    measuredWidth = Math.abs(x2);
                    boolean z5 = bg3Var.r;
                    AnimatorSet animatorSet = bg3Var.h;
                    if (z5) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(ag3VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(ag3VarArr[1], property, ag3Var4.getMeasuredWidth()));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(ag3VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(ag3VarArr[1], property, -ag3Var3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = ag3VarArr[0].getMeasuredWidth() - Math.abs(x2);
                    boolean z6 = bg3Var.r;
                    AnimatorSet animatorSet2 = bg3Var.h;
                    if (z6) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(ag3VarArr[0], property, -ag3Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(ag3VarArr[1], property, 0.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(ag3VarArr[0], property, ag3Var.getMeasuredWidth()), ObjectAnimator.ofFloat(ag3VarArr[1], property, 0.0f));
                    }
                }
                bg3Var.h.setInterpolator(bg3.y);
                int measuredWidth3 = getMeasuredWidth();
                float f3 = measuredWidth3 / 2;
                float I = (hl.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f3) + f3;
                float abs2 = Math.abs(f);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs2) * 1000.0f) << 2;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                bg3Var.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                bg3Var.h.addListener(new cn2(this, (byte) 5));
                bg3Var.h.start();
                bg3Var.n = true;
                this.b = false;
            } else {
                this.c = false;
                aVar = ((e) bg3Var).actionBar;
                aVar.setEnabled(true);
                bg3Var.e.setEnabled(true);
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
