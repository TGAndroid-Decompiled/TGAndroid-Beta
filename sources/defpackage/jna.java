package defpackage;
public final class jna implements Runnable {
    public final byte a;
    public final lna b;

    public jna(lna lnaVar, byte b) {
        this.a = b;
        this.b = lnaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lna lnaVar = this.b;
        switch (b) {
            case 0:
                lnaVar.W0 = false;
                if (!lnaVar.Z0 && lnaVar.X0) {
                    lnaVar.x(true);
                    return;
                }
                return;
            case 1:
                lnaVar.W0 = false;
                return;
            case 2:
                lnaVar.Z0 = false;
                if (!lnaVar.W0 && lnaVar.X0) {
                    lnaVar.x(true);
                    return;
                }
                return;
            default:
                lnaVar.Z0 = false;
                return;
        }
    }
}
