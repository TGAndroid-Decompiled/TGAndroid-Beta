package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class g1 implements Executor {
    public final DispatchQueue f17639a;

    public g1(DispatchQueue dispatchQueue) {
        this.f17639a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f17639a.postRunnable(runnable);
    }
}
