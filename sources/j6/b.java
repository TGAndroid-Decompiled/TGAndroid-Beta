package j6;

import d9.j;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
public final class b implements ThreadFactory {
    public final AtomicInteger f8921b = new AtomicInteger();
    public final ThreadFactory f8922c = Executors.defaultThreadFactory();
    public final String f8920a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f8922c.newThread(new j(1, runnable));
        int andIncrement = this.f8921b.getAndIncrement();
        newThread.setName(this.f8920a + "[" + andIncrement + "]");
        return newThread;
    }
}
