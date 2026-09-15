package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class b1 implements Executor {
    public final DispatchQueue f15705a;

    public b1(DispatchQueue dispatchQueue) {
        this.f15705a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f15705a.postRunnable(runnable);
    }
}
