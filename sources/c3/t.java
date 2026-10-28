package c3;

import e2.n0;
public class t implements b0 {
    public final int f6093a;
    public final long f6094b;
    public final Object f6095c;

    public t(Object obj, long j10, int i10) {
        this.f6093a = i10;
        this.f6095c = obj;
        this.f6094b = j10;
    }

    @Override
    public final boolean d() {
        switch (this.f6093a) {
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
        switch (this.f6093a) {
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
        switch (this.f6093a) {
            case 0:
                u uVar = (u) this.f6095c;
                uVar.f6103k.getClass();
                rf.b bVar = uVar.f6103k;
                long[] jArr = (long[]) bVar.f47370b;
                long[] jArr2 = (long[]) bVar.f47371c;
                int f7 = n0.f(jArr, n0.j((uVar.e * j10) / 1000000, 0L, uVar.f6102j - 1), false);
                long j12 = 0;
                if (f7 == -1) {
                    j11 = 0;
                } else {
                    j11 = jArr[f7];
                }
                if (f7 != -1) {
                    j12 = jArr2[f7];
                }
                int i10 = uVar.e;
                long j13 = (j11 * 1000000) / i10;
                long j14 = this.f6094b;
                c0 c0Var = new c0(j13, j12 + j14);
                if (j13 != j10 && f7 != jArr.length - 1) {
                    int i11 = f7 + 1;
                    return new a0(c0Var, new c0((jArr[i11] * 1000000) / i10, j14 + jArr2[i11]));
                }
                return new a0(c0Var, c0Var);
            case 1:
                return (a0) this.f6095c;
            default:
                e3.b bVar2 = (e3.b) this.f6095c;
                a0 b10 = bVar2.f9744i[0].b(j10);
                int i12 = 1;
                while (true) {
                    e3.e[] eVarArr = bVar2.f9744i;
                    if (i12 < eVarArr.length) {
                        a0 b11 = eVarArr[i12].b(j10);
                        if (b11.f6002a.f6032b < b10.f6002a.f6032b) {
                            b10 = b11;
                        }
                        i12++;
                    } else {
                        return b10;
                    }
                }
        }
    }

    @Override
    public final long h() {
        switch (this.f6093a) {
            case 0:
                return ((u) this.f6095c).b();
            case 1:
                return this.f6094b;
            default:
                return this.f6094b;
        }
    }

    public t(long j10) {
        this(j10, 0L);
        this.f6093a = 1;
    }

    public t(long j10, long j11) {
        this.f6093a = 1;
        this.f6094b = j10;
        c0 c0Var = j11 == 0 ? c0.f6030c : new c0(0L, j11);
        this.f6095c = new a0(c0Var, c0Var);
    }
}
