package defpackage;
public final class w9a extends yo {
    public final byte c;
    public final taa d;

    public w9a(taa taaVar, byte b) {
        this.c = b;
        this.d = taaVar;
    }

    @Override
    public final int i(int i) {
        byte b = this.c;
        taa taaVar = this.d;
        switch (b) {
            case 0:
                if (i != 0) {
                    return 1;
                }
                return taaVar.C1.J;
            case 1:
                qaa qaaVar = taaVar.H1;
                if (i != qaaVar.x && i != qaaVar.y && i != qaaVar.E && i != qaaVar.G && qaaVar.d(i) != 0) {
                    return 1;
                }
                return 4;
            default:
                if (i != 0) {
                    return 1;
                }
                return taaVar.D1.J;
        }
    }
}
