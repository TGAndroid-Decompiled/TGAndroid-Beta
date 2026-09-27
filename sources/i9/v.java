package i9;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;
public final class v extends AbstractOwnableSynchronizer implements Runnable {
    public final d0 f11050a;

    public v(d0 d0Var) {
        this.f11050a = d0Var;
    }

    public static void a(v vVar, Thread thread) {
        vVar.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f11050a.toString();
    }

    @Override
    public final void run() {
    }
}
