package k2;

import android.os.Handler;
import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.w71;
public final class a1 extends c2.o {
    public final h81 f13844i;

    public a1(h81 h81Var) {
        this.f13844i = h81Var;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        String str = e2.m0.f8375a;
        ByteBuffer order = byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        h81 h81Var = this.f13844i;
        float[] fArr = h81Var.f25204b;
        ByteBuffer byteBuffer2 = h81Var.f25205c;
        FourierTransform.FFT fft = h81Var.f25203a;
        i81 i81Var = h81Var.f25206f;
        b81 b81Var = i81Var.K;
        Handler handler = i81Var.f25584a0;
        if (b81Var != null) {
            if (order != c2.n.f4151a && i81Var.I) {
                if (b81Var.needUpdate()) {
                    int limit = order.limit();
                    int i10 = 0;
                    if (limit > 8192) {
                        handler.removeCallbacksAndMessages(null);
                        i81Var.K.onVisualizerUpdate(false, true, null);
                    } else {
                        byteBuffer2.put(order);
                        int i11 = h81Var.d + limit;
                        h81Var.d = i11;
                        if (i11 >= 1024) {
                            byteBuffer2.position(0);
                            for (int i12 = 0; i12 < 1024; i12++) {
                                fArr[i12] = byteBuffer2.getShort() / 32768.0f;
                            }
                            byteBuffer2.rewind();
                            h81Var.d = 0;
                            fft.forward(fArr);
                            float f7 = 0.0f;
                            int i13 = 0;
                            while (true) {
                                float f10 = 1.0f;
                                if (i13 >= 1024) {
                                    break;
                                }
                                float f11 = fft.getSpectrumReal()[i13];
                                float f12 = fft.getSpectrumImaginary()[i13];
                                float sqrt = ((float) Math.sqrt((f12 * f12) + (f11 * f11))) / 30.0f;
                                if (sqrt <= 1.0f) {
                                    if (sqrt < 0.0f) {
                                        f10 = 0.0f;
                                    } else {
                                        f10 = sqrt;
                                    }
                                }
                                f7 += f10 * f10;
                                i13++;
                            }
                            float sqrt2 = (float) Math.sqrt(f7 / 1024);
                            float[] fArr2 = new float[7];
                            fArr2[6] = sqrt2;
                            if (sqrt2 < 0.4f) {
                                while (i10 < 7) {
                                    fArr2[i10] = 0.0f;
                                    i10++;
                                }
                            } else {
                                while (i10 < 6) {
                                    int i14 = 170 * i10;
                                    float f13 = fft.getSpectrumReal()[i14];
                                    float f14 = fft.getSpectrumImaginary()[i14];
                                    float sqrt3 = (float) (Math.sqrt((f14 * f14) + (f13 * f13)) / 30.0d);
                                    fArr2[i10] = sqrt3;
                                    if (sqrt3 > 1.0f) {
                                        fArr2[i10] = 1.0f;
                                    } else if (sqrt3 < 0.0f) {
                                        fArr2[i10] = 0.0f;
                                    }
                                    i10++;
                                }
                            }
                            if (System.currentTimeMillis() - h81Var.e >= 64) {
                                h81Var.e = System.currentTimeMillis();
                                handler.postDelayed(new n51(4, h81Var, fArr2), 130L);
                            }
                        }
                    }
                }
            } else {
                handler.postDelayed(new w71(h81Var, 2), 80L);
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
            int i10 = this.f4152b.f4146a;
            this.f13844i.getClass();
        }
    }

    @Override
    public final c2.k h(c2.k kVar) {
        return kVar;
    }
}
