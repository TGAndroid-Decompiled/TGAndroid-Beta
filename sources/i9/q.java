package i9;

import java.util.concurrent.Executor;
public final class q implements Executor {
    public static final q f11052a;
    public static final q[] f11053b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f11052a = r02;
        f11053b = new q[]{r02};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f11053b.clone();
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
