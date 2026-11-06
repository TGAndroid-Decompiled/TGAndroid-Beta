package org.telegram.messenger;
public final class tc implements Runnable {
    public final int f25597a;
    public final ng f25598b;
    public final dd f25599c;

    public tc(ng ngVar, dd ddVar, int i7) {
        this.f25597a = i7;
        this.f25598b = ngVar;
        this.f25599c = ddVar;
    }

    @Override
    public final void run() {
        switch (this.f25597a) {
            case 0:
                this.f25598b.run();
                this.f25599c.a();
                return;
            default:
                this.f25598b.run();
                this.f25599c.a();
                return;
        }
    }
}
