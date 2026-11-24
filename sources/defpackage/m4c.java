package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
public final class m4c implements Executor {
    public static final m4c a;
    public static final Handler b;
    public static final m4c[] c;

    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        c = new m4c[]{r0};
        b = new Handler(Looper.getMainLooper());
    }

    public static m4c valueOf(String str) {
        return (m4c) Enum.valueOf(m4c.class, str);
    }

    public static m4c[] values() {
        return (m4c[]) c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
