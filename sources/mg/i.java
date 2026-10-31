package mg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class i implements Runnable {
    public final int f13132a;
    public final AtomicBoolean f13133b;

    public i(AtomicBoolean atomicBoolean, int i10) {
        this.f13132a = i10;
        this.f13133b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f13132a) {
            case 0:
                this.f13133b.set(true);
                return;
            default:
                this.f13133b.set(true);
                return;
        }
    }
}
