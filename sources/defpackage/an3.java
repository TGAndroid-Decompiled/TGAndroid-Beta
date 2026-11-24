package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.ui.Components.d;
import org.telegram.ui.Dictation.DictationAsr;
public final class an3 extends FrameLayout {
    public static final s33 I0 = new s33(0.34d, 1.32d, 0.5d, 1.0d);
    public static final float J0 = gl.L(36.0f);
    public static final float K0 = gl.L(8.0f);
    public boolean A0;
    public float B0;
    public final lm C0;
    public final lm D0;
    public final Paint E;
    public final lm E0;
    public final Paint F;
    public final lm F0;
    public final Paint G;
    public vt4 G0;
    public final Path H;
    public final lm H0;
    public il0 I;
    public il0 J;
    public il0 K;
    public il0 L;
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
    public final lm W;
    public final jm3 a;
    public final lm a0;
    public final wjb b;
    public final lm b0;
    public final View c;
    public final lm c0;
    public final View d;
    public final lm d0;
    public final gc e;
    public final lm e0;
    public final Drawable f;
    public final lm f0;
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
    public final gn s;
    public final lm s0;
    public final Paint t0;
    public long u0;
    public final lm v0;
    public final Paint w;
    public final String w0;
    public final Paint x;
    public final gn x0;
    public final Paint y;
    public boolean y0;
    public boolean z0;

    public an3(Context context, wjb wjbVar, jm3 jm3Var) {
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
        this.W = new lm(this, 0L, 280L, new s33(0.0f, 0.0f, 1.0f, 1.0f));
        s33 s33Var = s33.h;
        this.a0 = new lm(this, 0L, 240L, s33Var);
        s33 s33Var2 = I0;
        this.b0 = new lm(this, 0L, 460L, s33Var2);
        s33 s33Var3 = s33.g;
        this.c0 = new lm(this, 0L, 260L, s33Var3);
        this.d0 = new lm(this, 0L, 160L, s33Var);
        this.e0 = new lm(this, 0L, 160L, s33Var);
        this.f0 = new lm(this, 0L, 160L, s33Var);
        this.g0 = -1;
        this.o0 = new RectF();
        this.p0 = -1.0f;
        this.q0 = new Path();
        this.s0 = new lm(this, 0L, 300L, s33Var);
        this.t0 = new Paint(1);
        this.v0 = new lm(this, 0L, 260L, s33Var3);
        String M0 = k96.M0(2131745069, null);
        this.w0 = M0;
        this.z0 = true;
        this.C0 = new lm(this, 0L, 380L, s33Var2);
        this.D0 = new lm(this, 0L, 260L, s33Var3);
        this.E0 = new lm(this, 0L, 260L, s33Var3);
        this.F0 = new lm(this, 0L, 160L, s33Var);
        this.H0 = new lm(this, 0L, 300L, s33Var);
        this.a = jm3Var;
        this.b = wjbVar;
        setWillNotDraw(false);
        setClipChildren(false);
        View view = new View(context);
        this.c = view;
        addView(view, new FrameLayout.LayoutParams(gl.L(10.0f), gl.L(10.0f)));
        View view2 = new View(context);
        this.d = view2;
        addView(view2, new FrameLayout.LayoutParams(gl.L(10.0f), gl.L(10.0f)));
        gc gcVar = new gc(context);
        this.e = gcVar;
        gcVar.setCallback(this);
        this.f = context.getResources().getDrawable(2131230871).mutate();
        this.h = b00.d(context, 2131231003);
        this.n = b00.d(context, 2131232365);
        this.r = b00.d(context, 2131232199);
        gn gnVar = new gn(false, false, false);
        this.s = gnVar;
        gnVar.n(0.33f, 260L, s33Var3);
        gnVar.A = true;
        gnVar.w(gl.L(15.0f));
        gnVar.x(gl.o());
        gnVar.setCallback(this);
        gnVar.t(k96.M0(2131745064, null), false, true);
        gn gnVar2 = new gn(false, false, false);
        this.x0 = gnVar2;
        gnVar2.n(0.33f, 260L, s33Var3);
        gnVar2.w(gl.L(15.0f));
        gnVar2.x(gl.o());
        gnVar2.setCallback(this);
        gnVar2.t(M0, false, true);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(gl.N(1.75f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        path.moveTo(-gl.N(3.8f), gl.N(3.8f));
        path.lineTo(0.0f, 0.0f);
        path.lineTo(gl.N(3.8f), gl.N(3.8f));
        paint.setStyle(style);
        paint.setStrokeWidth(gl.N(0.66f));
        e();
    }

    public final void a() {
        vt4 vt4Var = this.G0;
        if (vt4Var != null && !vt4Var.O) {
            vt4Var.c(null);
            invalidate();
        }
    }

    public final void b(Canvas canvas, il0 il0Var, RectF rectF, float f) {
        if (f <= 0.0f) {
            return;
        }
        float height = rectF.height() / 2.0f;
        if (il0Var != null) {
            if (il0Var == this.I && Math.abs(this.p0 - height) > 0.5f) {
                this.p0 = height;
                il0Var.r(height);
            }
            il0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            il0Var.setAlpha((int) (f * 255.0f));
            il0Var.draw(canvas);
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

    public final int c(float f, float f2) {
        float L = gl.L(4.0f);
        if (this.y0 && this.C0.c > 0.7f) {
            RectF rectF = this.P;
            if (!rectF.isEmpty() && f2 >= rectF.top - L && f2 <= rectF.bottom + L) {
                RectF rectF2 = this.R;
                int i = (f > (rectF2.left - L) ? 1 : (f == (rectF2.left - L) ? 0 : -1));
                float f3 = K0;
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

    public final void d(String str, boolean z) {
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
            str2 = ir2.n(1, 0, str2);
        } else if (str2.endsWith("...")) {
            str2 = ir2.n(3, 0, str2);
        }
        this.s.t(str2, true, true);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int[] iArr;
        boolean z;
        gn gnVar;
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
        lm lmVar = this.W;
        float d = lmVar.d(z9);
        float d2 = this.a0.d(!this.T);
        if (!this.T) {
            d = Math.min(1.0f, d) * (1.0f - d2);
        }
        if (!this.T && d2 >= 1.0f) {
            lmVar.e(true, 0.0f);
            f = 0.0f;
        } else {
            f = d;
        }
        float d3 = this.C0.d(this.y0);
        int L2 = gl.L(18.0f) + gl.L(12.0f);
        gn gnVar2 = this.x0;
        float L3 = gl.L(6.0f) + L2 + gnVar2.d + gl.L(8.0f) + gl.L(8.0f) + gl.L(13.0f);
        boolean z10 = this.z0;
        lm lmVar2 = this.D0;
        if (z10) {
            this.z0 = false;
            lmVar2.e(true, L3);
        }
        this.B0 = lmVar2.e(false, L3);
        int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        RectF rectF5 = this.M;
        if ((i2 <= 0 && d3 <= 0.0f) || !this.a.n(rectF5)) {
            z = false;
        } else {
            getLocationInWindow(this.S);
            rectF5.offset(-iArr[0], -iArr[1]);
            z = true;
        }
        Path path3 = this.H;
        float f17 = K0;
        float f18 = J0;
        RectF rectF6 = this.N;
        RectF rectF7 = this.O;
        Paint paint = this.G;
        if (i2 > 0 && z) {
            boolean z11 = this.T;
            float L4 = gl.L(36.0f);
            f3 = 3.0f;
            float d4 = this.v0.d(this.V);
            gn gnVar3 = this.s;
            float f19 = gnVar3.d;
            TextPaint textPaint2 = gnVar3.a;
            float L5 = gl.L(16.0f);
            if (this.V) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            float f20 = (f4 * L5) + f19;
            float d5 = this.s0.d(this.r0);
            float L6 = gl.L(6.0f) + gl.L(24.0f) + gl.L(12.0f) + f20 + gl.L(12.0f);
            if (this.r0) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            int L7 = gl.L(1.0f);
            int L8 = gl.L(14.0f);
            float L9 = ((gl.L(10.0f) + L8 + gl.L(8.0f) + L7) * (1.0f - f5)) + L6;
            if (this.r0) {
                i = gl.L(4.0f);
            } else {
                i = 0;
            }
            float f21 = L9 + i;
            boolean z12 = this.n0;
            lm lmVar3 = this.c0;
            if (z12) {
                path2 = path3;
                this.n0 = false;
                lmVar3.e(true, f21);
            } else {
                path2 = path3;
            }
            float e = lmVar3.e(false, f21);
            float L10 = rectF5.left + gl.L(2.0f);
            if (this.y0) {
                f6 = e;
                f7 = f18 + f17 + this.B0 + f17;
            } else {
                f6 = e;
                f7 = 0.0f;
            }
            float f22 = L10 + f7;
            float L11 = rectF5.top - gl.L(8.0f);
            rectF6.set(f22, L11 - L4, f22 + f6, L11);
            View view = this.c;
            if (Math.abs(view.getLeft() - rectF6.left) <= 1.0f && Math.abs(view.getTop() - rectF6.top) <= 1.0f && Math.abs(view.getWidth() - rectF6.width()) <= 1.0f && view.getHeight() == ((int) L4)) {
                textPaint = textPaint2;
            } else {
                textPaint = textPaint2;
                view.layout((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
            }
            vt4 vt4Var = this.G0;
            if (vt4Var != null && !vt4Var.O) {
                z6 = true;
            } else {
                z6 = false;
            }
            float d6 = this.H0.d(z6);
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
                float max2 = Math.max(sin, gl.R1(L4 * 0.62f, rectF6.width(), 1.0f - ((float) Math.pow(f23, 3.0d))));
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
                    R1 = gl.R1(0.85f, 1.0f, f);
                }
                min = Math.min(1.0f, f) * 1.0f;
                f10 = min;
            }
            canvas2.save();
            float f26 = (f9 - (f8 * 0.04f)) * R1;
            float f27 = f9;
            canvas2.scale(f26, f26, rectF6.left + gl.L(18.0f), rectF6.bottom);
            if (z11 && f < f27 && rectF2.width() > 0.0f) {
                b(canvas2, this.I, rectF2, min);
                f11 = L4;
                RectF rectF9 = rectF2;
                rectF4 = rectF7;
                f2 = d3;
                f12 = d4;
                f13 = f;
                gnVar = gnVar2;
                path = path2;
                rectF = rectF5;
                z2 = false;
                z3 = true;
                rectF3 = rectF6;
                yw4.a(canvas, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, rectF2.height() / 2.0f, this.i0, min * this.m0, this.l0);
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
                gnVar = gnVar2;
                path = path2;
                rectF = rectF5;
                z2 = false;
                z3 = true;
                rectF3 = rectF6;
                rectF4 = rectF7;
                b(canvas2, this.I, rectF3, f28);
                canvas2 = canvas;
                yw4.a(canvas2, rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, rectF3.height() / 2.0f, this.i0, this.m0 * f28, this.l0);
            }
            if (f10 > 0.0f) {
                float L12 = rectF3.left + gl.L(12.0f);
                float centerY = rectF3.centerY();
                int i4 = (int) (f10 * 255.0f);
                if (d5 < 1.0f) {
                    f14 = 0.01f;
                    gc gcVar = this.e;
                    gcVar.setAlpha((int) (i4 * (1.0f - d5)));
                    canvas2.save();
                    float R12 = gl.R1(1.0f, 0.6f, d5);
                    canvas2.scale(R12, R12, gl.L(12.0f) + L12, centerY);
                    f15 = 0.4f;
                    gcVar.setBounds((int) L12, (int) (centerY - gl.L(12.0f)), (int) (gl.L(24.0f) + L12), (int) (gl.L(12.0f) + centerY));
                    gcVar.draw(canvas2);
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
                    float R13 = gl.R1(0.6f, 1.0f, d5) * gl.N(5.0f);
                    RectF rectF10 = gl.P;
                    f16 = L12;
                    rectF10.set((gl.L(12.0f) + L12) - R13, centerY - R13, f16 + gl.L(12.0f) + R13, R13 + centerY);
                    canvas2.drawRoundRect(rectF10, gl.N(2.2f), gl.N(2.2f), paint2);
                } else {
                    f16 = L12;
                }
                float L13 = f16 + gl.L(6.0f) + gl.L(24.0f);
                gnVar3.C = i4;
                gnVar3.setBounds((int) L13, (int) (centerY - gl.L(12.0f)), (int) (gl.L(240.0f) + L13), (int) (gl.L(12.0f) + centerY));
                if (textPaint.getShader() != null) {
                    textPaint.setShader(null);
                }
                canvas2.save();
                float L14 = L13 - gl.L(2.0f);
                float f29 = rectF3.top;
                boolean z13 = this.r0;
                float f30 = rectF3.right;
                if (z13) {
                    L = gl.L(6.0f);
                } else {
                    f30 = (((f30 - gl.L(10.0f)) - gl.L(14.0f)) - gl.L(8.0f)) - gl.L(1.0f);
                    L = gl.L(4.0f);
                }
                canvas2.clipRect(L14, f29, f30 - L, rectF3.bottom);
                gnVar3.draw(canvas2);
                if (f12 > f14) {
                    float c = gnVar3.c() + L13 + gl.L(3.0f);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    int i6 = this.j0;
                    Paint paint3 = this.F;
                    paint3.setColor(i6);
                    for (int i7 = z2; i7 < 3; i7++) {
                        float f31 = c;
                        paint3.setAlpha((int) (i4 * f12 * ((Math.max(0.0f, (float) Math.sin(((((float) (j - this.u0)) / 1200.0f) - (((float) i7) * 0.18f)) * 3.141592653589793d * 2.0d)) * 0.65f) + 0.35f)));
                        canvas2.drawCircle((gl.L(4.5f) * i7) + f31, gl.L(4.5f) + centerY, gl.N(1.4f), paint3);
                        c = f31;
                        uptimeMillis = uptimeMillis;
                    }
                    invalidate();
                }
                canvas2.restore();
                float L15 = (((rectF3.right - gl.L(10.0f)) - gl.L(14.0f)) - gl.L(8.0f)) - gl.L(1.0f);
                Paint paint4 = this.E;
                paint4.setAlpha((bkb.p1(0.14f, this.j0) >>> 24) & 255);
                int alpha = paint4.getAlpha();
                float f32 = 1.0f - d5;
                paint4.setAlpha((int) (alpha * f10 * f32));
                canvas2.drawRect(L15, centerY - gl.L(9.0f), gl.N(1.0f) + L15, gl.L(9.0f) + centerY, paint4);
                paint4.setAlpha(alpha);
                boolean z14 = this.r0;
                RectF rectF11 = this.Q;
                if (z14) {
                    rectF11.setEmpty();
                } else {
                    rectF11.set(L15 - gl.L(4.0f), rectF3.top, rectF3.right, rectF3.bottom);
                }
                float L16 = (rectF3.right - gl.L(10.0f)) - gl.L(7.0f);
                paint.setAlpha((int) (i4 * f32));
                canvas2.save();
                canvas2.translate(L16, ((centerY - gl.N(1.9f)) - gl.N(f15)) - (gl.N(1.0f) * d6));
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
                rectF4.set(rectF3.right + gl.L(6.0f), rectF3.top, rectF3.right + gl.L(6.0f) + f11, rectF3.bottom);
                float R14 = (1.0f - (d9 * 0.08f)) * gl.R1(f15, 1.0f, d8);
                canvas2.save();
                canvas2.scale(R14, R14, rectF4.centerX(), rectF4.centerY());
                float min3 = Math.min(1.0f, d8 * 1.5f) * 1.0f;
                b(canvas2, this.J, rectF4, min3);
                yw4.a(canvas2, rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, rectF4.height() / 2.0f, this.i0, this.m0 * min3, this.l0);
                int centerX = (int) rectF4.centerX();
                int centerY2 = (int) rectF4.centerY();
                int L17 = centerX - gl.L(12.0f);
                int L18 = centerY2 - gl.L(12.0f);
                int L19 = gl.L(12.0f) + centerX;
                int L20 = gl.L(12.0f) + centerY2;
                Drawable drawable = this.h;
                drawable.setBounds(L17, L18, L19, L20);
                drawable.setAlpha((int) (min3 * 255.0f));
                drawable.draw(canvas2);
                canvas2.restore();
            } else {
                rectF4.setEmpty();
            }
        } else {
            gnVar = gnVar2;
            rectF = rectF5;
            path = path3;
            z2 = false;
            z3 = true;
            f2 = d3;
            f3 = 3.0f;
            rectF6.setEmpty();
            rectF7.setEmpty();
        }
        int i8 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        RectF rectF12 = this.P;
        if (i8 > 0 && z) {
            float L21 = gl.L(36.0f);
            RectF rectF13 = rectF;
            float L22 = rectF13.top - gl.L(8.0f);
            float f33 = L22 - L21;
            RectF rectF14 = this.R;
            rectF14.set(rectF13.left + gl.L(2.0f), f33, rectF13.left + gl.L(2.0f) + f18, L22);
            float f34 = rectF14.right + f17;
            rectF12.set(f34, f33, this.B0 + f34, L22);
            View view2 = this.d;
            if (Math.abs(view2.getLeft() - rectF12.left) > 1.0f || Math.abs(view2.getTop() - rectF12.top) > 1.0f || Math.abs(view2.getRight() - rectF12.right) > 1.0f || view2.getHeight() != ((int) L21)) {
                view2.layout((int) rectF12.left, (int) rectF12.top, (int) rectF12.right, (int) rectF12.bottom);
            }
            float f35 = f2;
            float max3 = Math.max(0.0f, Math.min(1.0f, f35));
            float B = yjb.B(max3, 2.0f, f3, max3 * max3);
            float max4 = Math.max(0.0f, Math.min(1.0f, f35 * 1.5f));
            if (this.g0 == 3) {
                z4 = z3;
            } else {
                z4 = z2;
            }
            float d10 = this.f0.d(z4);
            canvas2.save();
            float f36 = 1.0f - B;
            canvas2.translate(0.0f, gl.L(6.0f) * f36);
            float f37 = (B * 0.1f) + 0.9f;
            float B2 = yjb.B(d10, 0.06f, 1.0f, f37);
            canvas2.scale(B2, B2, rectF14.centerX(), rectF14.centerY());
            b(canvas2, this.L, rectF14, max4);
            float f38 = L21 / 2.0f;
            yw4.a(canvas2, rectF14.left, rectF14.top, rectF14.right, rectF14.bottom, f38, this.i0, this.m0 * max4, this.l0);
            int L23 = gl.L(18.5f);
            float f39 = L23 / 2.0f;
            float centerX2 = ((int) rectF14.centerX()) - f39;
            int round = Math.round(centerX2);
            float centerY3 = ((int) rectF14.centerY()) - f39;
            int round2 = Math.round(centerY3);
            int round3 = Math.round(centerX2) + L23;
            int round4 = Math.round(centerY3) + L23;
            Drawable drawable2 = this.n;
            drawable2.setBounds(round, round2, round3, round4);
            float f40 = max4 * 255.0f;
            int i9 = (int) f40;
            drawable2.setAlpha(i9);
            drawable2.draw(canvas2);
            canvas2.restore();
            if (this.g0 == 4) {
                z5 = z3;
            } else {
                z5 = z2;
            }
            float d11 = this.F0.d(z5);
            canvas2.save();
            canvas2.translate(0.0f, gl.L(6.0f) * f36);
            float f41 = (1.0f - (d11 * 0.04f)) * f37;
            canvas2.scale(f41, f41, rectF12.left + gl.L(18.0f), rectF12.bottom);
            b(canvas2, this.K, rectF12, max4);
            yw4.a(canvas2, rectF12.left, rectF12.top, rectF12.right, rectF12.bottom, f38, this.i0, this.m0 * max4, this.l0);
            float centerY4 = rectF12.centerY();
            int L24 = (int) (rectF12.left + gl.L(12.0f));
            int L25 = (int) (centerY4 - gl.L(9.0f));
            Drawable drawable3 = this.r;
            drawable3.setBounds(L24, L25, gl.L(18.0f) + L24, gl.L(18.0f) + L25);
            drawable3.setAlpha(i9);
            drawable3.draw(canvas2);
            float L26 = (rectF12.right - gl.L(13.0f)) - gl.L(4.0f);
            float L27 = rectF12.left + gl.L(12.0f) + gl.L(18.0f) + gl.L(6.0f);
            gn gnVar4 = gnVar;
            gnVar4.C = (int) (gl.R1(0.5f, 1.0f, this.E0.d(this.A0)) * f40);
            float N = centerY4 - gl.N(1.0f);
            gnVar4.setBounds((int) L27, (int) (N - gl.L(12.0f)), (int) (L27 + gl.L(240.0f)), (int) (N + gl.L(12.0f)));
            canvas2.save();
            canvas2.clipRect(rectF12.left, rectF12.top, L26 - gl.L(8.0f), rectF12.bottom);
            gnVar4.draw(canvas2);
            canvas2.restore();
            int alpha2 = paint.getAlpha();
            paint.setAlpha((int) (alpha2 * max4));
            canvas2.save();
            canvas2.translate(L26, centerY4 - gl.N(1.9f));
            canvas2.drawPath(path, paint);
            canvas2.restore();
            paint.setAlpha(alpha2);
            canvas2.restore();
        } else {
            rectF12.setEmpty();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        String[] strArr;
        Runnable runnable;
        int i;
        boolean z2;
        int i2 = 0;
        if (this.G0 != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                RectF rectF = this.N;
                if (!rectF.isEmpty()) {
                    RectF rectF2 = gl.P;
                    rectF2.set(rectF);
                    rectF2.inset(-gl.L(4.0f), -gl.L(4.0f));
                    this.h0 = rectF2.contains(motionEvent.getX(), motionEvent.getY());
                }
            }
            if (this.h0) {
                if (actionMasked == 1) {
                    this.h0 = false;
                    a();
                    return true;
                } else if (actionMasked == 3) {
                    this.h0 = false;
                    return true;
                }
            } else {
                return super.dispatchTouchEvent(motionEvent);
            }
        } else {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.g0 = c(motionEvent.getX(), motionEvent.getY());
                invalidate();
                if (this.g0 < 0) {
                    return false;
                }
            } else {
                int i3 = this.g0;
                if (i3 >= 0) {
                    if (actionMasked2 == 1) {
                        this.g0 = -1;
                        invalidate();
                        if (c(motionEvent.getX(), motionEvent.getY()) == i3) {
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            jm3 jm3Var = this.a;
                            if (i3 == 0) {
                                byte b = jm3Var.r;
                                if (b == 1) {
                                    jm3Var.u();
                                } else if (b == 3) {
                                    jm3Var.c(jm3Var.K);
                                }
                            } else {
                                kl3 kl3Var = ll3.c;
                                int i4 = 44;
                                if (i3 == 1) {
                                    Context context = jm3Var.h;
                                    wjb wjbVar = jm3Var.n;
                                    byte b2 = jm3Var.r;
                                    if (b2 == 3 || b2 == 4) {
                                        vt4 vt4Var = new vt4(context, this.c, wjbVar, new bm3(jm3Var, (byte) 3));
                                        vt4Var.T = true;
                                        vt4Var.n = gl.L(316.0f);
                                        vt4Var.M = gl.L(220.0f);
                                        vt4Var.S = true;
                                        vt4Var.L = 0;
                                        int v0 = bkb.v0(bkb.F6, wjbVar);
                                        vt4Var.a(new st(context, v0, bkb.v0(bkb.E8, wjbVar)), 44, new cm3(jm3Var, (byte) 4));
                                        ArrayList c = jm3Var.H.c();
                                        c.add(kl3Var);
                                        int size = c.size();
                                        int i5 = 0;
                                        while (i5 < size) {
                                            Object obj = c.get(i5);
                                            i5++;
                                            kl3 kl3Var2 = (kl3) obj;
                                            Context context2 = jm3Var.h;
                                            int i6 = jm3Var.f.a.R;
                                            if (kl3Var2 == jm3Var.K && jm3Var.J != null) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            int i7 = v0;
                                            vt4Var.a(new im3(context2, kl3Var2, i7, i6, z2), 44, new wc3(jm3Var, kl3Var2, (byte) 19));
                                            v0 = i7;
                                        }
                                        an3 an3Var = jm3Var.w;
                                        an3Var.G0 = vt4Var;
                                        an3Var.addView(vt4Var, new FrameLayout.LayoutParams(-1, -1));
                                        an3Var.invalidate();
                                        vt4Var.setFocusableInTouchMode(true);
                                        vt4Var.setOnKeyListener(new fm3(vt4Var, (byte) 1));
                                        vt4Var.requestFocus();
                                        vt4Var.R = new cm3(jm3Var, (byte) 5);
                                        vt4Var.f();
                                    }
                                } else if (i3 == 3) {
                                    if (jm3Var.r == 1) {
                                        jm3Var.u();
                                    }
                                    d dVar = jm3Var.f;
                                    zka zkaVar = new zka();
                                    mu1 mu1Var = dVar.a.F3;
                                    if (mu1Var != null) {
                                        mu1Var.presentFragment(zkaVar);
                                    }
                                } else {
                                    Runnable runnable2 = null;
                                    if (i3 == 4) {
                                        jm3Var.w.a();
                                        Context context3 = jm3Var.h;
                                        wjb wjbVar2 = jm3Var.n;
                                        vt4 vt4Var2 = new vt4(context3, this.d, wjbVar2, new bm3(jm3Var, (byte) 1));
                                        vt4Var2.T = true;
                                        vt4Var2.n = gl.L(316.0f);
                                        vt4Var2.M = gl.L(200.0f);
                                        vt4Var2.S = true;
                                        vt4Var2.L = 0;
                                        int v02 = bkb.v0(bkb.F6, wjbVar2);
                                        boolean x = DictationAsr.x();
                                        vt4Var2.a(new k7(jm3Var.h, k96.M0(2131745072, null), null, v02, x), 44, new ql3((byte) 1));
                                        String[] G = DictationAsr.G();
                                        int length = G.length;
                                        int i8 = 0;
                                        while (i8 < length) {
                                            String str = G[i8];
                                            if (!x && DictationAsr.z(str)) {
                                                z = 1;
                                            } else {
                                                z = i2;
                                            }
                                            vl3 L = DictationAsr.L(str);
                                            if (L != null) {
                                                strArr = L.d(str);
                                            } else {
                                                strArr = new String[i2];
                                            }
                                            int length2 = strArr.length;
                                            Context context4 = jm3Var.h;
                                            if (length2 < 2) {
                                                vt4Var2.a(new k7(context4, jm3.r(str), null, v02, z), i4, new wc3(jm3Var, str, (byte) 18));
                                                i = i8;
                                                runnable = runnable2;
                                            } else {
                                                k7 k7Var = new k7(context4, jm3.r(str), jm3.O(DictationAsr.g0(L, str)), v02, z);
                                                vt4Var2.a(k7Var, 54, runnable2);
                                                runnable = runnable2;
                                                i = i8;
                                                k7Var.setOnClickListener(new em3(jm3Var, L, str, strArr, v02, z, vt4Var2));
                                            }
                                            i8 = i + 1;
                                            runnable2 = runnable;
                                            i2 = 0;
                                            i4 = 44;
                                        }
                                        an3 an3Var2 = jm3Var.w;
                                        an3Var2.G0 = vt4Var2;
                                        an3Var2.addView(vt4Var2, new FrameLayout.LayoutParams(-1, -1));
                                        an3Var2.invalidate();
                                        vt4Var2.setFocusableInTouchMode(true);
                                        vt4Var2.setOnKeyListener(new fm3(vt4Var2, (byte) 0));
                                        vt4Var2.requestFocus();
                                        vt4Var2.R = new cm3(jm3Var, (byte) 2);
                                        vt4Var2.f();
                                    } else {
                                        String str2 = jm3Var.J;
                                        if (str2 != null && jm3Var.r == 3) {
                                            jm3Var.J = null;
                                            jm3Var.w(str2);
                                            jm3Var.K = kl3Var;
                                            jm3Var.w.setRevert(false);
                                            jm3Var.w.d(kl3Var.a(), false);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (actionMasked2 == 3) {
                        this.g0 = -1;
                        invalidate();
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final void e() {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4 = bkb.c6;
        wjb wjbVar = this.b;
        if (gl.B(bkb.v0(i4, wjbVar)) < 0.5f) {
            z = true;
        } else {
            z = false;
        }
        this.i0 = z;
        int v0 = bkb.v0(bkb.F6, wjbVar);
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
        this.E.setColor(bkb.p1(0.14f, this.j0));
        Paint paint = this.y;
        paint.setColor(16777216);
        float L = gl.L(8.0f);
        float L2 = gl.L(2.0f);
        if (this.i0) {
            i3 = 1426063360;
        } else {
            i3 = 570425344;
        }
        paint.setShadowLayer(L, 0.0f, L2, i3);
        il0 il0Var = this.I;
        if (il0Var != null) {
            il0Var.updateColors();
        }
        il0 il0Var2 = this.J;
        if (il0Var2 != null) {
            il0Var2.updateColors();
        }
        il0 il0Var3 = this.K;
        if (il0Var3 != null) {
            il0Var3.updateColors();
        }
        il0 il0Var4 = this.L;
        if (il0Var4 != null) {
            il0Var4.updateColors();
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
        if (view == this.G0) {
            this.G0 = null;
            invalidate();
        }
    }

    public void setGearGlass(il0 il0Var) {
        this.L = il0Var;
        if (il0Var != null) {
            il0Var.r(gl.L(18.0f));
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
            gc gcVar = this.e;
            Objects.requireNonNull(gcVar);
            gl.d3(new fc(gcVar, (byte) 1), 160L);
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
            gc gcVar = this.e;
            Objects.requireNonNull(gcVar);
            gl.d3(new fc(gcVar, (byte) 1), 120L);
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
