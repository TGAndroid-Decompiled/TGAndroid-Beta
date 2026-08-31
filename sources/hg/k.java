package hg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class k implements Runnable {
    public final int f7533a;
    public final AtomicBoolean f7534b;

    public k(AtomicBoolean atomicBoolean, int i10) {
        this.f7533a = i10;
        this.f7534b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f7533a) {
            case 0:
                this.f7534b.set(true);
                return;
            default:
                this.f7534b.set(true);
                return;
        }
    }
}
