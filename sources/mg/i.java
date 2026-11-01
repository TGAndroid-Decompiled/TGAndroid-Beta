package mg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class i implements Runnable {
    public final int f13133a;
    public final AtomicBoolean f13134b;

    public i(AtomicBoolean atomicBoolean, int i10) {
        this.f13133a = i10;
        this.f13134b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f13133a) {
            case 0:
                this.f13134b.set(true);
                return;
            default:
                this.f13134b.set(true);
                return;
        }
    }
}
