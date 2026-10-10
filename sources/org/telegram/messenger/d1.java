package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class d1 implements Executor {
    public final DispatchQueue f17613a;

    public d1(DispatchQueue dispatchQueue) {
        this.f17613a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f17613a.postRunnable(runnable);
    }
}
