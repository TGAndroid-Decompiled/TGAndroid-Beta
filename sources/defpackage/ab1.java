package defpackage;
public final class ab1 extends bl0 {
    public final byte s;

    public ab1(int i, wjb wjbVar) {
        super(i, wjbVar);
        this.s = (byte) 2;
    }

    @Override
    public final int K() {
        switch (this.s) {
            case 2:
                if (c()) {
                    return 117440511;
                }
                return 285212672;
            default:
                return super.K();
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
    public final int d1() {
        switch (this.s) {
            case 2:
                if (c()) {
                    return 83886079;
                }
                return 536870912;
            default:
                return super.d1();
        }
    }

    @Override
    public final int k0() {
        switch (this.s) {
            case 2:
                if (c()) {
                    return 301989887;
                }
                return 536870912;
            default:
                return super.k0();
        }
    }

    public ab1(wjb wjbVar, int i, float f, byte b) {
        super(wjbVar, i, f);
        this.s = b;
    }
}
