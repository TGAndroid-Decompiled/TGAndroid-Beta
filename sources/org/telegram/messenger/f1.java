package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class f1 implements Executor {
    public final DispatchQueue f18328a;

    public f1(DispatchQueue dispatchQueue) {
        this.f18328a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f18328a.postRunnable(runnable);
    }
}
