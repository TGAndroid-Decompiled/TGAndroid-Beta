package org.telegram.messenger;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.support.JobIntentService;
public class KeepAliveJob extends JobIntentService {
    public static volatile CountDownLatch f14427a;
    public static volatile boolean f14428b;
    public static final Object f14429c = new Object();
    public static final ag.f3 d = new ag.f3(16);

    public static void a() {
        synchronized (f14429c) {
            try {
                if (f14427a != null) {
                    if (v2.f18578a) {
                        f8.b("finish keep-alive job");
                    }
                    f14427a.countDown();
                }
                if (f14428b) {
                    if (v2.f18578a) {
                        f8.b("finish queued keep-alive job");
                    }
                    f14428b = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onHandleWork(Intent intent) {
        synchronized (f14429c) {
            try {
                if (!f14428b) {
                    return;
                }
                f14427a = new CountDownLatch(1);
                if (v2.f18578a) {
                    f8.b("started keep-alive job");
                }
                Utilities.e.d(d, 60000L);
                try {
                    f14427a.await();
                } catch (Throwable unused) {
                }
                Utilities.e.a(d);
                synchronized (f14429c) {
                    f14427a = null;
                }
                if (v2.f18578a) {
                    f8.b("ended keep-alive job");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
