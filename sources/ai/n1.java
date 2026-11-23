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
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sf;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.bn;
public final class n1 extends FrameLayout {
    public static final nr I0 = new nr(0.34d, 1.32d, 0.5d, 1.0d);
    public static final float J0 = org.telegram.messenger.g0.L(36.0f);
    public static final float K0 = org.telegram.messenger.g0.L(8.0f);
    public boolean A0;
    public float B0;
    public final d6 C0;
    public final d6 D0;
    public final Paint E;
    public final d6 E0;
    public final Paint F;
    public final d6 F0;
    public final Paint G;
    public bi.b1 G0;
    public final Path H;
    public final d6 H0;
    public fh.g I;
    public fh.g J;
    public fh.g K;
    public fh.g L;
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
    public final d6 W;
    public final p0 f1308a;
    public final d6 f1309a0;
    public final h6 f1310b;
    public final d6 f1311b0;
    public final View f1312c;
    public final d6 f1313c0;
    public final View d;
    public final d6 f1314d0;
    public final org.telegram.ui.ActionBar.v2 f1315e;
    public final d6 f1316e0;
    public final Drawable f1317f;
    public final d6 f1318f0;
    public int f1319g0;
    public final Drawable h;
    public boolean f1320h0;
    public boolean f1321i0;
    public int f1322j0;
    public int f1323k0;
    public float f1324l0;
    public float m0;
    public final Drawable f1325n;
    public boolean f1326n0;
    public final RectF f1327o0;
    public float f1328p0;
    public final Path f1329q0;
    public final Drawable f1330r;
    public boolean f1331r0;
    public final n6 f1332s;
    public final d6 f1333s0;
    public final Paint f1334t0;
    public long f1335u0;
    public final d6 f1336v0;
    public final Paint f1337w;
    public final String f1338w0;
    public final Paint f1339x;
    public final n6 f1340x0;
    public final Paint f1341y;
    public boolean f1342y0;
    public boolean f1343z0;

    public n1(Context context, h6 h6Var, p0 p0Var) {
        super(context);
        this.f1337w = new Paint(1);
        Paint paint = new Paint(1);
        this.f1339x = paint;
        this.f1341y = new Paint(1);
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
        this.W = new d6(this, 0L, 280L, new nr(0.0f, 0.0f, 1.0f, 1.0f));
        nr nrVar = nr.h;
        this.f1309a0 = new d6(this, 0L, 240L, nrVar);
        nr nrVar2 = I0;
        this.f1311b0 = new d6(this, 0L, 460L, nrVar2);
        nr nrVar3 = nr.f37962g;
        this.f1313c0 = new d6(this, 0L, 260L, nrVar3);
        this.f1314d0 = new d6(this, 0L, 160L, nrVar);
        this.f1316e0 = new d6(this, 0L, 160L, nrVar);
        this.f1318f0 = new d6(this, 0L, 160L, nrVar);
        this.f1319g0 = -1;
        this.f1327o0 = new RectF();
        this.f1328p0 = -1.0f;
        this.f1329q0 = new Path();
        this.f1333s0 = new d6(this, 0L, 300L, nrVar);
        this.f1334t0 = new Paint(1);
        this.f1336v0 = new d6(this, 0L, 260L, nrVar3);
        String N0 = hd.N0(2131745065, null);
        this.f1338w0 = N0;
        this.f1343z0 = true;
        this.C0 = new d6(this, 0L, 380L, nrVar2);
        this.D0 = new d6(this, 0L, 260L, nrVar3);
        this.E0 = new d6(this, 0L, 260L, nrVar3);
        this.F0 = new d6(this, 0L, 160L, nrVar);
        this.H0 = new d6(this, 0L, 300L, nrVar);
        this.f1308a = p0Var;
        this.f1310b = h6Var;
        setWillNotDraw(false);
        setClipChildren(false);
        View view = new View(context);
        this.f1312c = view;
        addView(view, new FrameLayout.LayoutParams(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f)));
        View view2 = new View(context);
        this.d = view2;
        addView(view2, new FrameLayout.LayoutParams(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f)));
        org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(context);
        this.f1315e = v2Var;
        v2Var.setCallback(this);
        this.f1317f = context.getResources().getDrawable(2131230871).mutate();
        this.h = i5.c.g(context, 2131231001);
        this.f1325n = i5.c.g(context, 2131232362);
        this.f1330r = i5.c.g(context, 2131232196);
        n6 n6Var = new n6(false, false, false);
        this.f1332s = n6Var;
        n6Var.n(0.33f, 260L, nrVar3);
        n6Var.A = true;
        n6Var.w(org.telegram.messenger.g0.L(15.0f));
        n6Var.x(org.telegram.messenger.g0.o());
        n6Var.setCallback(this);
        n6Var.t(hd.N0(2131745060, null), false, true);
        n6 n6Var2 = new n6(false, false, false);
        this.f1340x0 = n6Var2;
        n6Var2.n(0.33f, 260L, nrVar3);
        n6Var2.w(org.telegram.messenger.g0.L(15.0f));
        n6Var2.x(org.telegram.messenger.g0.o());
        n6Var2.setCallback(this);
        n6Var2.t(N0, false, true);
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
        bi.b1 b1Var = this.G0;
        if (b1Var != null && !b1Var.O) {
            b1Var.c(null);
            invalidate();
        }
    }

    public final void b(Canvas canvas, fh.g gVar, RectF rectF, float f10) {
        if (f10 <= 0.0f) {
            return;
        }
        float height = rectF.height() / 2.0f;
        if (gVar != null) {
            if (gVar == this.I && Math.abs(this.f1328p0 - height) > 0.5f) {
                this.f1328p0 = height;
                gVar.r(height);
            }
            gVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            gVar.setAlpha((int) (f10 * 255.0f));
            gVar.draw(canvas);
            return;
        }
        Paint paint = this.f1341y;
        paint.setAlpha((int) (255.0f * f10));
        canvas.drawRoundRect(rectF, height, height, paint);
        Paint paint2 = this.f1337w;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * f10));
        canvas.drawRoundRect(rectF, height, height, paint2);
        paint2.setAlpha(alpha);
        Paint paint3 = this.f1339x;
        int alpha2 = paint3.getAlpha();
        paint3.setAlpha((int) (alpha2 * f10));
        canvas.drawRoundRect(rectF, height, height, paint3);
        paint3.setAlpha(alpha2);
    }

    public final int c(float f10, float f11) {
        float L = org.telegram.messenger.g0.L(4.0f);
        if (this.f1342y0 && this.C0.f34386c > 0.7f) {
            RectF rectF = this.P;
            if (!rectF.isEmpty() && f11 >= rectF.top - L && f11 <= rectF.bottom + L) {
                RectF rectF2 = this.R;
                int i7 = (f10 > (rectF2.left - L) ? 1 : (f10 == (rectF2.left - L) ? 0 : -1));
                float f12 = K0;
                if (i7 >= 0) {
                    if (f10 < (f12 / 2.0f) + rectF2.right) {
                        return 3;
                    }
                }
                if (f10 >= rectF.left - (f12 / 2.0f) && f10 <= rectF.right + L) {
                    return 4;
                }
            }
        }
        if (this.T && this.W.f34386c >= 0.7f) {
            RectF rectF3 = this.O;
            if (!rectF3.isEmpty() && f10 >= rectF3.left - L && f10 <= rectF3.right + L && f11 >= rectF3.top - L && f11 <= rectF3.bottom + L) {
                return 2;
            }
            RectF rectF4 = this.N;
            if (!rectF4.isEmpty() && f11 >= rectF4.top - L && f11 <= rectF4.bottom + L && f10 >= rectF4.left - L && f10 <= rectF4.right + L) {
                RectF rectF5 = this.Q;
                if (!rectF5.isEmpty() && rectF5.contains(f10, Math.max(rectF4.top, Math.min(rectF4.bottom - 1.0f, f11)))) {
                    return 1;
                }
                return 0;
            }
        }
        return -1;
    }

    public final void d(String str, boolean z10) {
        String str2;
        if (z10 && !this.V) {
            this.f1335u0 = SystemClock.uptimeMillis();
        }
        this.V = z10;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str.toString();
        }
        if (str2.endsWith("…")) {
            str2 = com.google.android.gms.internal.vision.e2.k(str2, 1, 0);
        } else if (str2.endsWith("...")) {
            str2 = com.google.android.gms.internal.vision.e2.k(str2, 3, 0);
        }
        this.f1332s.t(str2, true, true);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int[] iArr;
        boolean z10;
        n6 n6Var;
        RectF rectF;
        Path path;
        boolean z11;
        boolean z12;
        float f11;
        float f12;
        boolean z13;
        boolean z14;
        float f13;
        float f14;
        int i7;
        Path path2;
        float f15;
        float f16;
        TextPaint textPaint;
        boolean z15;
        boolean z16;
        float f17;
        RectF rectF2;
        float f18;
        float T1;
        float min;
        float f19;
        float f20;
        float f21;
        float f22;
        RectF rectF3;
        RectF rectF4;
        float f23;
        float f24;
        boolean z17;
        float f25;
        float L;
        int L2;
        long j3;
        Canvas canvas2 = canvas;
        boolean z18 = this.T;
        d6 d6Var = this.W;
        float d = d6Var.d(z18);
        float d2 = this.f1309a0.d(!this.T);
        if (!this.T) {
            d = Math.min(1.0f, d) * (1.0f - d2);
        }
        if (!this.T && d2 >= 1.0f) {
            d6Var.e(true, 0.0f);
            f10 = 0.0f;
        } else {
            f10 = d;
        }
        float d10 = this.C0.d(this.f1342y0);
        int L3 = org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(12.0f);
        n6 n6Var2 = this.f1340x0;
        float L4 = org.telegram.messenger.g0.L(6.0f) + L3 + n6Var2.d + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(13.0f);
        boolean z19 = this.f1343z0;
        d6 d6Var2 = this.D0;
        if (z19) {
            this.f1343z0 = false;
            d6Var2.e(true, L4);
        }
        this.B0 = d6Var2.e(false, L4);
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        RectF rectF5 = this.M;
        if ((i10 <= 0 && d10 <= 0.0f) || !this.f1308a.m(rectF5)) {
            z10 = false;
        } else {
            getLocationInWindow(this.S);
            rectF5.offset(-iArr[0], -iArr[1]);
            z10 = true;
        }
        Path path3 = this.H;
        float f26 = K0;
        float f27 = J0;
        RectF rectF6 = this.N;
        RectF rectF7 = this.O;
        Paint paint = this.G;
        if (i10 > 0 && z10) {
            boolean z20 = this.T;
            float L5 = org.telegram.messenger.g0.L(36.0f);
            f12 = 3.0f;
            float d11 = this.f1336v0.d(this.V);
            n6 n6Var3 = this.f1332s;
            float f28 = n6Var3.d;
            TextPaint textPaint2 = n6Var3.f37794a;
            float L6 = org.telegram.messenger.g0.L(16.0f);
            if (this.V) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            float f29 = (f13 * L6) + f28;
            float d12 = this.f1333s0.d(this.f1331r0);
            float L7 = org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(24.0f) + org.telegram.messenger.g0.L(12.0f) + f29 + org.telegram.messenger.g0.L(12.0f);
            if (this.f1331r0) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            int L8 = org.telegram.messenger.g0.L(1.0f);
            int L9 = org.telegram.messenger.g0.L(14.0f);
            float L10 = ((org.telegram.messenger.g0.L(10.0f) + L9 + org.telegram.messenger.g0.L(8.0f) + L8) * (1.0f - f14)) + L7;
            if (this.f1331r0) {
                i7 = org.telegram.messenger.g0.L(4.0f);
            } else {
                i7 = 0;
            }
            float f30 = L10 + i7;
            boolean z21 = this.f1326n0;
            d6 d6Var3 = this.f1313c0;
            if (z21) {
                path2 = path3;
                this.f1326n0 = false;
                d6Var3.e(true, f30);
            } else {
                path2 = path3;
            }
            float e10 = d6Var3.e(false, f30);
            float L11 = rectF5.left + org.telegram.messenger.g0.L(2.0f);
            if (this.f1342y0) {
                f15 = e10;
                f16 = f27 + f26 + this.B0 + f26;
            } else {
                f15 = e10;
                f16 = 0.0f;
            }
            float f31 = L11 + f16;
            float L12 = rectF5.top - org.telegram.messenger.g0.L(8.0f);
            rectF6.set(f31, L12 - L5, f31 + f15, L12);
            View view = this.f1312c;
            if (Math.abs(view.getLeft() - rectF6.left) <= 1.0f && Math.abs(view.getTop() - rectF6.top) <= 1.0f && Math.abs(view.getWidth() - rectF6.width()) <= 1.0f && view.getHeight() == ((int) L5)) {
                textPaint = textPaint2;
            } else {
                textPaint = textPaint2;
                view.layout((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
            }
            bi.b1 b1Var = this.G0;
            if (b1Var != null && !b1Var.O) {
                z15 = true;
            } else {
                z15 = false;
            }
            float d13 = this.H0.d(z15);
            int i11 = this.f1319g0;
            if (i11 != 0 && i11 != 1) {
                z16 = false;
            } else {
                z16 = true;
            }
            float d14 = this.f1314d0.d(z16);
            RectF rectF8 = this.f1327o0;
            if (z20 && f10 < 1.0f) {
                float max = Math.max(0.0f, f10);
                float f32 = 1.0f - max;
                float min2 = 1.0f - Math.min(1.0f, max / 0.55f);
                float sin = ((((float) Math.sin(Math.min(1.0f, max / 0.8f) * 3.141592653589793d)) * 0.07f * f32) + ((1.0f - (min2 * min2)) * 0.38f) + 0.62f) * L5;
                float max2 = Math.max(sin, org.telegram.messenger.g0.T1(L5 * 0.62f, rectF6.width(), 1.0f - ((float) Math.pow(f32, 3.0d))));
                float f33 = rectF6.left;
                float f34 = rectF6.bottom;
                f17 = d14;
                rectF2 = rectF8;
                rectF2.set(f33, f34 - sin, max2 + f33, f34);
                f18 = 1.0f;
                min = Math.min(1.0f, max * 3.0f) * 1.0f;
                T1 = 1.0f;
                f19 = Math.max(0.0f, Math.min(1.0f, (max - 0.62f) / 0.38f)) * 1.0f;
            } else {
                f17 = d14;
                rectF2 = rectF8;
                f18 = 1.0f;
                rectF2.set(rectF6);
                if (z20) {
                    T1 = 1.0f;
                } else {
                    T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, f10);
                }
                min = Math.min(1.0f, f10) * 1.0f;
                f19 = min;
            }
            canvas2.save();
            float f35 = (f18 - (f17 * 0.04f)) * T1;
            float f36 = f18;
            canvas2.scale(f35, f35, rectF6.left + org.telegram.messenger.g0.L(18.0f), rectF6.bottom);
            if (z20 && f10 < f36 && rectF2.width() > 0.0f) {
                b(canvas2, this.I, rectF2, min);
                f20 = L5;
                RectF rectF9 = rectF2;
                rectF4 = rectF7;
                f11 = d10;
                f21 = d11;
                f22 = f10;
                n6Var = n6Var2;
                path = path2;
                rectF = rectF5;
                z11 = false;
                z12 = true;
                rectF3 = rectF6;
                m2.a(canvas, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, rectF2.height() / 2.0f, this.f1321i0, min * this.m0, this.f1324l0);
                Path path4 = this.f1329q0;
                path4.rewind();
                path4.addRoundRect(rectF9, rectF9.height() / 2.0f, rectF9.height() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path4);
                canvas2 = canvas;
            } else {
                float f37 = min;
                f20 = L5;
                f21 = d11;
                f22 = f10;
                f11 = d10;
                n6Var = n6Var2;
                path = path2;
                rectF = rectF5;
                z11 = false;
                z12 = true;
                rectF3 = rectF6;
                rectF4 = rectF7;
                b(canvas2, this.I, rectF3, f37);
                canvas2 = canvas;
                m2.a(canvas2, rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, rectF3.height() / 2.0f, this.f1321i0, this.m0 * f37, this.f1324l0);
            }
            if (f19 > 0.0f) {
                float L13 = rectF3.left + org.telegram.messenger.g0.L(12.0f);
                float centerY = rectF3.centerY();
                int i12 = (int) (f19 * 255.0f);
                if (d12 < 1.0f) {
                    f23 = 0.01f;
                    org.telegram.ui.ActionBar.v2 v2Var = this.f1315e;
                    v2Var.setAlpha((int) (i12 * (1.0f - d12)));
                    canvas2.save();
                    float T12 = org.telegram.messenger.g0.T1(1.0f, 0.6f, d12);
                    canvas2.scale(T12, T12, org.telegram.messenger.g0.L(12.0f) + L13, centerY);
                    f24 = 0.4f;
                    v2Var.setBounds((int) L13, (int) (centerY - org.telegram.messenger.g0.L(12.0f)), (int) (org.telegram.messenger.g0.L(24.0f) + L13), (int) (org.telegram.messenger.g0.L(12.0f) + centerY));
                    v2Var.draw(canvas2);
                    canvas2.restore();
                } else {
                    f23 = 0.01f;
                    f24 = 0.4f;
                }
                if (d12 > 0.0f) {
                    int i13 = this.f1322j0;
                    Paint paint2 = this.f1334t0;
                    paint2.setColor(i13);
                    paint2.setAlpha((int) (i12 * d12));
                    float T13 = org.telegram.messenger.g0.T1(0.6f, 1.0f, d12) * org.telegram.messenger.g0.N(5.0f);
                    RectF rectF10 = org.telegram.messenger.g0.P;
                    f25 = L13;
                    rectF10.set((org.telegram.messenger.g0.L(12.0f) + L13) - T13, centerY - T13, f25 + org.telegram.messenger.g0.L(12.0f) + T13, T13 + centerY);
                    canvas2.drawRoundRect(rectF10, org.telegram.messenger.g0.N(2.2f), org.telegram.messenger.g0.N(2.2f), paint2);
                } else {
                    f25 = L13;
                }
                float L14 = f25 + org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(24.0f);
                n6Var3.C = i12;
                n6Var3.setBounds((int) L14, (int) (centerY - org.telegram.messenger.g0.L(12.0f)), (int) (org.telegram.messenger.g0.L(240.0f) + L14), (int) (org.telegram.messenger.g0.L(12.0f) + centerY));
                if (textPaint.getShader() != null) {
                    textPaint.setShader(null);
                }
                canvas2.save();
                float L15 = L14 - org.telegram.messenger.g0.L(2.0f);
                float f38 = rectF3.top;
                if (this.f1331r0) {
                    L = rectF3.right;
                    L2 = org.telegram.messenger.g0.L(6.0f);
                } else {
                    L = (((rectF3.right - org.telegram.messenger.g0.L(10.0f)) - org.telegram.messenger.g0.L(14.0f)) - org.telegram.messenger.g0.L(8.0f)) - org.telegram.messenger.g0.L(1.0f);
                    L2 = org.telegram.messenger.g0.L(4.0f);
                }
                canvas2.clipRect(L15, f38, L - L2, rectF3.bottom);
                n6Var3.draw(canvas2);
                if (f21 > f23) {
                    float c10 = n6Var3.c() + L14 + org.telegram.messenger.g0.L(3.0f);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    int i14 = this.f1322j0;
                    Paint paint3 = this.F;
                    paint3.setColor(i14);
                    for (int i15 = z11; i15 < 3; i15++) {
                        float f39 = c10;
                        paint3.setAlpha((int) (i12 * f21 * ((Math.max(0.0f, (float) Math.sin(((((float) (j3 - this.f1335u0)) / 1200.0f) - (((float) i15) * 0.18f)) * 3.141592653589793d * 2.0d)) * 0.65f) + 0.35f)));
                        canvas2.drawCircle((org.telegram.messenger.g0.L(4.5f) * i15) + f39, org.telegram.messenger.g0.L(4.5f) + centerY, org.telegram.messenger.g0.N(1.4f), paint3);
                        c10 = f39;
                        uptimeMillis = uptimeMillis;
                    }
                    invalidate();
                }
                canvas2.restore();
                float L16 = (((rectF3.right - org.telegram.messenger.g0.L(10.0f)) - org.telegram.messenger.g0.L(14.0f)) - org.telegram.messenger.g0.L(8.0f)) - org.telegram.messenger.g0.L(1.0f);
                Paint paint4 = this.E;
                paint4.setAlpha((m6.r1(0.14f, this.f1322j0) >>> 24) & 255);
                int alpha = paint4.getAlpha();
                float f40 = 1.0f - d12;
                paint4.setAlpha((int) (alpha * f19 * f40));
                canvas2.drawRect(L16, centerY - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.N(1.0f) + L16, org.telegram.messenger.g0.L(9.0f) + centerY, paint4);
                paint4.setAlpha(alpha);
                boolean z22 = this.f1331r0;
                RectF rectF11 = this.Q;
                if (z22) {
                    rectF11.setEmpty();
                } else {
                    rectF11.set(L16 - org.telegram.messenger.g0.L(4.0f), rectF3.top, rectF3.right, rectF3.bottom);
                }
                float L17 = (rectF3.right - org.telegram.messenger.g0.L(10.0f)) - org.telegram.messenger.g0.L(7.0f);
                paint.setAlpha((int) (i12 * f40));
                canvas2.save();
                canvas2.translate(L17, ((centerY - org.telegram.messenger.g0.N(1.9f)) - org.telegram.messenger.g0.N(f24)) - (org.telegram.messenger.g0.N(1.0f) * d13));
                canvas2.drawPath(path, paint);
                canvas2.restore();
            } else {
                f23 = 0.01f;
                f24 = 0.4f;
            }
            canvas2.restore();
            float d15 = this.f1311b0.d(this.U) * f22;
            if (d15 > f23) {
                if (this.f1319g0 == 2) {
                    z17 = z12;
                } else {
                    z17 = z11;
                }
                float d16 = this.f1316e0.d(z17);
                rectF4.set(rectF3.right + org.telegram.messenger.g0.L(6.0f), rectF3.top, rectF3.right + org.telegram.messenger.g0.L(6.0f) + f20, rectF3.bottom);
                float T14 = (1.0f - (d16 * 0.08f)) * org.telegram.messenger.g0.T1(f24, 1.0f, d15);
                canvas2.save();
                canvas2.scale(T14, T14, rectF4.centerX(), rectF4.centerY());
                float min3 = Math.min(1.0f, d15 * 1.5f) * 1.0f;
                b(canvas2, this.J, rectF4, min3);
                m2.a(canvas2, rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, rectF4.height() / 2.0f, this.f1321i0, this.m0 * min3, this.f1324l0);
                int centerX = (int) rectF4.centerX();
                int centerY2 = (int) rectF4.centerY();
                int L18 = centerX - org.telegram.messenger.g0.L(12.0f);
                int L19 = centerY2 - org.telegram.messenger.g0.L(12.0f);
                int L20 = org.telegram.messenger.g0.L(12.0f) + centerX;
                int L21 = org.telegram.messenger.g0.L(12.0f) + centerY2;
                Drawable drawable = this.h;
                drawable.setBounds(L18, L19, L20, L21);
                drawable.setAlpha((int) (min3 * 255.0f));
                drawable.draw(canvas2);
                canvas2.restore();
            } else {
                rectF4.setEmpty();
            }
        } else {
            n6Var = n6Var2;
            rectF = rectF5;
            path = path3;
            z11 = false;
            z12 = true;
            f11 = d10;
            f12 = 3.0f;
            rectF6.setEmpty();
            rectF7.setEmpty();
        }
        int i16 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        RectF rectF12 = this.P;
        if (i16 > 0 && z10) {
            float L22 = org.telegram.messenger.g0.L(36.0f);
            RectF rectF13 = rectF;
            float L23 = rectF13.top - org.telegram.messenger.g0.L(8.0f);
            float f41 = L23 - L22;
            RectF rectF14 = this.R;
            rectF14.set(rectF13.left + org.telegram.messenger.g0.L(2.0f), f41, rectF13.left + org.telegram.messenger.g0.L(2.0f) + f27, L23);
            float f42 = rectF14.right + f26;
            rectF12.set(f42, f41, this.B0 + f42, L23);
            View view2 = this.d;
            if (Math.abs(view2.getLeft() - rectF12.left) > 1.0f || Math.abs(view2.getTop() - rectF12.top) > 1.0f || Math.abs(view2.getRight() - rectF12.right) > 1.0f || view2.getHeight() != ((int) L22)) {
                view2.layout((int) rectF12.left, (int) rectF12.top, (int) rectF12.right, (int) rectF12.bottom);
            }
            float f43 = f11;
            float max3 = Math.max(0.0f, Math.min(1.0f, f43));
            float C = com.google.android.gms.internal.vision.e2.C(max3, 2.0f, f12, max3 * max3);
            float max4 = Math.max(0.0f, Math.min(1.0f, f43 * 1.5f));
            if (this.f1319g0 == 3) {
                z13 = z12;
            } else {
                z13 = z11;
            }
            float d17 = this.f1318f0.d(z13);
            canvas2.save();
            float f44 = 1.0f - C;
            canvas2.translate(0.0f, org.telegram.messenger.g0.L(6.0f) * f44);
            float f45 = (C * 0.1f) + 0.9f;
            float C2 = com.google.android.gms.internal.vision.e2.C(d17, 0.06f, 1.0f, f45);
            canvas2.scale(C2, C2, rectF14.centerX(), rectF14.centerY());
            b(canvas2, this.L, rectF14, max4);
            float f46 = L22 / 2.0f;
            m2.a(canvas2, rectF14.left, rectF14.top, rectF14.right, rectF14.bottom, f46, this.f1321i0, this.m0 * max4, this.f1324l0);
            int L24 = org.telegram.messenger.g0.L(18.5f);
            float f47 = L24 / 2.0f;
            float centerX2 = ((int) rectF14.centerX()) - f47;
            int round = Math.round(centerX2);
            float centerY3 = ((int) rectF14.centerY()) - f47;
            int round2 = Math.round(centerY3);
            int round3 = Math.round(centerX2) + L24;
            int round4 = Math.round(centerY3) + L24;
            Drawable drawable2 = this.f1325n;
            drawable2.setBounds(round, round2, round3, round4);
            float f48 = max4 * 255.0f;
            int i17 = (int) f48;
            drawable2.setAlpha(i17);
            drawable2.draw(canvas2);
            canvas2.restore();
            if (this.f1319g0 == 4) {
                z14 = z12;
            } else {
                z14 = z11;
            }
            float d18 = this.F0.d(z14);
            canvas2.save();
            canvas2.translate(0.0f, org.telegram.messenger.g0.L(6.0f) * f44);
            float f49 = (1.0f - (d18 * 0.04f)) * f45;
            canvas2.scale(f49, f49, rectF12.left + org.telegram.messenger.g0.L(18.0f), rectF12.bottom);
            b(canvas2, this.K, rectF12, max4);
            m2.a(canvas2, rectF12.left, rectF12.top, rectF12.right, rectF12.bottom, f46, this.f1321i0, this.m0 * max4, this.f1324l0);
            float centerY4 = rectF12.centerY();
            int L25 = (int) (rectF12.left + org.telegram.messenger.g0.L(12.0f));
            int L26 = (int) (centerY4 - org.telegram.messenger.g0.L(9.0f));
            Drawable drawable3 = this.f1330r;
            drawable3.setBounds(L25, L26, org.telegram.messenger.g0.L(18.0f) + L25, org.telegram.messenger.g0.L(18.0f) + L26);
            drawable3.setAlpha(i17);
            drawable3.draw(canvas2);
            float L27 = (rectF12.right - org.telegram.messenger.g0.L(13.0f)) - org.telegram.messenger.g0.L(4.0f);
            float L28 = rectF12.left + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(6.0f);
            n6 n6Var4 = n6Var;
            n6Var4.C = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.E0.d(this.A0)) * f48);
            float N = centerY4 - org.telegram.messenger.g0.N(1.0f);
            n6Var4.setBounds((int) L28, (int) (N - org.telegram.messenger.g0.L(12.0f)), (int) (L28 + org.telegram.messenger.g0.L(240.0f)), (int) (N + org.telegram.messenger.g0.L(12.0f)));
            canvas2.save();
            canvas2.clipRect(rectF12.left, rectF12.top, L27 - org.telegram.messenger.g0.L(8.0f), rectF12.bottom);
            n6Var4.draw(canvas2);
            canvas2.restore();
            int alpha2 = paint.getAlpha();
            paint.setAlpha((int) (alpha2 * max4));
            canvas2.save();
            canvas2.translate(L27, centerY4 - org.telegram.messenger.g0.N(1.9f));
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
        boolean z10;
        String[] strArr;
        int i7;
        int i10;
        boolean z11;
        int i11 = 0;
        if (this.G0 != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                RectF rectF = this.N;
                if (!rectF.isEmpty()) {
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(rectF);
                    rectF2.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
                    this.f1320h0 = rectF2.contains(motionEvent.getX(), motionEvent.getY());
                }
            }
            if (this.f1320h0) {
                if (actionMasked == 1) {
                    this.f1320h0 = false;
                    a();
                    return true;
                } else if (actionMasked == 3) {
                    this.f1320h0 = false;
                    return true;
                }
            } else {
                return super.dispatchTouchEvent(motionEvent);
            }
        } else {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.f1319g0 = c(motionEvent.getX(), motionEvent.getY());
                invalidate();
                if (this.f1319g0 < 0) {
                    return false;
                }
            } else {
                int i12 = this.f1319g0;
                if (i12 >= 0) {
                    if (actionMasked2 == 1) {
                        this.f1319g0 = -1;
                        invalidate();
                        if (c(motionEvent.getX(), motionEvent.getY()) == i12) {
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            p0 p0Var = this.f1308a;
                            if (i12 == 0) {
                                int i13 = p0Var.f1405r;
                                if (i13 == 1) {
                                    p0Var.t();
                                } else if (i13 == 3) {
                                    p0Var.c(p0Var.K);
                                }
                            } else {
                                g gVar = h.f1218c;
                                int i14 = 44;
                                if (i12 == 1) {
                                    Context context = p0Var.h;
                                    h6 h6Var = p0Var.f1400n;
                                    int i15 = p0Var.f1405r;
                                    if (i15 == 3 || i15 == 4) {
                                        bi.b1 b1Var = new bi.b1(context, this.f1312c, h6Var, new a0(p0Var, 3));
                                        b1Var.T = true;
                                        b1Var.f3431n = org.telegram.messenger.g0.L(316);
                                        b1Var.M = org.telegram.messenger.g0.L(220);
                                        b1Var.S = true;
                                        b1Var.L = 0;
                                        int w02 = m6.w0(m6.G6, h6Var);
                                        b1Var.a(new l0(context, w02, m6.w0(m6.F8, h6Var)), 44, new b0(p0Var, 4));
                                        ArrayList c10 = p0Var.H.c();
                                        c10.add(gVar);
                                        int size = c10.size();
                                        int i16 = 0;
                                        while (i16 < size) {
                                            Object obj = c10.get(i16);
                                            i16++;
                                            g gVar2 = (g) obj;
                                            Context context2 = p0Var.h;
                                            int i17 = p0Var.f1392f.f39573a.R;
                                            if (gVar2 == p0Var.K && p0Var.J != null) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            int i18 = w02;
                                            b1Var.a(new o0(context2, gVar2, i18, i17, z11), 44, new a1.e(13, p0Var, gVar2));
                                            w02 = i18;
                                        }
                                        n1 n1Var = p0Var.f1412w;
                                        n1Var.G0 = b1Var;
                                        n1Var.addView(b1Var, new FrameLayout.LayoutParams(-1, -1));
                                        n1Var.invalidate();
                                        b1Var.setFocusableInTouchMode(true);
                                        b1Var.setOnKeyListener(new f0(1, b1Var));
                                        b1Var.requestFocus();
                                        b1Var.R = new b0(p0Var, 5);
                                        b1Var.f();
                                    }
                                } else if (i12 == 3) {
                                    if (p0Var.f1405r == 1) {
                                        p0Var.t();
                                    }
                                    sf sfVar = p0Var.f1392f;
                                    a3 a3Var = new a3();
                                    bn bnVar = sfVar.f39573a.F3;
                                    if (bnVar != null) {
                                        bnVar.presentFragment(a3Var);
                                    }
                                } else {
                                    Runnable runnable = null;
                                    if (i12 == 4) {
                                        p0Var.f1412w.a();
                                        Context context3 = p0Var.h;
                                        h6 h6Var2 = p0Var.f1400n;
                                        bi.b1 b1Var2 = new bi.b1(context3, this.d, h6Var2, new a0(p0Var, 1));
                                        b1Var2.T = true;
                                        b1Var2.f3431n = org.telegram.messenger.g0.L(316);
                                        b1Var2.M = org.telegram.messenger.g0.L(200);
                                        b1Var2.S = true;
                                        b1Var2.L = 0;
                                        int w03 = m6.w0(m6.G6, h6Var2);
                                        boolean x10 = DictationAsr.x();
                                        b1Var2.a(new m0(p0Var.h, hd.N0(2131745068, null), null, w03, x10), 44, new n(1));
                                        String[] E = DictationAsr.E();
                                        int length = E.length;
                                        int i19 = 0;
                                        while (i19 < length) {
                                            String str = E[i19];
                                            if (!x10 && DictationAsr.A(str)) {
                                                z10 = 1;
                                            } else {
                                                z10 = i11;
                                            }
                                            int i20 = i19;
                                            t J = DictationAsr.J(str);
                                            if (J != null) {
                                                strArr = J.d(str);
                                            } else {
                                                strArr = new String[i11];
                                            }
                                            if (strArr.length < 2) {
                                                b1Var2.a(new m0(p0Var.h, p0.q(str), null, w03, z10), i14, new a1.e(12, p0Var, str));
                                                i7 = length;
                                                i10 = i20;
                                            } else {
                                                m0 m0Var = new m0(p0Var.h, p0.q(str), p0.O(DictationAsr.d0(J, str)), w03, z10);
                                                b1Var2.a(m0Var, 54, runnable);
                                                i7 = length;
                                                i10 = i20;
                                                m0Var.setOnClickListener(new e0(p0Var, J, str, strArr, w03, z10, b1Var2));
                                            }
                                            i19 = i10 + 1;
                                            length = i7;
                                            i11 = 0;
                                            runnable = null;
                                            i14 = 44;
                                        }
                                        n1 n1Var2 = p0Var.f1412w;
                                        n1Var2.G0 = b1Var2;
                                        n1Var2.addView(b1Var2, new FrameLayout.LayoutParams(-1, -1));
                                        n1Var2.invalidate();
                                        b1Var2.setFocusableInTouchMode(true);
                                        b1Var2.setOnKeyListener(new f0(0, b1Var2));
                                        b1Var2.requestFocus();
                                        b1Var2.R = new b0(p0Var, 2);
                                        b1Var2.f();
                                    } else {
                                        String str2 = p0Var.J;
                                        if (str2 != null && p0Var.f1405r == 3) {
                                            p0Var.J = null;
                                            p0Var.v(str2);
                                            p0Var.K = gVar;
                                            p0Var.f1412w.setRevert(false);
                                            p0Var.f1412w.d(gVar.a(), false);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (actionMasked2 == 3) {
                        this.f1319g0 = -1;
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
        int i12 = m6.f29381d6;
        h6 h6Var = this.f1310b;
        if (org.telegram.messenger.g0.B(m6.w0(i12, h6Var)) < 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1321i0 = z10;
        int w02 = m6.w0(m6.G6, h6Var);
        this.f1322j0 = w02;
        this.f1323k0 = w02;
        this.f1332s.u(w02);
        this.f1340x0.u(this.f1322j0);
        int i13 = this.f1323k0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f1315e.setColorFilter(new PorterDuffColorFilter(i13, mode));
        this.f1317f.setColorFilter(new PorterDuffColorFilter(this.f1323k0, mode));
        this.G.setColor(this.f1323k0);
        this.h.setColorFilter(new PorterDuffColorFilter(this.f1323k0, mode));
        this.f1325n.setColorFilter(new PorterDuffColorFilter(this.f1323k0, mode));
        this.f1330r.setColorFilter(new PorterDuffColorFilter(this.f1323k0, mode));
        if (this.f1321i0) {
            i7 = -651810255;
        } else {
            i7 = -335544321;
        }
        this.f1337w.setColor(i7);
        if (this.f1321i0) {
            i10 = 654311423;
        } else {
            i10 = 335544320;
        }
        this.f1339x.setColor(i10);
        this.E.setColor(m6.r1(0.14f, this.f1322j0));
        Paint paint = this.f1341y;
        paint.setColor(16777216);
        float L = org.telegram.messenger.g0.L(8.0f);
        float L2 = org.telegram.messenger.g0.L(2.0f);
        if (this.f1321i0) {
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
        fh.g gVar4 = this.L;
        if (gVar4 != null) {
            gVar4.updateColors();
        }
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt != this.f1312c && childAt != this.d) {
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
        if (view == this.G0) {
            this.G0 = null;
            invalidate();
        }
    }

    public void setGearGlass(fh.g gVar) {
        this.L = gVar;
        if (gVar != null) {
            gVar.r(org.telegram.messenger.g0.L(18.0f));
        }
    }

    public void setIsland(boolean z10) {
        if (this.T == z10) {
            return;
        }
        this.T = z10;
        if (z10) {
            this.f1309a0.e(true, 0.0f);
            this.W.e(true, 0.0f);
            this.f1326n0 = true;
            org.telegram.ui.ActionBar.v2 v2Var = this.f1315e;
            Objects.requireNonNull(v2Var);
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.t0(v2Var, 1), 160L);
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
        if (this.f1342y0 && this.C0.f34386c > 0.0f) {
            z11 = true;
        }
        if (!z11) {
            this.E0.a(z10);
            this.f1343z0 = true;
        }
        this.A0 = z10;
        if (!z10) {
            charSequence = this.f1338w0;
        }
        this.f1340x0.t(charSequence, z11, true);
        invalidate();
    }

    public void setRevert(boolean z10) {
        if (this.U == z10) {
            return;
        }
        this.U = z10;
        invalidate();
    }

    public void setSettings(boolean z10) {
        if (this.f1342y0 == z10) {
            return;
        }
        this.f1342y0 = z10;
        if (z10 && this.C0.f34386c <= 0.0f) {
            this.f1343z0 = true;
        }
        invalidate();
    }

    public void setStopMode(boolean z10) {
        float f10;
        if (this.f1331r0 == z10) {
            return;
        }
        this.f1331r0 = z10;
        if (!this.T) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f1333s0.e(true, f10);
        }
        if (!z10) {
            org.telegram.ui.ActionBar.v2 v2Var = this.f1315e;
            Objects.requireNonNull(v2Var);
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.t0(v2Var, 1), 120L);
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f1315e && drawable != this.f1332s && drawable != this.f1340x0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
