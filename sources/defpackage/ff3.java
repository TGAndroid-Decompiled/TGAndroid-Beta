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
public final class ff3 extends FrameLayout {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public VelocityTracker f;
    public boolean h;
    public final hf3 n;

    public ff3(hf3 hf3Var, Context context) {
        super(context);
        this.n = hf3Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff3.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z) {
        int i;
        a aVar;
        hf3 hf3Var = this.n;
        gf3[] gf3VarArr = hf3Var.f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = hf3Var.e;
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
        aVar = ((d) hf3Var).actionBar;
        aVar.setEnabled(false);
        hf3Var.e.setEnabled(false);
        gf3 gf3Var = gf3VarArr[1];
        gf3Var.f = i3;
        gf3Var.setVisibility(0);
        hf3Var.r = z;
        hf3Var.q0(true);
        if (z) {
            gf3VarArr[1].setTranslationX(gf3VarArr[0].getMeasuredWidth());
            return true;
        }
        gf3VarArr[1].setTranslationX(-gf3VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ui5 ui5Var;
        ui5 ui5Var2;
        a aVar;
        a aVar2;
        super.dispatchDraw(canvas);
        hf3 hf3Var = this.n;
        ui5Var = ((d) hf3Var).parentLayout;
        if (ui5Var != null) {
            ui5Var2 = ((d) hf3Var).parentLayout;
            aVar = ((d) hf3Var).actionBar;
            int measuredHeight = aVar.getMeasuredHeight();
            aVar2 = ((d) hf3Var).actionBar;
            ((ActionBarLayout) ui5Var2).o(canvas, measuredHeight + ((int) aVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a aVar;
        a aVar2;
        hf3 hf3Var = this.n;
        Paint paint = hf3Var.d;
        paint.setColor(bkb.w0(null, bkb.c6, false));
        aVar = ((d) hf3Var).actionBar;
        aVar2 = ((d) hf3Var).actionBar;
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
        hf3 hf3Var = this.n;
        gf3[] gf3VarArr = hf3Var.f;
        aVar = ((d) hf3Var).actionBar;
        measureChildWithMargins(aVar, i, 0, i2, 0);
        aVar2 = ((d) hf3Var).actionBar;
        int measuredHeight = aVar2.getMeasuredHeight();
        this.h = true;
        for (int i3 = 0; i3 < gf3VarArr.length; i3++) {
            gf3 gf3Var = gf3VarArr[i3];
            if (gf3Var != null) {
                o39 o39Var = gf3Var.d;
                if (o39Var != null) {
                    o39Var.setPadding(0, measuredHeight, 0, 0);
                }
                ns9 ns9Var = gf3VarArr[i3].e;
                if (ns9Var != null) {
                    ns9Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8) {
                aVar3 = ((d) hf3Var).actionBar;
                if (childAt != aVar3) {
                    measureChildWithMargins(childAt, i, 0, i2, 0);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ui5 ui5Var;
        float f;
        float f2;
        a aVar;
        boolean z;
        float measuredWidth;
        gf3 gf3Var;
        gf3 gf3Var2;
        int measuredWidth2;
        gf3 gf3Var3;
        gf3 gf3Var4;
        boolean z2;
        boolean z3;
        int i;
        hf3 hf3Var = this.n;
        gf3[] gf3VarArr = hf3Var.f;
        ui5Var = ((d) hf3Var).parentLayout;
        boolean z4 = false;
        if (((ActionBarLayout) ui5Var).h() || a()) {
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
            if (this.b && (!hf3Var.r ? x < 0 : x > 0)) {
                if (x < 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!b(motionEvent, z3)) {
                    this.c = true;
                    this.b = false;
                    gf3VarArr[0].setTranslationX(0.0f);
                    gf3 gf3Var5 = gf3VarArr[1];
                    if (hf3Var.r) {
                        i = gf3VarArr[0].getMeasuredWidth();
                    } else {
                        i = -gf3VarArr[0].getMeasuredWidth();
                    }
                    gf3Var5.setTranslationX(i);
                    hf3Var.e.i(0.0f, gf3VarArr[1].f);
                }
            }
            if (this.c && !this.b) {
                if (Math.abs(x) >= gl.Z0(true, 0.3f) && Math.abs(x) > abs) {
                    if (x < 0) {
                        z4 = true;
                    }
                    b(motionEvent, z4);
                }
            } else if (this.b) {
                gf3VarArr[0].setTranslationX(x);
                if (hf3Var.r) {
                    gf3VarArr[1].setTranslationX(gf3VarArr[0].getMeasuredWidth() + x);
                } else {
                    gf3VarArr[1].setTranslationX(x - gf3VarArr[0].getMeasuredWidth());
                }
                hf3Var.e.i(Math.abs(x) / gf3VarArr[0].getMeasuredWidth(), gf3VarArr[1].f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f.computeCurrentVelocity(1000, hf3Var.w);
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
                float x2 = gf3VarArr[0].getX();
                hf3Var.h = new AnimatorSet();
                if (Math.abs(x2) < gf3VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2))) {
                    z = true;
                } else {
                    z = false;
                }
                hf3Var.s = z;
                Property property = View.TRANSLATION_X;
                if (z) {
                    measuredWidth = Math.abs(x2);
                    boolean z5 = hf3Var.r;
                    AnimatorSet animatorSet = hf3Var.h;
                    if (z5) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(gf3VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(gf3VarArr[1], property, gf3Var4.getMeasuredWidth()));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(gf3VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(gf3VarArr[1], property, -gf3Var3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = gf3VarArr[0].getMeasuredWidth() - Math.abs(x2);
                    boolean z6 = hf3Var.r;
                    AnimatorSet animatorSet2 = hf3Var.h;
                    if (z6) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(gf3VarArr[0], property, -gf3Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(gf3VarArr[1], property, 0.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(gf3VarArr[0], property, gf3Var.getMeasuredWidth()), ObjectAnimator.ofFloat(gf3VarArr[1], property, 0.0f));
                    }
                }
                hf3Var.h.setInterpolator(hf3.y);
                int measuredWidth3 = getMeasuredWidth();
                float f3 = measuredWidth3 / 2;
                float I = (gl.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f3) + f3;
                float abs2 = Math.abs(f);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs2) * 1000.0f) << 2;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                hf3Var.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                hf3Var.h.addListener(new im2(this, (byte) 5));
                hf3Var.h.start();
                hf3Var.n = true;
                this.b = false;
            } else {
                this.c = false;
                aVar = ((d) hf3Var).actionBar;
                aVar.setEnabled(true);
                hf3Var.e.setEnabled(true);
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
