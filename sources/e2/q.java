package e2;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
public final class q implements p {
    public int f9370a;
    public int f9371b;
    public int f9372c;
    public final Serializable d;
    public Object f9373e;
    public Serializable f9374f;
    public Serializable f9375g;
    public Object h;

    public q(byte[] bArr, String str, ArrayList arrayList, String str2, int i3, int i10, int i11) {
        this.d = str;
        this.f9373e = arrayList;
        this.f9374f = str2;
        this.f9370a = i10;
        this.f9371b = i3;
        this.f9372c = i11;
    }

    @Override
    public void a(int i3, ByteBuffer byteBuffer) {
        r rVar = (r) this.h;
        byteBuffer.asShortBuffer().get((short[]) this.f9373e, rVar.f9383j * rVar.f9377b, i3 / 2);
        byteBuffer.position(byteBuffer.position() + i3);
    }

    @Override
    public void b(int i3, ByteBuffer byteBuffer) {
        r rVar = (r) this.h;
        byteBuffer.asShortBuffer().put((short[]) this.f9374f, 0, rVar.f9377b * i3);
        byteBuffer.position((i3 * 2 * rVar.f9377b) + byteBuffer.position());
    }

    @Override
    public void c(int i3, int i10) {
        for (int i11 = 0; i11 < ((r) this.h).f9377b * i10; i11++) {
            ((short[]) this.f9373e)[i3 + i11] = 0;
        }
    }

    @Override
    public void d(int i3, int i10) {
        short[] sArr = (short[]) this.f9373e;
        r rVar = (r) this.h;
        int i11 = rVar.h / i10;
        int i12 = rVar.f9377b;
        int i13 = i10 * i12;
        int i14 = i3 * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 += sArr[(i15 * i13) + i14 + i17];
            }
            ((short[]) this.d)[i15] = (short) (i16 / i13);
        }
    }

    @Override
    public int e(int i3, int i10, int i11) {
        return s((short[]) this.f9373e, i3, i10, i11);
    }

    @Override
    public void f() {
        this.f9372c = this.f9370a;
    }

    @Override
    public void flush() {
        this.f9372c = 0;
        this.f9370a = 0;
        this.f9371b = 0;
    }

    @Override
    public Object g() {
        return (short[]) this.f9373e;
    }

    @Override
    public Object h() {
        return (short[]) this.f9374f;
    }

    @Override
    public void i(int i3) {
        this.f9374f = r((short[]) this.f9374f, ((r) this.h).f9384k, i3);
    }

    @Override
    public boolean j() {
        int i3 = this.f9370a;
        if (i3 == 0 || ((r) this.h).f9389p == 0 || this.f9371b > i3 * 3 || i3 * 2 <= this.f9372c * 3) {
            return false;
        }
        return true;
    }

    @Override
    public void k(long j10, int i3, long j11) {
        int i10 = 0;
        while (true) {
            r rVar = (r) this.h;
            int i11 = rVar.f9377b;
            if (i10 < i11) {
                short[] sArr = (short[]) this.f9375g;
                int i12 = (i3 * i11) + i10;
                short s6 = sArr[i12];
                short s10 = sArr[i12 + i11];
                int i13 = rVar.f9386m;
                long j12 = (i13 + 1) * j11;
                long j13 = j12 - (rVar.f9387n * j10);
                long j14 = j12 - (i13 * j11);
                ((short[]) this.f9374f)[(rVar.f9384k * i11) + i10] = (short) ((((j14 - j13) * s10) + (s6 * j13)) / j14);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public Object l() {
        return (short[]) this.f9375g;
    }

    @Override
    public void m(int i3, int i10, int i11, int i12, int i13) {
        short[] sArr = (short[]) this.f9374f;
        short[] sArr2 = (short[]) this.f9373e;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i3; i18++) {
                sArr[i15] = (short) (((sArr2[i16] * i18) + ((i3 - i18) * sArr2[i17])) / i3);
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    @Override
    public void n(int i3) {
        this.f9375g = r((short[]) this.f9375g, ((r) this.h).f9385l, i3);
    }

    @Override
    public int o() {
        return 2;
    }

    @Override
    public void p(int i3) {
        this.f9373e = r((short[]) this.f9373e, ((r) this.h).f9383j, i3);
    }

    @Override
    public int q(int i3, int i10) {
        return s((short[]) this.d, 0, i3, i10);
    }

    public short[] r(short[] sArr, int i3, int i10) {
        int length = sArr.length;
        int i11 = ((r) this.h).f9377b;
        int i12 = length / i11;
        if (i3 + i10 <= i12) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public int s(short[] sArr, int i3, int i10, int i11) {
        int i12 = i3 * ((r) this.h).f9377b;
        int i13 = 255;
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        while (i10 <= i11) {
            int i17 = 0;
            for (int i18 = 0; i18 < i10; i18++) {
                i17 += Math.abs(sArr[i12 + i18] - sArr[(i12 + i10) + i18]);
            }
            if (i17 * i15 < i14 * i10) {
                i15 = i10;
                i14 = i17;
            }
            if (i17 * i13 > i16 * i10) {
                i13 = i10;
                i16 = i17;
            }
            i10++;
        }
        this.f9370a = i14 / i15;
        this.f9371b = i16 / i13;
        return i15;
    }

    public q(r rVar) {
        this.h = rVar;
        int i3 = rVar.h;
        this.d = new short[i3];
        int i10 = i3 * rVar.f9377b;
        this.f9373e = new short[i10];
        this.f9374f = new short[i10];
        this.f9375g = new short[i10];
    }
}
