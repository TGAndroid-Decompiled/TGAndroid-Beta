package j6;

import d9.j;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
public final class b implements ThreadFactory {
    public final AtomicInteger f9545b = new AtomicInteger();
    public final ThreadFactory f9546c = Executors.defaultThreadFactory();
    public final String f9544a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f9546c.newThread(new j(1, runnable));
        int andIncrement = this.f9545b.getAndIncrement();
        newThread.setName(this.f9544a + "[" + andIncrement + "]");
        return newThread;
    }
}
