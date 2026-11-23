package f3;

import h2.l0;
public class t implements b0 {
    public final int f11229a;
    public final long f11230b;
    public final Object f11231c;

    public t(Object obj, long j3, int i7) {
        this.f11229a = i7;
        this.f11231c = obj;
        this.f11230b = j3;
    }

    @Override
    public final boolean d() {
        switch (this.f11229a) {
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
        switch (this.f11229a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final a0 f(long j3) {
        long j10;
        switch (this.f11229a) {
            case 0:
                u uVar = (u) this.f11231c;
                uVar.f11240k.getClass();
                wf.b bVar = uVar.f11240k;
                long[] jArr = (long[]) bVar.f59715b;
                long[] jArr2 = (long[]) bVar.f59716c;
                int f10 = l0.f(jArr, l0.j((uVar.f11235e * j3) / 1000000, 0L, uVar.f11239j - 1), false);
                long j11 = 0;
                if (f10 == -1) {
                    j10 = 0;
                } else {
                    j10 = jArr[f10];
                }
                if (f10 != -1) {
                    j11 = jArr2[f10];
                }
                int i7 = uVar.f11235e;
                long j12 = (j10 * 1000000) / i7;
                long j13 = this.f11230b;
                c0 c0Var = new c0(j12, j11 + j13);
                if (j12 != j3 && f10 != jArr.length - 1) {
                    int i10 = f10 + 1;
                    return new a0(c0Var, new c0((jArr[i10] * 1000000) / i7, j13 + jArr2[i10]));
                }
                return new a0(c0Var, c0Var);
            case 1:
                return (a0) this.f11231c;
            default:
                h3.b bVar2 = (h3.b) this.f11231c;
                a0 b10 = bVar2.f13879i[0].b(j3);
                int i11 = 1;
                while (true) {
                    h3.e[] eVarArr = bVar2.f13879i;
                    if (i11 < eVarArr.length) {
                        a0 b11 = eVarArr[i11].b(j3);
                        if (b11.f11128a.f11160b < b10.f11128a.f11160b) {
                            b10 = b11;
                        }
                        i11++;
                    } else {
                        return b10;
                    }
                }
        }
    }

    @Override
    public final long h() {
        switch (this.f11229a) {
            case 0:
                return ((u) this.f11231c).b();
            case 1:
                return this.f11230b;
            default:
                return this.f11230b;
        }
    }

    public t(long j3) {
        this(j3, 0L);
        this.f11229a = 1;
    }

    public t(long j3, long j10) {
        this.f11229a = 1;
        this.f11230b = j3;
        c0 c0Var = j10 == 0 ? c0.f11158c : new c0(0L, j10);
        this.f11231c = new a0(c0Var, c0Var);
    }
}
