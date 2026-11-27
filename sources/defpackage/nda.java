package defpackage;
public final class nda extends zo {
    public final byte c;
    public final kea d;

    public nda(kea keaVar, byte b) {
        this.c = b;
        this.d = keaVar;
    }

    @Override
    public final int i(int i) {
        byte b = this.c;
        kea keaVar = this.d;
        switch (b) {
            case 0:
                if (i != 0) {
                    return 1;
                }
                return keaVar.C1.J;
            case 1:
                hea heaVar = keaVar.H1;
                if (i != heaVar.x && i != heaVar.y && i != heaVar.E && i != heaVar.G && heaVar.d(i) != 0) {
                    return 1;
                }
                return 4;
            default:
                if (i != 0) {
                    return 1;
                }
                return keaVar.D1.J;
        }
    }
}
