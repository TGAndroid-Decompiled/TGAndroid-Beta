package defpackage;

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
public class c51 extends FrameLayout implements ka6, snb {
    public int E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public int J;
    public z21 K;
    public float L;
    public ValueAnimator M;
    public boolean N;
    public va6 O;
    public boolean P;
    public float Q;
    public boolean R;
    public ValueAnimator S;
    public boolean T;
    public float U;
    public ValueAnimator V;
    public int W;
    public vnb a;
    public boolean a0;
    public int b;
    public boolean b0;
    public final Paint c;
    public Drawable c0;
    public final hn d;
    public float d0;
    public final hn e;
    public boolean e0;
    public final hn f;
    public ValueAnimator f0;
    public di2 g0;
    public float h;
    public int h0;
    public boolean i0;
    public int j0;
    public boolean k0;
    public int l0;
    public final mm n;
    public final View r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    public c51(vnb vnbVar, Context context, boolean z) {
        super(context);
        this.b = 8;
        k43 k43Var = k43.h;
        this.n = new mm(350L, k43Var);
        this.G = -1;
        this.I = true;
        this.J = 0;
        this.L = 0.0f;
        this.Q = 0.0f;
        this.U = 1.0f;
        this.d0 = 1.0f;
        this.e0 = true;
        this.h0 = 255;
        this.s = z;
        this.a = vnbVar;
        iye.b(this, 0.02f, 1.2f);
        View view = new View(context);
        this.r = view;
        addView(view, tre.c(-1.0f, -1));
        if (z) {
            int L = hl.L(8.0f);
            int i = aob.Fi;
            int v0 = aob.v0(i, vnbVar);
            this.E = v0;
            ShapeDrawable b0 = aob.b0(L, v0);
            uob M = yob.M(i);
            setBackground(b0);
            yob.j(this, b0, M, null, vnbVar);
        }
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(aob.v0(aob.Ji, vnbVar));
        hn hnVar = new hn(true, true, false, false, true);
        this.d = hnVar;
        hnVar.n(0.3f, 250L, k43Var);
        hnVar.setCallback(this);
        hnVar.w(hl.L(14.0f));
        if (z) {
            hnVar.x(hl.o());
        }
        hnVar.b = 1;
        hn hnVar2 = new hn(j(), true, false);
        this.e = hnVar2;
        hnVar2.n(0.3f, 250L, k43Var);
        hnVar2.setCallback(this);
        hnVar2.w(hl.L(12.0f));
        hnVar2.b = 1;
        hn hnVar3 = new hn(false, false, true);
        this.f = hnVar3;
        hnVar3.n(0.3f, 250L, k43Var);
        hnVar3.setCallback(this);
        hnVar3.w(hl.L(12.0f));
        hnVar3.x(hl.o());
        hnVar3.t("", true, true);
        hnVar3.b = 1;
        setWillNotDraw(false);
        updateColors();
    }

    private int getWrapWidth() {
        float f;
        float e = this.n.e(false, this.h);
        if (this.b0) {
            f = hl.L(12.0f);
        } else {
            f = 0.0f;
        }
        return getPaddingRight() + getPaddingLeft() + ((int) (b(this.f.c() + hl.L(15.66f), e) + this.d.c() + f));
    }

    private void setRippleColor(int i) {
        View view = this.r;
        Drawable background = view.getBackground();
        if (background != null && this.H == i) {
            return;
        }
        this.H = i;
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(ColorStateList.valueOf(i));
            return;
        }
        int i2 = this.b;
        view.setBackground(aob.Y(i, i2, i2));
    }

    @Override
    public final boolean a() {
        return this.R;
    }

    public float b(float f, float f2) {
        return f * f2;
    }

    public final void c(int i, boolean z) {
        float f;
        hn hnVar = this.f;
        if (z) {
            hnVar.a();
            int i2 = this.W;
            if (i != i2 && i > 0 && i2 > 0) {
                ValueAnimator valueAnimator = this.V;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.V = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.V = ofFloat;
                ofFloat.addUpdateListener(new a51(this, (byte) 0));
                this.V.addListener(new b51(this, (byte) 1));
                c00.o(2.0f, this.V);
                this.V.setDuration(200L);
                this.V.start();
            }
        }
        this.W = i;
        if (i == 0 && !this.a0) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        this.h = f;
        hnVar.t(ob6.E(i, ' '), z, true);
        invalidate();
    }

    public final void d() {
        int i;
        ShapeDrawable b0 = aob.b0(hl.L(this.b), this.E);
        if (this.y) {
            setBackground(b0);
            return;
        }
        if (this.x) {
            i = aob.ob;
        } else {
            i = aob.Fi;
        }
        uob M = yob.M(i);
        vnb vnbVar = this.a;
        setBackground(b0);
        yob.j(this, b0, M, null, vnbVar);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return false;
    }

    public final void e() {
        this.x = true;
        setFilled(true);
        if (!this.y) {
            this.E = aob.v0(aob.ob, this.a);
            d();
        }
        updateColors();
    }

    public final void f() {
        setRoundRadius(24);
    }

    public final void g(CharSequence charSequence, boolean z) {
        boolean z2;
        if (charSequence != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        hn hnVar = this.e;
        if (z) {
            hnVar.a();
        }
        setContentDescription(charSequence);
        invalidate();
        if (this.N && !z2) {
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.M = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L, 0.0f);
            this.M = ofFloat;
            ofFloat.addUpdateListener(new a51(this, (byte) 3));
            this.M.addListener(new b51(this, (byte) 0));
            this.M.setDuration(200L);
            this.M.setInterpolator(k43.f);
            this.M.start();
        } else {
            hnVar.t(charSequence, z, true);
        }
        if (!this.N && z2) {
            this.N = true;
            ValueAnimator valueAnimator2 = this.M;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.M = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.L, 1.0f);
            this.M = ofFloat2;
            ofFloat2.addUpdateListener(new a51(this, (byte) 4));
            this.M.setDuration(200L);
            this.M.setInterpolator(k43.f);
            this.M.start();
        }
    }

    public TextPaint getTextPaint() {
        return this.d.a;
    }

    public final void h(CharSequence charSequence, boolean z) {
        i(charSequence, false, true);
    }

    public final void i(CharSequence charSequence, boolean z, boolean z2) {
        hn hnVar = this.d;
        if (z) {
            hnVar.a();
        }
        hnVar.t(charSequence, z, z2);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override
    public final boolean isEnabled() {
        return this.e0;
    }

    public boolean j() {
        return !(this instanceof xi1);
    }

    public final void k() {
        this.b0 = true;
        Drawable mutate = getContext().getDrawable(2131231933).mutate();
        this.c0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(this.E, PorterDuff.Mode.SRC_IN));
    }

    public final void l() {
        this.i0 = true;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int wrapWidth;
        boolean z;
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        float f5;
        this.r.draw(canvas);
        int i2 = 0;
        if (this.P) {
            boolean z2 = this.R;
            va6 va6Var = this.O;
            if (z2) {
                if (va6Var == null) {
                    va6 va6Var2 = new va6(this.a);
                    this.O = va6Var2;
                    va6Var2.setCallback(this);
                    va6 va6Var3 = this.O;
                    va6Var3.t = 2.0f;
                    va6Var3.D = true;
                    va6Var3.x.setStrokeWidth(0.0f);
                    this.O.f(aob.p1(0.02f, -1), aob.p1(0.375f, -1));
                }
                va6 va6Var4 = this.O;
                va6Var4.c = -1L;
                va6Var4.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.O.j(this.b);
                this.O.draw(canvas);
            } else if (va6Var != null) {
                va6Var.a();
                this.O.draw(canvas);
                if (this.O.c()) {
                    this.O.b = -1L;
                }
            }
        }
        int i3 = (this.Q > 0.0f ? 1 : (this.Q == 0.0f ? 0 : -1));
        hn hnVar = this.d;
        if (i3 > 0) {
            di2 di2Var = this.g0;
            if (di2Var == null) {
                di2Var = new di2(hnVar.a.getColor());
                this.g0 = di2Var;
            }
            if (this.T) {
                di2Var.setBounds(0, 0, getWidth(), getHeight());
                this.g0.setAlpha((int) (this.Q * 255.0f));
                float R1 = hl.R1(0.6f, 1.0f, this.Q);
                canvas.save();
                canvas.scale(R1, R1, getWidth() / 2.0f, getHeight() / 2.0f);
                this.g0.draw(canvas);
                canvas.restore();
            } else {
                int L = (int) ((1.0f - this.Q) * hl.L(24.0f));
                this.g0.setBounds(0, L, getWidth(), getHeight() + L);
                this.g0.setAlpha((int) (this.Q * 255.0f));
                this.g0.draw(canvas);
            }
            invalidate();
        }
        float f6 = this.Q;
        if (f6 < 1.0f) {
            if (f6 != 0.0f) {
                canvas.save();
                boolean z3 = this.T;
                float f7 = this.Q;
                if (z3) {
                    float f8 = 1.0f - (f7 * 0.2f);
                    canvas.scale(f8, f8, getWidth() / 2.0f, getHeight() / 2.0f);
                } else {
                    canvas.translate(0.0f, (int) (f7 * hl.L(-24.0f)));
                    canvas.scale(1.0f, 1.0f - (this.Q * 0.4f));
                }
                z = true;
            } else {
                z = false;
            }
            float c = hnVar.c();
            float e = this.n.e(false, this.h);
            if (this.b0) {
                f = hl.L(12.0f);
            } else {
                f = 0.0f;
            }
            hn hnVar2 = this.f;
            float b = b(hnVar2.c() + hl.L(15.66f), e) + c + f;
            Rect rect = hl.Q;
            rect.set((int) (((getMeasuredWidth() - b) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - hnVar.e) / 2.0f) - hl.L(1.0f)), (int) qd4.e(getMeasuredWidth() - b, getWidth(), 2.0f, c), (int) (((getMeasuredHeight() + hnVar.e) / 2.0f) - hl.L(1.0f)));
            rect.offset(0, (int) ((-hl.L(7.0f)) * this.L));
            hnVar.C = (int) (hl.R1(0.5f, 1.0f, this.d0) * (1.0f - this.Q) * this.h0);
            hnVar.setBounds(rect);
            hnVar.draw(canvas);
            if (this.N) {
                hn hnVar3 = this.e;
                b = hnVar3.c();
                rect.set((int) (((getMeasuredWidth() - b) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - hnVar3.e) / 2.0f) - hl.L(1.0f)), (int) qd4.e(getMeasuredWidth() - b, getWidth(), 2.0f, b), (int) (((getMeasuredHeight() + hnVar3.e) / 2.0f) - hl.L(1.0f)));
                rect.offset(0, hl.L(11.0f));
                canvas.save();
                float R12 = hl.R1(0.1f, 1.0f, this.L);
                canvas.scale(R12, R12, rect.centerX(), rect.bottom);
                hnVar3.C = (int) (hl.R1(0.5f, 1.0f, this.d0) * (1.0f - this.Q) * 200.0f * this.L);
                hnVar3.setBounds(rect);
                hnVar3.draw(canvas);
                canvas.restore();
            }
            float z4 = bp1.z(getMeasuredWidth(), b, 2.0f, c);
            if (this.I) {
                f2 = 5.0f;
            } else {
                f2 = 2.0f;
            }
            int L2 = (int) (z4 + hl.L(f2));
            int measuredHeight = (int) ((getMeasuredHeight() - hl.L(18.0f)) / 2.0f);
            float z5 = bp1.z(getMeasuredWidth(), b, 2.0f, c);
            if (this.I) {
                i = 5;
            } else {
                i = 2;
            }
            rect.set(L2, measuredHeight, (int) (Math.max(hl.L(9.0f), hnVar2.c() + f) + z5 + hl.L(i + 8)), (int) ((hl.L(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = hl.P;
            rectF.set(rect);
            if (this.U != 1.0f) {
                canvas.save();
                float f9 = this.U;
                canvas.scale(f9, f9, rect.centerX(), rect.centerY());
            }
            if (this.I) {
                float f10 = 1.0f - this.Q;
                f3 = 0.5f;
                float R13 = hl.R1(0.5f, 1.0f, this.d0);
                Paint paint = this.c;
                paint.setAlpha((int) (R13 * f10 * this.h0 * e * e));
                if (this.b0) {
                    f5 = 4.0f;
                } else {
                    f5 = 10.0f;
                }
                float L3 = hl.L(f5);
                canvas.drawRoundRect(rectF, L3, L3, paint);
            } else {
                f3 = 0.5f;
            }
            CharSequence charSequence = hnVar2.i;
            if (charSequence != null) {
                i2 = charSequence.length();
            }
            if (i2 > 1) {
                f4 = 0.3f;
            } else {
                f4 = 0.0f;
            }
            rect.offset(-hl.L(f4), -hl.L(0.4f));
            float z6 = qd4.z(1.0f, this.Q, this.h0, e);
            if (this.I) {
                f3 = 1.0f;
            }
            hnVar2.C = (int) (z6 * f3);
            hnVar2.setBounds(rect);
            canvas.save();
            if (this.I && this.b0) {
                this.c0.setAlpha((int) ((1.0f - this.Q) * this.h0 * e * 1.0f));
                this.c0.setBounds(hl.L(1.0f) + rect.left, hl.L(2.0f) + rect.top, this.c0.getIntrinsicWidth() + hl.L(1.0f) + rect.left, this.c0.getIntrinsicHeight() + hl.L(2.0f) + rect.top);
                this.c0.draw(canvas);
                canvas.translate(f / 2.0f, 0.0f);
            }
            hnVar2.draw(canvas);
            canvas.restore();
            if (this.U != 1.0f) {
                canvas.restore();
            }
            if (z) {
                canvas.restore();
            }
        }
        if (this.w && this.l0 != (wrapWidth = getWrapWidth())) {
            this.l0 = wrapWidth;
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
        if (this.s && isClickable() && getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onMeasure(int i, int i2) {
        if (this.w) {
            int wrapWidth = getWrapWidth();
            this.l0 = wrapWidth;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(wrapWidth, View.MeasureSpec.getSize(i)), 1073741824), i2);
            View view = this.r;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            }
        } else if (this.k0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(Math.max(this.d.c() + getPaddingLeft() + getPaddingRight(), this.j0), View.MeasureSpec.getSize(i)), 1073741824), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setColor(int i) {
        if (this.s) {
            this.y = true;
            int L = hl.L(this.b);
            this.E = i;
            setBackground(aob.b0(L, i));
            return;
        }
        this.F = true;
        this.d.u(i);
        int p1 = aob.p1(0.1f, i);
        int i2 = this.b;
        this.r.setBackground(aob.Y(p1, i2, i2));
    }

    public void setCountFilled(boolean z) {
        float f;
        int color;
        this.I = z;
        if (z) {
            f = 12.0f;
        } else {
            f = 14.0f;
        }
        hn hnVar = this.f;
        hnVar.w(hl.L(f));
        if (this.I) {
            color = this.E;
        } else {
            color = this.d.a.getColor();
        }
        hnVar.u(color);
    }

    public void setCounterColor(int i) {
        this.f.u(i);
        this.c0.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public void setEnabled(boolean z) {
        float f;
        if (this.e0 != z) {
            ValueAnimator valueAnimator = this.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f0 = null;
            }
            float f2 = this.d0;
            this.e0 = z;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.f0 = ofFloat;
            ofFloat.addUpdateListener(new a51(this, (byte) 1));
            this.f0.start();
        }
        super.setEnabled(z);
    }

    public void setFilled(boolean z) {
        if (this.s == z) {
            return;
        }
        this.s = z;
        hn hnVar = this.d;
        if (z) {
            d();
            hnVar.x(hl.o());
        } else {
            setBackground(null);
            hnVar.x(null);
        }
        updateColors();
    }

    public void setFlickeringLoading(boolean z) {
        this.P = z;
    }

    public void setGlobalAlpha(float f) {
        this.h0 = (int) (f * 255.0f);
    }

    @Override
    public void setLoading(boolean z) {
        float f;
        long j;
        if (this.R != z) {
            if (this.P) {
                this.R = z;
                invalidate();
                return;
            }
            ValueAnimator valueAnimator = this.S;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.S = null;
            }
            float f2 = this.Q;
            this.R = z;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.S = ofFloat;
            ofFloat.addUpdateListener(new a51(this, (byte) 2));
            this.S.addListener(new z7((byte) 10, this, z));
            ValueAnimator valueAnimator2 = this.S;
            if (this.T) {
                j = 240;
            } else {
                j = 320;
            }
            valueAnimator2.setDuration(j);
            this.S.setInterpolator(k43.h);
            this.S.start();
        }
    }

    public void setMinWidth(int i) {
        this.k0 = true;
        this.j0 = i;
    }

    public void setRoundRadius(int i) {
        this.b = i;
        if (this.s) {
            d();
        } else {
            setBackground(null);
        }
        this.r.setBackground(null);
        updateColors();
    }

    public void setScaleLoading(boolean z) {
        this.T = z;
    }

    public void setShowZero(boolean z) {
        this.a0 = z;
    }

    public void setText(CharSequence charSequence) {
        i(charSequence, false, true);
    }

    public void setTextAlpha(float f) {
        this.d.C = (int) (f * 255.0f);
    }

    public void setTextColor(int i) {
        this.G = -1;
        this.F = true;
        hn hnVar = this.d;
        hnVar.u(i);
        if (!this.s) {
            setRippleColor(aob.p1(0.1f, hnVar.a.getColor()));
        }
    }

    public void setTextColorKey(int i) {
        this.G = i;
        this.F = false;
        updateColors();
    }

    public void setUseWrapContent(boolean z) {
        this.w = z;
    }

    @Override
    public void updateColors() {
        int i;
        int i2;
        if (!this.y) {
            if (this.x) {
                i2 = aob.ob;
            } else {
                i2 = aob.Fi;
            }
            this.E = aob.v0(i2, this.a);
        }
        boolean z = this.F;
        hn hnVar = this.d;
        if (!z) {
            int i3 = this.G;
            if (i3 < 0) {
                if (this.s) {
                    if (this.x) {
                        i3 = aob.pb;
                    } else {
                        i3 = aob.Ji;
                    }
                } else {
                    i3 = aob.Fi;
                }
            }
            hnVar.u(aob.v0(i3, this.a));
        }
        if (this.s) {
            setRippleColor(aob.v0(aob.i6, this.a));
        } else if (!this.F) {
            setRippleColor(aob.p1(0.1f, hnVar.a.getColor()));
        }
        if (!this.F) {
            if (this.s) {
                if (this.x) {
                    i = aob.pb;
                } else {
                    i = aob.Ji;
                }
            } else {
                i = aob.Fi;
            }
            this.e.u(aob.v0(i, this.a));
        }
        this.f.u(this.E);
        this.c.setColor(aob.v0(aob.Ji, this.a));
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.O != drawable && this.d != drawable && this.e != drawable && this.f != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public c51(Context context, vnb vnbVar) {
        this(vnbVar, context, true);
    }
}
