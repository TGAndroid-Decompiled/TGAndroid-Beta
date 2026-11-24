package defpackage;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class sa5 {
    public float c;
    public float d;
    public float e;
    public float f;
    public RadialGradient g;
    public final int i;
    public int j;
    public int k;
    public int l;
    public float a = -1.0f;
    public float b = -1.0f;
    public final Matrix h = new Matrix();

    public sa5(int i) {
        this.i = i;
    }

    public final void a(float f) {
        float f2;
        int i = this.i;
        if (i == 0) {
            int i2 = this.j;
            int i3 = cmb.Jh;
            if (i2 != cmb.w0(null, i3, false) || this.k != cmb.w0(null, cmb.Kh, false)) {
                int w0 = cmb.w0(null, i3, false);
                this.j = w0;
                int w02 = cmb.w0(null, cmb.Kh, false);
                this.k = w02;
                this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w0, w02}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i == 1) {
            int i4 = this.j;
            int i5 = cmb.Lh;
            if (i4 != cmb.w0(null, i5, false) || this.k != cmb.w0(null, cmb.Mh, false)) {
                int w03 = cmb.w0(null, i5, false);
                this.j = w03;
                int w04 = cmb.w0(null, cmb.Mh, false);
                this.k = w04;
                this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w03, w04}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i == 3) {
            int i6 = this.j;
            int i7 = cmb.Yh;
            if (i6 != cmb.w0(null, i7, false) || this.k != cmb.w0(null, cmb.Zh, false) || this.l != cmb.w0(null, cmb.ai, false)) {
                int w05 = cmb.w0(null, cmb.Zh, false);
                this.k = w05;
                int w06 = cmb.w0(null, cmb.ai, false);
                this.l = w06;
                int w07 = cmb.w0(null, i7, false);
                this.j = w07;
                this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w05, w06, w07}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            return;
        }
        int L = gm.L(130.0f);
        float f3 = this.e;
        if (f3 == 0.0f || this.f >= f3) {
            this.e = Utilities.b.nextInt(700) + 500;
            this.f = 0.0f;
            if (this.a == -1.0f) {
                b();
            }
            this.c = this.a;
            this.d = this.b;
            b();
        }
        float i8 = ts2.i(0.32f, f, 16.0f, this.f);
        this.f = i8;
        float f4 = this.e;
        if (i8 > f4) {
            this.f = f4;
            i8 = f4;
        }
        float interpolation = d53.g.getInterpolation(i8 / f4);
        float f5 = L;
        float f6 = this.c;
        float f7 = ((((this.a - f6) * interpolation) + f6) * f5) - 200.0f;
        float f8 = this.d;
        float f9 = ((((this.b - f8) * interpolation) + f8) * f5) - 200.0f;
        if (i == 3) {
            f2 = 2.0f;
        } else {
            f2 = 1.5f;
        }
        float f10 = (f5 / 400.0f) * f2;
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f7, f9);
        matrix.postScale(f10, f10, f7 + 200.0f, f9 + 200.0f);
        this.g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i = this.i;
        if (i == 0) {
            SecureRandom secureRandom = Utilities.b;
            this.a = kt6.d(secureRandom.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.b = kt6.d(secureRandom.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i == 3) {
            SecureRandom secureRandom2 = Utilities.b;
            this.a = kt6.d(secureRandom2.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.b = (secureRandom2.nextInt(100) * 0.1f) / 100.0f;
        } else {
            SecureRandom secureRandom3 = Utilities.b;
            this.a = b10.A(secureRandom3.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.b = secureRandom3.nextInt(100) / 100.0f;
        }
    }
}
