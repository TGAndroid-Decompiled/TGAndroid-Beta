package cb;

import java.util.concurrent.Executor;
public final class o implements Executor {
    public static final o f2260a;
    public static final o[] f2261b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f2260a = r02;
        f2261b = new o[]{r02};
    }

    public static o[] values() {
        return (o[]) f2261b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        g.a().f2241a.post(runnable);
    }
}
