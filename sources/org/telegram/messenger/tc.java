package org.telegram.messenger;
public final class tc implements Runnable {
    public final int f25605a;
    public final ng f25606b;
    public final dd f25607c;

    public tc(ng ngVar, dd ddVar, int i7) {
        this.f25605a = i7;
        this.f25606b = ngVar;
        this.f25607c = ddVar;
    }

    @Override
    public final void run() {
        switch (this.f25605a) {
            case 0:
                this.f25606b.run();
                this.f25607c.a();
                return;
            default:
                this.f25606b.run();
                this.f25607c.a();
                return;
        }
    }
}
