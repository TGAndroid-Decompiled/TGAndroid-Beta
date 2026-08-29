package a9;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
public final class h implements z9.b {
    public final int f242a;

    public h(int i10) {
        this.f242a = i10;
    }

    @Override
    public final Object get() {
        switch (this.f242a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                return ExecutorsRegistrar.a();
            case 3:
                q qVar = ExecutorsRegistrar.f5103a;
                return new b9.h(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new b9.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                q qVar2 = ExecutorsRegistrar.f5103a;
                return new b9.h(Executors.newCachedThreadPool(new b9.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            default:
                q qVar3 = ExecutorsRegistrar.f5103a;
                return Executors.newSingleThreadScheduledExecutor(new b9.a("Firebase Scheduler", 0, null));
        }
    }
}
