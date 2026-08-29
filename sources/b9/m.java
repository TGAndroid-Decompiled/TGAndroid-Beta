package b9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f2022a;
    public static final Handler f2023b;
    public static final m[] f2024c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f2022a = r02;
        f2024c = new m[]{r02};
        f2023b = new Handler(Looper.getMainLooper());
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f2024c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f2023b.post(runnable);
    }
}
