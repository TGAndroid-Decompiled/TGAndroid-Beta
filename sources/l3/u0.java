package l3;

import android.os.Handler;
import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.x61;
public final class u0 extends y {
    public final w61 f14213i;

    public u0(w61 w61Var) {
        this.f14213i = w61Var;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        w61 w61Var = this.f14213i;
        float[] fArr = w61Var.f34337b;
        ByteBuffer byteBuffer2 = w61Var.f34338c;
        FourierTransform.FFT fft = w61Var.f34336a;
        x61 x61Var = w61Var.f34340f;
        q61 q61Var = x61Var.G;
        Handler handler = x61Var.W;
        if (q61Var != null) {
            if (asReadOnlyBuffer != j.f14106a && x61Var.E) {
                if (q61Var.needUpdate()) {
                    int limit = asReadOnlyBuffer.limit();
                    int i10 = 0;
                    if (limit > 8192) {
                        handler.removeCallbacksAndMessages(null);
                        x61Var.G.onVisualizerUpdate(false, true, null);
                    } else {
                        byteBuffer2.put(asReadOnlyBuffer);
                        int i11 = w61Var.d + limit;
                        w61Var.d = i11;
                        if (i11 >= 1024) {
                            byteBuffer2.position(0);
                            for (int i12 = 0; i12 < 1024; i12++) {
                                fArr[i12] = byteBuffer2.getShort() / 32768.0f;
                            }
                            byteBuffer2.rewind();
                            w61Var.d = 0;
                            fft.forward(fArr);
                            int i13 = 0;
                            float f9 = 0.0f;
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
                                f9 += f10 * f10;
                                i13++;
                            }
                            float sqrt2 = (float) Math.sqrt(f9 / 1024);
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
                            if (System.currentTimeMillis() - w61Var.f34339e >= 64) {
                                w61Var.f34339e = System.currentTimeMillis();
                                handler.postDelayed(new ii0(26, w61Var, fArr2), 130L);
                            }
                        }
                    }
                }
            } else {
                handler.postDelayed(new o61(w61Var, 1), 80L);
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
            int i10 = this.f14249b.f14099a;
            this.f14213i.getClass();
        }
    }

    @Override
    public final h f(h hVar) {
        return hVar;
    }
}
