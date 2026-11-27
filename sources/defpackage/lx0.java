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
public abstract class lx0 extends FrameLayout implements snb {
    public float E;
    public boolean F;
    public final Paint G;
    public final nx0 H;
    public VelocityTracker a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public AnimatorSet h;
    public final m09 n;
    public final Rect r;
    public final Paint s;
    public boolean w;
    public int x;
    public float y;

    public lx0(nx0 nx0Var, Context context) {
        super(context);
        this.H = nx0Var;
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
        this.n = new m09((byte) 3);
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
        this.H.A(hashSet);
    }

    public final void b(float f, float f2) {
        nx0 nx0Var = this.H;
        float translationY = nx0Var.b.getTranslationY();
        if ((translationY < hl.Z0(false, 0.8f) && (f2 < 3500.0f || Math.abs(f2) < Math.abs(f))) || (f2 < 0.0f && Math.abs(f2) >= 3500.0f)) {
            this.e = false;
            this.h = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new jx0(this, (byte) 4));
            this.h.playTogether(ObjectAnimator.ofFloat(nx0Var.b, "translationY", 0.0f), ofFloat);
            this.h.setDuration((int) ((Math.max(0.0f, translationY) / hl.Z0(false, 0.8f)) * 250.0f));
            this.h.setInterpolator(k43.f);
            this.h.addListener(new kx0(this, (byte) 0));
            jn7.e().k(jn7.j1, 512);
            this.h.start();
            return;
        }
        boolean z = nx0Var.e0;
        nx0Var.e0 = false;
        nx0Var.dismiss();
        nx0Var.e0 = z;
    }

    public final void c(Canvas canvas, float f) {
        int i;
        float max;
        int left;
        int i2 = Build.VERSION.SDK_INT;
        Paint paint = this.s;
        nx0 nx0Var = this.H;
        if (i2 >= 26) {
            int i3 = nx0Var.G0;
            if (i3 >= 0) {
                paint.setColor(aob.v0(i3, nx0Var.J0));
            } else {
                paint.setColor(nx0Var.H0);
            }
        } else {
            paint.setColor(-16777216);
        }
        if (!nx0Var.V0 || nx0Var.b.getVisibility() == 0) {
            boolean z = nx0Var.n;
            float f2 = 0.0f;
            if ((z && nx0Var.S != 0) || nx0Var.F0 != 0.0f) {
                if (z) {
                    i = nx0Var.O();
                } else {
                    i = 0;
                }
                if (!nx0Var.w && (i2 < 29 || nx0Var.M() <= 0)) {
                    max = 0.0f;
                } else if (nx0Var.s) {
                    max = Math.max(0.0f, Math.min(i - nx0Var.F0, nx0Var.b.getTranslationY()));
                } else {
                    max = Math.max(0.0f, nx0Var.O() - (nx0Var.b.getMeasuredHeight() - nx0Var.b.getTranslationY()));
                }
                int alpha = paint.getAlpha();
                if (nx0Var.V0) {
                    f *= nx0Var.b.getAlpha();
                }
                boolean z2 = nx0Var.V0;
                ViewGroup viewGroup = nx0Var.b;
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
                canvas.drawRect(nx0Var.u0 + i4, ((getMeasuredHeight() - i) + max) - nx0Var.F0, nx0Var.b.getRight() - nx0Var.u0, getMeasuredHeight() + max, paint);
                paint.setAlpha(alpha);
                int i6 = nx0Var.g1;
                if (i6 != 0) {
                    paint.setColor(i6);
                    int alpha2 = paint.getAlpha();
                    float Q0 = hl.Q0(i);
                    if (i5 < 0) {
                        paint.setAlpha((int) (alpha2 * f * Q0));
                    } else {
                        f2 = max;
                    }
                    if (paint.getAlpha() > 0) {
                        canvas.drawRect(i4 + nx0Var.u0, ((getMeasuredHeight() - i) + f2) - nx0Var.F0, nx0Var.b.getRight() - nx0Var.u0, getMeasuredHeight() + f2, paint);
                    }
                    paint.setAlpha(alpha2);
                }
            }
        }
    }

    public final boolean d(MotionEvent motionEvent, boolean z) {
        nx0 nx0Var = this.H;
        ex0 ex0Var = nx0Var.c;
        int i = nx0Var.j0;
        if (!nx0Var.J) {
            if (!nx0Var.c0(motionEvent)) {
                if (!nx0Var.F(motionEvent) && !this.F) {
                    if (nx0Var.E() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f && !this.e && motionEvent.getPointerCount() == 1)) {
                        this.b = (int) motionEvent.getX();
                        int y = (int) motionEvent.getY();
                        this.c = y;
                        if (nx0Var.U(this.b, y)) {
                            nx0Var.l0();
                            return true;
                        }
                        this.d = motionEvent.getPointerId(0);
                        this.e = true;
                        a();
                        VelocityTracker velocityTracker = this.a;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    } else if (nx0Var.D() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        if (this.a == null) {
                            this.a = VelocityTracker.obtain();
                        }
                        float abs = Math.abs((int) (motionEvent.getX() - this.b));
                        float y2 = ((int) motionEvent.getY()) - this.c;
                        this.a.addMovement(motionEvent);
                        if (!nx0Var.E0 && this.e && !this.f && y2 > 0.0f && y2 / 3.0f > Math.abs(abs) && Math.abs(y2) >= i) {
                            this.c = (int) motionEvent.getY();
                            this.e = false;
                            this.f = true;
                            requestDisallowInterceptTouchEvent(true);
                        } else if (this.f) {
                            float f = this.y + y2;
                            this.y = f;
                            float max = Math.max(f, 0.0f);
                            this.y = max;
                            nx0Var.b.setTranslationY(Math.max(max, 0.0f));
                            nx0Var.e0();
                            this.c = (int) motionEvent.getY();
                            ex0Var.invalidate();
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
                    if (!nx0Var.E0 && this.e && !this.f && x > 0.0f && x / 3.0f > Math.abs(y3) && Math.abs(x) >= i) {
                        this.b = (int) motionEvent.getX();
                        this.e = false;
                        this.f = true;
                    } else if (this.f) {
                        float f2 = this.E + x;
                        this.E = f2;
                        nx0Var.b.setTranslationX(Math.max(f2, 0.0f));
                        this.b = (int) motionEvent.getX();
                        ex0Var.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    VelocityTracker velocityTracker5 = this.a;
                    if (velocityTracker5 == null) {
                        velocityTracker5 = VelocityTracker.obtain();
                        this.a = velocityTracker5;
                    }
                    float xVelocity = velocityTracker5.getXVelocity();
                    float yVelocity = this.a.getYVelocity();
                    if (this.E < nx0Var.b.getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                        float max2 = Math.max(this.E, 0.0f);
                        this.E = max2;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 0.0f);
                        ofFloat.addUpdateListener(new jx0(this, (byte) 1));
                        ofFloat.addListener(new kx0(this, (byte) 1));
                        ofFloat.setInterpolator(k43.f);
                        ofFloat.setDuration(220L);
                        ofFloat.start();
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E, getMeasuredWidth());
                        ofFloat2.addUpdateListener(new jx0(this, (byte) 2));
                        ofFloat2.addListener(new kx0(this, (byte) 2));
                        k43 k43Var = k43.h;
                        ofFloat2.setInterpolator(k43Var);
                        ofFloat2.setDuration(320L);
                        ofFloat2.start();
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat3.addUpdateListener(new jx0(this, (byte) 3));
                        ofFloat3.setInterpolator(k43Var);
                        ofFloat3.setDuration(320L);
                        ofFloat3.start();
                    }
                    this.e = false;
                    this.f = false;
                    this.d = -1;
                    this.F = false;
                }
                if ((z || !this.e) && !this.f && (nx0Var.D() || nx0Var.F(motionEvent))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (view instanceof CameraView) {
            if (this.H.B0()) {
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
        nx0 nx0Var = this.H;
        int i4 = 0;
        if (alpha < 255 && nx0Var.n) {
            float f = 0.0f;
            if (nx0Var.w || (Build.VERSION.SDK_INT >= 29 && nx0Var.M() > 0)) {
                f = Math.max(0.0f, nx0Var.O() - (nx0Var.b.getMeasuredHeight() - nx0Var.b.getTranslationY()));
            }
            if (nx0Var.n) {
                i3 = nx0Var.O();
            } else {
                i3 = 0;
            }
            canvas.save();
            canvas.clipRect(nx0Var.b.getLeft() + nx0Var.u0, ((getMeasuredHeight() - i3) + f) - nx0Var.F0, nx0Var.b.getRight() - nx0Var.u0, getMeasuredHeight() + f, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z = true;
        } else {
            canvas2 = canvas;
            z = false;
        }
        super.onDraw(canvas2);
        if (nx0Var.n && nx0Var.h != null && nx0Var.f != 0) {
            int i5 = nx0Var.b0;
            if (i5 >= 0) {
                i = aob.v0(i5, nx0Var.J0);
            } else {
                i = 0;
            }
            paint.setColor(i);
            float left = nx0Var.b.getLeft() + nx0Var.u0;
            int measuredHeight = getMeasuredHeight() - nx0Var.f;
            if (nx0Var.n) {
                i2 = nx0Var.O();
            } else {
                i2 = 0;
            }
            float f2 = measuredHeight - i2;
            float right = nx0Var.b.getRight() - nx0Var.u0;
            int measuredHeight2 = getMeasuredHeight();
            if (nx0Var.n) {
                i4 = nx0Var.O();
            }
            canvas2.drawRect(left, f2, right, measuredHeight2 - i4, paint);
        }
        nx0Var.a0();
        if (z) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        nx0 nx0Var = this.H;
        if (!nx0Var.D() && !nx0Var.F(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return d(motionEvent, true);
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx0.onMeasure(int, int):void");
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
        nx0 nx0Var = this.H;
        if (!nx0Var.J && nx0Var.r0) {
            a();
            float translationY = nx0Var.b.getTranslationY();
            float f = 0.0f;
            if (translationY > 0.0f && i2 > 0) {
                float f2 = translationY - i2;
                iArr[1] = i2;
                if (f2 >= 0.0f) {
                    f = f2;
                }
                nx0Var.b.setTranslationY(f);
                nx0Var.e0();
                nx0Var.c.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        nx0 nx0Var = this.H;
        if (!nx0Var.J && nx0Var.r0) {
            a();
            if (i4 != 0) {
                float translationY = nx0Var.b.getTranslationY() - i4;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                nx0Var.b.setTranslationY(translationY);
                nx0Var.e0();
                nx0Var.c.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.n.b = i;
        nx0 nx0Var = this.H;
        if (!nx0Var.J && nx0Var.r0) {
            a();
        }
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        nx0 nx0Var = this.H;
        if (!nx0Var.J && nx0Var.r0 && i == 2 && !nx0Var.D()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.n.b = 0;
        nx0 nx0Var = this.H;
        if (!nx0Var.J && nx0Var.r0) {
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
        nx0 nx0Var = this.H;
        try {
            int i = nx0.k1;
            nx0Var.D0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        nx0Var.p0();
    }
}
