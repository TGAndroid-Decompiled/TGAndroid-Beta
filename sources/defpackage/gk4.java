package defpackage;

import java.nio.ByteOrder;
import java.util.Collections;
public final class gk4 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final lx6 k;
    public final nf7 l;

    public gk4(int i, byte[] bArr) {
        ye1 ye1Var = new ye1(bArr.length, bArr);
        ye1Var.l(i << 3);
        this.a = ye1Var.f(16);
        this.b = ye1Var.f(16);
        this.c = ye1Var.f(24);
        this.d = ye1Var.f(24);
        int f = ye1Var.f(20);
        this.e = f;
        this.f = d(f);
        this.g = ye1Var.f(3) + 1;
        int f2 = ye1Var.f(5) + 1;
        this.h = f2;
        this.i = a(f2);
        this.j = ye1Var.h(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i != 8) {
            if (i != 12) {
                if (i != 16) {
                    if (i != 20) {
                        if (i != 24) {
                            if (i != 32) {
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

    public static int d(int i) {
        switch (i) {
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
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public final go4 c(byte[] bArr, nf7 nf7Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        nf7 nf7Var2 = this.l;
        if (nf7Var2 != null) {
            nf7Var = nf7Var2.b(nf7Var);
        }
        fo4 fo4Var = new fo4();
        fo4Var.s = wf7.n("audio/flac");
        fo4Var.t = i;
        fo4Var.M = this.g;
        fo4Var.O = this.e;
        String str = hac.a;
        fo4Var.P = hac.F(this.h, ByteOrder.LITTLE_ENDIAN);
        fo4Var.v = Collections.singletonList(bArr);
        fo4Var.l = nf7Var;
        return new go4(fo4Var);
    }

    public gk4(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, lx6 lx6Var, nf7 nf7Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = lx6Var;
        this.l = nf7Var;
    }
}
