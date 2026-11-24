package defpackage;
public final class s9a implements Runnable {
    public final byte a;
    public final daa b;

    public s9a(daa daaVar, byte b) {
        this.a = b;
        this.b = daaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        daa daaVar = this.b;
        switch (b) {
            case 0:
                daaVar.c0();
                return;
            case 1:
                l11.u(daaVar.getParentActivity(), jb6.M0(2131752091, null));
                return;
            default:
                daaVar.c.g3.O(true);
                return;
        }
    }
}
