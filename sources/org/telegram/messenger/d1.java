package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class d1 implements Executor {
    public final DispatchQueue f15907a;

    public d1(DispatchQueue dispatchQueue) {
        this.f15907a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f15907a.postRunnable(runnable);
    }
}
