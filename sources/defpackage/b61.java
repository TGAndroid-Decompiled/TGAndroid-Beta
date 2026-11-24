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
public class b61 extends FrameLayout implements fa6, vlb {
    public int E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public int J;
    public y31 K;
    public float L;
    public ValueAnimator M;
    public boolean N;
    public qa6 O;
    public boolean P;
    public float Q;
    public boolean R;
    public ValueAnimator S;
    public boolean T;
    public float U;
    public ValueAnimator V;
    public int W;
    public ylb a;
    public boolean a0;
    public int b;
    public boolean b0;
    public final Paint c;
    public Drawable c0;
    public final ho d;
    public float d0;
    public final ho e;
    public boolean e0;
    public final ho f;
    public ValueAnimator f0;
    public wi2 g0;
    public float h;
    public int h0;
    public boolean i0;
    public int j0;
    public boolean k0;
    public int l0;
    public final ln n;
    public final View r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    public b61(ylb ylbVar, Context context, boolean z) {
        super(context);
        this.b = 8;
        d53 d53Var = d53.h;
        this.n = new ln(350L, d53Var);
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
        this.a = ylbVar;
        rve.b(this, 0.02f, 1.2f);
        View view = new View(context);
        this.r = view;
        addView(view, qoe.c(-1.0f, -1));
        if (z) {
            int L = gm.L(8.0f);
            int i = cmb.Ei;
            int v0 = cmb.v0(i, ylbVar);
            this.E = v0;
            ShapeDrawable b0 = cmb.b0(L, v0);
            wmb M = anb.M(i);
            setBackground(b0);
            anb.j(this, b0, M, null, ylbVar);
        }
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(cmb.v0(cmb.Ii, ylbVar));
        ho hoVar = new ho(true, true, false, false, true);
        this.d = hoVar;
        hoVar.n(0.3f, 250L, d53Var);
        hoVar.setCallback(this);
        hoVar.w(gm.L(14.0f));
        if (z) {
            hoVar.x(gm.o());
        }
        hoVar.b = 1;
        ho hoVar2 = new ho(j(), true, false);
        this.e = hoVar2;
        hoVar2.n(0.3f, 250L, d53Var);
        hoVar2.setCallback(this);
        hoVar2.w(gm.L(12.0f));
        hoVar2.b = 1;
        ho hoVar3 = new ho(false, false, true);
        this.f = hoVar3;
        hoVar3.n(0.3f, 250L, d53Var);
        hoVar3.setCallback(this);
        hoVar3.w(gm.L(12.0f));
        hoVar3.x(gm.o());
        hoVar3.t("", true, true);
        hoVar3.b = 1;
        setWillNotDraw(false);
        updateColors();
    }

    private int getWrapWidth() {
        float f;
        float e = this.n.e(false, this.h);
        if (this.b0) {
            f = gm.L(12.0f);
        } else {
            f = 0.0f;
        }
        return getPaddingRight() + getPaddingLeft() + ((int) (b(this.f.c() + gm.L(15.66f), e) + this.d.c() + f));
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
        view.setBackground(cmb.Y(i, i2, i2));
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
        ho hoVar = this.f;
        if (z) {
            hoVar.a();
            int i2 = this.W;
            if (i != i2 && i > 0 && i2 > 0) {
                ValueAnimator valueAnimator = this.V;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.V = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.V = ofFloat;
                ofFloat.addUpdateListener(new z51(this, (byte) 0));
                this.V.addListener(new a61(this, (byte) 1));
                b10.n(2.0f, this.V);
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
        hoVar.t(jb6.E(i, ' '), z, true);
        invalidate();
    }

    public final void d() {
        int i;
        ShapeDrawable b0 = cmb.b0(gm.L(this.b), this.E);
        if (this.y) {
            setBackground(b0);
            return;
        }
        if (this.x) {
            i = cmb.nb;
        } else {
            i = cmb.Ei;
        }
        wmb M = anb.M(i);
        ylb ylbVar = this.a;
        setBackground(b0);
        anb.j(this, b0, M, null, ylbVar);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return false;
    }

    public final void e() {
        this.x = true;
        setFilled(true);
        if (!this.y) {
            this.E = cmb.v0(cmb.nb, this.a);
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
        ho hoVar = this.e;
        if (z) {
            hoVar.a();
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
            ofFloat.addUpdateListener(new z51(this, (byte) 3));
            this.M.addListener(new a61(this, (byte) 0));
            this.M.setDuration(200L);
            this.M.setInterpolator(d53.f);
            this.M.start();
        } else {
            hoVar.t(charSequence, z, true);
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
            ofFloat2.addUpdateListener(new z51(this, (byte) 4));
            this.M.setDuration(200L);
            this.M.setInterpolator(d53.f);
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
        ho hoVar = this.d;
        if (z) {
            hoVar.a();
        }
        hoVar.t(charSequence, z, z2);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override
    public final boolean isEnabled() {
        return this.e0;
    }

    public boolean j() {
        return !(this instanceof xj1);
    }

    public final void k() {
        this.b0 = true;
        Drawable mutate = getContext().getDrawable(2131231934).mutate();
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
            qa6 qa6Var = this.O;
            if (z2) {
                if (qa6Var == null) {
                    qa6 qa6Var2 = new qa6(this.a);
                    this.O = qa6Var2;
                    qa6Var2.setCallback(this);
                    qa6 qa6Var3 = this.O;
                    qa6Var3.t = 2.0f;
                    qa6Var3.D = true;
                    qa6Var3.x.setStrokeWidth(0.0f);
                    this.O.f(cmb.p1(0.02f, -1), cmb.p1(0.375f, -1));
                }
                qa6 qa6Var4 = this.O;
                qa6Var4.c = -1L;
                qa6Var4.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.O.j(this.b);
                this.O.draw(canvas);
            } else if (qa6Var != null) {
                qa6Var.a();
                this.O.draw(canvas);
                if (this.O.c()) {
                    this.O.b = -1L;
                }
            }
        }
        int i3 = (this.Q > 0.0f ? 1 : (this.Q == 0.0f ? 0 : -1));
        ho hoVar = this.d;
        if (i3 > 0) {
            wi2 wi2Var = this.g0;
            if (wi2Var == null) {
                wi2Var = new wi2(hoVar.a.getColor());
                this.g0 = wi2Var;
            }
            if (this.T) {
                wi2Var.setBounds(0, 0, getWidth(), getHeight());
                this.g0.setAlpha((int) (this.Q * 255.0f));
                float R1 = gm.R1(0.6f, 1.0f, this.Q);
                canvas.save();
                canvas.scale(R1, R1, getWidth() / 2.0f, getHeight() / 2.0f);
                this.g0.draw(canvas);
                canvas.restore();
            } else {
                int L = (int) ((1.0f - this.Q) * gm.L(24.0f));
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
                    canvas.translate(0.0f, (int) (f7 * gm.L(-24.0f)));
                    canvas.scale(1.0f, 1.0f - (this.Q * 0.4f));
                }
                z = true;
            } else {
                z = false;
            }
            float c = hoVar.c();
            float e = this.n.e(false, this.h);
            if (this.b0) {
                f = gm.L(12.0f);
            } else {
                f = 0.0f;
            }
            ho hoVar2 = this.f;
            float b = b(hoVar2.c() + gm.L(15.66f), e) + c + f;
            Rect rect = gm.Q;
            rect.set((int) (((getMeasuredWidth() - b) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - hoVar.e) / 2.0f) - gm.L(1.0f)), (int) td4.e(getMeasuredWidth() - b, getWidth(), 2.0f, c), (int) (((getMeasuredHeight() + hoVar.e) / 2.0f) - gm.L(1.0f)));
            rect.offset(0, (int) ((-gm.L(7.0f)) * this.L));
            hoVar.C = (int) (gm.R1(0.5f, 1.0f, this.d0) * (1.0f - this.Q) * this.h0);
            hoVar.setBounds(rect);
            hoVar.draw(canvas);
            if (this.N) {
                ho hoVar3 = this.e;
                b = hoVar3.c();
                rect.set((int) (((getMeasuredWidth() - b) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - hoVar3.e) / 2.0f) - gm.L(1.0f)), (int) td4.e(getMeasuredWidth() - b, getWidth(), 2.0f, b), (int) (((getMeasuredHeight() + hoVar3.e) / 2.0f) - gm.L(1.0f)));
                rect.offset(0, gm.L(11.0f));
                canvas.save();
                float R12 = gm.R1(0.1f, 1.0f, this.L);
                canvas.scale(R12, R12, rect.centerX(), rect.bottom);
                hoVar3.C = (int) (gm.R1(0.5f, 1.0f, this.d0) * (1.0f - this.Q) * 200.0f * this.L);
                hoVar3.setBounds(rect);
                hoVar3.draw(canvas);
                canvas.restore();
            }
            float z4 = aq1.z(getMeasuredWidth(), b, 2.0f, c);
            if (this.I) {
                f2 = 5.0f;
            } else {
                f2 = 2.0f;
            }
            int L2 = (int) (z4 + gm.L(f2));
            int measuredHeight = (int) ((getMeasuredHeight() - gm.L(18.0f)) / 2.0f);
            float z5 = aq1.z(getMeasuredWidth(), b, 2.0f, c);
            if (this.I) {
                i = 5;
            } else {
                i = 2;
            }
            rect.set(L2, measuredHeight, (int) (Math.max(gm.L(9.0f), hoVar2.c() + f) + z5 + gm.L(i + 8)), (int) ((gm.L(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = gm.P;
            rectF.set(rect);
            if (this.U != 1.0f) {
                canvas.save();
                float f9 = this.U;
                canvas.scale(f9, f9, rect.centerX(), rect.centerY());
            }
            if (this.I) {
                float f10 = 1.0f - this.Q;
                f3 = 0.5f;
                float R13 = gm.R1(0.5f, 1.0f, this.d0);
                Paint paint = this.c;
                paint.setAlpha((int) (R13 * f10 * this.h0 * e * e));
                if (this.b0) {
                    f5 = 4.0f;
                } else {
                    f5 = 10.0f;
                }
                float L3 = gm.L(f5);
                canvas.drawRoundRect(rectF, L3, L3, paint);
            } else {
                f3 = 0.5f;
            }
            CharSequence charSequence = hoVar2.i;
            if (charSequence != null) {
                i2 = charSequence.length();
            }
            if (i2 > 1) {
                f4 = 0.3f;
            } else {
                f4 = 0.0f;
            }
            rect.offset(-gm.L(f4), -gm.L(0.4f));
            float z6 = td4.z(1.0f, this.Q, this.h0, e);
            if (this.I) {
                f3 = 1.0f;
            }
            hoVar2.C = (int) (z6 * f3);
            hoVar2.setBounds(rect);
            canvas.save();
            if (this.I && this.b0) {
                this.c0.setAlpha((int) ((1.0f - this.Q) * this.h0 * e * 1.0f));
                this.c0.setBounds(gm.L(1.0f) + rect.left, gm.L(2.0f) + rect.top, this.c0.getIntrinsicWidth() + gm.L(1.0f) + rect.left, this.c0.getIntrinsicHeight() + gm.L(2.0f) + rect.top);
                this.c0.draw(canvas);
                canvas.translate(f / 2.0f, 0.0f);
            }
            hoVar2.draw(canvas);
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
            int L = gm.L(this.b);
            this.E = i;
            setBackground(cmb.b0(L, i));
            return;
        }
        this.F = true;
        this.d.u(i);
        int p1 = cmb.p1(0.1f, i);
        int i2 = this.b;
        this.r.setBackground(cmb.Y(p1, i2, i2));
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
        ho hoVar = this.f;
        hoVar.w(gm.L(f));
        if (this.I) {
            color = this.E;
        } else {
            color = this.d.a.getColor();
        }
        hoVar.u(color);
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
            ofFloat.addUpdateListener(new z51(this, (byte) 1));
            this.f0.start();
        }
        super.setEnabled(z);
    }

    public void setFilled(boolean z) {
        if (this.s == z) {
            return;
        }
        this.s = z;
        ho hoVar = this.d;
        if (z) {
            d();
            hoVar.x(gm.o());
        } else {
            setBackground(null);
            hoVar.x(null);
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
            ofFloat.addUpdateListener(new z51(this, (byte) 2));
            this.S.addListener(new y7((byte) 10, this, z));
            ValueAnimator valueAnimator2 = this.S;
            if (this.T) {
                j = 240;
            } else {
                j = 320;
            }
            valueAnimator2.setDuration(j);
            this.S.setInterpolator(d53.h);
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
        ho hoVar = this.d;
        hoVar.u(i);
        if (!this.s) {
            setRippleColor(cmb.p1(0.1f, hoVar.a.getColor()));
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
                i2 = cmb.nb;
            } else {
                i2 = cmb.Ei;
            }
            this.E = cmb.v0(i2, this.a);
        }
        boolean z = this.F;
        ho hoVar = this.d;
        if (!z) {
            int i3 = this.G;
            if (i3 < 0) {
                if (this.s) {
                    if (this.x) {
                        i3 = cmb.ob;
                    } else {
                        i3 = cmb.Ii;
                    }
                } else {
                    i3 = cmb.Ei;
                }
            }
            hoVar.u(cmb.v0(i3, this.a));
        }
        if (this.s) {
            setRippleColor(cmb.v0(cmb.h6, this.a));
        } else if (!this.F) {
            setRippleColor(cmb.p1(0.1f, hoVar.a.getColor()));
        }
        if (!this.F) {
            if (this.s) {
                if (this.x) {
                    i = cmb.ob;
                } else {
                    i = cmb.Ii;
                }
            } else {
                i = cmb.Ei;
            }
            this.e.u(cmb.v0(i, this.a));
        }
        this.f.u(this.E);
        this.c.setColor(cmb.v0(cmb.Ii, this.a));
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

    public b61(Context context, ylb ylbVar) {
        this(ylbVar, context, true);
    }
}
