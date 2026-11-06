package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.z70;
import org.telegram.ui.pd;
public class d extends FrameLayout implements z70, org.telegram.ui.ActionBar.a6 {
    public int D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public f2.h J;
    public float K;
    public ValueAnimator L;
    public boolean M;
    public a80 N;
    public boolean O;
    public float P;
    public boolean Q;
    public ValueAnimator R;
    public float S;
    public ValueAnimator T;
    public int U;
    public boolean V;
    public boolean W;
    public org.telegram.ui.ActionBar.f6 f11747a;
    public Drawable f11748a0;
    public int f11749b;
    public float f11750b0;
    public final Paint f11751c;
    public boolean f11752c0;
    public final org.telegram.ui.Components.i6 d;
    public ValueAnimator f11753d0;
    public final org.telegram.ui.Components.i6 f11754e;
    public cp f11755e0;
    public final org.telegram.ui.Components.i6 f11756f;
    public int f11757f0;
    public boolean f11758g0;
    public float h;
    public int f11759h0;
    public boolean f11760i0;
    public int f11761j0;
    public final org.telegram.ui.Components.w5 f11762n;
    public final View f11763r;
    public boolean f11764s;
    public boolean f11765w;
    public boolean f11766x;
    public boolean f11767y;

    public d(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, f6Var, true);
    }

    private int getWrapWidth() {
        float f10;
        float e10 = this.f11762n.e(false, this.h);
        if (this.W) {
            f10 = org.telegram.messenger.g0.L(12.0f);
        } else {
            f10 = 0.0f;
        }
        return getPaddingRight() + getPaddingLeft() + ((int) (b(this.f11756f.c() + org.telegram.messenger.g0.L(15.66f), e10) + this.d.c() + f10));
    }

    private void setRippleColor(int i7) {
        View view = this.f11763r;
        Drawable background = view.getBackground();
        if (background != null && this.G == i7) {
            return;
        }
        this.G = i7;
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(ColorStateList.valueOf(i7));
            return;
        }
        int i10 = this.f11749b;
        view.setBackground(org.telegram.ui.ActionBar.k6.a0(i7, i10, i10));
    }

    @Override
    public final boolean a() {
        return this.Q;
    }

    public float b(float f10, float f11) {
        return f10 * f11;
    }

    public final void c(int i7, boolean z9) {
        float f10;
        int i10;
        org.telegram.ui.Components.i6 i6Var = this.f11756f;
        if (z9) {
            i6Var.a();
        }
        if (z9 && i7 != (i10 = this.U) && i7 > 0 && i10 > 0) {
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.T = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.T = ofFloat;
            ofFloat.addUpdateListener(new b(this, 0));
            this.T.addListener(new c(this, 1));
            org.telegram.messenger.camera.q.i(2.0f, this.T);
            this.T.setDuration(200L);
            this.T.start();
        }
        this.U = i7;
        if (i7 == 0 && !this.V) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.h = f10;
        i6Var.t(hd.E(i7, ' '), z9, true);
        invalidate();
    }

    public final void d() {
        int i7;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(this.f11749b), this.D);
        if (this.f11767y) {
            setBackground(d02);
            return;
        }
        if (this.f11766x) {
            i7 = org.telegram.ui.ActionBar.k6.f28000lb;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.Ci;
        }
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        org.telegram.ui.ActionBar.f6 f6Var = this.f11747a;
        setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(this, d02, N, null, f6Var);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    public final void e() {
        this.f11766x = true;
        setFilled(true);
        if (!this.f11767y) {
            this.D = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28000lb, this.f11747a);
            d();
        }
        updateColors();
    }

    public final void f() {
        setRoundRadius(24);
    }

    public final void g(CharSequence charSequence, boolean z9) {
        boolean z10;
        if (charSequence != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.i6 i6Var = this.f11754e;
        if (z9) {
            i6Var.a();
        }
        setContentDescription(charSequence);
        invalidate();
        if (this.M && !z10) {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K, 0.0f);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new b(this, 3));
            this.L.addListener(new c(this, 0));
            this.L.setDuration(200L);
            this.L.setInterpolator(xq.f40310f);
            this.L.start();
        } else {
            i6Var.t(charSequence, z9, true);
        }
        if (!this.M && z10) {
            this.M = true;
            ValueAnimator valueAnimator2 = this.L;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.K, 1.0f);
            this.L = ofFloat2;
            ofFloat2.addUpdateListener(new b(this, 4));
            this.L.setDuration(200L);
            this.L.setInterpolator(xq.f40310f);
            this.L.start();
        }
    }

    public TextPaint getTextPaint() {
        return this.d.f34514a;
    }

    public final void h(CharSequence charSequence, boolean z9) {
        i(charSequence, false, true);
    }

    public final void i(CharSequence charSequence, boolean z9, boolean z10) {
        org.telegram.ui.Components.i6 i6Var = this.d;
        if (z9) {
            i6Var.a();
        }
        i6Var.t(charSequence, z9, z10);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override
    public final boolean isEnabled() {
        return this.f11752c0;
    }

    public boolean j() {
        return !(this instanceof pd);
    }

    public final void k() {
        this.W = true;
        Drawable mutate = getContext().getDrawable(2131231929).mutate();
        this.f11748a0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(this.D, PorterDuff.Mode.SRC_IN));
    }

    public final void l() {
        this.f11758g0 = true;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int wrapWidth;
        boolean z9;
        float f10;
        float f11;
        int i7;
        float f12;
        float f13;
        float f14;
        this.f11763r.draw(canvas);
        int i10 = 0;
        if (this.O) {
            if (this.Q) {
                if (this.N == null) {
                    a80 a80Var = new a80(this.f11747a);
                    this.N = a80Var;
                    a80Var.setCallback(this);
                    a80 a80Var2 = this.N;
                    a80Var2.f31731t = 2.0f;
                    a80Var2.D = true;
                    a80Var2.f31734x.setStrokeWidth(0.0f);
                    this.N.f(org.telegram.ui.ActionBar.k6.r1(0.02f, -1), org.telegram.ui.ActionBar.k6.r1(0.375f, -1));
                }
                a80 a80Var3 = this.N;
                a80Var3.f31716c = -1L;
                a80Var3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.N.k(this.f11749b);
                this.N.draw(canvas);
            } else {
                a80 a80Var4 = this.N;
                if (a80Var4 != null) {
                    a80Var4.a();
                    this.N.draw(canvas);
                    if (this.N.c()) {
                        this.N.f31715b = -1L;
                    }
                }
            }
        }
        int i11 = (this.P > 0.0f ? 1 : (this.P == 0.0f ? 0 : -1));
        org.telegram.ui.Components.i6 i6Var = this.d;
        if (i11 > 0) {
            if (this.f11755e0 == null) {
                this.f11755e0 = new cp(i6Var.f34514a.getColor());
            }
            int L = (int) ((1.0f - this.P) * org.telegram.messenger.g0.L(24.0f));
            this.f11755e0.setBounds(0, L, getWidth(), getHeight() + L);
            this.f11755e0.setAlpha((int) (this.P * 255.0f));
            this.f11755e0.draw(canvas);
            invalidate();
        }
        float f15 = this.P;
        if (f15 < 1.0f) {
            if (f15 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.P * org.telegram.messenger.g0.L(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.P * 0.4f));
                z9 = true;
            } else {
                z9 = false;
            }
            float c10 = i6Var.c();
            float e10 = this.f11762n.e(false, this.h);
            if (this.W) {
                f10 = org.telegram.messenger.g0.L(12.0f);
            } else {
                f10 = 0.0f;
            }
            org.telegram.ui.Components.i6 i6Var2 = this.f11756f;
            float b10 = b(i6Var2.c() + org.telegram.messenger.g0.L(15.66f), e10) + c10 + f10;
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set((int) (((getMeasuredWidth() - b10) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - i6Var.f34519e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)), (int) org.telegram.messenger.k5.a(getMeasuredWidth() - b10, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + i6Var.f34519e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)));
            rect.offset(0, (int) ((-org.telegram.messenger.g0.L(7.0f)) * this.K));
            i6Var.B = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.f11750b0) * (1.0f - this.P) * this.f11757f0);
            i6Var.setBounds(rect);
            i6Var.draw(canvas);
            if (this.M) {
                org.telegram.ui.Components.i6 i6Var3 = this.f11754e;
                b10 = i6Var3.c();
                rect.set((int) (((getMeasuredWidth() - b10) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - i6Var3.f34519e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)), (int) org.telegram.messenger.k5.a(getMeasuredWidth() - b10, getWidth(), 2.0f, b10), (int) (((getMeasuredHeight() + i6Var3.f34519e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)));
                rect.offset(0, org.telegram.messenger.g0.L(11.0f));
                canvas.save();
                float T1 = org.telegram.messenger.g0.T1(0.1f, 1.0f, this.K);
                canvas.scale(T1, T1, rect.centerX(), rect.bottom);
                i6Var3.B = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.f11750b0) * (1.0f - this.P) * 200.0f * this.K);
                i6Var3.setBounds(rect);
                i6Var3.draw(canvas);
                canvas.restore();
            }
            float A = com.google.android.recaptcha.internal.a.A(getMeasuredWidth(), b10, 2.0f, c10);
            if (this.H) {
                f11 = 5.0f;
            } else {
                f11 = 2.0f;
            }
            int L2 = (int) (A + org.telegram.messenger.g0.L(f11));
            int measuredHeight = (int) ((getMeasuredHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f);
            float A2 = com.google.android.recaptcha.internal.a.A(getMeasuredWidth(), b10, 2.0f, c10);
            if (this.H) {
                i7 = 5;
            } else {
                i7 = 2;
            }
            rect.set(L2, measuredHeight, (int) (Math.max(org.telegram.messenger.g0.L(9.0f), i6Var2.c() + f10) + A2 + org.telegram.messenger.g0.L(i7 + 8)), (int) ((org.telegram.messenger.g0.L(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            if (this.S != 1.0f) {
                canvas.save();
                float f16 = this.S;
                canvas.scale(f16, f16, rect.centerX(), rect.centerY());
            }
            if (this.H) {
                float f17 = 1.0f - this.P;
                f12 = 0.5f;
                float T12 = org.telegram.messenger.g0.T1(0.5f, 1.0f, this.f11750b0);
                Paint paint = this.f11751c;
                paint.setAlpha((int) (T12 * f17 * this.f11757f0 * e10 * e10));
                if (this.W) {
                    f14 = 4.0f;
                } else {
                    f14 = 10.0f;
                }
                float L3 = org.telegram.messenger.g0.L(f14);
                canvas.drawRoundRect(rectF, L3, L3, paint);
            } else {
                f12 = 0.5f;
            }
            CharSequence charSequence = i6Var2.f34522i;
            if (charSequence != null) {
                i10 = charSequence.length();
            }
            if (i10 > 1) {
                f13 = 0.3f;
            } else {
                f13 = 0.0f;
            }
            rect.offset(-org.telegram.messenger.g0.L(f13), -org.telegram.messenger.g0.L(0.4f));
            float A3 = org.telegram.messenger.k5.A(1.0f, this.P, this.f11757f0, e10);
            if (this.H) {
                f12 = 1.0f;
            }
            i6Var2.B = (int) (A3 * f12);
            i6Var2.setBounds(rect);
            canvas.save();
            if (this.H && this.W) {
                this.f11748a0.setAlpha((int) ((1.0f - this.P) * this.f11757f0 * e10 * 1.0f));
                this.f11748a0.setBounds(org.telegram.messenger.g0.L(1.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top, this.f11748a0.getIntrinsicWidth() + org.telegram.messenger.g0.L(1.0f) + rect.left, this.f11748a0.getIntrinsicHeight() + org.telegram.messenger.g0.L(2.0f) + rect.top);
                this.f11748a0.draw(canvas);
                canvas.translate(f10 / 2.0f, 0.0f);
            }
            i6Var2.draw(canvas);
            canvas.restore();
            if (this.S != 1.0f) {
                canvas.restore();
            }
            if (z9) {
                canvas.restore();
            }
        }
        if (this.f11765w && this.f11761j0 != (wrapWidth = getWrapWidth())) {
            this.f11761j0 = wrapWidth;
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
        if (this.f11764s && isClickable() && getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onMeasure(int i7, int i10) {
        if (this.f11765w) {
            int wrapWidth = getWrapWidth();
            this.f11761j0 = wrapWidth;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(wrapWidth, View.MeasureSpec.getSize(i7)), 1073741824), i10);
            View view = this.f11763r;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            }
        } else if (this.f11760i0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(Math.max(this.d.c() + getPaddingLeft() + getPaddingRight(), this.f11759h0), View.MeasureSpec.getSize(i7)), 1073741824), i10);
        } else {
            super.onMeasure(i7, i10);
        }
    }

    public void setColor(int i7) {
        if (this.f11764s) {
            this.f11767y = true;
            int L = org.telegram.messenger.g0.L(this.f11749b);
            this.D = i7;
            setBackground(org.telegram.ui.ActionBar.k6.d0(L, i7));
            return;
        }
        this.E = true;
        this.d.u(i7);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.1f, i7);
        int i10 = this.f11749b;
        this.f11763r.setBackground(org.telegram.ui.ActionBar.k6.a0(r12, i10, i10));
    }

    public void setCountFilled(boolean z9) {
        float f10;
        int color;
        this.H = z9;
        if (z9) {
            f10 = 12.0f;
        } else {
            f10 = 14.0f;
        }
        org.telegram.ui.Components.i6 i6Var = this.f11756f;
        i6Var.w(org.telegram.messenger.g0.L(f10));
        if (this.H) {
            color = this.D;
        } else {
            color = this.d.f34514a.getColor();
        }
        i6Var.u(color);
    }

    public void setCounterColor(int i7) {
        this.f11756f.u(i7);
        this.f11748a0.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public void setEnabled(boolean z9) {
        float f10;
        if (this.f11752c0 != z9) {
            ValueAnimator valueAnimator = this.f11753d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f11753d0 = null;
            }
            float f11 = this.f11750b0;
            this.f11752c0 = z9;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f11753d0 = ofFloat;
            ofFloat.addUpdateListener(new b(this, 1));
            this.f11753d0.start();
        }
        super.setEnabled(z9);
    }

    public void setFilled(boolean z9) {
        if (this.f11764s == z9) {
            return;
        }
        this.f11764s = z9;
        org.telegram.ui.Components.i6 i6Var = this.d;
        if (z9) {
            d();
            i6Var.x(org.telegram.messenger.g0.o());
        } else {
            setBackground(null);
            i6Var.x(null);
        }
        updateColors();
    }

    public void setFlickeringLoading(boolean z9) {
        this.O = z9;
    }

    public void setGlobalAlpha(float f10) {
        this.f11757f0 = (int) (f10 * 255.0f);
    }

    @Override
    public void setLoading(boolean z9) {
        float f10;
        if (this.Q != z9) {
            if (this.O) {
                this.Q = z9;
                invalidate();
                return;
            }
            ValueAnimator valueAnimator = this.R;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.R = null;
            }
            float f11 = this.P;
            this.Q = z9;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.R = ofFloat;
            ofFloat.addUpdateListener(new b(this, 2));
            this.R.addListener(new ch.y(6, this, z9));
            this.R.setDuration(320L);
            this.R.setInterpolator(xq.h);
            this.R.start();
        }
    }

    public void setMinWidth(int i7) {
        this.f11760i0 = true;
        this.f11759h0 = i7;
    }

    public void setRoundRadius(int i7) {
        this.f11749b = i7;
        if (this.f11764s) {
            d();
        } else {
            setBackground(null);
        }
        this.f11763r.setBackground(null);
        updateColors();
    }

    public void setShowZero(boolean z9) {
        this.V = z9;
    }

    public void setText(CharSequence charSequence) {
        i(charSequence, false, true);
    }

    public void setTextAlpha(float f10) {
        this.d.B = (int) (f10 * 255.0f);
    }

    public void setTextColor(int i7) {
        this.F = -1;
        this.E = true;
        org.telegram.ui.Components.i6 i6Var = this.d;
        i6Var.u(i7);
        if (!this.f11764s) {
            setRippleColor(org.telegram.ui.ActionBar.k6.r1(0.1f, i6Var.f34514a.getColor()));
        }
    }

    public void setTextColorKey(int i7) {
        this.F = i7;
        this.E = false;
        updateColors();
    }

    public void setUseWrapContent(boolean z9) {
        this.f11765w = z9;
    }

    @Override
    public void updateColors() {
        int i7;
        int i10;
        if (!this.f11767y) {
            if (this.f11766x) {
                i10 = org.telegram.ui.ActionBar.k6.f28000lb;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.Ci;
            }
            this.D = org.telegram.ui.ActionBar.k6.w0(i10, this.f11747a);
        }
        boolean z9 = this.E;
        org.telegram.ui.Components.i6 i6Var = this.d;
        if (!z9) {
            int i11 = this.F;
            if (i11 < 0) {
                if (this.f11764s) {
                    if (this.f11766x) {
                        i11 = org.telegram.ui.ActionBar.k6.mb;
                    } else {
                        i11 = org.telegram.ui.ActionBar.k6.Gi;
                    }
                } else {
                    i11 = org.telegram.ui.ActionBar.k6.Ci;
                }
            }
            i6Var.u(org.telegram.ui.ActionBar.k6.w0(i11, this.f11747a));
        }
        if (this.f11764s) {
            setRippleColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27940i6, this.f11747a));
        } else if (!this.E) {
            setRippleColor(org.telegram.ui.ActionBar.k6.r1(0.1f, i6Var.f34514a.getColor()));
        }
        if (!this.E) {
            if (this.f11764s) {
                if (this.f11766x) {
                    i7 = org.telegram.ui.ActionBar.k6.mb;
                } else {
                    i7 = org.telegram.ui.ActionBar.k6.Gi;
                }
            } else {
                i7 = org.telegram.ui.ActionBar.k6.Ci;
            }
            this.f11754e.u(org.telegram.ui.ActionBar.k6.w0(i7, this.f11747a));
        }
        this.f11756f.u(this.D);
        this.f11751c.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gi, this.f11747a));
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.N != drawable && this.d != drawable && this.f11754e != drawable && this.f11756f != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public d(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        this.f11749b = 8;
        xq xqVar = xq.h;
        this.f11762n = new org.telegram.ui.Components.w5(350L, xqVar);
        this.F = -1;
        this.H = true;
        this.I = 0;
        this.K = 0.0f;
        this.P = 0.0f;
        this.S = 1.0f;
        this.f11750b0 = 1.0f;
        this.f11752c0 = true;
        this.f11757f0 = 255;
        this.f11764s = z9;
        this.f11747a = f6Var;
        c8.ka.b(this, 0.02f, 1.2f);
        View view = new View(context);
        this.f11763r = view;
        addView(view, c8.ha.c(-1.0f, -1));
        if (z9) {
            int L = org.telegram.messenger.g0.L(8.0f);
            int i7 = org.telegram.ui.ActionBar.k6.Ci;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
            this.D = w02;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, w02);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
            setBackground(d02);
            org.telegram.ui.ActionBar.r6.k(this, d02, N, null, f6Var);
        }
        Paint paint = new Paint(1);
        this.f11751c = paint;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gi, f6Var));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, true, false, false, true);
        this.d = i6Var;
        i6Var.n(0.3f, 250L, xqVar);
        i6Var.setCallback(this);
        i6Var.w(org.telegram.messenger.g0.L(14.0f));
        if (z9) {
            i6Var.x(org.telegram.messenger.g0.o());
        }
        i6Var.f34516b = 1;
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(j(), true, false);
        this.f11754e = i6Var2;
        i6Var2.n(0.3f, 250L, xqVar);
        i6Var2.setCallback(this);
        i6Var2.w(org.telegram.messenger.g0.L(12.0f));
        i6Var2.f34516b = 1;
        org.telegram.ui.Components.i6 i6Var3 = new org.telegram.ui.Components.i6(false, false, true);
        this.f11756f = i6Var3;
        i6Var3.n(0.3f, 250L, xqVar);
        i6Var3.setCallback(this);
        i6Var3.w(org.telegram.messenger.g0.L(12.0f));
        i6Var3.x(org.telegram.messenger.g0.o());
        i6Var3.t("", true, true);
        i6Var3.f34516b = 1;
        setWillNotDraw(false);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
