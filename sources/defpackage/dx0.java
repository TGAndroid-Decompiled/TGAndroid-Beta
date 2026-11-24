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
public abstract class dx0 extends FrameLayout implements tjb {
    public float E;
    public boolean F;
    public final Paint G;
    public final fx0 H;
    public VelocityTracker a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public AnimatorSet h;
    public final zw8 n;
    public final Rect r;
    public final Paint s;
    public boolean w;
    public int x;
    public float y;

    public dx0(fx0 fx0Var, Context context) {
        super(context);
        this.H = fx0Var;
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
        this.n = new zw8((byte) 3);
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
        fx0 fx0Var = this.H;
        float translationY = fx0Var.b.getTranslationY();
        if ((translationY < gl.Z0(false, 0.8f) && (f2 < 3500.0f || Math.abs(f2) < Math.abs(f))) || (f2 < 0.0f && Math.abs(f2) >= 3500.0f)) {
            this.e = false;
            this.h = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new bx0(this, (byte) 1));
            this.h.playTogether(ObjectAnimator.ofFloat(fx0Var.b, "translationY", 0.0f), ofFloat);
            this.h.setDuration((int) ((Math.max(0.0f, translationY) / gl.Z0(false, 0.8f)) * 250.0f));
            this.h.setInterpolator(s33.f);
            this.h.addListener(new cx0(this, (byte) 0));
            kk7.e().k(kk7.i1, 512);
            this.h.start();
            return;
        }
        boolean z = fx0Var.e0;
        fx0Var.e0 = false;
        fx0Var.dismiss();
        fx0Var.e0 = z;
    }

    public final void c(Canvas canvas, float f) {
        int i;
        float max;
        int left;
        int i2 = Build.VERSION.SDK_INT;
        Paint paint = this.s;
        fx0 fx0Var = this.H;
        if (i2 >= 26) {
            int i3 = fx0Var.G0;
            if (i3 >= 0) {
                paint.setColor(bkb.v0(i3, fx0Var.J0));
            } else {
                paint.setColor(fx0Var.H0);
            }
        } else {
            paint.setColor(-16777216);
        }
        if (!fx0Var.V0 || fx0Var.b.getVisibility() == 0) {
            boolean z = fx0Var.n;
            float f2 = 0.0f;
            if ((z && fx0Var.S != 0) || fx0Var.F0 != 0.0f) {
                if (z) {
                    i = fx0Var.P();
                } else {
                    i = 0;
                }
                if (!fx0Var.w && (i2 < 29 || fx0Var.O() <= 0)) {
                    max = 0.0f;
                } else if (fx0Var.s) {
                    max = Math.max(0.0f, Math.min(i - fx0Var.F0, fx0Var.b.getTranslationY()));
                } else {
                    max = Math.max(0.0f, fx0Var.P() - (fx0Var.b.getMeasuredHeight() - fx0Var.b.getTranslationY()));
                }
                int alpha = paint.getAlpha();
                if (fx0Var.V0) {
                    f *= fx0Var.b.getAlpha();
                }
                boolean z2 = fx0Var.V0;
                ViewGroup viewGroup = fx0Var.b;
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
                canvas.drawRect(fx0Var.u0 + i4, ((getMeasuredHeight() - i) + max) - fx0Var.F0, fx0Var.b.getRight() - fx0Var.u0, getMeasuredHeight() + max, paint);
                paint.setAlpha(alpha);
                int i6 = fx0Var.g1;
                if (i6 != 0) {
                    paint.setColor(i6);
                    int alpha2 = paint.getAlpha();
                    float Q0 = gl.Q0(i);
                    if (i5 < 0) {
                        paint.setAlpha((int) (alpha2 * f * Q0));
                    } else {
                        f2 = max;
                    }
                    if (paint.getAlpha() > 0) {
                        canvas.drawRect(i4 + fx0Var.u0, ((getMeasuredHeight() - i) + f2) - fx0Var.F0, fx0Var.b.getRight() - fx0Var.u0, getMeasuredHeight() + f2, paint);
                    }
                    paint.setAlpha(alpha2);
                }
            }
        }
    }

    public final boolean d(MotionEvent motionEvent, boolean z) {
        fx0 fx0Var = this.H;
        ww0 ww0Var = fx0Var.c;
        int i = fx0Var.j0;
        if (!fx0Var.J) {
            if (!fx0Var.c0(motionEvent)) {
                if (!fx0Var.G(motionEvent) && !this.F) {
                    if (fx0Var.F() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f && !this.e && motionEvent.getPointerCount() == 1)) {
                        this.b = (int) motionEvent.getX();
                        int y = (int) motionEvent.getY();
                        this.c = y;
                        if (fx0Var.U(this.b, y)) {
                            fx0Var.l0();
                            return true;
                        }
                        this.d = motionEvent.getPointerId(0);
                        this.e = true;
                        a();
                        VelocityTracker velocityTracker = this.a;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    } else if (fx0Var.E() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        if (this.a == null) {
                            this.a = VelocityTracker.obtain();
                        }
                        float abs = Math.abs((int) (motionEvent.getX() - this.b));
                        float y2 = ((int) motionEvent.getY()) - this.c;
                        this.a.addMovement(motionEvent);
                        if (!fx0Var.E0 && this.e && !this.f && y2 > 0.0f && y2 / 3.0f > Math.abs(abs) && Math.abs(y2) >= i) {
                            this.c = (int) motionEvent.getY();
                            this.e = false;
                            this.f = true;
                            requestDisallowInterceptTouchEvent(true);
                        } else if (this.f) {
                            float f = this.y + y2;
                            this.y = f;
                            float max = Math.max(f, 0.0f);
                            this.y = max;
                            fx0Var.b.setTranslationY(Math.max(max, 0.0f));
                            fx0Var.e0();
                            this.c = (int) motionEvent.getY();
                            ww0Var.invalidate();
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
                    if (!fx0Var.E0 && this.e && !this.f && x > 0.0f && x / 3.0f > Math.abs(y3) && Math.abs(x) >= i) {
                        this.b = (int) motionEvent.getX();
                        this.e = false;
                        this.f = true;
                    } else if (this.f) {
                        float f2 = this.E + x;
                        this.E = f2;
                        fx0Var.b.setTranslationX(Math.max(f2, 0.0f));
                        this.b = (int) motionEvent.getX();
                        ww0Var.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    VelocityTracker velocityTracker5 = this.a;
                    if (velocityTracker5 == null) {
                        velocityTracker5 = VelocityTracker.obtain();
                        this.a = velocityTracker5;
                    }
                    float xVelocity = velocityTracker5.getXVelocity();
                    float yVelocity = this.a.getYVelocity();
                    if (this.E < fx0Var.b.getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                        float max2 = Math.max(this.E, 0.0f);
                        this.E = max2;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 0.0f);
                        ofFloat.addUpdateListener(new bx0(this, (byte) 2));
                        ofFloat.addListener(new cx0(this, (byte) 1));
                        ofFloat.setInterpolator(s33.f);
                        ofFloat.setDuration(220L);
                        ofFloat.start();
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E, getMeasuredWidth());
                        ofFloat2.addUpdateListener(new bx0(this, (byte) 3));
                        ofFloat2.addListener(new cx0(this, (byte) 2));
                        s33 s33Var = s33.h;
                        ofFloat2.setInterpolator(s33Var);
                        ofFloat2.setDuration(320L);
                        ofFloat2.start();
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat3.addUpdateListener(new bx0(this, (byte) 4));
                        ofFloat3.setInterpolator(s33Var);
                        ofFloat3.setDuration(320L);
                        ofFloat3.start();
                    }
                    this.e = false;
                    this.f = false;
                    this.d = -1;
                    this.F = false;
                }
                if ((z || !this.e) && !this.f && (fx0Var.E() || fx0Var.G(motionEvent))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dx0.dispatchDraw(android.graphics.Canvas):void");
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
        fx0 fx0Var = this.H;
        int i4 = 0;
        if (alpha < 255 && fx0Var.n) {
            float f = 0.0f;
            if (fx0Var.w || (Build.VERSION.SDK_INT >= 29 && fx0Var.O() > 0)) {
                f = Math.max(0.0f, fx0Var.P() - (fx0Var.b.getMeasuredHeight() - fx0Var.b.getTranslationY()));
            }
            if (fx0Var.n) {
                i3 = fx0Var.P();
            } else {
                i3 = 0;
            }
            canvas.save();
            canvas.clipRect(fx0Var.b.getLeft() + fx0Var.u0, ((getMeasuredHeight() - i3) + f) - fx0Var.F0, fx0Var.b.getRight() - fx0Var.u0, getMeasuredHeight() + f, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z = true;
        } else {
            canvas2 = canvas;
            z = false;
        }
        super.onDraw(canvas2);
        if (fx0Var.n && fx0Var.h != null && fx0Var.f != 0) {
            int i5 = fx0Var.b0;
            if (i5 >= 0) {
                i = bkb.v0(i5, fx0Var.J0);
            } else {
                i = 0;
            }
            paint.setColor(i);
            float left = fx0Var.b.getLeft() + fx0Var.u0;
            int measuredHeight = getMeasuredHeight() - fx0Var.f;
            if (fx0Var.n) {
                i2 = fx0Var.P();
            } else {
                i2 = 0;
            }
            float f2 = measuredHeight - i2;
            float right = fx0Var.b.getRight() - fx0Var.u0;
            int measuredHeight2 = getMeasuredHeight();
            if (fx0Var.n) {
                i4 = fx0Var.P();
            }
            canvas2.drawRect(left, f2, right, measuredHeight2 - i4, paint);
        }
        fx0Var.a0();
        if (z) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        fx0 fx0Var = this.H;
        if (!fx0Var.E() && !fx0Var.G(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return d(motionEvent, true);
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dx0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dx0.onMeasure(int, int):void");
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
        fx0 fx0Var = this.H;
        if (!fx0Var.J && fx0Var.r0) {
            a();
            float translationY = fx0Var.b.getTranslationY();
            float f = 0.0f;
            if (translationY > 0.0f && i2 > 0) {
                float f2 = translationY - i2;
                iArr[1] = i2;
                if (f2 >= 0.0f) {
                    f = f2;
                }
                fx0Var.b.setTranslationY(f);
                fx0Var.e0();
                fx0Var.c.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        fx0 fx0Var = this.H;
        if (!fx0Var.J && fx0Var.r0) {
            a();
            if (i4 != 0) {
                float translationY = fx0Var.b.getTranslationY() - i4;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                fx0Var.b.setTranslationY(translationY);
                fx0Var.e0();
                fx0Var.c.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.n.b = i;
        fx0 fx0Var = this.H;
        if (!fx0Var.J && fx0Var.r0) {
            a();
        }
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        fx0 fx0Var = this.H;
        if (!fx0Var.J && fx0Var.r0 && i == 2 && !fx0Var.E()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.n.b = 0;
        fx0 fx0Var = this.H;
        if (!fx0Var.J && fx0Var.r0) {
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
        fx0 fx0Var = this.H;
        try {
            int i = fx0.k1;
            fx0Var.C0();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        fx0Var.p0();
    }
}
