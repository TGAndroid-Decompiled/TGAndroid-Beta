package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class b1 implements Executor {
    public final DispatchQueue f17192a;

    public b1(DispatchQueue dispatchQueue) {
        this.f17192a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f17192a.postRunnable(runnable);
    }
}
