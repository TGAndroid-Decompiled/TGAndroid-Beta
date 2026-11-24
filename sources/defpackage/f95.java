package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class f95 {
    public float c;
    public float d;
    public float e;
    public float f;
    public Shader g;
    public final byte i;
    public float a = -1.0f;
    public float b = -1.0f;
    public final Matrix h = new Matrix();

    public f95(int i) {
        this.i = i;
    }

    public final void a() {
        byte b = this.i;
        if (g95.h1(b)) {
            this.a = kt6.d(Utilities.b.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.b = 1.0f;
        } else if (b == 1) {
            SecureRandom secureRandom = Utilities.b;
            this.a = kt6.d(secureRandom.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.b = kt6.d(secureRandom.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            SecureRandom secureRandom2 = Utilities.b;
            this.a = b10.A(secureRandom2.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.b = secureRandom2.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i, int i2, int i3, long j, float f) {
        float f2;
        if (this.g == null) {
            return;
        }
        float f3 = this.e;
        if (f3 == 0.0f || this.f >= f3) {
            this.e = Utilities.b.nextInt(200) + 1500;
            this.f = 0.0f;
            if (this.a == -1.0f) {
                a();
            }
            this.c = this.a;
            this.d = this.b;
            a();
        }
        float f4 = (float) j;
        float f5 = 1.0f;
        float f6 = (f4 * 0.02f * f) + (f4 * 1.0f) + this.f;
        this.f = f6;
        float f7 = this.e;
        if (f6 > f7) {
            this.f = f7;
            f6 = f7;
        }
        float interpolation = d53.g.getInterpolation(f6 / f7);
        float f8 = i3;
        float f9 = this.c;
        float f10 = (((((this.a - f9) * interpolation) + f9) * f8) + i2) - 200.0f;
        float f11 = this.d;
        float f12 = (((((this.b - f11) * interpolation) + f11) * f8) + i) - 200.0f;
        byte b = this.i;
        if (!g95.h1(b)) {
            if (b == 1) {
                f2 = 4.0f;
            } else {
                f2 = 2.5f;
            }
            f5 = f2;
        }
        float L = (gm.L(122.0f) / 400.0f) * f5;
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f10, f12);
        matrix.postScale(L, L, f10 + 200.0f, f12 + 200.0f);
        this.g.setLocalMatrix(matrix);
    }
}
