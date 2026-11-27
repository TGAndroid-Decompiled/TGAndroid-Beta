package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;
public final class zgf extends AbstractOwnableSynchronizer implements Runnable {
    public final h6c a;

    public zgf(h6c h6cVar) {
        this.a = h6cVar;
    }

    public static void a(zgf zgfVar, Thread thread) {
        zgfVar.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override
    public final void run() {
    }
}
