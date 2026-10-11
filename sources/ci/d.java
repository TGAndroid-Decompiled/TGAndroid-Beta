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
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ai;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.jq;
import org.telegram.ui.ae;
public class d extends FrameLayout implements ia0 {
    public boolean E;
    public int F;
    public ai.ca G;
    public float H;
    public ValueAnimator I;
    public boolean J;
    public ja0 K;
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
    public org.telegram.ui.ActionBar.d6 f4860a;
    public ValueAnimator f4861a0;
    public int f4862b;
    public jq f4863b0;
    public final Paint f4864c;
    public int f4865c0;
    public final org.telegram.ui.Components.q6 d;
    public boolean f4866d0;
    public final org.telegram.ui.Components.q6 f4867e;
    public int f4868e0;
    public final org.telegram.ui.Components.q6 f4869f;
    public boolean f4870f0;
    public int f4871g0;
    public float h;
    public final org.telegram.ui.Components.g6 f4872n;
    public final View f4873r;
    public boolean f4874s;
    public boolean v;
    public boolean f4875w;
    public boolean f4876x;
    public int f4877y;

    public d(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, d6Var, true);
    }

    private int getWrapWidth() {
        float f7;
        float d = this.f4872n.d(this.h, false);
        if (this.T) {
            f7 = AndroidUtilities.dp(12.0f);
        } else {
            f7 = 0.0f;
        }
        return getPaddingRight() + getPaddingLeft() + ((int) (a(this.f4869f.c() + AndroidUtilities.dp(15.66f), d) + this.d.c() + f7));
    }

    public float a(float f7, float f10) {
        return f7 * f10;
    }

    public final void b(int i10, boolean z10) {
        float f7;
        int i11;
        org.telegram.ui.Components.q6 q6Var = this.f4869f;
        if (z10) {
            q6Var.a();
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
            ai.l(2.0f, this.Q);
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
        q6Var.t(LocaleController.formatNumber(i10, ' '), z10, true);
        invalidate();
    }

    @Override
    public final boolean c() {
        return this.N;
    }

    public final void d() {
        this.f4875w = true;
        setFilled(true);
        setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21159xa, this.f4860a));
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
        org.telegram.ui.Components.q6 q6Var = this.f4867e;
        if (z10) {
            q6Var.a();
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
            this.I.setInterpolator(is.f27451f);
            this.I.start();
        } else {
            q6Var.t(charSequence, z10, true);
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
            this.I.setInterpolator(is.f27451f);
            this.I.start();
        }
    }

    public final void g(CharSequence charSequence, boolean z10, boolean z11) {
        org.telegram.ui.Components.q6 q6Var = this.d;
        if (z10) {
            q6Var.a();
        }
        q6Var.t(charSequence, z10, z11);
        setContentDescription(charSequence);
        invalidate();
    }

    public TextPaint getTextPaint() {
        return this.d.f30017a;
    }

    public final void h(CharSequence charSequence) {
        g(charSequence, false, true);
    }

    public boolean i() {
        return !(this instanceof ae);
    }

    @Override
    public final boolean isEnabled() {
        return this.W;
    }

    public final void j() {
        int i10;
        int i11;
        int i12;
        if (!this.f4876x) {
            if (this.f4875w) {
                i12 = org.telegram.ui.ActionBar.h6.f21159xa;
            } else {
                i12 = org.telegram.ui.ActionBar.h6.Oh;
            }
            this.f4877y = org.telegram.ui.ActionBar.h6.w0(i12, this.f4860a);
        }
        if (this.f4874s) {
            if (this.f4875w) {
                i10 = org.telegram.ui.ActionBar.h6.f21175ya;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.Sh;
            }
        } else {
            i10 = org.telegram.ui.ActionBar.h6.Oh;
        }
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, this.f4860a);
        org.telegram.ui.Components.q6 q6Var = this.d;
        q6Var.u(w02);
        boolean z10 = this.f4874s;
        View view = this.f4873r;
        if (z10) {
            int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20877i6, this.f4860a);
            int i13 = this.f4862b;
            view.setBackground(org.telegram.ui.ActionBar.h6.Z(w03, i13, i13));
        } else {
            int m12 = org.telegram.ui.ActionBar.h6.m1(0.1f, q6Var.f30017a.getColor());
            int i14 = this.f4862b;
            view.setBackground(org.telegram.ui.ActionBar.h6.Z(m12, i14, i14));
        }
        if (this.f4874s) {
            if (this.f4875w) {
                i11 = org.telegram.ui.ActionBar.h6.f21175ya;
            } else {
                i11 = org.telegram.ui.ActionBar.h6.Sh;
            }
        } else {
            i11 = org.telegram.ui.ActionBar.h6.Oh;
        }
        this.f4867e.u(org.telegram.ui.ActionBar.h6.w0(i11, this.f4860a));
        this.f4869f.u(this.f4877y);
        this.f4864c.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sh, this.f4860a));
    }

    public final void k() {
        this.T = true;
        Drawable mutate = getContext().getDrawable(R.drawable.mini_boost_button).mutate();
        this.U = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(this.f4877y, PorterDuff.Mode.SRC_IN));
    }

    public final void l() {
        this.f4866d0 = true;
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
        this.f4873r.draw(canvas);
        int i11 = 0;
        if (this.L) {
            if (this.N) {
                if (this.K == null) {
                    ja0 ja0Var = new ja0(this.f4860a);
                    this.K = ja0Var;
                    ja0Var.setCallback(this);
                    ja0 ja0Var2 = this.K;
                    ja0Var2.f27656t = 2.0f;
                    ja0Var2.D = true;
                    ja0Var2.f27659x.setStrokeWidth(0.0f);
                    this.K.f(org.telegram.ui.ActionBar.h6.m1(0.02f, -1), org.telegram.ui.ActionBar.h6.m1(0.375f, -1));
                }
                ja0 ja0Var3 = this.K;
                ja0Var3.f27641c = -1L;
                ja0Var3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.K.k(this.f4862b);
                this.K.draw(canvas);
            } else {
                ja0 ja0Var4 = this.K;
                if (ja0Var4 != null) {
                    ja0Var4.a();
                    this.K.draw(canvas);
                    if (this.K.c()) {
                        this.K.f27640b = -1L;
                    }
                }
            }
        }
        int i12 = (this.M > 0.0f ? 1 : (this.M == 0.0f ? 0 : -1));
        org.telegram.ui.Components.q6 q6Var = this.d;
        if (i12 > 0) {
            if (this.f4863b0 == null) {
                this.f4863b0 = new jq(q6Var.f30017a.getColor());
            }
            int dp = (int) ((1.0f - this.M) * AndroidUtilities.dp(24.0f));
            this.f4863b0.setBounds(0, dp, getWidth(), getHeight() + dp);
            this.f4863b0.setAlpha((int) (this.M * 255.0f));
            this.f4863b0.draw(canvas);
            invalidate();
        }
        float f14 = this.M;
        if (f14 < 1.0f) {
            if (f14 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.M * AndroidUtilities.dp(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.M * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float c10 = q6Var.c();
            float d = this.f4872n.d(this.h, false);
            if (this.T) {
                f7 = AndroidUtilities.dp(12.0f);
            } else {
                f7 = 0.0f;
            }
            org.telegram.ui.Components.q6 q6Var2 = this.f4869f;
            float a2 = a(q6Var2.c() + AndroidUtilities.dp(15.66f), d) + c10 + f7;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - a2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - q6Var.f30022e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) org.telegram.messenger.q.a(getMeasuredWidth() - a2, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + q6Var.f30022e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            rect.offset(0, (int) ((-AndroidUtilities.dp(7.0f)) * this.H));
            q6Var.B = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.V) * (1.0f - this.M) * this.f4865c0);
            q6Var.setBounds(rect);
            q6Var.draw(canvas);
            if (this.J) {
                org.telegram.ui.Components.q6 q6Var3 = this.f4867e;
                a2 = q6Var3.c();
                rect.set((int) (((getMeasuredWidth() - a2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - q6Var3.f30022e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) org.telegram.messenger.q.a(getMeasuredWidth() - a2, getWidth(), 2.0f, a2), (int) (((getMeasuredHeight() + q6Var3.f30022e) / 2.0f) - AndroidUtilities.dp(1.0f)));
                rect.offset(0, AndroidUtilities.dp(11.0f));
                canvas.save();
                float lerp = AndroidUtilities.lerp(0.1f, 1.0f, this.H);
                canvas.scale(lerp, lerp, rect.centerX(), rect.bottom);
                q6Var3.B = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.V) * (1.0f - this.M) * 200.0f * this.H);
                q6Var3.setBounds(rect);
                q6Var3.draw(canvas);
                canvas.restore();
            }
            float z11 = com.google.android.gms.internal.vision.e2.z(getMeasuredWidth(), a2, 2.0f, c10);
            if (this.E) {
                f10 = 5.0f;
            } else {
                f10 = 2.0f;
            }
            int dp2 = (int) (z11 + AndroidUtilities.dp(f10));
            int measuredHeight = (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f);
            float z12 = com.google.android.gms.internal.vision.e2.z(getMeasuredWidth(), a2, 2.0f, c10);
            if (this.E) {
                i10 = 5;
            } else {
                i10 = 2;
            }
            rect.set(dp2, measuredHeight, (int) (Math.max(AndroidUtilities.dp(9.0f), q6Var2.c() + f7) + z12 + AndroidUtilities.dp(i10 + 8)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.P != 1.0f) {
                canvas.save();
                float f15 = this.P;
                canvas.scale(f15, f15, rect.centerX(), rect.centerY());
            }
            if (this.E) {
                float f16 = 1.0f - this.M;
                f11 = 0.5f;
                float lerp2 = AndroidUtilities.lerp(0.5f, 1.0f, this.V);
                Paint paint = this.f4864c;
                paint.setAlpha((int) (lerp2 * f16 * this.f4865c0 * d * d));
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
            CharSequence charSequence = q6Var2.f30025i;
            if (charSequence != null) {
                i11 = charSequence.length();
            }
            if (i11 > 1) {
                f12 = 0.3f;
            } else {
                f12 = 0.0f;
            }
            rect.offset(-AndroidUtilities.dp(f12), -AndroidUtilities.dp(0.4f));
            float z13 = org.telegram.messenger.q.z(1.0f, this.M, this.f4865c0, d);
            if (this.E) {
                f11 = 1.0f;
            }
            q6Var2.B = (int) (z13 * f11);
            q6Var2.setBounds(rect);
            canvas.save();
            if (this.E && this.T) {
                this.U.setAlpha((int) ((1.0f - this.M) * this.f4865c0 * d * 1.0f));
                this.U.setBounds(AndroidUtilities.dp(1.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top, this.U.getIntrinsicWidth() + AndroidUtilities.dp(1.0f) + rect.left, this.U.getIntrinsicHeight() + AndroidUtilities.dp(2.0f) + rect.top);
                this.U.draw(canvas);
                canvas.translate(f7 / 2.0f, 0.0f);
            }
            q6Var2.draw(canvas);
            canvas.restore();
            if (this.P != 1.0f) {
                canvas.restore();
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (this.v && this.f4871g0 != (wrapWidth = getWrapWidth())) {
            this.f4871g0 = wrapWidth;
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
        if (this.f4874s && isClickable() && getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.v) {
            int wrapWidth = getWrapWidth();
            this.f4871g0 = wrapWidth;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(wrapWidth, View.MeasureSpec.getSize(i10)), 1073741824), i11);
            View view = this.f4873r;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            }
        } else if (this.f4870f0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(Math.max(this.d.c() + getPaddingLeft() + getPaddingRight(), this.f4868e0), View.MeasureSpec.getSize(i10)), 1073741824), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setColor(int i10) {
        if (this.f4874s) {
            this.f4876x = true;
            int dp = AndroidUtilities.dp(this.f4862b);
            this.f4877y = i10;
            setBackground(org.telegram.ui.ActionBar.h6.c0(dp, i10));
            return;
        }
        this.d.u(i10);
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.1f, i10);
        int i11 = this.f4862b;
        this.f4873r.setBackground(org.telegram.ui.ActionBar.h6.Z(m12, i11, i11));
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
        org.telegram.ui.Components.q6 q6Var = this.f4869f;
        q6Var.w(AndroidUtilities.dp(f7));
        if (this.E) {
            color = this.f4877y;
        } else {
            color = this.d.f30017a.getColor();
        }
        q6Var.u(color);
    }

    public void setCounterColor(int i10) {
        this.f4869f.u(i10);
        this.U.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public void setEnabled(boolean z10) {
        float f7;
        if (this.W != z10) {
            ValueAnimator valueAnimator = this.f4861a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f4861a0 = null;
            }
            float f10 = this.V;
            this.W = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f4861a0 = ofFloat;
            ofFloat.addUpdateListener(new b(this, 1));
            this.f4861a0.start();
        }
        super.setEnabled(z10);
    }

    public void setFilled(boolean z10) {
        if (this.f4874s == z10) {
            return;
        }
        this.f4874s = z10;
        org.telegram.ui.Components.q6 q6Var = this.d;
        if (z10) {
            setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(this.f4862b), this.f4877y));
            q6Var.x(AndroidUtilities.bold());
        } else {
            setBackground(null);
            q6Var.x(null);
        }
        j();
    }

    public void setFlickeringLoading(boolean z10) {
        this.L = z10;
    }

    public void setGlobalAlpha(float f7) {
        this.f4865c0 = (int) (f7 * 255.0f);
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
            this.O.setInterpolator(is.h);
            this.O.start();
        }
    }

    public void setMinWidth(int i10) {
        this.f4870f0 = true;
        this.f4868e0 = i10;
    }

    public void setRoundRadius(int i10) {
        this.f4862b = i10;
        if (this.f4874s) {
            setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(i10), this.f4877y));
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
        this.d.B = (int) (f7 * 255.0f);
    }

    public void setTextColor(int i10) {
        org.telegram.ui.Components.q6 q6Var = this.d;
        q6Var.u(i10);
        if (!this.f4874s) {
            int m12 = org.telegram.ui.ActionBar.h6.m1(0.1f, q6Var.f30017a.getColor());
            int i11 = this.f4862b;
            this.f4873r.setBackground(org.telegram.ui.ActionBar.h6.Z(m12, i11, i11));
        }
    }

    public void setUseWrapContent(boolean z10) {
        this.v = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.K != drawable && this.d != drawable && this.f4867e != drawable && this.f4869f != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public d(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        this.f4862b = 8;
        is isVar = is.h;
        this.f4872n = new org.telegram.ui.Components.g6(350L, isVar);
        this.E = true;
        this.F = 0;
        this.H = 0.0f;
        this.M = 0.0f;
        this.P = 1.0f;
        this.V = 1.0f;
        this.W = true;
        this.f4865c0 = 255;
        this.f4874s = z10;
        this.f4860a = d6Var;
        w7.z5.b(this, 0.02f, 1.2f);
        View view = new View(context);
        this.f4873r = view;
        addView(view, w7.x5.d(-1.0f, -1));
        if (z10) {
            int dp = AndroidUtilities.dp(8.0f);
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
            this.f4877y = w02;
            setBackground(org.telegram.ui.ActionBar.h6.c0(dp, w02));
        }
        Paint paint = new Paint(1);
        this.f4864c = paint;
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sh, d6Var));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(true, true, false, false, true);
        this.d = q6Var;
        q6Var.n(0.3f, 250L, isVar);
        q6Var.setCallback(this);
        q6Var.w(AndroidUtilities.dp(14.0f));
        if (z10) {
            q6Var.x(AndroidUtilities.bold());
        }
        q6Var.f30019b = 1;
        org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(i(), true, false);
        this.f4867e = q6Var2;
        q6Var2.n(0.3f, 250L, isVar);
        q6Var2.setCallback(this);
        q6Var2.w(AndroidUtilities.dp(12.0f));
        q6Var2.f30019b = 1;
        org.telegram.ui.Components.q6 q6Var3 = new org.telegram.ui.Components.q6(false, false, true);
        this.f4869f = q6Var3;
        q6Var3.n(0.3f, 250L, isVar);
        q6Var3.setCallback(this);
        q6Var3.w(AndroidUtilities.dp(12.0f));
        q6Var3.x(AndroidUtilities.bold());
        q6Var3.t("", true, true);
        q6Var3.f30019b = 1;
        setWillNotDraw(false);
        j();
    }
}
