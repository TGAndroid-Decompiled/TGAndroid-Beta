package a9;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class l implements y9.b {

    public final int f183a;

    public l(int i10) {
        this.f183a = i10;
    }

    @Override
    public final Object get() {
        switch (this.f183a) {
            case 0:
                return ExecutorsRegistrar.a();
            case 1:
                z8.m mVar = ExecutorsRegistrar.f4531a;
                return new h(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 2:
                z8.m mVar2 = ExecutorsRegistrar.f4531a;
                return new h(Executors.newCachedThreadPool(new a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                z8.m mVar3 = ExecutorsRegistrar.f4531a;
                return Executors.newSingleThreadScheduledExecutor(new a("Firebase Scheduler", 0, null));
            case 4:
                return Collections.EMPTY_SET;
            default:
                return null;
        }
    }
}
