package lh;

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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.t80;
import org.telegram.ui.wd;

public class d extends FrameLayout implements s80 {
    public boolean A;
    public int B;
    public jh.p6 C;
    public float D;
    public ValueAnimator E;
    public boolean F;
    public t80 G;
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
    public hp U;
    public int V;
    public boolean W;

    public org.telegram.ui.ActionBar.c6 f15821a;

    public int f15822a0;

    public int f15823b;

    public boolean f15824b0;

    public final Paint f15825c;

    public int f15826c0;
    public final org.telegram.ui.Components.i6 d;

    public final org.telegram.ui.Components.i6 f15827e;

    public final org.telegram.ui.Components.i6 f15828f;
    public float h;

    public final org.telegram.ui.Components.y5 f15829n;

    public final View f15830r;

    public boolean f15831s;
    public boolean v;

    public boolean f15832w;

    public boolean f15833x;

    public int f15834y;

    public d(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, c6Var, true);
    }

    private int getWrapWidth() {
        return getPaddingRight() + getPaddingLeft() + ((int) (a(this.f15828f.d() + AndroidUtilities.dp(15.66f), this.f15829n.d(this.h, false)) + this.d.d() + (this.P ? AndroidUtilities.dp(12.0f) : 0.0f)));
    }

    public float a(float f10, float f11) {
        return f10 * f11;
    }

    @Override
    public final boolean b() {
        return this.J;
    }

    public final void c(int i10, boolean z10) {
        int i11;
        org.telegram.ui.Components.i6 i6Var = this.f15828f;
        if (z10) {
            i6Var.b();
        }
        int i12 = 1;
        if (z10 && i10 != (i11 = this.N) && i10 > 0 && i11 > 0) {
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.M = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.M = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new b(this, 0));
            this.M.addListener(new c(this, i12));
            this.M.setInterpolator(new OvershootInterpolator(2.0f));
            this.M.setDuration(200L);
            this.M.start();
        }
        this.N = i10;
        this.h = (i10 != 0 || this.O) ? 1.0f : 0.0f;
        i6Var.q(LocaleController.formatNumber(i10, ' '), z10, true);
        invalidate();
    }

    public final void d() {
        this.f15832w = true;
        setFilled(true);
        setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23409xa, this.f15821a));
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
        int i10 = 0;
        boolean z11 = charSequence != null;
        org.telegram.ui.Components.i6 i6Var = this.f15827e;
        if (z10) {
            i6Var.b();
        }
        setContentDescription(charSequence);
        invalidate();
        if (!this.F || z11) {
            i6Var.q(charSequence, z10, true);
        } else {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.E = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.D, 0.0f);
            this.E = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new b(this, 3));
            this.E.addListener(new c(this, i10));
            this.E.setDuration(200L);
            this.E.setInterpolator(er.f28122f);
            this.E.start();
        }
        if (this.F || !z11) {
            return;
        }
        this.F = true;
        ValueAnimator valueAnimator2 = this.E;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.E = null;
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.D, 1.0f);
        this.E = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addUpdateListener(new b(this, 4));
        this.E.setDuration(200L);
        this.E.setInterpolator(er.f28122f);
        this.E.start();
    }

    public final void g(CharSequence charSequence, boolean z10, boolean z11) {
        org.telegram.ui.Components.i6 i6Var = this.d;
        if (z10) {
            i6Var.b();
        }
        i6Var.q(charSequence, z10, z11);
        setContentDescription(charSequence);
        invalidate();
    }

    public TextPaint getTextPaint() {
        return this.d.f29238a;
    }

    public final void h(CharSequence charSequence) {
        g(charSequence, false, true);
    }

    public boolean i() {
        return !(this instanceof wd);
    }

    @Override
    public final boolean isEnabled() {
        return this.S;
    }

    public final void j() {
        int i10;
        int i11;
        if (!this.f15833x) {
            this.f15834y = org.telegram.ui.ActionBar.g6.v0(this.f15832w ? org.telegram.ui.ActionBar.g6.f23409xa : org.telegram.ui.ActionBar.g6.Oh, this.f15821a);
        }
        if (this.f15831s) {
            i10 = this.f15832w ? org.telegram.ui.ActionBar.g6.f23427ya : org.telegram.ui.ActionBar.g6.Sh;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.Oh;
        }
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i10, this.f15821a);
        org.telegram.ui.Components.i6 i6Var = this.d;
        i6Var.r(iV0);
        boolean z10 = this.f15831s;
        View view = this.f15830r;
        if (z10) {
            int iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, this.f15821a);
            int i12 = this.f15823b;
            view.setBackground(org.telegram.ui.ActionBar.g6.Y(iV1, i12, i12));
        } else {
            int iL1 = org.telegram.ui.ActionBar.g6.l1(0.1f, i6Var.f29238a.getColor());
            int i13 = this.f15823b;
            view.setBackground(org.telegram.ui.ActionBar.g6.Y(iL1, i13, i13));
        }
        if (this.f15831s) {
            i11 = this.f15832w ? org.telegram.ui.ActionBar.g6.f23427ya : org.telegram.ui.ActionBar.g6.Sh;
        } else {
            i11 = org.telegram.ui.ActionBar.g6.Oh;
        }
        this.f15827e.r(org.telegram.ui.ActionBar.g6.v0(i11, this.f15821a));
        this.f15828f.r(this.f15834y);
        this.f15825c.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, this.f15821a));
    }

    public final void k() {
        this.P = true;
        Drawable drawableMutate = getContext().getDrawable(R.drawable.mini_boost_button).mutate();
        this.Q = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(this.f15834y, PorterDuff.Mode.SRC_IN));
    }

    public final void l() {
        this.W = true;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int wrapWidth;
        boolean z10;
        float f10;
        this.f15830r.draw(canvas);
        if (this.H) {
            if (this.J) {
                if (this.G == null) {
                    t80 t80Var = new t80(this.f15821a);
                    this.G = t80Var;
                    t80Var.setCallback(this);
                    t80 t80Var2 = this.G;
                    t80Var2.f32708t = 2.0f;
                    t80Var2.C = true;
                    t80Var2.f32710w.setStrokeWidth(0.0f);
                    this.G.e(org.telegram.ui.ActionBar.g6.l1(0.02f, -1), org.telegram.ui.ActionBar.g6.l1(0.375f, -1));
                }
                t80 t80Var3 = this.G;
                t80Var3.f32693c = -1L;
                t80Var3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.G.j(this.f15823b);
                this.G.draw(canvas);
            } else {
                t80 t80Var4 = this.G;
                if (t80Var4 != null) {
                    t80Var4.a();
                    this.G.draw(canvas);
                    if (this.G.b()) {
                        this.G.f32692b = -1L;
                    }
                }
            }
        }
        float f11 = this.I;
        org.telegram.ui.Components.i6 i6Var = this.d;
        if (f11 > 0.0f) {
            if (this.U == null) {
                this.U = new hp(i6Var.f29238a.getColor());
            }
            int iDp = (int) ((1.0f - this.I) * AndroidUtilities.dp(24.0f));
            this.U.setBounds(0, iDp, getWidth(), getHeight() + iDp);
            this.U.setAlpha((int) (this.I * 255.0f));
            this.U.draw(canvas);
            invalidate();
        }
        float f12 = this.I;
        if (f12 < 1.0f) {
            if (f12 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.I * AndroidUtilities.dp(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.I * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float fD = i6Var.d();
            float fD2 = this.f15829n.d(this.h, false);
            float fDp = this.P ? AndroidUtilities.dp(12.0f) : 0.0f;
            float fDp2 = AndroidUtilities.dp(15.66f);
            org.telegram.ui.Components.i6 i6Var2 = this.f15828f;
            float fA = a(i6Var2.d() + fDp2, fD2) + fD + fDp;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - fA) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - i6Var.f29241e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) i0.a.c(getMeasuredWidth() - fA, getWidth(), 2.0f, fD), (int) (((getMeasuredHeight() + i6Var.f29241e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            rect.offset(0, (int) ((-AndroidUtilities.dp(7.0f)) * this.D));
            i6Var.f29257w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.R) * (1.0f - this.I) * this.V);
            i6Var.setBounds(rect);
            i6Var.draw(canvas);
            if (this.F) {
                org.telegram.ui.Components.i6 i6Var3 = this.f15827e;
                fA = i6Var3.d();
                rect.set((int) (((getMeasuredWidth() - fA) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - i6Var3.f29241e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) i0.a.c(getMeasuredWidth() - fA, getWidth(), 2.0f, fA), (int) (((getMeasuredHeight() + i6Var3.f29241e) / 2.0f) - AndroidUtilities.dp(1.0f)));
                rect.offset(0, AndroidUtilities.dp(11.0f));
                canvas.save();
                float fLerp = AndroidUtilities.lerp(0.1f, 1.0f, this.D);
                canvas.scale(fLerp, fLerp, rect.centerX(), rect.bottom);
                i6Var3.f29257w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.R) * (1.0f - this.I) * 200.0f * this.D);
                i6Var3.setBounds(rect);
                i6Var3.draw(canvas);
                canvas.restore();
            }
            rect.set((int) (com.google.android.recaptcha.internal.a.A(getMeasuredWidth(), fA, 2.0f, fD) + AndroidUtilities.dp(this.A ? 5.0f : 2.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), i6Var2.d() + fDp) + com.google.android.recaptcha.internal.a.A(getMeasuredWidth(), fA, 2.0f, fD) + AndroidUtilities.dp((this.A ? 5 : 2) + 8)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.L != 1.0f) {
                canvas.save();
                float f13 = this.L;
                canvas.scale(f13, f13, rect.centerX(), rect.centerY());
            }
            if (this.A) {
                f10 = 0.5f;
                int iLerp = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.R) * (1.0f - this.I) * this.V * fD2 * fD2);
                Paint paint = this.f15825c;
                paint.setAlpha(iLerp);
                float fDp3 = AndroidUtilities.dp(this.P ? 4.0f : 10.0f);
                canvas.drawRoundRect(rectF, fDp3, fDp3, paint);
            } else {
                f10 = 0.5f;
            }
            CharSequence charSequence = i6Var2.f29243g;
            rect.offset(-AndroidUtilities.dp((charSequence != null ? charSequence.length() : 0) > 1 ? 0.3f : 0.0f), -AndroidUtilities.dp(0.4f));
            float fZ = org.telegram.messenger.y1.z(1.0f, this.I, this.V, fD2);
            if (this.A) {
                f10 = 1.0f;
            }
            i6Var2.f29257w = (int) (fZ * f10);
            i6Var2.setBounds(rect);
            canvas.save();
            if (this.A && this.P) {
                this.Q.setAlpha((int) ((1.0f - this.I) * this.V * fD2 * 1.0f));
                this.Q.setBounds(AndroidUtilities.dp(1.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top, this.Q.getIntrinsicWidth() + AndroidUtilities.dp(1.0f) + rect.left, this.Q.getIntrinsicHeight() + AndroidUtilities.dp(2.0f) + rect.top);
                this.Q.draw(canvas);
                canvas.translate(fDp / 2.0f, 0.0f);
            }
            i6Var2.draw(canvas);
            canvas.restore();
            if (this.L != 1.0f) {
                canvas.restore();
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (!this.v || this.f15826c0 == (wrapWidth = getWrapWidth())) {
            return;
        }
        this.f15826c0 = wrapWidth;
        requestLayout();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f15831s && isClickable() && getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (!this.v) {
            if (!this.f15824b0) {
                super.onMeasure(i10, i11);
                return;
            } else {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(Math.max(this.d.d() + getPaddingLeft() + getPaddingRight(), this.f15822a0), View.MeasureSpec.getSize(i10)), 1073741824), i11);
                return;
            }
        }
        int wrapWidth = getWrapWidth();
        this.f15826c0 = wrapWidth;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(wrapWidth, View.MeasureSpec.getSize(i10)), 1073741824), i11);
        View view = this.f15830r;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
    }

    public void setColor(int i10) {
        if (this.f15831s) {
            this.f15833x = true;
            int iDp = AndroidUtilities.dp(this.f15823b);
            this.f15834y = i10;
            setBackground(org.telegram.ui.ActionBar.g6.b0(iDp, i10));
            return;
        }
        this.d.r(i10);
        int iL1 = org.telegram.ui.ActionBar.g6.l1(0.1f, i10);
        int i11 = this.f15823b;
        this.f15830r.setBackground(org.telegram.ui.ActionBar.g6.Y(iL1, i11, i11));
    }

    public void setCountFilled(boolean z10) {
        this.A = z10;
        float fDp = AndroidUtilities.dp(z10 ? 12.0f : 14.0f);
        org.telegram.ui.Components.i6 i6Var = this.f15828f;
        i6Var.t(fDp);
        i6Var.r(this.A ? this.f15834y : this.d.f29238a.getColor());
    }

    public void setCounterColor(int i10) {
        this.f15828f.r(i10);
        this.Q.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public void setEnabled(boolean z10) {
        if (this.S != z10) {
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.T = null;
            }
            float f10 = this.R;
            this.S = z10;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
            this.T = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new b(this, 1));
            this.T.start();
        }
        super.setEnabled(z10);
    }

    public void setFilled(boolean z10) {
        if (this.f15831s == z10) {
            return;
        }
        this.f15831s = z10;
        org.telegram.ui.Components.i6 i6Var = this.d;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(this.f15823b), this.f15834y));
            i6Var.u(AndroidUtilities.bold());
        } else {
            setBackground(null);
            i6Var.u(null);
        }
        j();
    }

    public void setFlickeringLoading(boolean z10) {
        this.H = z10;
    }

    public void setGlobalAlpha(float f10) {
        this.V = (int) (f10 * 255.0f);
    }

    @Override
    public void setLoading(boolean z10) {
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
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
            this.K = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new b(this, 2));
            this.K.addListener(new ag.x(9, this, z10));
            this.K.setDuration(320L);
            this.K.setInterpolator(er.h);
            this.K.start();
        }
    }

    public void setMinWidth(int i10) {
        this.f15824b0 = true;
        this.f15822a0 = i10;
    }

    public void setRoundRadius(int i10) {
        this.f15823b = i10;
        if (this.f15831s) {
            setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(i10), this.f15834y));
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

    public void setTextAlpha(float f10) {
        this.d.f29257w = (int) (f10 * 255.0f);
    }

    public void setTextColor(int i10) {
        org.telegram.ui.Components.i6 i6Var = this.d;
        i6Var.r(i10);
        if (this.f15831s) {
            return;
        }
        int iL1 = org.telegram.ui.ActionBar.g6.l1(0.1f, i6Var.f29238a.getColor());
        int i11 = this.f15823b;
        this.f15830r.setBackground(org.telegram.ui.ActionBar.g6.Y(iL1, i11, i11));
    }

    public void setUseWrapContent(boolean z10) {
        this.v = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.G == drawable || this.d == drawable || this.f15827e == drawable || this.f15828f == drawable || super.verifyDrawable(drawable);
    }

    public d(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f15823b = 8;
        er erVar = er.h;
        this.f15829n = new org.telegram.ui.Components.y5(350L, erVar);
        this.A = true;
        this.B = 0;
        this.D = 0.0f;
        this.I = 0.0f;
        this.L = 1.0f;
        this.R = 1.0f;
        this.S = true;
        this.V = 255;
        this.f15831s = z10;
        this.f15821a = c6Var;
        h7.b6.b(this, 0.02f, 1.2f);
        View view = new View(context);
        this.f15830r = view;
        addView(view, h7.z5.c(-1.0f, -1));
        if (z10) {
            int iDp = AndroidUtilities.dp(8.0f);
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
            this.f15834y = iV0;
            setBackground(org.telegram.ui.ActionBar.g6.b0(iDp, iV0));
        }
        Paint paint = new Paint(1);
        this.f15825c = paint;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, true, false, false);
        this.d = i6Var;
        i6Var.k(0.3f, 250L, erVar);
        i6Var.setCallback(this);
        i6Var.t(AndroidUtilities.dp(14.0f));
        if (z10) {
            i6Var.u(AndroidUtilities.bold());
        }
        i6Var.f29239b = 1;
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(i(), true, false, false);
        this.f15827e = i6Var2;
        i6Var2.k(0.3f, 250L, erVar);
        i6Var2.setCallback(this);
        i6Var2.t(AndroidUtilities.dp(12.0f));
        i6Var2.f29239b = 1;
        org.telegram.ui.Components.i6 i6Var3 = new org.telegram.ui.Components.i6(false, false, true, false);
        this.f15828f = i6Var3;
        i6Var3.k(0.3f, 250L, erVar);
        i6Var3.setCallback(this);
        i6Var3.t(AndroidUtilities.dp(12.0f));
        i6Var3.u(AndroidUtilities.bold());
        i6Var3.q("", true, true);
        i6Var3.f29239b = 1;
        setWillNotDraw(false);
        j();
    }
}
