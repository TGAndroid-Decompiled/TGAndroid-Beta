package defpackage;

import java.util.concurrent.Executor;
public final class rpd implements Executor {
    public static final rpd a;
    public static final rpd[] b;

    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        b = new rpd[]{r0};
    }

    public static rpd[] values() {
        return (rpd[]) b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
