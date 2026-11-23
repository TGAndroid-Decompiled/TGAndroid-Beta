package org.telegram.messenger;
public final class um implements Runnable {
    public final int f27190a;
    public final q0.a f27191b;
    public final int f27192c;

    public um(q0.a aVar, int i7, int i10) {
        this.f27190a = i10;
        this.f27191b = aVar;
        this.f27192c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27190a) {
            case 0:
                this.f27191b.accept(Integer.valueOf(this.f27192c));
                return;
            default:
                this.f27191b.accept(Integer.valueOf(this.f27192c));
                return;
        }
    }
}
