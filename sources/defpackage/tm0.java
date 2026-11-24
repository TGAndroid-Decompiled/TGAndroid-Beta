package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
public final class tm0 implements Runnable {
    public final byte a;
    public final AtomicBoolean b;

    public tm0(AtomicBoolean atomicBoolean, byte b) {
        this.a = b;
        this.b = atomicBoolean;
    }

    @Override
    public final void run() {
        byte b = this.a;
        AtomicBoolean atomicBoolean = this.b;
        switch (b) {
            case 0:
                atomicBoolean.set(true);
                return;
            default:
                atomicBoolean.set(true);
                return;
        }
    }
}
