package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class c1 implements Executor {
    public final DispatchQueue f16018a;

    public c1(DispatchQueue dispatchQueue) {
        this.f16018a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f16018a.postRunnable(runnable);
    }
}
