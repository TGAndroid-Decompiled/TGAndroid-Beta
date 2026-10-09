package i9;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;
public final class v extends AbstractOwnableSynchronizer implements Runnable {
    public final d0 f12083a;

    public v(d0 d0Var) {
        this.f12083a = d0Var;
    }

    public static void a(v vVar, Thread thread) {
        vVar.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f12083a.toString();
    }

    @Override
    public final void run() {
    }
}
