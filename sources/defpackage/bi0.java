package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
public final class bi0 implements Runnable {
    public final byte a;
    public final AtomicInteger b;
    public final AtomicInteger c;
    public final es6 d;

    public bi0(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, es6 es6Var, byte b) {
        this.a = b;
        this.b = atomicInteger;
        this.c = atomicInteger2;
        this.d = es6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        es6 es6Var = this.d;
        AtomicInteger atomicInteger = this.c;
        AtomicInteger atomicInteger2 = this.b;
        switch (b) {
            case 0:
                if (atomicInteger2.incrementAndGet() == atomicInteger.get() && es6Var != null) {
                    es6Var.run();
                    return;
                }
                return;
            case 1:
                if (atomicInteger2.incrementAndGet() == atomicInteger.get() && es6Var != null) {
                    es6Var.run();
                    return;
                }
                return;
            default:
                if (atomicInteger2.incrementAndGet() == atomicInteger.get() && es6Var != null) {
                    es6Var.run();
                    return;
                }
                return;
        }
    }
}
