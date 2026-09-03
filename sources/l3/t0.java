package l3;

import android.os.Handler;
import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.q51;
public final class t0 extends a0 {
    public final i71 f11632i;

    public t0(i71 i71Var) {
        this.f11632i = i71Var;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        i71 i71Var = this.f11632i;
        float[] fArr = i71Var.f27732b;
        ByteBuffer byteBuffer2 = i71Var.f27733c;
        FourierTransform.FFT fft = i71Var.f27731a;
        j71 j71Var = i71Var.f27735f;
        c71 c71Var = j71Var.H;
        Handler handler = j71Var.X;
        if (c71Var != null) {
            if (asReadOnlyBuffer != n.f11564a && j71Var.F) {
                if (c71Var.needUpdate()) {
                    int limit = asReadOnlyBuffer.limit();
                    int i10 = 0;
                    if (limit > 8192) {
                        handler.removeCallbacksAndMessages(null);
                        j71Var.H.onVisualizerUpdate(false, true, null);
                    } else {
                        byteBuffer2.put(asReadOnlyBuffer);
                        int i11 = i71Var.d + limit;
                        i71Var.d = i11;
                        if (i11 >= 1024) {
                            byteBuffer2.position(0);
                            for (int i12 = 0; i12 < 1024; i12++) {
                                fArr[i12] = byteBuffer2.getShort() / 32768.0f;
                            }
                            byteBuffer2.rewind();
                            i71Var.d = 0;
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
                            if (System.currentTimeMillis() - i71Var.f27734e >= 64) {
                                i71Var.f27734e = System.currentTimeMillis();
                                handler.postDelayed(new q51(3, i71Var, fArr2), 130L);
                            }
                        }
                    }
                }
            } else {
                handler.postDelayed(new a71(i71Var, 1), 80L);
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
            int i10 = this.f11487b.f11560a;
            this.f11632i.getClass();
        }
    }

    @Override
    public final l f(l lVar) {
        return lVar;
    }
}
