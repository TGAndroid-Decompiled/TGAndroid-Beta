package defpackage;

import java.util.concurrent.Executor;
public final class vn3 implements Executor {
    public static final vn3 a;
    public static final vn3[] b;

    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        b = new vn3[]{r0};
    }

    public static vn3 valueOf(String str) {
        return (vn3) Enum.valueOf(vn3.class, str);
    }

    public static vn3[] values() {
        return (vn3[]) b.clone();
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
