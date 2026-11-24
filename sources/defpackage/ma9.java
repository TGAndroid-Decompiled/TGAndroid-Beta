package defpackage;

import java.util.concurrent.ThreadFactory;
public final class ma9 implements ThreadFactory {
    @Override
    public final Thread newThread(Runnable runnable) {
        return new la9(runnable);
    }
}
