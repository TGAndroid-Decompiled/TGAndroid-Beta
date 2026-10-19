package c3;

import e2.m0;
public class t implements c0 {
    public final int f4656a;
    public final long f4657b;
    public final Object f4658c;

    public t(Object obj, long j10, int i10) {
        this.f4656a = i10;
        this.f4658c = obj;
        this.f4657b = j10;
    }

    @Override
    public final boolean d() {
        switch (this.f4656a) {
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
        switch (this.f4656a) {
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
        switch (this.f4656a) {
            case 0:
                u uVar = (u) this.f4658c;
                uVar.f4666k.getClass();
                n4.s sVar = uVar.f4666k;
                long[] jArr = (long[]) sVar.f17125b;
                long[] jArr2 = (long[]) sVar.f17126c;
                int f7 = m0.f(jArr, m0.j((uVar.e * j10) / 1000000, 0L, uVar.f4665j - 1), false);
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
                long j14 = this.f4657b;
                d0 d0Var = new d0(j13, j12 + j14);
                if (j13 != j10 && f7 != jArr.length - 1) {
                    int i11 = f7 + 1;
                    return new b0(d0Var, new d0((jArr[i11] * 1000000) / i10, j14 + jArr2[i11]));
                }
                return new b0(d0Var, d0Var);
            case 1:
                return (b0) this.f4658c;
            default:
                e3.b bVar = (e3.b) this.f4658c;
                b0 b10 = bVar.f8304i[0].b(j10);
                int i12 = 1;
                while (true) {
                    e3.e[] eVarArr = bVar.f8304i;
                    if (i12 < eVarArr.length) {
                        b0 b11 = eVarArr[i12].b(j10);
                        if (b11.f4587a.f4605b < b10.f4587a.f4605b) {
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
        switch (this.f4656a) {
            case 0:
                return ((u) this.f4658c).b();
            case 1:
                return this.f4657b;
            default:
                return this.f4657b;
        }
    }

    public t(long j10) {
        this(j10, 0L);
        this.f4656a = 1;
    }

    public t(long j10, long j11) {
        this.f4656a = 1;
        this.f4657b = j10;
        d0 d0Var = j11 == 0 ? d0.f4603c : new d0(0L, j11);
        this.f4658c = new b0(d0Var, d0Var);
    }
}
