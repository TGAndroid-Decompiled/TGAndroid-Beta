package cc;

import f2.q;
import f2.r;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
public final class e implements q {
    public int f6057a;
    public int f6058b;
    public int f6059c;
    public final Serializable d;
    public Serializable f6060e;
    public Object f6061f;
    public Serializable f6062g;
    public Object h;

    public e(byte[] bArr, String str, ArrayList arrayList, String str2, int i7, int i10, int i11) {
        this.d = str;
        this.f6061f = arrayList;
        this.f6060e = str2;
        this.f6057a = i10;
        this.f6058b = i7;
        this.f6059c = i11;
    }

    @Override
    public void a(int i7, ByteBuffer byteBuffer) {
        r rVar = (r) this.h;
        byteBuffer.asShortBuffer().get((short[]) this.f6060e, rVar.f10946j * rVar.f10940b, i7 / 2);
        byteBuffer.position(byteBuffer.position() + i7);
    }

    @Override
    public void b(int i7, ByteBuffer byteBuffer) {
        r rVar = (r) this.h;
        byteBuffer.asShortBuffer().put((short[]) this.f6061f, 0, rVar.f10940b * i7);
        byteBuffer.position((i7 * 2 * rVar.f10940b) + byteBuffer.position());
    }

    @Override
    public void c(int i7, int i10) {
        for (int i11 = 0; i11 < ((r) this.h).f10940b * i10; i11++) {
            ((short[]) this.f6060e)[i7 + i11] = 0;
        }
    }

    @Override
    public void d(int i7, int i10) {
        short[] sArr = (short[]) this.f6060e;
        r rVar = (r) this.h;
        int i11 = rVar.h / i10;
        int i12 = rVar.f10940b;
        int i13 = i10 * i12;
        int i14 = i7 * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 += sArr[(i15 * i13) + i14 + i17];
            }
            ((short[]) this.d)[i15] = (short) (i16 / i13);
        }
    }

    @Override
    public int e(int i7, int i10, int i11) {
        return s((short[]) this.f6060e, i7, i10, i11);
    }

    @Override
    public void f() {
        this.f6059c = this.f6057a;
    }

    @Override
    public void flush() {
        this.f6059c = 0;
        this.f6057a = 0;
        this.f6058b = 0;
    }

    @Override
    public Object g() {
        return (short[]) this.f6060e;
    }

    @Override
    public Object h() {
        return (short[]) this.f6061f;
    }

    @Override
    public void i(int i7) {
        this.f6061f = r((short[]) this.f6061f, ((r) this.h).f10947k, i7);
    }

    @Override
    public boolean j() {
        int i7 = this.f6057a;
        if (i7 == 0 || ((r) this.h).f10952p == 0 || this.f6058b > i7 * 3 || i7 * 2 <= this.f6059c * 3) {
            return false;
        }
        return true;
    }

    @Override
    public void k(long j3, int i7, long j10) {
        int i10 = 0;
        while (true) {
            r rVar = (r) this.h;
            int i11 = rVar.f10940b;
            if (i10 < i11) {
                short[] sArr = (short[]) this.f6062g;
                int i12 = (i7 * i11) + i10;
                short s5 = sArr[i12];
                short s9 = sArr[i12 + i11];
                int i13 = rVar.f10949m;
                long j11 = (i13 + 1) * j10;
                long j12 = j11 - (rVar.f10950n * j3);
                long j13 = j11 - (i13 * j10);
                ((short[]) this.f6061f)[(rVar.f10947k * i11) + i10] = (short) ((((j13 - j12) * s9) + (s5 * j12)) / j13);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public Object l() {
        return (short[]) this.f6062g;
    }

    @Override
    public void m(int i7, int i10, int i11, int i12, int i13) {
        short[] sArr = (short[]) this.f6061f;
        short[] sArr2 = (short[]) this.f6060e;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i7; i18++) {
                sArr[i15] = (short) (((sArr2[i16] * i18) + ((i7 - i18) * sArr2[i17])) / i7);
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    @Override
    public void n(int i7) {
        this.f6062g = r((short[]) this.f6062g, ((r) this.h).f10948l, i7);
    }

    @Override
    public int o() {
        return 2;
    }

    @Override
    public void p(int i7) {
        this.f6060e = r((short[]) this.f6060e, ((r) this.h).f10946j, i7);
    }

    @Override
    public int q(int i7, int i10) {
        return s((short[]) this.d, 0, i7, i10);
    }

    public short[] r(short[] sArr, int i7, int i10) {
        int length = sArr.length;
        int i11 = ((r) this.h).f10940b;
        int i12 = length / i11;
        if (i7 + i10 <= i12) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public int s(short[] sArr, int i7, int i10, int i11) {
        int i12 = i7 * ((r) this.h).f10940b;
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
        this.f6057a = i14 / i15;
        this.f6058b = i16 / i13;
        return i15;
    }

    public e(r rVar) {
        this.h = rVar;
        int i7 = rVar.h;
        this.d = new short[i7];
        int i10 = i7 * rVar.f10940b;
        this.f6060e = new short[i10];
        this.f6061f = new short[i10];
        this.f6062g = new short[i10];
    }
}
