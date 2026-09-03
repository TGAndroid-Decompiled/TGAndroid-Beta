package gg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class k implements Runnable {
    public final int f6672a;
    public final AtomicBoolean f6673b;

    public k(AtomicBoolean atomicBoolean, int i10) {
        this.f6672a = i10;
        this.f6673b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f6672a) {
            case 0:
                this.f6673b.set(true);
                return;
            default:
                this.f6673b.set(true);
                return;
        }
    }
}
