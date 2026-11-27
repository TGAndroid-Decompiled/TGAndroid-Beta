package defpackage;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
public final class vq2 implements vw8 {
    public final byte a;

    public vq2(byte b) {
        this.a = b;
    }

    @Override
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return ExecutorsRegistrar.a();
            case 2:
                i26 i26Var = ExecutorsRegistrar.a;
                return new be3(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new q53("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                i26 i26Var2 = ExecutorsRegistrar.a;
                return new be3(Executors.newCachedThreadPool(new q53("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                i26 i26Var3 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new q53("Firebase Scheduler", 0, null));
            case 5:
            default:
                return null;
        }
    }
}
