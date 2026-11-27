package defpackage;
public final class ci6 extends xo4 {
    public final byte f;

    public ci6(asb asbVar, byte b) {
        super(asbVar);
        this.f = b;
    }

    @Override
    public final int e(int i, int i2, boolean z) {
        switch (this.f) {
            case 0:
                asb asbVar = this.e;
                int e = asbVar.e(i, i2, z);
                if (e == -1) {
                    return asbVar.a(z);
                }
                return e;
            default:
                return super.e(i, i2, z);
        }
    }

    @Override
    public final xrb f(int i, xrb xrbVar, boolean z) {
        switch (this.f) {
            case 1:
                super.f(i, xrbVar, z);
                xrbVar.f = true;
                return xrbVar;
            default:
                return super.f(i, xrbVar, z);
        }
    }

    @Override
    public final int k(int i, int i2, boolean z) {
        switch (this.f) {
            case 0:
                asb asbVar = this.e;
                int k = asbVar.k(i, i2, z);
                if (k == -1) {
                    return asbVar.c(z);
                }
                return k;
            default:
                return super.k(i, i2, z);
        }
    }

    @Override
    public final zrb m(int i, zrb zrbVar, long j) {
        switch (this.f) {
            case 1:
                super.m(i, zrbVar, j);
                zrbVar.j = true;
                return zrbVar;
            default:
                return super.m(i, zrbVar, j);
        }
    }
}
