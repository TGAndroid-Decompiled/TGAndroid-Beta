package f3;

import e2.q0;
import e2.s0;
import h2.l0;
import java.nio.ByteOrder;
import java.util.Collections;
public final class u {
    public final int f11229a;
    public final int f11230b;
    public final int f11231c;
    public final int d;
    public final int f11232e;
    public final int f11233f;
    public final int f11234g;
    public final int h;
    public final int f11235i;
    public final long f11236j;
    public final wf.b f11237k;
    public final q0 f11238l;

    public u(byte[] bArr, int i7) {
        d4.f fVar = new d4.f(bArr, bArr.length);
        fVar.J(i7 * 8);
        this.f11229a = fVar.j(16);
        this.f11230b = fVar.j(16);
        this.f11231c = fVar.j(24);
        this.d = fVar.j(24);
        int j3 = fVar.j(20);
        this.f11232e = j3;
        this.f11233f = d(j3);
        this.f11234g = fVar.j(3) + 1;
        int j10 = fVar.j(5) + 1;
        this.h = j10;
        this.f11235i = a(j10);
        this.f11236j = fVar.l(36);
        this.f11237k = null;
        this.f11238l = null;
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
        long j3 = this.f11236j;
        if (j3 == 0) {
            return -9223372036854775807L;
        }
        return (j3 * 1000000) / this.f11232e;
    }

    public final e2.u c(byte[] bArr, q0 q0Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i7 = this.d;
        if (i7 <= 0) {
            i7 = -1;
        }
        q0 q0Var2 = this.f11238l;
        if (q0Var2 != null) {
            q0Var = q0Var2.b(q0Var);
        }
        e2.t tVar = new e2.t();
        tVar.f10743r = s0.n("audio/flac");
        tVar.f10744s = i7;
        tVar.J = this.f11234g;
        tVar.K = this.f11232e;
        String str = l0.f13812a;
        tVar.L = l0.D(this.h, ByteOrder.LITTLE_ENDIAN);
        tVar.f10746u = Collections.singletonList(bArr);
        tVar.f10736k = q0Var;
        return new e2.u(tVar);
    }

    public u(int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j3, wf.b bVar, q0 q0Var) {
        this.f11229a = i7;
        this.f11230b = i10;
        this.f11231c = i11;
        this.d = i12;
        this.f11232e = i13;
        this.f11233f = d(i13);
        this.f11234g = i14;
        this.h = i15;
        this.f11235i = a(i15);
        this.f11236j = j3;
        this.f11237k = bVar;
        this.f11238l = q0Var;
    }
}
