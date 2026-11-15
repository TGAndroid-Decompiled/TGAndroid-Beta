package f2;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;
public final class o implements p {
    public final float[] f10741a;
    public float[] f10742b;
    public float[] f10743c;
    public float[] d;
    public double f10744e;
    public double f10745f;
    public double f10746g;
    public final q h;

    public o(q qVar) {
        this.h = qVar;
        int i7 = qVar.h;
        this.f10741a = new float[i7];
        int i10 = i7 * qVar.f10748b;
        this.f10742b = new float[i10];
        this.f10743c = new float[i10];
        this.d = new float[i10];
    }

    @Override
    public final void a(int i7, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.f10742b;
        q qVar = this.h;
        asFloatBuffer.get(fArr, qVar.f10754j * qVar.f10748b, i7 / 4);
        byteBuffer.position(byteBuffer.position() + i7);
    }

    @Override
    public final void b(int i7, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.f10743c;
        q qVar = this.h;
        asFloatBuffer.put(fArr, 0, qVar.f10748b * i7);
        byteBuffer.position((i7 * 4 * qVar.f10748b) + byteBuffer.position());
    }

    @Override
    public final void c(int i7, int i10) {
        for (int i11 = 0; i11 < this.h.f10748b * i10; i11++) {
            this.f10742b[i7 + i11] = 0.0f;
        }
    }

    @Override
    public final void d(int i7, int i10) {
        q qVar = this.h;
        int i11 = qVar.h / i10;
        int i12 = qVar.f10748b;
        int i13 = i10 * i12;
        int i14 = i7 * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            double d = 0.0d;
            for (int i16 = 0; i16 < i13; i16++) {
                d += this.f10742b[(i15 * i13) + i14 + i16];
            }
            this.f10741a[i15] = (float) (d / i13);
        }
    }

    @Override
    public final int e(int i7, int i10, int i11) {
        return s(i7, i10, i11, this.f10742b);
    }

    @Override
    public final void f() {
        this.f10746g = this.f10744e;
    }

    @Override
    public final void flush() {
        this.f10746g = 0.0d;
        this.f10744e = 0.0d;
        this.f10745f = 0.0d;
    }

    @Override
    public final Object g() {
        return this.f10742b;
    }

    @Override
    public final Object h() {
        return this.f10743c;
    }

    @Override
    public final void i(int i7) {
        this.f10743c = r(this.h.f10755k, i7, this.f10743c);
    }

    @Override
    public final boolean j() {
        double d = this.f10744e;
        if (d == 0.0d || this.h.f10760p == 0 || this.f10745f > d * 3.0d || d * 2.0d <= this.f10746g * 3.0d) {
            return false;
        }
        return true;
    }

    @Override
    public final void k(long j3, int i7, long j10) {
        int i10 = 0;
        while (true) {
            q qVar = this.h;
            int i11 = qVar.f10748b;
            if (i10 < i11) {
                float[] fArr = this.d;
                int i12 = (i7 * i11) + i10;
                float f10 = fArr[i12];
                float f11 = fArr[i12 + i11];
                int i13 = qVar.f10757m;
                long j11 = (i13 + 1) * j10;
                long j12 = j11 - (qVar.f10758n * j3);
                long j13 = j11 - (i13 * j10);
                this.f10743c[(qVar.f10755k * i11) + i10] = ((((float) (j13 - j12)) * f11) + (((float) j12) * f10)) / ((float) j13);
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
    public final void m(int i7, int i10, int i11, int i12, int i13) {
        float[] fArr = this.f10743c;
        float[] fArr2 = this.f10742b;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i7; i18++) {
                fArr[i15] = ((fArr2[i16] * i18) + (fArr2[i17] * (i7 - i18))) / i7;
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    @Override
    public final void n(int i7) {
        this.d = r(this.h.f10756l, i7, this.d);
    }

    @Override
    public final int o() {
        return 4;
    }

    @Override
    public final void p(int i7) {
        this.f10742b = r(this.h.f10754j, i7, this.f10742b);
    }

    @Override
    public final int q(int i7, int i10) {
        return s(0, i7, i10, this.f10741a);
    }

    public final float[] r(int i7, int i10, float[] fArr) {
        int length = fArr.length;
        int i11 = this.h.f10748b;
        int i12 = length / i11;
        if (i7 + i10 <= i12) {
            return fArr;
        }
        return Arrays.copyOf(fArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public final int s(int i7, int i10, int i11, float[] fArr) {
        int i12 = this.h.f10748b * i7;
        double d = 1.0d;
        int i13 = 0;
        double d2 = 0.0d;
        int i14 = 255;
        int i15 = i10;
        while (i15 <= i11) {
            double d10 = 0.0d;
            for (int i16 = 0; i16 < i15; i16++) {
                d10 += Math.abs(fArr[i12 + i16] - fArr[(i12 + i15) + i16]);
            }
            int i17 = i12;
            double d11 = i15;
            if (i13 * d10 < d * d11) {
                i13 = i15;
                d = d10;
            }
            if (i14 * d10 > d11 * d2) {
                i14 = i15;
                d2 = d10;
            }
            i15++;
            i12 = i17;
        }
        this.f10744e = d / i13;
        this.f10745f = d2 / i14;
        return i13;
    }
}
