package defpackage;

import java.util.concurrent.ThreadFactory;
public final class k89 implements ThreadFactory {
    @Override
    public final Thread newThread(Runnable runnable) {
        return new j89(runnable);
    }
}
