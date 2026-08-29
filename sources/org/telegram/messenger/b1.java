package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class b1 implements Executor {
    public final DispatchQueue f19762a;

    public b1(DispatchQueue dispatchQueue) {
        this.f19762a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f19762a.postRunnable(runnable);
    }
}
