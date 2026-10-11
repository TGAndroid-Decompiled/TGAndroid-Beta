package c3;
public class t implements b0 {
    public final int f4151a;
    public final long f4152b;
    public final Object f4153c;

    public t(Object obj, long j3, int i10) {
        this.f4151a = i10;
        this.f4153c = obj;
        this.f4152b = j3;
    }

    @Override
    public final boolean f() {
        switch (this.f4151a) {
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
        switch (this.f4151a) {
            case 0:
                u uVar = (u) this.f4153c;
                e2.d.h(uVar.f4162k);
                pf.b bVar = uVar.f4162k;
                long[] jArr = (long[]) bVar.f45626b;
                long[] jArr2 = (long[]) bVar.f45627c;
                int e7 = e2.d0.e(jArr, e2.d0.i((uVar.f4157e * j3) / 1000000, 0L, uVar.f4161j - 1), false);
                long j11 = 0;
                if (e7 == -1) {
                    j10 = 0;
                } else {
                    j10 = jArr[e7];
                }
                if (e7 != -1) {
                    j11 = jArr2[e7];
                }
                int i10 = uVar.f4157e;
                long j12 = (j10 * 1000000) / i10;
                long j13 = this.f4152b;
                c0 c0Var = new c0(j12, j11 + j13);
                if (j12 != j3 && e7 != jArr.length - 1) {
                    int i11 = e7 + 1;
                    return new a0(c0Var, new c0((jArr[i11] * 1000000) / i10, j13 + jArr2[i11]));
                }
                return new a0(c0Var, c0Var);
            case 1:
                return (a0) this.f4153c;
            default:
                e3.b bVar2 = (e3.b) this.f4153c;
                a0 b10 = bVar2.f8599i[0].b(j3);
                int i12 = 1;
                while (true) {
                    e3.e[] eVarArr = bVar2.f8599i;
                    if (i12 < eVarArr.length) {
                        a0 b11 = eVarArr[i12].b(j3);
                        if (b11.f4053a.f4085b < b10.f4053a.f4085b) {
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
        switch (this.f4151a) {
            case 0:
                return ((u) this.f4153c).b();
            case 1:
                return this.f4152b;
            default:
                return this.f4152b;
        }
    }

    public t(long j3) {
        this(j3, 0L);
        this.f4151a = 1;
    }

    public t(long j3, long j10) {
        this.f4151a = 1;
        this.f4152b = j3;
        c0 c0Var = j10 == 0 ? c0.f4083c : new c0(0L, j10);
        this.f4153c = new a0(c0Var, c0Var);
    }
}
