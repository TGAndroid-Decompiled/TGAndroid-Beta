package nh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.np;
import org.telegram.ui.ud;
public class d extends FrameLayout implements b90 {
    public boolean A;
    public int B;
    public lh.r3 C;
    public float D;
    public ValueAnimator E;
    public boolean F;
    public c90 G;
    public boolean H;
    public float I;
    public boolean J;
    public ValueAnimator K;
    public float L;
    public ValueAnimator M;
    public int N;
    public boolean O;
    public boolean P;
    public Drawable Q;
    public float R;
    public boolean S;
    public ValueAnimator T;
    public np U;
    public int V;
    public boolean W;
    public org.telegram.ui.ActionBar.c6 f17490a;
    public int f17491a0;
    public int f17492b;
    public boolean f17493b0;
    public final Paint f17494c;
    public int f17495c0;
    public final org.telegram.ui.Components.n6 d;
    public final org.telegram.ui.Components.n6 f17496e;
    public final org.telegram.ui.Components.n6 f17497f;
    public float h;
    public final org.telegram.ui.Components.d6 f17498n;
    public final View f17499r;
    public boolean f17500s;
    public boolean v;
    public boolean f17501w;
    public boolean f17502x;
    public int f17503y;

    public d(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, c6Var, true);
    }

    private int getWrapWidth() {
        float f9;
        float d = this.f17498n.d(this.h, false);
        if (this.P) {
            f9 = AndroidUtilities.dp(12.0f);
        } else {
            f9 = 0.0f;
        }
        return getPaddingRight() + getPaddingLeft() + ((int) (a(this.f17497f.d() + AndroidUtilities.dp(15.66f), d) + this.d.d() + f9));
    }

    public float a(float f9, float f10) {
        return f9 * f10;
    }

    @Override
    public final boolean b() {
        return this.J;
    }

    public final void c(int i10, boolean z10) {
        float f9;
        int i11;
        org.telegram.ui.Components.n6 n6Var = this.f17497f;
        if (z10) {
            n6Var.b();
        }
        if (z10 && i10 != (i11 = this.N) && i10 > 0 && i11 > 0) {
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.M = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.M = ofFloat;
            ofFloat.addUpdateListener(new b(this, 0));
            this.M.addListener(new c(this, 1));
            this.M.setInterpolator(new OvershootInterpolator(2.0f));
            this.M.setDuration(200L);
            this.M.start();
        }
        this.N = i10;
        if (i10 == 0 && !this.O) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        this.h = f9;
        n6Var.q(LocaleController.formatNumber(i10, ' '), z10, true);
        invalidate();
    }

    public final void d() {
        this.f17501w = true;
        setFilled(true);
        setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.xa, this.f17490a));
        j();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final void e() {
        setRoundRadius(24);
    }

    public final void f(CharSequence charSequence, boolean z10) {
        boolean z11;
        if (charSequence != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.n6 n6Var = this.f17496e;
        if (z10) {
            n6Var.b();
        }
        setContentDescription(charSequence);
        invalidate();
        if (this.F && !z11) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.E = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D, 0.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new b(this, 3));
            this.E.addListener(new c(this, 0));
            this.E.setDuration(200L);
            this.E.setInterpolator(jr.f29800f);
            this.E.start();
        } else {
            n6Var.q(charSequence, z10, true);
        }
        if (!this.F && z11) {
            this.F = true;
            ValueAnimator valueAnimator2 = this.E;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.E = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.D, 1.0f);
            this.E = ofFloat2;
            ofFloat2.addUpdateListener(new b(this, 4));
            this.E.setDuration(200L);
            this.E.setInterpolator(jr.f29800f);
            this.E.start();
        }
    }

    public final void g(CharSequence charSequence, boolean z10, boolean z11) {
        org.telegram.ui.Components.n6 n6Var = this.d;
        if (z10) {
            n6Var.b();
        }
        n6Var.q(charSequence, z10, z11);
        setContentDescription(charSequence);
        invalidate();
    }

    public TextPaint getTextPaint() {
        return this.d.f30861a;
    }

    public final void h(CharSequence charSequence) {
        g(charSequence, false, true);
    }

    public boolean i() {
        return !(this instanceof ud);
    }

    @Override
    public final boolean isEnabled() {
        return this.S;
    }

    public final void j() {
        int i10;
        int i11;
        int i12;
        if (!this.f17502x) {
            if (this.f17501w) {
                i12 = org.telegram.ui.ActionBar.g6.xa;
            } else {
                i12 = org.telegram.ui.ActionBar.g6.Oh;
            }
            this.f17503y = org.telegram.ui.ActionBar.g6.v0(i12, this.f17490a);
        }
        if (this.f17500s) {
            if (this.f17501w) {
                i10 = org.telegram.ui.ActionBar.g6.f23436ya;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.Sh;
            }
        } else {
            i10 = org.telegram.ui.ActionBar.g6.Oh;
        }
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, this.f17490a);
        org.telegram.ui.Components.n6 n6Var = this.d;
        n6Var.r(v02);
        boolean z10 = this.f17500s;
        View view = this.f17499r;
        if (z10) {
            int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, this.f17490a);
            int i13 = this.f17492b;
            view.setBackground(org.telegram.ui.ActionBar.g6.Y(v03, i13, i13));
        } else {
            int l1 = org.telegram.ui.ActionBar.g6.l1(0.1f, n6Var.f30861a.getColor());
            int i14 = this.f17492b;
            view.setBackground(org.telegram.ui.ActionBar.g6.Y(l1, i14, i14));
        }
        if (this.f17500s) {
            if (this.f17501w) {
                i11 = org.telegram.ui.ActionBar.g6.f23436ya;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.Sh;
            }
        } else {
            i11 = org.telegram.ui.ActionBar.g6.Oh;
        }
        this.f17496e.r(org.telegram.ui.ActionBar.g6.v0(i11, this.f17490a));
        this.f17497f.r(this.f17503y);
        this.f17494c.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, this.f17490a));
    }

    public final void k() {
        this.P = true;
        Drawable mutate = getContext().getDrawable(R.drawable.mini_boost_button).mutate();
        this.Q = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(this.f17503y, PorterDuff.Mode.SRC_IN));
    }

    public final void l() {
        this.W = true;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int wrapWidth;
        boolean z10;
        float f9;
        float f10;
        int i10;
        float f11;
        float f12;
        float f13;
        this.f17499r.draw(canvas);
        int i11 = 0;
        if (this.H) {
            if (this.J) {
                if (this.G == null) {
                    c90 c90Var = new c90(this.f17490a);
                    this.G = c90Var;
                    c90Var.setCallback(this);
                    c90 c90Var2 = this.G;
                    c90Var2.f27397t = 2.0f;
                    c90Var2.C = true;
                    c90Var2.f27399w.setStrokeWidth(0.0f);
                    this.G.e(org.telegram.ui.ActionBar.g6.l1(0.02f, -1), org.telegram.ui.ActionBar.g6.l1(0.375f, -1));
                }
                c90 c90Var3 = this.G;
                c90Var3.f27382c = -1L;
                c90Var3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.G.j(this.f17492b);
                this.G.draw(canvas);
            } else {
                c90 c90Var4 = this.G;
                if (c90Var4 != null) {
                    c90Var4.a();
                    this.G.draw(canvas);
                    if (this.G.b()) {
                        this.G.f27381b = -1L;
                    }
                }
            }
        }
        float f14 = this.I;
        org.telegram.ui.Components.n6 n6Var = this.d;
        if (f14 > 0.0f) {
            if (this.U == null) {
                this.U = new np(n6Var.f30861a.getColor());
            }
            int dp = (int) ((1.0f - this.I) * AndroidUtilities.dp(24.0f));
            this.U.setBounds(0, dp, getWidth(), getHeight() + dp);
            this.U.setAlpha((int) (this.I * 255.0f));
            this.U.draw(canvas);
            invalidate();
        }
        float f15 = this.I;
        if (f15 < 1.0f) {
            if (f15 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.I * AndroidUtilities.dp(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.I * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float d = n6Var.d();
            float d10 = this.f17498n.d(this.h, false);
            if (this.P) {
                f9 = AndroidUtilities.dp(12.0f);
            } else {
                f9 = 0.0f;
            }
            org.telegram.ui.Components.n6 n6Var2 = this.f17497f;
            float a2 = a(n6Var2.d() + AndroidUtilities.dp(15.66f), d10) + d + f9;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - a2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - n6Var.f30864e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) j7.l1.c(getMeasuredWidth() - a2, getWidth(), 2.0f, d), (int) (((getMeasuredHeight() + n6Var.f30864e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            rect.offset(0, (int) ((-AndroidUtilities.dp(7.0f)) * this.D));
            n6Var.f30880w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.R) * (1.0f - this.I) * this.V);
            n6Var.setBounds(rect);
            n6Var.draw(canvas);
            if (this.F) {
                org.telegram.ui.Components.n6 n6Var3 = this.f17496e;
                a2 = n6Var3.d();
                rect.set((int) (((getMeasuredWidth() - a2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - n6Var3.f30864e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) j7.l1.c(getMeasuredWidth() - a2, getWidth(), 2.0f, a2), (int) (((getMeasuredHeight() + n6Var3.f30864e) / 2.0f) - AndroidUtilities.dp(1.0f)));
                rect.offset(0, AndroidUtilities.dp(11.0f));
                canvas.save();
                float lerp = AndroidUtilities.lerp(0.1f, 1.0f, this.D);
                canvas.scale(lerp, lerp, rect.centerX(), rect.bottom);
                n6Var3.f30880w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.R) * (1.0f - this.I) * 200.0f * this.D);
                n6Var3.setBounds(rect);
                n6Var3.draw(canvas);
                canvas.restore();
            }
            float A = com.google.android.recaptcha.internal.a.A(getMeasuredWidth(), a2, 2.0f, d);
            if (this.A) {
                f10 = 5.0f;
            } else {
                f10 = 2.0f;
            }
            int dp2 = (int) (A + AndroidUtilities.dp(f10));
            int measuredHeight = (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f);
            float A2 = com.google.android.recaptcha.internal.a.A(getMeasuredWidth(), a2, 2.0f, d);
            if (this.A) {
                i10 = 5;
            } else {
                i10 = 2;
            }
            rect.set(dp2, measuredHeight, (int) (Math.max(AndroidUtilities.dp(9.0f), n6Var2.d() + f9) + A2 + AndroidUtilities.dp(i10 + 8)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.L != 1.0f) {
                canvas.save();
                float f16 = this.L;
                canvas.scale(f16, f16, rect.centerX(), rect.centerY());
            }
            if (this.A) {
                float f17 = 1.0f - this.I;
                f11 = 0.5f;
                float lerp2 = AndroidUtilities.lerp(0.5f, 1.0f, this.R);
                Paint paint = this.f17494c;
                paint.setAlpha((int) (lerp2 * f17 * this.V * d10 * d10));
                if (this.P) {
                    f13 = 4.0f;
                } else {
                    f13 = 10.0f;
                }
                float dp3 = AndroidUtilities.dp(f13);
                canvas.drawRoundRect(rectF, dp3, dp3, paint);
            } else {
                f11 = 0.5f;
            }
            CharSequence charSequence = n6Var2.f30866g;
            if (charSequence != null) {
                i11 = charSequence.length();
            }
            if (i11 > 1) {
                f12 = 0.3f;
            } else {
                f12 = 0.0f;
            }
            rect.offset(-AndroidUtilities.dp(f12), -AndroidUtilities.dp(0.4f));
            float y8 = org.telegram.messenger.x3.y(1.0f, this.I, this.V, d10);
            if (this.A) {
                f11 = 1.0f;
            }
            n6Var2.f30880w = (int) (y8 * f11);
            n6Var2.setBounds(rect);
            canvas.save();
            if (this.A && this.P) {
                this.Q.setAlpha((int) ((1.0f - this.I) * this.V * d10 * 1.0f));
                this.Q.setBounds(AndroidUtilities.dp(1.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top, this.Q.getIntrinsicWidth() + AndroidUtilities.dp(1.0f) + rect.left, this.Q.getIntrinsicHeight() + AndroidUtilities.dp(2.0f) + rect.top);
                this.Q.draw(canvas);
                canvas.translate(f9 / 2.0f, 0.0f);
            }
            n6Var2.draw(canvas);
            canvas.restore();
            if (this.L != 1.0f) {
                canvas.restore();
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (this.v && this.f17495c0 != (wrapWidth = getWrapWidth())) {
            this.f17495c0 = wrapWidth;
            requestLayout();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f17500s && isClickable() && getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.v) {
            int wrapWidth = getWrapWidth();
            this.f17495c0 = wrapWidth;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(wrapWidth, View.MeasureSpec.getSize(i10)), 1073741824), i11);
            View view = this.f17499r;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            }
        } else if (this.f17493b0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(Math.max(this.d.d() + getPaddingLeft() + getPaddingRight(), this.f17491a0), View.MeasureSpec.getSize(i10)), 1073741824), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setColor(int i10) {
        if (this.f17500s) {
            this.f17502x = true;
            int dp = AndroidUtilities.dp(this.f17492b);
            this.f17503y = i10;
            setBackground(org.telegram.ui.ActionBar.g6.b0(dp, i10));
            return;
        }
        this.d.r(i10);
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.1f, i10);
        int i11 = this.f17492b;
        this.f17499r.setBackground(org.telegram.ui.ActionBar.g6.Y(l1, i11, i11));
    }

    public void setCountFilled(boolean z10) {
        float f9;
        int color;
        this.A = z10;
        if (z10) {
            f9 = 12.0f;
        } else {
            f9 = 14.0f;
        }
        org.telegram.ui.Components.n6 n6Var = this.f17497f;
        n6Var.t(AndroidUtilities.dp(f9));
        if (this.A) {
            color = this.f17503y;
        } else {
            color = this.d.f30861a.getColor();
        }
        n6Var.r(color);
    }

    public void setCounterColor(int i10) {
        this.f17497f.r(i10);
        this.Q.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public void setEnabled(boolean z10) {
        float f9;
        if (this.S != z10) {
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.T = null;
            }
            float f10 = this.R;
            this.S = z10;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.T = ofFloat;
            ofFloat.addUpdateListener(new b(this, 1));
            this.T.start();
        }
        super.setEnabled(z10);
    }

    public void setFilled(boolean z10) {
        if (this.f17500s == z10) {
            return;
        }
        this.f17500s = z10;
        org.telegram.ui.Components.n6 n6Var = this.d;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(this.f17492b), this.f17503y));
            n6Var.u(AndroidUtilities.bold());
        } else {
            setBackground(null);
            n6Var.u(null);
        }
        j();
    }

    public void setFlickeringLoading(boolean z10) {
        this.H = z10;
    }

    public void setGlobalAlpha(float f9) {
        this.V = (int) (f9 * 255.0f);
    }

    @Override
    public void setLoading(boolean z10) {
        float f9;
        if (this.J != z10) {
            if (this.H) {
                this.J = z10;
                invalidate();
                return;
            }
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            float f10 = this.I;
            this.J = z10;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new b(this, 2));
            this.K.addListener(new bg.z2(10, this, z10));
            this.K.setDuration(320L);
            this.K.setInterpolator(jr.h);
            this.K.start();
        }
    }

    public void setMinWidth(int i10) {
        this.f17493b0 = true;
        this.f17491a0 = i10;
    }

    public void setRoundRadius(int i10) {
        this.f17492b = i10;
        if (this.f17500s) {
            setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(i10), this.f17503y));
        } else {
            setBackground(null);
        }
        j();
    }

    public void setShowZero(boolean z10) {
        this.O = z10;
    }

    public void setText(CharSequence charSequence) {
        g(charSequence, false, true);
    }

    public void setTextAlpha(float f9) {
        this.d.f30880w = (int) (f9 * 255.0f);
    }

    public void setTextColor(int i10) {
        org.telegram.ui.Components.n6 n6Var = this.d;
        n6Var.r(i10);
        if (!this.f17500s) {
            int l1 = org.telegram.ui.ActionBar.g6.l1(0.1f, n6Var.f30861a.getColor());
            int i11 = this.f17492b;
            this.f17499r.setBackground(org.telegram.ui.ActionBar.g6.Y(l1, i11, i11));
        }
    }

    public void setUseWrapContent(boolean z10) {
        this.v = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.G != drawable && this.d != drawable && this.f17496e != drawable && this.f17497f != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public d(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f17492b = 8;
        jr jrVar = jr.h;
        this.f17498n = new org.telegram.ui.Components.d6(350L, jrVar);
        this.A = true;
        this.B = 0;
        this.D = 0.0f;
        this.I = 0.0f;
        this.L = 1.0f;
        this.R = 1.0f;
        this.S = true;
        this.V = 255;
        this.f17500s = z10;
        this.f17490a = c6Var;
        i7.h6.b(this, 0.02f, 1.2f);
        View view = new View(context);
        this.f17499r = view;
        addView(view, i7.f6.c(-1.0f, -1));
        if (z10) {
            int dp = AndroidUtilities.dp(8.0f);
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
            this.f17503y = v02;
            setBackground(org.telegram.ui.ActionBar.g6.b0(dp, v02));
        }
        Paint paint = new Paint(1);
        this.f17494c = paint;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, true, false, false);
        this.d = n6Var;
        n6Var.k(0.3f, 250L, jrVar);
        n6Var.setCallback(this);
        n6Var.t(AndroidUtilities.dp(14.0f));
        if (z10) {
            n6Var.u(AndroidUtilities.bold());
        }
        n6Var.f30862b = 1;
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(i(), true, false, false);
        this.f17496e = n6Var2;
        n6Var2.k(0.3f, 250L, jrVar);
        n6Var2.setCallback(this);
        n6Var2.t(AndroidUtilities.dp(12.0f));
        n6Var2.f30862b = 1;
        org.telegram.ui.Components.n6 n6Var3 = new org.telegram.ui.Components.n6(false, false, true, false);
        this.f17497f = n6Var3;
        n6Var3.k(0.3f, 250L, jrVar);
        n6Var3.setCallback(this);
        n6Var3.t(AndroidUtilities.dp(12.0f));
        n6Var3.u(AndroidUtilities.bold());
        n6Var3.q("", true, true);
        n6Var3.f30862b = 1;
        setWillNotDraw(false);
        j();
    }
}
