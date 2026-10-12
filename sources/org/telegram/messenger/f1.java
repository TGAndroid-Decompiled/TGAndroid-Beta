package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class f1 implements Executor {
    public final DispatchQueue f17201a;

    public f1(DispatchQueue dispatchQueue) {
        this.f17201a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f17201a.postRunnable(runnable);
    }
}
