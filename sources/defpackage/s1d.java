package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public abstract class s1d {
    public static final ExecutorService a;

    static {
        kn7 kn7Var = new kn7();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), kn7Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
