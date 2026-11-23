package m9;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;
public final class x extends AbstractOwnableSynchronizer implements Runnable {
    public final f0 f20991a;

    public x(f0 f0Var) {
        this.f20991a = f0Var;
    }

    public static void a(x xVar, Thread thread) {
        xVar.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f20991a.toString();
    }

    @Override
    public final void run() {
    }
}
