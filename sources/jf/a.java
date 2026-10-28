package jf;

import com.google.android.gms.internal.cast.f4;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import org.telegram.messenger.FileLog;
public final class a extends ThreadPoolExecutor implements AutoCloseable {
    public final c f15612a;

    public a(jf.c r8, java.util.concurrent.PriorityBlockingQueue r9) {
        throw new UnsupportedOperationException("Method not decompiled: jf.a.<init>(jf.c, java.util.concurrent.PriorityBlockingQueue):void");
    }

    @Override
    public final void beforeExecute(Thread thread, Runnable runnable) {
        CountDownLatch countDownLatch = this.f15612a.f15616b;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void close() {
        f4.f(this);
    }
}
