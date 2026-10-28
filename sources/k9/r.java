package k9;

import java.util.concurrent.Executor;
public final class r implements Executor {
    public static final r f16490a;
    public static final r[] f16491b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f16490a = r02;
        f16491b = new r[]{r02};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f16491b.clone();
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
