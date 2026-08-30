package l3;

import android.os.Handler;
import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.z61;
public final class t0 extends a0 {
    public final h71 f11262i;

    public t0(h71 h71Var) {
        this.f11262i = h71Var;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        h71 h71Var = this.f11262i;
        float[] fArr = h71Var.f25343b;
        ByteBuffer byteBuffer2 = h71Var.f25344c;
        FourierTransform.FFT fft = h71Var.f25342a;
        i71 i71Var = h71Var.f25345f;
        b71 b71Var = i71Var.H;
        Handler handler = i71Var.X;
        if (b71Var != null) {
            if (asReadOnlyBuffer != n.f11198a && i71Var.F) {
                if (b71Var.needUpdate()) {
                    int limit = asReadOnlyBuffer.limit();
                    int i10 = 0;
                    if (limit > 8192) {
                        handler.removeCallbacksAndMessages(null);
                        i71Var.H.onVisualizerUpdate(false, true, null);
                    } else {
                        byteBuffer2.put(asReadOnlyBuffer);
                        int i11 = h71Var.d + limit;
                        h71Var.d = i11;
                        if (i11 >= 1024) {
                            byteBuffer2.position(0);
                            for (int i12 = 0; i12 < 1024; i12++) {
                                fArr[i12] = byteBuffer2.getShort() / 32768.0f;
                            }
                            byteBuffer2.rewind();
                            h71Var.d = 0;
                            fft.forward(fArr);
                            int i13 = 0;
                            float f10 = 0.0f;
                            while (true) {
                                float f11 = 1.0f;
                                if (i13 >= 1024) {
                                    break;
                                }
                                float f12 = fft.getSpectrumReal()[i13];
                                float f13 = fft.getSpectrumImaginary()[i13];
                                float sqrt = ((float) Math.sqrt((f13 * f13) + (f12 * f12))) / 30.0f;
                                if (sqrt <= 1.0f) {
                                    if (sqrt < 0.0f) {
                                        f11 = 0.0f;
                                    } else {
                                        f11 = sqrt;
                                    }
                                }
                                f10 += f11 * f11;
                                i13++;
                            }
                            float sqrt2 = (float) Math.sqrt(f10 / 1024);
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
                                    float f14 = fft.getSpectrumReal()[i14];
                                    float f15 = fft.getSpectrumImaginary()[i14];
                                    float sqrt3 = (float) (Math.sqrt((f15 * f15) + (f14 * f14)) / 30.0d);
                                    fArr2[i10] = sqrt3;
                                    if (sqrt3 > 1.0f) {
                                        fArr2[i10] = 1.0f;
                                    } else if (sqrt3 < 0.0f) {
                                        fArr2[i10] = 0.0f;
                                    }
                                    i10++;
                                }
                            }
                            if (System.currentTimeMillis() - h71Var.e >= 64) {
                                h71Var.e = System.currentTimeMillis();
                                handler.postDelayed(new k41(5, h71Var, fArr2), 130L);
                            }
                        }
                    }
                }
            } else {
                handler.postDelayed(new z61(h71Var, 1), 80L);
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
            int i10 = this.f11127b.f11194a;
            this.f11262i.getClass();
        }
    }

    @Override
    public final l f(l lVar) {
        return lVar;
    }
}
