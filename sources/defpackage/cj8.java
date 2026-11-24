package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
public class cj8 extends FrameLayout implements fa6 {
    public final ef1 E;
    public boolean F;
    public final s09 G;
    public boolean H;
    public boolean I;
    public uy2 J;
    public boolean K;
    public boolean L;
    public final ln M;
    public final ln N;
    public wi2 O;
    public float P;
    public boolean Q;
    public ValueAnimator R;
    public final Paint a;
    public final boolean b;
    public final ylb c;
    public float d;
    public boolean e;
    public final aj8 f;
    public final aj8 h;
    public final int n;
    public boolean r;
    public float s;
    public final bj8 w;
    public ValueAnimator x;
    public final Path y;

    public cj8(int i, ylb ylbVar, Context context, boolean z) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.y = new Path();
        this.K = true;
        this.M = new ln(this);
        this.N = new ln(this);
        this.P = 0.0f;
        this.n = i;
        ef1 ef1Var = new ef1();
        this.E = ef1Var;
        ef1Var.n = 1.2f;
        ef1Var.k = false;
        ef1Var.m = 4.0f;
        LinearLayout i2 = hg9.i(context, 0);
        aj8 aj8Var = new aj8(this, context, (byte) 0);
        this.f = aj8Var;
        aj8Var.b(0.35f, 350L, d53.h);
        aj8Var.setGravity(17);
        aj8Var.setTextColor(-1);
        aj8Var.setTextSize(gm.L(14.0f));
        aj8Var.setTypeface(gm.o());
        ?? imageView = new ImageView(context);
        this.G = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        bj8 bj8Var = new bj8(this, context);
        this.w = bj8Var;
        bj8Var.addView(i2, qoe.e(-2, -2, 17));
        int p = on2.p(-1, 120);
        bj8Var.setBackground(cmb.i0(i, i, i, i, 0, p, p));
        i2.addView(aj8Var, qoe.r(-2, -2, 16));
        i2.addView((View) imageView, qoe.q(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(bj8Var);
        setOutlineProvider(agc.b);
        setClipToOutline(true);
        rve.b(this, 0.02f, 1.2f);
        if (z) {
            aj8 aj8Var2 = new aj8(this, context, (byte) 1);
            this.h = aj8Var2;
            aj8Var2.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
            aj8Var2.setGravity(17);
            anb.U(aj8Var2, cmb.Ii, ylbVar);
            aj8Var2.setTextSize(gm.L(14.0f));
            aj8Var2.setTypeface(gm.o());
            aj8Var2.getDrawable().K = true;
            int L = gm.L(8.0f);
            int p2 = on2.p(-1, 120);
            aj8Var2.setBackground(cmb.i0(L, L, L, L, 0, p2, p2));
            addView(aj8Var2);
            paint.setColor(cmb.v0(cmb.Ei, ylbVar));
            this.b = true;
            this.c = ylbVar;
            e();
        }
    }

    @Override
    public final boolean a() {
        return this.Q;
    }

    public final void b(String str, View.OnClickListener onClickListener, boolean z) {
        if (!this.H && z) {
            z = true;
        }
        this.H = true;
        aj8 aj8Var = this.f;
        if (z && aj8Var.c.h()) {
            aj8Var.a();
        }
        aj8Var.c(str, z, true);
        bj8 bj8Var = this.w;
        bj8Var.setContentDescription(str);
        if (!this.L) {
            bj8Var.setOnClickListener(onClickListener);
        }
    }

    public final void c(CharSequence charSequence, boolean z, boolean z2) {
        this.r = true;
        this.F = z;
        aj8 aj8Var = this.h;
        aj8Var.c(charSequence, z2, true);
        aj8Var.setContentDescription(charSequence);
        d(z2);
    }

    public final void d(boolean z) {
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.x.cancel();
        }
        float f = 0.0f;
        if (!z) {
            if (this.r) {
                f = 1.0f;
            }
            this.s = f;
            e();
            return;
        }
        float f2 = this.s;
        if (this.r) {
            f = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.x = ofFloat;
        ofFloat.addUpdateListener(new af0(this, (byte) 10));
        this.x.addListener(new s38(this, (byte) 19));
        this.x.setDuration(250L);
        this.x.setInterpolator(d53.f);
        this.x.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L;
        uy2 uy2Var = this.J;
        aj8 aj8Var = this.h;
        if (uy2Var != null) {
            ty2 ty2Var = uy2Var.a;
            if (ty2Var.h == 0) {
                L = 0;
            } else {
                L = gm.L(11.0f) + ty2Var.s;
            }
            ln lnVar = this.M;
            lnVar.e(false, ((L * 0.85f) + gm.L(3.0f)) / 2.0f);
            float e = (aj8Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + gm.L(3.0f);
            ln lnVar2 = this.N;
            lnVar2.e(false, e);
            aj8Var.setTranslationX(-lnVar.c);
            this.J.setTranslationX(lnVar2.c - lnVar.c);
        } else if (aj8Var != null) {
            aj8Var.setTranslationX(0.0f);
        }
        RectF rectF = gm.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i = (this.s > 1.0f ? 1 : (this.s == 1.0f ? 0 : -1));
        ylb ylbVar = this.c;
        boolean z = this.b;
        int i2 = this.n;
        Paint paint = this.a;
        if (i != 0 || !this.F) {
            boolean z2 = this.e;
            float f = this.d;
            if (z2) {
                float f2 = f + 0.016f;
                this.d = f2;
                if (f2 > 3.0f) {
                    this.e = false;
                }
            } else {
                float f3 = f - 0.016f;
                this.d = f3;
                if (f3 < 1.0f) {
                    this.e = true;
                }
            }
            if (this.K) {
                oj8.d().f((-getMeasuredWidth()) * 0.1f * this.d, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f4 = i2;
                canvas.drawRoundRect(rectF, f4, f4, oj8.d().e());
            } else {
                if (z) {
                    paint.setColor(cmb.v0(cmb.Ei, ylbVar));
                }
                paint.setAlpha(255);
                float f5 = i2;
                canvas.drawRoundRect(rectF, f5, f5, paint);
            }
            invalidate();
        }
        boolean z3 = e21.a;
        if (!this.I) {
            int measuredWidth = getMeasuredWidth();
            ef1 ef1Var = this.E;
            ef1Var.f = measuredWidth;
            ef1Var.a(i2, canvas, rectF, null);
        }
        if (this.s != 0.0f && this.F) {
            if (z) {
                paint.setColor(cmb.v0(cmb.Ei, ylbVar));
            }
            paint.setAlpha((int) (this.s * 255.0f));
            if (this.s != 1.0f) {
                Path path = this.y;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.s, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float f6 = i2;
                canvas.drawRoundRect(rectF, f6, f6, paint);
                canvas.restore();
            } else {
                float f7 = i2;
                canvas.drawRoundRect(rectF, f7, f7, paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        int i;
        float f = this.s;
        aj8 aj8Var = this.h;
        aj8Var.setAlpha(f);
        aj8Var.setTranslationY((1.0f - this.s) * gm.L(12.0f));
        bj8 bj8Var = this.w;
        bj8Var.setAlpha(1.0f - this.s);
        bj8Var.setTranslationY((-gm.L(12.0f)) * this.s);
        int i2 = 0;
        if (this.s == 1.0f) {
            i = 4;
        } else {
            i = 0;
        }
        bj8Var.setVisibility(i);
        if (this.s == 0.0f) {
            i2 = 4;
        }
        aj8Var.setVisibility(i2);
        invalidate();
    }

    public s09 getIconView() {
        return this.G;
    }

    public io getTextView() {
        return this.f;
    }

    @Override
    public final boolean isEnabled() {
        return this.w.isEnabled();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.w.setEnabled(z);
    }

    public void setFlickerDisabled(boolean z) {
        this.I = z;
        invalidate();
    }

    public void setIcon(int i) {
        s09 s09Var = this.G;
        s09Var.f(i, 24, 24, null);
        ef1 ef1Var = this.E;
        ef1Var.g = 2.0f;
        ef1Var.p = new q78(this, (byte) 21);
        invalidate();
        s09Var.setVisibility(0);
    }

    @Override
    public void setLoading(boolean z) {
        float f;
        if (this.Q != z) {
            ValueAnimator valueAnimator = this.R;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.R = null;
            }
            float f2 = this.P;
            this.Q = z;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.R = ofFloat;
            ofFloat.addUpdateListener(new fx7(this, (byte) 11));
            this.R.addListener(new jf4((byte) 25, this, z));
            this.R.setDuration(320L);
            this.R.setInterpolator(d53.h);
            this.R.start();
        }
    }

    public cj8(ylb ylbVar, Context context, boolean z) {
        this(gm.L(8.0f), ylbVar, context, z);
    }
}
