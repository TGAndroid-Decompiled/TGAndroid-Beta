package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
public abstract class bz1 extends View implements eu5 {
    public final hn E;
    public final mm F;
    public final Paint G;
    public boolean H;
    public boolean I;
    public Drawable J;
    public int K;
    public int L;
    public int M;
    public int N;
    public final Paint O;
    public float P;
    public float Q;
    public final wm2[] R;
    public final mm S;
    public final v41 T;
    public boolean U;
    public final x84 V;
    public boolean W;
    public boolean a;
    public float a0;
    public final mm b;
    public final mm b0;
    public final vnb c;
    public final mm c0;
    public int d;
    public final Path d0;
    public Drawable e;
    public final Paint e0;
    public Drawable f;
    public final hn f0;
    public float g0;
    public Drawable h;
    public dc h0;
    public final RectF i0;
    public ChatActivityEnterView j0;
    public float k0;
    public float l0;
    public float m0;
    public final ul n;
    public int n0;
    public int o0;
    public boolean p0;
    public final mm q0;
    public float r;
    public Drawable r0;
    public float s;
    public jl0 s0;
    public boolean t0;
    public int u0;
    public int v0;
    public long w;
    public int w0;
    public int x;
    public ValueAnimator x0;
    public boolean y;
    public final RectF y0;

    public bz1(int i, vnb vnbVar, Context context, boolean z) {
        super(context);
        k43 k43Var = k43.h;
        this.b = new mm(this, 0L, 260L, k43Var);
        this.F = new mm(this, 0L, 320L, k43Var);
        this.G = new Paint(1);
        this.L = -1;
        this.M = -1;
        this.O = new Paint(1);
        this.R = new wm2[1];
        this.S = new mm(this, 0L, 420L, k43Var);
        this.T = new v41(this);
        this.V = new x84();
        this.b0 = new mm(this, 0L, 420L, k43Var);
        this.c0 = new mm(this, 0L, 500L, k43Var);
        this.d0 = new Path();
        Paint paint = new Paint(1);
        this.e0 = paint;
        hn hnVar = new hn(true, true, true);
        this.f0 = hnVar;
        this.g0 = 1.0f;
        this.i0 = new RectF();
        this.q0 = new mm(1.0f, this, 0L, 320L, k43Var);
        this.y0 = new RectF();
        this.d = i;
        this.c = vnbVar;
        this.H = z;
        hn hnVar2 = new hn(false, false, false);
        this.E = hnVar2;
        hnVar2.w(hl.L(15.0f));
        hnVar2.x(hl.o());
        hnVar2.u(-1);
        hnVar2.b = 3;
        hnVar2.setCallback(this);
        hnVar2.N = hl.q.x;
        this.e = c00.e(context, i);
        this.f = c00.e(context, i);
        this.h = c00.e(context, i);
        this.n = new ul(hl.L(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        hnVar.setCallback(this);
        hnVar.u(-1);
        hnVar.w(hl.L(12.0f));
        hnVar.x(hl.o());
        hnVar.b = 17;
    }

    public final void a() {
        ValueAnimator valueAnimator = this.x0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.x0 = ofFloat;
        ofFloat.addUpdateListener(new az1(this, (byte) 0));
        this.x0.addListener(new jb1(this, (byte) 10));
        this.x0.setDuration(180L);
        this.x0.setInterpolator(new OvershootInterpolator());
        this.x0.start();
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (!this.I) {
            super.draw(canvas);
            return;
        }
        canvas.saveLayerAlpha(-hl.L(6.0f), -hl.L(6.0f), getWidth(), getHeight(), 255, 31);
        super.draw(canvas);
        RectF rectF = this.y0;
        float L = hl.L(18.0f) / 2.0f;
        float L2 = (rectF.left + L) - hl.L(6.0f);
        float L3 = (rectF.top + L) - hl.L(6.0f);
        canvas.drawCircle(L2, L3, hl.L(2.0f) + L, aob.Gm);
        canvas.drawCircle(L2, L3, L, this.G);
        if (this.J == null) {
            Drawable mutate = getContext().getResources().getDrawable(2131231980).mutate();
            this.J = mutate;
            int i = this.u0;
            this.K = i;
            mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        if (this.K != this.u0) {
            Drawable drawable = this.J;
            int i2 = this.u0;
            this.K = i2;
            drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        }
        this.J.setBounds((int) (L2 - hl.L(8.0f)), (int) (L3 - hl.L(8.0f)), (int) (L2 + hl.L(8.0f)), (int) (L3 + hl.L(8.0f)));
        this.J.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void e(RectF rectF) {
        float measuredWidth = (getMeasuredWidth() - hl.L(4.0f)) - this.P;
        float measuredHeight = (getMeasuredHeight() - hl.L(4.0f)) - this.Q;
        rectF.set(measuredWidth - getCircleWidth(), measuredHeight - getCircleHeight(), measuredWidth, measuredHeight);
    }

    @Override
    public final void f(Canvas canvas, float f) {
        float R1;
        float R12;
        float U1;
        float f2;
        float f3;
        float f4;
        int i = this.N;
        if (i != 0) {
            Paint paint = this.O;
            paint.setColor(i);
            paint.setAlpha((int) (Color.alpha(this.N) * f));
            float f5 = this.S.c;
            float f6 = this.F.c;
            if (this.t0) {
                R1 = hl.R1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - hl.L(4.0f), f5) - this.P;
                U1 = getCircleHeight() * f5;
                R12 = ((getMeasuredHeight() - this.Q) - hl.L(4.0f)) - (U1 / 2.0f);
            } else {
                R1 = hl.R1(hl.R1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - hl.L(4.0f), f5) - this.P, getMeasuredWidth() - hl.L(9.0f), f6);
                R12 = hl.R1(((getMeasuredHeight() - this.Q) - hl.L(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - hl.L(24.0f), f6);
                U1 = hl.U1(f6, getCircleHeight(), hl.L(32.0f)) * f5;
            }
            float circleWidth = getCircleWidth();
            if (this.H) {
                f2 = 20.0f;
            } else {
                f2 = 22.0f;
            }
            float R13 = hl.R1(circleWidth, this.E.c() + hl.L(f2), f6) * f5;
            if (f5 > 0.0f && R13 > 0.0f && U1 > 0.0f) {
                RectF rectF = hl.P;
                float f7 = U1 / 2.0f;
                rectF.set(R1 - R13, R12 - f7, R1, f7 + R12);
                rectF.inset(-hl.L(4.0f), -hl.L(4.0f));
                float min = (Math.min(R13, U1) / 2.0f) + hl.L(4.0f);
                canvas.drawRoundRect(rectF, min, min, paint);
            }
            hn hnVar = this.f0;
            float i2 = (1.0f - f6) * hnVar.i();
            if (i2 > 0.0f) {
                float max = Math.max(hnVar.c() + hl.L(9.0f), hl.L(18.0f));
                if (this.t0) {
                    f3 = R1 - hl.L(50.0f);
                    f4 = (max / 2.0f) + (R12 - (getCircleHeight() / 2.0f));
                } else {
                    float f8 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.P) - f8;
                    float measuredHeight = (getMeasuredHeight() - this.Q) - f8;
                    f3 = measuredWidth;
                    f4 = measuredHeight;
                }
                canvas.drawCircle(f3, f4, ((max / 2.0f) + hl.L(2.0f)) * i2 * this.g0, paint);
            }
        }
        draw(canvas);
    }

    public final void g(int i, boolean z) {
        String valueOf;
        if (i <= 0) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(i);
        }
        this.f0.t(valueOf, z, true);
        invalidate();
    }

    public int getCircleHeight() {
        int i = this.M;
        if (i >= 0) {
            return i;
        }
        return getMeasuredHeight() - hl.L(8.0f);
    }

    public int getCircleWidth() {
        int i = this.L;
        if (i >= 0) {
            return i;
        }
        return getMeasuredHeight() - hl.L(8.0f);
    }

    public int getFillColor() {
        return aob.v0(aob.Pe, this.c);
    }

    public final void h(boolean z) {
        long j;
        float f = -3.0f;
        if (this.W == z && ((!z || Math.abs(this.a0 - (-3.0f)) < 0.01f) && this.U)) {
            return;
        }
        this.U = true;
        if (!this.W && z) {
            this.c0.e(true, 0.0f);
        }
        mm mmVar = this.b0;
        if (z && mmVar.c >= 1.0f) {
            j = 650;
        } else {
            j = 0;
        }
        mmVar.f = (int) j;
        this.W = z;
        if (!z) {
            f = 1.0f;
        }
        this.a0 = f;
        invalidate();
    }

    public final void i(int i, long j, boolean z) {
        if (this.w == j && this.x == i) {
            return;
        }
        this.w = j;
        this.x = i;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        boolean z2 = false;
        hn hnVar = this.E;
        if (i2 > 0) {
            hnVar.t(nza.Z0(false, "⭐️".concat(ob6.E(j * Math.max(1, i), ',')), this.R), z, true);
        } else {
            hnVar.t("", z, true);
        }
        if (!z) {
            if (this.w > 0) {
                z2 = true;
            }
            this.F.a(z2);
            return;
        }
        invalidate();
    }

    public boolean j() {
        return this instanceof u02;
    }

    public final void k() {
        int v0;
        boolean z = this.H;
        vnb vnbVar = this.c;
        if (z) {
            v0 = -1;
        } else {
            v0 = aob.v0(aob.Pe, vnbVar);
        }
        int v02 = aob.v0(aob.Nl, vnbVar);
        int v03 = aob.v0(aob.Tf, vnbVar);
        if (v0 != this.u0 || v02 != this.v0 || v03 != this.w0) {
            this.u0 = v0;
            this.v0 = v02;
            this.w0 = v03;
            Drawable drawable = this.e;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(v0, mode));
            this.f.setColorFilter(new PorterDuffColorFilter(Color.argb(180, Color.red(v02), Color.green(v02), Color.blue(v02)), mode));
            this.h.setColorFilter(new PorterDuffColorFilter(v03, mode));
        }
        boolean z2 = this.H;
        Paint paint = this.G;
        if (z2) {
            paint.setColor(aob.v0(aob.Pe, vnbVar));
        } else if (j()) {
            paint.setColor(getFillColor());
        } else {
            paint.setColor(vm2.o(-1, 75));
        }
    }

    public final int l() {
        getMeasuredHeight();
        return m();
    }

    public final int m() {
        float f;
        float f2;
        float f3 = 0.0f;
        if (d()) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (this.w > 0) {
            f3 = 1.0f;
        }
        float circleWidth = this.P + getCircleWidth() + this.P;
        int L = hl.L(18.0f);
        if (this.H) {
            f2 = 20.0f;
        } else {
            f2 = 22.0f;
        }
        return (int) hl.R1(circleWidth, hl.L(f2) + L + this.E.d, f3 * f);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r44) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bz1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bz1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBlurredBackgroundDrawable(jl0 jl0Var) {
        this.s0 = jl0Var;
        jl0Var.r(hl.L(22.0f));
        this.s0.q(hl.L(4.0f));
    }

    public void setCircleSize(int i) {
        this.L = i;
        this.M = i;
    }

    public void setEffect(long j) {
        lv3 lv3Var;
        TLRPC.TL_availableEffect Z0 = uc7.s1(yac.t0).Z0(j);
        if (Z0 != null) {
            lv3Var = pv3.g(Z0.emoticon);
        } else {
            lv3Var = null;
        }
        setEmoji(lv3Var);
    }

    public void setEmoji(Drawable drawable) {
        this.n.g(drawable, true);
    }

    public void setEphemeralFactor(float f) {
        if (this.r != f) {
            this.r = f;
            invalidate();
        }
    }

    public void setIconDimmed(boolean z) {
        if (this.a != z) {
            this.a = z;
            invalidate();
        }
    }

    public void setLocked(boolean z) {
        if (this.I == z) {
            return;
        }
        this.I = z;
        invalidate();
    }

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.T.c(z);
    }

    public void setResourceId(int i) {
        if (this.d != i) {
            this.d = i;
            this.e = getContext().getResources().getDrawable(i).mutate();
            this.f = getContext().getResources().getDrawable(i).mutate();
            this.h = getContext().getResources().getDrawable(i).mutate();
            invalidate();
        }
    }

    public void setSameWidthFactor(float f) {
        if (this.s != f) {
            this.s = f;
            invalidate();
        }
    }

    @Override
    public void setScrimHidden(boolean z) {
        qd4.a(this, z);
    }

    public void setScrimViewBackgroundColor(int i) {
        this.N = i;
        this.O.setColor(i);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f0 && drawable != this.n && drawable != this.E && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
