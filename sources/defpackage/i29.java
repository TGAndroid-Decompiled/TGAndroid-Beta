package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Array;
import org.telegram.messenger.Utilities;
public final class i29 extends View {
    public float A0;
    public float B0;
    public float C0;
    public final RectF D0;
    public final RectF E;
    public final Paint E0;
    public final RectF F;
    public LinearGradient F0;
    public final RectF G;
    public final Matrix G0;
    public final Path H;
    public float[] H0;
    public final RectF I;
    public final kra I0;
    public final RectF J;
    public final kra J0;
    public final RectF K;
    public final int[] K0;
    public int L;
    public final float[][] L0;
    public byte[] M;
    public final Paint M0;
    public final Path N;
    public int N0;
    public final lm O;
    public float[] O0;
    public final lm P;
    public float[] P0;
    public final RectF Q;
    public int Q0;
    public float R;
    public byte[] R0;
    public boolean S;
    public long S0;
    public boolean T;
    public Bitmap T0;
    public boolean U;
    public int U0;
    public boolean V;
    public long V0;
    public boolean W;
    public jw1 W0;
    public boolean X0;
    public final Paint Y0;
    public boolean Z0;
    public final wjb a;
    public boolean a0;
    public boolean a1;
    public final Paint b;
    public boolean b0;
    public float b1;
    public final Paint c;
    public float c0;
    public boolean c1;
    public final Paint d;
    public boolean d0;
    public boolean d1;
    public final Paint e;
    public h29 e0;
    public int e1;
    public final xb8 f;
    public final RectF f0;
    public float f1;
    public final RectF g0;
    public boolean g1;
    public final gn h;
    public final RectF h0;
    public final Paint i0;
    public final Paint j0;
    public final Paint k0;
    public final Paint l0;
    public final lm m0;
    public lbc n;
    public final lm n0;
    public final lm o0;
    public boolean p0;
    public float q0;
    public float r;
    public float r0;
    public float s;
    public float s0;
    public final Path t0;
    public final Path u0;
    public final float[] v0;
    public float w;
    public final lm w0;
    public boolean x;
    public final lm x0;
    public final sr8 y;
    public final lm y0;
    public float z0;

    public i29(Context context, wjb wjbVar) {
        super(context);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.s = 0.0f;
        this.w = 1.0f;
        this.x = false;
        this.y = new sr8(this, (byte) 14);
        this.E = new RectF();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Path();
        this.I = new RectF();
        this.J = new RectF();
        this.K = new RectF();
        this.N = new Path();
        s33 s33Var = s33.h;
        this.O = new lm(this, 0L, 340L, s33Var);
        this.P = new lm(this, 0L, 340L, s33Var);
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
        this.m0 = new lm(this, 0L, 340L, s33Var);
        this.n0 = new lm(this, 0L, 220L, s33Var);
        this.o0 = new lm(this, 0L, 260L, s33Var);
        this.s0 = 1.0f;
        this.t0 = new Path();
        this.u0 = new Path();
        this.v0 = new float[8];
        this.w0 = new lm(this, 0L, 160L, s33.g);
        this.x0 = new lm(this, 0L, 260L, s33Var);
        this.y0 = new lm(this, 0L, 200L, s33Var);
        this.D0 = new RectF();
        this.E0 = new Paint(1);
        this.G0 = new Matrix();
        this.H0 = new float[0];
        this.I0 = new kra(2400);
        this.J0 = new kra(2200);
        this.K0 = new int[6];
        this.L0 = (float[][]) Array.newInstance(Float.TYPE, 6, 0);
        this.M0 = new Paint(1);
        this.N0 = 625341585;
        this.O0 = new float[0];
        this.P0 = new float[0];
        this.Q0 = -1;
        this.Y0 = new Paint(2);
        this.e1 = -1;
        this.a = wjbVar;
        xb8 xb8Var = new xb8(12);
        this.f = xb8Var;
        xb8Var.f = this;
        xb8Var.setCallback(this);
        gn gnVar = new gn(false, false, false);
        this.h = gnVar;
        gnVar.n(0.5f, 200L, s33Var);
        gnVar.setCallback(this);
        gnVar.w(gl.L(12.0f));
        gnVar.x(gl.o());
        gnVar.N = gl.q.x;
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
        gn gnVar;
        xb8 xb8Var;
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
        int i5 = bkb.ag;
        wjb wjbVar = this.a;
        int v0 = bkb.v0(i5, wjbVar);
        Paint paint4 = this.b;
        paint4.setColor(v0);
        int v02 = bkb.v0(bkb.bg, wjbVar);
        Paint paint5 = this.c;
        paint5.setColor(v02);
        int i6 = bkb.Yf;
        int v03 = bkb.v0(i6, wjbVar);
        gn gnVar2 = this.h;
        gnVar2.u(v03);
        int v04 = bkb.v0(bkb.Wf, wjbVar);
        xb8 xb8Var2 = this.f;
        xb8Var2.a.setColor(v04);
        int v05 = bkb.v0(bkb.Xf, wjbVar);
        Paint paint6 = this.d;
        paint6.setColor(v05);
        int v06 = bkb.v0(i6, wjbVar);
        Paint paint7 = this.e;
        paint7.setColor(v06);
        int R1 = (int) gl.R1(rectF.left + gl.L(11.33f), rectF.right - gl.L(11.33f), Utilities.l(this.s));
        int R12 = (int) gl.R1(rectF.left + gl.L(11.33f), rectF.right - gl.L(11.33f), Utilities.l(this.w));
        int measuredWidth = getMeasuredWidth() - gl.L(27.0f);
        int i7 = this.L;
        Path path = this.N;
        if (i7 == measuredWidth) {
            paint = paint5;
            paint2 = paint4;
            gnVar = gnVar2;
            xb8Var = xb8Var2;
            paint3 = paint7;
            i = R12;
        } else {
            int L = measuredWidth / gl.L(3.0f);
            int L2 = gl.L(2.0f);
            paint = paint5;
            int L3 = gl.L(12.0f);
            paint2 = paint4;
            byte b4 = Byte.MAX_VALUE;
            gnVar = gnVar2;
            byte b5 = Byte.MIN_VALUE;
            xb8Var = xb8Var2;
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
                float U1 = gl.U1(Utilities.l((b2 - b) / (b5 - b)), L2, L3);
                float L4 = gl.L(3.0f) * i9;
                RectF rectF2 = gl.P;
                rectF2.set(L4, (-U1) / 2.0f, gl.L(2.0f) + L4, U1 / 2.0f);
                path.addRoundRect(rectF2, gl.L(1.0f), gl.L(1.0f), Path.Direction.CW);
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
        path2.addRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), Path.Direction.CW);
        canvas.clipPath(path2);
        Paint paint8 = paint;
        canvas.drawRect(rectF.left, rectF.top, R1 - gl.L(1.33f), rectF.bottom, paint8);
        canvas.drawRect(gl.L(1.33f) + i, rectF.top, rectF.right, rectF.bottom, paint8);
        canvas.save();
        canvas.translate(rectF.left + gl.L(14.0f), rectF.centerY());
        int i10 = bkb.Xf;
        paint6.setColor(bkb.p1(0.3f, bkb.v0(i10, wjbVar)));
        canvas.drawPath(path, paint6);
        canvas.restore();
        float f3 = R1;
        float f4 = i;
        canvas.drawRect(f3, rectF.top, f4, rectF.bottom, paint2);
        if (this.a0) {
            i4 = this.c0;
        } else {
            lbc lbcVar = this.n;
            if (lbcVar != null) {
                f2 = ((float) lbcVar.S()) / ((float) this.n.U());
            } else {
                f2 = 1.0f;
            }
            i4 = Utilities.i(f2, this.w, this.s);
        }
        float i11 = Utilities.i(gl.R1(rectF.left + gl.L(13.0f), rectF.right - gl.L(14.0f), i4), f4, f3);
        if (i11 < f4) {
            canvas.save();
            canvas.clipRect(i11, rectF.top, f4, rectF.bottom);
            canvas.translate(rectF.left + gl.L(14.0f), rectF.centerY());
            if (this.x && i4 < this.s && !this.a0) {
                paint6.setColor(bkb.v0(bkb.Yf, wjbVar));
            } else {
                paint6.setColor(bkb.v0(i10, wjbVar));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        if (i11 > f3) {
            canvas.save();
            canvas.clipRect(f3, rectF.top, i11, rectF.bottom);
            canvas.translate(rectF.left + gl.L(14.0f), rectF.centerY());
            if (!g() && !this.x && !this.a0) {
                paint6.setColor(bkb.v0(i10, wjbVar));
            } else {
                paint6.setColor(bkb.v0(bkb.Yf, wjbVar));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        float centerY = rectF.centerY() + gl.L(5.33f);
        RectF rectF3 = this.G;
        rectF3.set(R1 - gl.L(7.0f), rectF.centerY() - gl.L(5.33f), R1 - gl.L(5.33f), centerY);
        Paint paint9 = paint3;
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint9);
        rectF3.set(gl.L(5.33f) + i, rectF.centerY() - gl.L(5.33f), gl.L(7.0f) + i, rectF.centerY() + gl.L(5.33f));
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint9);
        this.J.set(R1 - gl.L(24.0f), 0.0f, gl.L(6.0f) + R1, getHeight());
        this.K.set(i - gl.L(6.0f), 0.0f, gl.L(24.0f) + i, getHeight());
        float d = this.P.d(!this.a0);
        if (d > 0.0f) {
            float c = (int) (gnVar.c() + gl.L(30.0f));
            if (c <= (i - R1) - gl.L(8.0f)) {
                z = true;
            } else {
                z = false;
            }
            float d2 = this.O.d(z);
            float R13 = gl.R1(gl.L(24.0f), c, d2);
            float f5 = R1 + i;
            float L5 = gl.L(20.0f) / 2.0f;
            float centerY2 = rectF.centerY() + L5;
            RectF rectF4 = this.F;
            rectF4.set((f5 - R13) / 2.0f, rectF.centerY() - L5, (f5 + R13) / 2.0f, centerY2);
            int alpha = paint8.getAlpha();
            paint8.setAlpha((int) (alpha * d));
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, rectF4.height() / 2.0f, paint8);
            paint8.setAlpha(alpha);
            RectF rectF5 = this.I;
            rectF5.set(rectF4);
            rectF5.inset(-gl.L(6.0f), -gl.L(6.0f));
            canvas.save();
            int L6 = gl.L(12.0f);
            canvas.translate(gl.R1(rectF4.centerX() - (L6 / 2.0f), rectF4.left + gl.L(6.0f), d2), rectF4.centerY());
            xb8 xb8Var3 = xb8Var;
            xb8Var3.setBounds(0, (-L6) / 2, L6, L6 / 2);
            xb8Var3.g = (int) (d * 255.0f);
            xb8Var3.draw(canvas);
            canvas.restore();
            if (d2 > 0.0f) {
                canvas.save();
                canvas.translate(rectF4.left + gl.L(21.66f), rectF4.centerY() - gl.L(1.0f));
                gn gnVar3 = gnVar;
                gnVar3.setBounds(-1, -1, 1, 1);
                gnVar3.C = (int) (d2 * 255.0f * d);
                gnVar3.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    public final void b(android.graphics.Canvas r85, android.graphics.RectF r86, float r87) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i29.b(android.graphics.Canvas, android.graphics.RectF, float):void");
    }

    public final void d(int i) {
        for (int i2 = 0; i2 < 18; i2++) {
            int i3 = ((18 * i) + i2) * 10;
            this.H0[i3 + 9] = h() - 0.5f;
            float[] fArr = this.H0;
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
        lbc lbcVar;
        lbc lbcVar2;
        lbc lbcVar3;
        int i2;
        float f;
        float f2 = 1.0f;
        if (this.d0) {
            int actionMasked = motionEvent.getActionMasked();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.T0 == null && !this.X0) {
                if (actionMasked == 0) {
                    RectF rectF = this.g0;
                    if (y >= rectF.top - gl.L(10.0f) && y <= rectF.bottom + gl.L(10.0f) && x >= rectF.left - gl.L(8.0f) && x <= rectF.right + gl.L(8.0f)) {
                        this.b1 = x;
                        this.d1 = false;
                        this.e1 = -1;
                        float L = gl.L(10.0f) / 2.0f;
                        float f3 = this.A0 + L;
                        float abs = Math.abs(x - (this.z0 - L));
                        float abs2 = Math.abs(x - f3);
                        if (Math.min(abs, abs2) < gl.L(22.0f) && !this.D0.contains(x, y)) {
                            if (abs <= abs2) {
                                i2 = 0;
                            } else {
                                i2 = 1;
                            }
                            this.e1 = i2;
                            if (i2 == 0) {
                                f = this.z0;
                            } else {
                                f = this.A0;
                            }
                            this.f1 = x - f;
                            this.p0 = true;
                            this.g1 = g();
                            setPlaying(false);
                            h29 h29Var = this.e0;
                            if (h29Var != null) {
                                ((tw1) h29Var).a(true);
                            }
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        } else {
                            this.W = true;
                        }
                        this.c1 = true;
                        if (getParent() != null) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        invalidate();
                        return true;
                    }
                } else if (actionMasked == 2) {
                    if (this.c1) {
                        float max = Math.max(1.0f, this.C0 - this.B0);
                        if (this.p0) {
                            float max2 = Math.max(1.0f / Math.max(1.0f, this.r), gl.L(40.0f) / max);
                            float f4 = x - this.f1;
                            if (this.e1 == 0) {
                                this.s = Utilities.i(((f4 + gl.L(4.0f)) - this.B0) / max, this.w - max2, 0.0f);
                            } else {
                                this.w = Utilities.i(((f4 - gl.L(4.0f)) - this.B0) / max, 1.0f, this.s + max2);
                            }
                            i(true);
                            invalidate();
                            return true;
                        }
                        float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                        if (!this.d1 && Math.abs(x - this.b1) > scaledTouchSlop) {
                            this.W = false;
                            this.d1 = true;
                            this.a0 = true;
                            this.b0 = g();
                            lbc lbcVar4 = this.n;
                            if (lbcVar4 != null) {
                                lbcVar4.t0(false);
                            }
                        }
                        if (this.d1) {
                            this.c0 = Utilities.i((x - this.B0) / max, this.w, this.s);
                            lbc lbcVar5 = this.n;
                            if (lbcVar5 != null && lbcVar5.U() > 0) {
                                this.n.p0(this.c0 * ((float) lbcVar3.U()), false);
                            }
                            this.x = true;
                            invalidate();
                            return true;
                        }
                        return true;
                    }
                } else if (actionMasked != 1 && actionMasked != 3) {
                    return this.c1;
                } else {
                    if (this.c1) {
                        if (this.p0) {
                            this.p0 = false;
                            lbc lbcVar6 = this.n;
                            if (lbcVar6 != null && lbcVar6.U() > 0) {
                                this.n.p0(this.s * ((float) lbcVar2.U()), false);
                            }
                            if (this.g1) {
                                setPlaying(true);
                            }
                            h29 h29Var2 = this.e0;
                            if (h29Var2 != null) {
                                ((tw1) h29Var2).a(false);
                            }
                        } else if (this.d1) {
                            this.a0 = false;
                            if (this.b0 && (lbcVar = this.n) != null) {
                                lbcVar.t0(true);
                                sr8 sr8Var = this.y;
                                gl.r(sr8Var);
                                gl.d3(sr8Var, 16L);
                            }
                        } else if (actionMasked == 1) {
                            setPlaying(!g());
                        }
                        i(true);
                        this.c1 = false;
                        this.d1 = false;
                        this.W = false;
                        invalidate();
                        return true;
                    }
                }
            } else if (actionMasked != 0) {
                return this.c1;
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
                lbc lbcVar7 = this.n;
                if (lbcVar7 != null) {
                    f2 = ((float) lbcVar7.S()) / ((float) this.n.U());
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
                this.s = Utilities.i(gl.x1(motionEvent.getX(), rectF4.left + gl.L(11.33f), rectF4.right - gl.L(11.33f)), Utilities.l(this.w - Math.max(1.0f / this.r, gl.L(30.0f) / (rectF4.width() - gl.L(22.66f)))), 0.0f);
                invalidate();
            } else if (this.V) {
                this.w = Utilities.i(gl.x1(motionEvent.getX(), rectF4.left + gl.L(11.33f), rectF4.right - gl.L(11.33f)), 1.0f, Utilities.l(Math.max(1.0f / this.r, gl.L(30.0f) / (rectF4.width() - gl.L(22.66f))) + this.s));
                invalidate();
            } else if (this.a0) {
                lbc lbcVar8 = this.n;
                if (lbcVar8 != null) {
                    this.c0 = Utilities.i(gl.x1(motionEvent.getX(), rectF4.left + gl.L(11.33f), rectF4.right - gl.L(11.33f)), this.w, this.s);
                    lbcVar8.p0(i * ((float) this.n.U()), false);
                }
                invalidate();
            }
            this.h.t(gl.g0(Math.round(Math.max(1.0f, (this.w - this.s) * this.r)), false, false), false, true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.W) {
                setPlaying(!g());
            } else if (this.U && this.x) {
                lbc lbcVar9 = this.n;
                if (lbcVar9 != null) {
                    lbcVar9.p0(this.s * ((float) lbcVar9.U()), false);
                }
                setPlaying(true);
            } else if (this.V && this.x) {
                lbc lbcVar10 = this.n;
                if (lbcVar10 != null) {
                    lbcVar10.p0(Math.max(this.s * ((float) lbcVar10.U()), (this.w * ((float) this.n.U())) - 1500), false);
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
        int v0 = bkb.v0(bkb.Tf, this.a);
        int green = Color.green(i) * 6;
        int blue = (Color.blue(i) + (green + (Color.red(i) * 3))) / 10;
        int green2 = Color.green(v0) * 6;
        if (blue > ((Color.blue(v0) + (green2 + (Color.red(v0) * 3))) / 10) + 40) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (gl.B(bkb.v0(bkb.c6, this.a)) < 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        lbc lbcVar = this.n;
        if (lbcVar != null && lbcVar.c0()) {
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
        lbc lbcVar = this.n;
        if (lbcVar == null) {
            return 0L;
        }
        return lbcVar.U();
    }

    public double getNewDuration() {
        return ((this.w - this.s) * ((float) getDuration())) / 1000.0d;
    }

    public String getTrimBubbleText() {
        float f = this.r;
        return gl.g0((int) Math.floor(this.s * f), false, false) + " - " + gl.g0(Math.round(f * this.w), false, false);
    }

    public float getTrimHandleX() {
        float L = gl.L(10.0f);
        if (this.e1 == 1) {
            return (L / 2.0f) + this.A0;
        }
        return this.z0 - (L / 2.0f);
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
        int i = this.N0;
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        this.N0 = i4;
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
        String g0 = gl.g0(round, false, false);
        if (z && !k96.a0) {
            z2 = true;
        }
        this.h.t(g0, z2, true);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float L = gl.L(32.0f);
        this.E.set(0.0f, (getHeight() - L) / 2.0f, getWidth(), (getHeight() + L) / 2.0f);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float L = gl.L(32.0f);
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
            gn gnVar = this.h;
            gnVar.w(gl.L(14.0f));
            gnVar.x(gl.o());
            gnVar.n(0.35f, 260L, s33.h);
            this.f.h = 260.0f;
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.k0;
        paint.setStyle(style);
        paint.setStrokeWidth(gl.L(2.0f));
        Paint paint2 = this.l0;
        paint2.setStyle(style);
        paint2.setStrokeWidth(gl.L(1.5f));
        paint2.setColor(-1);
        invalidate();
    }

    public void setNewStyleDelegate(h29 h29Var) {
        this.e0 = h29Var;
    }

    public void setPlaying(boolean z) {
        lbc lbcVar;
        if (this.T) {
            z = false;
        }
        lbc lbcVar2 = this.n;
        if (lbcVar2 != null) {
            float S = ((float) lbcVar2.S()) / ((float) this.n.U());
            if (S < this.s || S > this.w || (this.d0 && z && this.n.S() >= (this.w * ((float) this.n.U())) - 60)) {
                this.n.p0(this.s * ((float) lbcVar.U()), false);
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
        sr8 sr8Var = this.y;
        gl.r(sr8Var);
        if (z) {
            gl.d3(sr8Var, 16L);
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
