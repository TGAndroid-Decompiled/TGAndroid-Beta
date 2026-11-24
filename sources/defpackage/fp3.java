package defpackage;

import java.util.concurrent.Executor;
public final class fp3 implements Executor {
    public static final fp3 a;
    public static final fp3[] b;

    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        b = new fp3[]{r0};
    }

    public static fp3 valueOf(String str) {
        return (fp3) Enum.valueOf(fp3.class, str);
    }

    public static fp3[] values() {
        return (fp3[]) b.clone();
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
