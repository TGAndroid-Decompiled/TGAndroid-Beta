package c3;
public class t implements b0 {
    public final int f3794a;
    public final long f3795b;
    public final Object f3796c;

    public t(Object obj, long j3, int i10) {
        this.f3794a = i10;
        this.f3796c = obj;
        this.f3795b = j3;
    }

    @Override
    public final boolean f() {
        switch (this.f3794a) {
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
        switch (this.f3794a) {
            case 0:
                u uVar = (u) this.f3796c;
                e2.d.h(uVar.f3804k);
                of.b bVar = uVar.f3804k;
                long[] jArr = (long[]) bVar.f15511b;
                long[] jArr2 = (long[]) bVar.f15512c;
                int e = e2.d0.e(jArr, e2.d0.i((uVar.e * j3) / 1000000, 0L, uVar.f3803j - 1), false);
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
                long j13 = this.f3795b;
                c0 c0Var = new c0(j12, j11 + j13);
                if (j12 != j3 && e != jArr.length - 1) {
                    int i11 = e + 1;
                    return new a0(c0Var, new c0((jArr[i11] * 1000000) / i10, j13 + jArr2[i11]));
                }
                return new a0(c0Var, c0Var);
            case 1:
                return (a0) this.f3796c;
            default:
                e3.b bVar2 = (e3.b) this.f3796c;
                a0 b10 = bVar2.f7944i[0].b(j3);
                int i12 = 1;
                while (true) {
                    e3.e[] eVarArr = bVar2.f7944i;
                    if (i12 < eVarArr.length) {
                        a0 b11 = eVarArr[i12].b(j3);
                        if (b11.f3706a.f3736b < b10.f3706a.f3736b) {
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
        switch (this.f3794a) {
            case 0:
                return ((u) this.f3796c).b();
            case 1:
                return this.f3795b;
            default:
                return this.f3795b;
        }
    }

    public t(long j3) {
        this(j3, 0L);
        this.f3794a = 1;
    }

    public t(long j3, long j10) {
        this.f3794a = 1;
        this.f3795b = j3;
        c0 c0Var = j10 == 0 ? c0.f3734c : new c0(0L, j10);
        this.f3796c = new a0(c0Var, c0Var);
    }
}
