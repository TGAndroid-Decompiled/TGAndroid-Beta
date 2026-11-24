package defpackage;
public final class qla implements Runnable {
    public final byte a;
    public final sla b;

    public qla(sla slaVar, byte b) {
        this.a = b;
        this.b = slaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        sla slaVar = this.b;
        switch (b) {
            case 0:
                slaVar.W0 = false;
                if (!slaVar.Z0 && slaVar.X0) {
                    slaVar.x(true);
                    return;
                }
                return;
            case 1:
                slaVar.W0 = false;
                return;
            case 2:
                slaVar.Z0 = false;
                if (!slaVar.W0 && slaVar.X0) {
                    slaVar.x(true);
                    return;
                }
                return;
            default:
                slaVar.Z0 = false;
                return;
        }
    }
}
