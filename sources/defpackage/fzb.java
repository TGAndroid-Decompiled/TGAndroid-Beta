package defpackage;
public final class fzb implements Runnable {
    public final byte a;
    public final gzb b;

    public fzb(gzb gzbVar, byte b) {
        this.a = b;
        this.b = gzbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        gzb gzbVar = this.b;
        switch (b) {
            case 0:
                gzbVar.F = null;
                if (gzbVar.G != -1) {
                    gzbVar.H.getNotificationCenter().j(gzbVar.G);
                    gzbVar.G = -1;
                    return;
                }
                return;
            default:
                gzbVar.F = null;
                if (gzbVar.G != -1) {
                    gzbVar.H.getNotificationCenter().j(gzbVar.G);
                    gzbVar.G = -1;
                    return;
                }
                return;
        }
    }
}
