package bg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class n implements Runnable {
    public final int f1882a;
    public final AtomicBoolean f1883b;

    public n(AtomicBoolean atomicBoolean, int i9) {
        this.f1882a = i9;
        this.f1883b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f1882a) {
            case 0:
                this.f1883b.set(true);
                return;
            default:
                this.f1883b.set(true);
                return;
        }
    }
}
