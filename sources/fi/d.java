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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.ae;
public class d extends FrameLayout implements da0, org.telegram.ui.ActionBar.p6 {
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public e2.q0 J;
    public float K;
    public ValueAnimator L;
    public boolean M;
    public ea0 N;
    public boolean O;
    public float P;
    public boolean Q;
    public ValueAnimator R;
    public float S;
    public ValueAnimator T;
    public int U;
    public boolean V;
    public boolean W;
    public org.telegram.ui.ActionBar.u6 f10681a;
    public Drawable f10682a0;
    public int f10683b;
    public float f10684b0;
    public final Paint f10685c;
    public boolean f10686c0;
    public final org.telegram.ui.Components.r6 d;
    public ValueAnimator f10687d0;
    public final org.telegram.ui.Components.r6 e;
    public gq f10688e0;
    public final org.telegram.ui.Components.r6 f10689f;
    public int f10690f0;
    public boolean f10691g0;
    public float h;
    public int f10692h0;
    public boolean f10693i0;
    public int f10694j0;
    public final org.telegram.ui.Components.h6 f10695n;
    public final View f10696r;
    public boolean f10697s;
    public boolean v;
    public boolean f10698w;
    public boolean f10699x;
    public int f10700y;

    public d(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        this(context, u6Var, true);
    }

    private int getWrapWidth() {
        float f7;
        float d = this.f10695n.d(this.h, false);
        if (this.W) {
            f7 = AndroidUtilities.dp(12.0f);
        } else {
            f7 = 0.0f;
        }
        return getPaddingRight() + getPaddingLeft() + ((int) (a(this.f10689f.c() + AndroidUtilities.dp(15.66f), d) + this.d.c() + f7));
    }

    private void setRippleColor(int i10) {
        View view = this.f10696r;
        Drawable background = view.getBackground();
        if (background != null && this.G == i10) {
            return;
        }
        this.G = i10;
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(ColorStateList.valueOf(i10));
            return;
        }
        int i11 = this.f10683b;
        view.setBackground(org.telegram.ui.ActionBar.y6.Z(i10, i11, i11));
    }

    public float a(float f7, float f10) {
        return f7 * f10;
    }

    public final void b(int i10, boolean z10) {
        float f7;
        int i11;
        org.telegram.ui.Components.r6 r6Var = this.f10689f;
        if (z10) {
            r6Var.a();
        }
        if (z10 && i10 != (i11 = this.U) && i10 > 0 && i11 > 0) {
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.T = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.T = ofFloat;
            ofFloat.addUpdateListener(new b(this, 0));
            this.T.addListener(new c(this, 1));
            org.telegram.ui.d3.m(2.0f, this.T);
            this.T.setDuration(200L);
            this.T.start();
        }
        this.U = i10;
        if (i10 == 0 && !this.V) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        this.h = f7;
        r6Var.t(LocaleController.formatNumber(i10, ' '), z10, true);
        invalidate();
    }

    @Override
    public final boolean c() {
        return this.Q;
    }

    public final void d() {
        int i10;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(this.f10683b), this.f10700y);
        if (this.f10699x) {
            setBackground(c02);
            return;
        }
        if (this.f10698w) {
            i10 = org.telegram.ui.ActionBar.y6.f23735xa;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.Oh;
        }
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        org.telegram.ui.ActionBar.u6 u6Var = this.f10681a;
        setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(this, c02, N, null, u6Var);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final void e() {
        this.f10698w = true;
        setFilled(true);
        if (!this.f10699x) {
            this.f10700y = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23735xa, this.f10681a);
            d();
        }
        updateColors();
    }

    public final void f() {
        setRoundRadius(24);
    }

    public final void g(CharSequence charSequence, boolean z10) {
        boolean z11;
        if (charSequence != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.r6 r6Var = this.e;
        if (z10) {
            r6Var.a();
        }
        setContentDescription(charSequence);
        invalidate();
        if (this.M && !z11) {
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
            this.L.setInterpolator(ds.f27530f);
            this.L.start();
        } else {
            r6Var.t(charSequence, z10, true);
        }
        if (!this.M && z11) {
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
            this.L.setInterpolator(ds.f27530f);
            this.L.start();
        }
    }

    public TextPaint getTextPaint() {
        return this.d.f32140a;
    }

    public final void h(CharSequence charSequence, boolean z10) {
        i(charSequence, false, true);
    }

    public final void i(CharSequence charSequence, boolean z10, boolean z11) {
        org.telegram.ui.Components.r6 r6Var = this.d;
        if (z10) {
            r6Var.a();
        }
        r6Var.t(charSequence, z10, z11);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override
    public final boolean isEnabled() {
        return this.f10686c0;
    }

    public boolean j() {
        return !(this instanceof ae);
    }

    public final void k() {
        this.W = true;
        Drawable mutate = getContext().getDrawable(R.drawable.mini_boost_button).mutate();
        this.f10682a0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(this.f10700y, PorterDuff.Mode.SRC_IN));
    }

    public final void l() {
        this.f10691g0 = true;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int wrapWidth;
        boolean z10;
        float f7;
        float f10;
        int i10;
        float f11;
        float f12;
        float f13;
        this.f10696r.draw(canvas);
        int i11 = 0;
        if (this.O) {
            if (this.Q) {
                if (this.N == null) {
                    ea0 ea0Var = new ea0(this.f10681a);
                    this.N = ea0Var;
                    ea0Var.setCallback(this);
                    ea0 ea0Var2 = this.N;
                    ea0Var2.f27802t = 2.0f;
                    ea0Var2.D = true;
                    ea0Var2.f27805x.setStrokeWidth(0.0f);
                    this.N.f(org.telegram.ui.ActionBar.y6.o1(0.02f, -1), org.telegram.ui.ActionBar.y6.o1(0.375f, -1));
                }
                ea0 ea0Var3 = this.N;
                ea0Var3.f27788c = -1L;
                ea0Var3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.N.k(this.f10683b);
                this.N.draw(canvas);
            } else {
                ea0 ea0Var4 = this.N;
                if (ea0Var4 != null) {
                    ea0Var4.a();
                    this.N.draw(canvas);
                    if (this.N.c()) {
                        this.N.f27787b = -1L;
                    }
                }
            }
        }
        int i12 = (this.P > 0.0f ? 1 : (this.P == 0.0f ? 0 : -1));
        org.telegram.ui.Components.r6 r6Var = this.d;
        if (i12 > 0) {
            if (this.f10688e0 == null) {
                this.f10688e0 = new gq(r6Var.f32140a.getColor());
            }
            int dp = (int) ((1.0f - this.P) * AndroidUtilities.dp(24.0f));
            this.f10688e0.setBounds(0, dp, getWidth(), getHeight() + dp);
            this.f10688e0.setAlpha((int) (this.P * 255.0f));
            this.f10688e0.draw(canvas);
            invalidate();
        }
        float f14 = this.P;
        if (f14 < 1.0f) {
            if (f14 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.P * AndroidUtilities.dp(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.P * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float c10 = r6Var.c();
            float d = this.f10695n.d(this.h, false);
            if (this.W) {
                f7 = AndroidUtilities.dp(12.0f);
            } else {
                f7 = 0.0f;
            }
            org.telegram.ui.Components.r6 r6Var2 = this.f10689f;
            float a2 = a(r6Var2.c() + AndroidUtilities.dp(15.66f), d) + c10 + f7;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - a2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - r6Var.e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) org.telegram.messenger.t.b(getMeasuredWidth() - a2, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + r6Var.e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            rect.offset(0, (int) ((-AndroidUtilities.dp(7.0f)) * this.K));
            r6Var.B = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.f10684b0) * (1.0f - this.P) * this.f10690f0);
            r6Var.setBounds(rect);
            r6Var.draw(canvas);
            if (this.M) {
                org.telegram.ui.Components.r6 r6Var3 = this.e;
                a2 = r6Var3.c();
                rect.set((int) (((getMeasuredWidth() - a2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - r6Var3.e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) org.telegram.messenger.t.b(getMeasuredWidth() - a2, getWidth(), 2.0f, a2), (int) (((getMeasuredHeight() + r6Var3.e) / 2.0f) - AndroidUtilities.dp(1.0f)));
                rect.offset(0, AndroidUtilities.dp(11.0f));
                canvas.save();
                float lerp = AndroidUtilities.lerp(0.1f, 1.0f, this.K);
                canvas.scale(lerp, lerp, rect.centerX(), rect.bottom);
                r6Var3.B = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.f10684b0) * (1.0f - this.P) * 200.0f * this.K);
                r6Var3.setBounds(rect);
                r6Var3.draw(canvas);
                canvas.restore();
            }
            float B = c3.h0.B(getMeasuredWidth(), a2, 2.0f, c10);
            if (this.H) {
                f10 = 5.0f;
            } else {
                f10 = 2.0f;
            }
            int dp2 = (int) (B + AndroidUtilities.dp(f10));
            int measuredHeight = (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f);
            float B2 = c3.h0.B(getMeasuredWidth(), a2, 2.0f, c10);
            if (this.H) {
                i10 = 5;
            } else {
                i10 = 2;
            }
            rect.set(dp2, measuredHeight, (int) (Math.max(AndroidUtilities.dp(9.0f), r6Var2.c() + f7) + B2 + AndroidUtilities.dp(i10 + 8)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.S != 1.0f) {
                canvas.save();
                float f15 = this.S;
                canvas.scale(f15, f15, rect.centerX(), rect.centerY());
            }
            if (this.H) {
                float f16 = 1.0f - this.P;
                f11 = 0.5f;
                float lerp2 = AndroidUtilities.lerp(0.5f, 1.0f, this.f10684b0);
                Paint paint = this.f10685c;
                paint.setAlpha((int) (lerp2 * f16 * this.f10690f0 * d * d));
                if (this.W) {
                    f13 = 4.0f;
                } else {
                    f13 = 10.0f;
                }
                float dp3 = AndroidUtilities.dp(f13);
                canvas.drawRoundRect(rectF, dp3, dp3, paint);
            } else {
                f11 = 0.5f;
            }
            CharSequence charSequence = r6Var2.f32147i;
            if (charSequence != null) {
                i11 = charSequence.length();
            }
            if (i11 > 1) {
                f12 = 0.3f;
            } else {
                f12 = 0.0f;
            }
            rect.offset(-AndroidUtilities.dp(f12), -AndroidUtilities.dp(0.4f));
            float A = org.telegram.messenger.t.A(1.0f, this.P, this.f10690f0, d);
            if (this.H) {
                f11 = 1.0f;
            }
            r6Var2.B = (int) (A * f11);
            r6Var2.setBounds(rect);
            canvas.save();
            if (this.H && this.W) {
                this.f10682a0.setAlpha((int) ((1.0f - this.P) * this.f10690f0 * d * 1.0f));
                this.f10682a0.setBounds(AndroidUtilities.dp(1.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top, this.f10682a0.getIntrinsicWidth() + AndroidUtilities.dp(1.0f) + rect.left, this.f10682a0.getIntrinsicHeight() + AndroidUtilities.dp(2.0f) + rect.top);
                this.f10682a0.draw(canvas);
                canvas.translate(f7 / 2.0f, 0.0f);
            }
            r6Var2.draw(canvas);
            canvas.restore();
            if (this.S != 1.0f) {
                canvas.restore();
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (this.v && this.f10694j0 != (wrapWidth = getWrapWidth())) {
            this.f10694j0 = wrapWidth;
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
        if (this.f10697s && isClickable() && getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.v) {
            int wrapWidth = getWrapWidth();
            this.f10694j0 = wrapWidth;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(wrapWidth, View.MeasureSpec.getSize(i10)), 1073741824), i11);
            View view = this.f10696r;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            }
        } else if (this.f10693i0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(Math.max(this.d.c() + getPaddingLeft() + getPaddingRight(), this.f10692h0), View.MeasureSpec.getSize(i10)), 1073741824), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setColor(int i10) {
        if (this.f10697s) {
            this.f10699x = true;
            int dp = AndroidUtilities.dp(this.f10683b);
            this.f10700y = i10;
            setBackground(org.telegram.ui.ActionBar.y6.c0(dp, i10));
            return;
        }
        this.E = true;
        this.d.u(i10);
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.1f, i10);
        int i11 = this.f10683b;
        this.f10696r.setBackground(org.telegram.ui.ActionBar.y6.Z(o12, i11, i11));
    }

    public void setCountFilled(boolean z10) {
        float f7;
        int color;
        this.H = z10;
        if (z10) {
            f7 = 12.0f;
        } else {
            f7 = 14.0f;
        }
        org.telegram.ui.Components.r6 r6Var = this.f10689f;
        r6Var.w(AndroidUtilities.dp(f7));
        if (this.H) {
            color = this.f10700y;
        } else {
            color = this.d.f32140a.getColor();
        }
        r6Var.u(color);
    }

    public void setCounterColor(int i10) {
        this.f10689f.u(i10);
        this.f10682a0.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public void setEnabled(boolean z10) {
        float f7;
        if (this.f10686c0 != z10) {
            ValueAnimator valueAnimator = this.f10687d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f10687d0 = null;
            }
            float f10 = this.f10684b0;
            this.f10686c0 = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f10687d0 = ofFloat;
            ofFloat.addUpdateListener(new b(this, 1));
            this.f10687d0.start();
        }
        super.setEnabled(z10);
    }

    public void setFilled(boolean z10) {
        if (this.f10697s == z10) {
            return;
        }
        this.f10697s = z10;
        org.telegram.ui.Components.r6 r6Var = this.d;
        if (z10) {
            d();
            r6Var.x(AndroidUtilities.bold());
        } else {
            setBackground(null);
            r6Var.x(null);
        }
        updateColors();
    }

    public void setFlickeringLoading(boolean z10) {
        this.O = z10;
    }

    public void setGlobalAlpha(float f7) {
        this.f10690f0 = (int) (f7 * 255.0f);
    }

    @Override
    public void setLoading(boolean z10) {
        float f7;
        if (this.Q != z10) {
            if (this.O) {
                this.Q = z10;
                invalidate();
                return;
            }
            ValueAnimator valueAnimator = this.R;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.R = null;
            }
            float f10 = this.P;
            this.Q = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.R = ofFloat;
            ofFloat.addUpdateListener(new b(this, 2));
            this.R.addListener(new bh.f0(7, this, z10));
            this.R.setDuration(320L);
            this.R.setInterpolator(ds.h);
            this.R.start();
        }
    }

    public void setMinWidth(int i10) {
        this.f10693i0 = true;
        this.f10692h0 = i10;
    }

    public void setRoundRadius(int i10) {
        this.f10683b = i10;
        if (this.f10697s) {
            d();
        } else {
            setBackground(null);
        }
        this.f10696r.setBackground(null);
        updateColors();
    }

    public void setShowZero(boolean z10) {
        this.V = z10;
    }

    public void setText(CharSequence charSequence) {
        i(charSequence, false, true);
    }

    public void setTextAlpha(float f7) {
        this.d.B = (int) (f7 * 255.0f);
    }

    public void setTextColor(int i10) {
        this.F = -1;
        this.E = true;
        org.telegram.ui.Components.r6 r6Var = this.d;
        r6Var.u(i10);
        if (!this.f10697s) {
            setRippleColor(org.telegram.ui.ActionBar.y6.o1(0.1f, r6Var.f32140a.getColor()));
        }
    }

    public void setTextColorKey(int i10) {
        this.F = i10;
        this.E = false;
        updateColors();
    }

    public void setUseWrapContent(boolean z10) {
        this.v = z10;
    }

    @Override
    public void updateColors() {
        int i10;
        int i11;
        if (!this.f10699x) {
            if (this.f10698w) {
                i11 = org.telegram.ui.ActionBar.y6.f23735xa;
            } else {
                i11 = org.telegram.ui.ActionBar.y6.Oh;
            }
            this.f10700y = org.telegram.ui.ActionBar.y6.w0(i11, this.f10681a);
        }
        boolean z10 = this.E;
        org.telegram.ui.Components.r6 r6Var = this.d;
        if (!z10) {
            int i12 = this.F;
            if (i12 < 0) {
                if (this.f10697s) {
                    if (this.f10698w) {
                        i12 = org.telegram.ui.ActionBar.y6.f23753ya;
                    } else {
                        i12 = org.telegram.ui.ActionBar.y6.Sh;
                    }
                } else {
                    i12 = org.telegram.ui.ActionBar.y6.Oh;
                }
            }
            r6Var.u(org.telegram.ui.ActionBar.y6.w0(i12, this.f10681a));
        }
        if (this.f10697s) {
            setRippleColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23449i6, this.f10681a));
        } else if (!this.E) {
            setRippleColor(org.telegram.ui.ActionBar.y6.o1(0.1f, r6Var.f32140a.getColor()));
        }
        if (!this.E) {
            if (this.f10697s) {
                if (this.f10698w) {
                    i10 = org.telegram.ui.ActionBar.y6.f23753ya;
                } else {
                    i10 = org.telegram.ui.ActionBar.y6.Sh;
                }
            } else {
                i10 = org.telegram.ui.ActionBar.y6.Oh;
            }
            this.e.u(org.telegram.ui.ActionBar.y6.w0(i10, this.f10681a));
        }
        this.f10689f.u(this.f10700y);
        this.f10685c.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Sh, this.f10681a));
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.N != drawable && this.d != drawable && this.e != drawable && this.f10689f != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public d(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        this.f10683b = 8;
        ds dsVar = ds.h;
        this.f10695n = new org.telegram.ui.Components.h6(350L, dsVar);
        this.F = -1;
        this.H = true;
        this.I = 0;
        this.K = 0.0f;
        this.P = 0.0f;
        this.S = 1.0f;
        this.f10684b0 = 1.0f;
        this.f10686c0 = true;
        this.f10690f0 = 255;
        this.f10697s = z10;
        this.f10681a = u6Var;
        kb1.c(this, 0.02f, 1.2f);
        View view = new View(context);
        this.f10696r = view;
        addView(view, kb1.g(-1.0f, -1));
        if (z10) {
            int dp = AndroidUtilities.dp(8.0f);
            int i10 = org.telegram.ui.ActionBar.y6.Oh;
            int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
            this.f10700y = w02;
            ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, w02);
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
            setBackground(c02);
            org.telegram.ui.ActionBar.f7.k(this, c02, N, null, u6Var);
        }
        Paint paint = new Paint(1);
        this.f10685c = paint;
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Sh, u6Var));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(true, true, false, false, true);
        this.d = r6Var;
        r6Var.n(0.3f, 250L, dsVar);
        r6Var.setCallback(this);
        r6Var.w(AndroidUtilities.dp(14.0f));
        if (z10) {
            r6Var.x(AndroidUtilities.bold());
        }
        r6Var.f32142b = 1;
        org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(j(), true, false);
        this.e = r6Var2;
        r6Var2.n(0.3f, 250L, dsVar);
        r6Var2.setCallback(this);
        r6Var2.w(AndroidUtilities.dp(12.0f));
        r6Var2.f32142b = 1;
        org.telegram.ui.Components.r6 r6Var3 = new org.telegram.ui.Components.r6(false, false, true);
        this.f10689f = r6Var3;
        r6Var3.n(0.3f, 250L, dsVar);
        r6Var3.setCallback(this);
        r6Var3.w(AndroidUtilities.dp(12.0f));
        r6Var3.x(AndroidUtilities.bold());
        r6Var3.t("", true, true);
        r6Var3.f32142b = 1;
        setWillNotDraw(false);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
