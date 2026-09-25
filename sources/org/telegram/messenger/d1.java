package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class d1 implements Executor {
    public final DispatchQueue f16168a;

    public d1(DispatchQueue dispatchQueue) {
        this.f16168a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f16168a.postRunnable(runnable);
    }
}
