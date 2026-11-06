package n2;

import ai.n1;
import android.os.Handler;
import java.nio.ByteBuffer;
import li.b6;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.t51;
public final class x0 extends f2.o {
    public final b6 f20337i;

    public x0(b6 b6Var) {
        this.f20337i = b6Var;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        float f10;
        float f11;
        float[] fArr;
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        String str = h2.m0.f14112a;
        ByteBuffer order = byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        b6 b6Var = this.f20337i;
        float[] fArr2 = (float[]) b6Var.d;
        n1 n1Var = (n1) b6Var.f18480c;
        ByteBuffer byteBuffer2 = (ByteBuffer) b6Var.f18481e;
        t51 t51Var = (t51) b6Var.f18482f;
        m51 m51Var = t51Var.K;
        Handler handler = t51Var.f38222a0;
        if (m51Var != null) {
            int i7 = 0;
            if (order != f2.n.f10922a && t51Var.I) {
                if (m51Var.s()) {
                    int limit = order.limit();
                    if (limit > 8192) {
                        handler.removeCallbacksAndMessages(null);
                        t51Var.K.F(false, null);
                    } else {
                        byteBuffer2.put(order);
                        int i10 = b6Var.f18478a + limit;
                        b6Var.f18478a = i10;
                        if (i10 >= 1024) {
                            byteBuffer2.position(0);
                            for (int i11 = 0; i11 < 1024; i11++) {
                                fArr2[i11] = byteBuffer2.getShort() / 32768.0f;
                            }
                            byteBuffer2.rewind();
                            b6Var.f18478a = 0;
                            n1Var.getClass();
                            float f12 = 0.0f;
                            if (fArr2.length != 1024) {
                                f10 = 0.0f;
                                f11 = 1.0f;
                            } else {
                                for (int i12 = 0; i12 < 1024; i12++) {
                                    ((float[]) n1Var.f1587b)[i12] = fArr2[((int[]) n1Var.f1590f)[i12]];
                                    ((float[]) n1Var.f1588c)[i12] = 0.0f;
                                }
                                int i13 = 1;
                                while (i13 < ((float[]) n1Var.f1587b).length) {
                                    float f13 = ((float[]) n1Var.h)[i13];
                                    float f14 = ((float[]) n1Var.f1591g)[i13];
                                    float f15 = f12;
                                    int i14 = i7;
                                    float f16 = 1.0f;
                                    while (i14 < i13) {
                                        float f17 = f12;
                                        int i15 = i14;
                                        while (true) {
                                            float[] fArr3 = (float[]) n1Var.f1587b;
                                            if (i15 < fArr3.length) {
                                                int i16 = i15 + i13;
                                                float f18 = fArr3[i16];
                                                float[] fArr4 = (float[]) n1Var.f1588c;
                                                float f19 = fArr4[i16];
                                                float f20 = (f16 * f18) - (f15 * f19);
                                                float f21 = (f18 * f15) + (f19 * f16);
                                                fArr3[i16] = fArr3[i15] - f20;
                                                fArr4[i16] = fArr4[i15] - f21;
                                                fArr3[i15] = fArr3[i15] + f20;
                                                fArr4[i15] = fArr4[i15] + f21;
                                                i15 += i13 * 2;
                                            }
                                        }
                                        f15 = (f15 * f13) + (f16 * f14);
                                        i14++;
                                        f16 = (f16 * f13) - (f15 * f14);
                                        f12 = f17;
                                    }
                                    i13 *= 2;
                                    i7 = 0;
                                }
                                f10 = f12;
                                f11 = 1.0f;
                                int i17 = 0;
                                while (true) {
                                    fArr = (float[]) n1Var.d;
                                    if (i17 >= fArr.length) {
                                        break;
                                    }
                                    float f22 = ((float[]) n1Var.f1587b)[i17];
                                    float f23 = ((float[]) n1Var.f1588c)[i17];
                                    fArr[i17] = (float) Math.sqrt((f23 * f23) + (f22 * f22));
                                    i17++;
                                }
                                if (n1Var.f1586a == 1) {
                                    int length = fArr.length / ((float[]) n1Var.f1589e).length;
                                    for (int i18 = 0; i18 < ((float[]) n1Var.f1589e).length; i18++) {
                                        float f24 = f10;
                                        int i19 = 0;
                                        while (i19 < length) {
                                            int i20 = (i18 * length) + i19;
                                            float[] fArr5 = (float[]) n1Var.d;
                                            if (i20 < fArr5.length) {
                                                f24 += fArr5[i20];
                                                i19++;
                                            }
                                        }
                                        ((float[]) n1Var.f1589e)[i18] = f24 / (i19 + 1);
                                    }
                                }
                            }
                            float f25 = f10;
                            for (int i21 = 0; i21 < 1024; i21++) {
                                float f26 = ((float[]) n1Var.f1587b)[i21];
                                float f27 = ((float[]) n1Var.f1588c)[i21];
                                float sqrt = ((float) Math.sqrt((f27 * f27) + (f26 * f26))) / 30.0f;
                                if (sqrt > f11) {
                                    sqrt = f11;
                                } else if (sqrt < f10) {
                                    sqrt = f10;
                                }
                                f25 += sqrt * sqrt;
                            }
                            float sqrt2 = (float) Math.sqrt(f25 / 1024);
                            float[] fArr6 = new float[7];
                            fArr6[6] = sqrt2;
                            if (sqrt2 < 0.4f) {
                                for (int i22 = 0; i22 < 7; i22++) {
                                    fArr6[i22] = f10;
                                }
                            } else {
                                for (int i23 = 0; i23 < 6; i23++) {
                                    int i24 = 170 * i23;
                                    float f28 = ((float[]) n1Var.f1587b)[i24];
                                    float f29 = ((float[]) n1Var.f1588c)[i24];
                                    float sqrt3 = (float) (Math.sqrt((f29 * f29) + (f28 * f28)) / 30.0d);
                                    fArr6[i23] = sqrt3;
                                    if (sqrt3 > f11) {
                                        fArr6[i23] = f11;
                                    } else if (sqrt3 < f10) {
                                        fArr6[i23] = f10;
                                    }
                                }
                            }
                            if (System.currentTimeMillis() - b6Var.f18479b >= 64) {
                                b6Var.f18479b = System.currentTimeMillis();
                                handler.postDelayed(new l51(1, b6Var, fArr6), 130L);
                            }
                        }
                    }
                }
            } else {
                handler.postDelayed(new s51(b6Var, 0), 80L);
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
            f2.k kVar = this.f10923b;
            int i7 = kVar.f10917a;
            int i10 = kVar.f10918b;
            int i11 = kVar.f10919c;
            this.f20337i.getClass();
        }
    }

    @Override
    public final f2.k h(f2.k kVar) {
        return kVar;
    }
}
