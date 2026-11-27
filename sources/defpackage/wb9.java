package defpackage;

import java.util.concurrent.ThreadFactory;
public final class wb9 implements ThreadFactory {
    @Override
    public final Thread newThread(Runnable runnable) {
        return new vb9(runnable);
    }
}
