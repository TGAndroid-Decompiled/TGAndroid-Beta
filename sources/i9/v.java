package i9;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;
public final class v extends AbstractOwnableSynchronizer implements Runnable {
    public final d0 f10541a;

    public v(d0 d0Var) {
        this.f10541a = d0Var;
    }

    public static void a(v vVar, Thread thread) {
        vVar.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f10541a.toString();
    }

    @Override
    public final void run() {
    }
}
