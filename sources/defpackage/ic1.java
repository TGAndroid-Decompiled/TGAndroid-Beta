package defpackage;
public final class ic1 extends bm0 {
    public final byte s;

    public ic1(int i, ylb ylbVar) {
        super(i, ylbVar);
        this.s = (byte) 2;
    }

    @Override
    public final int V() {
        switch (this.s) {
            case 2:
                if (c()) {
                    return 117440511;
                }
                return 285212672;
            default:
                return super.V();
        }
    }

    @Override
    public final boolean c() {
        switch (this.s) {
            case 0:
            case 1:
                return true;
            default:
                return super.c();
        }
    }

    @Override
    public final int r1() {
        switch (this.s) {
            case 2:
                if (c()) {
                    return 83886079;
                }
                return 536870912;
            default:
                return super.r1();
        }
    }

    @Override
    public final int u0() {
        switch (this.s) {
            case 2:
                if (c()) {
                    return 301989887;
                }
                return 536870912;
            default:
                return super.u0();
        }
    }

    public ic1(ylb ylbVar, int i, float f, byte b) {
        super(ylbVar, i, f);
        this.s = b;
    }
}
