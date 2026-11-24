package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;
public final class qr5 extends AbstractOwnableSynchronizer implements Runnable {
    public final h4c a;

    public qr5(h4c h4cVar) {
        this.a = h4cVar;
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
