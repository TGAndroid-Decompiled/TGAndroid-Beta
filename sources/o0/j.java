package o0;

import java.util.concurrent.ThreadFactory;
public final class j implements ThreadFactory {
    @Override
    public final Thread newThread(Runnable runnable) {
        return new i(runnable);
    }
}
