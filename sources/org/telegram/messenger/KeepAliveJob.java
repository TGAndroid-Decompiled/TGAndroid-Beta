package org.telegram.messenger;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.support.JobIntentService;
public class KeepAliveJob extends JobIntentService {
    public static volatile CountDownLatch f22680a;
    public static volatile boolean f22681b;
    public static final Object f22682c = new Object();
    public static final j2 d = new j2(3);

    public static void a() {
        synchronized (f22682c) {
            try {
                if (f22680a != null) {
                    if (s2.f26721a) {
                        a8.b("finish keep-alive job");
                    }
                    f22680a.countDown();
                }
                if (f22681b) {
                    if (s2.f26721a) {
                        a8.b("finish queued keep-alive job");
                    }
                    f22681b = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onHandleWork(Intent intent) {
        synchronized (f22682c) {
            try {
                if (!f22681b) {
                    return;
                }
                f22680a = new CountDownLatch(1);
                if (s2.f26721a) {
                    a8.b("started keep-alive job");
                }
                Utilities.f22779e.d(d, 60000L);
                try {
                    f22680a.await();
                } catch (Throwable unused) {
                }
                Utilities.f22779e.a(d);
                synchronized (f22682c) {
                    f22680a = null;
                }
                if (s2.f26721a) {
                    a8.b("ended keep-alive job");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
