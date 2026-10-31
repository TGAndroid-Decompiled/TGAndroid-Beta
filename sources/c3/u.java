package c3;

import b2.u0;
import b2.v0;
import java.nio.ByteOrder;
import java.util.Collections;
public final class u {
    public final int f3691a;
    public final int f3692b;
    public final int f3693c;
    public final int d;
    public final int e;
    public final int f3694f;
    public final int f3695g;
    public final int h;
    public final int f3696i;
    public final long f3697j;
    public final hf.b f3698k;
    public final u0 f3699l;

    public u(byte[] bArr, int i10) {
        a4.g gVar = new a4.g(bArr, bArr.length);
        gVar.d0(i10 * 8);
        this.f3691a = gVar.i(16);
        this.f3692b = gVar.i(16);
        this.f3693c = gVar.i(24);
        this.d = gVar.i(24);
        int i11 = gVar.i(20);
        this.e = i11;
        this.f3694f = d(i11);
        this.f3695g = gVar.i(3) + 1;
        int i12 = gVar.i(5) + 1;
        this.h = i12;
        this.f3696i = a(i12);
        this.f3697j = gVar.k(36);
        this.f3698k = null;
        this.f3699l = null;
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
        long j10 = this.f3697j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.e;
    }

    public final b2.x c(byte[] bArr, u0 u0Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.d;
        if (i10 <= 0) {
            i10 = -1;
        }
        u0 u0Var2 = this.f3699l;
        if (u0Var2 != null) {
            u0Var = u0Var2.b(u0Var);
        }
        b2.w wVar = new b2.w();
        wVar.f2370r = v0.n("audio/flac");
        wVar.f2371s = i10;
        wVar.J = this.f3695g;
        wVar.K = this.e;
        String str = e2.l0.f6165a;
        wVar.L = e2.l0.D(this.h, ByteOrder.LITTLE_ENDIAN);
        wVar.f2373u = Collections.singletonList(bArr);
        wVar.f2363k = u0Var;
        return new b2.x(wVar);
    }

    public u(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, hf.b bVar, u0 u0Var) {
        this.f3691a = i10;
        this.f3692b = i11;
        this.f3693c = i12;
        this.d = i13;
        this.e = i14;
        this.f3694f = d(i14);
        this.f3695g = i15;
        this.h = i16;
        this.f3696i = a(i16);
        this.f3697j = j10;
        this.f3698k = bVar;
        this.f3699l = u0Var;
    }
}
