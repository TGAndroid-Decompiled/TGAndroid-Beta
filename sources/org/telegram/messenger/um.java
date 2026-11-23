package org.telegram.messenger;
public final class um implements Runnable {
    public final int f27226a;
    public final q0.a f27227b;
    public final int f27228c;

    public um(q0.a aVar, int i7, int i10) {
        this.f27226a = i10;
        this.f27227b = aVar;
        this.f27228c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27226a) {
            case 0:
                this.f27227b.accept(Integer.valueOf(this.f27228c));
                return;
            default:
                this.f27227b.accept(Integer.valueOf(this.f27228c));
                return;
        }
    }
}
