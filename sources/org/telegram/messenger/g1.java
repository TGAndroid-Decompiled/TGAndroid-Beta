package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class g1 implements Executor {
    public final DispatchQueue f18406a;

    public g1(DispatchQueue dispatchQueue) {
        this.f18406a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f18406a.postRunnable(runnable);
    }
}
