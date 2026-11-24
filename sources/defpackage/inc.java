package defpackage;
public final class inc implements Runnable {
    public final byte a;
    public final lnc b;

    public inc(lnc lncVar, byte b) {
        this.a = b;
        this.b = lncVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lnc lncVar = this.b;
        switch (b) {
            case 0:
                lncVar.i();
                return;
            default:
                Runnable runnable = lncVar.d0;
                lncVar.d0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
