package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
public final class aj0 implements Runnable {
    public final byte a;
    public final AtomicInteger b;
    public final AtomicInteger c;
    public final op6 d;

    public aj0(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, op6 op6Var, byte b) {
        this.a = b;
        this.b = atomicInteger;
        this.c = atomicInteger2;
        this.d = op6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        op6 op6Var = this.d;
        AtomicInteger atomicInteger = this.c;
        AtomicInteger atomicInteger2 = this.b;
        switch (b) {
            case 0:
                if (atomicInteger2.incrementAndGet() == atomicInteger.get() && op6Var != null) {
                    op6Var.run();
                    return;
                }
                return;
            case 1:
                if (atomicInteger2.incrementAndGet() == atomicInteger.get() && op6Var != null) {
                    op6Var.run();
                    return;
                }
                return;
            default:
                if (atomicInteger2.incrementAndGet() == atomicInteger.get() && op6Var != null) {
                    op6Var.run();
                    return;
                }
                return;
        }
    }
}
