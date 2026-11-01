package k2;

import android.os.Handler;
import bi.r6;
import java.nio.ByteBuffer;
import org.telegram.messenger.l9;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.v61;
public final class d1 extends c2.n {
    public final r6 f10636i;

    public d1(r6 r6Var) {
        this.f10636i = r6Var;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        float f7;
        float f10;
        float[] fArr;
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        String str = e2.l0.f6165a;
        ByteBuffer order = byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        r6 r6Var = this.f10636i;
        float[] fArr2 = (float[]) r6Var.d;
        l9 l9Var = (l9) r6Var.f3332c;
        ByteBuffer byteBuffer2 = (ByteBuffer) r6Var.e;
        v61 v61Var = (v61) r6Var.f3333f;
        p61 p61Var = v61Var.K;
        Handler handler = v61Var.f31199a0;
        if (p61Var != null) {
            if (order != c2.m.f3552a && v61Var.I) {
                if (p61Var.k()) {
                    int limit = order.limit();
                    int i10 = 0;
                    if (limit > 8192) {
                        handler.removeCallbacksAndMessages(null);
                        v61Var.K.B(false, null);
                    } else {
                        byteBuffer2.put(order);
                        int i11 = r6Var.f3330a + limit;
                        r6Var.f3330a = i11;
                        if (i11 >= 1024) {
                            byteBuffer2.position(0);
                            for (int i12 = 0; i12 < 1024; i12++) {
                                fArr2[i12] = byteBuffer2.getShort() / 32768.0f;
                            }
                            byteBuffer2.rewind();
                            r6Var.f3330a = 0;
                            l9Var.getClass();
                            float f11 = 0.0f;
                            if (fArr2.length != 1024) {
                                f7 = 0.0f;
                                f10 = 1.0f;
                            } else {
                                for (int i13 = 0; i13 < 1024; i13++) {
                                    ((float[]) l9Var.f16917b)[i13] = fArr2[((int[]) l9Var.h)[i13]];
                                    ((float[]) l9Var.f16918c)[i13] = 0.0f;
                                }
                                int i14 = 1;
                                while (i14 < ((float[]) l9Var.f16917b).length) {
                                    float f12 = ((float[]) l9Var.f16920g)[i14];
                                    float f13 = ((float[]) l9Var.f16919f)[i14];
                                    float f14 = f11;
                                    int i15 = i10;
                                    float f15 = 1.0f;
                                    while (i15 < i14) {
                                        float f16 = f11;
                                        int i16 = i15;
                                        while (true) {
                                            float[] fArr3 = (float[]) l9Var.f16917b;
                                            if (i16 < fArr3.length) {
                                                int i17 = i16 + i14;
                                                float f17 = fArr3[i17];
                                                float[] fArr4 = (float[]) l9Var.f16918c;
                                                float f18 = fArr4[i17];
                                                float f19 = (f15 * f17) - (f14 * f18);
                                                float f20 = (f17 * f14) + (f18 * f15);
                                                fArr3[i17] = fArr3[i16] - f19;
                                                fArr4[i17] = fArr4[i16] - f20;
                                                fArr3[i16] = fArr3[i16] + f19;
                                                fArr4[i16] = fArr4[i16] + f20;
                                                i16 += i14 * 2;
                                            }
                                        }
                                        f14 = (f14 * f12) + (f15 * f13);
                                        i15++;
                                        f15 = (f15 * f12) - (f14 * f13);
                                        f11 = f16;
                                    }
                                    i14 *= 2;
                                    i10 = 0;
                                }
                                f7 = f11;
                                f10 = 1.0f;
                                int i18 = 0;
                                while (true) {
                                    fArr = (float[]) l9Var.d;
                                    if (i18 >= fArr.length) {
                                        break;
                                    }
                                    float f21 = ((float[]) l9Var.f16917b)[i18];
                                    float f22 = ((float[]) l9Var.f16918c)[i18];
                                    fArr[i18] = (float) Math.sqrt((f22 * f22) + (f21 * f21));
                                    i18++;
                                }
                                if (l9Var.f16916a == 1) {
                                    int length = fArr.length / ((float[]) l9Var.e).length;
                                    for (int i19 = 0; i19 < ((float[]) l9Var.e).length; i19++) {
                                        float f23 = f7;
                                        int i20 = 0;
                                        while (i20 < length) {
                                            int i21 = (i19 * length) + i20;
                                            float[] fArr5 = (float[]) l9Var.d;
                                            if (i21 < fArr5.length) {
                                                f23 += fArr5[i21];
                                                i20++;
                                            }
                                        }
                                        ((float[]) l9Var.e)[i19] = f23 / (i20 + 1);
                                    }
                                }
                            }
                            float f24 = f7;
                            for (int i22 = 0; i22 < 1024; i22++) {
                                float f25 = ((float[]) l9Var.f16917b)[i22];
                                float f26 = ((float[]) l9Var.f16918c)[i22];
                                float sqrt = ((float) Math.sqrt((f26 * f26) + (f25 * f25))) / 30.0f;
                                if (sqrt > f10) {
                                    sqrt = f10;
                                } else if (sqrt < f7) {
                                    sqrt = f7;
                                }
                                f24 += sqrt * sqrt;
                            }
                            float sqrt2 = (float) Math.sqrt(f24 / 1024);
                            float[] fArr6 = new float[7];
                            fArr6[6] = sqrt2;
                            if (sqrt2 < 0.4f) {
                                for (int i23 = 0; i23 < 7; i23++) {
                                    fArr6[i23] = f7;
                                }
                            } else {
                                for (int i24 = 0; i24 < 6; i24++) {
                                    int i25 = 170 * i24;
                                    float f27 = ((float[]) l9Var.f16917b)[i25];
                                    float f28 = ((float[]) l9Var.f16918c)[i25];
                                    float sqrt3 = (float) (Math.sqrt((f28 * f28) + (f27 * f27)) / 30.0d);
                                    fArr6[i24] = sqrt3;
                                    if (sqrt3 > f10) {
                                        fArr6[i24] = f10;
                                    } else if (sqrt3 < f7) {
                                        fArr6[i24] = f7;
                                    }
                                }
                            }
                            if (System.currentTimeMillis() - r6Var.f3331b >= 64) {
                                r6Var.f3331b = System.currentTimeMillis();
                                handler.postDelayed(new hi0(25, r6Var, fArr6), 130L);
                            }
                        }
                    }
                }
            } else {
                handler.postDelayed(new k51(r6Var, 4), 80L);
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
            c2.j jVar = this.f3553b;
            int i10 = jVar.f3547a;
            int i11 = jVar.f3548b;
            int i12 = jVar.f3549c;
            this.f10636i.getClass();
        }
    }

    @Override
    public final c2.j h(c2.j jVar) {
        return jVar;
    }
}
