package org.telegram.messenger;
public final class tm implements Runnable {
    public final int f27125a;
    public final q0.a f27126b;
    public final int f27127c;

    public tm(q0.a aVar, int i7, int i10) {
        this.f27125a = i10;
        this.f27126b = aVar;
        this.f27127c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27125a) {
            case 0:
                this.f27126b.accept(Integer.valueOf(this.f27127c));
                return;
            default:
                this.f27126b.accept(Integer.valueOf(this.f27127c));
                return;
        }
    }
}
