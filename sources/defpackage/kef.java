package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;
public final class kef extends AbstractOwnableSynchronizer implements Runnable {
    public final h4c a;

    public kef(h4c h4cVar) {
        this.a = h4cVar;
    }

    public static void a(kef kefVar, Thread thread) {
        kefVar.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override
    public final void run() {
    }
}
