package defpackage;

import java.nio.ByteOrder;
import java.util.Collections;
public final class ci4 {
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
    public final lv6 k;
    public final ld7 l;

    public ci4(int i, byte[] bArr) {
        qd1 qd1Var = new qd1(bArr.length, bArr);
        qd1Var.l(i << 3);
        this.a = qd1Var.f(16);
        this.b = qd1Var.f(16);
        this.c = qd1Var.f(24);
        this.d = qd1Var.f(24);
        int f = qd1Var.f(20);
        this.e = f;
        this.f = d(f);
        this.g = qd1Var.f(3) + 1;
        int f2 = qd1Var.f(5) + 1;
        this.h = f2;
        this.i = a(f2);
        this.j = qd1Var.h(36);
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

    public final fm4 c(byte[] bArr, ld7 ld7Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        ld7 ld7Var2 = this.l;
        if (ld7Var2 != null) {
            ld7Var = ld7Var2.b(ld7Var);
        }
        em4 em4Var = new em4();
        em4Var.s = ud7.n("audio/flac");
        em4Var.t = i;
        em4Var.M = this.g;
        em4Var.O = this.e;
        String str = g8c.a;
        em4Var.P = g8c.F(this.h, ByteOrder.LITTLE_ENDIAN);
        em4Var.v = Collections.singletonList(bArr);
        em4Var.l = ld7Var;
        return new fm4(em4Var);
    }

    public ci4(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, lv6 lv6Var, ld7 ld7Var) {
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
        this.k = lv6Var;
        this.l = ld7Var;
    }
}
