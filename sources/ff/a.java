package ff;

import com.google.android.gms.internal.cast.k4;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import org.telegram.messenger.FileLog;
public final class a extends ThreadPoolExecutor implements AutoCloseable {
    public final c f7943a;

    public a(ff.c r8, java.util.concurrent.PriorityBlockingQueue r9) {
        throw new UnsupportedOperationException("Method not decompiled: ff.a.<init>(ff.c, java.util.concurrent.PriorityBlockingQueue):void");
    }

    @Override
    public final void beforeExecute(Thread thread, Runnable runnable) {
        CountDownLatch countDownLatch = this.f7943a.f7947b;
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
        k4.e(this);
    }
}
