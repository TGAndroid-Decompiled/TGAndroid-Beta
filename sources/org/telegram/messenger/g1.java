package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class g1 implements Executor {
    public final DispatchQueue f18472a;

    public g1(DispatchQueue dispatchQueue) {
        this.f18472a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f18472a.postRunnable(runnable);
    }
}
