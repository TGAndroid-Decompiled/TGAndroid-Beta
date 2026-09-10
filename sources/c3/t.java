package c3;
public class t implements b0 {
    public final int f4213a;
    public final long f4214b;
    public final Object f4215c;

    public t(Object obj, long j3, int i10) {
        this.f4213a = i10;
        this.f4215c = obj;
        this.f4214b = j3;
    }

    @Override
    public final boolean f() {
        switch (this.f4213a) {
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
        switch (this.f4213a) {
            case 0:
                u uVar = (u) this.f4215c;
                e2.d.h(uVar.f4223k);
                n4.y yVar = uVar.f4223k;
                long[] jArr = (long[]) yVar.f13824b;
                long[] jArr2 = (long[]) yVar.f13825c;
                int e = e2.d0.e(jArr, e2.d0.i((uVar.e * j3) / 1000000, 0L, uVar.f4222j - 1), false);
                long j11 = 0;
                if (e == -1) {
                    j10 = 0;
                } else {
                    j10 = jArr[e];
                }
                if (e != -1) {
                    j11 = jArr2[e];
                }
                int i10 = uVar.e;
                long j12 = (j10 * 1000000) / i10;
                long j13 = this.f4214b;
                c0 c0Var = new c0(j12, j11 + j13);
                if (j12 != j3 && e != jArr.length - 1) {
                    int i11 = e + 1;
                    return new a0(c0Var, new c0((jArr[i11] * 1000000) / i10, j13 + jArr2[i11]));
                }
                return new a0(c0Var, c0Var);
            case 1:
                return (a0) this.f4215c;
            default:
                e3.b bVar = (e3.b) this.f4215c;
                a0 b10 = bVar.f7249i[0].b(j3);
                int i12 = 1;
                while (true) {
                    e3.e[] eVarArr = bVar.f7249i;
                    if (i12 < eVarArr.length) {
                        a0 b11 = eVarArr[i12].b(j3);
                        if (b11.f4125a.f4155b < b10.f4125a.f4155b) {
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
        switch (this.f4213a) {
            case 0:
                return ((u) this.f4215c).b();
            case 1:
                return this.f4214b;
            default:
                return this.f4214b;
        }
    }

    public t(long j3) {
        this(j3, 0L);
        this.f4213a = 1;
    }

    public t(long j3, long j10) {
        this.f4213a = 1;
        this.f4214b = j3;
        c0 c0Var = j10 == 0 ? c0.f4153c : new c0(0L, j10);
        this.f4215c = new a0(c0Var, c0Var);
    }
}
