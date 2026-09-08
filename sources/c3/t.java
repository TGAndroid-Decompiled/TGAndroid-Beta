package c3;
public class t implements b0 {
    public final int f4322a;
    public final long f4323b;
    public final Object f4324c;

    public t(Object obj, long j3, int i10) {
        this.f4322a = i10;
        this.f4324c = obj;
        this.f4323b = j3;
    }

    @Override
    public final boolean f() {
        switch (this.f4322a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override
    public final a0 j(long j3) {
        long j10;
        switch (this.f4322a) {
            case 0:
                u uVar = (u) this.f4324c;
                e2.d.h(uVar.f4333k);
                pf.b bVar = uVar.f4333k;
                long[] jArr = (long[]) bVar.f44073b;
                long[] jArr2 = (long[]) bVar.f44074c;
                int e7 = e2.d0.e(jArr, e2.d0.i((uVar.f4328e * j3) / 1000000, 0L, uVar.f4332j - 1), false);
                long j11 = 0;
                if (e7 == -1) {
                    j10 = 0;
                } else {
                    j10 = jArr[e7];
                }
                if (e7 != -1) {
                    j11 = jArr2[e7];
                }
                int i10 = uVar.f4328e;
                long j12 = (j10 * 1000000) / i10;
                long j13 = this.f4323b;
                c0 c0Var = new c0(j12, j11 + j13);
                if (j12 != j3 && e7 != jArr.length - 1) {
                    int i11 = e7 + 1;
                    return new a0(c0Var, new c0((jArr[i11] * 1000000) / i10, j13 + jArr2[i11]));
                }
                return new a0(c0Var, c0Var);
            case 1:
                return (a0) this.f4324c;
            default:
                e3.b bVar2 = (e3.b) this.f4324c;
                a0 b10 = bVar2.f8833i[0].b(j3);
                int i12 = 1;
                while (true) {
                    e3.e[] eVarArr = bVar2.f8833i;
                    if (i12 < eVarArr.length) {
                        a0 b11 = eVarArr[i12].b(j3);
                        if (b11.f4225a.f4257b < b10.f4225a.f4257b) {
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
    public final long l() {
        switch (this.f4322a) {
            case 0:
                return ((u) this.f4324c).b();
            case 1:
                return this.f4323b;
            default:
                return this.f4323b;
        }
    }

    public t(long j3) {
        this(j3, 0L);
        this.f4322a = 1;
    }

    public t(long j3, long j10) {
        this.f4322a = 1;
        this.f4323b = j3;
        c0 c0Var = j10 == 0 ? c0.f4255c : new c0(0L, j10);
        this.f4324c = new a0(c0Var, c0Var);
    }
}
