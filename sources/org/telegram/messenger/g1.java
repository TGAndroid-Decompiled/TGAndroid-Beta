package org.telegram.messenger;

import java.util.concurrent.Executor;
public final class g1 implements Executor {
    public final DispatchQueue2 f18462a;

    public g1(DispatchQueue2 dispatchQueue2) {
        this.f18462a = dispatchQueue2;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f18462a.postRunnable(runnable);
    }
}
