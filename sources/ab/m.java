package ab;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
public final class m implements ua.b {
    public final int f971a;

    public m(int i7) {
        this.f971a = i7;
    }

    @Override
    public final Object get() {
        switch (this.f971a) {
            case 0:
                d0 d0Var = FirebaseMessaging.f7886m;
                return null;
            case 1:
                return Collections.EMPTY_SET;
            case 2:
                return null;
            case 3:
                return ExecutorsRegistrar.a();
            case 4:
                u9.m mVar = ExecutorsRegistrar.f7877a;
                return new v9.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new v9.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 5:
                u9.m mVar2 = ExecutorsRegistrar.f7877a;
                return new v9.f(Executors.newCachedThreadPool(new v9.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            default:
                u9.m mVar3 = ExecutorsRegistrar.f7877a;
                return Executors.newSingleThreadScheduledExecutor(new v9.a("Firebase Scheduler", 0, null));
        }
    }
}
