package hi;

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
import org.telegram.messenger.gd;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.sp;
import org.telegram.ui.nd;
public class d extends FrameLayout implements n80, org.telegram.ui.ActionBar.c6 {
    public int E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public int J;
    public fi.a6 K;
    public float L;
    public ValueAnimator M;
    public boolean N;
    public o80 O;
    public boolean P;
    public float Q;
    public boolean R;
    public ValueAnimator S;
    public boolean T;
    public float U;
    public ValueAnimator V;
    public int W;
    public org.telegram.ui.ActionBar.i6 f14331a;
    public boolean f14332a0;
    public int f14333b;
    public boolean f14334b0;
    public final Paint f14335c;
    public Drawable f14336c0;
    public final org.telegram.ui.Components.m6 d;
    public float f14337d0;
    public final org.telegram.ui.Components.m6 f14338e;
    public boolean f14339e0;
    public final org.telegram.ui.Components.m6 f14340f;
    public ValueAnimator f14341f0;
    public sp f14342g0;
    public float h;
    public int f14343h0;
    public boolean f14344i0;
    public int f14345j0;
    public boolean f14346k0;
    public int f14347l0;
    public final org.telegram.ui.Components.c6 f14348n;
    public final View f14349r;
    public boolean f14350s;
    public boolean f14351w;
    public boolean f14352x;
    public boolean f14353y;

    public d(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this(context, i6Var, true);
    }

    private int getWrapWidth() {
        float f10;
        float e10 = this.f14348n.e(false, this.h);
        if (this.f14334b0) {
            f10 = org.telegram.messenger.g0.L(12.0f);
        } else {
            f10 = 0.0f;
        }
        return getPaddingRight() + getPaddingLeft() + ((int) (b(this.f14340f.c() + org.telegram.messenger.g0.L(15.66f), e10) + this.d.c() + f10));
    }

    private void setRippleColor(int i7) {
        View view = this.f14349r;
        Drawable background = view.getBackground();
        if (background != null && this.H == i7) {
            return;
        }
        this.H = i7;
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(ColorStateList.valueOf(i7));
            return;
        }
        int i10 = this.f14333b;
        view.setBackground(org.telegram.ui.ActionBar.n6.a0(i7, i10, i10));
    }

    @Override
    public final boolean a() {
        return this.R;
    }

    public float b(float f10, float f11) {
        return f10 * f11;
    }

    public final void c(int i7, boolean z10) {
        float f10;
        int i10;
        org.telegram.ui.Components.m6 m6Var = this.f14340f;
        if (z10) {
            m6Var.a();
        }
        if (z10 && i7 != (i10 = this.W) && i7 > 0 && i10 > 0) {
            ValueAnimator valueAnimator = this.V;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.V = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.V = ofFloat;
            ofFloat.addUpdateListener(new b(this, 0));
            this.V.addListener(new c(this, 1));
            org.telegram.ui.Cells.c0.q(2.0f, this.V);
            this.V.setDuration(200L);
            this.V.start();
        }
        this.W = i7;
        if (i7 == 0 && !this.f14332a0) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.h = f10;
        m6Var.t(gd.E(i7, ' '), z10, true);
        invalidate();
    }

    public final void d() {
        int i7;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(this.f14333b), this.E);
        if (this.f14353y) {
            setBackground(d02);
            return;
        }
        if (this.f14352x) {
            i7 = org.telegram.ui.ActionBar.n6.f29599ob;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.Fi;
        }
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        org.telegram.ui.ActionBar.i6 i6Var = this.f14331a;
        setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(this, d02, M, null, i6Var);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    public final void e() {
        this.f14352x = true;
        setFilled(true);
        if (!this.f14353y) {
            this.E = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29599ob, this.f14331a);
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
        org.telegram.ui.Components.m6 m6Var = this.f14338e;
        if (z10) {
            m6Var.a();
        }
        setContentDescription(charSequence);
        invalidate();
        if (this.N && !z11) {
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.M = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L, 0.0f);
            this.M = ofFloat;
            ofFloat.addUpdateListener(new b(this, 3));
            this.M.addListener(new c(this, 0));
            this.M.setDuration(200L);
            this.M.setInterpolator(lr.f37208f);
            this.M.start();
        } else {
            m6Var.t(charSequence, z10, true);
        }
        if (!this.N && z11) {
            this.N = true;
            ValueAnimator valueAnimator2 = this.M;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.M = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.L, 1.0f);
            this.M = ofFloat2;
            ofFloat2.addUpdateListener(new b(this, 4));
            this.M.setDuration(200L);
            this.M.setInterpolator(lr.f37208f);
            this.M.start();
        }
    }

    public TextPaint getTextPaint() {
        return this.d.f37375a;
    }

    public final void h(CharSequence charSequence, boolean z10) {
        i(charSequence, false, true);
    }

    public final void i(CharSequence charSequence, boolean z10, boolean z11) {
        org.telegram.ui.Components.m6 m6Var = this.d;
        if (z10) {
            m6Var.a();
        }
        m6Var.t(charSequence, z10, z11);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override
    public final boolean isEnabled() {
        return this.f14339e0;
    }

    public boolean j() {
        return !(this instanceof nd);
    }

    public final void k() {
        this.f14334b0 = true;
        Drawable mutate = getContext().getDrawable(2131231930).mutate();
        this.f14336c0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(this.E, PorterDuff.Mode.SRC_IN));
    }

    public final void l() {
        this.f14344i0 = true;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int wrapWidth;
        boolean z10;
        float f10;
        float f11;
        int i7;
        float f12;
        float f13;
        float f14;
        this.f14349r.draw(canvas);
        int i10 = 0;
        if (this.P) {
            if (this.R) {
                if (this.O == null) {
                    o80 o80Var = new o80(this.f14331a);
                    this.O = o80Var;
                    o80Var.setCallback(this);
                    o80 o80Var2 = this.O;
                    o80Var2.f38029t = 2.0f;
                    o80Var2.D = true;
                    o80Var2.f38032x.setStrokeWidth(0.0f);
                    this.O.f(org.telegram.ui.ActionBar.n6.r1(0.02f, -1), org.telegram.ui.ActionBar.n6.r1(0.375f, -1));
                }
                o80 o80Var3 = this.O;
                o80Var3.f38014c = -1L;
                o80Var3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.O.k(this.f14333b);
                this.O.draw(canvas);
            } else {
                o80 o80Var4 = this.O;
                if (o80Var4 != null) {
                    o80Var4.a();
                    this.O.draw(canvas);
                    if (this.O.c()) {
                        this.O.f38013b = -1L;
                    }
                }
            }
        }
        int i11 = (this.Q > 0.0f ? 1 : (this.Q == 0.0f ? 0 : -1));
        org.telegram.ui.Components.m6 m6Var = this.d;
        if (i11 > 0) {
            if (this.f14342g0 == null) {
                this.f14342g0 = new sp(m6Var.f37375a.getColor());
            }
            if (this.T) {
                this.f14342g0.setBounds(0, 0, getWidth(), getHeight());
                this.f14342g0.setAlpha((int) (this.Q * 255.0f));
                float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, this.Q);
                canvas.save();
                canvas.scale(T1, T1, getWidth() / 2.0f, getHeight() / 2.0f);
                this.f14342g0.draw(canvas);
                canvas.restore();
            } else {
                int L = (int) ((1.0f - this.Q) * org.telegram.messenger.g0.L(24.0f));
                this.f14342g0.setBounds(0, L, getWidth(), getHeight() + L);
                this.f14342g0.setAlpha((int) (this.Q * 255.0f));
                this.f14342g0.draw(canvas);
            }
            invalidate();
        }
        float f15 = this.Q;
        if (f15 < 1.0f) {
            if (f15 != 0.0f) {
                canvas.save();
                if (this.T) {
                    float f16 = 1.0f - (this.Q * 0.2f);
                    canvas.scale(f16, f16, getWidth() / 2.0f, getHeight() / 2.0f);
                } else {
                    canvas.translate(0.0f, (int) (this.Q * org.telegram.messenger.g0.L(-24.0f)));
                    canvas.scale(1.0f, 1.0f - (this.Q * 0.4f));
                }
                z10 = true;
            } else {
                z10 = false;
            }
            float c10 = m6Var.c();
            float e10 = this.f14348n.e(false, this.h);
            if (this.f14334b0) {
                f10 = org.telegram.messenger.g0.L(12.0f);
            } else {
                f10 = 0.0f;
            }
            org.telegram.ui.Components.m6 m6Var2 = this.f14340f;
            float b10 = b(m6Var2.c() + org.telegram.messenger.g0.L(15.66f), e10) + c10 + f10;
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set((int) (((getMeasuredWidth() - b10) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - m6Var.f37381e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)), (int) org.telegram.messenger.f3.a(getMeasuredWidth() - b10, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + m6Var.f37381e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)));
            rect.offset(0, (int) ((-org.telegram.messenger.g0.L(7.0f)) * this.L));
            m6Var.C = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.f14337d0) * (1.0f - this.Q) * this.f14343h0);
            m6Var.setBounds(rect);
            m6Var.draw(canvas);
            if (this.N) {
                org.telegram.ui.Components.m6 m6Var3 = this.f14338e;
                b10 = m6Var3.c();
                rect.set((int) (((getMeasuredWidth() - b10) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - m6Var3.f37381e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)), (int) org.telegram.messenger.f3.a(getMeasuredWidth() - b10, getWidth(), 2.0f, b10), (int) (((getMeasuredHeight() + m6Var3.f37381e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)));
                rect.offset(0, org.telegram.messenger.g0.L(11.0f));
                canvas.save();
                float T12 = org.telegram.messenger.g0.T1(0.1f, 1.0f, this.L);
                canvas.scale(T12, T12, rect.centerX(), rect.bottom);
                m6Var3.C = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.f14337d0) * (1.0f - this.Q) * 200.0f * this.L);
                m6Var3.setBounds(rect);
                m6Var3.draw(canvas);
                canvas.restore();
            }
            float A = com.google.android.gms.internal.vision.e2.A(getMeasuredWidth(), b10, 2.0f, c10);
            if (this.I) {
                f11 = 5.0f;
            } else {
                f11 = 2.0f;
            }
            int L2 = (int) (A + org.telegram.messenger.g0.L(f11));
            int measuredHeight = (int) ((getMeasuredHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f);
            float A2 = com.google.android.gms.internal.vision.e2.A(getMeasuredWidth(), b10, 2.0f, c10);
            if (this.I) {
                i7 = 5;
            } else {
                i7 = 2;
            }
            rect.set(L2, measuredHeight, (int) (Math.max(org.telegram.messenger.g0.L(9.0f), m6Var2.c() + f10) + A2 + org.telegram.messenger.g0.L(i7 + 8)), (int) ((org.telegram.messenger.g0.L(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            if (this.U != 1.0f) {
                canvas.save();
                float f17 = this.U;
                canvas.scale(f17, f17, rect.centerX(), rect.centerY());
            }
            if (this.I) {
                float f18 = 1.0f - this.Q;
                f12 = 0.5f;
                float T13 = org.telegram.messenger.g0.T1(0.5f, 1.0f, this.f14337d0);
                Paint paint = this.f14335c;
                paint.setAlpha((int) (T13 * f18 * this.f14343h0 * e10 * e10));
                if (this.f14334b0) {
                    f14 = 4.0f;
                } else {
                    f14 = 10.0f;
                }
                float L3 = org.telegram.messenger.g0.L(f14);
                canvas.drawRoundRect(rectF, L3, L3, paint);
            } else {
                f12 = 0.5f;
            }
            CharSequence charSequence = m6Var2.f37384i;
            if (charSequence != null) {
                i10 = charSequence.length();
            }
            if (i10 > 1) {
                f13 = 0.3f;
            } else {
                f13 = 0.0f;
            }
            rect.offset(-org.telegram.messenger.g0.L(f13), -org.telegram.messenger.g0.L(0.4f));
            float A3 = org.telegram.messenger.f3.A(1.0f, this.Q, this.f14343h0, e10);
            if (this.I) {
                f12 = 1.0f;
            }
            m6Var2.C = (int) (A3 * f12);
            m6Var2.setBounds(rect);
            canvas.save();
            if (this.I && this.f14334b0) {
                this.f14336c0.setAlpha((int) ((1.0f - this.Q) * this.f14343h0 * e10 * 1.0f));
                this.f14336c0.setBounds(org.telegram.messenger.g0.L(1.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top, this.f14336c0.getIntrinsicWidth() + org.telegram.messenger.g0.L(1.0f) + rect.left, this.f14336c0.getIntrinsicHeight() + org.telegram.messenger.g0.L(2.0f) + rect.top);
                this.f14336c0.draw(canvas);
                canvas.translate(f10 / 2.0f, 0.0f);
            }
            m6Var2.draw(canvas);
            canvas.restore();
            if (this.U != 1.0f) {
                canvas.restore();
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (this.f14351w && this.f14347l0 != (wrapWidth = getWrapWidth())) {
            this.f14347l0 = wrapWidth;
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
        if (this.f14350s && isClickable() && getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onMeasure(int i7, int i10) {
        if (this.f14351w) {
            int wrapWidth = getWrapWidth();
            this.f14347l0 = wrapWidth;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(wrapWidth, View.MeasureSpec.getSize(i7)), 1073741824), i10);
            View view = this.f14349r;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            }
        } else if (this.f14346k0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(Math.max(this.d.c() + getPaddingLeft() + getPaddingRight(), this.f14345j0), View.MeasureSpec.getSize(i7)), 1073741824), i10);
        } else {
            super.onMeasure(i7, i10);
        }
    }

    public void setColor(int i7) {
        if (this.f14350s) {
            this.f14353y = true;
            int L = org.telegram.messenger.g0.L(this.f14333b);
            this.E = i7;
            setBackground(org.telegram.ui.ActionBar.n6.d0(L, i7));
            return;
        }
        this.F = true;
        this.d.u(i7);
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.1f, i7);
        int i10 = this.f14333b;
        this.f14349r.setBackground(org.telegram.ui.ActionBar.n6.a0(r12, i10, i10));
    }

    public void setCountFilled(boolean z10) {
        float f10;
        int color;
        this.I = z10;
        if (z10) {
            f10 = 12.0f;
        } else {
            f10 = 14.0f;
        }
        org.telegram.ui.Components.m6 m6Var = this.f14340f;
        m6Var.w(org.telegram.messenger.g0.L(f10));
        if (this.I) {
            color = this.E;
        } else {
            color = this.d.f37375a.getColor();
        }
        m6Var.u(color);
    }

    public void setCounterColor(int i7) {
        this.f14340f.u(i7);
        this.f14336c0.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public void setEnabled(boolean z10) {
        float f10;
        if (this.f14339e0 != z10) {
            ValueAnimator valueAnimator = this.f14341f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f14341f0 = null;
            }
            float f11 = this.f14337d0;
            this.f14339e0 = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f14341f0 = ofFloat;
            ofFloat.addUpdateListener(new b(this, 1));
            this.f14341f0.start();
        }
        super.setEnabled(z10);
    }

    public void setFilled(boolean z10) {
        if (this.f14350s == z10) {
            return;
        }
        this.f14350s = z10;
        org.telegram.ui.Components.m6 m6Var = this.d;
        if (z10) {
            d();
            m6Var.x(org.telegram.messenger.g0.o());
        } else {
            setBackground(null);
            m6Var.x(null);
        }
        updateColors();
    }

    public void setFlickeringLoading(boolean z10) {
        this.P = z10;
    }

    public void setGlobalAlpha(float f10) {
        this.f14343h0 = (int) (f10 * 255.0f);
    }

    @Override
    public void setLoading(boolean z10) {
        float f10;
        long j3;
        if (this.R != z10) {
            if (this.P) {
                this.R = z10;
                invalidate();
                return;
            }
            ValueAnimator valueAnimator = this.S;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.S = null;
            }
            float f11 = this.Q;
            this.R = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.S = ofFloat;
            ofFloat.addUpdateListener(new b(this, 2));
            this.S.addListener(new bi.d7(7, this, z10));
            ValueAnimator valueAnimator2 = this.S;
            if (this.T) {
                j3 = 240;
            } else {
                j3 = 320;
            }
            valueAnimator2.setDuration(j3);
            this.S.setInterpolator(lr.h);
            this.S.start();
        }
    }

    public void setMinWidth(int i7) {
        this.f14346k0 = true;
        this.f14345j0 = i7;
    }

    public void setRoundRadius(int i7) {
        this.f14333b = i7;
        if (this.f14350s) {
            d();
        } else {
            setBackground(null);
        }
        this.f14349r.setBackground(null);
        updateColors();
    }

    public void setScaleLoading(boolean z10) {
        this.T = z10;
    }

    public void setShowZero(boolean z10) {
        this.f14332a0 = z10;
    }

    public void setText(CharSequence charSequence) {
        i(charSequence, false, true);
    }

    public void setTextAlpha(float f10) {
        this.d.C = (int) (f10 * 255.0f);
    }

    public void setTextColor(int i7) {
        this.G = -1;
        this.F = true;
        org.telegram.ui.Components.m6 m6Var = this.d;
        m6Var.u(i7);
        if (!this.f14350s) {
            setRippleColor(org.telegram.ui.ActionBar.n6.r1(0.1f, m6Var.f37375a.getColor()));
        }
    }

    public void setTextColorKey(int i7) {
        this.G = i7;
        this.F = false;
        updateColors();
    }

    public void setUseWrapContent(boolean z10) {
        this.f14351w = z10;
    }

    @Override
    public void updateColors() {
        int i7;
        int i10;
        if (!this.f14353y) {
            if (this.f14352x) {
                i10 = org.telegram.ui.ActionBar.n6.f29599ob;
            } else {
                i10 = org.telegram.ui.ActionBar.n6.Fi;
            }
            this.E = org.telegram.ui.ActionBar.n6.w0(i10, this.f14331a);
        }
        boolean z10 = this.F;
        org.telegram.ui.Components.m6 m6Var = this.d;
        if (!z10) {
            int i11 = this.G;
            if (i11 < 0) {
                if (this.f14350s) {
                    if (this.f14352x) {
                        i11 = org.telegram.ui.ActionBar.n6.f29619pb;
                    } else {
                        i11 = org.telegram.ui.ActionBar.n6.Ji;
                    }
                } else {
                    i11 = org.telegram.ui.ActionBar.n6.Fi;
                }
            }
            m6Var.u(org.telegram.ui.ActionBar.n6.w0(i11, this.f14331a));
        }
        if (this.f14350s) {
            setRippleColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29486i6, this.f14331a));
        } else if (!this.F) {
            setRippleColor(org.telegram.ui.ActionBar.n6.r1(0.1f, m6Var.f37375a.getColor()));
        }
        if (!this.F) {
            if (this.f14350s) {
                if (this.f14352x) {
                    i7 = org.telegram.ui.ActionBar.n6.f29619pb;
                } else {
                    i7 = org.telegram.ui.ActionBar.n6.Ji;
                }
            } else {
                i7 = org.telegram.ui.ActionBar.n6.Fi;
            }
            this.f14338e.u(org.telegram.ui.ActionBar.n6.w0(i7, this.f14331a));
        }
        this.f14340f.u(this.E);
        this.f14335c.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ji, this.f14331a));
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.O != drawable && this.d != drawable && this.f14338e != drawable && this.f14340f != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public d(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        this.f14333b = 8;
        lr lrVar = lr.h;
        this.f14348n = new org.telegram.ui.Components.c6(350L, lrVar);
        this.G = -1;
        this.I = true;
        this.J = 0;
        this.L = 0.0f;
        this.Q = 0.0f;
        this.U = 1.0f;
        this.f14337d0 = 1.0f;
        this.f14339e0 = true;
        this.f14343h0 = 255;
        this.f14350s = z10;
        this.f14331a = i6Var;
        c8.ra.b(this, 0.02f, 1.2f);
        View view = new View(context);
        this.f14349r = view;
        addView(view, c8.ma.c(-1.0f, -1));
        if (z10) {
            int L = org.telegram.messenger.g0.L(8.0f);
            int i7 = org.telegram.ui.ActionBar.n6.Fi;
            int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
            this.E = w02;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, w02);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
            setBackground(d02);
            org.telegram.ui.ActionBar.u6.j(this, d02, M, null, i6Var);
        }
        Paint paint = new Paint(1);
        this.f14335c = paint;
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ji, i6Var));
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(true, true, false, false, true);
        this.d = m6Var;
        m6Var.n(0.3f, 250L, lrVar);
        m6Var.setCallback(this);
        m6Var.w(org.telegram.messenger.g0.L(14.0f));
        if (z10) {
            m6Var.x(org.telegram.messenger.g0.o());
        }
        m6Var.f37377b = 1;
        org.telegram.ui.Components.m6 m6Var2 = new org.telegram.ui.Components.m6(j(), true, false);
        this.f14338e = m6Var2;
        m6Var2.n(0.3f, 250L, lrVar);
        m6Var2.setCallback(this);
        m6Var2.w(org.telegram.messenger.g0.L(12.0f));
        m6Var2.f37377b = 1;
        org.telegram.ui.Components.m6 m6Var3 = new org.telegram.ui.Components.m6(false, false, true);
        this.f14340f = m6Var3;
        m6Var3.n(0.3f, 250L, lrVar);
        m6Var3.setCallback(this);
        m6Var3.w(org.telegram.messenger.g0.L(12.0f));
        m6Var3.x(org.telegram.messenger.g0.o());
        m6Var3.t("", true, true);
        m6Var3.f37377b = 1;
        setWillNotDraw(false);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
