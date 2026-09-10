package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class e1 implements Executor {
    public final DispatchQueue f15035a;

    public e1(DispatchQueue dispatchQueue) {
        this.f15035a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f15035a.postRunnable(runnable);
    }
}
