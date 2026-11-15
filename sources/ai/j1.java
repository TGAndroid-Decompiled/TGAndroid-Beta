package ai;

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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ae;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.an;
public final class j1 extends FrameLayout {
    public static final er F0 = new er(0.34d, 1.32d, 0.5d, 1.0d);
    public final u5 A0;
    public final u5 B0;
    public final u5 C0;
    public bi.x0 D0;
    public final Paint E;
    public final u5 E0;
    public final Paint F;
    public final Paint G;
    public final Path H;
    public fh.g I;
    public fh.g J;
    public fh.g K;
    public final RectF L;
    public final RectF M;
    public final RectF N;
    public final RectF O;
    public final RectF P;
    public final RectF Q;
    public final int[] R;
    public boolean S;
    public boolean T;
    public boolean U;
    public final u5 V;
    public final u5 W;
    public final m0 f1267a;
    public final u5 f1268a0;
    public final e6 f1269b;
    public final u5 f1270b0;
    public final View f1271c;
    public final u5 f1272c0;
    public final View d;
    public final u5 f1273d0;
    public final org.telegram.ui.ActionBar.t2 f1274e;
    public final u5 f1275e0;
    public final Drawable f1276f;
    public int f1277f0;
    public boolean f1278g0;
    public final Drawable h;
    public boolean f1279h0;
    public int f1280i0;
    public int f1281j0;
    public float f1282k0;
    public float f1283l0;
    public boolean m0;
    public final Drawable f1284n;
    public final RectF f1285n0;
    public float f1286o0;
    public final Path f1287p0;
    public boolean f1288q0;
    public final Drawable f1289r;
    public final u5 f1290r0;
    public final g6 f1291s;
    public final Paint f1292s0;
    public long f1293t0;
    public final u5 f1294u0;
    public final g6 f1295v0;
    public final Paint f1296w;
    public boolean f1297w0;
    public final Paint f1298x;
    public boolean f1299x0;
    public final Paint f1300y;
    public boolean f1301y0;
    public float f1302z0;

    public j1(Context context, e6 e6Var, m0 m0Var) {
        super(context);
        this.f1296w = new Paint(1);
        Paint paint = new Paint(1);
        this.f1298x = paint;
        this.f1300y = new Paint(1);
        this.E = new Paint(1);
        new Paint(1);
        this.F = new Paint(1);
        Paint paint2 = new Paint(1);
        this.G = paint2;
        Path path = new Path();
        this.H = path;
        this.L = new RectF();
        this.M = new RectF();
        this.N = new RectF();
        this.O = new RectF();
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new int[2];
        this.V = new u5(this, 0L, 280L, new er(0.0f, 0.0f, 1.0f, 1.0f));
        er erVar = er.h;
        this.W = new u5(this, 0L, 240L, erVar);
        er erVar2 = F0;
        this.f1268a0 = new u5(this, 0L, 460L, erVar2);
        er erVar3 = er.f34421g;
        this.f1270b0 = new u5(this, 0L, 260L, erVar3);
        this.f1272c0 = new u5(this, 0L, 160L, erVar);
        this.f1273d0 = new u5(this, 0L, 160L, erVar);
        this.f1275e0 = new u5(this, 0L, 160L, erVar);
        this.f1277f0 = -1;
        this.f1285n0 = new RectF();
        this.f1286o0 = -1.0f;
        this.f1287p0 = new Path();
        this.f1290r0 = new u5(this, 0L, 300L, erVar);
        this.f1292s0 = new Paint(1);
        this.f1294u0 = new u5(this, 0L, 260L, erVar3);
        this.f1299x0 = true;
        this.A0 = new u5(this, 0L, 380L, erVar2);
        this.B0 = new u5(this, 0L, 260L, erVar3);
        this.C0 = new u5(this, 0L, 260L, erVar3);
        this.E0 = new u5(this, 0L, 300L, erVar);
        this.f1267a = m0Var;
        this.f1269b = e6Var;
        setWillNotDraw(false);
        setClipChildren(false);
        View view = new View(context);
        this.f1271c = view;
        addView(view, new FrameLayout.LayoutParams(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f)));
        View view2 = new View(context);
        this.d = view2;
        addView(view2, new FrameLayout.LayoutParams(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f)));
        org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(context);
        this.f1274e = t2Var;
        t2Var.setCallback(this);
        this.f1276f = context.getResources().getDrawable(2131230871).mutate();
        this.h = i5.c.g(context, 2131231001);
        this.f1284n = i5.c.g(context, 2131232361);
        this.f1289r = i5.c.g(context, 2131232195);
        g6 g6Var = new g6(false, false, false);
        this.f1291s = g6Var;
        g6Var.n(0.33f, 260L, erVar3);
        g6Var.A = true;
        g6Var.w(org.telegram.messenger.g0.L(15.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.setCallback(this);
        g6Var.t("Enhance", false, true);
        g6 g6Var2 = new g6(false, false, false);
        this.f1295v0 = g6Var2;
        g6Var2.n(0.33f, 260L, erVar3);
        g6Var2.w(org.telegram.messenger.g0.L(15.0f));
        g6Var2.x(org.telegram.messenger.g0.o());
        g6Var2.setCallback(this);
        g6Var2.t("Detecting…", false, true);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(1.75f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        path.moveTo(-org.telegram.messenger.g0.N(3.8f), org.telegram.messenger.g0.N(3.8f));
        path.lineTo(0.0f, 0.0f);
        path.lineTo(org.telegram.messenger.g0.N(3.8f), org.telegram.messenger.g0.N(3.8f));
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
        e();
    }

    public final void a() {
        bi.x0 x0Var = this.D0;
        if (x0Var != null && !x0Var.M) {
            x0Var.c(null);
            invalidate();
        }
    }

    public final void b(Canvas canvas, fh.g gVar, RectF rectF, float f10) {
        if (f10 <= 0.0f) {
            return;
        }
        float height = rectF.height() / 2.0f;
        if (gVar != null) {
            if (gVar == this.I && Math.abs(this.f1286o0 - height) > 0.5f) {
                this.f1286o0 = height;
                gVar.r(height);
            }
            gVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            gVar.setAlpha((int) (f10 * 255.0f));
            gVar.draw(canvas);
            return;
        }
        Paint paint = this.f1300y;
        paint.setAlpha((int) (255.0f * f10));
        canvas.drawRoundRect(rectF, height, height, paint);
        Paint paint2 = this.f1296w;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * f10));
        canvas.drawRoundRect(rectF, height, height, paint2);
        paint2.setAlpha(alpha);
        Paint paint3 = this.f1298x;
        int alpha2 = paint3.getAlpha();
        paint3.setAlpha((int) (alpha2 * f10));
        canvas.drawRoundRect(rectF, height, height, paint3);
        paint3.setAlpha(alpha2);
    }

    public final int c(float f10, float f11) {
        float L = org.telegram.messenger.g0.L(4.0f);
        if (this.f1297w0 && this.A0.f39903c > 0.7f) {
            RectF rectF = this.O;
            if (!rectF.isEmpty() && f10 >= rectF.left - L) {
                if (f10 <= (L / 2.0f) + rectF.right && f11 >= rectF.top - L && f11 <= rectF.bottom + L) {
                    if (f10 >= this.Q.left) {
                        return 3;
                    }
                    return 4;
                }
            }
        }
        if (this.S && this.V.f39903c >= 0.7f) {
            RectF rectF2 = this.N;
            if (!rectF2.isEmpty() && f10 >= rectF2.left - L && f10 <= rectF2.right + L && f11 >= rectF2.top - L && f11 <= rectF2.bottom + L) {
                return 2;
            }
            RectF rectF3 = this.M;
            if (!rectF3.isEmpty() && f11 >= rectF3.top - L && f11 <= rectF3.bottom + L && f10 >= rectF3.left - L && f10 <= rectF3.right + L) {
                RectF rectF4 = this.P;
                if (!rectF4.isEmpty() && rectF4.contains(f10, Math.max(rectF3.top, Math.min(rectF3.bottom - 1.0f, f11)))) {
                    return 1;
                }
                return 0;
            }
        }
        return -1;
    }

    public final void d(CharSequence charSequence, boolean z10) {
        String charSequence2;
        if (z10 && !this.U) {
            this.f1293t0 = SystemClock.uptimeMillis();
        }
        this.U = z10;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        if (charSequence2.endsWith("…")) {
            charSequence2 = com.google.android.gms.internal.vision.e2.k(charSequence2, 1, 0);
        } else if (charSequence2.endsWith("...")) {
            charSequence2 = com.google.android.gms.internal.vision.e2.k(charSequence2, 3, 0);
        }
        this.f1291s.t(charSequence2, true, true);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int[] iArr;
        boolean z10;
        g6 g6Var;
        RectF rectF;
        boolean z11;
        boolean z12;
        float f11;
        Paint paint;
        boolean z13;
        float f12;
        float f13;
        int i7;
        g6 g6Var2;
        float f14;
        float f15;
        float f16;
        boolean z14;
        boolean z15;
        float f17;
        RectF rectF2;
        float f18;
        float T1;
        float min;
        float f19;
        float f20;
        float f21;
        RectF rectF3;
        RectF rectF4;
        g6 g6Var3;
        float f22;
        boolean z16;
        float f23;
        float L;
        int L2;
        long j3;
        Canvas canvas2 = canvas;
        boolean z17 = this.S;
        u5 u5Var = this.V;
        float d = u5Var.d(z17);
        float d2 = this.W.d(!this.S);
        if (!this.S) {
            d = Math.min(1.0f, d) * (1.0f - d2);
        }
        if (!this.S && d2 >= 1.0f) {
            u5Var.e(true, 0.0f);
            f10 = 0.0f;
        } else {
            f10 = d;
        }
        float d10 = this.A0.d(this.f1297w0);
        int L3 = org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(10.0f);
        g6 g6Var4 = this.f1295v0;
        float L4 = org.telegram.messenger.g0.L(6.0f) + L3 + g6Var4.d + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(1.0f) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(9.0f);
        boolean z18 = this.f1299x0;
        u5 u5Var2 = this.B0;
        if (z18) {
            this.f1299x0 = false;
            u5Var2.e(true, L4);
        }
        this.f1302z0 = u5Var2.e(false, L4);
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        RectF rectF5 = this.L;
        if ((i10 <= 0 && d10 <= 0.0f) || !this.f1267a.j(rectF5)) {
            z10 = false;
        } else {
            getLocationInWindow(this.R);
            rectF5.offset(-iArr[0], -iArr[1]);
            z10 = true;
        }
        RectF rectF6 = this.M;
        RectF rectF7 = this.N;
        Paint paint2 = this.E;
        if (i10 > 0 && z10) {
            boolean z19 = this.S;
            float L5 = org.telegram.messenger.g0.L(36.0f);
            float d11 = this.f1294u0.d(this.U);
            g6 g6Var5 = this.f1291s;
            float f24 = g6Var5.d;
            TextPaint textPaint = g6Var5.f34827a;
            float L6 = org.telegram.messenger.g0.L(16.0f);
            if (this.U) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            float f25 = (L6 * f12) + f24;
            float d12 = this.f1290r0.d(this.f1288q0);
            float L7 = org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(24.0f) + org.telegram.messenger.g0.L(12.0f) + f25 + org.telegram.messenger.g0.L(12.0f);
            if (this.f1288q0) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            int L8 = org.telegram.messenger.g0.L(1.0f);
            float L9 = ((1.0f - f13) * (org.telegram.messenger.g0.L(10.0f) + org.telegram.messenger.g0.L(14.0f) + org.telegram.messenger.g0.L(8.0f) + L8)) + L7;
            if (this.f1288q0) {
                i7 = org.telegram.messenger.g0.L(4.0f);
            } else {
                i7 = 0;
            }
            float f26 = L9 + i7;
            boolean z20 = this.m0;
            u5 u5Var3 = this.f1270b0;
            if (z20) {
                g6Var2 = g6Var4;
                this.m0 = false;
                u5Var3.e(true, f26);
            } else {
                g6Var2 = g6Var4;
            }
            float e10 = u5Var3.e(false, f26);
            float L10 = rectF5.left + org.telegram.messenger.g0.L(2.0f);
            if (this.f1297w0) {
                f14 = e10;
                f15 = org.telegram.messenger.g0.L(6.0f) + this.f1302z0;
            } else {
                f14 = e10;
                f15 = 0.0f;
            }
            float f27 = L10 + f15;
            float L11 = rectF5.top - org.telegram.messenger.g0.L(8.0f);
            rectF = rectF5;
            rectF6.set(f27, L11 - L5, f27 + f14, L11);
            View view = this.f1271c;
            if (Math.abs(view.getLeft() - rectF6.left) <= 1.0f && Math.abs(view.getTop() - rectF6.top) <= 1.0f && Math.abs(view.getWidth() - rectF6.width()) <= 1.0f && view.getHeight() == ((int) L5)) {
                f16 = L5;
            } else {
                f16 = L5;
                view.layout((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
            }
            bi.x0 x0Var = this.D0;
            if (x0Var != null && !x0Var.M) {
                z14 = true;
            } else {
                z14 = false;
            }
            float d13 = this.E0.d(z14);
            int i11 = this.f1277f0;
            if (i11 != 0 && i11 != 1) {
                z15 = false;
            } else {
                z15 = true;
            }
            float d14 = this.f1272c0.d(z15);
            RectF rectF8 = this.f1285n0;
            if (z19 && f10 < 1.0f) {
                float max = Math.max(0.0f, f10);
                float f28 = 1.0f - max;
                float min2 = 1.0f - Math.min(1.0f, max / 0.55f);
                float sin = ((((float) Math.sin(Math.min(1.0f, max / 0.8f) * 3.141592653589793d)) * 0.07f * f28) + ((1.0f - (min2 * min2)) * 0.38f) + 0.62f) * f16;
                float max2 = Math.max(sin, org.telegram.messenger.g0.T1(f16 * 0.62f, rectF6.width(), 1.0f - ((float) Math.pow(f28, 3.0d))));
                float f29 = rectF6.left;
                float f30 = rectF6.bottom;
                f17 = d14;
                rectF2 = rectF8;
                rectF2.set(f29, f30 - sin, max2 + f29, f30);
                f18 = 1.0f;
                min = Math.min(1.0f, max * 3.0f) * 1.0f;
                T1 = 1.0f;
                f19 = Math.max(0.0f, Math.min(1.0f, (max - 0.62f) / 0.38f)) * 1.0f;
            } else {
                f17 = d14;
                rectF2 = rectF8;
                f18 = 1.0f;
                rectF2.set(rectF6);
                if (z19) {
                    T1 = 1.0f;
                } else {
                    T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, f10);
                }
                min = Math.min(1.0f, f10) * 1.0f;
                f19 = min;
            }
            canvas2.save();
            float f31 = (f18 - (f17 * 0.04f)) * T1;
            float f32 = f18;
            canvas2.scale(f31, f31, rectF6.left + org.telegram.messenger.g0.L(18.0f), rectF6.bottom);
            if (z19 && f10 < f32 && rectF2.width() > 0.0f) {
                b(canvas2, this.I, rectF2, min);
                RectF rectF9 = rectF2;
                float f33 = f10;
                rectF4 = rectF7;
                f21 = f33;
                f20 = d11;
                g6Var = g6Var2;
                z11 = false;
                z12 = true;
                rectF3 = rectF6;
                f11 = d10;
                g6Var3 = g6Var5;
                i2.a(canvas, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, rectF2.height() / 2.0f, this.f1279h0, min * this.f1283l0, this.f1282k0);
                Path path = this.f1287p0;
                path.rewind();
                path.addRoundRect(rectF9, rectF9.height() / 2.0f, rectF9.height() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path);
                canvas2 = canvas;
            } else {
                float f34 = min;
                f20 = d11;
                f21 = f10;
                g6Var = g6Var2;
                z11 = false;
                z12 = true;
                rectF3 = rectF6;
                rectF4 = rectF7;
                f11 = d10;
                g6Var3 = g6Var5;
                b(canvas2, this.I, rectF3, f34);
                canvas2 = canvas;
                i2.a(canvas2, rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, rectF3.height() / 2.0f, this.f1279h0, this.f1283l0 * f34, this.f1282k0);
            }
            if (f19 > 0.0f) {
                float L12 = rectF3.left + org.telegram.messenger.g0.L(12.0f);
                float centerY = rectF3.centerY();
                int i12 = (int) (f19 * 255.0f);
                if (d12 < 1.0f) {
                    org.telegram.ui.ActionBar.t2 t2Var = this.f1274e;
                    t2Var.setAlpha((int) ((1.0f - d12) * i12));
                    canvas2.save();
                    float T12 = org.telegram.messenger.g0.T1(1.0f, 0.6f, d12);
                    canvas2.scale(T12, T12, org.telegram.messenger.g0.L(12.0f) + L12, centerY);
                    f22 = 0.01f;
                    t2Var.setBounds((int) L12, (int) (centerY - org.telegram.messenger.g0.L(12.0f)), (int) (org.telegram.messenger.g0.L(24.0f) + L12), (int) (org.telegram.messenger.g0.L(12.0f) + centerY));
                    t2Var.draw(canvas2);
                    canvas2.restore();
                } else {
                    f22 = 0.01f;
                }
                if (d12 > 0.0f) {
                    int i13 = this.f1280i0;
                    Paint paint3 = this.f1292s0;
                    paint3.setColor(i13);
                    paint3.setAlpha((int) (i12 * d12));
                    float T13 = org.telegram.messenger.g0.T1(0.6f, 1.0f, d12) * org.telegram.messenger.g0.N(5.0f);
                    RectF rectF10 = org.telegram.messenger.g0.P;
                    f23 = L12;
                    rectF10.set((org.telegram.messenger.g0.L(12.0f) + L12) - T13, centerY - T13, f23 + org.telegram.messenger.g0.L(12.0f) + T13, T13 + centerY);
                    canvas2.drawRoundRect(rectF10, org.telegram.messenger.g0.N(2.2f), org.telegram.messenger.g0.N(2.2f), paint3);
                } else {
                    f23 = L12;
                }
                float L13 = f23 + org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(24.0f);
                g6Var3.C = i12;
                g6Var3.setBounds((int) L13, (int) (centerY - org.telegram.messenger.g0.L(12.0f)), (int) (org.telegram.messenger.g0.L(240.0f) + L13), (int) (org.telegram.messenger.g0.L(12.0f) + centerY));
                if (textPaint.getShader() != null) {
                    textPaint.setShader(null);
                }
                canvas2.save();
                float L14 = L13 - org.telegram.messenger.g0.L(2.0f);
                float f35 = rectF3.top;
                if (this.f1288q0) {
                    L = rectF3.right;
                    L2 = org.telegram.messenger.g0.L(6.0f);
                } else {
                    L = (((rectF3.right - org.telegram.messenger.g0.L(10.0f)) - org.telegram.messenger.g0.L(14.0f)) - org.telegram.messenger.g0.L(8.0f)) - org.telegram.messenger.g0.L(1.0f);
                    L2 = org.telegram.messenger.g0.L(4.0f);
                }
                canvas2.clipRect(L14, f35, L - L2, rectF3.bottom);
                g6Var3.draw(canvas2);
                if (f20 > f22) {
                    float c10 = g6Var3.c() + L13 + org.telegram.messenger.g0.L(3.0f);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    int i14 = this.f1280i0;
                    Paint paint4 = this.F;
                    paint4.setColor(i14);
                    for (int i15 = z11; i15 < 3; i15++) {
                        float f36 = c10;
                        paint4.setAlpha((int) (i12 * f20 * ((Math.max(0.0f, (float) Math.sin(((((float) (j3 - this.f1293t0)) / 1200.0f) - (((float) i15) * 0.18f)) * 3.141592653589793d * 2.0d)) * 0.65f) + 0.35f)));
                        canvas2.drawCircle((org.telegram.messenger.g0.L(4.5f) * i15) + f36, org.telegram.messenger.g0.L(4.5f) + centerY, org.telegram.messenger.g0.N(1.4f), paint4);
                        c10 = f36;
                        uptimeMillis = uptimeMillis;
                    }
                    invalidate();
                }
                canvas2.restore();
                float L15 = (((rectF3.right - org.telegram.messenger.g0.L(10.0f)) - org.telegram.messenger.g0.L(14.0f)) - org.telegram.messenger.g0.L(8.0f)) - org.telegram.messenger.g0.L(1.0f);
                paint2.setAlpha((j6.r1(0.14f, this.f1280i0) >>> 24) & 255);
                int alpha = paint2.getAlpha();
                float f37 = 1.0f - d12;
                paint2.setAlpha((int) (alpha * f19 * f37));
                canvas2.drawRect(L15, centerY - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.N(1.0f) + L15, org.telegram.messenger.g0.L(9.0f) + centerY, paint2);
                paint = paint2;
                paint.setAlpha(alpha);
                boolean z21 = this.f1288q0;
                RectF rectF11 = this.P;
                if (z21) {
                    rectF11.setEmpty();
                } else {
                    rectF11.set(L15 - org.telegram.messenger.g0.L(4.0f), rectF3.top, rectF3.right, rectF3.bottom);
                }
                float L16 = (rectF3.right - org.telegram.messenger.g0.L(10.0f)) - org.telegram.messenger.g0.L(7.0f);
                Paint paint5 = this.G;
                paint5.setAlpha((int) (i12 * f37));
                canvas2.save();
                canvas2.translate(L16, ((centerY - org.telegram.messenger.g0.N(1.9f)) - org.telegram.messenger.g0.N(0.4f)) - (org.telegram.messenger.g0.N(1.0f) * d13));
                canvas2.drawPath(this.H, paint5);
                canvas2.restore();
            } else {
                paint = paint2;
                f22 = 0.01f;
            }
            canvas2.restore();
            float d15 = this.f1268a0.d(this.T) * f21;
            if (d15 > f22) {
                if (this.f1277f0 == 2) {
                    z16 = z12;
                } else {
                    z16 = z11;
                }
                float d16 = this.f1273d0.d(z16);
                rectF4.set(rectF3.right + org.telegram.messenger.g0.L(6.0f), rectF3.top, rectF3.right + org.telegram.messenger.g0.L(6.0f) + f16, rectF3.bottom);
                float T14 = (1.0f - (d16 * 0.08f)) * org.telegram.messenger.g0.T1(0.4f, 1.0f, d15);
                canvas2.save();
                canvas2.scale(T14, T14, rectF4.centerX(), rectF4.centerY());
                float min3 = Math.min(1.0f, d15 * 1.5f) * 1.0f;
                b(canvas2, this.J, rectF4, min3);
                i2.a(canvas2, rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, rectF4.height() / 2.0f, this.f1279h0, this.f1283l0 * min3, this.f1282k0);
                int centerX = (int) rectF4.centerX();
                int centerY2 = (int) rectF4.centerY();
                int L17 = centerX - org.telegram.messenger.g0.L(12.0f);
                int L18 = centerY2 - org.telegram.messenger.g0.L(12.0f);
                int L19 = org.telegram.messenger.g0.L(12.0f) + centerX;
                int L20 = org.telegram.messenger.g0.L(12.0f) + centerY2;
                Drawable drawable = this.h;
                drawable.setBounds(L17, L18, L19, L20);
                drawable.setAlpha((int) (min3 * 255.0f));
                drawable.draw(canvas2);
                canvas2.restore();
            } else {
                rectF4.setEmpty();
            }
        } else {
            g6Var = g6Var4;
            rectF = rectF5;
            z11 = false;
            z12 = true;
            f11 = d10;
            paint = paint2;
            rectF6.setEmpty();
            rectF7.setEmpty();
        }
        int i16 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        RectF rectF12 = this.O;
        if (i16 > 0 && z10) {
            float L21 = org.telegram.messenger.g0.L(36.0f);
            RectF rectF13 = rectF;
            rectF12.set(rectF13.left + org.telegram.messenger.g0.L(2.0f), (rectF13.top - org.telegram.messenger.g0.L(8.0f)) - L21, rectF13.left + org.telegram.messenger.g0.L(2.0f) + this.f1302z0, rectF13.top - org.telegram.messenger.g0.L(8.0f));
            float L22 = (((rectF12.right - org.telegram.messenger.g0.L(9.0f)) - org.telegram.messenger.g0.L(20.0f)) - org.telegram.messenger.g0.L(8.0f)) - org.telegram.messenger.g0.L(1.0f);
            this.Q.set(L22 - org.telegram.messenger.g0.L(4.0f), rectF12.top, rectF12.right, rectF12.bottom);
            View view2 = this.d;
            if (Math.abs(view2.getLeft() - rectF12.left) > 1.0f || Math.abs(view2.getTop() - rectF12.top) > 1.0f || Math.abs(view2.getRight() - L22) > 1.0f || view2.getHeight() != ((int) L21)) {
                view2.layout((int) rectF12.left, (int) rectF12.top, (int) L22, (int) rectF12.bottom);
            }
            int i17 = this.f1277f0;
            if (i17 != 3 && i17 != 4) {
                z13 = z11;
            } else {
                z13 = z12;
            }
            float f38 = f11;
            float C = com.google.android.gms.internal.vision.e2.C(this.f1275e0.d(z13), 0.04f, 1.0f, org.telegram.messenger.g0.T1(0.4f, 1.0f, f38));
            float max3 = Math.max(0.0f, Math.min(1.0f, f38 * 1.5f));
            canvas2.save();
            canvas2.scale(C, C, rectF12.left + org.telegram.messenger.g0.L(18.0f), rectF12.bottom);
            b(canvas2, this.K, rectF12, max3);
            i2.a(canvas2, rectF12.left, rectF12.top, rectF12.right, rectF12.bottom, rectF12.height() / 2.0f, this.f1279h0, this.f1283l0 * max3, this.f1282k0);
            float centerY3 = rectF12.centerY();
            int L23 = (int) (rectF12.left + org.telegram.messenger.g0.L(10.0f));
            int L24 = (int) (centerY3 - org.telegram.messenger.g0.L(10.0f));
            Drawable drawable2 = this.f1289r;
            drawable2.setBounds(L23, L24, org.telegram.messenger.g0.L(20.0f) + L23, org.telegram.messenger.g0.L(20.0f) + L24);
            float f39 = max3 * 255.0f;
            int i18 = (int) f39;
            drawable2.setAlpha(i18);
            drawable2.draw(canvas2);
            float L25 = rectF12.left + org.telegram.messenger.g0.L(10.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(6.0f);
            g6 g6Var6 = g6Var;
            g6Var6.C = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.C0.d(this.f1301y0)) * f39);
            float N = centerY3 - org.telegram.messenger.g0.N(1.0f);
            g6Var6.setBounds((int) L25, (int) (N - org.telegram.messenger.g0.L(12.0f)), (int) (org.telegram.messenger.g0.L(240.0f) + L25), (int) (N + org.telegram.messenger.g0.L(12.0f)));
            canvas2.save();
            canvas2.clipRect(L25 - org.telegram.messenger.g0.L(2.0f), rectF12.top, L22 - org.telegram.messenger.g0.L(4.0f), rectF12.bottom);
            g6Var6.draw(canvas2);
            canvas2.restore();
            int alpha2 = paint.getAlpha();
            paint.setAlpha((int) (alpha2 * max3));
            Paint paint6 = paint;
            canvas2.drawRect(L22, centerY3 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.N(1.0f) + L22, centerY3 + org.telegram.messenger.g0.L(9.0f), paint6);
            paint6.setAlpha(alpha2);
            int L26 = (int) ((rectF12.right - org.telegram.messenger.g0.L(9.0f)) - org.telegram.messenger.g0.L(10.0f));
            int i19 = (int) centerY3;
            int L27 = L26 - org.telegram.messenger.g0.L(10.0f);
            int L28 = i19 - org.telegram.messenger.g0.L(10.0f);
            int L29 = org.telegram.messenger.g0.L(10.0f) + L26;
            int L30 = org.telegram.messenger.g0.L(10.0f) + i19;
            Drawable drawable3 = this.f1284n;
            drawable3.setBounds(L27, L28, L29, L30);
            drawable3.setAlpha(i18);
            drawable3.draw(canvas2);
            canvas2.restore();
        } else {
            rectF12.setEmpty();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = false;
        if (this.D0 != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                RectF rectF = this.M;
                if (!rectF.isEmpty()) {
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(rectF);
                    rectF2.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
                    this.f1278g0 = rectF2.contains(motionEvent.getX(), motionEvent.getY());
                }
            }
            if (this.f1278g0) {
                if (actionMasked == 1) {
                    this.f1278g0 = false;
                    a();
                    return true;
                } else if (actionMasked == 3) {
                    this.f1278g0 = false;
                    return true;
                }
            } else {
                return super.dispatchTouchEvent(motionEvent);
            }
        } else {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.f1277f0 = c(motionEvent.getX(), motionEvent.getY());
                invalidate();
                if (this.f1277f0 < 0) {
                    return false;
                }
            } else {
                int i7 = this.f1277f0;
                if (i7 >= 0) {
                    if (actionMasked2 == 1) {
                        this.f1277f0 = -1;
                        invalidate();
                        if (c(motionEvent.getX(), motionEvent.getY()) == i7) {
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            m0 m0Var = this.f1267a;
                            if (i7 == 0) {
                                int i10 = m0Var.f1378r;
                                if (i10 == 1) {
                                    m0Var.n();
                                } else if (i10 == 3) {
                                    m0Var.c(m0Var.K);
                                }
                            } else {
                                h hVar = i.f1244c;
                                if (i7 == 1) {
                                    Context context = m0Var.h;
                                    e6 e6Var = m0Var.f1373n;
                                    int i11 = m0Var.f1378r;
                                    if (i11 == 3 || i11 == 4) {
                                        bi.x0 x0Var = new bi.x0(context, this.f1271c, e6Var, new z(m0Var, 3));
                                        x0Var.R = true;
                                        x0Var.f3970f = org.telegram.messenger.g0.L(316);
                                        x0Var.K = org.telegram.messenger.g0.L(220);
                                        x0Var.Q = true;
                                        x0Var.J = 0;
                                        int w02 = j6.w0(j6.G6, e6Var);
                                        x0Var.a(new j0(context, w02, j6.w0(j6.F8, e6Var)), 44, new a0(m0Var, 4));
                                        ArrayList d = m0Var.H.d();
                                        d.add(hVar);
                                        int size = d.size();
                                        int i12 = 0;
                                        while (i12 < size) {
                                            Object obj = d.get(i12);
                                            i12++;
                                            h hVar2 = (h) obj;
                                            Context context2 = m0Var.h;
                                            int i13 = m0Var.f1365f.f32967b.R;
                                            if (hVar2 == m0Var.K && m0Var.J != null) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            x0Var.a(new l0(context2, hVar2, w02, i13, z10), 44, new a1.e(14, m0Var, hVar2));
                                        }
                                        j1 j1Var = m0Var.f1385w;
                                        j1Var.D0 = x0Var;
                                        j1Var.addView(x0Var, new FrameLayout.LayoutParams(-1, -1));
                                        j1Var.invalidate();
                                        x0Var.setFocusableInTouchMode(true);
                                        x0Var.setOnKeyListener(new d0(1, x0Var));
                                        x0Var.requestFocus();
                                        x0Var.P = new a0(m0Var, 5);
                                        x0Var.f();
                                    }
                                } else if (i7 == 3) {
                                    if (m0Var.f1378r == 1) {
                                        m0Var.n();
                                    }
                                    ae aeVar = m0Var.f1365f;
                                    v2 v2Var = new v2();
                                    an anVar = aeVar.f32967b.f32319x3;
                                    if (anVar != null) {
                                        anVar.presentFragment(v2Var);
                                    }
                                } else if (i7 == 4) {
                                    m0Var.f1385w.a();
                                    Context context3 = m0Var.h;
                                    e6 e6Var2 = m0Var.f1373n;
                                    bi.x0 x0Var2 = new bi.x0(context3, this.d, e6Var2, new z(m0Var, 1));
                                    x0Var2.R = true;
                                    x0Var2.f3970f = org.telegram.messenger.g0.L(316);
                                    x0Var2.K = org.telegram.messenger.g0.L(200);
                                    x0Var2.Q = true;
                                    x0Var2.J = 0;
                                    int w03 = j6.w0(j6.G6, e6Var2);
                                    boolean v = DictationAsr.v();
                                    x0Var2.a(new k0(context3, "Auto-Detect", w03, v), 44, new o(1));
                                    String[] C = DictationAsr.C();
                                    int length = C.length;
                                    int i14 = 0;
                                    while (i14 < length) {
                                        String str = C[i14];
                                        String l10 = m0.l(str);
                                        if (!v && DictationAsr.y(str)) {
                                            z11 = true;
                                        }
                                        x0Var2.a(new k0(context3, l10, w03, z11), 44, new a1.e(13, m0Var, str));
                                        i14++;
                                        z11 = false;
                                    }
                                    j1 j1Var2 = m0Var.f1385w;
                                    j1Var2.D0 = x0Var2;
                                    j1Var2.addView(x0Var2, new FrameLayout.LayoutParams(-1, -1));
                                    j1Var2.invalidate();
                                    x0Var2.setFocusableInTouchMode(true);
                                    x0Var2.setOnKeyListener(new d0(0, x0Var2));
                                    x0Var2.requestFocus();
                                    x0Var2.P = new a0(m0Var, 2);
                                    x0Var2.f();
                                } else {
                                    String str2 = m0Var.J;
                                    if (str2 != null && m0Var.f1378r == 3) {
                                        m0Var.J = null;
                                        m0Var.p(str2);
                                        m0Var.K = hVar;
                                        m0Var.f1385w.setRevert(false);
                                        m0Var.f1385w.d("Enhance", false);
                                    }
                                }
                            }
                        }
                    } else if (actionMasked2 == 3) {
                        this.f1277f0 = -1;
                        invalidate();
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final void e() {
        boolean z10;
        int i7;
        int i10;
        int i11;
        int i12 = j6.f28849d6;
        e6 e6Var = this.f1269b;
        if (org.telegram.messenger.g0.B(j6.w0(i12, e6Var)) < 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1279h0 = z10;
        int w02 = j6.w0(j6.G6, e6Var);
        this.f1280i0 = w02;
        this.f1281j0 = w02;
        this.f1291s.u(w02);
        this.f1295v0.u(this.f1280i0);
        int i13 = this.f1281j0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f1274e.setColorFilter(new PorterDuffColorFilter(i13, mode));
        this.f1276f.setColorFilter(new PorterDuffColorFilter(this.f1281j0, mode));
        this.G.setColor(this.f1281j0);
        this.h.setColorFilter(new PorterDuffColorFilter(this.f1281j0, mode));
        this.f1284n.setColorFilter(new PorterDuffColorFilter(this.f1281j0, mode));
        this.f1289r.setColorFilter(new PorterDuffColorFilter(this.f1281j0, mode));
        if (this.f1279h0) {
            i7 = -651810255;
        } else {
            i7 = -335544321;
        }
        this.f1296w.setColor(i7);
        if (this.f1279h0) {
            i10 = 654311423;
        } else {
            i10 = 335544320;
        }
        this.f1298x.setColor(i10);
        this.E.setColor(j6.r1(0.14f, this.f1280i0));
        Paint paint = this.f1300y;
        paint.setColor(16777216);
        float L = org.telegram.messenger.g0.L(8.0f);
        float L2 = org.telegram.messenger.g0.L(2.0f);
        if (this.f1279h0) {
            i11 = 1426063360;
        } else {
            i11 = 570425344;
        }
        paint.setShadowLayer(L, 0.0f, L2, i11);
        fh.g gVar = this.I;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.J;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        fh.g gVar3 = this.K;
        if (gVar3 != null) {
            gVar3.updateColors();
        }
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt != this.f1271c && childAt != this.d) {
                childAt.layout(0, 0, i11 - i7, i12 - i10);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view == this.D0) {
            this.D0 = null;
            invalidate();
        }
    }

    public void setIsland(boolean z10) {
        if (this.S == z10) {
            return;
        }
        this.S = z10;
        if (z10) {
            this.W.e(true, 0.0f);
            this.V.e(true, 0.0f);
            this.m0 = true;
            org.telegram.ui.ActionBar.t2 t2Var = this.f1274e;
            Objects.requireNonNull(t2Var);
            org.telegram.messenger.g0.i3(new org.telegram.ui.Components.g0(t2Var, 1), 160L);
        }
        invalidate();
    }

    public void setLanguage(CharSequence charSequence) {
        boolean z10;
        boolean z11 = false;
        if (charSequence != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f1297w0 && this.A0.f39903c > 0.0f) {
            z11 = true;
        }
        if (!z11) {
            this.C0.a(z10);
            this.f1299x0 = true;
        }
        this.f1301y0 = z10;
        if (!z10) {
            charSequence = "Detecting…";
        }
        this.f1295v0.t(charSequence, z11, true);
        invalidate();
    }

    public void setRevert(boolean z10) {
        if (this.T == z10) {
            return;
        }
        this.T = z10;
        invalidate();
    }

    public void setSettings(boolean z10) {
        if (this.f1297w0 == z10) {
            return;
        }
        this.f1297w0 = z10;
        if (z10 && this.A0.f39903c <= 0.0f) {
            this.f1299x0 = true;
        }
        invalidate();
    }

    public void setStopMode(boolean z10) {
        float f10;
        if (this.f1288q0 == z10) {
            return;
        }
        this.f1288q0 = z10;
        if (!this.S) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f1290r0.e(true, f10);
        }
        if (!z10) {
            org.telegram.ui.ActionBar.t2 t2Var = this.f1274e;
            Objects.requireNonNull(t2Var);
            org.telegram.messenger.g0.i3(new org.telegram.ui.Components.g0(t2Var, 1), 120L);
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f1274e && drawable != this.f1291s && drawable != this.f1295v0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
