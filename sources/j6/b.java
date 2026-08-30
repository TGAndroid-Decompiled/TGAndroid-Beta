package j6;

import d9.j;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
public final class b implements ThreadFactory {
    public final AtomicInteger f8939b = new AtomicInteger();
    public final ThreadFactory f8940c = Executors.defaultThreadFactory();
    public final String f8938a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f8940c.newThread(new j(1, runnable));
        int andIncrement = this.f8939b.getAndIncrement();
        newThread.setName(this.f8938a + "[" + andIncrement + "]");
        return newThread;
    }
}
