package kh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.p80;
import org.telegram.ui.wd;
public class d extends FrameLayout implements o80 {
    public boolean A;
    public int B;
    public ih.j7 C;
    public float D;
    public ValueAnimator E;
    public boolean F;
    public p80 G;
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
    public jp U;
    public int V;
    public boolean W;
    public org.telegram.ui.ActionBar.b6 f15063a;
    public int f15064a0;
    public int f15065b;
    public boolean f15066b0;
    public final Paint f15067c;
    public int f15068c0;
    public final org.telegram.ui.Components.i6 d;
    public final org.telegram.ui.Components.i6 f15069e;
    public final org.telegram.ui.Components.i6 f15070f;
    public float h;
    public final org.telegram.ui.Components.y5 f15071n;
    public final View f15072r;
    public boolean f15073s;
    public boolean v;
    public boolean f15074w;
    public boolean f15075x;
    public int f15076y;

    public d(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        this(context, b6Var, true);
    }

    private int getWrapWidth() {
        float f10;
        float d = this.f15071n.d(this.h, false);
        if (this.P) {
            f10 = AndroidUtilities.dp(12.0f);
        } else {
            f10 = 0.0f;
        }
        return getPaddingRight() + getPaddingLeft() + ((int) (a(this.f15070f.d() + AndroidUtilities.dp(15.66f), d) + this.d.d() + f10));
    }

    public float a(float f10, float f11) {
        return f10 * f11;
    }

    @Override
    public final boolean b() {
        return this.J;
    }

    public final void c(int i9, boolean z10) {
        float f10;
        int i10;
        org.telegram.ui.Components.i6 i6Var = this.f15070f;
        if (z10) {
            i6Var.b();
        }
        if (z10 && i9 != (i10 = this.N) && i9 > 0 && i10 > 0) {
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
        this.N = i9;
        if (i9 == 0 && !this.O) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.h = f10;
        i6Var.q(LocaleController.formatNumber(i9, ' '), z10, true);
        invalidate();
    }

    public final void d() {
        this.f15074w = true;
        setFilled(true);
        setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23355xa, this.f15063a));
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
        org.telegram.ui.Components.i6 i6Var = this.f15069e;
        if (z10) {
            i6Var.b();
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
            this.E.setInterpolator(gr.f28844f);
            this.E.start();
        } else {
            i6Var.q(charSequence, z10, true);
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
            this.E.setInterpolator(gr.f28844f);
            this.E.start();
        }
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
        return this.d.f29332a;
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
        int i9;
        int i10;
        int i11;
        if (!this.f15075x) {
            if (this.f15074w) {
                i11 = org.telegram.ui.ActionBar.f6.f23355xa;
            } else {
                i11 = org.telegram.ui.ActionBar.f6.Oh;
            }
            this.f15076y = org.telegram.ui.ActionBar.f6.v0(i11, this.f15063a);
        }
        if (this.f15073s) {
            if (this.f15074w) {
                i9 = org.telegram.ui.ActionBar.f6.f23373ya;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.Sh;
            }
        } else {
            i9 = org.telegram.ui.ActionBar.f6.Oh;
        }
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, this.f15063a);
        org.telegram.ui.Components.i6 i6Var = this.d;
        i6Var.r(v02);
        boolean z10 = this.f15073s;
        View view = this.f15072r;
        if (z10) {
            int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, this.f15063a);
            int i12 = this.f15065b;
            view.setBackground(org.telegram.ui.ActionBar.f6.Y(v03, i12, i12));
        } else {
            int l1 = org.telegram.ui.ActionBar.f6.l1(0.1f, i6Var.f29332a.getColor());
            int i13 = this.f15065b;
            view.setBackground(org.telegram.ui.ActionBar.f6.Y(l1, i13, i13));
        }
        if (this.f15073s) {
            if (this.f15074w) {
                i10 = org.telegram.ui.ActionBar.f6.f23373ya;
            } else {
                i10 = org.telegram.ui.ActionBar.f6.Sh;
            }
        } else {
            i10 = org.telegram.ui.ActionBar.f6.Oh;
        }
        this.f15069e.r(org.telegram.ui.ActionBar.f6.v0(i10, this.f15063a));
        this.f15070f.r(this.f15076y);
        this.f15067c.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Sh, this.f15063a));
    }

    public final void k() {
        this.P = true;
        Drawable mutate = getContext().getDrawable(R.drawable.mini_boost_button).mutate();
        this.Q = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(this.f15076y, PorterDuff.Mode.SRC_IN));
    }

    public final void l() {
        this.W = true;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int wrapWidth;
        boolean z10;
        float f10;
        float f11;
        int i9;
        float f12;
        float f13;
        float f14;
        this.f15072r.draw(canvas);
        int i10 = 0;
        if (this.H) {
            if (this.J) {
                if (this.G == null) {
                    p80 p80Var = new p80(this.f15063a);
                    this.G = p80Var;
                    p80Var.setCallback(this);
                    p80 p80Var2 = this.G;
                    p80Var2.f31588t = 2.0f;
                    p80Var2.C = true;
                    p80Var2.f31590w.setStrokeWidth(0.0f);
                    this.G.e(org.telegram.ui.ActionBar.f6.l1(0.02f, -1), org.telegram.ui.ActionBar.f6.l1(0.375f, -1));
                }
                p80 p80Var3 = this.G;
                p80Var3.f31573c = -1L;
                p80Var3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.G.j(this.f15065b);
                this.G.draw(canvas);
            } else {
                p80 p80Var4 = this.G;
                if (p80Var4 != null) {
                    p80Var4.a();
                    this.G.draw(canvas);
                    if (this.G.b()) {
                        this.G.f31572b = -1L;
                    }
                }
            }
        }
        float f15 = this.I;
        org.telegram.ui.Components.i6 i6Var = this.d;
        if (f15 > 0.0f) {
            if (this.U == null) {
                this.U = new jp(i6Var.f29332a.getColor());
            }
            int dp = (int) ((1.0f - this.I) * AndroidUtilities.dp(24.0f));
            this.U.setBounds(0, dp, getWidth(), getHeight() + dp);
            this.U.setAlpha((int) (this.I * 255.0f));
            this.U.draw(canvas);
            invalidate();
        }
        float f16 = this.I;
        if (f16 < 1.0f) {
            if (f16 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.I * AndroidUtilities.dp(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.I * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float d = i6Var.d();
            float d9 = this.f15071n.d(this.h, false);
            if (this.P) {
                f10 = AndroidUtilities.dp(12.0f);
            } else {
                f10 = 0.0f;
            }
            org.telegram.ui.Components.i6 i6Var2 = this.f15070f;
            float a2 = a(i6Var2.d() + AndroidUtilities.dp(15.66f), d9) + d + f10;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - a2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - i6Var.f29335e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) j3.r0.c(getMeasuredWidth() - a2, getWidth(), 2.0f, d), (int) (((getMeasuredHeight() + i6Var.f29335e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            rect.offset(0, (int) ((-AndroidUtilities.dp(7.0f)) * this.D));
            i6Var.f29351w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.R) * (1.0f - this.I) * this.V);
            i6Var.setBounds(rect);
            i6Var.draw(canvas);
            if (this.F) {
                org.telegram.ui.Components.i6 i6Var3 = this.f15069e;
                a2 = i6Var3.d();
                rect.set((int) (((getMeasuredWidth() - a2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - i6Var3.f29335e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) j3.r0.c(getMeasuredWidth() - a2, getWidth(), 2.0f, a2), (int) (((getMeasuredHeight() + i6Var3.f29335e) / 2.0f) - AndroidUtilities.dp(1.0f)));
                rect.offset(0, AndroidUtilities.dp(11.0f));
                canvas.save();
                float lerp = AndroidUtilities.lerp(0.1f, 1.0f, this.D);
                canvas.scale(lerp, lerp, rect.centerX(), rect.bottom);
                i6Var3.f29351w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.R) * (1.0f - this.I) * 200.0f * this.D);
                i6Var3.setBounds(rect);
                i6Var3.draw(canvas);
                canvas.restore();
            }
            float A = e2.c.A(getMeasuredWidth(), a2, 2.0f, d);
            if (this.A) {
                f11 = 5.0f;
            } else {
                f11 = 2.0f;
            }
            int dp2 = (int) (A + AndroidUtilities.dp(f11));
            int measuredHeight = (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f);
            float A2 = e2.c.A(getMeasuredWidth(), a2, 2.0f, d);
            if (this.A) {
                i9 = 5;
            } else {
                i9 = 2;
            }
            rect.set(dp2, measuredHeight, (int) (Math.max(AndroidUtilities.dp(9.0f), i6Var2.d() + f10) + A2 + AndroidUtilities.dp(i9 + 8)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.L != 1.0f) {
                canvas.save();
                float f17 = this.L;
                canvas.scale(f17, f17, rect.centerX(), rect.centerY());
            }
            if (this.A) {
                float f18 = 1.0f - this.I;
                f12 = 0.5f;
                float lerp2 = AndroidUtilities.lerp(0.5f, 1.0f, this.R);
                Paint paint = this.f15067c;
                paint.setAlpha((int) (lerp2 * f18 * this.V * d9 * d9));
                if (this.P) {
                    f14 = 4.0f;
                } else {
                    f14 = 10.0f;
                }
                float dp3 = AndroidUtilities.dp(f14);
                canvas.drawRoundRect(rectF, dp3, dp3, paint);
            } else {
                f12 = 0.5f;
            }
            CharSequence charSequence = i6Var2.f29337g;
            if (charSequence != null) {
                i10 = charSequence.length();
            }
            if (i10 > 1) {
                f13 = 0.3f;
            } else {
                f13 = 0.0f;
            }
            rect.offset(-AndroidUtilities.dp(f13), -AndroidUtilities.dp(0.4f));
            float y10 = org.telegram.messenger.l0.y(1.0f, this.I, this.V, d9);
            if (this.A) {
                f12 = 1.0f;
            }
            i6Var2.f29351w = (int) (y10 * f12);
            i6Var2.setBounds(rect);
            canvas.save();
            if (this.A && this.P) {
                this.Q.setAlpha((int) ((1.0f - this.I) * this.V * d9 * 1.0f));
                this.Q.setBounds(AndroidUtilities.dp(1.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top, this.Q.getIntrinsicWidth() + AndroidUtilities.dp(1.0f) + rect.left, this.Q.getIntrinsicHeight() + AndroidUtilities.dp(2.0f) + rect.top);
                this.Q.draw(canvas);
                canvas.translate(f10 / 2.0f, 0.0f);
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
        if (this.v && this.f15068c0 != (wrapWidth = getWrapWidth())) {
            this.f15068c0 = wrapWidth;
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
        if (this.f15073s && isClickable() && getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onMeasure(int i9, int i10) {
        if (this.v) {
            int wrapWidth = getWrapWidth();
            this.f15068c0 = wrapWidth;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(wrapWidth, View.MeasureSpec.getSize(i9)), 1073741824), i10);
            View view = this.f15072r;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            }
        } else if (this.f15066b0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(Math.max(this.d.d() + getPaddingLeft() + getPaddingRight(), this.f15064a0), View.MeasureSpec.getSize(i9)), 1073741824), i10);
        } else {
            super.onMeasure(i9, i10);
        }
    }

    public void setColor(int i9) {
        if (this.f15073s) {
            this.f15075x = true;
            int dp = AndroidUtilities.dp(this.f15065b);
            this.f15076y = i9;
            setBackground(org.telegram.ui.ActionBar.f6.b0(dp, i9));
            return;
        }
        this.d.r(i9);
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.1f, i9);
        int i10 = this.f15065b;
        this.f15072r.setBackground(org.telegram.ui.ActionBar.f6.Y(l1, i10, i10));
    }

    public void setCountFilled(boolean z10) {
        float f10;
        int color;
        this.A = z10;
        if (z10) {
            f10 = 12.0f;
        } else {
            f10 = 14.0f;
        }
        org.telegram.ui.Components.i6 i6Var = this.f15070f;
        i6Var.t(AndroidUtilities.dp(f10));
        if (this.A) {
            color = this.f15076y;
        } else {
            color = this.d.f29332a.getColor();
        }
        i6Var.r(color);
    }

    public void setCounterColor(int i9) {
        this.f15070f.r(i9);
        this.Q.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public void setEnabled(boolean z10) {
        float f10;
        if (this.S != z10) {
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.T = null;
            }
            float f11 = this.R;
            this.S = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.T = ofFloat;
            ofFloat.addUpdateListener(new b(this, 1));
            this.T.start();
        }
        super.setEnabled(z10);
    }

    public void setFilled(boolean z10) {
        if (this.f15073s == z10) {
            return;
        }
        this.f15073s = z10;
        org.telegram.ui.Components.i6 i6Var = this.d;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(this.f15065b), this.f15076y));
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
        float f10;
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
            float f11 = this.I;
            this.J = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new b(this, 2));
            this.K.addListener(new hg.b0(7, this, z10));
            this.K.setDuration(320L);
            this.K.setInterpolator(gr.h);
            this.K.start();
        }
    }

    public void setMinWidth(int i9) {
        this.f15066b0 = true;
        this.f15064a0 = i9;
    }

    public void setRoundRadius(int i9) {
        this.f15065b = i9;
        if (this.f15073s) {
            setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(i9), this.f15076y));
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
        this.d.f29351w = (int) (f10 * 255.0f);
    }

    public void setTextColor(int i9) {
        org.telegram.ui.Components.i6 i6Var = this.d;
        i6Var.r(i9);
        if (!this.f15073s) {
            int l1 = org.telegram.ui.ActionBar.f6.l1(0.1f, i6Var.f29332a.getColor());
            int i10 = this.f15065b;
            this.f15072r.setBackground(org.telegram.ui.ActionBar.f6.Y(l1, i10, i10));
        }
    }

    public void setUseWrapContent(boolean z10) {
        this.v = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.G != drawable && this.d != drawable && this.f15069e != drawable && this.f15070f != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public d(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        this.f15065b = 8;
        gr grVar = gr.h;
        this.f15071n = new org.telegram.ui.Components.y5(350L, grVar);
        this.A = true;
        this.B = 0;
        this.D = 0.0f;
        this.I = 0.0f;
        this.L = 1.0f;
        this.R = 1.0f;
        this.S = true;
        this.V = 255;
        this.f15073s = z10;
        this.f15063a = b6Var;
        g7.g6.b(this, 0.02f, 1.2f);
        View view = new View(context);
        this.f15072r = view;
        addView(view, g7.e6.c(-1.0f, -1));
        if (z10) {
            int dp = AndroidUtilities.dp(8.0f);
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var);
            this.f15076y = v02;
            setBackground(org.telegram.ui.ActionBar.f6.b0(dp, v02));
        }
        Paint paint = new Paint(1);
        this.f15067c = paint;
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Sh, b6Var));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, true, false, false);
        this.d = i6Var;
        i6Var.k(0.3f, 250L, grVar);
        i6Var.setCallback(this);
        i6Var.t(AndroidUtilities.dp(14.0f));
        if (z10) {
            i6Var.u(AndroidUtilities.bold());
        }
        i6Var.f29333b = 1;
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(i(), true, false, false);
        this.f15069e = i6Var2;
        i6Var2.k(0.3f, 250L, grVar);
        i6Var2.setCallback(this);
        i6Var2.t(AndroidUtilities.dp(12.0f));
        i6Var2.f29333b = 1;
        org.telegram.ui.Components.i6 i6Var3 = new org.telegram.ui.Components.i6(false, false, true, false);
        this.f15070f = i6Var3;
        i6Var3.k(0.3f, 250L, grVar);
        i6Var3.setCallback(this);
        i6Var3.t(AndroidUtilities.dp(12.0f));
        i6Var3.u(AndroidUtilities.bold());
        i6Var3.q("", true, true);
        i6Var3.f29333b = 1;
        setWillNotDraw(false);
        j();
    }
}
