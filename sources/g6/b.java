package g6;

import a9.n;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class b implements ThreadFactory {

    public final AtomicInteger f6397b = new AtomicInteger();

    public final ThreadFactory f6398c = Executors.defaultThreadFactory();

    public final String f6396a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f6398c.newThread(new n(1, runnable));
        threadNewThread.setName(this.f6396a + "[" + this.f6397b.getAndIncrement() + "]");
        return threadNewThread;
    }
}
