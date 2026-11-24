package defpackage;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
public final class cq2 implements mt8 {
    public final byte a;

    public cq2(byte b) {
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
                e06 e06Var = ExecutorsRegistrar.a;
                return new id3(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new y43("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                e06 e06Var2 = ExecutorsRegistrar.a;
                return new id3(Executors.newCachedThreadPool(new y43("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                e06 e06Var3 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new y43("Firebase Scheduler", 0, null));
            case 5:
            default:
                return null;
        }
    }
}
