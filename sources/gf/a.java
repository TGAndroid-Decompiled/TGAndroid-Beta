package gf;

import com.google.android.gms.internal.cast.i4;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import org.telegram.messenger.FileLog;
public final class a extends ThreadPoolExecutor implements AutoCloseable {
    public final c f10514a;

    public a(gf.c r8, java.util.concurrent.PriorityBlockingQueue r9) {
        throw new UnsupportedOperationException("Method not decompiled: gf.a.<init>(gf.c, java.util.concurrent.PriorityBlockingQueue):void");
    }

    @Override
    public final void beforeExecute(Thread thread, Runnable runnable) {
        CountDownLatch countDownLatch = this.f10514a.f10518b;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e7) {
                FileLog.e(e7);
            }
        }
    }

    @Override
    public final void close() {
        i4.e(this);
    }
}
