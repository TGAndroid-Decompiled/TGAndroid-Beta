package f3;

import e2.q0;
import e2.s0;
import h2.m0;
import java.nio.ByteOrder;
import java.util.Collections;
public final class u {
    public final int f11079a;
    public final int f11080b;
    public final int f11081c;
    public final int d;
    public final int f11082e;
    public final int f11083f;
    public final int f11084g;
    public final int h;
    public final int f11085i;
    public final long f11086j;
    public final q4.q f11087k;
    public final q0 f11088l;

    public u(byte[] bArr, int i7) {
        d4.f fVar = new d4.f(bArr, bArr.length);
        fVar.J(i7 * 8);
        this.f11079a = fVar.j(16);
        this.f11080b = fVar.j(16);
        this.f11081c = fVar.j(24);
        this.d = fVar.j(24);
        int j3 = fVar.j(20);
        this.f11082e = j3;
        this.f11083f = d(j3);
        this.f11084g = fVar.j(3) + 1;
        int j10 = fVar.j(5) + 1;
        this.h = j10;
        this.f11085i = a(j10);
        this.f11086j = fVar.l(36);
        this.f11087k = null;
        this.f11088l = null;
    }

    public static int a(int i7) {
        if (i7 != 8) {
            if (i7 != 12) {
                if (i7 != 16) {
                    if (i7 != 20) {
                        if (i7 != 24) {
                            if (i7 != 32) {
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

    public static int d(int i7) {
        switch (i7) {
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
        long j3 = this.f11086j;
        if (j3 == 0) {
            return -9223372036854775807L;
        }
        return (j3 * 1000000) / this.f11082e;
    }

    public final e2.u c(byte[] bArr, q0 q0Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i7 = this.d;
        if (i7 <= 0) {
            i7 = -1;
        }
        q0 q0Var2 = this.f11088l;
        if (q0Var2 != null) {
            q0Var = q0Var2.b(q0Var);
        }
        e2.t tVar = new e2.t();
        tVar.f10568r = s0.n("audio/flac");
        tVar.f10569s = i7;
        tVar.J = this.f11084g;
        tVar.K = this.f11082e;
        String str = m0.f14114a;
        tVar.L = m0.D(this.h, ByteOrder.LITTLE_ENDIAN);
        tVar.f10571u = Collections.singletonList(bArr);
        tVar.f10561k = q0Var;
        return new e2.u(tVar);
    }

    public u(int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j3, q4.q qVar, q0 q0Var) {
        this.f11079a = i7;
        this.f11080b = i10;
        this.f11081c = i11;
        this.d = i12;
        this.f11082e = i13;
        this.f11083f = d(i13);
        this.f11084g = i14;
        this.h = i15;
        this.f11085i = a(i15);
        this.f11086j = j3;
        this.f11087k = qVar;
        this.f11088l = q0Var;
    }
}
