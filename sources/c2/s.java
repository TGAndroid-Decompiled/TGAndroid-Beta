package c2;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
public final class s implements r {
    public int f5969a;
    public int f5970b;
    public int f5971c;
    public final Serializable d;
    public Object e;
    public Serializable f5972f;
    public Serializable f5973g;
    public Object h;

    public s(byte[] bArr, String str, ArrayList arrayList, String str2, int i10, int i11, int i12) {
        this.d = str;
        this.e = arrayList;
        this.f5972f = str2;
        this.f5969a = i11;
        this.f5970b = i10;
        this.f5971c = i12;
    }

    @Override
    public void a(int i10, ByteBuffer byteBuffer) {
        t tVar = (t) this.h;
        byteBuffer.asShortBuffer().get((short[]) this.e, tVar.f5980j * tVar.f5975b, i10 / 2);
        byteBuffer.position(byteBuffer.position() + i10);
    }

    @Override
    public void b(int i10, ByteBuffer byteBuffer) {
        t tVar = (t) this.h;
        byteBuffer.asShortBuffer().put((short[]) this.f5972f, 0, tVar.f5975b * i10);
        byteBuffer.position((i10 * 2 * tVar.f5975b) + byteBuffer.position());
    }

    @Override
    public void c(int i10, long j10, long j11) {
        int i11 = 0;
        while (true) {
            t tVar = (t) this.h;
            int i12 = tVar.f5975b;
            if (i11 < i12) {
                short[] sArr = (short[]) this.f5973g;
                int i13 = (i10 * i12) + i11;
                short s10 = sArr[i13];
                short s11 = sArr[i13 + i12];
                int i14 = tVar.f5983m;
                long j12 = (i14 + 1) * j11;
                long j13 = j12 - (tVar.f5984n * j10);
                long j14 = j12 - (i14 * j11);
                ((short[]) this.f5972f)[(tVar.f5981k * i12) + i11] = (short) ((((j14 - j13) * s11) + (s10 * j13)) / j14);
                i11++;
            } else {
                return;
            }
        }
    }

    @Override
    public void d(int i10, int i11) {
        for (int i12 = 0; i12 < ((t) this.h).f5975b * i11; i12++) {
            ((short[]) this.e)[i10 + i12] = 0;
        }
    }

    @Override
    public void e(int i10, int i11) {
        short[] sArr = (short[]) this.e;
        t tVar = (t) this.h;
        int i12 = tVar.h / i11;
        int i13 = tVar.f5975b;
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
        this.f5971c = 0;
        this.f5969a = 0;
        this.f5970b = 0;
    }

    @Override
    public void g() {
        this.f5971c = this.f5969a;
    }

    @Override
    public Object h() {
        return (short[]) this.e;
    }

    @Override
    public Object i() {
        return (short[]) this.f5972f;
    }

    @Override
    public void j(int i10) {
        this.f5972f = r((short[]) this.f5972f, ((t) this.h).f5981k, i10);
    }

    @Override
    public boolean k() {
        int i10 = this.f5969a;
        if (i10 == 0 || ((t) this.h).f5986p == 0 || this.f5970b > i10 * 3 || i10 * 2 <= this.f5971c * 3) {
            return false;
        }
        return true;
    }

    @Override
    public Object l() {
        return (short[]) this.f5973g;
    }

    @Override
    public void m(int i10, int i11, int i12, int i13, int i14) {
        short[] sArr = (short[]) this.f5972f;
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
        this.f5973g = r((short[]) this.f5973g, ((t) this.h).f5982l, i10);
    }

    @Override
    public int o() {
        return 2;
    }

    @Override
    public void p(int i10) {
        this.e = r((short[]) this.e, ((t) this.h).f5980j, i10);
    }

    @Override
    public int q(int i10, int i11) {
        return s((short[]) this.d, 0, i10, i11);
    }

    public short[] r(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = ((t) this.h).f5975b;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public int s(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * ((t) this.h).f5975b;
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
        this.f5969a = i15 / i16;
        this.f5970b = i17 / i14;
        return i16;
    }

    public s(t tVar) {
        this.h = tVar;
        int i10 = tVar.h;
        this.d = new short[i10];
        int i11 = i10 * tVar.f5975b;
        this.e = new short[i11];
        this.f5972f = new short[i11];
        this.f5973g = new short[i11];
    }
}
