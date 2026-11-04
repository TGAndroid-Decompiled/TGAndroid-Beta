package org.telegram.messenger;
public final class om implements Runnable {
    public final int f24571a;
    public final q0.a f24572b;
    public final int f24573c;

    public om(q0.a aVar, int i3, int i10) {
        this.f24571a = i10;
        this.f24572b = aVar;
        this.f24573c = i3;
    }

    @Override
    public final void run() {
        switch (this.f24571a) {
            case 0:
                this.f24572b.accept(Integer.valueOf(this.f24573c));
                return;
            default:
                this.f24572b.accept(Integer.valueOf(this.f24573c));
                return;
        }
    }
}
