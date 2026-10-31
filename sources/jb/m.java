package jb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f9797a;
    public static final m[] f9798b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f9797a = r02;
        f9798b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f9798b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f9781a.post(runnable);
    }
}
