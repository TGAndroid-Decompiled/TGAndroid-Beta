package j3;

import android.os.Handler;
import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.k61;
public final class t0 extends x {
    public final j61 f13354i;

    public t0(j61 j61Var) {
        this.f13354i = j61Var;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        j61 j61Var = this.f13354i;
        float[] fArr = j61Var.f29657b;
        ByteBuffer byteBuffer2 = j61Var.f29658c;
        FourierTransform.FFT fft = j61Var.f29656a;
        k61 k61Var = j61Var.f29660f;
        d61 d61Var = k61Var.G;
        Handler handler = k61Var.W;
        if (d61Var != null) {
            if (asReadOnlyBuffer != j.f13282a && k61Var.E) {
                if (d61Var.needUpdate()) {
                    int limit = asReadOnlyBuffer.limit();
                    int i9 = 0;
                    if (limit > 8192) {
                        handler.removeCallbacksAndMessages(null);
                        k61Var.G.onVisualizerUpdate(false, true, null);
                    } else {
                        byteBuffer2.put(asReadOnlyBuffer);
                        int i10 = j61Var.d + limit;
                        j61Var.d = i10;
                        if (i10 >= 1024) {
                            byteBuffer2.position(0);
                            for (int i11 = 0; i11 < 1024; i11++) {
                                fArr[i11] = byteBuffer2.getShort() / 32768.0f;
                            }
                            byteBuffer2.rewind();
                            j61Var.d = 0;
                            fft.forward(fArr);
                            int i12 = 0;
                            float f10 = 0.0f;
                            while (true) {
                                float f11 = 1.0f;
                                if (i12 >= 1024) {
                                    break;
                                }
                                float f12 = fft.getSpectrumReal()[i12];
                                float f13 = fft.getSpectrumImaginary()[i12];
                                float sqrt = ((float) Math.sqrt((f13 * f13) + (f12 * f12))) / 30.0f;
                                if (sqrt <= 1.0f) {
                                    if (sqrt < 0.0f) {
                                        f11 = 0.0f;
                                    } else {
                                        f11 = sqrt;
                                    }
                                }
                                f10 += f11 * f11;
                                i12++;
                            }
                            float sqrt2 = (float) Math.sqrt(f10 / 1024);
                            float[] fArr2 = new float[7];
                            fArr2[6] = sqrt2;
                            if (sqrt2 < 0.4f) {
                                while (i9 < 7) {
                                    fArr2[i9] = 0.0f;
                                    i9++;
                                }
                            } else {
                                while (i9 < 6) {
                                    int i13 = 170 * i9;
                                    float f14 = fft.getSpectrumReal()[i13];
                                    float f15 = fft.getSpectrumImaginary()[i13];
                                    float sqrt3 = (float) (Math.sqrt((f15 * f15) + (f14 * f14)) / 30.0d);
                                    fArr2[i9] = sqrt3;
                                    if (sqrt3 > 1.0f) {
                                        fArr2[i9] = 1.0f;
                                    } else if (sqrt3 < 0.0f) {
                                        fArr2[i9] = 0.0f;
                                    }
                                    i9++;
                                }
                            }
                            if (System.currentTimeMillis() - j61Var.f29659e >= 64) {
                                j61Var.f29659e = System.currentTimeMillis();
                                handler.postDelayed(new jg0(29, j61Var, fArr2), 130L);
                            }
                        }
                    }
                }
            } else {
                handler.postDelayed(new b61(j61Var, 1), 80L);
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
            int i9 = this.f13390b.f13247a;
            this.f13354i.getClass();
        }
    }

    @Override
    public final h f(h hVar) {
        return hVar;
    }
}
