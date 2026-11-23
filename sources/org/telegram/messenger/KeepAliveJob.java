package org.telegram.messenger;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.support.JobIntentService;
public class KeepAliveJob extends JobIntentService {
    public static volatile CountDownLatch f22711a;
    public static volatile boolean f22712b;
    public static final Object f22713c = new Object();
    public static final j2 d = new j2(3);

    public static void a() {
        synchronized (f22713c) {
            try {
                if (f22711a != null) {
                    if (s2.f26730a) {
                        a8.b("finish keep-alive job");
                    }
                    f22711a.countDown();
                }
                if (f22712b) {
                    if (s2.f26730a) {
                        a8.b("finish queued keep-alive job");
                    }
                    f22712b = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onHandleWork(Intent intent) {
        synchronized (f22713c) {
            try {
                if (!f22712b) {
                    return;
                }
                f22711a = new CountDownLatch(1);
                if (s2.f26730a) {
                    a8.b("started keep-alive job");
                }
                Utilities.f22810e.d(d, 60000L);
                try {
                    f22711a.await();
                } catch (Throwable unused) {
                }
                Utilities.f22810e.a(d);
                synchronized (f22713c) {
                    f22711a = null;
                }
                if (s2.f26730a) {
                    a8.b("ended keep-alive job");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
