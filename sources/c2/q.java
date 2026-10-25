package c2;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;
public final class q implements r {
    public final float[] f5964a;
    public float[] f5965b;
    public float[] f5966c;
    public float[] d;
    public double e;
    public double f5967f;
    public double f5968g;
    public final t h;

    public q(t tVar) {
        this.h = tVar;
        int i10 = tVar.h;
        this.f5964a = new float[i10];
        int i11 = i10 * tVar.f5975b;
        this.f5965b = new float[i11];
        this.f5966c = new float[i11];
        this.d = new float[i11];
    }

    @Override
    public final void a(int i10, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.f5965b;
        t tVar = this.h;
        asFloatBuffer.get(fArr, tVar.f5980j * tVar.f5975b, i10 / 4);
        byteBuffer.position(byteBuffer.position() + i10);
    }

    @Override
    public final void b(int i10, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.f5966c;
        t tVar = this.h;
        asFloatBuffer.put(fArr, 0, tVar.f5975b * i10);
        byteBuffer.position((i10 * 4 * tVar.f5975b) + byteBuffer.position());
    }

    @Override
    public final void c(int i10, long j10, long j11) {
        int i11 = 0;
        while (true) {
            t tVar = this.h;
            int i12 = tVar.f5975b;
            if (i11 < i12) {
                float[] fArr = this.d;
                int i13 = (i10 * i12) + i11;
                float f7 = fArr[i13];
                float f10 = fArr[i13 + i12];
                int i14 = tVar.f5983m;
                long j12 = (i14 + 1) * j11;
                long j13 = j12 - (tVar.f5984n * j10);
                long j14 = j12 - (i14 * j11);
                this.f5966c[(tVar.f5981k * i12) + i11] = ((((float) (j14 - j13)) * f10) + (((float) j13) * f7)) / ((float) j14);
                i11++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(int i10, int i11) {
        for (int i12 = 0; i12 < this.h.f5975b * i11; i12++) {
            this.f5965b[i10 + i12] = 0.0f;
        }
    }

    @Override
    public final void e(int i10, int i11) {
        t tVar = this.h;
        int i12 = tVar.h / i11;
        int i13 = tVar.f5975b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            double d = 0.0d;
            for (int i17 = 0; i17 < i14; i17++) {
                d += this.f5965b[(i16 * i14) + i15 + i17];
            }
            this.f5964a[i16] = (float) (d / i14);
        }
    }

    @Override
    public final int f(int i10, int i11, int i12) {
        return s(this.f5965b, i10, i11, i12);
    }

    @Override
    public final void flush() {
        this.f5968g = 0.0d;
        this.e = 0.0d;
        this.f5967f = 0.0d;
    }

    @Override
    public final void g() {
        this.f5968g = this.e;
    }

    @Override
    public final Object h() {
        return this.f5965b;
    }

    @Override
    public final Object i() {
        return this.f5966c;
    }

    @Override
    public final void j(int i10) {
        this.f5966c = r(this.f5966c, this.h.f5981k, i10);
    }

    @Override
    public final boolean k() {
        double d = this.e;
        if (d == 0.0d || this.h.f5986p == 0 || this.f5967f > d * 3.0d || d * 2.0d <= this.f5968g * 3.0d) {
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
        float[] fArr = this.f5966c;
        float[] fArr2 = this.f5965b;
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
        this.d = r(this.d, this.h.f5982l, i10);
    }

    @Override
    public final int o() {
        return 4;
    }

    @Override
    public final void p(int i10) {
        this.f5965b = r(this.f5965b, this.h.f5980j, i10);
    }

    @Override
    public final int q(int i10, int i11) {
        return s(this.f5964a, 0, i10, i11);
    }

    public final float[] r(float[] fArr, int i10, int i11) {
        int length = fArr.length;
        int i12 = this.h.f5975b;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return fArr;
        }
        return Arrays.copyOf(fArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int s(float[] fArr, int i10, int i11, int i12) {
        int i13 = this.h.f5975b * i10;
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
        this.f5967f = d10 / i15;
        return i14;
    }
}
