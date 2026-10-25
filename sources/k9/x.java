package k9;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;
public final class x extends AbstractOwnableSynchronizer implements Runnable {
    public final f0 f16499a;

    public x(f0 f0Var) {
        this.f16499a = f0Var;
    }

    public static void a(x xVar, Thread thread) {
        xVar.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f16499a.toString();
    }

    @Override
    public final void run() {
    }
}
