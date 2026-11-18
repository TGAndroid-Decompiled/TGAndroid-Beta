package org.telegram.messenger;
public final class tm implements Runnable {
    public final int f27028a;
    public final q0.a f27029b;
    public final int f27030c;

    public tm(q0.a aVar, int i7, int i10) {
        this.f27028a = i10;
        this.f27029b = aVar;
        this.f27030c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27028a) {
            case 0:
                this.f27029b.accept(Integer.valueOf(this.f27030c));
                return;
            default:
                this.f27029b.accept(Integer.valueOf(this.f27030c));
                return;
        }
    }
}
