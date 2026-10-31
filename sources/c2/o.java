package c2;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;
public final class o implements p {
    public final float[] f3557a;
    public float[] f3558b;
    public float[] f3559c;
    public float[] d;
    public double e;
    public double f3560f;
    public double f3561g;
    public final r h;

    public o(r rVar) {
        this.h = rVar;
        int i10 = rVar.h;
        this.f3557a = new float[i10];
        int i11 = i10 * rVar.f3568b;
        this.f3558b = new float[i11];
        this.f3559c = new float[i11];
        this.d = new float[i11];
    }

    @Override
    public final void a(int i10, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.f3558b;
        r rVar = this.h;
        asFloatBuffer.get(fArr, rVar.f3573j * rVar.f3568b, i10 / 4);
        byteBuffer.position(byteBuffer.position() + i10);
    }

    @Override
    public final void b(int i10, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.f3559c;
        r rVar = this.h;
        asFloatBuffer.put(fArr, 0, rVar.f3568b * i10);
        byteBuffer.position((i10 * 4 * rVar.f3568b) + byteBuffer.position());
    }

    @Override
    public final void c(int i10, int i11) {
        for (int i12 = 0; i12 < this.h.f3568b * i11; i12++) {
            this.f3558b[i10 + i12] = 0.0f;
        }
    }

    @Override
    public final void d(int i10, int i11) {
        r rVar = this.h;
        int i12 = rVar.h / i11;
        int i13 = rVar.f3568b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            double d = 0.0d;
            for (int i17 = 0; i17 < i14; i17++) {
                d += this.f3558b[(i16 * i14) + i15 + i17];
            }
            this.f3557a[i16] = (float) (d / i14);
        }
    }

    @Override
    public final int e(int i10, int i11, int i12) {
        return s(i10, i11, i12, this.f3558b);
    }

    @Override
    public final void f() {
        this.f3561g = this.e;
    }

    @Override
    public final void flush() {
        this.f3561g = 0.0d;
        this.e = 0.0d;
        this.f3560f = 0.0d;
    }

    @Override
    public final Object g() {
        return this.f3558b;
    }

    @Override
    public final Object h() {
        return this.f3559c;
    }

    @Override
    public final void i(int i10) {
        this.f3559c = r(this.h.f3574k, i10, this.f3559c);
    }

    @Override
    public final boolean j() {
        double d = this.e;
        if (d == 0.0d || this.h.f3579p == 0 || this.f3560f > d * 3.0d || d * 2.0d <= this.f3561g * 3.0d) {
            return false;
        }
        return true;
    }

    @Override
    public final void k(long j10, int i10, long j11) {
        int i11 = 0;
        while (true) {
            r rVar = this.h;
            int i12 = rVar.f3568b;
            if (i11 < i12) {
                float[] fArr = this.d;
                int i13 = (i10 * i12) + i11;
                float f7 = fArr[i13];
                float f10 = fArr[i13 + i12];
                int i14 = rVar.f3576m;
                long j12 = (i14 + 1) * j11;
                long j13 = j12 - (rVar.f3577n * j10);
                long j14 = j12 - (i14 * j11);
                this.f3559c[(rVar.f3574k * i12) + i11] = ((((float) (j14 - j13)) * f10) + (((float) j13) * f7)) / ((float) j14);
                i11++;
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
    public final void m(int i10, int i11, int i12, int i13, int i14) {
        float[] fArr = this.f3559c;
        float[] fArr2 = this.f3558b;
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
        this.d = r(this.h.f3575l, i10, this.d);
    }

    @Override
    public final int o() {
        return 4;
    }

    @Override
    public final void p(int i10) {
        this.f3558b = r(this.h.f3573j, i10, this.f3558b);
    }

    @Override
    public final int q(int i10, int i11) {
        return s(0, i10, i11, this.f3557a);
    }

    public final float[] r(int i10, int i11, float[] fArr) {
        int length = fArr.length;
        int i12 = this.h.f3568b;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return fArr;
        }
        return Arrays.copyOf(fArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int s(int i10, int i11, int i12, float[] fArr) {
        int i13 = this.h.f3568b * i10;
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
        this.f3560f = d10 / i15;
        return i14;
    }
}
