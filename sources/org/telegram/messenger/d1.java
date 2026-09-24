package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class d1 implements Executor {
    public final DispatchQueue f16153a;

    public d1(DispatchQueue dispatchQueue) {
        this.f16153a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f16153a.postRunnable(runnable);
    }
}
