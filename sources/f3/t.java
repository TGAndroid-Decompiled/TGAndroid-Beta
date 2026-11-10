package f3;

import h2.m0;
public class t implements c0 {
    public final int f11076a;
    public final long f11077b;
    public final Object f11078c;

    public t(Object obj, long j3, int i7) {
        this.f11076a = i7;
        this.f11078c = obj;
        this.f11077b = j3;
    }

    @Override
    public final boolean d() {
        switch (this.f11076a) {
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
        switch (this.f11076a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final b0 f(long j3) {
        long j10;
        switch (this.f11076a) {
            case 0:
                u uVar = (u) this.f11078c;
                uVar.f11087k.getClass();
                q4.q qVar = uVar.f11087k;
                long[] jArr = (long[]) qVar.f53815b;
                long[] jArr2 = (long[]) qVar.f53816c;
                int f10 = m0.f(jArr, m0.j((uVar.f11082e * j3) / 1000000, 0L, uVar.f11086j - 1), false);
                long j11 = 0;
                if (f10 == -1) {
                    j10 = 0;
                } else {
                    j10 = jArr[f10];
                }
                if (f10 != -1) {
                    j11 = jArr2[f10];
                }
                int i7 = uVar.f11082e;
                long j12 = (j10 * 1000000) / i7;
                long j13 = this.f11077b;
                d0 d0Var = new d0(j12, j11 + j13);
                if (j12 != j3 && f10 != jArr.length - 1) {
                    int i10 = f10 + 1;
                    return new b0(d0Var, new d0((jArr[i10] * 1000000) / i7, j13 + jArr2[i10]));
                }
                return new b0(d0Var, d0Var);
            case 1:
                return (b0) this.f11078c;
            default:
                h3.b bVar = (h3.b) this.f11078c;
                b0 b10 = bVar.f14178i[0].b(j3);
                int i11 = 1;
                while (true) {
                    h3.e[] eVarArr = bVar.f14178i;
                    if (i11 < eVarArr.length) {
                        b0 b11 = eVarArr[i11].b(j3);
                        if (b11.f10997a.f11017b < b10.f10997a.f11017b) {
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
        switch (this.f11076a) {
            case 0:
                return ((u) this.f11078c).b();
            case 1:
                return this.f11077b;
            default:
                return this.f11077b;
        }
    }

    public t(long j3) {
        this(j3, 0L);
        this.f11076a = 1;
    }

    public t(long j3, long j10) {
        this.f11076a = 1;
        this.f11077b = j3;
        d0 d0Var = j10 == 0 ? d0.f11015c : new d0(0L, j10);
        this.f11078c = new b0(d0Var, d0Var);
    }
}
