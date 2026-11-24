package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.widget.FrameLayout;
public final class phc extends FrameLayout {
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public float V;
    public float W;
    public float a;
    public float a0;
    public float b;
    public float b0;
    public float c;
    public boolean c0;
    public float d;
    public boolean d0;
    public boolean e;
    public ValueAnimator e0;
    public int f;
    public final af0 f0;
    public ValueAnimator g0;
    public int h;
    public final oxb h0;
    public View.OnClickListener i0;
    public ohc j0;
    public long k0;
    public WindowInsets n;
    public final float r;
    public final Path s;
    public final RectF w;
    public final Paint x;
    public final Drawable y;

    public phc(Activity activity) {
        super(activity);
        this.s = new Path();
        this.w = new RectF();
        new Paint(1);
        Paint paint = new Paint(1);
        this.x = paint;
        this.E = -1.0f;
        this.F = -1.0f;
        this.K = 0.0f;
        this.L = 0.0f;
        this.R = -1.0f;
        this.S = true;
        this.f0 = new af0(this, (byte) 17);
        this.h0 = new oxb(this, (byte) 8);
        this.r = ViewConfiguration.get(activity).getScaledTouchSlop();
        setOutlineProvider(new cm0(this, (byte) 8));
        setClipToOutline(true);
        paint.setColor(on2.p(-16777216, 102));
        this.y = activity.getDrawable(2131230923);
    }

    public final void a() {
        f();
        float f = this.V;
        if (f >= 0.0f && !this.P) {
            e(f, this.W, getMeasuredWidth(), getMeasuredHeight(), true);
            this.V = -1.0f;
            this.W = -1.0f;
        }
    }

    public final void b() {
        WindowInsets windowInsets;
        float systemWindowInsetTop;
        WindowInsets windowInsets2;
        float systemWindowInsetBottom;
        if (getMeasuredWidth() > 0 && this.E < 0.0f) {
            ViewParent parent = getParent();
            if (parent == null) {
                return;
            }
            if (this.n == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.I;
            }
            if (this.n == null) {
                systemWindowInsetBottom = 0.0f;
            } else {
                systemWindowInsetBottom = windowInsets2.getSystemWindowInsetBottom() + this.J;
            }
            View view = (View) parent;
            this.V = (getTranslationX() - this.G) / (((view.getMeasuredWidth() - this.G) - this.H) - getMeasuredWidth());
            this.W = (getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop) - getMeasuredHeight());
            this.V = Math.max(0.0f, Math.min(1.0f, this.V));
            this.W = Math.max(0.0f, Math.min(1.0f, this.W));
            return;
        }
        this.V = -1.0f;
        this.W = -1.0f;
    }

    public final void c(boolean z, boolean z2) {
        phc phcVar;
        phc phcVar2;
        if (getMeasuredWidth() <= 0 || getVisibility() != 0) {
            z2 = false;
        }
        float f = 1.0f;
        if (!z2) {
            if (this.N != z) {
                this.N = z;
                this.O = z;
                if (!z) {
                    f = 0.0f;
                }
                this.K = f;
                requestLayout();
                invalidateOutline();
            }
        } else if (this.P) {
            this.O = z;
        } else {
            boolean z3 = this.N;
            if (z) {
                if (!z3) {
                    this.N = true;
                    this.O = z;
                    f();
                    float f2 = this.E;
                    if (f2 >= 0.0f) {
                        phcVar2 = this;
                        phcVar2.e(f2, this.F, (int) (getMeasuredWidth() * 0.23f), (int) (getMeasuredHeight() * 0.23f), false);
                    } else {
                        phcVar2 = this;
                    }
                    phcVar2.N = false;
                    phcVar2.P = true;
                    float translationX = phcVar2.getTranslationX();
                    float translationY = phcVar2.getTranslationY();
                    phcVar2.setTranslationX(0.0f);
                    phcVar2.setTranslationY(0.0f);
                    phcVar2.invalidate();
                    ValueAnimator valueAnimator = phcVar2.e0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(phcVar2.K, 1.0f);
                    phcVar2.e0 = ofFloat;
                    ofFloat.addUpdateListener(phcVar2.f0);
                    phcVar2.e0.setDuration(300L);
                    phcVar2.e0.start();
                    phcVar2.animate().setListener(null).cancel();
                    ViewPropertyAnimator duration = phcVar2.animate().scaleX(0.23f).scaleY(0.23f).translationX(translationX - ((phcVar2.getMeasuredWidth() - (phcVar2.getMeasuredWidth() * 0.23f)) / 2.0f)).translationY(translationY - ((phcVar2.getMeasuredHeight() - (phcVar2.getMeasuredHeight() * 0.23f)) / 2.0f)).alpha(1.0f).setStartDelay(0L).setDuration(300L);
                    d53 d53Var = d53.f;
                    duration.setInterpolator(d53Var).setListener(new f94(phcVar2, translationX, translationY, (byte) 1)).setInterpolator(d53Var).start();
                    return;
                }
                phcVar = this;
            } else {
                phcVar = this;
                if (z3) {
                    phcVar.O = z;
                    float translationX2 = phcVar.getTranslationX();
                    float translationY2 = phcVar.getTranslationY();
                    phcVar.f();
                    phcVar.N = false;
                    phcVar.P = true;
                    phcVar.requestLayout();
                    phcVar.animate().setListener(null).cancel();
                    phcVar.getViewTreeObserver().addOnPreDrawListener(new nhc(phcVar, translationX2, translationY2));
                    return;
                }
                f = 0.0f;
            }
            phcVar.K = f;
            phcVar.N = z;
            phcVar.O = z;
            phcVar.requestLayout();
        }
    }

    public final void d(float f, float f2) {
        ViewParent parent = getParent();
        if (this.N && parent != null && ((View) parent).getMeasuredWidth() <= 0 && getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
            e(f, f2, getMeasuredWidth(), getMeasuredHeight(), true);
            return;
        }
        this.E = f;
        this.F = f2;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        phc phcVar;
        if (this.a0 >= 0.0f) {
            if (!this.d0) {
                animate().setListener(null).cancel();
            }
            setTranslationX(this.a0);
            setTranslationY(this.b0);
            if (!this.d0) {
                setScaleX(1.0f);
                setScaleY(1.0f);
                setAlpha(1.0f);
            }
            this.a0 = -1.0f;
            this.b0 = -1.0f;
        }
        if (this.E >= 0.0f && this.N && getMeasuredWidth() > 0) {
            phcVar = this;
            phcVar.e(this.E, this.F, getMeasuredWidth(), getMeasuredHeight(), false);
            phcVar.E = -1.0f;
            phcVar.F = -1.0f;
        } else {
            phcVar = this;
        }
        super.dispatchDraw(canvas);
        if (!phcVar.P) {
            boolean z = phcVar.N;
            boolean z2 = phcVar.O;
            if (z != z2) {
                phcVar.c(z2, true);
            }
        }
        int measuredWidth = phcVar.getMeasuredWidth() >> 1;
        int measuredHeight = phcVar.getMeasuredHeight() - ((int) ((gm.L(18.0f) * 1.0f) / phcVar.getScaleY()));
        canvas.save();
        float f = measuredWidth;
        float f2 = measuredHeight;
        canvas.scale((1.0f / phcVar.getScaleX()) * phcVar.K * phcVar.L, (1.0f / phcVar.getScaleY()) * phcVar.K * phcVar.L, f, f2);
        canvas.drawCircle(f, f2, gm.L(14.0f), phcVar.x);
        Drawable drawable = phcVar.y;
        drawable.setBounds(aq1.A(2, measuredWidth, drawable), aq1.y(2, measuredHeight, drawable), aq1.w(2, measuredWidth, drawable), aq1.i(2, measuredHeight, drawable));
        drawable.draw(canvas);
        canvas.restore();
        if (phcVar.P) {
            phcVar.invalidate();
        }
    }

    public final void e(float f, float f2, int i, int i2, boolean z) {
        WindowInsets windowInsets;
        float systemWindowInsetTop;
        WindowInsets windowInsets2;
        long j;
        ViewParent parent = getParent();
        if (parent != null && this.N && !this.P && this.S) {
            float f3 = 0.0f;
            if (this.n == null) {
                systemWindowInsetTop = 0.0f;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.I;
            }
            if (this.n != null) {
                f3 = windowInsets2.getSystemWindowInsetBottom() + this.J;
            }
            View view = (View) parent;
            float A = td4.A((view.getMeasuredWidth() - this.G) - this.H, i, f, this.G);
            float A2 = td4.A((view.getMeasuredHeight() - f3) - systemWindowInsetTop, i2, f2, systemWindowInsetTop);
            if (z) {
                animate().setListener(null).cancel();
                ViewPropertyAnimator alpha = animate().scaleX(1.0f).scaleY(1.0f).translationX(A).translationY(A2).alpha(1.0f);
                if (this.M) {
                    j = 0;
                } else {
                    j = 150;
                }
                alpha.setStartDelay(j).setDuration(150L).setInterpolator(d53.f).start();
                return;
            }
            if (!this.T) {
                animate().setListener(null).cancel();
                setScaleX(1.0f);
                setScaleY(1.0f);
                animate().alpha(1.0f).setDuration(150L).start();
            }
            setTranslationX(A);
            setTranslationY(A2);
        }
    }

    public final void f() {
        int L;
        float f = 16.0f;
        this.G = gm.L(16.0f);
        this.H = gm.L(16.0f);
        if (this.M) {
            L = gm.L(60.0f);
        } else {
            L = gm.L(16.0f);
        }
        this.I = L;
        if (this.M) {
            f = 100.0f;
        }
        this.J = gm.L(f) + this.U;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.Q = false;
        if (this.N) {
            size = (int) (size * 0.23f);
            size2 = (int) (size2 * 0.23f);
            this.Q = true;
        } else if (!this.c0) {
            setTranslationX(0.0f);
            setTranslationY(0.0f);
        }
        ohc ohcVar = this.j0;
        if (ohcVar != null) {
            float f = this.K;
            ((shc) ohcVar).b.e0.d(this.Q, f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        if (getMeasuredHeight() != this.f && getMeasuredWidth() != this.h) {
            Path path = this.s;
            path.reset();
            RectF rectF = this.w;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            path.addRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), Path.Direction.CW);
            path.toggleInverseFillType();
        }
        this.f = getMeasuredHeight();
        this.h = getMeasuredWidth();
        f();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phc.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCornerRadius(float f) {
        this.R = f;
        invalidateOutline();
    }

    public void setDelegate(ohc ohcVar) {
        this.j0 = ohcVar;
    }

    public void setInsets(WindowInsets windowInsets) {
        this.n = windowInsets;
    }

    public void setIsActive(boolean z) {
        this.S = z;
    }

    public void setOnTapListener(View.OnClickListener onClickListener) {
        this.i0 = onClickListener;
    }

    public void setRelativePosition(phc phcVar) {
        WindowInsets windowInsets;
        float systemWindowInsetTop;
        WindowInsets windowInsets2;
        float systemWindowInsetBottom;
        ViewParent parent = getParent();
        if (parent == null) {
            return;
        }
        if (this.n == null) {
            systemWindowInsetTop = 0.0f;
        } else {
            systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() + this.I;
        }
        if (this.n == null) {
            systemWindowInsetBottom = 0.0f;
        } else {
            systemWindowInsetBottom = windowInsets2.getSystemWindowInsetBottom() + this.J;
        }
        View view = (View) parent;
        d(Math.min(1.0f, Math.max(0.0f, (phcVar.getTranslationX() - this.G) / (((view.getMeasuredWidth() - this.G) - this.H) - phcVar.getMeasuredWidth()))), Math.min(1.0f, Math.max(0.0f, (phcVar.getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop) - phcVar.getMeasuredHeight()))));
    }

    public void setUiVisible(boolean z) {
        if (getParent() == null) {
            this.M = z;
        } else {
            this.M = z;
        }
    }
}
