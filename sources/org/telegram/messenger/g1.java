package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class g1 implements Executor {
    public final DispatchQueue f18404a;

    public g1(DispatchQueue dispatchQueue) {
        this.f18404a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f18404a.postRunnable(runnable);
    }
}
