package defpackage;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;
public final class jma implements kma {
    public final float[] a;
    public float[] b;
    public float[] c;
    public float[] d;
    public double e;
    public double f;
    public double g;
    public final mma h;

    public jma(mma mmaVar) {
        this.h = mmaVar;
        int i = mmaVar.h;
        this.a = new float[i];
        int i2 = i * mmaVar.b;
        this.b = new float[i2];
        this.c = new float[i2];
        this.d = new float[i2];
    }

    @Override
    public final void a(int i, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.b;
        mma mmaVar = this.h;
        asFloatBuffer.get(fArr, mmaVar.j * mmaVar.b, i / 4);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override
    public final void b(int i, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.c;
        int i2 = this.h.b;
        asFloatBuffer.put(fArr, 0, i * i2);
        byteBuffer.position(((i << 2) * i2) + byteBuffer.position());
    }

    @Override
    public final void c(int i, int i2) {
        for (int i3 = 0; i3 < this.h.b * i2; i3++) {
            this.b[i + i3] = 0.0f;
        }
    }

    @Override
    public final void d(int i, int i2) {
        mma mmaVar = this.h;
        int i3 = mmaVar.h / i2;
        int i4 = mmaVar.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            double d = 0.0d;
            for (int i8 = 0; i8 < i5; i8++) {
                d += this.b[(i7 * i5) + i6 + i8];
            }
            this.a[i7] = (float) (d / i5);
        }
    }

    @Override
    public final int e(int i, int i2, int i3) {
        return s(i, i2, i3, this.b);
    }

    @Override
    public final void f() {
        this.g = this.e;
    }

    @Override
    public final void flush() {
        this.g = 0.0d;
        this.e = 0.0d;
        this.f = 0.0d;
    }

    @Override
    public final Object g() {
        return this.b;
    }

    @Override
    public final Object h() {
        return this.c;
    }

    @Override
    public final void i(int i) {
        this.c = r(this.h.k, i, this.c);
    }

    @Override
    public final boolean j() {
        double d = this.e;
        if (d != 0.0d && this.h.p != 0 && this.f <= d * 3.0d && d * 2.0d > this.g * 3.0d) {
            return true;
        }
        return false;
    }

    @Override
    public final void k(long j, int i, long j2) {
        int i2 = 0;
        while (true) {
            mma mmaVar = this.h;
            int i3 = mmaVar.b;
            if (i2 < i3) {
                float[] fArr = this.d;
                int i4 = (i * i3) + i2;
                float f = fArr[i4];
                float f2 = fArr[i4 + i3];
                int i5 = mmaVar.m;
                long j3 = (i5 + 1) * j2;
                long j4 = j3 - (mmaVar.n * j);
                long j5 = j3 - (i5 * j2);
                this.c[(mmaVar.k * i3) + i2] = ((((float) (j5 - j4)) * f2) + (((float) j4) * f)) / ((float) j5);
                i2++;
            } else {
                return;
            }
        }
    }

    @Override
    public final Object l() {
        return this.d;
    }

    @Override
    public final void m(int i, int i2, int i3, int i4, int i5) {
        float[] fArr = this.c;
        float[] fArr2 = this.b;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                fArr[i7] = ((fArr2[i8] * i10) + (fArr2[i9] * (i - i10))) / i;
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    @Override
    public final void n(int i) {
        this.d = r(this.h.l, i, this.d);
    }

    @Override
    public final int o() {
        return 4;
    }

    @Override
    public final void p(int i) {
        this.b = r(this.h.j, i, this.b);
    }

    @Override
    public final int q(int i, int i2) {
        return s(0, i, i2, this.a);
    }

    public final float[] r(int i, int i2, float[] fArr) {
        int length = fArr.length;
        int i3 = this.h.b;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return fArr;
        }
        return Arrays.copyOf(fArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int s(int i, int i2, int i3, float[] fArr) {
        int i4 = this.h.b * i;
        double d = 1.0d;
        int i5 = 0;
        double d2 = 0.0d;
        int i6 = 255;
        int i7 = i2;
        while (i7 <= i3) {
            double d3 = 0.0d;
            for (int i8 = 0; i8 < i7; i8++) {
                d3 += Math.abs(fArr[i4 + i8] - fArr[(i4 + i7) + i8]);
            }
            int i9 = i4;
            double d4 = i7;
            if (i5 * d3 < d * d4) {
                i5 = i7;
                d = d3;
            }
            if (i6 * d3 > d4 * d2) {
                i6 = i7;
                d2 = d3;
            }
            i7++;
            i4 = i9;
        }
        this.e = d / i5;
        this.f = d2 / i6;
        return i5;
    }
}
