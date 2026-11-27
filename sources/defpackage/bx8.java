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
public final class bx8 extends FrameLayout {
    public int E;
    public boolean F;
    public k43 G;
    public hq7 H;
    public hq7 I;
    public cc6 J;
    public zw8 K;
    public TextView L;
    public boolean M;
    public TLRPC.User N;
    public int O;
    public boolean P;
    public yw8 Q;
    public dc6 R;
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
    public xw8 w;
    public boolean x;
    public int y;

    public final void a() {
        xw8 xw8Var = this.w;
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(xw8Var, View.TRANSLATION_Y, hl.L(10.0f) + xw8Var.getMeasuredHeight()));
        if (this.F) {
            float measuredHeight = xw8Var.getMeasuredHeight();
            this.s.setDuration(Math.max(60, (int) (((measuredHeight - xw8Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.F = false;
        } else {
            this.s.setDuration(250L);
        }
        this.s.setInterpolator(k43.f);
        this.s.addListener(new ax8(this, (byte) 2));
        jn7.e().k(jn7.j1, 512);
        this.s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z) {
        float translationY;
        xw8 xw8Var = this.w;
        if (!this.r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f && !this.e && motionEvent.getPointerCount() == 1)) {
                this.b = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                this.c = y;
                if (y >= xw8Var.getTop() && this.b >= xw8Var.getLeft() && this.b <= xw8Var.getRight()) {
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
                        float translationY2 = xw8Var.getTranslationY() + y2;
                        if (translationY2 >= 0.0f) {
                            f = translationY2;
                        }
                        xw8Var.setTranslationY(f);
                        this.c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    VelocityTracker velocityTracker2 = this.a;
                    if (velocityTracker2 == null) {
                        velocityTracker2 = VelocityTracker.obtain();
                        this.a = velocityTracker2;
                    }
                    velocityTracker2.computeCurrentVelocity(1000);
                    float translationY3 = xw8Var.getTranslationY();
                    if (!this.f && translationY3 == 0.0f) {
                        this.e = false;
                        this.f = false;
                    } else {
                        float xVelocity = this.a.getXVelocity();
                        float yVelocity = this.a.getYVelocity();
                        if ((xw8Var.getTranslationY() < hl.Z0(false, 0.8f) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(xw8Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / hl.Z0(false, 0.8f)) * 150.0f));
                            this.h.setInterpolator(k43.g);
                            this.h.addListener(new ax8(this, (byte) 0));
                            jn7.e().k(jn7.j1, 512);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx8.c(boolean):void");
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx8.getValue():float");
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx8.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        bx8 bx8Var;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        getRootView();
        getWindowVisibleDisplayFrame(this.n);
        setMeasuredDimension(size, size2);
        xw8 xw8Var = this.w;
        xw8Var.measure(View.MeasureSpec.makeMeasureSpec((this.y << 1) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.getChildAt(i3);
            if (childAt.getVisibility() != 8 && childAt != xw8Var) {
                bx8Var = this;
                bx8Var.measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            } else {
                bx8Var = this;
            }
            i3++;
            this = bx8Var;
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
