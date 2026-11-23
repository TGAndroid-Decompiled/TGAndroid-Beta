package f3;

import h2.l0;
public class t implements b0 {
    public final int f11192a;
    public final long f11193b;
    public final Object f11194c;

    public t(Object obj, long j3, int i7) {
        this.f11192a = i7;
        this.f11194c = obj;
        this.f11193b = j3;
    }

    @Override
    public final boolean d() {
        switch (this.f11192a) {
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
        switch (this.f11192a) {
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
        switch (this.f11192a) {
            case 0:
                u uVar = (u) this.f11194c;
                uVar.f11203k.getClass();
                wf.b bVar = uVar.f11203k;
                long[] jArr = (long[]) bVar.f59680b;
                long[] jArr2 = (long[]) bVar.f59681c;
                int f10 = l0.f(jArr, l0.j((uVar.f11198e * j3) / 1000000, 0L, uVar.f11202j - 1), false);
                long j11 = 0;
                if (f10 == -1) {
                    j10 = 0;
                } else {
                    j10 = jArr[f10];
                }
                if (f10 != -1) {
                    j11 = jArr2[f10];
                }
                int i7 = uVar.f11198e;
                long j12 = (j10 * 1000000) / i7;
                long j13 = this.f11193b;
                c0 c0Var = new c0(j12, j11 + j13);
                if (j12 != j3 && f10 != jArr.length - 1) {
                    int i10 = f10 + 1;
                    return new a0(c0Var, new c0((jArr[i10] * 1000000) / i7, j13 + jArr2[i10]));
                }
                return new a0(c0Var, c0Var);
            case 1:
                return (a0) this.f11194c;
            default:
                h3.b bVar2 = (h3.b) this.f11194c;
                a0 b10 = bVar2.f13842i[0].b(j3);
                int i11 = 1;
                while (true) {
                    h3.e[] eVarArr = bVar2.f13842i;
                    if (i11 < eVarArr.length) {
                        a0 b11 = eVarArr[i11].b(j3);
                        if (b11.f11091a.f11123b < b10.f11091a.f11123b) {
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
        switch (this.f11192a) {
            case 0:
                return ((u) this.f11194c).b();
            case 1:
                return this.f11193b;
            default:
                return this.f11193b;
        }
    }

    public t(long j3) {
        this(j3, 0L);
        this.f11192a = 1;
    }

    public t(long j3, long j10) {
        this.f11192a = 1;
        this.f11193b = j3;
        c0 c0Var = j10 == 0 ? c0.f11121c : new c0(0L, j10);
        this.f11194c = new a0(c0Var, c0Var);
    }
}
