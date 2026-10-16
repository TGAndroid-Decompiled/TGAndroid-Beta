package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class f1 implements Executor {
    public final DispatchQueue f16900a;

    public f1(DispatchQueue dispatchQueue) {
        this.f16900a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f16900a.postRunnable(runnable);
    }
}
