package k2;

import android.os.Handler;
import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.v71;
public final class a1 extends c2.o {
    public final g81 f13841i;

    public a1(g81 g81Var) {
        this.f13841i = g81Var;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        String str = e2.m0.f8372a;
        ByteBuffer order = byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        g81 g81Var = this.f13841i;
        float[] fArr = g81Var.f25220b;
        ByteBuffer byteBuffer2 = g81Var.f25221c;
        FourierTransform.FFT fft = g81Var.f25219a;
        h81 h81Var = g81Var.f25222f;
        a81 a81Var = h81Var.K;
        Handler handler = h81Var.f25544a0;
        if (a81Var != null) {
            if (order != c2.n.f4147a && h81Var.I) {
                if (a81Var.needUpdate()) {
                    int limit = order.limit();
                    int i10 = 0;
                    if (limit > 8192) {
                        handler.removeCallbacksAndMessages(null);
                        h81Var.K.onVisualizerUpdate(false, true, null);
                    } else {
                        byteBuffer2.put(order);
                        int i11 = g81Var.d + limit;
                        g81Var.d = i11;
                        if (i11 >= 1024) {
                            byteBuffer2.position(0);
                            for (int i12 = 0; i12 < 1024; i12++) {
                                fArr[i12] = byteBuffer2.getShort() / 32768.0f;
                            }
                            byteBuffer2.rewind();
                            g81Var.d = 0;
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
                            if (System.currentTimeMillis() - g81Var.e >= 64) {
                                g81Var.e = System.currentTimeMillis();
                                handler.postDelayed(new k31(9, g81Var, fArr2), 130L);
                            }
                        }
                    }
                }
            } else {
                handler.postDelayed(new v71(g81Var, 2), 80L);
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
            int i10 = this.f4148b.f4142a;
            this.f13841i.getClass();
        }
    }

    @Override
    public final c2.k h(c2.k kVar) {
        return kVar;
    }
}
