package k2;

import android.os.Handler;
import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.m81;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.t81;
public final class b1 extends c2.p {
    public final s81 f16127i;

    public b1(s81 s81Var) {
        this.f16127i = s81Var;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        String str = e2.n0.f9691a;
        ByteBuffer order = byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        s81 s81Var = this.f16127i;
        float[] fArr = s81Var.f32514b;
        ByteBuffer byteBuffer2 = s81Var.f32515c;
        FourierTransform.FFT fft = s81Var.f32513a;
        t81 t81Var = s81Var.f32516f;
        m81 m81Var = t81Var.K;
        Handler handler = t81Var.f32885a0;
        if (m81Var != null) {
            if (order != c2.o.f5959a && t81Var.I) {
                if (m81Var.needUpdate()) {
                    int limit = order.limit();
                    int i10 = 0;
                    if (limit > 8192) {
                        handler.removeCallbacksAndMessages(null);
                        t81Var.K.onVisualizerUpdate(false, true, null);
                    } else {
                        byteBuffer2.put(order);
                        int i11 = s81Var.d + limit;
                        s81Var.d = i11;
                        if (i11 >= 1024) {
                            byteBuffer2.position(0);
                            for (int i12 = 0; i12 < 1024; i12++) {
                                fArr[i12] = byteBuffer2.getShort() / 32768.0f;
                            }
                            byteBuffer2.rewind();
                            s81Var.d = 0;
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
                            if (System.currentTimeMillis() - s81Var.e >= 64) {
                                s81Var.e = System.currentTimeMillis();
                                handler.postDelayed(new d71(3, s81Var, fArr2), 130L);
                            }
                        }
                    }
                }
            } else {
                handler.postDelayed(new t51(s81Var, 7), 80L);
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
            int i10 = this.f5960b.f5954a;
            this.f16127i.getClass();
        }
    }

    @Override
    public final c2.l h(c2.l lVar) {
        return lVar;
    }
}
