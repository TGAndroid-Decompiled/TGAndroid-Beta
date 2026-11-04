package mb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f19245a;
    public static final m[] f19246b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f19245a = r02;
        f19246b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f19246b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f19229a.post(runnable);
    }
}
