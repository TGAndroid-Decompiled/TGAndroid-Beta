package org.telegram.messenger;

import java.util.concurrent.Executor;

public final class b1 implements Executor {

    public final DispatchQueue f19752a;

    public b1(DispatchQueue dispatchQueue) {
        this.f19752a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f19752a.postRunnable(runnable);
    }
}
