package defpackage;
public final class vwb implements Runnable {
    public final byte a;
    public final kxb b;

    public vwb(kxb kxbVar, byte b) {
        this.a = b;
        this.b = kxbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        kxb kxbVar = this.b;
        switch (b) {
            case 0:
                if (kxbVar.i()) {
                    kxbVar.j();
                    return;
                }
                return;
            default:
                axb axbVar = kxbVar.K;
                axbVar.z1(true);
                ywb ywbVar = kxbVar.y;
                ywbVar.z1(true);
                kxbVar.N.a(true, true);
                gl.V3(ywbVar);
                gl.V3(axbVar);
                return;
        }
    }
}
