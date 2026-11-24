package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;
public final class qp5 extends AbstractOwnableSynchronizer implements Runnable {
    public final h2c a;

    public qp5(h2c h2cVar) {
        this.a = h2cVar;
    }

    public final void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override
    public final void run() {
    }
}
