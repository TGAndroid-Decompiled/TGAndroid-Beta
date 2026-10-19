package c2;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
public final class r implements q {
    public int f4528a;
    public int f4529b;
    public int f4530c;
    public final Serializable d;
    public Object e;
    public Serializable f4531f;
    public Serializable f4532g;
    public Object h;

    public r(byte[] bArr, String str, ArrayList arrayList, String str2, int i10, int i11, int i12) {
        this.d = str;
        this.e = arrayList;
        this.f4531f = str2;
        this.f4528a = i11;
        this.f4529b = i10;
        this.f4530c = i12;
    }

    @Override
    public void a(int i10, ByteBuffer byteBuffer) {
        s sVar = (s) this.h;
        byteBuffer.asShortBuffer().get((short[]) this.e, sVar.f4539j * sVar.f4534b, i10 / 2);
        byteBuffer.position(byteBuffer.position() + i10);
    }

    @Override
    public void b(int i10, ByteBuffer byteBuffer) {
        s sVar = (s) this.h;
        byteBuffer.asShortBuffer().put((short[]) this.f4531f, 0, sVar.f4534b * i10);
        byteBuffer.position((i10 * 2 * sVar.f4534b) + byteBuffer.position());
    }

    @Override
    public void c(int i10, long j10, long j11) {
        int i11 = 0;
        while (true) {
            s sVar = (s) this.h;
            int i12 = sVar.f4534b;
            if (i11 < i12) {
                short[] sArr = (short[]) this.f4532g;
                int i13 = (i10 * i12) + i11;
                short s10 = sArr[i13];
                short s11 = sArr[i13 + i12];
                int i14 = sVar.f4542m;
                long j12 = (i14 + 1) * j11;
                long j13 = j12 - (sVar.f4543n * j10);
                long j14 = j12 - (i14 * j11);
                ((short[]) this.f4531f)[(sVar.f4540k * i12) + i11] = (short) ((((j14 - j13) * s11) + (s10 * j13)) / j14);
                i11++;
            } else {
                return;
            }
        }
    }

    @Override
    public void d(int i10, int i11) {
        for (int i12 = 0; i12 < ((s) this.h).f4534b * i11; i12++) {
            ((short[]) this.e)[i10 + i12] = 0;
        }
    }

    @Override
    public void e(int i10, int i11) {
        short[] sArr = (short[]) this.e;
        s sVar = (s) this.h;
        int i12 = sVar.h / i11;
        int i13 = sVar.f4534b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            ((short[]) this.d)[i16] = (short) (i17 / i14);
        }
    }

    @Override
    public int f(int i10, int i11, int i12) {
        return s((short[]) this.e, i10, i11, i12);
    }

    @Override
    public void flush() {
        this.f4530c = 0;
        this.f4528a = 0;
        this.f4529b = 0;
    }

    @Override
    public void g() {
        this.f4530c = this.f4528a;
    }

    @Override
    public Object h() {
        return (short[]) this.e;
    }

    @Override
    public Object i() {
        return (short[]) this.f4531f;
    }

    @Override
    public void j(int i10) {
        this.f4531f = r((short[]) this.f4531f, ((s) this.h).f4540k, i10);
    }

    @Override
    public boolean k() {
        int i10 = this.f4528a;
        if (i10 == 0 || ((s) this.h).f4545p == 0 || this.f4529b > i10 * 3 || i10 * 2 <= this.f4530c * 3) {
            return false;
        }
        return true;
    }

    @Override
    public Object l() {
        return (short[]) this.f4532g;
    }

    @Override
    public void m(int i10, int i11, int i12, int i13, int i14) {
        short[] sArr = (short[]) this.f4531f;
        short[] sArr2 = (short[]) this.e;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    @Override
    public void n(int i10) {
        this.f4532g = r((short[]) this.f4532g, ((s) this.h).f4541l, i10);
    }

    @Override
    public int o() {
        return 2;
    }

    @Override
    public void p(int i10) {
        this.e = r((short[]) this.e, ((s) this.h).f4539j, i10);
    }

    @Override
    public int q(int i10, int i11) {
        return s((short[]) this.d, 0, i10, i11);
    }

    public short[] r(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = ((s) this.h).f4534b;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public int s(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * ((s) this.h).f4534b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i15 * i11) {
                i16 = i11;
                i15 = i18;
            }
            if (i18 * i14 > i17 * i11) {
                i14 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f4528a = i15 / i16;
        this.f4529b = i17 / i14;
        return i16;
    }

    public r(s sVar) {
        this.h = sVar;
        int i10 = sVar.h;
        this.d = new short[i10];
        int i11 = i10 * sVar.f4534b;
        this.e = new short[i11];
        this.f4531f = new short[i11];
        this.f4532g = new short[i11];
    }
}
