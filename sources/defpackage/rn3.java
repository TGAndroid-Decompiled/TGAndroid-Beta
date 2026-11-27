package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
public final class rn3 extends FrameLayout {
    public static TextPaint K0;
    public static Paint L0;
    public boolean A0;
    public float B0;
    public final mm C0;
    public final mm D0;
    public final Paint E;
    public final mm E0;
    public final Paint F;
    public String[] F0;
    public final Paint G;
    public final mm G0;
    public final Path H;
    public zv4 H0;
    public jl0 I;
    public final mm I0;
    public jl0 J;
    public jl0 K;
    public jl0 L;
    public final RectF M;
    public final RectF N;
    public final RectF O;
    public final RectF P;
    public final RectF Q;
    public final RectF R;
    public final int[] S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final mm W;
    public final bn3 a;
    public final mm a0;
    public final vnb b;
    public final mm b0;
    public final View c;
    public final mm c0;
    public final View d;
    public final mm d0;
    public final hc e;
    public final mm e0;
    public final Drawable f;
    public final mm f0;
    public int g0;
    public final Drawable h;
    public boolean h0;
    public boolean i0;
    public int j0;
    public int k0;
    public float l0;
    public float m0;
    public final Drawable n;
    public boolean n0;
    public final RectF o0;
    public float p0;
    public final Path q0;
    public final Drawable r;
    public boolean r0;
    public final hn s;
    public final mm s0;
    public final Paint t0;
    public long u0;
    public final mm v0;
    public final Paint w;
    public final String w0;
    public final Paint x;
    public final hn x0;
    public final Paint y;
    public boolean y0;
    public boolean z0;
    public static final k43 J0 = new k43(0.34d, 1.32d, 0.5d, 1.0d);
    public static final RectF M0 = new RectF();
    public static final float N0 = hl.L(36.0f);
    public static final float O0 = hl.L(8.0f);

    public rn3(Context context, vnb vnbVar, bn3 bn3Var) {
        super(context);
        this.w = new Paint(1);
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new Paint(1);
        this.E = new Paint(1);
        new Paint(1);
        this.F = new Paint(1);
        Paint paint2 = new Paint(1);
        this.G = paint2;
        Path path = new Path();
        this.H = path;
        this.M = new RectF();
        this.N = new RectF();
        this.O = new RectF();
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new int[2];
        this.W = new mm(this, 0L, 280L, new k43(0.0f, 0.0f, 1.0f, 1.0f));
        k43 k43Var = k43.h;
        this.a0 = new mm(this, 0L, 240L, k43Var);
        k43 k43Var2 = J0;
        this.b0 = new mm(this, 0L, 460L, k43Var2);
        k43 k43Var3 = k43.g;
        this.c0 = new mm(this, 0L, 260L, k43Var3);
        this.d0 = new mm(this, 0L, 160L, k43Var);
        this.e0 = new mm(this, 0L, 160L, k43Var);
        this.f0 = new mm(this, 0L, 160L, k43Var);
        this.g0 = -1;
        this.o0 = new RectF();
        this.p0 = -1.0f;
        this.q0 = new Path();
        this.s0 = new mm(this, 0L, 300L, k43Var);
        this.t0 = new Paint(1);
        this.v0 = new mm(this, 0L, 260L, k43Var3);
        String M02 = ob6.M0(2131744986, null);
        this.w0 = M02;
        this.z0 = true;
        this.C0 = new mm(this, 0L, 380L, k43Var2);
        this.D0 = new mm(this, 0L, 260L, k43Var3);
        this.E0 = new mm(this, 0L, 260L, k43Var3);
        this.G0 = new mm(this, 0L, 160L, k43Var);
        this.I0 = new mm(this, 0L, 300L, k43Var);
        this.a = bn3Var;
        this.b = vnbVar;
        setWillNotDraw(false);
        setClipChildren(false);
        View view = new View(context);
        this.c = view;
        addView(view, new FrameLayout.LayoutParams(hl.L(10.0f), hl.L(10.0f)));
        View view2 = new View(context);
        this.d = view2;
        addView(view2, new FrameLayout.LayoutParams(hl.L(10.0f), hl.L(10.0f)));
        hc hcVar = new hc(context);
        this.e = hcVar;
        hcVar.setCallback(this);
        this.f = context.getResources().getDrawable(2131230871).mutate();
        this.h = c00.e(context, 2131231003);
        this.n = c00.e(context, 2131232365);
        this.r = c00.e(context, 2131232199);
        hn hnVar = new hn(false, false, false);
        this.s = hnVar;
        hnVar.n(0.33f, 260L, k43Var3);
        hnVar.A = true;
        hnVar.w(hl.L(15.0f));
        hnVar.x(hl.o());
        hnVar.setCallback(this);
        hnVar.t(ob6.M0(2131744979, null), false, true);
        hn hnVar2 = new hn(false, false, false);
        this.x0 = hnVar2;
        hnVar2.n(0.33f, 260L, k43Var3);
        hnVar2.w(hl.L(15.0f));
        hnVar2.x(hl.o());
        hnVar2.setCallback(this);
        hnVar2.t(M02, false, true);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(hl.N(1.75f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        path.moveTo(-hl.N(3.8f), hl.N(3.8f));
        path.lineTo(0.0f, 0.0f);
        path.lineTo(hl.N(3.8f), hl.N(3.8f));
        paint.setStyle(style);
        paint.setStrokeWidth(hl.N(0.66f));
        f();
    }

    public static void b(Canvas canvas, String[] strArr, float f, float f2, int i, boolean z, float f3) {
        int i2;
        Paint paint;
        int i3;
        Paint paint2;
        if (strArr != null && strArr.length != 0) {
            float f4 = 0.0f;
            if (f3 > 0.0f) {
                if (K0 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    K0 = textPaint;
                    textPaint.setTypeface(Typeface.MONOSPACE);
                    L0 = new Paint(1);
                }
                K0.setTextSize(hl.L(12.0f));
                K0.setColor(i);
                K0.setAlpha((int) (255.0f * f3));
                for (String str : strArr) {
                    f4 = Math.max(f4, K0.measureText(str));
                }
                float L = hl.L(16.0f);
                float L2 = hl.L(12.0f);
                float L3 = hl.L(8.0f);
                float L4 = hl.L(14.0f);
                float i4 = bs2.i(L2, 2.0f, f, f4);
                RectF rectF = M0;
                rectF.set(f, (f2 - (L3 * 2.0f)) - (strArr.length * L), i4, f2);
                L0.setStyle(Paint.Style.FILL);
                Paint paint3 = L0;
                if (z) {
                    i2 = -265934287;
                } else {
                    i2 = -167772161;
                }
                paint3.setColor(i2);
                L0.setAlpha((int) (paint.getAlpha() * f3));
                canvas.drawRoundRect(rectF, L4, L4, L0);
                L0.setStyle(Paint.Style.STROKE);
                L0.setStrokeWidth(hl.N(0.66f));
                Paint paint4 = L0;
                if (z) {
                    i3 = 654311423;
                } else {
                    i3 = 335544320;
                }
                paint4.setColor(i3);
                L0.setAlpha((int) (paint2.getAlpha() * f3));
                canvas.drawRoundRect(rectF, L4, L4, L0);
                for (int i5 = 0; i5 < strArr.length; i5++) {
                    canvas.drawText(strArr[i5], rectF.left + L2, (i5 * L) + rectF.top + L3 + hl.L(12.0f), K0);
                }
            }
        }
    }

    public final void a() {
        zv4 zv4Var = this.H0;
        if (zv4Var != null && !zv4Var.O) {
            zv4Var.c(null);
            invalidate();
        }
    }

    public final void c(Canvas canvas, jl0 jl0Var, RectF rectF, float f) {
        if (f <= 0.0f) {
            return;
        }
        float height = rectF.height() / 2.0f;
        if (jl0Var != null) {
            if (jl0Var == this.I && Math.abs(this.p0 - height) > 0.5f) {
                this.p0 = height;
                jl0Var.r(height);
            }
            jl0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            jl0Var.setAlpha((int) (f * 255.0f));
            jl0Var.draw(canvas);
            return;
        }
        Paint paint = this.y;
        paint.setAlpha((int) (255.0f * f));
        canvas.drawRoundRect(rectF, height, height, paint);
        Paint paint2 = this.w;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * f));
        canvas.drawRoundRect(rectF, height, height, paint2);
        paint2.setAlpha(alpha);
        Paint paint3 = this.x;
        int alpha2 = paint3.getAlpha();
        paint3.setAlpha((int) (alpha2 * f));
        canvas.drawRoundRect(rectF, height, height, paint3);
        paint3.setAlpha(alpha2);
    }

    public final int d(float f, float f2) {
        float L = hl.L(4.0f);
        if (this.y0 && this.C0.c > 0.7f) {
            RectF rectF = this.P;
            if (!rectF.isEmpty() && f2 >= rectF.top - L && f2 <= rectF.bottom + L) {
                RectF rectF2 = this.R;
                int i = (f > (rectF2.left - L) ? 1 : (f == (rectF2.left - L) ? 0 : -1));
                float f3 = O0;
                if (i >= 0) {
                    if (f < (f3 / 2.0f) + rectF2.right) {
                        return 3;
                    }
                }
                if (f >= rectF.left - (f3 / 2.0f) && f <= rectF.right + L) {
                    return 4;
                }
            }
        }
        if (this.T && this.W.c >= 0.7f) {
            RectF rectF3 = this.O;
            if (!rectF3.isEmpty() && f >= rectF3.left - L && f <= rectF3.right + L && f2 >= rectF3.top - L && f2 <= rectF3.bottom + L) {
                return 2;
            }
            RectF rectF4 = this.N;
            if (!rectF4.isEmpty() && f2 >= rectF4.top - L && f2 <= rectF4.bottom + L && f >= rectF4.left - L && f <= rectF4.right + L) {
                RectF rectF5 = this.Q;
                if (!rectF5.isEmpty() && rectF5.contains(f, Math.max(rectF4.top, Math.min(rectF4.bottom - 1.0f, f2)))) {
                    return 1;
                }
                return 0;
            }
        }
        return -1;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int[] iArr;
        boolean z;
        hn hnVar;
        RectF rectF;
        Path path;
        boolean z2;
        boolean z3;
        float f2;
        float f3;
        boolean z4;
        boolean z5;
        float f4;
        float f5;
        int i;
        Path path2;
        float f6;
        float f7;
        TextPaint textPaint;
        boolean z6;
        boolean z7;
        float f8;
        RectF rectF2;
        float f9;
        float R1;
        float min;
        float f10;
        float f11;
        float f12;
        float f13;
        RectF rectF3;
        RectF rectF4;
        float f14;
        float f15;
        boolean z8;
        float f16;
        int L;
        long j;
        Canvas canvas2 = canvas;
        boolean z9 = this.T;
        mm mmVar = this.W;
        float d = mmVar.d(z9);
        float d2 = this.a0.d(!this.T);
        if (!this.T) {
            d = Math.min(1.0f, d) * (1.0f - d2);
        }
        if (!this.T && d2 >= 1.0f) {
            mmVar.e(true, 0.0f);
            f = 0.0f;
        } else {
            f = d;
        }
        float d3 = this.C0.d(this.y0);
        int L2 = hl.L(18.0f) + hl.L(12.0f);
        hn hnVar2 = this.x0;
        float L3 = hl.L(6.0f) + L2 + hnVar2.d + hl.L(8.0f) + hl.L(8.0f) + hl.L(13.0f);
        boolean z10 = this.z0;
        mm mmVar2 = this.D0;
        if (z10) {
            this.z0 = false;
            mmVar2.e(true, L3);
        }
        this.B0 = mmVar2.e(false, L3);
        int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        RectF rectF5 = this.M;
        if ((i2 <= 0 && d3 <= 0.0f) || !this.a.p(rectF5)) {
            z = false;
        } else {
            getLocationInWindow(this.S);
            rectF5.offset(-iArr[0], -iArr[1]);
            z = true;
        }
        Path path3 = this.H;
        float f17 = O0;
        float f18 = N0;
        RectF rectF6 = this.N;
        RectF rectF7 = this.O;
        Paint paint = this.G;
        if (i2 > 0 && z) {
            boolean z11 = this.T;
            float L4 = hl.L(36.0f);
            f3 = 2.0f;
            float d4 = this.v0.d(this.V);
            hn hnVar3 = this.s;
            float f19 = hnVar3.d;
            TextPaint textPaint2 = hnVar3.a;
            float L5 = hl.L(16.0f);
            if (this.V) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            float f20 = (f4 * L5) + f19;
            float d5 = this.s0.d(this.r0);
            float L6 = hl.L(6.0f) + hl.L(24.0f) + hl.L(12.0f) + f20 + hl.L(12.0f);
            if (this.r0) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            int L7 = hl.L(1.0f);
            int L8 = hl.L(14.0f);
            float L9 = ((hl.L(10.0f) + L8 + hl.L(8.0f) + L7) * (1.0f - f5)) + L6;
            if (this.r0) {
                i = hl.L(4.0f);
            } else {
                i = 0;
            }
            float f21 = L9 + i;
            boolean z12 = this.n0;
            mm mmVar3 = this.c0;
            if (z12) {
                path2 = path3;
                this.n0 = false;
                mmVar3.e(true, f21);
            } else {
                path2 = path3;
            }
            float e = mmVar3.e(false, f21);
            float L10 = rectF5.left + hl.L(2.0f);
            if (this.y0) {
                f6 = e;
                f7 = f18 + f17 + this.B0 + f17;
            } else {
                f6 = e;
                f7 = 0.0f;
            }
            float f22 = L10 + f7;
            float L11 = rectF5.top - hl.L(8.0f);
            rectF6.set(f22, L11 - L4, f22 + f6, L11);
            View view = this.c;
            if (Math.abs(view.getLeft() - rectF6.left) <= 1.0f && Math.abs(view.getTop() - rectF6.top) <= 1.0f && Math.abs(view.getWidth() - rectF6.width()) <= 1.0f && view.getHeight() == ((int) L4)) {
                textPaint = textPaint2;
            } else {
                textPaint = textPaint2;
                view.layout((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
            }
            zv4 zv4Var = this.H0;
            if (zv4Var != null && !zv4Var.O) {
                z6 = true;
            } else {
                z6 = false;
            }
            float d6 = this.I0.d(z6);
            int i3 = this.g0;
            if (i3 != 0 && i3 != 1) {
                z7 = false;
            } else {
                z7 = true;
            }
            float d7 = this.d0.d(z7);
            RectF rectF8 = this.o0;
            if (z11 && f < 1.0f) {
                float max = Math.max(0.0f, f);
                float f23 = 1.0f - max;
                float min2 = 1.0f - Math.min(1.0f, max / 0.55f);
                float sin = ((((float) Math.sin(Math.min(1.0f, max / 0.8f) * 3.141592653589793d)) * 0.07f * f23) + ((1.0f - (min2 * min2)) * 0.38f) + 0.62f) * L4;
                float max2 = Math.max(sin, hl.R1(L4 * 0.62f, rectF6.width(), 1.0f - ((float) Math.pow(f23, 3.0d))));
                float f24 = rectF6.left;
                float f25 = rectF6.bottom;
                f8 = d7;
                rectF2 = rectF8;
                rectF2.set(f24, f25 - sin, max2 + f24, f25);
                f9 = 1.0f;
                min = Math.min(1.0f, max * 3.0f) * 1.0f;
                R1 = 1.0f;
                f10 = Math.max(0.0f, Math.min(1.0f, (max - 0.62f) / 0.38f)) * 1.0f;
            } else {
                f8 = d7;
                rectF2 = rectF8;
                f9 = 1.0f;
                rectF2.set(rectF6);
                if (z11) {
                    R1 = 1.0f;
                } else {
                    R1 = hl.R1(0.85f, 1.0f, f);
                }
                min = Math.min(1.0f, f) * 1.0f;
                f10 = min;
            }
            canvas2.save();
            float f26 = (f9 - (f8 * 0.04f)) * R1;
            float f27 = f9;
            canvas2.scale(f26, f26, rectF6.left + hl.L(18.0f), rectF6.bottom);
            if (z11 && f < f27 && rectF2.width() > 0.0f) {
                c(canvas2, this.I, rectF2, min);
                f11 = L4;
                RectF rectF9 = rectF2;
                rectF4 = rectF7;
                f2 = d3;
                f12 = d4;
                f13 = f;
                hnVar = hnVar2;
                path = path2;
                rectF = rectF5;
                z2 = false;
                z3 = true;
                rectF3 = rectF6;
                dz4.a(canvas, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, rectF2.height() / 2.0f, this.i0, min * this.m0, this.l0);
                Path path4 = this.q0;
                path4.rewind();
                path4.addRoundRect(rectF9, rectF9.height() / 2.0f, rectF9.height() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path4);
                canvas2 = canvas;
            } else {
                float f28 = min;
                f11 = L4;
                f12 = d4;
                f13 = f;
                f2 = d3;
                hnVar = hnVar2;
                path = path2;
                rectF = rectF5;
                z2 = false;
                z3 = true;
                rectF3 = rectF6;
                rectF4 = rectF7;
                c(canvas2, this.I, rectF3, f28);
                canvas2 = canvas;
                dz4.a(canvas2, rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, rectF3.height() / 2.0f, this.i0, this.m0 * f28, this.l0);
            }
            if (f10 > 0.0f) {
                float L12 = rectF3.left + hl.L(12.0f);
                float centerY = rectF3.centerY();
                int i4 = (int) (f10 * 255.0f);
                if (d5 < 1.0f) {
                    f14 = 0.01f;
                    hc hcVar = this.e;
                    hcVar.setAlpha((int) (i4 * (1.0f - d5)));
                    canvas2.save();
                    float R12 = hl.R1(1.0f, 0.6f, d5);
                    canvas2.scale(R12, R12, hl.L(12.0f) + L12, centerY);
                    f15 = 0.4f;
                    hcVar.setBounds((int) L12, (int) (centerY - hl.L(12.0f)), (int) (hl.L(24.0f) + L12), (int) (hl.L(12.0f) + centerY));
                    hcVar.draw(canvas2);
                    canvas2.restore();
                } else {
                    f14 = 0.01f;
                    f15 = 0.4f;
                }
                if (d5 > 0.0f) {
                    int i5 = this.j0;
                    Paint paint2 = this.t0;
                    paint2.setColor(i5);
                    paint2.setAlpha((int) (i4 * d5));
                    float R13 = hl.R1(0.6f, 1.0f, d5) * hl.N(5.0f);
                    RectF rectF10 = hl.P;
                    f16 = L12;
                    rectF10.set((hl.L(12.0f) + L12) - R13, centerY - R13, f16 + hl.L(12.0f) + R13, R13 + centerY);
                    canvas2.drawRoundRect(rectF10, hl.N(2.2f), hl.N(2.2f), paint2);
                } else {
                    f16 = L12;
                }
                float L13 = f16 + hl.L(6.0f) + hl.L(24.0f);
                hnVar3.C = i4;
                hnVar3.setBounds((int) L13, (int) (centerY - hl.L(12.0f)), (int) (hl.L(240.0f) + L13), (int) (hl.L(12.0f) + centerY));
                if (textPaint.getShader() != null) {
                    textPaint.setShader(null);
                }
                canvas2.save();
                float L14 = L13 - hl.L(2.0f);
                float f29 = rectF3.top;
                boolean z13 = this.r0;
                float f30 = rectF3.right;
                if (z13) {
                    L = hl.L(6.0f);
                } else {
                    f30 = (((f30 - hl.L(10.0f)) - hl.L(14.0f)) - hl.L(8.0f)) - hl.L(1.0f);
                    L = hl.L(4.0f);
                }
                canvas2.clipRect(L14, f29, f30 - L, rectF3.bottom);
                hnVar3.draw(canvas2);
                if (f12 > f14) {
                    float c = hnVar3.c() + L13 + hl.L(3.0f);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    int i6 = this.j0;
                    Paint paint3 = this.F;
                    paint3.setColor(i6);
                    for (int i7 = z2; i7 < 3; i7++) {
                        float f31 = c;
                        paint3.setAlpha((int) (i4 * f12 * ((Math.max(0.0f, (float) Math.sin(((((float) (j - this.u0)) / 1200.0f) - (((float) i7) * 0.18f)) * 3.141592653589793d * 2.0d)) * 0.65f) + 0.35f)));
                        canvas2.drawCircle((hl.L(4.5f) * i7) + f31, hl.L(4.5f) + centerY, hl.N(1.4f), paint3);
                        c = f31;
                        uptimeMillis = uptimeMillis;
                    }
                    invalidate();
                }
                canvas2.restore();
                float L15 = (((rectF3.right - hl.L(10.0f)) - hl.L(14.0f)) - hl.L(8.0f)) - hl.L(1.0f);
                Paint paint4 = this.E;
                paint4.setAlpha((aob.p1(0.14f, this.j0) >>> 24) & 255);
                int alpha = paint4.getAlpha();
                float f32 = 1.0f - d5;
                paint4.setAlpha((int) (alpha * f10 * f32));
                canvas2.drawRect(L15, centerY - hl.L(9.0f), hl.N(1.0f) + L15, hl.L(9.0f) + centerY, paint4);
                paint4.setAlpha(alpha);
                boolean z14 = this.r0;
                RectF rectF11 = this.Q;
                if (z14) {
                    rectF11.setEmpty();
                } else {
                    rectF11.set(L15 - hl.L(4.0f), rectF3.top, rectF3.right, rectF3.bottom);
                }
                float L16 = (rectF3.right - hl.L(10.0f)) - hl.L(7.0f);
                paint.setAlpha((int) (i4 * f32));
                canvas2.save();
                canvas2.translate(L16, ((centerY - hl.N(1.9f)) - hl.N(f15)) - (hl.N(1.0f) * d6));
                canvas2.drawPath(path, paint);
                canvas2.restore();
            } else {
                f14 = 0.01f;
                f15 = 0.4f;
            }
            canvas2.restore();
            float d8 = this.b0.d(this.U) * f13;
            if (d8 > f14) {
                if (this.g0 == 2) {
                    z8 = z3;
                } else {
                    z8 = z2;
                }
                float d9 = this.e0.d(z8);
                rectF4.set(rectF3.right + hl.L(6.0f), rectF3.top, rectF3.right + hl.L(6.0f) + f11, rectF3.bottom);
                float R14 = (1.0f - (d9 * 0.08f)) * hl.R1(f15, 1.0f, d8);
                canvas2.save();
                canvas2.scale(R14, R14, rectF4.centerX(), rectF4.centerY());
                float min3 = Math.min(1.0f, d8 * 1.5f) * 1.0f;
                c(canvas2, this.J, rectF4, min3);
                dz4.a(canvas2, rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, rectF4.height() / 2.0f, this.i0, this.m0 * min3, this.l0);
                int centerX = (int) rectF4.centerX();
                int centerY2 = (int) rectF4.centerY();
                int L17 = centerX - hl.L(12.0f);
                int L18 = centerY2 - hl.L(12.0f);
                int L19 = hl.L(12.0f) + centerX;
                int L20 = hl.L(12.0f) + centerY2;
                Drawable drawable = this.h;
                drawable.setBounds(L17, L18, L19, L20);
                drawable.setAlpha((int) (min3 * 255.0f));
                drawable.draw(canvas2);
                canvas2.restore();
            } else {
                rectF4.setEmpty();
            }
        } else {
            hnVar = hnVar2;
            rectF = rectF5;
            path = path3;
            z2 = false;
            z3 = true;
            f2 = d3;
            f3 = 2.0f;
            rectF6.setEmpty();
            rectF7.setEmpty();
        }
        int i8 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        RectF rectF12 = this.P;
        if (i8 > 0 && z) {
            float L21 = hl.L(36.0f);
            RectF rectF13 = rectF;
            float L22 = rectF13.top - hl.L(8.0f);
            float f33 = L22 - L21;
            RectF rectF14 = this.R;
            rectF14.set(rectF13.left + hl.L(f3), f33, rectF13.left + hl.L(f3) + f18, L22);
            float f34 = rectF14.right + f17;
            rectF12.set(f34, f33, this.B0 + f34, L22);
            View view2 = this.d;
            if (Math.abs(view2.getLeft() - rectF12.left) > 1.0f || Math.abs(view2.getTop() - rectF12.top) > 1.0f || Math.abs(view2.getRight() - rectF12.right) > 1.0f || view2.getHeight() != ((int) L21)) {
                view2.layout((int) rectF12.left, (int) rectF12.top, (int) rectF12.right, (int) rectF12.bottom);
            }
            float f35 = f2;
            float max3 = Math.max(0.0f, Math.min(1.0f, f35));
            float B = xnb.B(max3, f3, 3.0f, max3 * max3);
            float f36 = f35 * 1.5f;
            float max4 = Math.max(0.0f, Math.min(1.0f, f36));
            if (this.g0 == 3) {
                z4 = z3;
            } else {
                z4 = z2;
            }
            float d10 = this.f0.d(z4);
            canvas2.save();
            float f37 = 1.0f - B;
            canvas2.translate(0.0f, hl.L(6.0f) * f37);
            float f38 = (B * 0.1f) + 0.9f;
            float B2 = xnb.B(d10, 0.06f, 1.0f, f38);
            canvas2.scale(B2, B2, rectF14.centerX(), rectF14.centerY());
            c(canvas2, this.L, rectF14, max4);
            float f39 = L21 / 2.0f;
            dz4.a(canvas, rectF14.left, rectF14.top, rectF14.right, rectF14.bottom, f39, this.i0, this.m0 * max4, this.l0);
            int L23 = hl.L(18.5f);
            float f40 = L23 / 2.0f;
            float centerX2 = ((int) rectF14.centerX()) - f40;
            int round = Math.round(centerX2);
            float centerY3 = ((int) rectF14.centerY()) - f40;
            int round2 = Math.round(centerY3);
            int round3 = Math.round(centerX2) + L23;
            int round4 = Math.round(centerY3) + L23;
            Drawable drawable2 = this.n;
            drawable2.setBounds(round, round2, round3, round4);
            float f41 = max4 * 255.0f;
            int i9 = (int) f41;
            drawable2.setAlpha(i9);
            drawable2.draw(canvas);
            canvas.restore();
            if (this.g0 == 4) {
                z5 = z3;
            } else {
                z5 = z2;
            }
            float d11 = this.G0.d(z5);
            canvas.save();
            canvas.translate(0.0f, hl.L(6.0f) * f37);
            float f42 = (1.0f - (d11 * 0.04f)) * f38;
            canvas.scale(f42, f42, rectF12.left + hl.L(18.0f), rectF12.bottom);
            c(canvas, this.K, rectF12, max4);
            dz4.a(canvas, rectF12.left, rectF12.top, rectF12.right, rectF12.bottom, f39, this.i0, this.m0 * max4, this.l0);
            float centerY4 = rectF12.centerY();
            int L24 = (int) (rectF12.left + hl.L(12.0f));
            int L25 = (int) (centerY4 - hl.L(9.0f));
            Drawable drawable3 = this.r;
            drawable3.setBounds(L24, L25, hl.L(18.0f) + L24, hl.L(18.0f) + L25);
            drawable3.setAlpha(i9);
            drawable3.draw(canvas);
            float L26 = (rectF12.right - hl.L(13.0f)) - hl.L(4.0f);
            float L27 = rectF12.left + hl.L(12.0f) + hl.L(18.0f) + hl.L(6.0f);
            hn hnVar4 = hnVar;
            hnVar4.C = (int) (hl.R1(0.5f, 1.0f, this.E0.d(this.A0)) * f41);
            float N = centerY4 - hl.N(1.0f);
            hnVar4.setBounds((int) L27, (int) (N - hl.L(12.0f)), (int) (L27 + hl.L(240.0f)), (int) (N + hl.L(12.0f)));
            canvas.save();
            canvas.clipRect(rectF12.left, rectF12.top, L26 - hl.L(8.0f), rectF12.bottom);
            hnVar4.draw(canvas);
            canvas.restore();
            int alpha2 = paint.getAlpha();
            paint.setAlpha((int) (alpha2 * max4));
            canvas.save();
            canvas.translate(L26, centerY4 - hl.N(1.9f));
            canvas.drawPath(path, paint);
            canvas.restore();
            paint.setAlpha(alpha2);
            canvas.restore();
            b(canvas, this.F0, rectF13.left + hl.L(2.0f), ((rectF13.top - hl.L(8.0f)) - hl.L(36.0f)) - hl.L(8.0f), this.j0, this.i0, Math.max(0.0f, Math.min(1.0f, f36)));
        } else {
            rectF12.setEmpty();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rn3.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void e(String str, boolean z) {
        String str2;
        if (z && !this.V) {
            this.u0 = SystemClock.uptimeMillis();
        }
        this.V = z;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str.toString();
        }
        if (str2.endsWith("…")) {
            str2 = bs2.n(1, 0, str2);
        } else if (str2.endsWith("...")) {
            str2 = bs2.n(3, 0, str2);
        }
        this.s.t(str2, true, true);
        invalidate();
    }

    public final void f() {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4 = aob.d6;
        vnb vnbVar = this.b;
        if (hl.B(aob.v0(i4, vnbVar)) < 0.5f) {
            z = true;
        } else {
            z = false;
        }
        this.i0 = z;
        int v0 = aob.v0(aob.G6, vnbVar);
        this.j0 = v0;
        this.k0 = v0;
        this.s.u(v0);
        this.x0.u(this.j0);
        int i5 = this.k0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.e.setColorFilter(new PorterDuffColorFilter(i5, mode));
        this.f.setColorFilter(new PorterDuffColorFilter(this.k0, mode));
        this.G.setColor(this.k0);
        this.h.setColorFilter(new PorterDuffColorFilter(this.k0, mode));
        this.n.setColorFilter(new PorterDuffColorFilter(this.k0, mode));
        this.r.setColorFilter(new PorterDuffColorFilter(this.k0, mode));
        if (this.i0) {
            i = -651810255;
        } else {
            i = -335544321;
        }
        this.w.setColor(i);
        if (this.i0) {
            i2 = 654311423;
        } else {
            i2 = 335544320;
        }
        this.x.setColor(i2);
        this.E.setColor(aob.p1(0.14f, this.j0));
        Paint paint = this.y;
        paint.setColor(16777216);
        float L = hl.L(8.0f);
        float L2 = hl.L(2.0f);
        if (this.i0) {
            i3 = 1426063360;
        } else {
            i3 = 570425344;
        }
        paint.setShadowLayer(L, 0.0f, L2, i3);
        jl0 jl0Var = this.I;
        if (jl0Var != null) {
            jl0Var.updateColors();
        }
        jl0 jl0Var2 = this.J;
        if (jl0Var2 != null) {
            jl0Var2.updateColors();
        }
        jl0 jl0Var3 = this.K;
        if (jl0Var3 != null) {
            jl0Var3.updateColors();
        }
        jl0 jl0Var4 = this.L;
        if (jl0Var4 != null) {
            jl0Var4.updateColors();
        }
        invalidate();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt != this.c && childAt != this.d) {
                childAt.layout(0, 0, i3 - i, i4 - i2);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view == this.H0) {
            this.H0 = null;
            invalidate();
        }
    }

    public void setDetected(String[] strArr) {
        this.F0 = strArr;
        invalidate();
    }

    public void setGearGlass(jl0 jl0Var) {
        this.L = jl0Var;
        if (jl0Var != null) {
            jl0Var.r(hl.L(18.0f));
        }
    }

    public void setIsland(boolean z) {
        if (this.T == z) {
            return;
        }
        this.T = z;
        if (z) {
            this.a0.e(true, 0.0f);
            this.W.e(true, 0.0f);
            this.n0 = true;
            hc hcVar = this.e;
            Objects.requireNonNull(hcVar);
            hl.d3(new gc(hcVar, (byte) 1), 160L);
        }
        invalidate();
    }

    public void setLanguage(CharSequence charSequence) {
        boolean z;
        boolean z2 = false;
        if (charSequence != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.y0 && this.C0.c > 0.0f) {
            z2 = true;
        }
        if (!z2) {
            this.E0.a(z);
            this.z0 = true;
        }
        this.A0 = z;
        if (!z) {
            charSequence = this.w0;
        }
        this.x0.t(charSequence, z2, true);
        invalidate();
    }

    public void setRevert(boolean z) {
        if (this.U == z) {
            return;
        }
        this.U = z;
        invalidate();
    }

    public void setSettings(boolean z) {
        if (this.y0 == z) {
            return;
        }
        this.y0 = z;
        if (z && this.C0.c <= 0.0f) {
            this.z0 = true;
        }
        invalidate();
    }

    public void setStopMode(boolean z) {
        float f;
        if (this.r0 == z) {
            return;
        }
        this.r0 = z;
        if (!this.T) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.s0.e(true, f);
        }
        if (!z) {
            hc hcVar = this.e;
            Objects.requireNonNull(hcVar);
            hl.d3(new gc(hcVar, (byte) 1), 120L);
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.e && drawable != this.s && drawable != this.x0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
