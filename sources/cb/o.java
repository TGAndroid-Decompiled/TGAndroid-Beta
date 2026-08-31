package cb;

import java.util.concurrent.Executor;
public final class o implements Executor {
    public static final o f2429a;
    public static final o[] f2430b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f2429a = r02;
        f2430b = new o[]{r02};
    }

    public static o[] values() {
        return (o[]) f2430b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        g.a().f2409a.post(runnable);
    }
}
