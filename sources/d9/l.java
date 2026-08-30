package d9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class l implements Executor {
    public static final l f4297a;
    public static final Handler f4298b;
    public static final l[] f4299c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f4297a = r02;
        f4299c = new l[]{r02};
        f4298b = new Handler(Looper.getMainLooper());
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f4299c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f4298b.post(runnable);
    }
}
