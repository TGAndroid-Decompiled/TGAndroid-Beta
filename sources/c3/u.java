package c3;

import b2.u0;
import b2.w0;
import e2.m0;
import java.nio.ByteOrder;
import java.util.Collections;
public final class u {
    public final int f4283a;
    public final int f4284b;
    public final int f4285c;
    public final int d;
    public final int e;
    public final int f4286f;
    public final int f4287g;
    public final int h;
    public final int f4288i;
    public final long f4289j;
    public final qf.b f4290k;
    public final u0 f4291l;

    public u(byte[] bArr, int i10) {
        a4.g gVar = new a4.g(bArr, bArr.length);
        gVar.m(i10 * 8);
        this.f4283a = gVar.g(16);
        this.f4284b = gVar.g(16);
        this.f4285c = gVar.g(24);
        this.d = gVar.g(24);
        int g10 = gVar.g(20);
        this.e = g10;
        this.f4286f = d(g10);
        this.f4287g = gVar.g(3) + 1;
        int g11 = gVar.g(5) + 1;
        this.h = g11;
        this.f4288i = a(g11);
        this.f4289j = gVar.i(36);
        this.f4290k = null;
        this.f4291l = null;
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
        long j10 = this.f4289j;
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
        u0 u0Var2 = this.f4291l;
        if (u0Var2 != null) {
            u0Var = u0Var2.b(u0Var);
        }
        b2.w wVar = new b2.w();
        wVar.f2466r = w0.n("audio/flac");
        wVar.f2467s = i10;
        wVar.J = this.f4287g;
        wVar.K = this.e;
        String str = m0.f8372a;
        wVar.L = m0.D(this.h, ByteOrder.LITTLE_ENDIAN);
        wVar.f2469u = Collections.singletonList(bArr);
        wVar.f2459k = u0Var;
        return new b2.x(wVar);
    }

    public u(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, qf.b bVar, u0 u0Var) {
        this.f4283a = i10;
        this.f4284b = i11;
        this.f4285c = i12;
        this.d = i13;
        this.e = i14;
        this.f4286f = d(i14);
        this.f4287g = i15;
        this.h = i16;
        this.f4288i = a(i16);
        this.f4289j = j10;
        this.f4290k = bVar;
        this.f4291l = u0Var;
    }
}
