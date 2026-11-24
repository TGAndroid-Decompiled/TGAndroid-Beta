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
public abstract class ky1 extends View implements bs5 {
    public final gn E;
    public final lm F;
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
    public final cm2[] R;
    public final lm S;
    public final n41 T;
    public boolean U;
    public final c84 V;
    public boolean W;
    public boolean a;
    public float a0;
    public final lm b;
    public final lm b0;
    public final wjb c;
    public final lm c0;
    public int d;
    public final Path d0;
    public Drawable e;
    public final Paint e0;
    public Drawable f;
    public final gn f0;
    public float g0;
    public Drawable h;
    public cc h0;
    public ChatActivityEnterView i0;
    public float j0;
    public float k0;
    public float l0;
    public int m0;
    public final tl n;
    public int n0;
    public boolean o0;
    public final lm p0;
    public Drawable q0;
    public float r;
    public il0 r0;
    public float s;
    public boolean s0;
    public int t0;
    public int u0;
    public int v0;
    public long w;
    public ValueAnimator w0;
    public int x;
    public final RectF x0;
    public boolean y;

    public ky1(int i, wjb wjbVar, Context context, boolean z) {
        super(context);
        s33 s33Var = s33.h;
        this.b = new lm(this, 0L, 260L, s33Var);
        this.F = new lm(this, 0L, 320L, s33Var);
        this.G = new Paint(1);
        this.L = -1;
        this.M = -1;
        this.O = new Paint(1);
        this.R = new cm2[1];
        this.S = new lm(this, 0L, 420L, s33Var);
        this.T = new n41(this);
        this.V = new c84();
        this.b0 = new lm(this, 0L, 420L, s33Var);
        this.c0 = new lm(this, 0L, 500L, s33Var);
        this.d0 = new Path();
        Paint paint = new Paint(1);
        this.e0 = paint;
        gn gnVar = new gn(true, true, true);
        this.f0 = gnVar;
        this.g0 = 1.0f;
        this.p0 = new lm(this, 0L, 320L, s33Var);
        this.x0 = new RectF();
        this.d = i;
        this.c = wjbVar;
        this.H = z;
        gn gnVar2 = new gn(false, false, false);
        this.E = gnVar2;
        gnVar2.w(gl.L(15.0f));
        gnVar2.x(gl.o());
        gnVar2.u(-1);
        gnVar2.b = 3;
        gnVar2.setCallback(this);
        gnVar2.N = gl.q.x;
        this.e = b00.d(context, i);
        this.f = b00.d(context, i);
        this.h = b00.d(context, i);
        this.n = new tl(gl.L(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        gnVar.setCallback(this);
        gnVar.u(-1);
        gnVar.w(gl.L(12.0f));
        gnVar.x(gl.o());
        gnVar.b = 17;
    }

    public final void a() {
        ValueAnimator valueAnimator = this.w0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.w0 = ofFloat;
        ofFloat.addUpdateListener(new f0(this, (byte) 29));
        this.w0.addListener(new bb1(this, (byte) 10));
        this.w0.setDuration(180L);
        this.w0.setInterpolator(new OvershootInterpolator());
        this.w0.start();
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
        canvas.saveLayerAlpha(-gl.L(6.0f), -gl.L(6.0f), getWidth(), getHeight(), 255, 31);
        super.draw(canvas);
        RectF rectF = this.x0;
        float L = gl.L(18.0f) / 2.0f;
        float L2 = (rectF.left + L) - gl.L(6.0f);
        float L3 = (rectF.top + L) - gl.L(6.0f);
        canvas.drawCircle(L2, L3, gl.L(2.0f) + L, bkb.Fm);
        canvas.drawCircle(L2, L3, L, this.G);
        if (this.J == null) {
            Drawable mutate = getContext().getResources().getDrawable(2131231980).mutate();
            this.J = mutate;
            int i = this.t0;
            this.K = i;
            mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        if (this.K != this.t0) {
            Drawable drawable = this.J;
            int i2 = this.t0;
            this.K = i2;
            drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        }
        this.J.setBounds((int) (L2 - gl.L(8.0f)), (int) (L3 - gl.L(8.0f)), (int) (L2 + gl.L(8.0f)), (int) (L3 + gl.L(8.0f)));
        this.J.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void e(RectF rectF) {
        float measuredWidth = (getMeasuredWidth() - gl.L(4.0f)) - this.P;
        float measuredHeight = (getMeasuredHeight() - gl.L(4.0f)) - this.Q;
        rectF.set(measuredWidth - getCircleWidth(), measuredHeight - getCircleHeight(), measuredWidth, measuredHeight);
    }

    public final void f(int i, boolean z) {
        String valueOf;
        if (i <= 0) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(i);
        }
        this.f0.t(valueOf, z, true);
        invalidate();
    }

    @Override
    public final void g(Canvas canvas, float f) {
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
            if (this.s0) {
                R1 = gl.R1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - gl.L(4.0f), f5) - this.P;
                U1 = getCircleHeight() * f5;
                R12 = ((getMeasuredHeight() - this.Q) - gl.L(4.0f)) - (U1 / 2.0f);
            } else {
                R1 = gl.R1(gl.R1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - gl.L(4.0f), f5) - this.P, getMeasuredWidth() - gl.L(9.0f), f6);
                R12 = gl.R1(((getMeasuredHeight() - this.Q) - gl.L(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - gl.L(24.0f), f6);
                U1 = gl.U1(f6, getCircleHeight(), gl.L(32.0f)) * f5;
            }
            float circleWidth = getCircleWidth();
            if (this.H) {
                f2 = 20.0f;
            } else {
                f2 = 22.0f;
            }
            float R13 = gl.R1(circleWidth, this.E.c() + gl.L(f2), f6) * f5;
            if (f5 > 0.0f && R13 > 0.0f && U1 > 0.0f) {
                RectF rectF = gl.P;
                float f7 = U1 / 2.0f;
                rectF.set(R1 - R13, R12 - f7, R1, f7 + R12);
                rectF.inset(-gl.L(4.0f), -gl.L(4.0f));
                float min = (Math.min(R13, U1) / 2.0f) + gl.L(4.0f);
                canvas.drawRoundRect(rectF, min, min, paint);
            }
            gn gnVar = this.f0;
            float i2 = (1.0f - f6) * gnVar.i();
            if (i2 > 0.0f) {
                float max = Math.max(gnVar.c() + gl.L(9.0f), gl.L(18.0f));
                if (this.s0) {
                    f3 = R1 - gl.L(50.0f);
                    f4 = (max / 2.0f) + (R12 - (getCircleHeight() / 2.0f));
                } else {
                    float f8 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.P) - f8;
                    float measuredHeight = (getMeasuredHeight() - this.Q) - f8;
                    f3 = measuredWidth;
                    f4 = measuredHeight;
                }
                canvas.drawCircle(f3, f4, ((max / 2.0f) + gl.L(2.0f)) * i2 * this.g0, paint);
            }
        }
        draw(canvas);
    }

    public int getCircleHeight() {
        int i = this.M;
        if (i >= 0) {
            return i;
        }
        return getMeasuredHeight() - gl.L(8.0f);
    }

    public int getCircleWidth() {
        int i = this.L;
        if (i >= 0) {
            return i;
        }
        return getMeasuredHeight() - gl.L(8.0f);
    }

    public int getFillColor() {
        return bkb.v0(bkb.Oe, this.c);
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
        lm lmVar = this.b0;
        if (z && lmVar.c >= 1.0f) {
            j = 650;
        } else {
            j = 0;
        }
        lmVar.f = (int) j;
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
        gn gnVar = this.E;
        if (i2 > 0) {
            gnVar.t(jva.Y0(false, "⭐️".concat(k96.E(j * Math.max(1, i), ',')), this.R), z, true);
        } else {
            gnVar.t("", z, true);
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
        return this instanceof e02;
    }

    public final void k() {
        int v0;
        boolean z = this.H;
        wjb wjbVar = this.c;
        if (z) {
            v0 = -1;
        } else {
            v0 = bkb.v0(bkb.Oe, wjbVar);
        }
        int v02 = bkb.v0(bkb.Ml, wjbVar);
        int v03 = bkb.v0(bkb.Sf, wjbVar);
        if (v0 != this.t0 || v02 != this.u0 || v03 != this.v0) {
            this.t0 = v0;
            this.u0 = v02;
            this.v0 = v03;
            Drawable drawable = this.e;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(v0, mode));
            this.f.setColorFilter(new PorterDuffColorFilter(Color.argb(180, Color.red(v02), Color.green(v02), Color.blue(v02)), mode));
            this.h.setColorFilter(new PorterDuffColorFilter(v03, mode));
        }
        boolean z2 = this.H;
        Paint paint = this.G;
        if (z2) {
            paint.setColor(bkb.v0(bkb.Oe, wjbVar));
        } else if (j()) {
            paint.setColor(getFillColor());
        } else {
            paint.setColor(bm2.o(-1, 75));
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
        int L = gl.L(18.0f);
        if (this.H) {
            f2 = 20.0f;
        } else {
            f2 = 22.0f;
        }
        return (int) gl.R1(circleWidth, gl.L(f2) + L + this.E.d, f3 * f);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r44) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ky1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ky1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBlurredBackgroundDrawable(il0 il0Var) {
        this.r0 = il0Var;
        il0Var.r(gl.L(22.0f));
        this.r0.q(gl.L(4.0f));
    }

    public void setCircleSize(int i) {
        this.L = i;
        this.M = i;
    }

    public void setEffect(long j) {
        ru3 ru3Var;
        TLRPC.TL_availableEffect X0 = na7.q1(y6c.t0).X0(j);
        if (X0 != null) {
            ru3Var = vu3.g(X0.emoticon);
        } else {
            ru3Var = null;
        }
        setEmoji(ru3Var);
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
        tb4.a(this, z);
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
