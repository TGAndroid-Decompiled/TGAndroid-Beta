package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;
public final class tr5 extends AbstractOwnableSynchronizer implements Runnable {
    public final h6c a;

    public tr5(h6c h6cVar) {
        this.a = h6cVar;
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
