package e3;

import g2.n0;
public class t implements b0 {
    public final int f9507a;
    public final long f9508b;
    public final Object f9509c;

    public t(Object obj, long j10, int i3) {
        this.f9507a = i3;
        this.f9509c = obj;
        this.f9508b = j10;
    }

    @Override
    public final boolean d() {
        switch (this.f9507a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override
    public final boolean e() {
        switch (this.f9507a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final a0 f(long j10) {
        long j11;
        switch (this.f9507a) {
            case 0:
                u uVar = (u) this.f9509c;
                uVar.f9518k.getClass();
                tf.b bVar = uVar.f9518k;
                long[] jArr = (long[]) bVar.f55094a;
                long[] jArr2 = (long[]) bVar.f55095b;
                int f10 = n0.f(jArr, n0.j((uVar.f9513e * j10) / 1000000, 0L, uVar.f9517j - 1), false);
                long j12 = 0;
                if (f10 == -1) {
                    j11 = 0;
                } else {
                    j11 = jArr[f10];
                }
                if (f10 != -1) {
                    j12 = jArr2[f10];
                }
                int i3 = uVar.f9513e;
                long j13 = (j11 * 1000000) / i3;
                long j14 = this.f9508b;
                c0 c0Var = new c0(j13, j12 + j14);
                if (j13 != j10 && f10 != jArr.length - 1) {
                    int i10 = f10 + 1;
                    return new a0(c0Var, new c0((jArr[i10] * 1000000) / i3, j14 + jArr2[i10]));
                }
                return new a0(c0Var, c0Var);
            case 1:
                return (a0) this.f9509c;
            default:
                g3.b bVar2 = (g3.b) this.f9509c;
                a0 b10 = bVar2.f11935i[0].b(j10);
                int i11 = 1;
                while (true) {
                    g3.e[] eVarArr = bVar2.f11935i;
                    if (i11 < eVarArr.length) {
                        a0 b11 = eVarArr[i11].b(j10);
                        if (b11.f9406a.f9438b < b10.f9406a.f9438b) {
                            b10 = b11;
                        }
                        i11++;
                    } else {
                        return b10;
                    }
                }
        }
    }

    @Override
    public final long h() {
        switch (this.f9507a) {
            case 0:
                return ((u) this.f9509c).b();
            case 1:
                return this.f9508b;
            default:
                return this.f9508b;
        }
    }

    public t(long j10) {
        this(j10, 0L);
        this.f9507a = 1;
    }

    public t(long j10, long j11) {
        this.f9507a = 1;
        this.f9508b = j10;
        c0 c0Var = j11 == 0 ? c0.f9436c : new c0(0L, j11);
        this.f9509c = new a0(c0Var, c0Var);
    }
}
