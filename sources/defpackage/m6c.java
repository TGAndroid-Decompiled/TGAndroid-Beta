package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class m6c implements Executor {
    public static final m6c a;
    public static final Handler b;
    public static final m6c[] c;

    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        c = new m6c[]{r0};
        b = new Handler(Looper.getMainLooper());
    }

    public static m6c valueOf(String str) {
        return (m6c) Enum.valueOf(m6c.class, str);
    }

    public static m6c[] values() {
        return (m6c[]) c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
