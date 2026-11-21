package org.telegram.messenger;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.support.JobIntentService;
public class KeepAliveJob extends JobIntentService {
    public static volatile CountDownLatch f22708a;
    public static volatile boolean f22709b;
    public static final Object f22710c = new Object();
    public static final j2 d = new j2(3);

    public static void a() {
        synchronized (f22710c) {
            try {
                if (f22708a != null) {
                    if (s2.f26749a) {
                        a8.b("finish keep-alive job");
                    }
                    f22708a.countDown();
                }
                if (f22709b) {
                    if (s2.f26749a) {
                        a8.b("finish queued keep-alive job");
                    }
                    f22709b = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onHandleWork(Intent intent) {
        synchronized (f22710c) {
            try {
                if (!f22709b) {
                    return;
                }
                f22708a = new CountDownLatch(1);
                if (s2.f26749a) {
                    a8.b("started keep-alive job");
                }
                Utilities.f22807e.d(d, 60000L);
                try {
                    f22708a.await();
                } catch (Throwable unused) {
                }
                Utilities.f22807e.a(d);
                synchronized (f22710c) {
                    f22708a = null;
                }
                if (s2.f26749a) {
                    a8.b("ended keep-alive job");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
