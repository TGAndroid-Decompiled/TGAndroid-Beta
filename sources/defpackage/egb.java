package defpackage;

import android.os.Handler;
import java.nio.ByteBuffer;
public final class egb extends cf0 {
    public final xi9 i;

    public egb(xi9 xi9Var) {
        this.i = xi9Var;
    }

    @Override
    public final void d(ByteBuffer byteBuffer) {
        float f;
        float f2;
        float[] fArr;
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        String str = g8c.a;
        ByteBuffer order = byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        xi9 xi9Var = this.i;
        float[] fArr2 = (float[]) xi9Var.d;
        xm4 xm4Var = (xm4) xi9Var.c;
        ByteBuffer byteBuffer2 = (ByteBuffer) xi9Var.e;
        lbc lbcVar = (lbc) xi9Var.f;
        ebc ebcVar = lbcVar.L;
        Handler handler = lbcVar.b0;
        if (ebcVar != null) {
            int i = 0;
            if (order != p20.a && lbcVar.J) {
                if (ebcVar.k()) {
                    int limit = order.limit();
                    if (limit > 8192) {
                        handler.removeCallbacksAndMessages(null);
                        lbcVar.L.o(false, null);
                    } else {
                        byteBuffer2.put(order);
                        int i2 = xi9Var.a + limit;
                        xi9Var.a = i2;
                        if (i2 >= 1024) {
                            byteBuffer2.position(0);
                            for (int i3 = 0; i3 < 1024; i3++) {
                                fArr2[i3] = byteBuffer2.getShort() / 32768.0f;
                            }
                            byteBuffer2.rewind();
                            xi9Var.a = 0;
                            float f3 = 0.0f;
                            if (fArr2.length != 1024) {
                                f = 0.0f;
                                f2 = 1.0f;
                            } else {
                                for (int i4 = 0; i4 < 1024; i4++) {
                                    xm4Var.a[i4] = fArr2[((int[]) xm4Var.h)[i4]];
                                    ((float[]) xm4Var.c)[i4] = 0.0f;
                                }
                                int i5 = 1;
                                while (i5 < xm4Var.a.length) {
                                    float f4 = ((float[]) xm4Var.g)[i5];
                                    float f5 = ((float[]) xm4Var.f)[i5];
                                    float f6 = f3;
                                    int i6 = i;
                                    float f7 = 1.0f;
                                    while (i6 < i5) {
                                        float f8 = f3;
                                        int i7 = i6;
                                        while (true) {
                                            float[] fArr3 = xm4Var.a;
                                            if (i7 < fArr3.length) {
                                                int i8 = i7 + i5;
                                                float f9 = fArr3[i8];
                                                float[] fArr4 = (float[]) xm4Var.c;
                                                float f10 = fArr4[i8];
                                                float f11 = (f7 * f9) - (f6 * f10);
                                                float f12 = (f9 * f6) + (f10 * f7);
                                                fArr3[i8] = fArr3[i7] - f11;
                                                fArr4[i8] = fArr4[i7] - f12;
                                                fArr3[i7] = fArr3[i7] + f11;
                                                fArr4[i7] = fArr4[i7] + f12;
                                                i7 += i5 << 1;
                                            }
                                        }
                                        f6 = (f6 * f4) + (f7 * f5);
                                        i6++;
                                        f7 = (f7 * f4) - (f6 * f5);
                                        f3 = f8;
                                    }
                                    i5 <<= 1;
                                    i = 0;
                                }
                                f = f3;
                                f2 = 1.0f;
                                int i9 = 0;
                                while (true) {
                                    fArr = (float[]) xm4Var.d;
                                    if (i9 >= fArr.length) {
                                        break;
                                    }
                                    float f13 = xm4Var.a[i9];
                                    float f14 = ((float[]) xm4Var.c)[i9];
                                    fArr[i9] = (float) Math.sqrt((f14 * f14) + (f13 * f13));
                                    i9++;
                                }
                                if (xm4Var.b == 1) {
                                    int length = fArr.length / ((float[]) xm4Var.e).length;
                                    for (int i10 = 0; i10 < ((float[]) xm4Var.e).length; i10++) {
                                        float f15 = f;
                                        int i11 = 0;
                                        while (i11 < length) {
                                            int i12 = (i10 * length) + i11;
                                            float[] fArr5 = (float[]) xm4Var.d;
                                            if (i12 < fArr5.length) {
                                                f15 += fArr5[i12];
                                                i11++;
                                            }
                                        }
                                        ((float[]) xm4Var.e)[i10] = f15 / (i11 + 1);
                                    }
                                }
                            }
                            float f16 = f;
                            for (int i13 = 0; i13 < 1024; i13++) {
                                float f17 = xm4Var.a[i13];
                                float f18 = ((float[]) xm4Var.c)[i13];
                                float sqrt = ((float) Math.sqrt((f18 * f18) + (f17 * f17))) / 30.0f;
                                if (sqrt > f2) {
                                    sqrt = f2;
                                } else if (sqrt < f) {
                                    sqrt = f;
                                }
                                f16 += sqrt * sqrt;
                            }
                            float sqrt2 = (float) Math.sqrt(f16 / 1024.0f);
                            float[] fArr6 = new float[7];
                            fArr6[6] = sqrt2;
                            int i14 = 0;
                            if (sqrt2 < 0.4f) {
                                while (i14 < 7) {
                                    fArr6[i14] = f;
                                    i14++;
                                }
                            } else {
                                while (i14 < 6) {
                                    int i15 = 170 * i14;
                                    float f19 = xm4Var.a[i15];
                                    float f20 = ((float[]) xm4Var.c)[i15];
                                    float sqrt3 = (float) (Math.sqrt((f20 * f20) + (f19 * f19)) / 30.0d);
                                    fArr6[i14] = sqrt3;
                                    if (sqrt3 > f2) {
                                        fArr6[i14] = f2;
                                    } else if (sqrt3 < f) {
                                        fArr6[i14] = f;
                                    }
                                    i14++;
                                }
                            }
                            if (System.currentTimeMillis() - xi9Var.b >= 64) {
                                xi9Var.b = System.currentTimeMillis();
                                handler.postDelayed(new l3c(xi9Var, fArr6, (byte) 17), 130L);
                            }
                        }
                    }
                }
            } else {
                handler.postDelayed(new kbc(xi9Var, (byte) 0), 80L);
            }
        }
        l(remaining).put(byteBuffer).flip();
    }

    @Override
    public final void i() {
        m();
    }

    @Override
    public final void j() {
        m();
    }

    @Override
    public final void k() {
        m();
    }

    public final void m() {
        if (isActive()) {
            int i = this.b.a;
        }
    }

    @Override
    public final l20 h(l20 l20Var) {
        return l20Var;
    }
}
