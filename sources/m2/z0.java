package m2;

import android.os.Handler;
import bi.c1;
import java.nio.ByteBuffer;
import mi.c6;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.p11;
public final class z0 extends e2.n {
    public final c6 f19049i;

    public z0(c6 c6Var) {
        this.f19049i = c6Var;
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
        String str = g2.n0.f11873a;
        ByteBuffer order = byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        c6 c6Var = this.f19049i;
        float[] fArr2 = (float[]) c6Var.d;
        c1 c1Var = (c1) c6Var.f19551c;
        ByteBuffer byteBuffer2 = (ByteBuffer) c6Var.f19552e;
        m51 m51Var = (m51) c6Var.f19553f;
        g51 g51Var = m51Var.L;
        Handler handler = m51Var.f36005b0;
        if (g51Var != null) {
            if (order != e2.m.f9358a && m51Var.J) {
                if (g51Var.b()) {
                    int limit = order.limit();
                    int i3 = 0;
                    if (limit > 8192) {
                        handler.removeCallbacksAndMessages(null);
                        m51Var.L.r(false, null);
                    } else {
                        byteBuffer2.put(order);
                        int i10 = c6Var.f19549a + limit;
                        c6Var.f19549a = i10;
                        if (i10 >= 1024) {
                            byteBuffer2.position(0);
                            for (int i11 = 0; i11 < 1024; i11++) {
                                fArr2[i11] = byteBuffer2.getShort() / 32768.0f;
                            }
                            byteBuffer2.rewind();
                            c6Var.f19549a = 0;
                            c1Var.getClass();
                            float f12 = 0.0f;
                            if (fArr2.length != 1024) {
                                f10 = 0.0f;
                                f11 = 1.0f;
                            } else {
                                for (int i12 = 0; i12 < 1024; i12++) {
                                    ((float[]) c1Var.f3684b)[i12] = fArr2[((int[]) c1Var.f3687f)[i12]];
                                    ((float[]) c1Var.f3685c)[i12] = 0.0f;
                                }
                                int i13 = 1;
                                while (i13 < ((float[]) c1Var.f3684b).length) {
                                    float f13 = ((float[]) c1Var.h)[i13];
                                    float f14 = ((float[]) c1Var.f3688g)[i13];
                                    float f15 = f12;
                                    int i14 = i3;
                                    float f16 = 1.0f;
                                    while (i14 < i13) {
                                        float f17 = f12;
                                        int i15 = i14;
                                        while (true) {
                                            float[] fArr3 = (float[]) c1Var.f3684b;
                                            if (i15 < fArr3.length) {
                                                int i16 = i15 + i13;
                                                float f18 = fArr3[i16];
                                                float[] fArr4 = (float[]) c1Var.f3685c;
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
                                    i3 = 0;
                                }
                                f10 = f12;
                                f11 = 1.0f;
                                int i17 = 0;
                                while (true) {
                                    fArr = (float[]) c1Var.d;
                                    if (i17 >= fArr.length) {
                                        break;
                                    }
                                    float f22 = ((float[]) c1Var.f3684b)[i17];
                                    float f23 = ((float[]) c1Var.f3685c)[i17];
                                    fArr[i17] = (float) Math.sqrt((f23 * f23) + (f22 * f22));
                                    i17++;
                                }
                                if (c1Var.f3683a == 1) {
                                    int length = fArr.length / ((float[]) c1Var.f3686e).length;
                                    for (int i18 = 0; i18 < ((float[]) c1Var.f3686e).length; i18++) {
                                        float f24 = f10;
                                        int i19 = 0;
                                        while (i19 < length) {
                                            int i20 = (i18 * length) + i19;
                                            float[] fArr5 = (float[]) c1Var.d;
                                            if (i20 < fArr5.length) {
                                                f24 += fArr5[i20];
                                                i19++;
                                            }
                                        }
                                        ((float[]) c1Var.f3686e)[i18] = f24 / (i19 + 1);
                                    }
                                }
                            }
                            float f25 = f10;
                            for (int i21 = 0; i21 < 1024; i21++) {
                                float f26 = ((float[]) c1Var.f3684b)[i21];
                                float f27 = ((float[]) c1Var.f3685c)[i21];
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
                                    float f28 = ((float[]) c1Var.f3684b)[i24];
                                    float f29 = ((float[]) c1Var.f3685c)[i24];
                                    float sqrt3 = (float) (Math.sqrt((f29 * f29) + (f28 * f28)) / 30.0d);
                                    fArr6[i23] = sqrt3;
                                    if (sqrt3 > f11) {
                                        fArr6[i23] = f11;
                                    } else if (sqrt3 < f10) {
                                        fArr6[i23] = f10;
                                    }
                                }
                            }
                            if (System.currentTimeMillis() - c6Var.f19550b >= 64) {
                                c6Var.f19550b = System.currentTimeMillis();
                                handler.postDelayed(new p11(6, c6Var, fArr6), 130L);
                            }
                        }
                    }
                }
            } else {
                handler.postDelayed(new f51(c6Var, 1), 80L);
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
            e2.j jVar = this.f9359b;
            int i3 = jVar.f9353a;
            int i10 = jVar.f9354b;
            int i11 = jVar.f9355c;
            this.f19049i.getClass();
        }
    }

    @Override
    public final e2.j h(e2.j jVar) {
        return jVar;
    }
}
