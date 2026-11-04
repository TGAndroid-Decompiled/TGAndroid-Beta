package e3;

import d2.s0;
import d2.u0;
import g2.n0;
import java.nio.ByteOrder;
import java.util.Collections;
public final class u {
    public final int f9510a;
    public final int f9511b;
    public final int f9512c;
    public final int d;
    public final int f9513e;
    public final int f9514f;
    public final int f9515g;
    public final int h;
    public final int f9516i;
    public final long f9517j;
    public final tf.b f9518k;
    public final s0 f9519l;

    public u(byte[] bArr, int i3) {
        c4.f fVar = new c4.f(bArr, bArr.length);
        fVar.J(i3 * 8);
        this.f9510a = fVar.j(16);
        this.f9511b = fVar.j(16);
        this.f9512c = fVar.j(24);
        this.d = fVar.j(24);
        int j10 = fVar.j(20);
        this.f9513e = j10;
        this.f9514f = d(j10);
        this.f9515g = fVar.j(3) + 1;
        int j11 = fVar.j(5) + 1;
        this.h = j11;
        this.f9516i = a(j11);
        this.f9517j = fVar.l(36);
        this.f9518k = null;
        this.f9519l = null;
    }

    public static int a(int i3) {
        if (i3 != 8) {
            if (i3 != 12) {
                if (i3 != 16) {
                    if (i3 != 20) {
                        if (i3 != 24) {
                            if (i3 != 32) {
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

    public static int d(int i3) {
        switch (i3) {
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
        long j10 = this.f9517j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.f9513e;
    }

    public final d2.v c(byte[] bArr, s0 s0Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i3 = this.d;
        if (i3 <= 0) {
            i3 = -1;
        }
        s0 s0Var2 = this.f9519l;
        if (s0Var2 != null) {
            s0Var = s0Var2.b(s0Var);
        }
        d2.u uVar = new d2.u();
        uVar.f8431r = u0.n("audio/flac");
        uVar.f8432s = i3;
        uVar.J = this.f9515g;
        uVar.K = this.f9513e;
        String str = n0.f11873a;
        uVar.L = n0.D(this.h, ByteOrder.LITTLE_ENDIAN);
        uVar.f8434u = Collections.singletonList(bArr);
        uVar.f8424k = s0Var;
        return new d2.v(uVar);
    }

    public u(int i3, int i10, int i11, int i12, int i13, int i14, int i15, long j10, tf.b bVar, s0 s0Var) {
        this.f9510a = i3;
        this.f9511b = i10;
        this.f9512c = i11;
        this.d = i12;
        this.f9513e = i13;
        this.f9514f = d(i13);
        this.f9515g = i14;
        this.h = i15;
        this.f9516i = a(i15);
        this.f9517j = j10;
        this.f9518k = bVar;
        this.f9519l = s0Var;
    }
}
