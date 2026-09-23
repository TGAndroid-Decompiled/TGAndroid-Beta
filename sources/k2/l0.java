package k2;

import android.os.Handler;
import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.y61;
public final class l0 extends c2.i {
    public final e71 f13320i;

    public l0(e71 e71Var) {
        this.f13320i = e71Var;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        String str = e2.d0.f7871a;
        ByteBuffer order = byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        e71 e71Var = this.f13320i;
        float[] fArr = e71Var.f23590b;
        ByteBuffer byteBuffer2 = e71Var.f23591c;
        FourierTransform.FFT fft = e71Var.f23589a;
        f71 f71Var = e71Var.f23592f;
        y61 y61Var = f71Var.K;
        Handler handler = f71Var.f23882a0;
        if (y61Var != null) {
            if (order != c2.h.f3664a && f71Var.I) {
                if (y61Var.needUpdate()) {
                    int limit = order.limit();
                    int i10 = 0;
                    if (limit > 8192) {
                        handler.removeCallbacksAndMessages(null);
                        f71Var.K.onVisualizerUpdate(false, true, null);
                    } else {
                        byteBuffer2.put(order);
                        int i11 = e71Var.d + limit;
                        e71Var.d = i11;
                        if (i11 >= 1024) {
                            byteBuffer2.position(0);
                            for (int i12 = 0; i12 < 1024; i12++) {
                                fArr[i12] = byteBuffer2.getShort() / 32768.0f;
                            }
                            byteBuffer2.rewind();
                            e71Var.d = 0;
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
                            if (System.currentTimeMillis() - e71Var.e >= 64) {
                                e71Var.e = System.currentTimeMillis();
                                handler.postDelayed(new ar0(17, e71Var, fArr2), 130L);
                            }
                        }
                    }
                }
            } else {
                handler.postDelayed(new w61(e71Var, 1), 80L);
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
            int i10 = this.f3665b.f3661a;
            this.f13320i.getClass();
        }
    }

    @Override
    public final c2.f f(c2.f fVar) {
        return fVar;
    }
}
