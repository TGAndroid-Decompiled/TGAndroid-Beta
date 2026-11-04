package e2;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;
public final class o implements p {
    public final float[] f9364a;
    public float[] f9365b;
    public float[] f9366c;
    public float[] d;
    public double f9367e;
    public double f9368f;
    public double f9369g;
    public final r h;

    public o(r rVar) {
        this.h = rVar;
        int i3 = rVar.h;
        this.f9364a = new float[i3];
        int i10 = i3 * rVar.f9377b;
        this.f9365b = new float[i10];
        this.f9366c = new float[i10];
        this.d = new float[i10];
    }

    @Override
    public final void a(int i3, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.f9365b;
        r rVar = this.h;
        asFloatBuffer.get(fArr, rVar.f9383j * rVar.f9377b, i3 / 4);
        byteBuffer.position(byteBuffer.position() + i3);
    }

    @Override
    public final void b(int i3, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.f9366c;
        r rVar = this.h;
        asFloatBuffer.put(fArr, 0, rVar.f9377b * i3);
        byteBuffer.position((i3 * 4 * rVar.f9377b) + byteBuffer.position());
    }

    @Override
    public final void c(int i3, int i10) {
        for (int i11 = 0; i11 < this.h.f9377b * i10; i11++) {
            this.f9365b[i3 + i11] = 0.0f;
        }
    }

    @Override
    public final void d(int i3, int i10) {
        r rVar = this.h;
        int i11 = rVar.h / i10;
        int i12 = rVar.f9377b;
        int i13 = i10 * i12;
        int i14 = i3 * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            double d = 0.0d;
            for (int i16 = 0; i16 < i13; i16++) {
                d += this.f9365b[(i15 * i13) + i14 + i16];
            }
            this.f9364a[i15] = (float) (d / i13);
        }
    }

    @Override
    public final int e(int i3, int i10, int i11) {
        return s(i3, i10, i11, this.f9365b);
    }

    @Override
    public final void f() {
        this.f9369g = this.f9367e;
    }

    @Override
    public final void flush() {
        this.f9369g = 0.0d;
        this.f9367e = 0.0d;
        this.f9368f = 0.0d;
    }

    @Override
    public final Object g() {
        return this.f9365b;
    }

    @Override
    public final Object h() {
        return this.f9366c;
    }

    @Override
    public final void i(int i3) {
        this.f9366c = r(this.h.f9384k, i3, this.f9366c);
    }

    @Override
    public final boolean j() {
        double d = this.f9367e;
        if (d == 0.0d || this.h.f9389p == 0 || this.f9368f > d * 3.0d || d * 2.0d <= this.f9369g * 3.0d) {
            return false;
        }
        return true;
    }

    @Override
    public final void k(long j10, int i3, long j11) {
        int i10 = 0;
        while (true) {
            r rVar = this.h;
            int i11 = rVar.f9377b;
            if (i10 < i11) {
                float[] fArr = this.d;
                int i12 = (i3 * i11) + i10;
                float f10 = fArr[i12];
                float f11 = fArr[i12 + i11];
                int i13 = rVar.f9386m;
                long j12 = (i13 + 1) * j11;
                long j13 = j12 - (rVar.f9387n * j10);
                long j14 = j12 - (i13 * j11);
                this.f9366c[(rVar.f9384k * i11) + i10] = ((((float) (j14 - j13)) * f11) + (((float) j13) * f10)) / ((float) j14);
                i10++;
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
    public final void m(int i3, int i10, int i11, int i12, int i13) {
        float[] fArr = this.f9366c;
        float[] fArr2 = this.f9365b;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i3; i18++) {
                fArr[i15] = ((fArr2[i16] * i18) + (fArr2[i17] * (i3 - i18))) / i3;
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    @Override
    public final void n(int i3) {
        this.d = r(this.h.f9385l, i3, this.d);
    }

    @Override
    public final int o() {
        return 4;
    }

    @Override
    public final void p(int i3) {
        this.f9365b = r(this.h.f9383j, i3, this.f9365b);
    }

    @Override
    public final int q(int i3, int i10) {
        return s(0, i3, i10, this.f9364a);
    }

    public final float[] r(int i3, int i10, float[] fArr) {
        int length = fArr.length;
        int i11 = this.h.f9377b;
        int i12 = length / i11;
        if (i3 + i10 <= i12) {
            return fArr;
        }
        return Arrays.copyOf(fArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public final int s(int i3, int i10, int i11, float[] fArr) {
        int i12 = this.h.f9377b * i3;
        double d = 1.0d;
        int i13 = 0;
        double d10 = 0.0d;
        int i14 = 255;
        int i15 = i10;
        while (i15 <= i11) {
            double d11 = 0.0d;
            for (int i16 = 0; i16 < i15; i16++) {
                d11 += Math.abs(fArr[i12 + i16] - fArr[(i12 + i15) + i16]);
            }
            int i17 = i12;
            double d12 = i15;
            if (i13 * d11 < d * d12) {
                i13 = i15;
                d = d11;
            }
            if (i14 * d11 > d12 * d10) {
                i14 = i15;
                d10 = d11;
            }
            i15++;
            i12 = i17;
        }
        this.f9367e = d / i13;
        this.f9368f = d10 / i14;
        return i13;
    }
}
