package org.telegram.messenger;
public final class uc implements Runnable {
    public final int f25770a;
    public final ng f25771b;
    public final ed f25772c;

    public uc(ng ngVar, ed edVar, int i7) {
        this.f25770a = i7;
        this.f25771b = ngVar;
        this.f25772c = edVar;
    }

    @Override
    public final void run() {
        switch (this.f25770a) {
            case 0:
                this.f25771b.run();
                this.f25772c.a();
                return;
            default:
                this.f25771b.run();
                this.f25772c.a();
                return;
        }
    }
}
