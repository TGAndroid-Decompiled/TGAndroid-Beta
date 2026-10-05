package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class d1 implements Executor {
    public final DispatchQueue f17622a;

    @Override
    public final void execute(Runnable runnable) {
        this.f17622a.postRunnable(runnable);
    }
}
