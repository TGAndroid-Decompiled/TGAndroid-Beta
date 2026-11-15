package org.telegram.messenger;
public final class vm implements Runnable {
    public final int f27079a;
    public final q0.a f27080b;
    public final int f27081c;

    public vm(q0.a aVar, int i7, int i10) {
        this.f27079a = i10;
        this.f27080b = aVar;
        this.f27081c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27079a) {
            case 0:
                this.f27080b.accept(Integer.valueOf(this.f27081c));
                return;
            default:
                this.f27080b.accept(Integer.valueOf(this.f27081c));
                return;
        }
    }
}
