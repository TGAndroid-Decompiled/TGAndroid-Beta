package c3;
public class t implements b0 {
    public final int f3799a;
    public final long f3800b;
    public final Object f3801c;

    public t(Object obj, long j3, int i10) {
        this.f3799a = i10;
        this.f3801c = obj;
        this.f3800b = j3;
    }

    @Override
    public final boolean f() {
        switch (this.f3799a) {
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
        switch (this.f3799a) {
            case 0:
                u uVar = (u) this.f3801c;
                e2.d.h(uVar.f3809k);
                of.b bVar = uVar.f3809k;
                long[] jArr = (long[]) bVar.f15521b;
                long[] jArr2 = (long[]) bVar.f15522c;
                int e = e2.d0.e(jArr, e2.d0.i((uVar.e * j3) / 1000000, 0L, uVar.f3808j - 1), false);
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
                long j13 = this.f3800b;
                c0 c0Var = new c0(j12, j11 + j13);
                if (j12 != j3 && e != jArr.length - 1) {
                    int i11 = e + 1;
                    return new a0(c0Var, new c0((jArr[i11] * 1000000) / i10, j13 + jArr2[i11]));
                }
                return new a0(c0Var, c0Var);
            case 1:
                return (a0) this.f3801c;
            default:
                e3.b bVar2 = (e3.b) this.f3801c;
                a0 b10 = bVar2.f7949i[0].b(j3);
                int i12 = 1;
                while (true) {
                    e3.e[] eVarArr = bVar2.f7949i;
                    if (i12 < eVarArr.length) {
                        a0 b11 = eVarArr[i12].b(j3);
                        if (b11.f3711a.f3741b < b10.f3711a.f3741b) {
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
        switch (this.f3799a) {
            case 0:
                return ((u) this.f3801c).b();
            case 1:
                return this.f3800b;
            default:
                return this.f3800b;
        }
    }

    public t(long j3) {
        this(j3, 0L);
        this.f3799a = 1;
    }

    public t(long j3, long j10) {
        this.f3799a = 1;
        this.f3800b = j3;
        c0 c0Var = j10 == 0 ? c0.f3739c : new c0(0L, j10);
        this.f3801c = new a0(c0Var, c0Var);
    }
}
