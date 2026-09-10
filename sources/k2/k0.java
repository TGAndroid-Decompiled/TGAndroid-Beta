package k2;

import android.os.Handler;
import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.yo0;
public final class k0 extends c2.i {
    public final s71 f12172i;

    public k0(s71 s71Var) {
        this.f12172i = s71Var;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        String str = e2.d0.f7188a;
        ByteBuffer order = byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        s71 s71Var = this.f12172i;
        float[] fArr = s71Var.f26969b;
        ByteBuffer byteBuffer2 = s71Var.f26970c;
        FourierTransform.FFT fft = s71Var.f26968a;
        t71 t71Var = s71Var.f26971f;
        m71 m71Var = t71Var.K;
        Handler handler = t71Var.f27362a0;
        if (m71Var != null) {
            if (order != c2.h.f4086a && t71Var.I) {
                if (m71Var.needUpdate()) {
                    int limit = order.limit();
                    int i10 = 0;
                    if (limit > 8192) {
                        handler.removeCallbacksAndMessages(null);
                        t71Var.K.onVisualizerUpdate(false, true, null);
                    } else {
                        byteBuffer2.put(order);
                        int i11 = s71Var.d + limit;
                        s71Var.d = i11;
                        if (i11 >= 1024) {
                            byteBuffer2.position(0);
                            for (int i12 = 0; i12 < 1024; i12++) {
                                fArr[i12] = byteBuffer2.getShort() / 32768.0f;
                            }
                            byteBuffer2.rewind();
                            s71Var.d = 0;
                            fft.forward(fArr);
                            int i13 = 0;
                            float f7 = 0.0f;
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
                            if (System.currentTimeMillis() - s71Var.e >= 64) {
                                s71Var.e = System.currentTimeMillis();
                                handler.postDelayed(new yo0(20, s71Var, fArr2), 130L);
                            }
                        }
                    }
                }
            } else {
                handler.postDelayed(new k71(s71Var, 1), 80L);
            }
        }
        j(remaining).put(byteBuffer).flip();
    }

    @Override
    public final void g() {
        k();
    }

    @Override
    public final void h() {
        k();
    }

    @Override
    public final void i() {
        k();
    }

    public final void k() {
        if (isActive()) {
            int i10 = this.f4087b.f4083a;
            this.f12172i.getClass();
        }
    }

    @Override
    public final c2.f f(c2.f fVar) {
        return fVar;
    }
}
