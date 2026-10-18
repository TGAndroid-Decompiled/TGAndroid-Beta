package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class f1 implements Executor {
    public final DispatchQueue f18311a;

    @Override
    public final void execute(Runnable runnable) {
        this.f18311a.postRunnable(runnable);
    }
}
