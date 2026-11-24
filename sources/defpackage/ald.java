package defpackage;

import java.util.concurrent.Executor;
public final class ald implements Executor {
    public static final ald a;
    public static final ald[] b;

    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        b = new ald[]{r0};
    }

    public static ald[] values() {
        return (ald[]) b.clone();
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
