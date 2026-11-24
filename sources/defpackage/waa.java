package defpackage;
public final class waa implements Runnable {
    public final byte a;
    public final xaa b;

    public waa(xaa xaaVar, byte b) {
        this.a = b;
        this.b = xaaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        xaa xaaVar = this.b;
        switch (b) {
            case 0:
                if (xaaVar.x) {
                    xaaVar.d();
                    return;
                }
                return;
            default:
                xaaVar.invalidateSelf();
                return;
        }
    }
}
