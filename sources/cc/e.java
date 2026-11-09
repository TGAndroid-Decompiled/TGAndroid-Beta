package cc;

import f2.q;
import f2.r;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
public final class e implements q {
    public int f6052a;
    public int f6053b;
    public int f6054c;
    public final Serializable d;
    public Serializable f6055e;
    public Object f6056f;
    public Serializable f6057g;
    public Object h;

    public e(byte[] bArr, String str, ArrayList arrayList, String str2, int i7, int i10, int i11) {
        this.d = str;
        this.f6056f = arrayList;
        this.f6055e = str2;
        this.f6052a = i10;
        this.f6053b = i7;
        this.f6054c = i11;
    }

    @Override
    public void a(int i7, ByteBuffer byteBuffer) {
        r rVar = (r) this.h;
        byteBuffer.asShortBuffer().get((short[]) this.f6055e, rVar.f10941j * rVar.f10935b, i7 / 2);
        byteBuffer.position(byteBuffer.position() + i7);
    }

    @Override
    public void b(int i7, ByteBuffer byteBuffer) {
        r rVar = (r) this.h;
        byteBuffer.asShortBuffer().put((short[]) this.f6056f, 0, rVar.f10935b * i7);
        byteBuffer.position((i7 * 2 * rVar.f10935b) + byteBuffer.position());
    }

    @Override
    public void c(int i7, int i10) {
        for (int i11 = 0; i11 < ((r) this.h).f10935b * i10; i11++) {
            ((short[]) this.f6055e)[i7 + i11] = 0;
        }
    }

    @Override
    public void d(int i7, int i10) {
        short[] sArr = (short[]) this.f6055e;
        r rVar = (r) this.h;
        int i11 = rVar.h / i10;
        int i12 = rVar.f10935b;
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
        return s((short[]) this.f6055e, i7, i10, i11);
    }

    @Override
    public void f() {
        this.f6054c = this.f6052a;
    }

    @Override
    public void flush() {
        this.f6054c = 0;
        this.f6052a = 0;
        this.f6053b = 0;
    }

    @Override
    public Object g() {
        return (short[]) this.f6055e;
    }

    @Override
    public Object h() {
        return (short[]) this.f6056f;
    }

    @Override
    public void i(int i7) {
        this.f6056f = r((short[]) this.f6056f, ((r) this.h).f10942k, i7);
    }

    @Override
    public boolean j() {
        int i7 = this.f6052a;
        if (i7 == 0 || ((r) this.h).f10947p == 0 || this.f6053b > i7 * 3 || i7 * 2 <= this.f6054c * 3) {
            return false;
        }
        return true;
    }

    @Override
    public void k(long j3, int i7, long j10) {
        int i10 = 0;
        while (true) {
            r rVar = (r) this.h;
            int i11 = rVar.f10935b;
            if (i10 < i11) {
                short[] sArr = (short[]) this.f6057g;
                int i12 = (i7 * i11) + i10;
                short s5 = sArr[i12];
                short s9 = sArr[i12 + i11];
                int i13 = rVar.f10944m;
                long j11 = (i13 + 1) * j10;
                long j12 = j11 - (rVar.f10945n * j3);
                long j13 = j11 - (i13 * j10);
                ((short[]) this.f6056f)[(rVar.f10942k * i11) + i10] = (short) ((((j13 - j12) * s9) + (s5 * j12)) / j13);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public Object l() {
        return (short[]) this.f6057g;
    }

    @Override
    public void m(int i7, int i10, int i11, int i12, int i13) {
        short[] sArr = (short[]) this.f6056f;
        short[] sArr2 = (short[]) this.f6055e;
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
        this.f6057g = r((short[]) this.f6057g, ((r) this.h).f10943l, i7);
    }

    @Override
    public int o() {
        return 2;
    }

    @Override
    public void p(int i7) {
        this.f6055e = r((short[]) this.f6055e, ((r) this.h).f10941j, i7);
    }

    @Override
    public int q(int i7, int i10) {
        return s((short[]) this.d, 0, i7, i10);
    }

    public short[] r(short[] sArr, int i7, int i10) {
        int length = sArr.length;
        int i11 = ((r) this.h).f10935b;
        int i12 = length / i11;
        if (i7 + i10 <= i12) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public int s(short[] sArr, int i7, int i10, int i11) {
        int i12 = i7 * ((r) this.h).f10935b;
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
        this.f6052a = i14 / i15;
        this.f6053b = i16 / i13;
        return i15;
    }

    public e(r rVar) {
        this.h = rVar;
        int i7 = rVar.h;
        this.d = new short[i7];
        int i10 = i7 * rVar.f10935b;
        this.f6055e = new short[i10];
        this.f6056f = new short[i10];
        this.f6057g = new short[i10];
    }
}
