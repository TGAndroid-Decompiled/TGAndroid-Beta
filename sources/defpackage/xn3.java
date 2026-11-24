package defpackage;

import java.util.concurrent.Executor;
public final class xn3 implements Executor {
    public static final xn3 a;
    public static final xn3[] b;

    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        b = new xn3[]{r0};
    }

    public static xn3 valueOf(String str) {
        return (xn3) Enum.valueOf(xn3.class, str);
    }

    public static xn3[] values() {
        return (xn3[]) b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override
    public final String toString() {
        return "DirectExecutor";
    }
}
