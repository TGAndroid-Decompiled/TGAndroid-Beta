package defpackage;
public final class gc implements Runnable {
    public final byte a;
    public final hc b;

    public gc(hc hcVar, byte b) {
        this.a = b;
        this.b = hcVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hc hcVar = this.b;
        switch (b) {
            case 0:
                hcVar.invalidateSelf();
                return;
            case 1:
            default:
                hcVar.a();
                return;
        }
    }
}
