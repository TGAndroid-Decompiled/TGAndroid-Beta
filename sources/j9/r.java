package j9;

import java.util.concurrent.Executor;
public final class r implements Executor {
    public static final r f14356a;
    public static final r[] f14357b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f14356a = r02;
        f14357b = new r[]{r02};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f14357b.clone();
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
