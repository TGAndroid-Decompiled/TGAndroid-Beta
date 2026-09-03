package d9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class l implements Executor {
    public static final l f4278a;
    public static final Handler f4279b;
    public static final l[] f4280c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f4278a = r02;
        f4280c = new l[]{r02};
        f4279b = new Handler(Looper.getMainLooper());
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f4280c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f4279b.post(runnable);
    }
}
