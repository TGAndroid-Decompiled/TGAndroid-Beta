package c2;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;
public final class p implements q {
    public final float[] f4523a;
    public float[] f4524b;
    public float[] f4525c;
    public float[] d;
    public double e;
    public double f4526f;
    public double f4527g;
    public final s h;

    public p(s sVar) {
        this.h = sVar;
        int i10 = sVar.h;
        this.f4523a = new float[i10];
        int i11 = i10 * sVar.f4534b;
        this.f4524b = new float[i11];
        this.f4525c = new float[i11];
        this.d = new float[i11];
    }

    @Override
    public final void a(int i10, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.f4524b;
        s sVar = this.h;
        asFloatBuffer.get(fArr, sVar.f4539j * sVar.f4534b, i10 / 4);
        byteBuffer.position(byteBuffer.position() + i10);
    }

    @Override
    public final void b(int i10, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.f4525c;
        s sVar = this.h;
        asFloatBuffer.put(fArr, 0, sVar.f4534b * i10);
        byteBuffer.position((i10 * 4 * sVar.f4534b) + byteBuffer.position());
    }

    @Override
    public final void c(int i10, long j10, long j11) {
        int i11 = 0;
        while (true) {
            s sVar = this.h;
            int i12 = sVar.f4534b;
            if (i11 < i12) {
                float[] fArr = this.d;
                int i13 = (i10 * i12) + i11;
                float f7 = fArr[i13];
                float f10 = fArr[i13 + i12];
                int i14 = sVar.f4542m;
                long j12 = (i14 + 1) * j11;
                long j13 = j12 - (sVar.f4543n * j10);
                long j14 = j12 - (i14 * j11);
                this.f4525c[(sVar.f4540k * i12) + i11] = ((((float) (j14 - j13)) * f10) + (((float) j13) * f7)) / ((float) j14);
                i11++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(int i10, int i11) {
        for (int i12 = 0; i12 < this.h.f4534b * i11; i12++) {
            this.f4524b[i10 + i12] = 0.0f;
        }
    }

    @Override
    public final void e(int i10, int i11) {
        s sVar = this.h;
        int i12 = sVar.h / i11;
        int i13 = sVar.f4534b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            double d = 0.0d;
            for (int i17 = 0; i17 < i14; i17++) {
                d += this.f4524b[(i16 * i14) + i15 + i17];
            }
            this.f4523a[i16] = (float) (d / i14);
        }
    }

    @Override
    public final int f(int i10, int i11, int i12) {
        return s(this.f4524b, i10, i11, i12);
    }

    @Override
    public final void flush() {
        this.f4527g = 0.0d;
        this.e = 0.0d;
        this.f4526f = 0.0d;
    }

    @Override
    public final void g() {
        this.f4527g = this.e;
    }

    @Override
    public final Object h() {
        return this.f4524b;
    }

    @Override
    public final Object i() {
        return this.f4525c;
    }

    @Override
    public final void j(int i10) {
        this.f4525c = r(this.f4525c, this.h.f4540k, i10);
    }

    @Override
    public final boolean k() {
        double d = this.e;
        if (d == 0.0d || this.h.f4545p == 0 || this.f4526f > d * 3.0d || d * 2.0d <= this.f4527g * 3.0d) {
            return false;
        }
        return true;
    }

    @Override
    public final Object l() {
        return this.d;
    }

    @Override
    public final void m(int i10, int i11, int i12, int i13, int i14) {
        float[] fArr = this.f4525c;
        float[] fArr2 = this.f4524b;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                fArr[i16] = ((fArr2[i17] * i19) + (fArr2[i18] * (i10 - i19))) / i10;
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    @Override
    public final void n(int i10) {
        this.d = r(this.d, this.h.f4541l, i10);
    }

    @Override
    public final int o() {
        return 4;
    }

    @Override
    public final void p(int i10) {
        this.f4524b = r(this.f4524b, this.h.f4539j, i10);
    }

    @Override
    public final int q(int i10, int i11) {
        return s(this.f4523a, 0, i10, i11);
    }

    public final float[] r(float[] fArr, int i10, int i11) {
        int length = fArr.length;
        int i12 = this.h.f4534b;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return fArr;
        }
        return Arrays.copyOf(fArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int s(float[] fArr, int i10, int i11, int i12) {
        int i13 = this.h.f4534b * i10;
        double d = 1.0d;
        int i14 = 0;
        double d10 = 0.0d;
        int i15 = 255;
        int i16 = i11;
        while (i16 <= i12) {
            double d11 = 0.0d;
            for (int i17 = 0; i17 < i16; i17++) {
                d11 += Math.abs(fArr[i13 + i17] - fArr[(i13 + i16) + i17]);
            }
            int i18 = i13;
            double d12 = i16;
            if (i14 * d11 < d * d12) {
                i14 = i16;
                d = d11;
            }
            if (i15 * d11 > d12 * d10) {
                i15 = i16;
                d10 = d11;
            }
            i16++;
            i13 = i18;
        }
        this.e = d / i14;
        this.f4526f = d10 / i15;
        return i14;
    }
}
