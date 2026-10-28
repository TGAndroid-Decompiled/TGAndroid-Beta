package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class i1 implements Executor {
    public final DispatchQueue2 f20294a;

    @Override
    public final void execute(Runnable runnable) {
        this.f20294a.postRunnable(runnable);
    }
}
