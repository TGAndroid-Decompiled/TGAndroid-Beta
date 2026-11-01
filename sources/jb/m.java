package jb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f9798a;
    public static final m[] f9799b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f9798a = r02;
        f9799b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f9799b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f9782a.post(runnable);
    }
}
