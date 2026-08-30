package gg;

import java.util.concurrent.atomic.AtomicBoolean;
public final class k implements Runnable {
    public final int f6685a;
    public final AtomicBoolean f6686b;

    public k(AtomicBoolean atomicBoolean, int i10) {
        this.f6685a = i10;
        this.f6686b = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.f6685a) {
            case 0:
                this.f6686b.set(true);
                return;
            default:
                this.f6686b.set(true);
                return;
        }
    }
}
