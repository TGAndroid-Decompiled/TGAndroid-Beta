package org.telegram.messenger;
public final class tm implements Runnable {
    public final int f27030a;
    public final q0.a f27031b;
    public final int f27032c;

    public tm(q0.a aVar, int i7, int i10) {
        this.f27030a = i10;
        this.f27031b = aVar;
        this.f27032c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27030a) {
            case 0:
                this.f27031b.accept(Integer.valueOf(this.f27032c));
                return;
            default:
                this.f27031b.accept(Integer.valueOf(this.f27032c));
                return;
        }
    }
}
