package d9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class l implements Executor {
    public static final l f4377a;
    public static final Handler f4378b;
    public static final l[] f4379c;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f4377a = r02;
        f4379c = new l[]{r02};
        f4378b = new Handler(Looper.getMainLooper());
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f4379c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f4378b.post(runnable);
    }
}
