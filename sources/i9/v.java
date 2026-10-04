package i9;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;
public final class v extends AbstractOwnableSynchronizer implements Runnable {
    public final d0 f12033a;

    public v(d0 d0Var) {
        this.f12033a = d0Var;
    }

    public static void a(v vVar, Thread thread) {
        vVar.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f12033a.toString();
    }

    @Override
    public final void run() {
    }
}
