package org.telegram.messenger;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.support.JobIntentService;
public class KeepAliveJob extends JobIntentService {
    public static volatile CountDownLatch f14426a;
    public static volatile boolean f14427b;
    public static final Object f14428c = new Object();
    public static final ag.f3 d = new ag.f3(16);

    public static void a() {
        synchronized (f14428c) {
            try {
                if (f14426a != null) {
                    if (v2.f18448a) {
                        f8.b("finish keep-alive job");
                    }
                    f14426a.countDown();
                }
                if (f14427b) {
                    if (v2.f18448a) {
                        f8.b("finish queued keep-alive job");
                    }
                    f14427b = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onHandleWork(Intent intent) {
        synchronized (f14428c) {
            try {
                if (!f14427b) {
                    return;
                }
                f14426a = new CountDownLatch(1);
                if (v2.f18448a) {
                    f8.b("started keep-alive job");
                }
                Utilities.e.d(d, 60000L);
                try {
                    f14426a.await();
                } catch (Throwable unused) {
                }
                Utilities.e.a(d);
                synchronized (f14428c) {
                    f14426a = null;
                }
                if (v2.f18448a) {
                    f8.b("ended keep-alive job");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
