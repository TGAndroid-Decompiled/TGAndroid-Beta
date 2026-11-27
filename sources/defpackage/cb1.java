package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class cb1 extends Drawable {
    public static final ab1 H = new ab1((byte) 0);
    public int B;
    public int C;
    public int D;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public final bb1 q;
    public final bb1 r;
    public float s;
    public long t;
    public boolean u;
    public float v;
    public float w;
    public float x;
    public final float a = hl.L(18.0f);
    public final float b = hl.L(22.0f);
    public final float c = 2.4f;
    public final float d = hl.L(12.0f);
    public final float e = hl.L(1.5f);
    public final float f = 3600.0f;
    public final float g = 0.25f;
    public final Path y = new Path();
    public final float[] z = new float[4];
    public int A = -1;
    public float E = 1.0f;
    public final fv0 F = new fv0(this, (byte) 17);
    public int G = 255;

    public cb1() {
        bb1 bb1Var = new bb1();
        this.q = bb1Var;
        bb1Var.a = 1.0f;
        bb1Var.b = 0.0f;
        bb1Var.c = hl.L(0.5f);
        bb1Var.d = hl.L(8.5f);
        bb1Var.e = 1.0f;
        bb1Var.f = 1.0f;
        bb1Var.g = (short) 61;
        bb1 bb1Var2 = new bb1();
        this.r = bb1Var2;
        bb1Var2.a = 0.82f;
        bb1Var2.b = 0.6f;
        bb1Var2.c = hl.L(0.0f);
        bb1Var2.d = hl.L(4.25f);
        bb1Var2.e = 0.55f;
        bb1Var2.f = 0.55f;
        bb1Var2.g = (short) 128;
        g(0, false);
    }

    public static int e(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    return aob.w0(null, aob.Sh, false);
                }
                return vm2.f(0.5f, vm2.f(0.5f, aob.w0(null, aob.Zh, false), aob.w0(null, aob.ai, false)), aob.w0(null, aob.bi, false));
            }
            return vm2.f(0.5f, aob.w0(null, aob.Qh, false), aob.w0(null, aob.Rh, false));
        }
        return vm2.f(0.5f, aob.w0(null, aob.Oh, false), aob.w0(null, aob.Ph, false));
    }

    public final void a(int i) {
        this.B = i;
        bb1 bb1Var = this.q;
        bb1Var.h = i;
        bb1 bb1Var2 = this.r;
        bb1Var2.h = i;
        bb1Var.a();
        bb1Var2.a();
    }

    public final void b(float f, float f2, float f3, float[] fArr) {
        double d = f3;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f4 = this.j;
        fArr[0] = (f4 * cos) + f;
        fArr[1] = (f4 * sin) + f2;
        fArr[2] = -sin;
        fArr[3] = cos;
    }

    public final void c(Canvas canvas, bb1 bb1Var, float f, float f2, float f3) {
        int i;
        int i2;
        char c;
        int i3;
        int i4 = bb1Var.x;
        if (i4 == 0) {
            return;
        }
        float f4 = bb1Var.c;
        float f5 = this.v;
        float f6 = ((bb1Var.d - f4) * f5) + f4;
        float f7 = 1.0f;
        float f8 = 0.0f;
        float z = xnb.z(f5, 1.0f, 0.0f, this.d * bb1Var.e);
        float[] fArr = bb1Var.u;
        float[] fArr2 = bb1Var.v;
        float[] fArr3 = bb1Var.w;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            float interpolation = H.getInterpolation(bb1Var.o[i6]);
            float f9 = 1.0f - interpolation;
            fArr[i6] = (bb1Var.l[i6] * interpolation) + (bb1Var.k[i6] * f9);
            fArr3[i6] = (bb1Var.n[i6] * interpolation) + (bb1Var.m[i6] * f9);
        }
        float f10 = this.g;
        char c2 = 2;
        if (f10 > 0.0f) {
            int i7 = 0;
            while (i7 < 2) {
                int i8 = 0;
                while (i8 < i4) {
                    int i9 = i8 == 0 ? i4 - 1 : i8 - 1;
                    float f11 = f7;
                    int i10 = i8 + 1;
                    if (i10 == i4) {
                        i3 = 0;
                    } else {
                        i3 = i10;
                    }
                    float f12 = f8;
                    float f13 = fArr[i8];
                    fArr2[i8] = qd4.A((fArr[i9] + fArr[i3]) * 0.5f, f13, f10, f13);
                    i8 = i10;
                    f7 = f11;
                    f8 = f12;
                }
                float f14 = f7;
                i7++;
                float[] fArr4 = fArr2;
                fArr2 = fArr;
                fArr = fArr4;
                f7 = f14;
            }
        }
        float f15 = f7;
        float f16 = f8;
        int i11 = 0;
        while (i11 < i4) {
            float f17 = (i11 / i4) + fArr3[i11];
            float floor = (f17 - ((float) Math.floor(f17))) * this.p;
            float f18 = this.m;
            int i12 = (floor > f18 ? 1 : (floor == f18 ? 0 : -1));
            float[] fArr5 = this.z;
            if (i12 < 0) {
                fArr5[i5] = (-this.k) + floor;
                fArr5[1] = -this.i;
                fArr5[c2] = f15;
                fArr5[3] = f16;
                i2 = i5;
                c = c2;
            } else {
                float f19 = floor - f18;
                float f20 = this.o;
                int i13 = (f19 > f20 ? 1 : (f19 == f20 ? 0 : -1));
                i2 = i5;
                float f21 = this.c;
                if (i13 < 0) {
                    c = c2;
                    b(this.k, -this.l, (f19 / (f21 * this.j)) - 1.5707964f, fArr5);
                } else {
                    c = c2;
                    float f22 = f19 - f20;
                    float f23 = this.n;
                    if (f22 < f23) {
                        fArr5[i2] = this.h;
                        fArr5[1] = (-this.l) + f22;
                        fArr5[c] = f16;
                        fArr5[3] = f15;
                    } else {
                        float f24 = f22 - f23;
                        if (f24 < f20) {
                            b(this.k, this.l, f24 / (f21 * this.j), fArr5);
                        } else {
                            float f25 = f24 - f20;
                            if (f25 < f18) {
                                fArr5[i2] = this.k - f25;
                                fArr5[1] = this.i;
                                fArr5[c] = -1.0f;
                                fArr5[3] = f16;
                            } else {
                                float f26 = f25 - f18;
                                if (f26 < f20) {
                                    b(-this.k, this.l, (f26 / (f21 * this.j)) + 1.5707964f, fArr5);
                                } else {
                                    float f27 = f26 - f20;
                                    if (f27 < f23) {
                                        fArr5[i2] = -this.h;
                                        fArr5[1] = this.l - f27;
                                        fArr5[c] = f16;
                                        fArr5[3] = -1.0f;
                                    } else {
                                        b(-this.k, -this.l, ((f27 - f23) / (f21 * this.j)) + 3.1415927f, fArr5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f28 = fArr5[3];
            float f29 = (fArr[i11] * z) + f6 + f3;
            bb1Var.q[i11] = (f28 * f29) + f + fArr5[i2];
            bb1Var.r[i11] = ((-fArr5[c]) * f29) + f2 + fArr5[1];
            bb1Var.s[i11] = fArr5[c];
            bb1Var.t[i11] = fArr5[3];
            i11++;
            c2 = c;
            i5 = i2;
        }
        int i14 = i5;
        Path path = this.y;
        path.rewind();
        path.moveTo(bb1Var.q[i14], bb1Var.r[i14]);
        int i15 = i14;
        while (i15 < i4) {
            int i16 = i15 + 1;
            if (i16 < i4) {
                i = i16;
            } else {
                i = i14;
            }
            float[] fArr6 = bb1Var.q;
            float f30 = fArr6[i] - fArr6[i15];
            float[] fArr7 = bb1Var.r;
            float f31 = fArr7[i] - fArr7[i15];
            float sqrt = ((float) Math.sqrt((f31 * f31) + (f30 * f30))) / 3.0f;
            float[] fArr8 = bb1Var.q;
            float f32 = fArr8[i15];
            float[] fArr9 = bb1Var.s;
            float f33 = (fArr9[i15] * sqrt) + f32;
            float[] fArr10 = bb1Var.r;
            float f34 = fArr10[i15];
            float[] fArr11 = bb1Var.t;
            float f35 = fArr8[i];
            float f36 = fArr10[i];
            path.cubicTo(f33, (fArr11[i15] * sqrt) + f34, f35 - (fArr9[i] * sqrt), f36 - (fArr11[i] * sqrt), f35, f36);
            i15 = i16;
        }
        path.close();
        canvas.drawPath(path, bb1Var.i);
    }

    public final float d() {
        bb1 bb1Var = this.q;
        float f = bb1Var.d;
        float f2 = bb1Var.f;
        float f3 = this.e;
        float f4 = (f2 * f3) + f;
        float f5 = bb1Var.e;
        float f6 = this.d;
        float f7 = (f5 * f6) + f4;
        bb1 bb1Var2 = this.r;
        float f8 = bb1Var2.d;
        return Math.max(f7, (f6 * bb1Var2.e) + (f3 * bb1Var2.f) + f8);
    }

    @Override
    public final void draw(Canvas canvas) {
        long min;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.h >= 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.u && this.E >= 1.0f) {
                min = 0;
            } else {
                min = Math.min(40L, Math.max(0L, elapsedRealtime - this.t));
            }
            this.t = elapsedRealtime;
            boolean e = i86.e(512);
            bb1 bb1Var = this.r;
            bb1 bb1Var2 = this.q;
            if (e && min > 0) {
                float f = this.w;
                float f2 = this.v;
                if (f != f2) {
                    float f3 = this.x;
                    float f4 = (((float) min) * f3) + f2;
                    this.v = f4;
                    if (f3 > 0.0f) {
                        if (f4 > f) {
                            this.v = f;
                        }
                        f = f4;
                    } else {
                        if (f4 < f) {
                            this.v = f;
                        }
                        f = f4;
                    }
                } else {
                    f = f2;
                }
                this.s = c00.B((float) min, this.f, 6.2831855f, this.s);
                bb1Var2.d(f);
                bb1Var.d(this.v);
            }
            float f5 = this.E;
            if (f5 < 1.0f && min > 0) {
                float f6 = (((float) min) / 250.0f) + f5;
                this.E = f6;
                if (f6 > 1.0f) {
                    this.E = 1.0f;
                    f6 = 1.0f;
                }
                a(vm2.f(f6, this.C, this.D));
            }
            float exactCenterX = bounds.exactCenterX();
            float exactCenterY = bounds.exactCenterY();
            float f7 = 1.0f - (this.v * 0.7f);
            float f8 = bb1Var2.f;
            float f9 = this.e;
            float z = xnb.z((float) Math.sin(this.s), 0.5f, 0.5f, f8 * f9 * f7);
            float z2 = xnb.z((float) Math.sin(this.s + bb1Var.b), 0.5f, 0.5f, f9 * bb1Var.f * f7);
            c(canvas, this.q, exactCenterX, exactCenterY, z);
            c(canvas, this.r, exactCenterX, exactCenterY, z2);
            if (this.E < 1.0f) {
                invalidateSelf();
            }
        }
    }

    public final void f(float f) {
        float f2;
        this.w = f;
        if (!i86.e(512)) {
            return;
        }
        float f3 = this.w - this.v;
        if (f3 > 0.0f) {
            f2 = 400.0f;
        } else {
            f2 = 500.0f;
        }
        this.x = f3 / ((f2 * 0.55f) + 100.0f);
    }

    public final void g(int i, boolean z) {
        if (i == this.A && this.E >= 1.0f) {
            return;
        }
        this.A = i;
        int e = e(i);
        if (z && this.B != 0 && i86.e(512)) {
            this.C = this.B;
            this.D = e;
            this.E = 0.0f;
        } else {
            this.E = 1.0f;
            a(e);
        }
        invalidateSelf();
    }

    @Override
    public final int getAlpha() {
        return this.G;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    public final void h(boolean z) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        int callState = sharedInstance.getCallState();
        if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
            g(2, z);
            return;
        }
        vc2 vc2Var = sharedInstance.groupCall;
        if (vc2Var != null) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.d.f(sharedInstance.getSelfId());
            if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !xc2.w(14, sharedInstance.getChat())) || sharedInstance.groupCall.b.rtmp_stream) {
                sharedInstance.setMicMute(true, false, false);
                g(3, z);
                return;
            }
            g(sharedInstance.isMicMute() ? 1 : 0, z);
            return;
        }
        g(sharedInstance.isMicMute() ? 1 : 0, z);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float d = d() + hl.L(1.0f);
            float min = (Math.min(bounds.width(), bounds.height()) / 2.0f) - hl.L(2.0f);
            if (d > min) {
                d = Math.max(0.0f, min);
            }
            this.h = (bounds.width() / 2.0f) - d;
            float height = (bounds.height() / 2.0f) - d;
            this.i = height;
            float f = this.h;
            if (f >= 1.0f && height >= 1.0f) {
                float min2 = Math.min(this.a, Math.min(f, height));
                this.j = min2;
                float f2 = this.h - min2;
                this.k = f2;
                float f3 = this.i - min2;
                this.l = f3;
                float f4 = f2 * 2.0f;
                this.m = f4;
                float f5 = f3 * 2.0f;
                this.n = f5;
                float f6 = this.c * 1.5707964f * min2;
                this.o = f6;
                float f7 = (f5 * 2.0f) + (f4 * 2.0f);
                this.p = (f6 * 4.0f) + f7;
                int max = Math.max(12, Math.min(80, Math.round(((min2 * 6.2831855f) + f7) / this.b)));
                bb1 bb1Var = this.q;
                if (max != bb1Var.x) {
                    bb1Var.c(max);
                    this.r.c(max);
                }
            }
        }
    }

    @Override
    public final void setAlpha(int i) {
        if (this.G != i) {
            this.G = i;
            bb1 bb1Var = this.q;
            bb1Var.y = i;
            bb1Var.a();
            bb1 bb1Var2 = this.r;
            bb1Var2.y = i;
            bb1Var2.a();
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.q.i.setColorFilter(colorFilter);
        this.r.i.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
