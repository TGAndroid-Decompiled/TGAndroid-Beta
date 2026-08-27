package a9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class r implements Executor {

    public static final r f195a;

    public static final Handler f196b;

    public static final r[] f197c;

    static {
        r rVar = new r("INSTANCE", 0);
        f195a = rVar;
        f197c = new r[]{rVar};
        f196b = new Handler(Looper.getMainLooper());
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f197c.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f196b.post(runnable);
    }
}
