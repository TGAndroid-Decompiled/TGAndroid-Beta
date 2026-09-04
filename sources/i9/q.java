package i9;

import java.util.concurrent.Executor;
public final class q implements Executor {
    public static final q f11920a;
    public static final q[] f11921b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f11920a = r02;
        f11921b = new q[]{r02};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f11921b.clone();
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
