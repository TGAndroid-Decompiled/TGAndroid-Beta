package eg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class k implements Runnable {
    public final int f6053a;
    public final AtomicBoolean f6054b;

    public k(AtomicBoolean atomicBoolean, int i10) {
        this.f6053a = i10;
        this.f6054b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f6053a) {
            case 0:
                this.f6054b.set(true);
                return;
            default:
                this.f6054b.set(true);
                return;
        }
    }
}
