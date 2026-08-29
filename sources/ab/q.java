package ab;

import java.util.concurrent.Executor;
public final class q implements Executor {
    public static final q f333a;
    public static final q[] f334b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f333a = r02;
        f334b = new q[]{r02};
    }

    public static q[] values() {
        return (q[]) f334b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        g.a().f309a.post(runnable);
    }
}
