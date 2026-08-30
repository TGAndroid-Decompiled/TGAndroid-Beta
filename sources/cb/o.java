package cb;

import java.util.concurrent.Executor;
public final class o implements Executor {
    public static final o f2237a;
    public static final o[] f2238b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f2237a = r02;
        f2238b = new o[]{r02};
    }

    public static o[] values() {
        return (o[]) f2238b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        g.a().f2218a.post(runnable);
    }
}
