package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class c1 implements Executor {
    public final DispatchQueue f16881a;

    public c1(DispatchQueue dispatchQueue) {
        this.f16881a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f16881a.postRunnable(runnable);
    }
}
