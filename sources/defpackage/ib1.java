package defpackage;
public final class ib1 extends cl0 {
    public final byte s;

    public ib1(int i, vnb vnbVar) {
        super(i, vnbVar);
        this.s = (byte) 2;
    }

    @Override
    public final int X() {
        switch (this.s) {
            case 2:
                if (c()) {
                    return 117440511;
                }
                return 285212672;
            default:
                return super.X();
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
    public final int x0() {
        switch (this.s) {
            case 2:
                if (c()) {
                    return 301989887;
                }
                return 536870912;
            default:
                return super.x0();
        }
    }

    @Override
    public final int x1() {
        switch (this.s) {
            case 2:
                if (c()) {
                    return 83886079;
                }
                return 536870912;
            default:
                return super.x1();
        }
    }

    public ib1(vnb vnbVar, int i, float f, byte b) {
        super(vnbVar, i, f);
        this.s = b;
    }
}
