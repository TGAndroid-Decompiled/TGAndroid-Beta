package of;

import com.google.android.gms.internal.cast.b0;
import com.google.android.gms.internal.cast.f4;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import org.telegram.messenger.a8;
public final class a extends ThreadPoolExecutor implements AutoCloseable {
    public final b0 f20935a;

    public a(com.google.android.gms.internal.cast.b0 r8, java.util.concurrent.PriorityBlockingQueue r9) {
        throw new UnsupportedOperationException("Method not decompiled: of.a.<init>(com.google.android.gms.internal.cast.b0, java.util.concurrent.PriorityBlockingQueue):void");
    }

    @Override
    public final void beforeExecute(Thread thread, Runnable runnable) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f20935a.f6815c;
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
        f4.h(this);
    }
}
