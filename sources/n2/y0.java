package n2;

import android.os.Handler;
import ci.b1;
import java.nio.ByteBuffer;
import oi.a6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.z51;
public final class y0 extends f2.o {
    public final a6 f21283i;

    public y0(a6 a6Var) {
        this.f21283i = a6Var;
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
        String str = h2.l0.f13783a;
        ByteBuffer order = byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        a6 a6Var = this.f21283i;
        float[] fArr2 = (float[]) a6Var.d;
        b1 b1Var = (b1) a6Var.f21938c;
        ByteBuffer byteBuffer2 = (ByteBuffer) a6Var.f21939e;
        f61 f61Var = (f61) a6Var.f21940f;
        z51 z51Var = f61Var.L;
        Handler handler = f61Var.f34964b0;
        if (z51Var != null) {
            if (order != f2.n.f11054a && f61Var.J) {
                if (z51Var.t()) {
                    int limit = order.limit();
                    int i7 = 0;
                    if (limit > 8192) {
                        handler.removeCallbacksAndMessages(null);
                        f61Var.L.x(false, null);
                    } else {
                        byteBuffer2.put(order);
                        int i10 = a6Var.f21936a + limit;
                        a6Var.f21936a = i10;
                        if (i10 >= 1024) {
                            byteBuffer2.position(0);
                            for (int i11 = 0; i11 < 1024; i11++) {
                                fArr2[i11] = byteBuffer2.getShort() / 32768.0f;
                            }
                            byteBuffer2.rewind();
                            a6Var.f21936a = 0;
                            b1Var.getClass();
                            float f12 = 0.0f;
                            if (fArr2.length != 1024) {
                                f10 = 0.0f;
                                f11 = 1.0f;
                            } else {
                                for (int i12 = 0; i12 < 1024; i12++) {
                                    ((float[]) b1Var.f5586b)[i12] = fArr2[((int[]) b1Var.f5589f)[i12]];
                                    ((float[]) b1Var.f5587c)[i12] = 0.0f;
                                }
                                int i13 = 1;
                                while (i13 < ((float[]) b1Var.f5586b).length) {
                                    float f13 = ((float[]) b1Var.h)[i13];
                                    float f14 = ((float[]) b1Var.f5590g)[i13];
                                    float f15 = f12;
                                    int i14 = i7;
                                    float f16 = 1.0f;
                                    while (i14 < i13) {
                                        float f17 = f12;
                                        int i15 = i14;
                                        while (true) {
                                            float[] fArr3 = (float[]) b1Var.f5586b;
                                            if (i15 < fArr3.length) {
                                                int i16 = i15 + i13;
                                                float f18 = fArr3[i16];
                                                float[] fArr4 = (float[]) b1Var.f5587c;
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
                                    fArr = (float[]) b1Var.d;
                                    if (i17 >= fArr.length) {
                                        break;
                                    }
                                    float f22 = ((float[]) b1Var.f5586b)[i17];
                                    float f23 = ((float[]) b1Var.f5587c)[i17];
                                    fArr[i17] = (float) Math.sqrt((f23 * f23) + (f22 * f22));
                                    i17++;
                                }
                                if (b1Var.f5585a == 1) {
                                    int length = fArr.length / ((float[]) b1Var.f5588e).length;
                                    for (int i18 = 0; i18 < ((float[]) b1Var.f5588e).length; i18++) {
                                        float f24 = f10;
                                        int i19 = 0;
                                        while (i19 < length) {
                                            int i20 = (i18 * length) + i19;
                                            float[] fArr5 = (float[]) b1Var.d;
                                            if (i20 < fArr5.length) {
                                                f24 += fArr5[i20];
                                                i19++;
                                            }
                                        }
                                        ((float[]) b1Var.f5588e)[i18] = f24 / (i19 + 1);
                                    }
                                }
                            }
                            float f25 = f10;
                            for (int i21 = 0; i21 < 1024; i21++) {
                                float f26 = ((float[]) b1Var.f5586b)[i21];
                                float f27 = ((float[]) b1Var.f5587c)[i21];
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
                                    float f28 = ((float[]) b1Var.f5586b)[i24];
                                    float f29 = ((float[]) b1Var.f5587c)[i24];
                                    float sqrt3 = (float) (Math.sqrt((f29 * f29) + (f28 * f28)) / 30.0d);
                                    fArr6[i23] = sqrt3;
                                    if (sqrt3 > f11) {
                                        fArr6[i23] = f11;
                                    } else if (sqrt3 < f10) {
                                        fArr6[i23] = f10;
                                    }
                                }
                            }
                            if (System.currentTimeMillis() - a6Var.f21937b >= 64) {
                                a6Var.f21937b = System.currentTimeMillis();
                                handler.postDelayed(new hn0(21, a6Var, fArr6), 130L);
                            }
                        }
                    }
                }
            } else {
                handler.postDelayed(new t51(a6Var, 2), 80L);
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
            f2.k kVar = this.f11055b;
            int i7 = kVar.f11049a;
            int i10 = kVar.f11050b;
            int i11 = kVar.f11051c;
            this.f21283i.getClass();
        }
    }

    @Override
    public final f2.k h(f2.k kVar) {
        return kVar;
    }
}
