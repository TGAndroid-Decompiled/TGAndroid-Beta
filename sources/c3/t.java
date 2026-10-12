package c3;

import e2.m0;
public class t implements b0 {
    public final int f4280a;
    public final long f4281b;
    public final Object f4282c;

    public t(Object obj, long j10, int i10) {
        this.f4280a = i10;
        this.f4282c = obj;
        this.f4281b = j10;
    }

    @Override
    public final boolean d() {
        switch (this.f4280a) {
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
        switch (this.f4280a) {
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
        switch (this.f4280a) {
            case 0:
                u uVar = (u) this.f4282c;
                uVar.f4290k.getClass();
                qf.b bVar = uVar.f4290k;
                long[] jArr = (long[]) bVar.f43355b;
                long[] jArr2 = (long[]) bVar.f43356c;
                int f7 = m0.f(jArr, m0.j((uVar.e * j10) / 1000000, 0L, uVar.f4289j - 1), false);
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
                long j14 = this.f4281b;
                c0 c0Var = new c0(j13, j12 + j14);
                if (j13 != j10 && f7 != jArr.length - 1) {
                    int i11 = f7 + 1;
                    return new a0(c0Var, new c0((jArr[i11] * 1000000) / i10, j14 + jArr2[i11]));
                }
                return new a0(c0Var, c0Var);
            case 1:
                return (a0) this.f4282c;
            default:
                e3.b bVar2 = (e3.b) this.f4282c;
                a0 b10 = bVar2.f8424i[0].b(j10);
                int i12 = 1;
                while (true) {
                    e3.e[] eVarArr = bVar2.f8424i;
                    if (i12 < eVarArr.length) {
                        a0 b11 = eVarArr[i12].b(j10);
                        if (b11.f4190a.f4220b < b10.f4190a.f4220b) {
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
        switch (this.f4280a) {
            case 0:
                return ((u) this.f4282c).b();
            case 1:
                return this.f4281b;
            default:
                return this.f4281b;
        }
    }

    public t(long j10) {
        this(j10, 0L);
        this.f4280a = 1;
    }

    public t(long j10, long j11) {
        this.f4280a = 1;
        this.f4281b = j10;
        c0 c0Var = j11 == 0 ? c0.f4218c : new c0(0L, j11);
        this.f4282c = new a0(c0Var, c0Var);
    }
}
