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
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.lp;
import org.telegram.ui.nd;
public class d extends FrameLayout implements c80, org.telegram.ui.ActionBar.z5 {
    public int E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public int J;
    public fi.f6 K;
    public float L;
    public ValueAnimator M;
    public boolean N;
    public d80 O;
    public boolean P;
    public float Q;
    public boolean R;
    public ValueAnimator S;
    public float T;
    public ValueAnimator U;
    public int V;
    public boolean W;
    public org.telegram.ui.ActionBar.e6 f14050a;
    public boolean f14051a0;
    public int f14052b;
    public Drawable f14053b0;
    public final Paint f14054c;
    public float f14055c0;
    public final org.telegram.ui.Components.g6 d;
    public boolean f14056d0;
    public final org.telegram.ui.Components.g6 f14057e;
    public ValueAnimator f14058e0;
    public final org.telegram.ui.Components.g6 f14059f;
    public lp f14060f0;
    public int f14061g0;
    public float h;
    public boolean f14062h0;
    public int f14063i0;
    public boolean f14064j0;
    public int f14065k0;
    public final org.telegram.ui.Components.u5 f14066n;
    public final View f14067r;
    public boolean f14068s;
    public boolean f14069w;
    public boolean f14070x;
    public boolean f14071y;

    public d(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, e6Var, true);
    }

    private int getWrapWidth() {
        float f10;
        float e10 = this.f14066n.e(false, this.h);
        if (this.f14051a0) {
            f10 = org.telegram.messenger.g0.L(12.0f);
        } else {
            f10 = 0.0f;
        }
        return getPaddingRight() + getPaddingLeft() + ((int) (b(this.f14059f.c() + org.telegram.messenger.g0.L(15.66f), e10) + this.d.c() + f10));
    }

    private void setRippleColor(int i7) {
        View view = this.f14067r;
        Drawable background = view.getBackground();
        if (background != null && this.H == i7) {
            return;
        }
        this.H = i7;
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(ColorStateList.valueOf(i7));
            return;
        }
        int i10 = this.f14052b;
        view.setBackground(org.telegram.ui.ActionBar.j6.a0(i7, i10, i10));
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
        org.telegram.ui.Components.g6 g6Var = this.f14059f;
        if (z10) {
            g6Var.a();
        }
        if (z10 && i7 != (i10 = this.V) && i7 > 0 && i10 > 0) {
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.U = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.U = ofFloat;
            ofFloat.addUpdateListener(new b(this, 0));
            this.U.addListener(new c(this, 1));
            i20.k(2.0f, this.U);
            this.U.setDuration(200L);
            this.U.start();
        }
        this.V = i7;
        if (i7 == 0 && !this.W) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.h = f10;
        g6Var.t(hd.E(i7, ' '), z10, true);
        invalidate();
    }

    public final void d() {
        int i7;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(this.f14052b), this.E);
        if (this.f14071y) {
            setBackground(d02);
            return;
        }
        if (this.f14070x) {
            i7 = org.telegram.ui.ActionBar.j6.f29054ob;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.Fi;
        }
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        org.telegram.ui.ActionBar.e6 e6Var = this.f14050a;
        setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(this, d02, M, null, e6Var);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    public final void e() {
        this.f14070x = true;
        setFilled(true);
        if (!this.f14071y) {
            this.E = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29054ob, this.f14050a);
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
        org.telegram.ui.Components.g6 g6Var = this.f14057e;
        if (z10) {
            g6Var.a();
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
            this.M.setInterpolator(er.f34420f);
            this.M.start();
        } else {
            g6Var.t(charSequence, z10, true);
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
            this.M.setInterpolator(er.f34420f);
            this.M.start();
        }
    }

    public TextPaint getTextPaint() {
        return this.d.f34827a;
    }

    public final void h(CharSequence charSequence, boolean z10) {
        i(charSequence, false, true);
    }

    public final void i(CharSequence charSequence, boolean z10, boolean z11) {
        org.telegram.ui.Components.g6 g6Var = this.d;
        if (z10) {
            g6Var.a();
        }
        g6Var.t(charSequence, z10, z11);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override
    public final boolean isEnabled() {
        return this.f14056d0;
    }

    public boolean j() {
        return !(this instanceof nd);
    }

    public final void k() {
        this.f14051a0 = true;
        Drawable mutate = getContext().getDrawable(2131231929).mutate();
        this.f14053b0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(this.E, PorterDuff.Mode.SRC_IN));
    }

    public final void l() {
        this.f14062h0 = true;
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
        this.f14067r.draw(canvas);
        int i10 = 0;
        if (this.P) {
            if (this.R) {
                if (this.O == null) {
                    d80 d80Var = new d80(this.f14050a);
                    this.O = d80Var;
                    d80Var.setCallback(this);
                    d80 d80Var2 = this.O;
                    d80Var2.f33881t = 2.0f;
                    d80Var2.D = true;
                    d80Var2.f33884x.setStrokeWidth(0.0f);
                    this.O.f(org.telegram.ui.ActionBar.j6.r1(0.02f, -1), org.telegram.ui.ActionBar.j6.r1(0.375f, -1));
                }
                d80 d80Var3 = this.O;
                d80Var3.f33866c = -1L;
                d80Var3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.O.k(this.f14052b);
                this.O.draw(canvas);
            } else {
                d80 d80Var4 = this.O;
                if (d80Var4 != null) {
                    d80Var4.a();
                    this.O.draw(canvas);
                    if (this.O.c()) {
                        this.O.f33865b = -1L;
                    }
                }
            }
        }
        int i11 = (this.Q > 0.0f ? 1 : (this.Q == 0.0f ? 0 : -1));
        org.telegram.ui.Components.g6 g6Var = this.d;
        if (i11 > 0) {
            if (this.f14060f0 == null) {
                this.f14060f0 = new lp(g6Var.f34827a.getColor());
            }
            int L = (int) ((1.0f - this.Q) * org.telegram.messenger.g0.L(24.0f));
            this.f14060f0.setBounds(0, L, getWidth(), getHeight() + L);
            this.f14060f0.setAlpha((int) (this.Q * 255.0f));
            this.f14060f0.draw(canvas);
            invalidate();
        }
        float f15 = this.Q;
        if (f15 < 1.0f) {
            if (f15 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.Q * org.telegram.messenger.g0.L(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.Q * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float c10 = g6Var.c();
            float e10 = this.f14066n.e(false, this.h);
            if (this.f14051a0) {
                f10 = org.telegram.messenger.g0.L(12.0f);
            } else {
                f10 = 0.0f;
            }
            org.telegram.ui.Components.g6 g6Var2 = this.f14059f;
            float b10 = b(g6Var2.c() + org.telegram.messenger.g0.L(15.66f), e10) + c10 + f10;
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set((int) (((getMeasuredWidth() - b10) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - g6Var.f34833e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)), (int) org.telegram.messenger.k5.a(getMeasuredWidth() - b10, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + g6Var.f34833e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)));
            rect.offset(0, (int) ((-org.telegram.messenger.g0.L(7.0f)) * this.L));
            g6Var.C = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.f14055c0) * (1.0f - this.Q) * this.f14061g0);
            g6Var.setBounds(rect);
            g6Var.draw(canvas);
            if (this.N) {
                org.telegram.ui.Components.g6 g6Var3 = this.f14057e;
                b10 = g6Var3.c();
                rect.set((int) (((getMeasuredWidth() - b10) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - g6Var3.f34833e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)), (int) org.telegram.messenger.k5.a(getMeasuredWidth() - b10, getWidth(), 2.0f, b10), (int) (((getMeasuredHeight() + g6Var3.f34833e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)));
                rect.offset(0, org.telegram.messenger.g0.L(11.0f));
                canvas.save();
                float T1 = org.telegram.messenger.g0.T1(0.1f, 1.0f, this.L);
                canvas.scale(T1, T1, rect.centerX(), rect.bottom);
                g6Var3.C = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.f14055c0) * (1.0f - this.Q) * 200.0f * this.L);
                g6Var3.setBounds(rect);
                g6Var3.draw(canvas);
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
            rect.set(L2, measuredHeight, (int) (Math.max(org.telegram.messenger.g0.L(9.0f), g6Var2.c() + f10) + A2 + org.telegram.messenger.g0.L(i7 + 8)), (int) ((org.telegram.messenger.g0.L(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            if (this.T != 1.0f) {
                canvas.save();
                float f16 = this.T;
                canvas.scale(f16, f16, rect.centerX(), rect.centerY());
            }
            if (this.I) {
                float f17 = 1.0f - this.Q;
                f12 = 0.5f;
                float T12 = org.telegram.messenger.g0.T1(0.5f, 1.0f, this.f14055c0);
                Paint paint = this.f14054c;
                paint.setAlpha((int) (T12 * f17 * this.f14061g0 * e10 * e10));
                if (this.f14051a0) {
                    f14 = 4.0f;
                } else {
                    f14 = 10.0f;
                }
                float L3 = org.telegram.messenger.g0.L(f14);
                canvas.drawRoundRect(rectF, L3, L3, paint);
            } else {
                f12 = 0.5f;
            }
            CharSequence charSequence = g6Var2.f34836i;
            if (charSequence != null) {
                i10 = charSequence.length();
            }
            if (i10 > 1) {
                f13 = 0.3f;
            } else {
                f13 = 0.0f;
            }
            rect.offset(-org.telegram.messenger.g0.L(f13), -org.telegram.messenger.g0.L(0.4f));
            float A3 = org.telegram.messenger.k5.A(1.0f, this.Q, this.f14061g0, e10);
            if (this.I) {
                f12 = 1.0f;
            }
            g6Var2.C = (int) (A3 * f12);
            g6Var2.setBounds(rect);
            canvas.save();
            if (this.I && this.f14051a0) {
                this.f14053b0.setAlpha((int) ((1.0f - this.Q) * this.f14061g0 * e10 * 1.0f));
                this.f14053b0.setBounds(org.telegram.messenger.g0.L(1.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top, this.f14053b0.getIntrinsicWidth() + org.telegram.messenger.g0.L(1.0f) + rect.left, this.f14053b0.getIntrinsicHeight() + org.telegram.messenger.g0.L(2.0f) + rect.top);
                this.f14053b0.draw(canvas);
                canvas.translate(f10 / 2.0f, 0.0f);
            }
            g6Var2.draw(canvas);
            canvas.restore();
            if (this.T != 1.0f) {
                canvas.restore();
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (this.f14069w && this.f14065k0 != (wrapWidth = getWrapWidth())) {
            this.f14065k0 = wrapWidth;
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
        if (this.f14068s && isClickable() && getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onMeasure(int i7, int i10) {
        if (this.f14069w) {
            int wrapWidth = getWrapWidth();
            this.f14065k0 = wrapWidth;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(wrapWidth, View.MeasureSpec.getSize(i7)), 1073741824), i10);
            View view = this.f14067r;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            }
        } else if (this.f14064j0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(Math.max(this.d.c() + getPaddingLeft() + getPaddingRight(), this.f14063i0), View.MeasureSpec.getSize(i7)), 1073741824), i10);
        } else {
            super.onMeasure(i7, i10);
        }
    }

    public void setColor(int i7) {
        if (this.f14068s) {
            this.f14071y = true;
            int L = org.telegram.messenger.g0.L(this.f14052b);
            this.E = i7;
            setBackground(org.telegram.ui.ActionBar.j6.d0(L, i7));
            return;
        }
        this.F = true;
        this.d.u(i7);
        int r12 = org.telegram.ui.ActionBar.j6.r1(0.1f, i7);
        int i10 = this.f14052b;
        this.f14067r.setBackground(org.telegram.ui.ActionBar.j6.a0(r12, i10, i10));
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
        org.telegram.ui.Components.g6 g6Var = this.f14059f;
        g6Var.w(org.telegram.messenger.g0.L(f10));
        if (this.I) {
            color = this.E;
        } else {
            color = this.d.f34827a.getColor();
        }
        g6Var.u(color);
    }

    public void setCounterColor(int i7) {
        this.f14059f.u(i7);
        this.f14053b0.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public void setEnabled(boolean z10) {
        float f10;
        if (this.f14056d0 != z10) {
            ValueAnimator valueAnimator = this.f14058e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f14058e0 = null;
            }
            float f11 = this.f14055c0;
            this.f14056d0 = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f14058e0 = ofFloat;
            ofFloat.addUpdateListener(new b(this, 1));
            this.f14058e0.start();
        }
        super.setEnabled(z10);
    }

    public void setFilled(boolean z10) {
        if (this.f14068s == z10) {
            return;
        }
        this.f14068s = z10;
        org.telegram.ui.Components.g6 g6Var = this.d;
        if (z10) {
            d();
            g6Var.x(org.telegram.messenger.g0.o());
        } else {
            setBackground(null);
            g6Var.x(null);
        }
        updateColors();
    }

    public void setFlickeringLoading(boolean z10) {
        this.P = z10;
    }

    public void setGlobalAlpha(float f10) {
        this.f14061g0 = (int) (f10 * 255.0f);
    }

    @Override
    public void setLoading(boolean z10) {
        float f10;
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
            this.S.addListener(new bi.v4(7, this, z10));
            this.S.setDuration(320L);
            this.S.setInterpolator(er.h);
            this.S.start();
        }
    }

    public void setMinWidth(int i7) {
        this.f14064j0 = true;
        this.f14063i0 = i7;
    }

    public void setRoundRadius(int i7) {
        this.f14052b = i7;
        if (this.f14068s) {
            d();
        } else {
            setBackground(null);
        }
        this.f14067r.setBackground(null);
        updateColors();
    }

    public void setShowZero(boolean z10) {
        this.W = z10;
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
        org.telegram.ui.Components.g6 g6Var = this.d;
        g6Var.u(i7);
        if (!this.f14068s) {
            setRippleColor(org.telegram.ui.ActionBar.j6.r1(0.1f, g6Var.f34827a.getColor()));
        }
    }

    public void setTextColorKey(int i7) {
        this.G = i7;
        this.F = false;
        updateColors();
    }

    public void setUseWrapContent(boolean z10) {
        this.f14069w = z10;
    }

    @Override
    public void updateColors() {
        int i7;
        int i10;
        if (!this.f14071y) {
            if (this.f14070x) {
                i10 = org.telegram.ui.ActionBar.j6.f29054ob;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.Fi;
            }
            this.E = org.telegram.ui.ActionBar.j6.w0(i10, this.f14050a);
        }
        boolean z10 = this.F;
        org.telegram.ui.Components.g6 g6Var = this.d;
        if (!z10) {
            int i11 = this.G;
            if (i11 < 0) {
                if (this.f14068s) {
                    if (this.f14070x) {
                        i11 = org.telegram.ui.ActionBar.j6.f29074pb;
                    } else {
                        i11 = org.telegram.ui.ActionBar.j6.Ji;
                    }
                } else {
                    i11 = org.telegram.ui.ActionBar.j6.Fi;
                }
            }
            g6Var.u(org.telegram.ui.ActionBar.j6.w0(i11, this.f14050a));
        }
        if (this.f14068s) {
            setRippleColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, this.f14050a));
        } else if (!this.F) {
            setRippleColor(org.telegram.ui.ActionBar.j6.r1(0.1f, g6Var.f34827a.getColor()));
        }
        if (!this.F) {
            if (this.f14068s) {
                if (this.f14070x) {
                    i7 = org.telegram.ui.ActionBar.j6.f29074pb;
                } else {
                    i7 = org.telegram.ui.ActionBar.j6.Ji;
                }
            } else {
                i7 = org.telegram.ui.ActionBar.j6.Fi;
            }
            this.f14057e.u(org.telegram.ui.ActionBar.j6.w0(i7, this.f14050a));
        }
        this.f14059f.u(this.E);
        this.f14054c.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ji, this.f14050a));
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.O != drawable && this.d != drawable && this.f14057e != drawable && this.f14059f != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public d(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.f14052b = 8;
        er erVar = er.h;
        this.f14066n = new org.telegram.ui.Components.u5(350L, erVar);
        this.G = -1;
        this.I = true;
        this.J = 0;
        this.L = 0.0f;
        this.Q = 0.0f;
        this.T = 1.0f;
        this.f14055c0 = 1.0f;
        this.f14056d0 = true;
        this.f14061g0 = 255;
        this.f14068s = z10;
        this.f14050a = e6Var;
        c8.na.b(this, 0.02f, 1.2f);
        View view = new View(context);
        this.f14067r = view;
        addView(view, c8.ja.c(-1.0f, -1));
        if (z10) {
            int L = org.telegram.messenger.g0.L(8.0f);
            int i7 = org.telegram.ui.ActionBar.j6.Fi;
            int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
            this.E = w02;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, w02);
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
            setBackground(d02);
            org.telegram.ui.ActionBar.q6.j(this, d02, M, null, e6Var);
        }
        Paint paint = new Paint(1);
        this.f14054c = paint;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ji, e6Var));
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(true, true, false, false, true);
        this.d = g6Var;
        g6Var.n(0.3f, 250L, erVar);
        g6Var.setCallback(this);
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        if (z10) {
            g6Var.x(org.telegram.messenger.g0.o());
        }
        g6Var.f34829b = 1;
        org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(j(), true, false);
        this.f14057e = g6Var2;
        g6Var2.n(0.3f, 250L, erVar);
        g6Var2.setCallback(this);
        g6Var2.w(org.telegram.messenger.g0.L(12.0f));
        g6Var2.f34829b = 1;
        org.telegram.ui.Components.g6 g6Var3 = new org.telegram.ui.Components.g6(false, false, true);
        this.f14059f = g6Var3;
        g6Var3.n(0.3f, 250L, erVar);
        g6Var3.setCallback(this);
        g6Var3.w(org.telegram.messenger.g0.L(12.0f));
        g6Var3.x(org.telegram.messenger.g0.o());
        g6Var3.t("", true, true);
        g6Var3.f34829b = 1;
        setWillNotDraw(false);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
