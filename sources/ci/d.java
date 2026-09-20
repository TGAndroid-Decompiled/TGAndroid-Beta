package ci;

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
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.be;
public class d extends FrameLayout implements n90 {
    public boolean E;
    public int F;
    public ai.ba G;
    public float H;
    public ValueAnimator I;
    public boolean J;
    public o90 K;
    public boolean L;
    public float M;
    public boolean N;
    public ValueAnimator O;
    public float P;
    public ValueAnimator Q;
    public int R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public float V;
    public boolean W;
    public org.telegram.ui.ActionBar.f6 f4448a;
    public ValueAnimator f4449a0;
    public int f4450b;
    public tp f4451b0;
    public final Paint f4452c;
    public int f4453c0;
    public final org.telegram.ui.Components.n6 d;
    public boolean f4454d0;
    public final org.telegram.ui.Components.n6 e;
    public int f4455e0;
    public final org.telegram.ui.Components.n6 f4456f;
    public boolean f4457f0;
    public int f4458g0;
    public float h;
    public final org.telegram.ui.Components.d6 f4459n;
    public final View f4460r;
    public boolean f4461s;
    public boolean v;
    public boolean f4462w;
    public boolean f4463x;
    public int f4464y;

    public d(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, f6Var, true);
    }

    private int getWrapWidth() {
        float f7;
        float d = this.f4459n.d(this.h, false);
        if (this.T) {
            f7 = AndroidUtilities.dp(12.0f);
        } else {
            f7 = 0.0f;
        }
        return getPaddingRight() + getPaddingLeft() + ((int) (a(this.f4456f.d() + AndroidUtilities.dp(15.66f), d) + this.d.d() + f7));
    }

    public float a(float f7, float f10) {
        return f7 * f10;
    }

    public final void b(int i10, boolean z10) {
        float f7;
        int i11;
        org.telegram.ui.Components.n6 n6Var = this.f4456f;
        if (z10) {
            n6Var.b();
        }
        if (z10 && i10 != (i11 = this.R) && i10 > 0 && i11 > 0) {
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.Q = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.Q = ofFloat;
            ofFloat.addUpdateListener(new b(this, 0));
            this.Q.addListener(new c(this, 1));
            this.Q.setInterpolator(new OvershootInterpolator(2.0f));
            this.Q.setDuration(200L);
            this.Q.start();
        }
        this.R = i10;
        if (i10 == 0 && !this.S) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        this.h = f7;
        n6Var.q(LocaleController.formatNumber(i10, ' '), z10, true);
        invalidate();
    }

    @Override
    public final boolean c() {
        return this.N;
    }

    public final void d() {
        this.f4462w = true;
        setFilled(true);
        setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19464xa, this.f4448a));
        j();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
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
        org.telegram.ui.Components.n6 n6Var = this.e;
        if (z10) {
            n6Var.b();
        }
        setContentDescription(charSequence);
        invalidate();
        if (this.J && !z11) {
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.I = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new b(this, 3));
            this.I.addListener(new c(this, 0));
            this.I.setDuration(200L);
            this.I.setInterpolator(qr.f27642f);
            this.I.start();
        } else {
            n6Var.q(charSequence, z10, true);
        }
        if (!this.J && z11) {
            this.J = true;
            ValueAnimator valueAnimator2 = this.I;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.I = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.H, 1.0f);
            this.I = ofFloat2;
            ofFloat2.addUpdateListener(new b(this, 4));
            this.I.setDuration(200L);
            this.I.setInterpolator(qr.f27642f);
            this.I.start();
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
        return this.d.f26574a;
    }

    public final void h(CharSequence charSequence) {
        g(charSequence, false, true);
    }

    public boolean i() {
        return !(this instanceof be);
    }

    @Override
    public final boolean isEnabled() {
        return this.W;
    }

    public final void j() {
        int i10;
        int i11;
        int i12;
        if (!this.f4463x) {
            if (this.f4462w) {
                i12 = org.telegram.ui.ActionBar.j6.f19464xa;
            } else {
                i12 = org.telegram.ui.ActionBar.j6.Oh;
            }
            this.f4464y = org.telegram.ui.ActionBar.j6.v0(i12, this.f4448a);
        }
        if (this.f4461s) {
            if (this.f4462w) {
                i10 = org.telegram.ui.ActionBar.j6.f19481ya;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.Sh;
            }
        } else {
            i10 = org.telegram.ui.ActionBar.j6.Oh;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.f4448a);
        org.telegram.ui.Components.n6 n6Var = this.d;
        n6Var.r(v02);
        boolean z10 = this.f4461s;
        View view = this.f4460r;
        if (z10) {
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19184i6, this.f4448a);
            int i13 = this.f4450b;
            view.setBackground(org.telegram.ui.ActionBar.j6.Y(v03, i13, i13));
        } else {
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, n6Var.f26574a.getColor());
            int i14 = this.f4450b;
            view.setBackground(org.telegram.ui.ActionBar.j6.Y(l1, i14, i14));
        }
        if (this.f4461s) {
            if (this.f4462w) {
                i11 = org.telegram.ui.ActionBar.j6.f19481ya;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.Sh;
            }
        } else {
            i11 = org.telegram.ui.ActionBar.j6.Oh;
        }
        this.e.r(org.telegram.ui.ActionBar.j6.v0(i11, this.f4448a));
        this.f4456f.r(this.f4464y);
        this.f4452c.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, this.f4448a));
    }

    public final void k() {
        this.T = true;
        Drawable mutate = getContext().getDrawable(R.drawable.mini_boost_button).mutate();
        this.U = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(this.f4464y, PorterDuff.Mode.SRC_IN));
    }

    public final void l() {
        this.f4454d0 = true;
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
        this.f4460r.draw(canvas);
        int i11 = 0;
        if (this.L) {
            if (this.N) {
                if (this.K == null) {
                    o90 o90Var = new o90(this.f4448a);
                    this.K = o90Var;
                    o90Var.setCallback(this);
                    o90 o90Var2 = this.K;
                    o90Var2.f26858t = 2.0f;
                    o90Var2.C = true;
                    o90Var2.f26860w.setStrokeWidth(0.0f);
                    this.K.e(org.telegram.ui.ActionBar.j6.l1(0.02f, -1), org.telegram.ui.ActionBar.j6.l1(0.375f, -1));
                }
                o90 o90Var3 = this.K;
                o90Var3.f26844c = -1L;
                o90Var3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.K.j(this.f4450b);
                this.K.draw(canvas);
            } else {
                o90 o90Var4 = this.K;
                if (o90Var4 != null) {
                    o90Var4.a();
                    this.K.draw(canvas);
                    if (this.K.b()) {
                        this.K.f26843b = -1L;
                    }
                }
            }
        }
        float f14 = this.M;
        org.telegram.ui.Components.n6 n6Var = this.d;
        if (f14 > 0.0f) {
            if (this.f4451b0 == null) {
                this.f4451b0 = new tp(n6Var.f26574a.getColor());
            }
            int dp = (int) ((1.0f - this.M) * AndroidUtilities.dp(24.0f));
            this.f4451b0.setBounds(0, dp, getWidth(), getHeight() + dp);
            this.f4451b0.setAlpha((int) (this.M * 255.0f));
            this.f4451b0.draw(canvas);
            invalidate();
        }
        float f15 = this.M;
        if (f15 < 1.0f) {
            if (f15 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.M * AndroidUtilities.dp(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.M * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float d = n6Var.d();
            float d10 = this.f4459n.d(this.h, false);
            if (this.T) {
                f7 = AndroidUtilities.dp(12.0f);
            } else {
                f7 = 0.0f;
            }
            org.telegram.ui.Components.n6 n6Var2 = this.f4456f;
            float a2 = a(n6Var2.d() + AndroidUtilities.dp(15.66f), d10) + d + f7;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - a2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - n6Var.e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) org.telegram.messenger.l0.a(getMeasuredWidth() - a2, getWidth(), 2.0f, d), (int) (((getMeasuredHeight() + n6Var.e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            rect.offset(0, (int) ((-AndroidUtilities.dp(7.0f)) * this.H));
            n6Var.f26592w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.V) * (1.0f - this.M) * this.f4453c0);
            n6Var.setBounds(rect);
            n6Var.draw(canvas);
            if (this.J) {
                org.telegram.ui.Components.n6 n6Var3 = this.e;
                a2 = n6Var3.d();
                rect.set((int) (((getMeasuredWidth() - a2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - n6Var3.e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) org.telegram.messenger.l0.a(getMeasuredWidth() - a2, getWidth(), 2.0f, a2), (int) (((getMeasuredHeight() + n6Var3.e) / 2.0f) - AndroidUtilities.dp(1.0f)));
                rect.offset(0, AndroidUtilities.dp(11.0f));
                canvas.save();
                float lerp = AndroidUtilities.lerp(0.1f, 1.0f, this.H);
                canvas.scale(lerp, lerp, rect.centerX(), rect.bottom);
                n6Var3.f26592w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.V) * (1.0f - this.M) * 200.0f * this.H);
                n6Var3.setBounds(rect);
                n6Var3.draw(canvas);
                canvas.restore();
            }
            float A = com.google.android.gms.internal.vision.e2.A(getMeasuredWidth(), a2, 2.0f, d);
            if (this.E) {
                f10 = 5.0f;
            } else {
                f10 = 2.0f;
            }
            int dp2 = (int) (A + AndroidUtilities.dp(f10));
            int measuredHeight = (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f);
            float A2 = com.google.android.gms.internal.vision.e2.A(getMeasuredWidth(), a2, 2.0f, d);
            if (this.E) {
                i10 = 5;
            } else {
                i10 = 2;
            }
            rect.set(dp2, measuredHeight, (int) (Math.max(AndroidUtilities.dp(9.0f), n6Var2.d() + f7) + A2 + AndroidUtilities.dp(i10 + 8)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.P != 1.0f) {
                canvas.save();
                float f16 = this.P;
                canvas.scale(f16, f16, rect.centerX(), rect.centerY());
            }
            if (this.E) {
                float f17 = 1.0f - this.M;
                f11 = 0.5f;
                float lerp2 = AndroidUtilities.lerp(0.5f, 1.0f, this.V);
                Paint paint = this.f4452c;
                paint.setAlpha((int) (lerp2 * f17 * this.f4453c0 * d10 * d10));
                if (this.T) {
                    f13 = 4.0f;
                } else {
                    f13 = 10.0f;
                }
                float dp3 = AndroidUtilities.dp(f13);
                canvas.drawRoundRect(rectF, dp3, dp3, paint);
            } else {
                f11 = 0.5f;
            }
            CharSequence charSequence = n6Var2.f26578g;
            if (charSequence != null) {
                i11 = charSequence.length();
            }
            if (i11 > 1) {
                f12 = 0.3f;
            } else {
                f12 = 0.0f;
            }
            rect.offset(-AndroidUtilities.dp(f12), -AndroidUtilities.dp(0.4f));
            float z11 = org.telegram.messenger.l0.z(1.0f, this.M, this.f4453c0, d10);
            if (this.E) {
                f11 = 1.0f;
            }
            n6Var2.f26592w = (int) (z11 * f11);
            n6Var2.setBounds(rect);
            canvas.save();
            if (this.E && this.T) {
                this.U.setAlpha((int) ((1.0f - this.M) * this.f4453c0 * d10 * 1.0f));
                this.U.setBounds(AndroidUtilities.dp(1.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top, this.U.getIntrinsicWidth() + AndroidUtilities.dp(1.0f) + rect.left, this.U.getIntrinsicHeight() + AndroidUtilities.dp(2.0f) + rect.top);
                this.U.draw(canvas);
                canvas.translate(f7 / 2.0f, 0.0f);
            }
            n6Var2.draw(canvas);
            canvas.restore();
            if (this.P != 1.0f) {
                canvas.restore();
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (this.v && this.f4458g0 != (wrapWidth = getWrapWidth())) {
            this.f4458g0 = wrapWidth;
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
        if (this.f4461s && isClickable() && getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.v) {
            int wrapWidth = getWrapWidth();
            this.f4458g0 = wrapWidth;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(wrapWidth, View.MeasureSpec.getSize(i10)), 1073741824), i11);
            View view = this.f4460r;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            }
        } else if (this.f4457f0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(Math.max(this.d.d() + getPaddingLeft() + getPaddingRight(), this.f4455e0), View.MeasureSpec.getSize(i10)), 1073741824), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setColor(int i10) {
        if (this.f4461s) {
            this.f4463x = true;
            int dp = AndroidUtilities.dp(this.f4450b);
            this.f4464y = i10;
            setBackground(org.telegram.ui.ActionBar.j6.b0(dp, i10));
            return;
        }
        this.d.r(i10);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, i10);
        int i11 = this.f4450b;
        this.f4460r.setBackground(org.telegram.ui.ActionBar.j6.Y(l1, i11, i11));
    }

    public void setCountFilled(boolean z10) {
        float f7;
        int color;
        this.E = z10;
        if (z10) {
            f7 = 12.0f;
        } else {
            f7 = 14.0f;
        }
        org.telegram.ui.Components.n6 n6Var = this.f4456f;
        n6Var.t(AndroidUtilities.dp(f7));
        if (this.E) {
            color = this.f4464y;
        } else {
            color = this.d.f26574a.getColor();
        }
        n6Var.r(color);
    }

    public void setCounterColor(int i10) {
        this.f4456f.r(i10);
        this.U.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public void setEnabled(boolean z10) {
        float f7;
        if (this.W != z10) {
            ValueAnimator valueAnimator = this.f4449a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f4449a0 = null;
            }
            float f10 = this.V;
            this.W = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f4449a0 = ofFloat;
            ofFloat.addUpdateListener(new b(this, 1));
            this.f4449a0.start();
        }
        super.setEnabled(z10);
    }

    public void setFilled(boolean z10) {
        if (this.f4461s == z10) {
            return;
        }
        this.f4461s = z10;
        org.telegram.ui.Components.n6 n6Var = this.d;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(this.f4450b), this.f4464y));
            n6Var.u(AndroidUtilities.bold());
        } else {
            setBackground(null);
            n6Var.u(null);
        }
        j();
    }

    public void setFlickeringLoading(boolean z10) {
        this.L = z10;
    }

    public void setGlobalAlpha(float f7) {
        this.f4453c0 = (int) (f7 * 255.0f);
    }

    @Override
    public void setLoading(boolean z10) {
        float f7;
        if (this.N != z10) {
            if (this.L) {
                this.N = z10;
                invalidate();
                return;
            }
            ValueAnimator valueAnimator = this.O;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.O = null;
            }
            float f10 = this.M;
            this.N = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.O = ofFloat;
            ofFloat.addUpdateListener(new b(this, 2));
            this.O.addListener(new ai.n(6, this, z10));
            this.O.setDuration(320L);
            this.O.setInterpolator(qr.h);
            this.O.start();
        }
    }

    public void setMinWidth(int i10) {
        this.f4457f0 = true;
        this.f4455e0 = i10;
    }

    public void setRoundRadius(int i10) {
        this.f4450b = i10;
        if (this.f4461s) {
            setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(i10), this.f4464y));
        } else {
            setBackground(null);
        }
        j();
    }

    public void setShowZero(boolean z10) {
        this.S = z10;
    }

    public void setText(CharSequence charSequence) {
        g(charSequence, false, true);
    }

    public void setTextAlpha(float f7) {
        this.d.f26592w = (int) (f7 * 255.0f);
    }

    public void setTextColor(int i10) {
        org.telegram.ui.Components.n6 n6Var = this.d;
        n6Var.r(i10);
        if (!this.f4461s) {
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, n6Var.f26574a.getColor());
            int i11 = this.f4450b;
            this.f4460r.setBackground(org.telegram.ui.ActionBar.j6.Y(l1, i11, i11));
        }
    }

    public void setUseWrapContent(boolean z10) {
        this.v = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.K != drawable && this.d != drawable && this.e != drawable && this.f4456f != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public d(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.f4450b = 8;
        qr qrVar = qr.h;
        this.f4459n = new org.telegram.ui.Components.d6(350L, qrVar);
        this.E = true;
        this.F = 0;
        this.H = 0.0f;
        this.M = 0.0f;
        this.P = 1.0f;
        this.V = 1.0f;
        this.W = true;
        this.f4453c0 = 255;
        this.f4461s = z10;
        this.f4448a = f6Var;
        w7.b6.b(this, 0.02f, 1.2f);
        View view = new View(context);
        this.f4460r = view;
        addView(view, w7.y5.c(-1.0f, -1));
        if (z10) {
            int dp = AndroidUtilities.dp(8.0f);
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
            this.f4464y = v02;
            setBackground(org.telegram.ui.ActionBar.j6.b0(dp, v02));
        }
        Paint paint = new Paint(1);
        this.f4452c = paint;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, true, false, false);
        this.d = n6Var;
        n6Var.k(0.3f, 250L, qrVar);
        n6Var.setCallback(this);
        n6Var.t(AndroidUtilities.dp(14.0f));
        if (z10) {
            n6Var.u(AndroidUtilities.bold());
        }
        n6Var.f26575b = 1;
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(i(), true, false, false);
        this.e = n6Var2;
        n6Var2.k(0.3f, 250L, qrVar);
        n6Var2.setCallback(this);
        n6Var2.t(AndroidUtilities.dp(12.0f));
        n6Var2.f26575b = 1;
        org.telegram.ui.Components.n6 n6Var3 = new org.telegram.ui.Components.n6(false, false, true, false);
        this.f4456f = n6Var3;
        n6Var3.k(0.3f, 250L, qrVar);
        n6Var3.setCallback(this);
        n6Var3.t(AndroidUtilities.dp(12.0f));
        n6Var3.u(AndroidUtilities.bold());
        n6Var3.q("", true, true);
        n6Var3.f26575b = 1;
        setWillNotDraw(false);
        j();
    }
}
