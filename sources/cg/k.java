package cg;

import java.util.concurrent.atomic.AtomicBoolean;

public final class k implements Runnable {

    public final int f2741a;

    public final AtomicBoolean f2742b;

    public k(AtomicBoolean atomicBoolean, int i10) {
        this.f2741a = i10;
        this.f2742b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f2741a) {
            case 0:
                this.f2742b.set(true);
                break;
            default:
                this.f2742b.set(true);
                break;
        }
    }
}
