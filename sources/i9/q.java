package i9;

import java.util.concurrent.Executor;
public final class q implements Executor {
    public static final q f10533a;
    public static final q[] f10534b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f10533a = r02;
        f10534b = new q[]{r02};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f10534b.clone();
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
