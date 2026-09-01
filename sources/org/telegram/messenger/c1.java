package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class c1 implements Executor {
    public final DispatchQueue f18314a;

    public c1(DispatchQueue dispatchQueue) {
        this.f18314a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f18314a.postRunnable(runnable);
    }
}
