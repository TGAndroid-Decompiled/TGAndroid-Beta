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
public abstract class xz1 extends View implements au5 {
    public final ho E;
    public final ln F;
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
    public final pn2[] R;
    public final ln S;
    public final u51 T;
    public boolean U;
    public final l94 V;
    public boolean W;
    public boolean a;
    public float a0;
    public final ln b;
    public final ln b0;
    public final ylb c;
    public final ln c0;
    public int d;
    public final Path d0;
    public Drawable e;
    public final Paint e0;
    public Drawable f;
    public final ho f0;
    public float g0;
    public Drawable h;
    public dd h0;
    public ChatActivityEnterView i0;
    public float j0;
    public float k0;
    public float l0;
    public int m0;
    public final tm n;
    public int n0;
    public boolean o0;
    public final ln p0;
    public Drawable q0;
    public float r;
    public im0 r0;
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

    public xz1(int i, ylb ylbVar, Context context, boolean z) {
        super(context);
        d53 d53Var = d53.h;
        this.b = new ln(this, 0L, 260L, d53Var);
        this.F = new ln(this, 0L, 320L, d53Var);
        this.G = new Paint(1);
        this.L = -1;
        this.M = -1;
        this.O = new Paint(1);
        this.R = new pn2[1];
        this.S = new ln(this, 0L, 420L, d53Var);
        this.T = new u51(this);
        this.V = new l94();
        this.b0 = new ln(this, 0L, 420L, d53Var);
        this.c0 = new ln(this, 0L, 500L, d53Var);
        this.d0 = new Path();
        Paint paint = new Paint(1);
        this.e0 = paint;
        ho hoVar = new ho(true, true, true);
        this.f0 = hoVar;
        this.g0 = 1.0f;
        this.p0 = new ln(this, 0L, 320L, d53Var);
        this.x0 = new RectF();
        this.d = i;
        this.c = ylbVar;
        this.H = z;
        ho hoVar2 = new ho(false, false, false);
        this.E = hoVar2;
        hoVar2.w(gm.L(15.0f));
        hoVar2.x(gm.o());
        hoVar2.u(-1);
        hoVar2.b = 3;
        hoVar2.setCallback(this);
        hoVar2.N = gm.q.x;
        this.e = b10.d(context, i);
        this.f = b10.d(context, i);
        this.h = b10.d(context, i);
        this.n = new tm(gm.L(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        hoVar.setCallback(this);
        hoVar.u(-1);
        hoVar.w(gm.L(12.0f));
        hoVar.x(gm.o());
        hoVar.b = 17;
    }

    public final void a() {
        ValueAnimator valueAnimator = this.w0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.w0 = ofFloat;
        ofFloat.addUpdateListener(new et1(this, (byte) 1));
        this.w0.addListener(new b91(this, (byte) 12));
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
        canvas.saveLayerAlpha(-gm.L(6.0f), -gm.L(6.0f), getWidth(), getHeight(), 255, 31);
        super.draw(canvas);
        RectF rectF = this.x0;
        float L = gm.L(18.0f) / 2.0f;
        float L2 = (rectF.left + L) - gm.L(6.0f);
        float L3 = (rectF.top + L) - gm.L(6.0f);
        canvas.drawCircle(L2, L3, gm.L(2.0f) + L, cmb.Fm);
        canvas.drawCircle(L2, L3, L, this.G);
        if (this.J == null) {
            Drawable mutate = getContext().getResources().getDrawable(2131231981).mutate();
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
        this.J.setBounds((int) (L2 - gm.L(8.0f)), (int) (L3 - gm.L(8.0f)), (int) (L2 + gm.L(8.0f)), (int) (L3 + gm.L(8.0f)));
        this.J.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void e(RectF rectF) {
        float measuredWidth = (getMeasuredWidth() - gm.L(4.0f)) - this.P;
        float measuredHeight = (getMeasuredHeight() - gm.L(4.0f)) - this.Q;
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
                R1 = gm.R1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - gm.L(4.0f), f5) - this.P;
                U1 = getCircleHeight() * f5;
                R12 = ((getMeasuredHeight() - this.Q) - gm.L(4.0f)) - (U1 / 2.0f);
            } else {
                R1 = gm.R1(gm.R1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - gm.L(4.0f), f5) - this.P, getMeasuredWidth() - gm.L(9.0f), f6);
                R12 = gm.R1(((getMeasuredHeight() - this.Q) - gm.L(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - gm.L(24.0f), f6);
                U1 = gm.U1(f6, getCircleHeight(), gm.L(32.0f)) * f5;
            }
            float circleWidth = getCircleWidth();
            if (this.H) {
                f2 = 20.0f;
            } else {
                f2 = 22.0f;
            }
            float R13 = gm.R1(circleWidth, this.E.c() + gm.L(f2), f6) * f5;
            if (f5 > 0.0f && R13 > 0.0f && U1 > 0.0f) {
                RectF rectF = gm.P;
                float f7 = U1 / 2.0f;
                rectF.set(R1 - R13, R12 - f7, R1, f7 + R12);
                rectF.inset(-gm.L(4.0f), -gm.L(4.0f));
                float min = (Math.min(R13, U1) / 2.0f) + gm.L(4.0f);
                canvas.drawRoundRect(rectF, min, min, paint);
            }
            ho hoVar = this.f0;
            float i2 = (1.0f - f6) * hoVar.i();
            if (i2 > 0.0f) {
                float max = Math.max(hoVar.c() + gm.L(9.0f), gm.L(18.0f));
                if (this.s0) {
                    f3 = R1 - gm.L(50.0f);
                    f4 = (max / 2.0f) + (R12 - (getCircleHeight() / 2.0f));
                } else {
                    float f8 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.P) - f8;
                    float measuredHeight = (getMeasuredHeight() - this.Q) - f8;
                    f3 = measuredWidth;
                    f4 = measuredHeight;
                }
                canvas.drawCircle(f3, f4, ((max / 2.0f) + gm.L(2.0f)) * i2 * this.g0, paint);
            }
        }
        draw(canvas);
    }

    public int getCircleHeight() {
        int i = this.M;
        if (i >= 0) {
            return i;
        }
        return getMeasuredHeight() - gm.L(8.0f);
    }

    public int getCircleWidth() {
        int i = this.L;
        if (i >= 0) {
            return i;
        }
        return getMeasuredHeight() - gm.L(8.0f);
    }

    public int getFillColor() {
        return cmb.v0(cmb.Oe, this.c);
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
        ln lnVar = this.b0;
        if (z && lnVar.c >= 1.0f) {
            j = 650;
        } else {
            j = 0;
        }
        lnVar.f = (int) j;
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
        ho hoVar = this.E;
        if (i2 > 0) {
            hoVar.t(nxa.Z0(false, "⭐️".concat(jb6.E(j * Math.max(1, i), ',')), this.R), z, true);
        } else {
            hoVar.t("", z, true);
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
        return this instanceof p12;
    }

    public final void k() {
        int v0;
        boolean z = this.H;
        ylb ylbVar = this.c;
        if (z) {
            v0 = -1;
        } else {
            v0 = cmb.v0(cmb.Oe, ylbVar);
        }
        int v02 = cmb.v0(cmb.Ml, ylbVar);
        int v03 = cmb.v0(cmb.Sf, ylbVar);
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
            paint.setColor(cmb.v0(cmb.Oe, ylbVar));
        } else if (j()) {
            paint.setColor(getFillColor());
        } else {
            paint.setColor(on2.p(-1, 75));
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
        int L = gm.L(18.0f);
        if (this.H) {
            f2 = 20.0f;
        } else {
            f2 = 22.0f;
        }
        return (int) gm.R1(circleWidth, gm.L(f2) + L + this.E.d, f3 * f);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r44) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBlurredBackgroundDrawable(im0 im0Var) {
        this.r0 = im0Var;
        im0Var.r(gm.L(22.0f));
        this.r0.q(gm.L(4.0f));
    }

    public void setCircleSize(int i) {
        this.L = i;
        this.M = i;
    }

    public void setEffect(long j) {
        cw3 cw3Var;
        TLRPC.TL_availableEffect Y0 = oc7.r1(z8c.t0).Y0(j);
        if (Y0 != null) {
            cw3Var = gw3.g(Y0.emoticon);
        } else {
            cw3Var = null;
        }
        setEmoji(cw3Var);
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
        td4.a(this, z);
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
