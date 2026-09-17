package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class b1 implements Executor {
    public final DispatchQueue f17242a;

    public b1(DispatchQueue dispatchQueue) {
        this.f17242a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f17242a.postRunnable(runnable);
    }
}
