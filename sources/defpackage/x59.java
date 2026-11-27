package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Array;
import org.telegram.messenger.Utilities;
public final class x59 extends View {
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public final RectF E;
    public final RectF E0;
    public final RectF F;
    public float[] F0;
    public final RectF G;
    public final mva G0;
    public final Path H;
    public final mva H0;
    public final RectF I;
    public final int[] I0;
    public final RectF J;
    public final float[][] J0;
    public final RectF K;
    public final Paint K0;
    public int L;
    public int L0;
    public byte[] M;
    public float[] M0;
    public final Path N;
    public float[] N0;
    public final mm O;
    public int O0;
    public final mm P;
    public byte[] P0;
    public final RectF Q;
    public long Q0;
    public float R;
    public Bitmap R0;
    public boolean S;
    public int S0;
    public boolean T;
    public long T0;
    public boolean U;
    public hx1 U0;
    public boolean V;
    public boolean V0;
    public boolean W;
    public final Paint W0;
    public boolean X0;
    public boolean Y0;
    public float Z0;
    public final vnb a;
    public boolean a0;
    public boolean a1;
    public final Paint b;
    public boolean b0;
    public boolean b1;
    public final Paint c;
    public float c0;
    public int c1;
    public final Paint d;
    public boolean d0;
    public float d1;
    public final Paint e;
    public w59 e0;
    public boolean e1;
    public final mf8 f;
    public final RectF f0;
    public final RectF g0;
    public final hn h;
    public final RectF h0;
    public final Paint i0;
    public final Paint j0;
    public final Paint k0;
    public final Paint l0;
    public final mm m0;
    public kfc n;
    public final mm n0;
    public final mm o0;
    public boolean p0;
    public float q0;
    public float r;
    public float r0;
    public float s;
    public float s0;
    public final Path t0;
    public Path u0;
    public final Paint v0;
    public float w;
    public final float[] w0;
    public boolean x;
    public final mm x0;
    public final v59 y;
    public final mm y0;
    public final mm z0;

    public x59(Context context, vnb vnbVar) {
        super(context);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.s = 0.0f;
        this.w = 1.0f;
        this.x = false;
        this.y = new v59(this, (byte) 0);
        this.E = new RectF();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Path();
        this.I = new RectF();
        this.J = new RectF();
        this.K = new RectF();
        this.N = new Path();
        k43 k43Var = k43.h;
        this.O = new mm(this, 0L, 340L, k43Var);
        this.P = new mm(this, 0L, 340L, k43Var);
        this.Q = new RectF();
        this.R = -1.0f;
        this.S = true;
        this.f0 = new RectF();
        this.g0 = new RectF();
        this.h0 = new RectF();
        this.i0 = new Paint(1);
        this.j0 = new Paint(1);
        this.k0 = new Paint(1);
        this.l0 = new Paint(1);
        this.m0 = new mm(this, 0L, 340L, k43Var);
        this.n0 = new mm(this, 0L, 220L, k43Var);
        this.o0 = new mm(this, 0L, 260L, k43Var);
        this.s0 = 1.0f;
        this.t0 = new Path();
        this.v0 = new Paint(1);
        this.w0 = new float[8];
        this.x0 = new mm(this, 0L, 160L, k43.g);
        this.y0 = new mm(this, 0L, 260L, k43Var);
        this.z0 = new mm(this, 0L, 200L, k43Var);
        this.E0 = new RectF();
        new Paint(1);
        this.F0 = new float[0];
        this.G0 = new mva(2400);
        this.H0 = new mva(2200);
        this.I0 = new int[6];
        this.J0 = (float[][]) Array.newInstance(Float.TYPE, 6, 0);
        this.K0 = new Paint(1);
        this.L0 = 625341585;
        this.M0 = new float[0];
        this.N0 = new float[0];
        this.O0 = -1;
        this.W0 = new Paint(2);
        this.c1 = -1;
        this.a = vnbVar;
        mf8 mf8Var = new mf8(12);
        this.f = mf8Var;
        mf8Var.f = this;
        mf8Var.setCallback(this);
        hn hnVar = new hn(false, false, false);
        this.h = hnVar;
        hnVar.n(0.5f, 200L, k43Var);
        hnVar.setCallback(this);
        hnVar.w(hl.L(12.0f));
        hnVar.x(hl.o());
        hnVar.N = hl.q.x;
    }

    public static float c(int i) {
        int i2 = i * (-1640531535);
        int i3 = (i2 ^ (i2 >>> 15)) * (-2048144777);
        int i4 = (i3 ^ (i3 >>> 13)) * (-1028477379);
        return ((i4 ^ (i4 >>> 16)) >>> 8) / 1.6777216E7f;
    }

    public final void a(Canvas canvas, RectF rectF, float f) {
        Paint paint;
        Paint paint2;
        hn hnVar;
        mf8 mf8Var;
        Paint paint3;
        int i;
        byte b;
        byte b2;
        int i2;
        int i3;
        byte b3;
        float f2;
        float i4;
        boolean z;
        if (this.d0) {
            b(canvas, rectF, f);
            return;
        }
        int i5 = aob.bg;
        vnb vnbVar = this.a;
        int v0 = aob.v0(i5, vnbVar);
        Paint paint4 = this.b;
        paint4.setColor(v0);
        int v02 = aob.v0(aob.cg, vnbVar);
        Paint paint5 = this.c;
        paint5.setColor(v02);
        int i6 = aob.Zf;
        int v03 = aob.v0(i6, vnbVar);
        hn hnVar2 = this.h;
        hnVar2.u(v03);
        int v04 = aob.v0(aob.Xf, vnbVar);
        mf8 mf8Var2 = this.f;
        mf8Var2.a.setColor(v04);
        int v05 = aob.v0(aob.Yf, vnbVar);
        Paint paint6 = this.d;
        paint6.setColor(v05);
        int v06 = aob.v0(i6, vnbVar);
        Paint paint7 = this.e;
        paint7.setColor(v06);
        int R1 = (int) hl.R1(rectF.left + hl.L(11.33f), rectF.right - hl.L(11.33f), Utilities.l(this.s));
        int R12 = (int) hl.R1(rectF.left + hl.L(11.33f), rectF.right - hl.L(11.33f), Utilities.l(this.w));
        int measuredWidth = getMeasuredWidth() - hl.L(27.0f);
        int i7 = this.L;
        Path path = this.N;
        if (i7 == measuredWidth) {
            paint = paint5;
            paint2 = paint4;
            hnVar = hnVar2;
            mf8Var = mf8Var2;
            paint3 = paint7;
            i = R12;
        } else {
            int L = measuredWidth / hl.L(3.0f);
            int L2 = hl.L(2.0f);
            paint = paint5;
            int L3 = hl.L(12.0f);
            paint2 = paint4;
            byte b4 = Byte.MAX_VALUE;
            hnVar = hnVar2;
            byte b5 = Byte.MIN_VALUE;
            mf8Var = mf8Var2;
            int i8 = 0;
            while (true) {
                paint3 = paint7;
                if (i8 >= L) {
                    break;
                }
                byte[] bArr = this.M;
                if (bArr == null) {
                    i3 = i8;
                    i2 = R12;
                    b3 = 0;
                } else {
                    i2 = R12;
                    i3 = i8;
                    b3 = bArr[(int) ((i8 / L) * bArr.length)];
                }
                b4 = (byte) Math.min((int) b4, (int) b3);
                b5 = (byte) Math.max((int) b5, (int) b3);
                i8 = i3 + 1;
                paint7 = paint3;
                R12 = i2;
            }
            i = R12;
            path.rewind();
            int i9 = 0;
            while (i9 < L) {
                byte[] bArr2 = this.M;
                if (bArr2 == null) {
                    b = b4;
                    b2 = 0;
                } else {
                    b = b4;
                    b2 = bArr2[(int) ((i9 / L) * bArr2.length)];
                }
                float U1 = hl.U1(Utilities.l((b2 - b) / (b5 - b)), L2, L3);
                float L4 = hl.L(3.0f) * i9;
                RectF rectF2 = hl.P;
                rectF2.set(L4, (-U1) / 2.0f, hl.L(2.0f) + L4, U1 / 2.0f);
                path.addRoundRect(rectF2, hl.L(1.0f), hl.L(1.0f), Path.Direction.CW);
                i9++;
                b4 = b;
                L = L;
                L2 = L2;
            }
            this.L = measuredWidth;
        }
        canvas.save();
        Path path2 = this.H;
        path2.rewind();
        path2.addRoundRect(rectF, hl.L(8.0f), hl.L(8.0f), Path.Direction.CW);
        canvas.clipPath(path2);
        Paint paint8 = paint;
        canvas.drawRect(rectF.left, rectF.top, R1 - hl.L(1.33f), rectF.bottom, paint8);
        canvas.drawRect(hl.L(1.33f) + i, rectF.top, rectF.right, rectF.bottom, paint8);
        canvas.save();
        canvas.translate(rectF.left + hl.L(14.0f), rectF.centerY());
        int i10 = aob.Yf;
        paint6.setColor(aob.p1(0.3f, aob.v0(i10, vnbVar)));
        canvas.drawPath(path, paint6);
        canvas.restore();
        float f3 = R1;
        float f4 = i;
        canvas.drawRect(f3, rectF.top, f4, rectF.bottom, paint2);
        if (this.a0) {
            i4 = this.c0;
        } else {
            kfc kfcVar = this.n;
            if (kfcVar != null) {
                f2 = ((float) kfcVar.S()) / ((float) this.n.U());
            } else {
                f2 = 1.0f;
            }
            i4 = Utilities.i(f2, this.w, this.s);
        }
        float i11 = Utilities.i(hl.R1(rectF.left + hl.L(13.0f), rectF.right - hl.L(14.0f), i4), f4, f3);
        if (i11 < f4) {
            canvas.save();
            canvas.clipRect(i11, rectF.top, f4, rectF.bottom);
            canvas.translate(rectF.left + hl.L(14.0f), rectF.centerY());
            if (this.x && i4 < this.s && !this.a0) {
                paint6.setColor(aob.v0(aob.Zf, vnbVar));
            } else {
                paint6.setColor(aob.v0(i10, vnbVar));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        if (i11 > f3) {
            canvas.save();
            canvas.clipRect(f3, rectF.top, i11, rectF.bottom);
            canvas.translate(rectF.left + hl.L(14.0f), rectF.centerY());
            if (!g() && !this.x && !this.a0) {
                paint6.setColor(aob.v0(i10, vnbVar));
            } else {
                paint6.setColor(aob.v0(aob.Zf, vnbVar));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        float centerY = rectF.centerY() + hl.L(5.33f);
        RectF rectF3 = this.G;
        rectF3.set(R1 - hl.L(7.0f), rectF.centerY() - hl.L(5.33f), R1 - hl.L(5.33f), centerY);
        Paint paint9 = paint3;
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint9);
        rectF3.set(hl.L(5.33f) + i, rectF.centerY() - hl.L(5.33f), hl.L(7.0f) + i, rectF.centerY() + hl.L(5.33f));
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint9);
        this.J.set(R1 - hl.L(24.0f), 0.0f, hl.L(6.0f) + R1, getHeight());
        this.K.set(i - hl.L(6.0f), 0.0f, hl.L(24.0f) + i, getHeight());
        float d = this.P.d(!this.a0);
        if (d > 0.0f) {
            float c = (int) (hnVar.c() + hl.L(30.0f));
            if (c <= (i - R1) - hl.L(8.0f)) {
                z = true;
            } else {
                z = false;
            }
            float d2 = this.O.d(z);
            float R13 = hl.R1(hl.L(24.0f), c, d2);
            float f5 = R1 + i;
            float L5 = hl.L(20.0f) / 2.0f;
            float centerY2 = rectF.centerY() + L5;
            RectF rectF4 = this.F;
            rectF4.set((f5 - R13) / 2.0f, rectF.centerY() - L5, (f5 + R13) / 2.0f, centerY2);
            int alpha = paint8.getAlpha();
            paint8.setAlpha((int) (alpha * d));
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, rectF4.height() / 2.0f, paint8);
            paint8.setAlpha(alpha);
            RectF rectF5 = this.I;
            rectF5.set(rectF4);
            rectF5.inset(-hl.L(6.0f), -hl.L(6.0f));
            canvas.save();
            int L6 = hl.L(12.0f);
            canvas.translate(hl.R1(rectF4.centerX() - (L6 / 2.0f), rectF4.left + hl.L(6.0f), d2), rectF4.centerY());
            mf8 mf8Var3 = mf8Var;
            mf8Var3.setBounds(0, (-L6) / 2, L6, L6 / 2);
            mf8Var3.g = (int) (d * 255.0f);
            mf8Var3.draw(canvas);
            canvas.restore();
            if (d2 > 0.0f) {
                canvas.save();
                canvas.translate(rectF4.left + hl.L(21.66f), rectF4.centerY() - hl.L(1.0f));
                hn hnVar3 = hnVar;
                hnVar3.setBounds(-1, -1, 1, 1);
                hnVar3.C = (int) (d2 * 255.0f * d);
                hnVar3.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    public final void b(android.graphics.Canvas r85, android.graphics.RectF r86, float r87) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x59.b(android.graphics.Canvas, android.graphics.RectF, float):void");
    }

    public final void d(int i) {
        for (int i2 = 0; i2 < 18; i2++) {
            int i3 = ((18 * i) + i2) * 10;
            this.F0[i3 + 9] = h() - 0.5f;
            float[] fArr = this.F0;
            fArr[i3 + 5] = 0.0f;
            fArr[i3 + 4] = 1.0f;
            fArr[i3 + 6] = Float.NaN;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean z = this.d0;
        if (z && !this.S) {
            float f = this.R;
            if (f >= 0.0f) {
                a(canvas, this.Q, f);
                return;
            }
        }
        if (this.S) {
            if (z) {
                RectF rectF = this.f0;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                a(canvas, rectF, 1.0f);
                return;
            }
            a(canvas, this.E, 1.0f);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        float i;
        kfc kfcVar;
        kfc kfcVar2;
        kfc kfcVar3;
        int i2;
        float f;
        float f2 = 1.0f;
        if (this.d0) {
            int actionMasked = motionEvent.getActionMasked();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.R0 == null && !this.V0) {
                if (actionMasked == 0) {
                    RectF rectF = this.g0;
                    if (y >= rectF.top - hl.L(10.0f) && y <= rectF.bottom + hl.L(10.0f) && x >= rectF.left - hl.L(8.0f) && x <= rectF.right + hl.L(8.0f)) {
                        this.Z0 = x;
                        this.b1 = false;
                        this.c1 = -1;
                        float L = hl.L(10.0f) / 2.0f;
                        float f3 = this.B0 + L;
                        float abs = Math.abs(x - (this.A0 - L));
                        float abs2 = Math.abs(x - f3);
                        if (Math.min(abs, abs2) < hl.L(22.0f) && !this.E0.contains(x, y)) {
                            if (abs <= abs2) {
                                i2 = 0;
                            } else {
                                i2 = 1;
                            }
                            this.c1 = i2;
                            if (i2 == 0) {
                                f = this.A0;
                            } else {
                                f = this.B0;
                            }
                            this.d1 = x - f;
                            this.p0 = true;
                            this.e1 = g();
                            setPlaying(false);
                            w59 w59Var = this.e0;
                            if (w59Var != null) {
                                ((fx1) w59Var).a(true);
                            }
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        } else {
                            this.W = true;
                        }
                        this.a1 = true;
                        if (getParent() != null) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        invalidate();
                        return true;
                    }
                } else if (actionMasked == 2) {
                    if (this.a1) {
                        float max = Math.max(1.0f, this.D0 - this.C0);
                        if (this.p0) {
                            float max2 = Math.max(1.0f / Math.max(1.0f, this.r), hl.L(40.0f) / max);
                            float f4 = x - this.d1;
                            if (this.c1 == 0) {
                                this.s = Utilities.i(((f4 + hl.L(4.0f)) - this.C0) / max, this.w - max2, 0.0f);
                            } else {
                                this.w = Utilities.i(((f4 - hl.L(4.0f)) - this.C0) / max, 1.0f, this.s + max2);
                            }
                            i(true);
                            invalidate();
                            return true;
                        }
                        float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                        if (!this.b1 && Math.abs(x - this.Z0) > scaledTouchSlop) {
                            this.W = false;
                            this.b1 = true;
                            this.a0 = true;
                            this.b0 = g();
                            kfc kfcVar4 = this.n;
                            if (kfcVar4 != null) {
                                kfcVar4.t0(false);
                            }
                        }
                        if (this.b1) {
                            this.c0 = Utilities.i((x - this.C0) / max, this.w, this.s);
                            kfc kfcVar5 = this.n;
                            if (kfcVar5 != null && kfcVar5.U() > 0) {
                                this.n.p0(this.c0 * ((float) kfcVar3.U()), false);
                            }
                            this.x = true;
                            invalidate();
                            return true;
                        }
                        return true;
                    }
                } else if (actionMasked != 1 && actionMasked != 3) {
                    return this.a1;
                } else {
                    if (this.a1) {
                        if (this.p0) {
                            this.p0 = false;
                            kfc kfcVar6 = this.n;
                            if (kfcVar6 != null && kfcVar6.U() > 0) {
                                this.n.p0(this.s * ((float) kfcVar2.U()), false);
                            }
                            if (this.e1) {
                                setPlaying(true);
                            }
                            w59 w59Var2 = this.e0;
                            if (w59Var2 != null) {
                                ((fx1) w59Var2).a(false);
                            }
                        } else if (this.b1) {
                            this.a0 = false;
                            if (this.b0 && (kfcVar = this.n) != null) {
                                kfcVar.t0(true);
                                v59 v59Var = this.y;
                                hl.r(v59Var);
                                hl.d3(v59Var, 16L);
                            }
                        } else if (actionMasked == 1) {
                            setPlaying(!g());
                        }
                        i(true);
                        this.a1 = false;
                        this.b1 = false;
                        this.W = false;
                        invalidate();
                        return true;
                    }
                }
            } else if (actionMasked != 0) {
                return this.a1;
            }
            return false;
        }
        boolean contains = this.I.contains(motionEvent.getX(), motionEvent.getY());
        RectF rectF2 = this.J;
        if (!contains && rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
            z = true;
        } else {
            z = false;
        }
        RectF rectF3 = this.K;
        if (!contains && rectF3.contains(motionEvent.getX(), motionEvent.getY())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!contains && !z && !z2 && motionEvent.getX() > rectF2.right && motionEvent.getX() < rectF3.left) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (motionEvent.getAction() == 0) {
            this.W = contains;
            this.U = z;
            this.V = z2;
            if (z || z2) {
                this.b0 = g();
                setPlaying(false);
            }
            this.a0 = z3;
            if (z3) {
                this.b0 = g();
                kfc kfcVar7 = this.n;
                if (kfcVar7 != null) {
                    f2 = ((float) kfcVar7.S()) / ((float) this.n.U());
                }
                this.c0 = f2;
                setPlaying(false);
            }
            if (getParent() != null && (this.W || this.U || this.V || this.a0)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z4 = this.U;
            RectF rectF4 = this.E;
            if (z4) {
                this.s = Utilities.i(hl.x1(motionEvent.getX(), rectF4.left + hl.L(11.33f), rectF4.right - hl.L(11.33f)), Utilities.l(this.w - Math.max(1.0f / this.r, hl.L(30.0f) / (rectF4.width() - hl.L(22.66f)))), 0.0f);
                invalidate();
            } else if (this.V) {
                this.w = Utilities.i(hl.x1(motionEvent.getX(), rectF4.left + hl.L(11.33f), rectF4.right - hl.L(11.33f)), 1.0f, Utilities.l(Math.max(1.0f / this.r, hl.L(30.0f) / (rectF4.width() - hl.L(22.66f))) + this.s));
                invalidate();
            } else if (this.a0) {
                kfc kfcVar8 = this.n;
                if (kfcVar8 != null) {
                    this.c0 = Utilities.i(hl.x1(motionEvent.getX(), rectF4.left + hl.L(11.33f), rectF4.right - hl.L(11.33f)), this.w, this.s);
                    kfcVar8.p0(i * ((float) this.n.U()), false);
                }
                invalidate();
            }
            this.h.t(hl.g0(Math.round(Math.max(1.0f, (this.w - this.s) * this.r)), false, false), false, true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.W) {
                setPlaying(!g());
            } else if (this.U && this.x) {
                kfc kfcVar9 = this.n;
                if (kfcVar9 != null) {
                    kfcVar9.p0(this.s * ((float) kfcVar9.U()), false);
                }
                setPlaying(true);
            } else if (this.V && this.x) {
                kfc kfcVar10 = this.n;
                if (kfcVar10 != null) {
                    kfcVar10.p0(Math.max(this.s * ((float) kfcVar10.U()), (this.w * ((float) this.n.U())) - 1500), false);
                }
                setPlaying(true);
            } else if (this.a0 && !g()) {
                setPlaying(true);
            }
            this.W = false;
            this.U = false;
            this.V = false;
            this.a0 = false;
        }
        if (this.W || this.U || this.V || this.a0 || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final boolean e(int i) {
        int v0 = aob.v0(aob.Pe, this.a);
        int green = Color.green(i) * 6;
        int blue = (Color.blue(i) + (green + (Color.red(i) * 3))) / 10;
        int green2 = Color.green(v0) * 6;
        if (blue > ((Color.blue(v0) + (green2 + (Color.red(v0) * 3))) / 10) + 40) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (hl.B(aob.v0(aob.d6, this.a)) < 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        kfc kfcVar = this.n;
        if (kfcVar != null && kfcVar.c0()) {
            return true;
        }
        return false;
    }

    public float getAudioLeft() {
        return this.s;
    }

    public long getAudioLeftMs() {
        return this.s * ((float) getDuration());
    }

    public float getAudioRight() {
        return this.w;
    }

    public long getAudioRightMs() {
        return this.w * ((float) getDuration());
    }

    public long getDuration() {
        kfc kfcVar = this.n;
        if (kfcVar == null) {
            return 0L;
        }
        return kfcVar.U();
    }

    public double getNewDuration() {
        return ((this.w - this.s) * ((float) getDuration())) / 1000.0d;
    }

    public String getTrimBubbleText() {
        float f = this.r;
        return hl.g0((int) Math.floor(this.s * f), false, false) + " - " + hl.g0(Math.round(f * this.w), false, false);
    }

    public float getTrimHandleX() {
        float L = hl.L(10.0f);
        if (this.c1 == 1) {
            return (L / 2.0f) + this.B0;
        }
        return this.A0 - (L / 2.0f);
    }

    public float getTrimProgress() {
        return this.m0.c;
    }

    public float getTrimWindowCenterX() {
        return this.q0;
    }

    public float getTrimWindowTop() {
        return this.r0;
    }

    public final float h() {
        int i = this.L0;
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        this.L0 = i4;
        return (i4 >>> 8) / 1.6777216E7f;
    }

    public final void i(boolean z) {
        int round;
        if (!this.d0) {
            return;
        }
        if (this.n != null && (g() || (this.x && this.f != null && ((float) this.n.S()) > (this.s * ((float) this.n.U())) + 30.0f && ((float) this.n.S()) < (this.w * ((float) this.n.U())) - 60.0f))) {
            round = (int) Math.floor(Math.max(0.0f, ((float) this.n.S()) - (this.s * ((float) this.n.U()))) / 1000.0f);
        } else {
            round = Math.round(Math.max(1.0f, (this.w - this.s) * this.r));
        }
        boolean z2 = false;
        String g0 = hl.g0(round, false, false);
        if (z && !ob6.a0) {
            z2 = true;
        }
        this.h.t(g0, z2, true);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float L = hl.L(32.0f);
        this.E.set(0.0f, (getHeight() - L) / 2.0f, getWidth(), (getHeight() + L) / 2.0f);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float L = hl.L(32.0f);
        this.E.set(0.0f, (getMeasuredHeight() - L) / 2.0f, getMeasuredWidth(), (getMeasuredHeight() + L) / 2.0f);
    }

    public void setAllowDraw(boolean z) {
        this.R = -1.0f;
        if (this.S != z) {
            this.S = z;
            invalidate();
        }
    }

    public void setNewContentAlpha(float f) {
        if (this.s0 != f) {
            this.s0 = f;
            invalidate();
        }
    }

    public void setNewStyle(boolean z) {
        if (this.d0 == z) {
            return;
        }
        this.d0 = z;
        if (z) {
            hn hnVar = this.h;
            hnVar.w(hl.L(14.0f));
            hnVar.x(hl.o());
            hnVar.n(0.35f, 260L, k43.h);
            this.f.h = 260.0f;
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.k0;
        paint.setStyle(style);
        paint.setStrokeWidth(hl.L(2.0f));
        Paint paint2 = this.l0;
        paint2.setStyle(style);
        paint2.setStrokeWidth(hl.L(1.5f));
        paint2.setColor(-1);
        invalidate();
    }

    public void setNewStyleDelegate(w59 w59Var) {
        this.e0 = w59Var;
    }

    public void setPlaying(boolean z) {
        kfc kfcVar;
        if (this.T) {
            z = false;
        }
        kfc kfcVar2 = this.n;
        if (kfcVar2 != null) {
            float S = ((float) kfcVar2.S()) / ((float) this.n.U());
            if (S < this.s || S > this.w || (this.d0 && z && this.n.S() >= (this.w * ((float) this.n.U())) - 60)) {
                this.n.p0(this.s * ((float) kfcVar.U()), false);
            }
            this.n.t0(z);
        }
        this.f.a(z, true);
        if (this.d0) {
            if (z) {
                this.x = true;
            }
            i(true);
        }
        v59 v59Var = this.y;
        hl.r(v59Var);
        if (z) {
            hl.d3(v59Var, 16L);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && this.f != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
