package c3;

import b2.p0;
import b2.r0;
import java.nio.ByteOrder;
import java.util.Collections;
public final class u {
    public final int f3797a;
    public final int f3798b;
    public final int f3799c;
    public final int d;
    public final int e;
    public final int f3800f;
    public final int f3801g;
    public final int h;
    public final int f3802i;
    public final long f3803j;
    public final of.b f3804k;
    public final p0 f3805l;

    public u(byte[] bArr, int i10) {
        a4.h hVar = new a4.h(bArr, bArr.length);
        hVar.q(i10 * 8);
        this.f3797a = hVar.i(16);
        this.f3798b = hVar.i(16);
        this.f3799c = hVar.i(24);
        this.d = hVar.i(24);
        int i11 = hVar.i(20);
        this.e = i11;
        this.f3800f = d(i11);
        this.f3801g = hVar.i(3) + 1;
        int i12 = hVar.i(5) + 1;
        this.h = i12;
        this.f3802i = a(i12);
        this.f3803j = hVar.k(36);
        this.f3804k = null;
        this.f3805l = null;
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
        long j3 = this.f3803j;
        if (j3 == 0) {
            return -9223372036854775807L;
        }
        return (j3 * 1000000) / this.e;
    }

    public final b2.s c(byte[] bArr, p0 p0Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.d;
        if (i10 <= 0) {
            i10 = -1;
        }
        p0 p0Var2 = this.f3805l;
        if (p0Var2 != null) {
            p0Var = p0Var2.b(p0Var);
        }
        b2.r rVar = new b2.r();
        rVar.f3248q = r0.n("audio/flac");
        rVar.f3249r = i10;
        rVar.I = this.f3801g;
        rVar.J = this.e;
        String str = e2.d0.f7883a;
        rVar.K = e2.d0.B(this.h, ByteOrder.LITTLE_ENDIAN);
        rVar.f3251t = Collections.singletonList(bArr);
        rVar.f3242k = p0Var;
        return new b2.s(rVar);
    }

    public u(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j3, of.b bVar, p0 p0Var) {
        this.f3797a = i10;
        this.f3798b = i11;
        this.f3799c = i12;
        this.d = i13;
        this.e = i14;
        this.f3800f = d(i14);
        this.f3801g = i15;
        this.h = i16;
        this.f3802i = a(i16);
        this.f3803j = j3;
        this.f3804k = bVar;
        this.f3805l = p0Var;
    }
}
