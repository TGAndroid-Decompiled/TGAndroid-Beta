package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;
public final class jcf extends AbstractOwnableSynchronizer implements Runnable {
    public final h2c a;

    public jcf(h2c h2cVar) {
        this.a = h2cVar;
    }

    public static void a(jcf jcfVar, Thread thread) {
        jcfVar.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override
    public final void run() {
    }
}
