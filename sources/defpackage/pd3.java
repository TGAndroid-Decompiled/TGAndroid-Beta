package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class pd3 implements ThreadFactory {
    public final byte a;
    public final Object b;

    public pd3() {
        this.a = (byte) 0;
        this.b = new AtomicInteger(0);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) obj).getAndIncrement());
                return thread;
            case 1:
                Thread newThread = Executors.defaultThreadFactory().newThread(new g64(runnable, (byte) 0));
                newThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) obj).getAndIncrement());
                return newThread;
            default:
                return ((ThreadFactory) obj).newThread(new yq9(runnable, (byte) 4));
        }
    }

    public pd3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
