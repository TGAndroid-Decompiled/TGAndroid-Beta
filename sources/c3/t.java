package c3;
public class t implements b0 {
    public final int f3793a;
    public final long f3794b;
    public final Object f3795c;

    public t(Object obj, long j3, int i10) {
        this.f3793a = i10;
        this.f3795c = obj;
        this.f3794b = j3;
    }

    @Override
    public final boolean f() {
        switch (this.f3793a) {
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
        switch (this.f3793a) {
            case 0:
                u uVar = (u) this.f3795c;
                e2.d.h(uVar.f3803k);
                of.b bVar = uVar.f3803k;
                long[] jArr = (long[]) bVar.f15732b;
                long[] jArr2 = (long[]) bVar.f15733c;
                int e = e2.d0.e(jArr, e2.d0.i((uVar.e * j3) / 1000000, 0L, uVar.f3802j - 1), false);
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
                long j13 = this.f3794b;
                c0 c0Var = new c0(j12, j11 + j13);
                if (j12 != j3 && e != jArr.length - 1) {
                    int i11 = e + 1;
                    return new a0(c0Var, new c0((jArr[i11] * 1000000) / i10, j13 + jArr2[i11]));
                }
                return new a0(c0Var, c0Var);
            case 1:
                return (a0) this.f3795c;
            default:
                e3.b bVar2 = (e3.b) this.f3795c;
                a0 b10 = bVar2.f7933i[0].b(j3);
                int i12 = 1;
                while (true) {
                    e3.e[] eVarArr = bVar2.f7933i;
                    if (i12 < eVarArr.length) {
                        a0 b11 = eVarArr[i12].b(j3);
                        if (b11.f3705a.f3735b < b10.f3705a.f3735b) {
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
        switch (this.f3793a) {
            case 0:
                return ((u) this.f3795c).b();
            case 1:
                return this.f3794b;
            default:
                return this.f3794b;
        }
    }

    public t(long j3) {
        this(j3, 0L);
        this.f3793a = 1;
    }

    public t(long j3, long j10) {
        this.f3793a = 1;
        this.f3794b = j3;
        c0 c0Var = j10 == 0 ? c0.f3733c : new c0(0L, j10);
        this.f3795c = new a0(c0Var, c0Var);
    }
}
