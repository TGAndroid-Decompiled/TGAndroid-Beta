package org.telegram.messenger;
public final class uc implements Runnable {
    public final int f25774a;
    public final ng f25775b;
    public final ed f25776c;

    public uc(ng ngVar, ed edVar, int i7) {
        this.f25774a = i7;
        this.f25775b = ngVar;
        this.f25776c = edVar;
    }

    @Override
    public final void run() {
        switch (this.f25774a) {
            case 0:
                this.f25775b.run();
                this.f25776c.a();
                return;
            default:
                this.f25775b.run();
                this.f25776c.a();
                return;
        }
    }
}
