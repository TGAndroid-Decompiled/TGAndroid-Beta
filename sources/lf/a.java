package lf;

import com.google.android.gms.internal.cast.c0;
import com.google.android.gms.internal.cast.g4;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import org.telegram.messenger.a8;
public final class a extends ThreadPoolExecutor implements AutoCloseable {
    public final c0 f18216a;

    public a(com.google.android.gms.internal.cast.c0 r8, java.util.concurrent.PriorityBlockingQueue r9) {
        throw new UnsupportedOperationException("Method not decompiled: lf.a.<init>(com.google.android.gms.internal.cast.c0, java.util.concurrent.PriorityBlockingQueue):void");
    }

    @Override
    public final void beforeExecute(Thread thread, Runnable runnable) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f18216a.f6883c;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final void close() {
        g4.h(this);
    }
}
