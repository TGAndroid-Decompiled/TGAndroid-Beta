package o0;

import java.util.concurrent.ThreadFactory;
public final class k implements ThreadFactory {
    @Override
    public final Thread newThread(Runnable runnable) {
        return new j(runnable);
    }
}
