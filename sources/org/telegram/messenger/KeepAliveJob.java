package org.telegram.messenger;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.support.JobIntentService;
public class KeepAliveJob extends JobIntentService {
    public static volatile CountDownLatch f22778a;
    public static volatile boolean f22779b;
    public static final Object f22780c = new Object();
    public static final j2 d = new j2(3);

    public static void a() {
        synchronized (f22780c) {
            try {
                if (f22778a != null) {
                    if (s2.f26829a) {
                        a8.b("finish keep-alive job");
                    }
                    f22778a.countDown();
                }
                if (f22779b) {
                    if (s2.f26829a) {
                        a8.b("finish queued keep-alive job");
                    }
                    f22779b = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onHandleWork(Intent intent) {
        synchronized (f22780c) {
            try {
                if (!f22779b) {
                    return;
                }
                f22778a = new CountDownLatch(1);
                if (s2.f26829a) {
                    a8.b("started keep-alive job");
                }
                Utilities.f22877e.d(d, 60000L);
                try {
                    f22778a.await();
                } catch (Throwable unused) {
                }
                Utilities.f22877e.a(d);
                synchronized (f22780c) {
                    f22778a = null;
                }
                if (s2.f26829a) {
                    a8.b("ended keep-alive job");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
