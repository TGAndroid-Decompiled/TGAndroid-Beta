package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class c1 implements Executor {
    public final DispatchQueue f15985a;

    public c1(DispatchQueue dispatchQueue) {
        this.f15985a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f15985a.postRunnable(runnable);
    }
}
