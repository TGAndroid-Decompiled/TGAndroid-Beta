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
public class u41 extends FrameLayout implements g86, tjb {
    public int E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public int J;
    public q21 K;
    public float L;
    public ValueAnimator M;
    public boolean N;
    public r86 O;
    public boolean P;
    public float Q;
    public boolean R;
    public ValueAnimator S;
    public boolean T;
    public float U;
    public ValueAnimator V;
    public int W;
    public wjb a;
    public boolean a0;
    public int b;
    public boolean b0;
    public final Paint c;
    public Drawable c0;
    public final gn d;
    public float d0;
    public final gn e;
    public boolean e0;
    public final gn f;
    public ValueAnimator f0;
    public ih2 g0;
    public float h;
    public int h0;
    public boolean i0;
    public int j0;
    public boolean k0;
    public int l0;
    public final lm n;
    public final View r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    public u41(wjb wjbVar, Context context, boolean z) {
        super(context);
        this.b = 8;
        s33 s33Var = s33.h;
        this.n = new lm(350L, s33Var);
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
        this.a = wjbVar;
        ote.b(this, 0.02f, 1.2f);
        View view = new View(context);
        this.r = view;
        addView(view, nme.c(-1.0f, -1));
        if (z) {
            int L = gl.L(8.0f);
            int i = bkb.Ei;
            int v0 = bkb.v0(i, wjbVar);
            this.E = v0;
            ShapeDrawable b0 = bkb.b0(L, v0);
            vkb M = zkb.M(i);
            setBackground(b0);
            zkb.j(this, b0, M, null, wjbVar);
        }
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(bkb.v0(bkb.Ii, wjbVar));
        gn gnVar = new gn(true, true, false, false, true);
        this.d = gnVar;
        gnVar.n(0.3f, 250L, s33Var);
        gnVar.setCallback(this);
        gnVar.w(gl.L(14.0f));
        if (z) {
            gnVar.x(gl.o());
        }
        gnVar.b = 1;
        gn gnVar2 = new gn(j(), true, false);
        this.e = gnVar2;
        gnVar2.n(0.3f, 250L, s33Var);
        gnVar2.setCallback(this);
        gnVar2.w(gl.L(12.0f));
        gnVar2.b = 1;
        gn gnVar3 = new gn(false, false, true);
        this.f = gnVar3;
        gnVar3.n(0.3f, 250L, s33Var);
        gnVar3.setCallback(this);
        gnVar3.w(gl.L(12.0f));
        gnVar3.x(gl.o());
        gnVar3.t("", true, true);
        gnVar3.b = 1;
        setWillNotDraw(false);
        updateColors();
    }

    private int getWrapWidth() {
        float f;
        float e = this.n.e(false, this.h);
        if (this.b0) {
            f = gl.L(12.0f);
        } else {
            f = 0.0f;
        }
        return getPaddingRight() + getPaddingLeft() + ((int) (b(this.f.c() + gl.L(15.66f), e) + this.d.c() + f));
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
        view.setBackground(bkb.Y(i, i2, i2));
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
        gn gnVar = this.f;
        if (z) {
            gnVar.a();
            int i2 = this.W;
            if (i != i2 && i > 0 && i2 > 0) {
                ValueAnimator valueAnimator = this.V;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.V = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.V = ofFloat;
                ofFloat.addUpdateListener(new s41(this, (byte) 0));
                this.V.addListener(new t41(this, (byte) 1));
                b00.n(2.0f, this.V);
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
        gnVar.t(k96.E(i, ' '), z, true);
        invalidate();
    }

    public final void d() {
        int i;
        ShapeDrawable b0 = bkb.b0(gl.L(this.b), this.E);
        if (this.y) {
            setBackground(b0);
            return;
        }
        if (this.x) {
            i = bkb.nb;
        } else {
            i = bkb.Ei;
        }
        vkb M = zkb.M(i);
        wjb wjbVar = this.a;
        setBackground(b0);
        zkb.j(this, b0, M, null, wjbVar);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return false;
    }

    public final void e() {
        this.x = true;
        setFilled(true);
        if (!this.y) {
            this.E = bkb.v0(bkb.nb, this.a);
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
        gn gnVar = this.e;
        if (z) {
            gnVar.a();
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
            ofFloat.addUpdateListener(new s41(this, (byte) 3));
            this.M.addListener(new t41(this, (byte) 0));
            this.M.setDuration(200L);
            this.M.setInterpolator(s33.f);
            this.M.start();
        } else {
            gnVar.t(charSequence, z, true);
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
            ofFloat2.addUpdateListener(new s41(this, (byte) 4));
            this.M.setDuration(200L);
            this.M.setInterpolator(s33.f);
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
        gn gnVar = this.d;
        if (z) {
            gnVar.a();
        }
        gnVar.t(charSequence, z, z2);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override
    public final boolean isEnabled() {
        return this.e0;
    }

    public boolean j() {
        return !(this instanceof oi1);
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
            r86 r86Var = this.O;
            if (z2) {
                if (r86Var == null) {
                    r86 r86Var2 = new r86(this.a);
                    this.O = r86Var2;
                    r86Var2.setCallback(this);
                    r86 r86Var3 = this.O;
                    r86Var3.t = 2.0f;
                    r86Var3.D = true;
                    r86Var3.x.setStrokeWidth(0.0f);
                    this.O.f(bkb.p1(0.02f, -1), bkb.p1(0.375f, -1));
                }
                r86 r86Var4 = this.O;
                r86Var4.c = -1L;
                r86Var4.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.O.j(this.b);
                this.O.draw(canvas);
            } else if (r86Var != null) {
                r86Var.a();
                this.O.draw(canvas);
                if (this.O.c()) {
                    this.O.b = -1L;
                }
            }
        }
        int i3 = (this.Q > 0.0f ? 1 : (this.Q == 0.0f ? 0 : -1));
        gn gnVar = this.d;
        if (i3 > 0) {
            ih2 ih2Var = this.g0;
            if (ih2Var == null) {
                ih2Var = new ih2(gnVar.a.getColor());
                this.g0 = ih2Var;
            }
            if (this.T) {
                ih2Var.setBounds(0, 0, getWidth(), getHeight());
                this.g0.setAlpha((int) (this.Q * 255.0f));
                float R1 = gl.R1(0.6f, 1.0f, this.Q);
                canvas.save();
                canvas.scale(R1, R1, getWidth() / 2.0f, getHeight() / 2.0f);
                this.g0.draw(canvas);
                canvas.restore();
            } else {
                int L = (int) ((1.0f - this.Q) * gl.L(24.0f));
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
                    canvas.translate(0.0f, (int) (f7 * gl.L(-24.0f)));
                    canvas.scale(1.0f, 1.0f - (this.Q * 0.4f));
                }
                z = true;
            } else {
                z = false;
            }
            float c = gnVar.c();
            float e = this.n.e(false, this.h);
            if (this.b0) {
                f = gl.L(12.0f);
            } else {
                f = 0.0f;
            }
            gn gnVar2 = this.f;
            float b = b(gnVar2.c() + gl.L(15.66f), e) + c + f;
            Rect rect = gl.Q;
            rect.set((int) (((getMeasuredWidth() - b) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - gnVar.e) / 2.0f) - gl.L(1.0f)), (int) tb4.e(getMeasuredWidth() - b, getWidth(), 2.0f, c), (int) (((getMeasuredHeight() + gnVar.e) / 2.0f) - gl.L(1.0f)));
            rect.offset(0, (int) ((-gl.L(7.0f)) * this.L));
            gnVar.C = (int) (gl.R1(0.5f, 1.0f, this.d0) * (1.0f - this.Q) * this.h0);
            gnVar.setBounds(rect);
            gnVar.draw(canvas);
            if (this.N) {
                gn gnVar3 = this.e;
                b = gnVar3.c();
                rect.set((int) (((getMeasuredWidth() - b) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - gnVar3.e) / 2.0f) - gl.L(1.0f)), (int) tb4.e(getMeasuredWidth() - b, getWidth(), 2.0f, b), (int) (((getMeasuredHeight() + gnVar3.e) / 2.0f) - gl.L(1.0f)));
                rect.offset(0, gl.L(11.0f));
                canvas.save();
                float R12 = gl.R1(0.1f, 1.0f, this.L);
                canvas.scale(R12, R12, rect.centerX(), rect.bottom);
                gnVar3.C = (int) (gl.R1(0.5f, 1.0f, this.d0) * (1.0f - this.Q) * 200.0f * this.L);
                gnVar3.setBounds(rect);
                gnVar3.draw(canvas);
                canvas.restore();
            }
            float z4 = oo1.z(getMeasuredWidth(), b, 2.0f, c);
            if (this.I) {
                f2 = 5.0f;
            } else {
                f2 = 2.0f;
            }
            int L2 = (int) (z4 + gl.L(f2));
            int measuredHeight = (int) ((getMeasuredHeight() - gl.L(18.0f)) / 2.0f);
            float z5 = oo1.z(getMeasuredWidth(), b, 2.0f, c);
            if (this.I) {
                i = 5;
            } else {
                i = 2;
            }
            rect.set(L2, measuredHeight, (int) (Math.max(gl.L(9.0f), gnVar2.c() + f) + z5 + gl.L(i + 8)), (int) ((gl.L(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = gl.P;
            rectF.set(rect);
            if (this.U != 1.0f) {
                canvas.save();
                float f9 = this.U;
                canvas.scale(f9, f9, rect.centerX(), rect.centerY());
            }
            if (this.I) {
                float f10 = 1.0f - this.Q;
                f3 = 0.5f;
                float R13 = gl.R1(0.5f, 1.0f, this.d0);
                Paint paint = this.c;
                paint.setAlpha((int) (R13 * f10 * this.h0 * e * e));
                if (this.b0) {
                    f5 = 4.0f;
                } else {
                    f5 = 10.0f;
                }
                float L3 = gl.L(f5);
                canvas.drawRoundRect(rectF, L3, L3, paint);
            } else {
                f3 = 0.5f;
            }
            CharSequence charSequence = gnVar2.i;
            if (charSequence != null) {
                i2 = charSequence.length();
            }
            if (i2 > 1) {
                f4 = 0.3f;
            } else {
                f4 = 0.0f;
            }
            rect.offset(-gl.L(f4), -gl.L(0.4f));
            float z6 = tb4.z(1.0f, this.Q, this.h0, e);
            if (this.I) {
                f3 = 1.0f;
            }
            gnVar2.C = (int) (z6 * f3);
            gnVar2.setBounds(rect);
            canvas.save();
            if (this.I && this.b0) {
                this.c0.setAlpha((int) ((1.0f - this.Q) * this.h0 * e * 1.0f));
                this.c0.setBounds(gl.L(1.0f) + rect.left, gl.L(2.0f) + rect.top, this.c0.getIntrinsicWidth() + gl.L(1.0f) + rect.left, this.c0.getIntrinsicHeight() + gl.L(2.0f) + rect.top);
                this.c0.draw(canvas);
                canvas.translate(f / 2.0f, 0.0f);
            }
            gnVar2.draw(canvas);
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
            int L = gl.L(this.b);
            this.E = i;
            setBackground(bkb.b0(L, i));
            return;
        }
        this.F = true;
        this.d.u(i);
        int p1 = bkb.p1(0.1f, i);
        int i2 = this.b;
        this.r.setBackground(bkb.Y(p1, i2, i2));
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
        gn gnVar = this.f;
        gnVar.w(gl.L(f));
        if (this.I) {
            color = this.E;
        } else {
            color = this.d.a.getColor();
        }
        gnVar.u(color);
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
            ofFloat.addUpdateListener(new s41(this, (byte) 1));
            this.f0.start();
        }
        super.setEnabled(z);
    }

    public void setFilled(boolean z) {
        if (this.s == z) {
            return;
        }
        this.s = z;
        gn gnVar = this.d;
        if (z) {
            d();
            gnVar.x(gl.o());
        } else {
            setBackground(null);
            gnVar.x(null);
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
            ofFloat.addUpdateListener(new s41(this, (byte) 2));
            this.S.addListener(new y7((byte) 10, this, z));
            ValueAnimator valueAnimator2 = this.S;
            if (this.T) {
                j = 240;
            } else {
                j = 320;
            }
            valueAnimator2.setDuration(j);
            this.S.setInterpolator(s33.h);
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
        gn gnVar = this.d;
        gnVar.u(i);
        if (!this.s) {
            setRippleColor(bkb.p1(0.1f, gnVar.a.getColor()));
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
                i2 = bkb.nb;
            } else {
                i2 = bkb.Ei;
            }
            this.E = bkb.v0(i2, this.a);
        }
        boolean z = this.F;
        gn gnVar = this.d;
        if (!z) {
            int i3 = this.G;
            if (i3 < 0) {
                if (this.s) {
                    if (this.x) {
                        i3 = bkb.ob;
                    } else {
                        i3 = bkb.Ii;
                    }
                } else {
                    i3 = bkb.Ei;
                }
            }
            gnVar.u(bkb.v0(i3, this.a));
        }
        if (this.s) {
            setRippleColor(bkb.v0(bkb.h6, this.a));
        } else if (!this.F) {
            setRippleColor(bkb.p1(0.1f, gnVar.a.getColor()));
        }
        if (!this.F) {
            if (this.s) {
                if (this.x) {
                    i = bkb.ob;
                } else {
                    i = bkb.Ii;
                }
            } else {
                i = bkb.Ei;
            }
            this.e.u(bkb.v0(i, this.a));
        }
        this.f.u(this.E);
        this.c.setColor(bkb.v0(bkb.Ii, this.a));
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

    public u41(Context context, wjb wjbVar) {
        this(wjbVar, context, true);
    }
}
