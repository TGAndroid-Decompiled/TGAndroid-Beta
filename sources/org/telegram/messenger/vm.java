package org.telegram.messenger;
public final class vm implements Runnable {
    public final int f27080a;
    public final q0.a f27081b;
    public final int f27082c;

    public vm(q0.a aVar, int i7, int i10) {
        this.f27080a = i10;
        this.f27081b = aVar;
        this.f27082c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27080a) {
            case 0:
                this.f27081b.accept(Integer.valueOf(this.f27082c));
                return;
            default:
                this.f27081b.accept(Integer.valueOf(this.f27082c));
                return;
        }
    }
}
