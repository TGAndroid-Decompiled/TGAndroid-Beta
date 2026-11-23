package m9;

import java.util.concurrent.Executor;
public final class r implements Executor {
    public static final r f20949a;
    public static final r[] f20950b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f20949a = r02;
        f20950b = new r[]{r02};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f20950b.clone();
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
