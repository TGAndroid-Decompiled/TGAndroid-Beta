package defpackage;

import java.util.concurrent.Executor;
public final class mo3 implements Executor {
    public static final mo3 a;
    public static final mo3[] b;

    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        b = new mo3[]{r0};
    }

    public static mo3 valueOf(String str) {
        return (mo3) Enum.valueOf(mo3.class, str);
    }

    public static mo3[] values() {
        return (mo3[]) b.clone();
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
