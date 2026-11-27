package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class l8c implements Executor {
    public static final l8c a;
    public static final Handler b;
    public static final l8c[] c;

    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        c = new l8c[]{r0};
        b = new Handler(Looper.getMainLooper());
    }

    public static l8c valueOf(String str) {
        return (l8c) Enum.valueOf(l8c.class, str);
    }

    public static l8c[] values() {
        return (l8c[]) c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
