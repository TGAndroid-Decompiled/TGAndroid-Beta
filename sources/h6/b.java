package h6;

import b9.k;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
public final class b implements ThreadFactory {
    public final AtomicInteger f7543b = new AtomicInteger();
    public final ThreadFactory f7544c = Executors.defaultThreadFactory();
    public final String f7542a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f7544c.newThread(new k(1, runnable));
        int andIncrement = this.f7543b.getAndIncrement();
        newThread.setName(this.f7542a + "[" + andIncrement + "]");
        return newThread;
    }
}
