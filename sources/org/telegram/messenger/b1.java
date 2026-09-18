package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class b1 implements Executor {
    public final DispatchQueue f15714a;

    public b1(DispatchQueue dispatchQueue) {
        this.f15714a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f15714a.postRunnable(runnable);
    }
}
