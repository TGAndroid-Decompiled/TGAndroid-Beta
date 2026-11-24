package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class tv8 extends FrameLayout {
    public int E;
    public boolean F;
    public d53 G;
    public lp7 H;
    public lp7 I;
    public yb6 J;
    public rv8 K;
    public TextView L;
    public boolean M;
    public TLRPC.User N;
    public int O;
    public boolean P;
    public qv8 Q;
    public sb6 R;
    public VelocityTracker a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public AnimatorSet h;
    public Rect n;
    public boolean r;
    public AnimatorSet s;
    public pv8 w;
    public boolean x;
    public int y;

    public final void a() {
        pv8 pv8Var = this.w;
        if (this.r) {
            return;
        }
        this.r = true;
        AnimatorSet animatorSet = this.s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(pv8Var, View.TRANSLATION_Y, gm.L(10.0f) + pv8Var.getMeasuredHeight()));
        if (this.F) {
            float measuredHeight = pv8Var.getMeasuredHeight();
            this.s.setDuration(Math.max(60, (int) (((measuredHeight - pv8Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.F = false;
        } else {
            this.s.setDuration(250L);
        }
        this.s.setInterpolator(d53.f);
        this.s.addListener(new sv8(this, (byte) 2));
        nm7.e().k(nm7.j1, 512);
        this.s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z) {
        float translationY;
        pv8 pv8Var = this.w;
        if (!this.r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f && !this.e && motionEvent.getPointerCount() == 1)) {
                this.b = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                this.c = y;
                if (y >= pv8Var.getTop() && this.b >= pv8Var.getLeft() && this.b <= pv8Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.a;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    }
                } else {
                    requestDisallowInterceptTouchEvent(true);
                    a();
                    return true;
                }
            } else {
                float f = 0.0f;
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.b));
                    float y2 = ((int) motionEvent.getY()) - this.c;
                    this.a.addMovement(motionEvent);
                    if (this.e && !this.f && y2 > 0.0f && y2 / 3.0f > Math.abs(abs) && Math.abs(y2) >= this.E) {
                        this.c = (int) motionEvent.getY();
                        this.e = false;
                        this.f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f) {
                        float translationY2 = pv8Var.getTranslationY() + y2;
                        if (translationY2 >= 0.0f) {
                            f = translationY2;
                        }
                        pv8Var.setTranslationY(f);
                        this.c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    VelocityTracker velocityTracker2 = this.a;
                    if (velocityTracker2 == null) {
                        velocityTracker2 = VelocityTracker.obtain();
                        this.a = velocityTracker2;
                    }
                    velocityTracker2.computeCurrentVelocity(1000);
                    float translationY3 = pv8Var.getTranslationY();
                    if (!this.f && translationY3 == 0.0f) {
                        this.e = false;
                        this.f = false;
                    } else {
                        float xVelocity = this.a.getXVelocity();
                        float yVelocity = this.a.getYVelocity();
                        if ((pv8Var.getTranslationY() < gm.Z0(false, 0.8f) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(pv8Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / gm.Z0(false, 0.8f)) * 150.0f));
                            this.h.setInterpolator(d53.g);
                            this.h.addListener(new sv8(this, (byte) 0));
                            nm7.e().k(nm7.j1, 512);
                            this.h.start();
                        } else {
                            this.F = true;
                            a();
                        }
                        this.f = false;
                    }
                    VelocityTracker velocityTracker3 = this.a;
                    if (velocityTracker3 != null) {
                        velocityTracker3.recycle();
                        this.a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z && this.e) || this.f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv8.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.r) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public View getCustomView() {
        return this.Q;
    }

    public boolean getRadiusSet() {
        return this.M;
    }

    public float getValue() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv8.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv8.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        tv8 tv8Var;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        getRootView();
        getWindowVisibleDisplayFrame(this.n);
        setMeasuredDimension(size, size2);
        pv8 pv8Var = this.w;
        pv8Var.measure(View.MeasureSpec.makeMeasureSpec((this.y << 1) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.getChildAt(i3);
            if (childAt.getVisibility() != 8 && childAt != pv8Var) {
                tv8Var = this;
                tv8Var.measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            } else {
                tv8Var = this;
            }
            i3++;
            this = tv8Var;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.e && !this.f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }
}
