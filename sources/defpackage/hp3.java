package defpackage;

import java.util.concurrent.Executor;
public final class hp3 implements Executor {
    public static final hp3 a;
    public static final hp3[] b;

    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        b = new hp3[]{r0};
    }

    public static hp3 valueOf(String str) {
        return (hp3) Enum.valueOf(hp3.class, str);
    }

    public static hp3[] values() {
        return (hp3[]) b.clone();
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
