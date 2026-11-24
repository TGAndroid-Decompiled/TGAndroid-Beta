package defpackage;
public final class wba extends yp {
    public final byte c;
    public final tca d;

    public wba(tca tcaVar, byte b) {
        this.c = b;
        this.d = tcaVar;
    }

    @Override
    public final int i(int i) {
        byte b = this.c;
        tca tcaVar = this.d;
        switch (b) {
            case 0:
                if (i != 0) {
                    return 1;
                }
                return tcaVar.C1.J;
            case 1:
                qca qcaVar = tcaVar.H1;
                if (i != qcaVar.x && i != qcaVar.y && i != qcaVar.E && i != qcaVar.G && qcaVar.d(i) != 0) {
                    return 1;
                }
                return 4;
            default:
                if (i != 0) {
                    return 1;
                }
                return tcaVar.D1.J;
        }
    }
}
