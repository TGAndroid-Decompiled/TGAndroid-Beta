package defpackage;
public final class exb implements Runnable {
    public final byte a;
    public final fxb b;

    public exb(fxb fxbVar, byte b) {
        this.a = b;
        this.b = fxbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        fxb fxbVar = this.b;
        switch (b) {
            case 0:
                fxbVar.F = null;
                if (fxbVar.G != -1) {
                    fxbVar.H.getNotificationCenter().j(fxbVar.G);
                    fxbVar.G = -1;
                    return;
                }
                return;
            default:
                fxbVar.F = null;
                if (fxbVar.G != -1) {
                    fxbVar.H.getNotificationCenter().j(fxbVar.G);
                    fxbVar.G = -1;
                    return;
                }
                return;
        }
    }
}
