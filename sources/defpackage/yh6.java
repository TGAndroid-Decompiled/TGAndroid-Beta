package defpackage;
public final class yh6 extends to4 {
    public final byte f;

    public yh6(bqb bqbVar, byte b) {
        super(bqbVar);
        this.f = b;
    }

    @Override
    public final int e(int i, int i2, boolean z) {
        switch (this.f) {
            case 0:
                bqb bqbVar = this.e;
                int e = bqbVar.e(i, i2, z);
                if (e == -1) {
                    return bqbVar.a(z);
                }
                return e;
            default:
                return super.e(i, i2, z);
        }
    }

    @Override
    public final ypb f(int i, ypb ypbVar, boolean z) {
        switch (this.f) {
            case 1:
                super.f(i, ypbVar, z);
                ypbVar.f = true;
                return ypbVar;
            default:
                return super.f(i, ypbVar, z);
        }
    }

    @Override
    public final int k(int i, int i2, boolean z) {
        switch (this.f) {
            case 0:
                bqb bqbVar = this.e;
                int k = bqbVar.k(i, i2, z);
                if (k == -1) {
                    return bqbVar.c(z);
                }
                return k;
            default:
                return super.k(i, i2, z);
        }
    }

    @Override
    public final aqb m(int i, aqb aqbVar, long j) {
        switch (this.f) {
            case 1:
                super.m(i, aqbVar, j);
                aqbVar.j = true;
                return aqbVar;
            default:
                return super.m(i, aqbVar, j);
        }
    }
}
