package o0;

import java.util.concurrent.ThreadFactory;

public final class l implements ThreadFactory {
    @Override
    public final Thread newThread(Runnable runnable) {
        return new k(runnable);
    }
}
