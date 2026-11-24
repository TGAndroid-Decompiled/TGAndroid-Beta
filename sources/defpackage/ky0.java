package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.camera.CameraView;
public abstract class ky0 extends FrameLayout implements vlb {
    public float E;
    public boolean F;
    public final Paint G;
    public final my0 H;
    public VelocityTracker a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public AnimatorSet h;
    public final az8 n;
    public final Rect r;
    public final Paint s;
    public boolean w;
    public int x;
    public float y;

    public ky0(my0 my0Var, Context context) {
        super(context);
        this.H = my0Var;
        this.a = null;
        this.d = -1;
        this.e = false;
        this.f = false;
        this.h = null;
        this.r = new Rect();
        this.s = new Paint();
        this.y = 0.0f;
        this.E = 0.0f;
        this.G = new Paint(1);
        this.n = new az8((byte) 3);
        setWillNotDraw(false);
    }

    public final void a() {
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        this.H.o0();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        this.H.z(hashSet);
    }

    public final void b(float f, float f2) {
        my0 my0Var = this.H;
        float translationY = my0Var.b.getTranslationY();
        if ((translationY < gm.Z0(false, 0.8f) && (f2 < 3500.0f || Math.abs(f2) < Math.abs(f))) || (f2 < 0.0f && Math.abs(f2) >= 3500.0f)) {
            this.e = false;
            this.h = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new iy0(this, (byte) 1));
            this.h.playTogether(ObjectAnimator.ofFloat(my0Var.b, "translationY", 0.0f), ofFloat);
            this.h.setDuration((int) ((Math.max(0.0f, translationY) / gm.Z0(false, 0.8f)) * 250.0f));
            this.h.setInterpolator(d53.f);
            this.h.addListener(new jy0(this, (byte) 0));
            nm7.e().k(nm7.j1, 512);
            this.h.start();
            return;
        }
        boolean z = my0Var.e0;
        my0Var.e0 = false;
        my0Var.dismiss();
        my0Var.e0 = z;
    }

    public final void c(Canvas canvas, float f) {
        int i;
        float max;
        int left;
        int i2 = Build.VERSION.SDK_INT;
        Paint paint = this.s;
        my0 my0Var = this.H;
        if (i2 >= 26) {
            int i3 = my0Var.G0;
            if (i3 >= 0) {
                paint.setColor(cmb.v0(i3, my0Var.J0));
            } else {
                paint.setColor(my0Var.H0);
            }
        } else {
            paint.setColor(-16777216);
        }
        if (!my0Var.V0 || my0Var.b.getVisibility() == 0) {
            boolean z = my0Var.n;
            float f2 = 0.0f;
            if ((z && my0Var.S != 0) || my0Var.F0 != 0.0f) {
                if (z) {
                    i = my0Var.O();
                } else {
                    i = 0;
                }
                if (!my0Var.w && (i2 < 29 || my0Var.M() <= 0)) {
                    max = 0.0f;
                } else if (my0Var.s) {
                    max = Math.max(0.0f, Math.min(i - my0Var.F0, my0Var.b.getTranslationY()));
                } else {
                    max = Math.max(0.0f, my0Var.O() - (my0Var.b.getMeasuredHeight() - my0Var.b.getTranslationY()));
                }
                int alpha = paint.getAlpha();
                if (my0Var.V0) {
                    f *= my0Var.b.getAlpha();
                }
                boolean z2 = my0Var.V0;
                ViewGroup viewGroup = my0Var.b;
                if (z2) {
                    left = (int) viewGroup.getX();
                } else {
                    left = viewGroup.getLeft();
                }
                int i4 = left;
                int i5 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                if (i5 < 0) {
                    paint.setAlpha((int) (alpha * f));
                }
                canvas.drawRect(my0Var.u0 + i4, ((getMeasuredHeight() - i) + max) - my0Var.F0, my0Var.b.getRight() - my0Var.u0, getMeasuredHeight() + max, paint);
                paint.setAlpha(alpha);
                int i6 = my0Var.g1;
                if (i6 != 0) {
                    paint.setColor(i6);
                    int alpha2 = paint.getAlpha();
                    float Q0 = gm.Q0(i);
                    if (i5 < 0) {
                        paint.setAlpha((int) (alpha2 * f * Q0));
                    } else {
                        f2 = max;
                    }
                    if (paint.getAlpha() > 0) {
                        canvas.drawRect(i4 + my0Var.u0, ((getMeasuredHeight() - i) + f2) - my0Var.F0, my0Var.b.getRight() - my0Var.u0, getMeasuredHeight() + f2, paint);
                    }
                    paint.setAlpha(alpha2);
                }
            }
        }
    }

    public final boolean d(MotionEvent motionEvent, boolean z) {
        my0 my0Var = this.H;
        dy0 dy0Var = my0Var.c;
        int i = my0Var.j0;
        if (!my0Var.J) {
            if (!my0Var.c0(motionEvent)) {
                if (!my0Var.F(motionEvent) && !this.F) {
                    if (my0Var.E() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f && !this.e && motionEvent.getPointerCount() == 1)) {
                        this.b = (int) motionEvent.getX();
                        int y = (int) motionEvent.getY();
                        this.c = y;
                        if (my0Var.T(this.b, y)) {
                            my0Var.l0();
                            return true;
                        }
                        this.d = motionEvent.getPointerId(0);
                        this.e = true;
                        a();
                        VelocityTracker velocityTracker = this.a;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    } else if (my0Var.C() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        if (this.a == null) {
                            this.a = VelocityTracker.obtain();
                        }
                        float abs = Math.abs((int) (motionEvent.getX() - this.b));
                        float y2 = ((int) motionEvent.getY()) - this.c;
                        this.a.addMovement(motionEvent);
                        if (!my0Var.E0 && this.e && !this.f && y2 > 0.0f && y2 / 3.0f > Math.abs(abs) && Math.abs(y2) >= i) {
                            this.c = (int) motionEvent.getY();
                            this.e = false;
                            this.f = true;
                            requestDisallowInterceptTouchEvent(true);
                        } else if (this.f) {
                            float f = this.y + y2;
                            this.y = f;
                            float max = Math.max(f, 0.0f);
                            this.y = max;
                            my0Var.b.setTranslationY(Math.max(max, 0.0f));
                            my0Var.e0();
                            this.c = (int) motionEvent.getY();
                            dy0Var.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        VelocityTracker velocityTracker2 = this.a;
                        if (velocityTracker2 == null) {
                            velocityTracker2 = VelocityTracker.obtain();
                            this.a = velocityTracker2;
                        }
                        velocityTracker2.computeCurrentVelocity(1000);
                        if (!this.f && this.y <= 0.0f) {
                            this.e = false;
                        } else {
                            b(this.a.getXVelocity(), this.a.getYVelocity());
                        }
                        this.f = false;
                        VelocityTracker velocityTracker3 = this.a;
                        if (velocityTracker3 != null) {
                            velocityTracker3.recycle();
                            this.a = null;
                        }
                        this.d = -1;
                    }
                } else if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f && !this.e && motionEvent.getPointerCount() == 1)) {
                    this.F = true;
                    this.b = (int) motionEvent.getX();
                    this.c = (int) motionEvent.getY();
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    a();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    float x = motionEvent.getX() - this.b;
                    float y3 = motionEvent.getY() - this.c;
                    VelocityTracker velocityTracker4 = this.a;
                    if (velocityTracker4 == null) {
                        velocityTracker4 = VelocityTracker.obtain();
                        this.a = velocityTracker4;
                    }
                    velocityTracker4.addMovement(motionEvent);
                    if (!my0Var.E0 && this.e && !this.f && x > 0.0f && x / 3.0f > Math.abs(y3) && Math.abs(x) >= i) {
                        this.b = (int) motionEvent.getX();
                        this.e = false;
                        this.f = true;
                    } else if (this.f) {
                        float f2 = this.E + x;
                        this.E = f2;
                        my0Var.b.setTranslationX(Math.max(f2, 0.0f));
                        this.b = (int) motionEvent.getX();
                        dy0Var.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    VelocityTracker velocityTracker5 = this.a;
                    if (velocityTracker5 == null) {
                        velocityTracker5 = VelocityTracker.obtain();
                        this.a = velocityTracker5;
                    }
                    float xVelocity = velocityTracker5.getXVelocity();
                    float yVelocity = this.a.getYVelocity();
                    if (this.E < my0Var.b.getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                        float max2 = Math.max(this.E, 0.0f);
                        this.E = max2;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 0.0f);
                        ofFloat.addUpdateListener(new iy0(this, (byte) 2));
                        ofFloat.addListener(new jy0(this, (byte) 1));
                        ofFloat.setInterpolator(d53.f);
                        ofFloat.setDuration(220L);
                        ofFloat.start();
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E, getMeasuredWidth());
                        ofFloat2.addUpdateListener(new iy0(this, (byte) 3));
                        ofFloat2.addListener(new jy0(this, (byte) 2));
                        d53 d53Var = d53.h;
                        ofFloat2.setInterpolator(d53Var);
                        ofFloat2.setDuration(320L);
                        ofFloat2.start();
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat3.addUpdateListener(new iy0(this, (byte) 4));
                        ofFloat3.setInterpolator(d53Var);
                        ofFloat3.setDuration(320L);
                        ofFloat3.start();
                    }
                    this.e = false;
                    this.f = false;
                    this.d = -1;
                    this.F = false;
                }
                if ((z || !this.e) && !this.f && (my0Var.C() || my0Var.F(motionEvent))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ky0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (view instanceof CameraView) {
            if (this.H.A0()) {
                c(canvas, 1.0f);
            }
            return super.drawChild(canvas, view, j);
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public int getNestedScrollAxes() {
        return this.n.b();
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z;
        int i;
        int i2;
        int i3;
        Paint paint = this.s;
        int alpha = paint.getAlpha();
        my0 my0Var = this.H;
        int i4 = 0;
        if (alpha < 255 && my0Var.n) {
            float f = 0.0f;
            if (my0Var.w || (Build.VERSION.SDK_INT >= 29 && my0Var.M() > 0)) {
                f = Math.max(0.0f, my0Var.O() - (my0Var.b.getMeasuredHeight() - my0Var.b.getTranslationY()));
            }
            if (my0Var.n) {
                i3 = my0Var.O();
            } else {
                i3 = 0;
            }
            canvas.save();
            canvas.clipRect(my0Var.b.getLeft() + my0Var.u0, ((getMeasuredHeight() - i3) + f) - my0Var.F0, my0Var.b.getRight() - my0Var.u0, getMeasuredHeight() + f, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z = true;
        } else {
            canvas2 = canvas;
            z = false;
        }
        super.onDraw(canvas2);
        if (my0Var.n && my0Var.h != null && my0Var.f != 0) {
            int i5 = my0Var.b0;
            if (i5 >= 0) {
                i = cmb.v0(i5, my0Var.J0);
            } else {
                i = 0;
            }
            paint.setColor(i);
            float left = my0Var.b.getLeft() + my0Var.u0;
            int measuredHeight = getMeasuredHeight() - my0Var.f;
            if (my0Var.n) {
                i2 = my0Var.O();
            } else {
                i2 = 0;
            }
            float f2 = measuredHeight - i2;
            float right = my0Var.b.getRight() - my0Var.u0;
            int measuredHeight2 = getMeasuredHeight();
            if (my0Var.n) {
                i4 = my0Var.O();
            }
            canvas2.drawRect(left, f2, right, measuredHeight2 - i4, paint);
        }
        my0Var.a0();
        if (z) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        my0 my0Var = this.H;
        if (!my0Var.C() && !my0Var.F(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return d(motionEvent, true);
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ky0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ky0.onMeasure(int, int):void");
    }

    @Override
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        my0 my0Var = this.H;
        if (!my0Var.J && my0Var.r0) {
            a();
            float translationY = my0Var.b.getTranslationY();
            float f = 0.0f;
            if (translationY > 0.0f && i2 > 0) {
                float f2 = translationY - i2;
                iArr[1] = i2;
                if (f2 >= 0.0f) {
                    f = f2;
                }
                my0Var.b.setTranslationY(f);
                my0Var.e0();
                my0Var.c.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        my0 my0Var = this.H;
        if (!my0Var.J && my0Var.r0) {
            a();
            if (i4 != 0) {
                float translationY = my0Var.b.getTranslationY() - i4;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                my0Var.b.setTranslationY(translationY);
                my0Var.e0();
                my0Var.c.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.n.b = i;
        my0 my0Var = this.H;
        if (!my0Var.J && my0Var.r0) {
            a();
        }
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        my0 my0Var = this.H;
        if (!my0Var.J && my0Var.r0 && i == 2 && !my0Var.C()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.n.b = 0;
        my0 my0Var = this.H;
        if (!my0Var.J && my0Var.r0) {
            b(0.0f, 0.0f);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent, false);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.e && !this.f) {
            d(null, false);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override
    public final void updateColors() {
        my0 my0Var = this.H;
        try {
            int i = my0.k1;
            my0Var.C0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        my0Var.p0();
    }
}
