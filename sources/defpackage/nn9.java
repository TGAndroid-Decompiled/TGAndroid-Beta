package defpackage;

import android.animation.ValueAnimator;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.os.SystemClock;
import android.view.Display;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
public final class nn9 extends FrameLayout {
    public float E;
    public int F;
    public boolean G;
    public boolean H;
    public int I;
    public float J;
    public final Paint K;
    public boolean L;
    public float M;
    public float N;
    public boolean O;
    public final on9 P;
    public final Paint a;
    public final Paint b;
    public BlurMaskFilter c;
    public final RectF d;
    public final Rect e;
    public final Point f;
    public final int h;
    public VelocityTracker n;
    public final OverScroller r;
    public final mn9 s;
    public final int w;
    public final int x;
    public float y;

    public nn9(on9 on9Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.P = on9Var;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.d = new RectF();
        this.e = new Rect();
        this.f = new Point();
        this.s = new mn9(this, (byte) 1);
        this.K = new Paint(1);
        setWillNotDraw(false);
        paint.setColor(-14933463);
        this.h = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
        this.r = new OverScroller(launchActivity);
        this.w = ViewConfiguration.get(launchActivity).getScaledMinimumFlingVelocity();
        this.x = ViewConfiguration.get(launchActivity).getScaledMaximumFlingVelocity();
    }

    public final void a(float f, long j, vm9 vm9Var) {
        float max = Math.max(-f(), f);
        b();
        on9 on9Var = this.P;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(on9Var.i0 + on9Var.j0, max);
        on9Var.k0 = ofFloat;
        ofFloat.setDuration(j);
        on9Var.k0.setInterpolator(s33.h);
        on9Var.k0.addUpdateListener(new x89(this, (byte) 6));
        on9Var.k0.addListener(new qw(this, vm9Var, (byte) 10));
        on9Var.k0.start();
    }

    public final void b() {
        on9 on9Var = this.P;
        yla ylaVar = on9Var.l0;
        if (ylaVar != null) {
            on9Var.l0 = null;
            ylaVar.d();
        }
        OverScroller overScroller = this.r;
        if (!overScroller.isFinished()) {
            overScroller.abortAnimation();
            removeCallbacks(this.s);
        }
        ValueAnimator valueAnimator = on9Var.k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            on9Var.k0 = null;
        }
    }

    public final int c(MotionEvent motionEvent) {
        on9 on9Var = this.P;
        if (on9Var.T && motionEvent.getPointerCount() >= 2) {
            return 3;
        }
        float rawY = motionEvent.getRawY() - this.E;
        if (Math.abs(rawY) > this.h && Math.abs(rawY) > Math.abs(motionEvent.getX() - this.y)) {
            if (on9Var.T) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public final void d(Canvas canvas) {
        on9 on9Var = this.P;
        float f = on9Var.U;
        if (f < 1.0f) {
            float g = g();
            float min = Math.min(1.0f, g / Math.max(1, on9Var.R.b)) * on9Var.g0;
            RectF rectF = this.d;
            rectF.set(0.0f, g, getWidth(), getHeight() + on9Var.g0);
            canvas.drawRoundRect(rectF, min, min, this.a);
            if ((on9Var.z0 != 0 || on9Var.A0 != 0) && Build.VERSION.SDK_INT >= 28) {
                float f2 = on9Var.j0 * 0.5f;
                Rect rect = this.e;
                rectF.set(rect.left, rect.top + f2, rect.right, rect.bottom + f2);
                BlurMaskFilter blurMaskFilter = this.c;
                Paint paint = this.b;
                if (blurMaskFilter == null) {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(gl.L(36.0f), BlurMaskFilter.Blur.NORMAL);
                    this.c = blurMaskFilter2;
                    paint.setMaskFilter(blurMaskFilter2);
                }
                paint.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF.bottom, on9Var.z0 | (-16777216), on9Var.A0 | (-16777216), Shader.TileMode.CLAMP));
                paint.setAlpha((int) ((1.0f - f) * (Color.alpha(on9Var.z0) / 255.0f) * 176.0f));
                canvas.drawRoundRect(rectF, gl.L(12.0f), gl.L(12.0f), paint);
            }
        }
        if (f > 0.0f) {
            canvas.drawColor(bm2.o(-16777216, (int) (f * 255.0f)));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ln9 ln9Var;
        on9 on9Var = this.P;
        nn9 nn9Var = on9Var.f;
        if (Build.VERSION.SDK_INT >= 31 && (ln9Var = on9Var.s) != null && nn9Var != null) {
            ln9Var.a(nn9Var.getWidth(), nn9Var.getHeight());
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        float f;
        boolean z = false;
        this.F = 0;
        on9 on9Var = this.P;
        TextureView textureView = on9Var.n;
        int height = textureView.getHeight();
        if (on9Var.g() && height > 0 && on9Var.c0 > on9Var.b0) {
            float scaleX = textureView.getScaleX();
            float f2 = height;
            float f3 = f2 * scaleX;
            if (Math.abs(f3 - on9Var.c0) < Math.abs(f3 - on9Var.b0)) {
                z = true;
            }
            if (z) {
                f = on9Var.c0;
            } else {
                f = on9Var.b0;
            }
            float f4 = f / f2;
            float width = textureView.getWidth() / 2.0f;
            float f5 = f2 / 2.0f;
            float f6 = 1.0f - scaleX;
            textureView.setTranslationX(((textureView.getPivotX() - width) * f6) + textureView.getTranslationX());
            textureView.setTranslationY(((textureView.getPivotY() - f5) * f6) + textureView.getTranslationY());
            textureView.setPivotX(width);
            textureView.setPivotY(f5);
            ValueAnimator valueAnimator = on9Var.Y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                on9Var.Y = null;
            }
            on9Var.W = z;
            textureView.animate().scaleX(f4).scaleY(f4).translationX(0.0f).translationY(0.0f).setDuration(220L).setInterpolator(s33.f).withEndAction(new k08((byte) 8, this, z)).start();
            on9Var.j();
            return;
        }
        textureView.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(220L).setInterpolator(s33.f).start();
        on9Var.j();
    }

    public final float f() {
        return Math.max(1, this.P.e0);
    }

    public final int g() {
        on9 on9Var = this.P;
        return Math.max(0, Math.round(Math.min(0.0f, on9Var.i0) + on9Var.e0));
    }

    public final boolean h(float f) {
        if (!this.P.T && f < g()) {
            return true;
        }
        return false;
    }

    public final void i() {
        float f;
        this.F = 0;
        on9 on9Var = this.P;
        float f2 = 0.0f;
        on9Var.j0 = 0.0f;
        on9Var.F.setTranslationY(0.0f);
        FrameLayout frameLayout = on9Var.h;
        frameLayout.animate().cancel();
        frameLayout.setTranslationY(0.0f);
        TextureView textureView = on9Var.n;
        textureView.animate().cancel();
        textureView.setScaleX(1.0f);
        textureView.setScaleY(1.0f);
        textureView.setTranslationX(0.0f);
        textureView.setTranslationY(0.0f);
        this.L = false;
        if (on9Var.Y == null) {
            float f3 = on9Var.X;
            boolean z = on9Var.W;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (f3 != f) {
                if (z) {
                    f2 = 1.0f;
                }
                on9Var.X = f2;
                requestLayout();
            }
        }
    }

    public final void j(float f) {
        float max = Math.max(-f(), f);
        on9 on9Var = this.P;
        float f2 = on9Var.i0;
        if (f2 != max) {
            float max2 = Math.max(0.0f, Math.min(1.0f, (-f2) / f()));
            on9Var.i0 = max;
            setTranslationY(Math.max(0.0f, max));
            on9Var.u();
            if (max2 != Math.max(0.0f, Math.min(1.0f, (-on9Var.i0) / f()))) {
                requestLayout();
                invalidate();
                on9Var.t();
            }
        }
    }

    public final void k(float f) {
        float f2 = -f();
        float min = Math.min(0.0f, f - f2);
        j(Math.max(f2, f));
        on9 on9Var = this.P;
        if (on9Var.j0 != min) {
            on9Var.j0 = min;
            if (!on9Var.T) {
                float f3 = min * 0.5f;
                on9Var.F.setTranslationY(f3);
                on9Var.h.setTranslationY(f3);
                invalidate();
            }
        }
    }

    public final void l(float f, float f2, float f3) {
        b();
        on9 on9Var = this.P;
        yla ylaVar = new yla(new ti4(on9Var.i0 + on9Var.j0));
        ylaVar.m = oo1.j(f, f3, 1.0f);
        ylaVar.a = f2;
        ylaVar.f(1.0f);
        ylaVar.b(new h10(this, (byte) 14));
        ylaVar.a(new o12(this, f, (byte) 1));
        on9Var.l0 = ylaVar;
        ylaVar.h();
    }

    public final void m(int i, MotionEvent motionEvent) {
        on9 on9Var = this.P;
        FrameLayout frameLayout = on9Var.h;
        TextureView textureView = on9Var.n;
        this.F = i;
        if (i == 1) {
            b();
            this.E = motionEvent.getRawY() - (on9Var.i0 + on9Var.j0);
            VelocityTracker velocityTracker = this.n;
            if (velocityTracker == null) {
                velocityTracker = VelocityTracker.obtain();
                this.n = velocityTracker;
            }
            velocityTracker.clear();
        } else if (i == 2) {
            this.E = motionEvent.getRawY();
        } else if (i == 3) {
            this.J = Math.max(1.0f, (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0)));
            this.M = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.N = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
            textureView.animate().cancel();
            textureView.setPivotX((this.M - frameLayout.getLeft()) - textureView.getLeft());
            textureView.setPivotY((this.N - frameLayout.getTop()) - textureView.getTop());
            frameLayout.setTranslationY(0.0f);
            gl.r(on9Var.q0);
        }
    }

    @Override
    public final void onDescendantInvalidated(View view, View view2) {
        ln9 ln9Var;
        super.onDescendantInvalidated(view, view2);
        on9 on9Var = this.P;
        if (view2 == on9Var.n) {
            if (on9Var.F0 >= 0) {
                float min = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - on9Var.F0)) / 600.0f);
                float cos = ((float) (Math.cos((min + 1.0f) * 3.141592653589793d) / 2.0d)) + 0.5f;
                on9Var.z0 = bm2.f(cos, on9Var.B0, on9Var.D0);
                on9Var.A0 = bm2.f(cos, on9Var.C0, on9Var.E0);
                if (min >= 1.0f) {
                    on9Var.F0 = -1L;
                }
                invalidate();
            }
            nn9 nn9Var = on9Var.f;
            if (Build.VERSION.SDK_INT >= 31 && (ln9Var = on9Var.s) != null && nn9Var != null) {
                ln9Var.a(nn9Var.getWidth(), nn9Var.getHeight());
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        d(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int c;
        on9 on9Var = this.P;
        if (!on9Var.J0 && !on9Var.K.I && on9Var.V == null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if ((actionMasked == 2 || actionMasked == 5) && this.F == 0 && (c = c(motionEvent)) != 0) {
                    m(c, motionEvent);
                    return true;
                }
            } else {
                this.y = motionEvent.getX();
                this.E = motionEvent.getRawY();
                this.F = 0;
                this.G = h(motionEvent.getY());
                if (!this.r.isFinished()) {
                    b();
                    m(1, motionEvent);
                    return true;
                } else if (this.G) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        on9 on9Var = this.P;
        LinearLayout linearLayout = on9Var.G;
        pha phaVar = on9Var.F;
        TextureView textureView = on9Var.n;
        UndoView undoView = on9Var.J;
        io5 io5Var = on9Var.R;
        FrameLayout frameLayout = on9Var.h;
        Rect rect = this.e;
        frameLayout.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.L) {
            this.L = false;
            textureView.setScaleX(1.0f);
            textureView.setScaleY(1.0f);
        }
        View view = on9Var.y;
        view.layout(0, 0, i5, view.getMeasuredHeight());
        View view2 = on9Var.E;
        view2.layout(0, i6 - view2.getMeasuredHeight(), i5, i6);
        int i7 = io5Var.a;
        phaVar.layout(i7, this.I, phaVar.getMeasuredWidth() + i7, phaVar.getMeasuredHeight() + this.I);
        int L = (i6 - io5Var.d) - gl.L(8.0f);
        int measuredHeight = L - linearLayout.getMeasuredHeight();
        linearLayout.layout(i7, measuredHeight, linearLayout.getMeasuredWidth() + i7, L);
        int L2 = measuredHeight - gl.L(8.0f);
        undoView.layout(gl.L(8.0f) + i7, L2 - undoView.getMeasuredHeight(), undoView.getMeasuredWidth() + gl.L(8.0f) + i7, L2);
        on9Var.K.layout(0, 0, i5, i6);
        frameLayout.invalidateOutline();
        if (this.O) {
            this.O = false;
            if (on9Var.T) {
                setAlpha(0.0f);
                animate().alpha(1.0f).setDuration(180L).withEndAction(new vm9(on9Var, (byte) 8)).start();
                return;
            }
            j(getHeight() - on9Var.e0);
            a(0.0f, 350L, null);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        int L;
        int min;
        int max;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        on9 on9Var = this.P;
        FrameLayout frameLayout = on9Var.h;
        zha zhaVar = on9Var.K;
        pha phaVar = on9Var.F;
        Display defaultDisplay = on9Var.a.getWindowManager().getDefaultDisplay();
        Point point = this.f;
        defaultDisplay.getRealSize(point);
        if (point.x > point.y) {
            z = true;
        } else {
            z = false;
        }
        if (on9Var.S != z || !this.H) {
            boolean z2 = this.H;
            on9Var.S = z;
            this.H = true;
            b();
            i();
            on9Var.i0 = 0.0f;
            setTranslationY(0.0f);
            setAlpha(1.0f);
            zhaVar.a(false);
            if (z2 && !gl.O1() && on9Var.S == on9Var.h() && !on9Var.T) {
                on9Var.m(true, false);
            }
            if (!on9Var.g()) {
                on9Var.a0 = false;
                gl.r(on9Var.Z);
                on9Var.l(false, false);
            }
            on9Var.k(true, false);
            on9Var.r();
            on9Var.t();
            invalidate();
        }
        io5 io5Var = on9Var.R;
        int i3 = io5Var.a;
        int i4 = io5Var.d;
        int i5 = io5Var.b;
        int i6 = (size - i3) - io5Var.c;
        float f = on9Var.U;
        phaVar.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), 0);
        on9Var.G.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(92.0f), 1073741824));
        on9Var.J.measure(ug8.f(16.0f, i6, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        zhaVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        on9Var.y.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(64.0f) + phaVar.getMeasuredHeight() + i5, 1073741824));
        on9Var.E.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(164.0f) + i4, 1073741824));
        View backButton = phaVar.getBackButton();
        if (backButton != null && backButton.getHeight() > 0) {
            int left = backButton.getLeft();
            int height = backButton.getHeight() / 2;
            int top = left - backButton.getTop();
            on9Var.h0 = phaVar.getMeasuredHeight() - backButton.getBottom();
            if (on9Var.f0 != top || on9Var.g0 != height + left) {
                on9Var.f0 = top;
                on9Var.g0 = height + left;
                invalidate();
            }
        } else if (on9Var.g0 == 0) {
            on9Var.g0 = gl.L(29.0f);
            post(new mn9(this, (byte) 0));
        }
        float L2 = i6 - (gl.L(7.0f) << 1);
        float f2 = on9Var.t0;
        float f3 = 1.7777778f;
        if (f2 <= 0.0f) {
            f2 = 1.7777778f;
        }
        on9Var.e0 = Math.max(i5, size2 - ((gl.L(8.0f) + (gl.L(92.0f) + (gl.L(16.0f) + (((gl.L(7.0f) + (phaVar.getMeasuredHeight() + on9Var.f0)) - on9Var.h0) + Math.min(Math.round(L2 / f2), (int) (size2 * 0.45f)))))) + i4));
        on9Var.d0 = Math.max(g() + on9Var.f0, i5);
        this.I = Math.round(gl.U1(f, max, i5));
        int L3 = gl.L(7.0f) + io5Var.a;
        int L4 = (gl.L(7.0f) + (phaVar.getMeasuredHeight() + on9Var.d0)) - on9Var.h0;
        int round = Math.round(gl.U1(f, L3, 0));
        int round2 = Math.round(gl.U1(f, L4, 0));
        int round3 = Math.round(gl.U1(f, L3 + L, size));
        int round4 = Math.round(gl.U1(f, L4 + min, size2));
        Rect rect = this.e;
        rect.set(round, round2, round3, round4);
        float f4 = on9Var.t0;
        if (f4 > 0.0f) {
            f3 = f4;
        }
        float min2 = Math.min(rect.width() / f3, rect.height());
        float max2 = Math.max(rect.width() / f3, rect.height());
        on9Var.b0 = min2;
        on9Var.c0 = max2;
        float R1 = gl.R1(min2, max2, on9Var.X);
        int round5 = Math.round(R1);
        int round6 = Math.round(R1 * f3);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) on9Var.n.getLayoutParams();
        if (layoutParams.width != round6 || layoutParams.height != round5) {
            layoutParams.width = round6;
            layoutParams.height = round5;
            frameLayout.forceLayout();
        }
        frameLayout.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(rect.height(), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float f;
        int i;
        float f2;
        int c;
        on9 on9Var = this.P;
        FrameLayout frameLayout = on9Var.h;
        TextureView textureView = on9Var.n;
        if (!on9Var.J0) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked == 6 && this.F == 3) {
                                    e();
                                    return true;
                                }
                            }
                        }
                    }
                    if (this.F == 0 && !this.G && (c = c(motionEvent)) != 0) {
                        m(c, motionEvent);
                    }
                    int i2 = this.F;
                    if (i2 == 1) {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
                        this.n.addMovement(obtain);
                        obtain.recycle();
                        k(motionEvent.getRawY() - this.E);
                        return true;
                    } else if (i2 == 2) {
                        frameLayout.setTranslationY(motionEvent.getRawY() - this.E);
                        return true;
                    } else if (i2 == 3 && motionEvent.getPointerCount() >= 2) {
                        if (on9Var.g() && textureView.getHeight() > 0) {
                            f2 = on9Var.b0 / textureView.getHeight();
                        } else {
                            f2 = 1.0f;
                        }
                        float max = Math.max(0.5f * f2, Math.min(f2 * 4.0f, ((float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0))) / this.J));
                        textureView.setScaleX(max);
                        textureView.setScaleY(max);
                        textureView.setTranslationX(((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f) - this.M);
                        textureView.setTranslationY(((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f) - this.N);
                    }
                }
                if (motionEvent.getActionMasked() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                int i3 = this.F;
                if (i3 == 1) {
                    this.n.computeCurrentVelocity(1000);
                    float yVelocity = this.n.getYVelocity();
                    int height = getHeight() - on9Var.e0;
                    if (on9Var.i0 < 0.0f) {
                        float f3 = f();
                        if (z && Math.abs(yVelocity) >= this.w) {
                            f = Math.max(-i, Math.min(this.x, yVelocity));
                        } else {
                            f = 0.0f;
                        }
                        if (on9Var.j0 < 0.0f) {
                            l(-f3, 0.0f, 380.0f);
                        } else {
                            b();
                            int round = Math.round(on9Var.i0);
                            int round2 = Math.round(f);
                            float f4 = -f3;
                            int round3 = Math.round(f4);
                            OverScroller overScroller = this.r;
                            overScroller.fling(0, round, 0, round2, 0, 0, round3, 0);
                            if (overScroller.getFinalY() > f4) {
                                if (on9Var.e0 + overScroller.getFinalY() < a.getCurrentActionBarHeight() + on9Var.R.b) {
                                    overScroller.abortAnimation();
                                    l(f4, f, 180.0f);
                                }
                            }
                            postOnAnimation(this.s);
                        }
                    } else if (z && (yVelocity > gl.L(700.0f) || (on9Var.i0 > height / 3.0f && yVelocity > (-gl.L(300.0f))))) {
                        on9Var.dismiss();
                    } else {
                        a(0.0f, 250L, null);
                    }
                } else if (i3 == 2) {
                    if (z && Math.abs(frameLayout.getTranslationY()) > gl.L(120.0f)) {
                        on9Var.m(false, true);
                        on9Var.a.setRequestedOrientation(-1);
                    } else {
                        frameLayout.animate().translationY(0.0f).setDuration(200L).setInterpolator(s33.f).start();
                    }
                } else if (i3 == 3) {
                    e();
                } else if (z && this.G && h(motionEvent.getY())) {
                    on9Var.dismiss();
                } else if (z && on9Var.T) {
                    on9Var.k(!on9Var.n0, true);
                }
                this.F = 0;
                return true;
            }
            this.y = motionEvent.getX();
            this.E = motionEvent.getRawY();
            this.F = 0;
            this.G = h(motionEvent.getY());
            return true;
        }
        return true;
    }

    @Override
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        on9 on9Var = this.P;
        if (on9Var.n != null) {
            on9Var.v();
        }
    }
}
