package c3;

import e2.m0;
public class t implements c0 {
    public final int f4660a;
    public final long f4661b;
    public final Object f4662c;

    public t(Object obj, long j10, int i10) {
        this.f4660a = i10;
        this.f4662c = obj;
        this.f4661b = j10;
    }

    @Override
    public final boolean d() {
        switch (this.f4660a) {
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
        switch (this.f4660a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final b0 f(long j10) {
        long j11;
        switch (this.f4660a) {
            case 0:
                u uVar = (u) this.f4662c;
                uVar.f4670k.getClass();
                n4.s sVar = uVar.f4670k;
                long[] jArr = (long[]) sVar.f17128b;
                long[] jArr2 = (long[]) sVar.f17129c;
                int f7 = m0.f(jArr, m0.j((uVar.e * j10) / 1000000, 0L, uVar.f4669j - 1), false);
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
                long j14 = this.f4661b;
                d0 d0Var = new d0(j13, j12 + j14);
                if (j13 != j10 && f7 != jArr.length - 1) {
                    int i11 = f7 + 1;
                    return new b0(d0Var, new d0((jArr[i11] * 1000000) / i10, j14 + jArr2[i11]));
                }
                return new b0(d0Var, d0Var);
            case 1:
                return (b0) this.f4662c;
            default:
                e3.b bVar = (e3.b) this.f4662c;
                b0 b10 = bVar.f8307i[0].b(j10);
                int i12 = 1;
                while (true) {
                    e3.e[] eVarArr = bVar.f8307i;
                    if (i12 < eVarArr.length) {
                        b0 b11 = eVarArr[i12].b(j10);
                        if (b11.f4591a.f4609b < b10.f4591a.f4609b) {
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
        switch (this.f4660a) {
            case 0:
                return ((u) this.f4662c).b();
            case 1:
                return this.f4661b;
            default:
                return this.f4661b;
        }
    }

    public t(long j10) {
        this(j10, 0L);
        this.f4660a = 1;
    }

    public t(long j10, long j11) {
        this.f4660a = 1;
        this.f4661b = j10;
        d0 d0Var = j11 == 0 ? d0.f4607c : new d0(0L, j11);
        this.f4662c = new b0(d0Var, d0Var);
    }
}
