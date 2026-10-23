package c3;

import b2.t0;
import b2.v0;
import java.nio.ByteOrder;
import java.util.Collections;
public final class w {
    public final int f4668a;
    public final int f4669b;
    public final int f4670c;
    public final int d;
    public final int e;
    public final int f4671f;
    public final int f4672g;
    public final int h;
    public final int f4673i;
    public final long f4674j;
    public final n4.s f4675k;
    public final t0 f4676l;

    public w(byte[] bArr, int i10) {
        a4.g gVar = new a4.g(bArr, bArr.length);
        gVar.m(i10 * 8);
        this.f4668a = gVar.g(16);
        this.f4669b = gVar.g(16);
        this.f4670c = gVar.g(24);
        this.d = gVar.g(24);
        int g10 = gVar.g(20);
        this.e = g10;
        this.f4671f = d(g10);
        this.f4672g = gVar.g(3) + 1;
        int g11 = gVar.g(5) + 1;
        this.h = g11;
        this.f4673i = a(g11);
        this.f4674j = gVar.i(36);
        this.f4675k = null;
        this.f4676l = null;
    }

    public static int a(int i10) {
        if (i10 != 8) {
            if (i10 != 12) {
                if (i10 != 16) {
                    if (i10 != 20) {
                        if (i10 != 24) {
                            if (i10 != 32) {
                                return -1;
                            }
                            return 7;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int d(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j10 = this.f4674j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.e;
    }

    public final b2.w c(byte[] bArr, t0 t0Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.d;
        if (i10 <= 0) {
            i10 = -1;
        }
        t0 t0Var2 = this.f4676l;
        if (t0Var2 != null) {
            t0Var = t0Var2.b(t0Var);
        }
        b2.v vVar = new b2.v();
        vVar.f4082r = v0.n("audio/flac");
        vVar.f4083s = i10;
        vVar.J = this.f4672g;
        vVar.K = this.e;
        String str = e2.m0.f8259a;
        vVar.L = e2.m0.D(this.h, ByteOrder.LITTLE_ENDIAN);
        vVar.f4085u = Collections.singletonList(bArr);
        vVar.f4075k = t0Var;
        return new b2.w(vVar);
    }

    public w(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, n4.s sVar, t0 t0Var) {
        this.f4668a = i10;
        this.f4669b = i11;
        this.f4670c = i12;
        this.d = i13;
        this.e = i14;
        this.f4671f = d(i14);
        this.f4672g = i15;
        this.h = i16;
        this.f4673i = a(i16);
        this.f4674j = j10;
        this.f4675k = sVar;
        this.f4676l = t0Var;
    }
}
