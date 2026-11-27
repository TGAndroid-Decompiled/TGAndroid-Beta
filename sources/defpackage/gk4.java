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
    public final lh2 k;
    public final uf7 l;

    public gk4(int i, byte[] bArr) {
        zd1 zd1Var = new zd1(bArr.length, bArr);
        zd1Var.l(i << 3);
        this.a = zd1Var.f(16);
        this.b = zd1Var.f(16);
        this.c = zd1Var.f(24);
        this.d = zd1Var.f(24);
        int f = zd1Var.f(20);
        this.e = f;
        this.f = d(f);
        this.g = zd1Var.f(3) + 1;
        int f2 = zd1Var.f(5) + 1;
        this.h = f2;
        this.i = a(f2);
        this.j = zd1Var.h(36);
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

    public final ko4 c(byte[] bArr, uf7 uf7Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        uf7 uf7Var2 = this.l;
        if (uf7Var2 != null) {
            uf7Var = uf7Var2.b(uf7Var);
        }
        jo4 jo4Var = new jo4();
        jo4Var.s = dg7.n("audio/flac");
        jo4Var.t = i;
        jo4Var.M = this.g;
        jo4Var.O = this.e;
        String str = gcc.a;
        jo4Var.P = gcc.F(this.h, ByteOrder.LITTLE_ENDIAN);
        jo4Var.v = Collections.singletonList(bArr);
        jo4Var.l = uf7Var;
        return new ko4(jo4Var);
    }

    public gk4(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, lh2 lh2Var, uf7 uf7Var) {
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
        this.k = lh2Var;
        this.l = uf7Var;
    }
}
