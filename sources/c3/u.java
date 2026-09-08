package c3;

import b2.p0;
import b2.r0;
import java.nio.ByteOrder;
import java.util.Collections;
public final class u {
    public final int f4325a;
    public final int f4326b;
    public final int f4327c;
    public final int d;
    public final int f4328e;
    public final int f4329f;
    public final int f4330g;
    public final int h;
    public final int f4331i;
    public final long f4332j;
    public final pf.b f4333k;
    public final p0 f4334l;

    public u(byte[] bArr, int i10) {
        a4.h hVar = new a4.h(bArr, bArr.length);
        hVar.q(i10 * 8);
        this.f4325a = hVar.i(16);
        this.f4326b = hVar.i(16);
        this.f4327c = hVar.i(24);
        this.d = hVar.i(24);
        int i11 = hVar.i(20);
        this.f4328e = i11;
        this.f4329f = d(i11);
        this.f4330g = hVar.i(3) + 1;
        int i12 = hVar.i(5) + 1;
        this.h = i12;
        this.f4331i = a(i12);
        this.f4332j = hVar.k(36);
        this.f4333k = null;
        this.f4334l = null;
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
        long j3 = this.f4332j;
        if (j3 == 0) {
            return -9223372036854775807L;
        }
        return (j3 * 1000000) / this.f4328e;
    }

    public final b2.s c(byte[] bArr, p0 p0Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.d;
        if (i10 <= 0) {
            i10 = -1;
        }
        p0 p0Var2 = this.f4334l;
        if (p0Var2 != null) {
            p0Var = p0Var2.b(p0Var);
        }
        b2.r rVar = new b2.r();
        rVar.f2339q = r0.n("audio/flac");
        rVar.f2340r = i10;
        rVar.I = this.f4330g;
        rVar.J = this.f4328e;
        String str = e2.d0.f8765a;
        rVar.K = e2.d0.B(this.h, ByteOrder.LITTLE_ENDIAN);
        rVar.f2342t = Collections.singletonList(bArr);
        rVar.f2333k = p0Var;
        return new b2.s(rVar);
    }

    public u(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j3, pf.b bVar, p0 p0Var) {
        this.f4325a = i10;
        this.f4326b = i11;
        this.f4327c = i12;
        this.d = i13;
        this.f4328e = i14;
        this.f4329f = d(i14);
        this.f4330g = i15;
        this.h = i16;
        this.f4331i = a(i16);
        this.f4332j = j3;
        this.f4333k = bVar;
        this.f4334l = p0Var;
    }
}
