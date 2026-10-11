package c3;

import b2.p0;
import b2.r0;
import java.nio.ByteOrder;
import java.util.Collections;
public final class u {
    public final int f4154a;
    public final int f4155b;
    public final int f4156c;
    public final int d;
    public final int f4157e;
    public final int f4158f;
    public final int f4159g;
    public final int h;
    public final int f4160i;
    public final long f4161j;
    public final pf.b f4162k;
    public final p0 f4163l;

    public u(byte[] bArr, int i10) {
        a4.g gVar = new a4.g(bArr, bArr.length);
        gVar.q(i10 * 8);
        this.f4154a = gVar.i(16);
        this.f4155b = gVar.i(16);
        this.f4156c = gVar.i(24);
        this.d = gVar.i(24);
        int i11 = gVar.i(20);
        this.f4157e = i11;
        this.f4158f = d(i11);
        this.f4159g = gVar.i(3) + 1;
        int i12 = gVar.i(5) + 1;
        this.h = i12;
        this.f4160i = a(i12);
        this.f4161j = gVar.k(36);
        this.f4162k = null;
        this.f4163l = null;
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
        long j3 = this.f4161j;
        if (j3 == 0) {
            return -9223372036854775807L;
        }
        return (j3 * 1000000) / this.f4157e;
    }

    public final b2.s c(byte[] bArr, p0 p0Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.d;
        if (i10 <= 0) {
            i10 = -1;
        }
        p0 p0Var2 = this.f4163l;
        if (p0Var2 != null) {
            p0Var = p0Var2.b(p0Var);
        }
        b2.r rVar = new b2.r();
        rVar.f3585q = r0.n("audio/flac");
        rVar.f3586r = i10;
        rVar.I = this.f4159g;
        rVar.J = this.f4157e;
        String str = e2.d0.f8531a;
        rVar.K = e2.d0.A(this.h, ByteOrder.LITTLE_ENDIAN);
        rVar.f3588t = Collections.singletonList(bArr);
        rVar.f3579k = p0Var;
        return new b2.s(rVar);
    }

    public u(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j3, pf.b bVar, p0 p0Var) {
        this.f4154a = i10;
        this.f4155b = i11;
        this.f4156c = i12;
        this.d = i13;
        this.f4157e = i14;
        this.f4158f = d(i14);
        this.f4159g = i15;
        this.h = i16;
        this.f4160i = a(i16);
        this.f4161j = j3;
        this.f4162k = bVar;
        this.f4163l = p0Var;
    }
}
