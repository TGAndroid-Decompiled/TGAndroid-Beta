package k2;

import android.os.Handler;
import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.u71;
public final class b1 extends c2.o {
    public final a81 f14655i;

    public b1(a81 a81Var) {
        this.f14655i = a81Var;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        String str = e2.m0.f8252a;
        ByteBuffer order = byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        a81 a81Var = this.f14655i;
        float[] fArr = a81Var.f24512b;
        ByteBuffer byteBuffer2 = a81Var.f24513c;
        FourierTransform.FFT fft = a81Var.f24511a;
        b81 b81Var = a81Var.f24514f;
        u71 u71Var = b81Var.K;
        Handler handler = b81Var.f24833a0;
        if (u71Var != null) {
            if (order != c2.n.f4518a && b81Var.I) {
                if (u71Var.needUpdate()) {
                    int limit = order.limit();
                    int i10 = 0;
                    if (limit > 8192) {
                        handler.removeCallbacksAndMessages(null);
                        b81Var.K.onVisualizerUpdate(false, true, null);
                    } else {
                        byteBuffer2.put(order);
                        int i11 = a81Var.d + limit;
                        a81Var.d = i11;
                        if (i11 >= 1024) {
                            byteBuffer2.position(0);
                            for (int i12 = 0; i12 < 1024; i12++) {
                                fArr[i12] = byteBuffer2.getShort() / 32768.0f;
                            }
                            byteBuffer2.rewind();
                            a81Var.d = 0;
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
                            if (System.currentTimeMillis() - a81Var.e >= 64) {
                                a81Var.e = System.currentTimeMillis();
                                handler.postDelayed(new go0(22, a81Var, fArr2), 130L);
                            }
                        }
                    }
                }
            } else {
                handler.postDelayed(new t71(a81Var, 1), 80L);
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
            int i10 = this.f4519b.f4513a;
            this.f14655i.getClass();
        }
    }

    @Override
    public final c2.k h(c2.k kVar) {
        return kVar;
    }
}
