package defpackage;
public final class yf6 extends sm4 {
    public final byte f;

    public yf6(aob aobVar, byte b) {
        super(aobVar);
        this.f = b;
    }

    @Override
    public final int e(int i, int i2, boolean z) {
        switch (this.f) {
            case 0:
                aob aobVar = this.e;
                int e = aobVar.e(i, i2, z);
                if (e == -1) {
                    return aobVar.a(z);
                }
                return e;
            default:
                return super.e(i, i2, z);
        }
    }

    @Override
    public final xnb f(int i, xnb xnbVar, boolean z) {
        switch (this.f) {
            case 1:
                super.f(i, xnbVar, z);
                xnbVar.f = true;
                return xnbVar;
            default:
                return super.f(i, xnbVar, z);
        }
    }

    @Override
    public final int k(int i, int i2, boolean z) {
        switch (this.f) {
            case 0:
                aob aobVar = this.e;
                int k = aobVar.k(i, i2, z);
                if (k == -1) {
                    return aobVar.c(z);
                }
                return k;
            default:
                return super.k(i, i2, z);
        }
    }

    @Override
    public final znb m(int i, znb znbVar, long j) {
        switch (this.f) {
            case 1:
                super.m(i, znbVar, j);
                znbVar.j = true;
                return znbVar;
            default:
                return super.m(i, znbVar, j);
        }
    }
}
