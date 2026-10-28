package c3;

import b2.u0;
import b2.w0;
import e2.n0;
import java.nio.ByteOrder;
import java.util.Collections;
public final class u {
    public final int f6096a;
    public final int f6097b;
    public final int f6098c;
    public final int d;
    public final int e;
    public final int f6099f;
    public final int f6100g;
    public final int h;
    public final int f6101i;
    public final long f6102j;
    public final rf.b f6103k;
    public final u0 f6104l;

    public u(byte[] bArr, int i10) {
        a4.g gVar = new a4.g(bArr, bArr.length);
        gVar.m(i10 * 8);
        this.f6096a = gVar.g(16);
        this.f6097b = gVar.g(16);
        this.f6098c = gVar.g(24);
        this.d = gVar.g(24);
        int g7 = gVar.g(20);
        this.e = g7;
        this.f6099f = d(g7);
        this.f6100g = gVar.g(3) + 1;
        int g10 = gVar.g(5) + 1;
        this.h = g10;
        this.f6101i = a(g10);
        this.f6102j = gVar.i(36);
        this.f6103k = null;
        this.f6104l = null;
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
        long j10 = this.f6102j;
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
        u0 u0Var2 = this.f6104l;
        if (u0Var2 != null) {
            u0Var = u0Var2.b(u0Var);
        }
        b2.w wVar = new b2.w();
        wVar.f3533r = w0.n("audio/flac");
        wVar.f3534s = i10;
        wVar.J = this.f6100g;
        wVar.K = this.e;
        String str = n0.f9691a;
        wVar.L = n0.D(this.h, ByteOrder.LITTLE_ENDIAN);
        wVar.f3536u = Collections.singletonList(bArr);
        wVar.f3526k = u0Var;
        return new b2.x(wVar);
    }

    public u(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, rf.b bVar, u0 u0Var) {
        this.f6096a = i10;
        this.f6097b = i11;
        this.f6098c = i12;
        this.d = i13;
        this.e = i14;
        this.f6099f = d(i14);
        this.f6100g = i15;
        this.h = i16;
        this.f6101i = a(i16);
        this.f6102j = j10;
        this.f6103k = bVar;
        this.f6104l = u0Var;
    }
}
