package defpackage;

import java.util.concurrent.Executor;
public final class oo3 implements Executor {
    public static final oo3 a;
    public static final oo3[] b;

    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        b = new oo3[]{r0};
    }

    public static oo3 valueOf(String str) {
        return (oo3) Enum.valueOf(oo3.class, str);
    }

    public static oo3[] values() {
        return (oo3[]) b.clone();
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
