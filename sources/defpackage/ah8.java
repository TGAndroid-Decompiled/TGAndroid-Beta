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
public class ah8 extends FrameLayout implements g86 {
    public final wd1 E;
    public boolean F;
    public final ry8 G;
    public boolean H;
    public boolean I;
    public kx2 J;
    public boolean K;
    public boolean L;
    public final lm M;
    public final lm N;
    public ih2 O;
    public float P;
    public boolean Q;
    public ValueAnimator R;
    public final Paint a;
    public final boolean b;
    public final wjb c;
    public float d;
    public boolean e;
    public final yg8 f;
    public final yg8 h;
    public final int n;
    public boolean r;
    public float s;
    public final zg8 w;
    public ValueAnimator x;
    public final Path y;

    public ah8(int i, wjb wjbVar, Context context, boolean z) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.y = new Path();
        this.K = true;
        this.M = new lm(this);
        this.N = new lm(this);
        this.P = 0.0f;
        this.n = i;
        wd1 wd1Var = new wd1();
        this.E = wd1Var;
        wd1Var.n = 1.2f;
        wd1Var.k = false;
        wd1Var.m = 4.0f;
        LinearLayout j = de9.j(context, 0);
        yg8 yg8Var = new yg8(this, context, (byte) 0);
        this.f = yg8Var;
        yg8Var.b(0.35f, 350L, s33.h);
        yg8Var.setGravity(17);
        yg8Var.setTextColor(-1);
        yg8Var.setTextSize(gl.L(14.0f));
        yg8Var.setTypeface(gl.o());
        ?? imageView = new ImageView(context);
        this.G = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        zg8 zg8Var = new zg8(this, context);
        this.w = zg8Var;
        zg8Var.addView(j, nme.e(-2, -2, 17));
        int o = bm2.o(-1, 120);
        zg8Var.setBackground(bkb.i0(i, i, i, i, 0, o, o));
        j.addView(yg8Var, nme.r(-2, -2, 16));
        j.addView((View) imageView, nme.q(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(zg8Var);
        setOutlineProvider(zdc.b);
        setClipToOutline(true);
        ote.b(this, 0.02f, 1.2f);
        if (z) {
            yg8 yg8Var2 = new yg8(this, context, (byte) 1);
            this.h = yg8Var2;
            yg8Var2.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
            yg8Var2.setGravity(17);
            zkb.U(yg8Var2, bkb.Ii, wjbVar);
            yg8Var2.setTextSize(gl.L(14.0f));
            yg8Var2.setTypeface(gl.o());
            yg8Var2.getDrawable().K = true;
            int L = gl.L(8.0f);
            int o2 = bm2.o(-1, 120);
            yg8Var2.setBackground(bkb.i0(L, L, L, L, 0, o2, o2));
            addView(yg8Var2);
            paint.setColor(bkb.v0(bkb.Ei, wjbVar));
            this.b = true;
            this.c = wjbVar;
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
        yg8 yg8Var = this.f;
        if (z && yg8Var.c.h()) {
            yg8Var.a();
        }
        yg8Var.c(str, z, true);
        zg8 zg8Var = this.w;
        zg8Var.setContentDescription(str);
        if (!this.L) {
            zg8Var.setOnClickListener(onClickListener);
        }
    }

    public final void c(CharSequence charSequence, boolean z, boolean z2) {
        this.r = true;
        this.F = z;
        yg8 yg8Var = this.h;
        yg8Var.c(charSequence, z2, true);
        yg8Var.setContentDescription(charSequence);
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
        ofFloat.addUpdateListener(new ae0(this, (byte) 10));
        this.x.addListener(new l48(this, (byte) 17));
        this.x.setDuration(250L);
        this.x.setInterpolator(s33.f);
        this.x.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L;
        kx2 kx2Var = this.J;
        yg8 yg8Var = this.h;
        if (kx2Var != null) {
            jx2 jx2Var = kx2Var.a;
            if (jx2Var.h == 0) {
                L = 0;
            } else {
                L = gl.L(11.0f) + jx2Var.s;
            }
            lm lmVar = this.M;
            lmVar.e(false, ((L * 0.85f) + gl.L(3.0f)) / 2.0f);
            float e = (yg8Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + gl.L(3.0f);
            lm lmVar2 = this.N;
            lmVar2.e(false, e);
            yg8Var.setTranslationX(-lmVar.c);
            this.J.setTranslationX(lmVar2.c - lmVar.c);
        } else if (yg8Var != null) {
            yg8Var.setTranslationX(0.0f);
        }
        RectF rectF = gl.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i = (this.s > 1.0f ? 1 : (this.s == 1.0f ? 0 : -1));
        wjb wjbVar = this.c;
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
                nh8.d().f((-getMeasuredWidth()) * 0.1f * this.d, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f4 = i2;
                canvas.drawRoundRect(rectF, f4, f4, nh8.d().e());
            } else {
                if (z) {
                    paint.setColor(bkb.v0(bkb.Ei, wjbVar));
                }
                paint.setAlpha(255);
                float f5 = i2;
                canvas.drawRoundRect(rectF, f5, f5, paint);
            }
            invalidate();
        }
        boolean z3 = w01.a;
        if (!this.I) {
            int measuredWidth = getMeasuredWidth();
            wd1 wd1Var = this.E;
            wd1Var.f = measuredWidth;
            wd1Var.a(i2, canvas, rectF, null);
        }
        if (this.s != 0.0f && this.F) {
            if (z) {
                paint.setColor(bkb.v0(bkb.Ei, wjbVar));
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
        yg8 yg8Var = this.h;
        yg8Var.setAlpha(f);
        yg8Var.setTranslationY((1.0f - this.s) * gl.L(12.0f));
        zg8 zg8Var = this.w;
        zg8Var.setAlpha(1.0f - this.s);
        zg8Var.setTranslationY((-gl.L(12.0f)) * this.s);
        int i2 = 0;
        if (this.s == 1.0f) {
            i = 4;
        } else {
            i = 0;
        }
        zg8Var.setVisibility(i);
        if (this.s == 0.0f) {
            i2 = 4;
        }
        yg8Var.setVisibility(i2);
        invalidate();
    }

    public ry8 getIconView() {
        return this.G;
    }

    public hn getTextView() {
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
        ry8 ry8Var = this.G;
        ry8Var.f(i, 24, 24, null);
        wd1 wd1Var = this.E;
        wd1Var.g = 2.0f;
        wd1Var.p = new w88(this, (byte) 14);
        invalidate();
        ry8Var.setVisibility(0);
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
            ofFloat.addUpdateListener(new u28(this, (byte) 9));
            this.R.addListener(new id4((byte) 25, this, z));
            this.R.setDuration(320L);
            this.R.setInterpolator(s33.h);
            this.R.start();
        }
    }

    public ah8(wjb wjbVar, Context context, boolean z) {
        this(gl.L(8.0f), wjbVar, context, z);
    }
}
