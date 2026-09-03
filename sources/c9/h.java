package c9;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
public final class h implements ba.b {
    public final int f2180a;

    public h(int i10) {
        this.f2180a = i10;
    }

    @Override
    public final Object get() {
        switch (this.f2180a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                return ExecutorsRegistrar.a();
            case 3:
                q qVar = ExecutorsRegistrar.f3936a;
                return new d9.g(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new d9.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                q qVar2 = ExecutorsRegistrar.f3936a;
                return new d9.g(Executors.newCachedThreadPool(new d9.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            default:
                q qVar3 = ExecutorsRegistrar.f3936a;
                return Executors.newSingleThreadScheduledExecutor(new d9.a("Firebase Scheduler", 0, null));
        }
    }
}
