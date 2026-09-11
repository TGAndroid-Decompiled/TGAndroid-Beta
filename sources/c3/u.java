package c3;

import b2.p0;
import b2.r0;
import java.nio.ByteOrder;
import java.util.Collections;
public final class u {
    public final int f4298a;
    public final int f4299b;
    public final int f4300c;
    public final int d;
    public final int f4301e;
    public final int f4302f;
    public final int f4303g;
    public final int h;
    public final int f4304i;
    public final long f4305j;
    public final pf.b f4306k;
    public final p0 f4307l;

    public u(byte[] bArr, int i10) {
        a4.h hVar = new a4.h(bArr, bArr.length);
        hVar.q(i10 * 8);
        this.f4298a = hVar.i(16);
        this.f4299b = hVar.i(16);
        this.f4300c = hVar.i(24);
        this.d = hVar.i(24);
        int i11 = hVar.i(20);
        this.f4301e = i11;
        this.f4302f = d(i11);
        this.f4303g = hVar.i(3) + 1;
        int i12 = hVar.i(5) + 1;
        this.h = i12;
        this.f4304i = a(i12);
        this.f4305j = hVar.k(36);
        this.f4306k = null;
        this.f4307l = null;
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
        long j3 = this.f4305j;
        if (j3 == 0) {
            return -9223372036854775807L;
        }
        return (j3 * 1000000) / this.f4301e;
    }

    public final b2.s c(byte[] bArr, p0 p0Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.d;
        if (i10 <= 0) {
            i10 = -1;
        }
        p0 p0Var2 = this.f4307l;
        if (p0Var2 != null) {
            p0Var = p0Var2.b(p0Var);
        }
        b2.r rVar = new b2.r();
        rVar.f2312q = r0.n("audio/flac");
        rVar.f2313r = i10;
        rVar.I = this.f4303g;
        rVar.J = this.f4301e;
        String str = e2.d0.f8737a;
        rVar.K = e2.d0.B(this.h, ByteOrder.LITTLE_ENDIAN);
        rVar.f2315t = Collections.singletonList(bArr);
        rVar.f2306k = p0Var;
        return new b2.s(rVar);
    }

    public u(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j3, pf.b bVar, p0 p0Var) {
        this.f4298a = i10;
        this.f4299b = i11;
        this.f4300c = i12;
        this.d = i13;
        this.f4301e = i14;
        this.f4302f = d(i14);
        this.f4303g = i15;
        this.h = i16;
        this.f4304i = a(i16);
        this.f4305j = j3;
        this.f4306k = bVar;
        this.f4307l = p0Var;
    }
}
