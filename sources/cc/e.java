package cc;

import f2.p;
import f2.q;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
public final class e implements p {
    public int f4879a;
    public int f4880b;
    public int f4881c;
    public final Serializable d;
    public Serializable f4882e;
    public Object f4883f;
    public Serializable f4884g;
    public Object h;

    public e(byte[] bArr, String str, ArrayList arrayList, String str2, int i7, int i10, int i11) {
        this.d = str;
        this.f4883f = arrayList;
        this.f4882e = str2;
        this.f4879a = i10;
        this.f4880b = i7;
        this.f4881c = i11;
    }

    @Override
    public void a(int i7, ByteBuffer byteBuffer) {
        q qVar = (q) this.h;
        byteBuffer.asShortBuffer().get((short[]) this.f4882e, qVar.f10754j * qVar.f10748b, i7 / 2);
        byteBuffer.position(byteBuffer.position() + i7);
    }

    @Override
    public void b(int i7, ByteBuffer byteBuffer) {
        q qVar = (q) this.h;
        byteBuffer.asShortBuffer().put((short[]) this.f4883f, 0, qVar.f10748b * i7);
        byteBuffer.position((i7 * 2 * qVar.f10748b) + byteBuffer.position());
    }

    @Override
    public void c(int i7, int i10) {
        for (int i11 = 0; i11 < ((q) this.h).f10748b * i10; i11++) {
            ((short[]) this.f4882e)[i7 + i11] = 0;
        }
    }

    @Override
    public void d(int i7, int i10) {
        short[] sArr = (short[]) this.f4882e;
        q qVar = (q) this.h;
        int i11 = qVar.h / i10;
        int i12 = qVar.f10748b;
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
        return s((short[]) this.f4882e, i7, i10, i11);
    }

    @Override
    public void f() {
        this.f4881c = this.f4879a;
    }

    @Override
    public void flush() {
        this.f4881c = 0;
        this.f4879a = 0;
        this.f4880b = 0;
    }

    @Override
    public Object g() {
        return (short[]) this.f4882e;
    }

    @Override
    public Object h() {
        return (short[]) this.f4883f;
    }

    @Override
    public void i(int i7) {
        this.f4883f = r((short[]) this.f4883f, ((q) this.h).f10755k, i7);
    }

    @Override
    public boolean j() {
        int i7 = this.f4879a;
        if (i7 == 0 || ((q) this.h).f10760p == 0 || this.f4880b > i7 * 3 || i7 * 2 <= this.f4881c * 3) {
            return false;
        }
        return true;
    }

    @Override
    public void k(long j3, int i7, long j10) {
        int i10 = 0;
        while (true) {
            q qVar = (q) this.h;
            int i11 = qVar.f10748b;
            if (i10 < i11) {
                short[] sArr = (short[]) this.f4884g;
                int i12 = (i7 * i11) + i10;
                short s5 = sArr[i12];
                short s9 = sArr[i12 + i11];
                int i13 = qVar.f10757m;
                long j11 = (i13 + 1) * j10;
                long j12 = j11 - (qVar.f10758n * j3);
                long j13 = j11 - (i13 * j10);
                ((short[]) this.f4883f)[(qVar.f10755k * i11) + i10] = (short) ((((j13 - j12) * s9) + (s5 * j12)) / j13);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public Object l() {
        return (short[]) this.f4884g;
    }

    @Override
    public void m(int i7, int i10, int i11, int i12, int i13) {
        short[] sArr = (short[]) this.f4883f;
        short[] sArr2 = (short[]) this.f4882e;
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
        this.f4884g = r((short[]) this.f4884g, ((q) this.h).f10756l, i7);
    }

    @Override
    public int o() {
        return 2;
    }

    @Override
    public void p(int i7) {
        this.f4882e = r((short[]) this.f4882e, ((q) this.h).f10754j, i7);
    }

    @Override
    public int q(int i7, int i10) {
        return s((short[]) this.d, 0, i7, i10);
    }

    public short[] r(short[] sArr, int i7, int i10) {
        int length = sArr.length;
        int i11 = ((q) this.h).f10748b;
        int i12 = length / i11;
        if (i7 + i10 <= i12) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public int s(short[] sArr, int i7, int i10, int i11) {
        int i12 = i7 * ((q) this.h).f10748b;
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
        this.f4879a = i14 / i15;
        this.f4880b = i16 / i13;
        return i15;
    }

    public e(q qVar) {
        this.h = qVar;
        int i7 = qVar.h;
        this.d = new short[i7];
        int i10 = i7 * qVar.f10748b;
        this.f4882e = new short[i10];
        this.f4883f = new short[i10];
        this.f4884g = new short[i10];
    }
}
