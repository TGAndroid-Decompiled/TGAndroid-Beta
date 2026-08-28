package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class c1 implements Executor {
    public final DispatchQueue f19904a;

    public c1(DispatchQueue dispatchQueue) {
        this.f19904a = dispatchQueue;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f19904a.postRunnable(runnable);
    }
}
