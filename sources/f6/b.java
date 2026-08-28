package f6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
public final class b implements ThreadFactory {
    public final AtomicInteger f5593b = new AtomicInteger();
    public final ThreadFactory f5594c = Executors.defaultThreadFactory();
    public final String f5592a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f5594c.newThread(new c(0, runnable));
        int andIncrement = this.f5593b.getAndIncrement();
        newThread.setName(this.f5592a + "[" + andIncrement + "]");
        return newThread;
    }
}
