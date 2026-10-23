package c3;
public class v implements e0 {
    public final int f4665a;
    public final long f4666b;
    public final Object f4667c;

    public v(Object obj, long j10, int i10) {
        this.f4665a = i10;
        this.f4667c = obj;
        this.f4666b = j10;
    }

    @Override
    public final boolean d() {
        switch (this.f4665a) {
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
        switch (this.f4665a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final d0 f(long j10) {
        long j11;
        switch (this.f4665a) {
            case 0:
                w wVar = (w) this.f4667c;
                wVar.f4675k.getClass();
                n4.s sVar = wVar.f4675k;
                long[] jArr = (long[]) sVar.f17188b;
                long[] jArr2 = (long[]) sVar.f17189c;
                int f7 = e2.m0.f(jArr, e2.m0.j((wVar.e * j10) / 1000000, 0L, wVar.f4674j - 1), false);
                long j12 = 0;
                if (f7 == -1) {
                    j11 = 0;
                } else {
                    j11 = jArr[f7];
                }
                if (f7 != -1) {
                    j12 = jArr2[f7];
                }
                int i10 = wVar.e;
                long j13 = (j11 * 1000000) / i10;
                long j14 = this.f4666b;
                f0 f0Var = new f0(j13, j12 + j14);
                if (j13 != j10 && f7 != jArr.length - 1) {
                    int i11 = f7 + 1;
                    return new d0(f0Var, new f0((jArr[i11] * 1000000) / i10, j14 + jArr2[i11]));
                }
                return new d0(f0Var, f0Var);
            case 1:
                return (d0) this.f4667c;
            default:
                e3.b bVar = (e3.b) this.f4667c;
                d0 b10 = bVar.f8311i[0].b(j10);
                int i12 = 1;
                while (true) {
                    e3.e[] eVarArr = bVar.f8311i;
                    if (i12 < eVarArr.length) {
                        d0 b11 = eVarArr[i12].b(j10);
                        if (b11.f4609a.f4622b < b10.f4609a.f4622b) {
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
    public final long h() {
        switch (this.f4665a) {
            case 0:
                return ((w) this.f4667c).b();
            case 1:
                return this.f4666b;
            default:
                return this.f4666b;
        }
    }

    public v(long j10) {
        this(j10, 0L);
        this.f4665a = 1;
    }

    public v(long j10, long j11) {
        this.f4665a = 1;
        this.f4666b = j10;
        f0 f0Var = j11 == 0 ? f0.f4620c : new f0(0L, j11);
        this.f4667c = new d0(f0Var, f0Var);
    }
}
