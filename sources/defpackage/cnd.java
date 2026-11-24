package defpackage;

import java.util.concurrent.Executor;
public final class cnd implements Executor {
    public static final cnd a;
    public static final cnd[] b;

    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        b = new cnd[]{r0};
    }

    public static cnd[] values() {
        return (cnd[]) b.clone();
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
