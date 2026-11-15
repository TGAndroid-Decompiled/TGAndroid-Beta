package f3;

import h2.l0;
public class t implements b0 {
    public final int f10878a;
    public final long f10879b;
    public final Object f10880c;

    public t(Object obj, long j3, int i7) {
        this.f10878a = i7;
        this.f10880c = obj;
        this.f10879b = j3;
    }

    @Override
    public final boolean d() {
        switch (this.f10878a) {
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
        switch (this.f10878a) {
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
        switch (this.f10878a) {
            case 0:
                u uVar = (u) this.f10880c;
                uVar.f10889k.getClass();
                wf.b bVar = uVar.f10889k;
                long[] jArr = (long[]) bVar.f59107b;
                long[] jArr2 = (long[]) bVar.f59108c;
                int f10 = l0.f(jArr, l0.j((uVar.f10884e * j3) / 1000000, 0L, uVar.f10888j - 1), false);
                long j11 = 0;
                if (f10 == -1) {
                    j10 = 0;
                } else {
                    j10 = jArr[f10];
                }
                if (f10 != -1) {
                    j11 = jArr2[f10];
                }
                int i7 = uVar.f10884e;
                long j12 = (j10 * 1000000) / i7;
                long j13 = this.f10879b;
                c0 c0Var = new c0(j12, j11 + j13);
                if (j12 != j3 && f10 != jArr.length - 1) {
                    int i10 = f10 + 1;
                    return new a0(c0Var, new c0((jArr[i10] * 1000000) / i7, j13 + jArr2[i10]));
                }
                return new a0(c0Var, c0Var);
            case 1:
                return (a0) this.f10880c;
            default:
                h3.b bVar2 = (h3.b) this.f10880c;
                a0 b10 = bVar2.f13535i[0].b(j3);
                int i11 = 1;
                while (true) {
                    h3.e[] eVarArr = bVar2.f13535i;
                    if (i11 < eVarArr.length) {
                        a0 b11 = eVarArr[i11].b(j3);
                        if (b11.f10777a.f10809b < b10.f10777a.f10809b) {
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
        switch (this.f10878a) {
            case 0:
                return ((u) this.f10880c).b();
            case 1:
                return this.f10879b;
            default:
                return this.f10879b;
        }
    }

    public t(long j3) {
        this(j3, 0L);
        this.f10878a = 1;
    }

    public t(long j3, long j10) {
        this.f10878a = 1;
        this.f10879b = j3;
        c0 c0Var = j10 == 0 ? c0.f10807c : new c0(0L, j10);
        this.f10880c = new a0(c0Var, c0Var);
    }
}
