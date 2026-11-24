package defpackage;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
public final class op7 implements ThreadFactory {
    public final byte a;
    public final ThreadFactory b;
    public final Serializable c;

    public op7(ui0 ui0Var) {
        this.a = (byte) 1;
        this.b = Executors.defaultThreadFactory();
        this.c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        byte b = this.a;
        Serializable serializable = this.c;
        ThreadFactory threadFactory = this.b;
        switch (b) {
            case 0:
                Thread newThread = threadFactory.newThread(new yq9(runnable, (byte) 2));
                int andIncrement = ((AtomicInteger) serializable).getAndIncrement();
                StringBuilder sb = new StringBuilder(String.valueOf(andIncrement).length() + 14);
                sb.append("GAC_Executor[");
                sb.append(andIncrement);
                sb.append("]");
                newThread.setName(sb.toString());
                return newThread;
            case 1:
                Thread newThread2 = threadFactory.newThread(runnable);
                int andIncrement2 = ((AtomicInteger) serializable).getAndIncrement();
                newThread2.setName("PlayBillingLibrary-" + andIncrement2);
                return newThread2;
            default:
                Thread newThread3 = threadFactory.newThread(new yq9(runnable, (byte) 2));
                newThread3.setName((String) serializable);
                return newThread3;
        }
    }

    public op7() {
        this.a = (byte) 0;
        this.c = new AtomicInteger();
        this.b = Executors.defaultThreadFactory();
    }

    public op7(String str) {
        this.a = (byte) 2;
        this.b = Executors.defaultThreadFactory();
        this.c = str;
    }
}
