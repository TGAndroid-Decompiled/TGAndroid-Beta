package org.telegram.messenger;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.support.JobIntentService;
public class KeepAliveJob extends JobIntentService {
    public static volatile CountDownLatch f22683a;
    public static volatile boolean f22684b;
    public static final Object f22685c = new Object();
    public static final j2 d = new j2(3);

    public static void a() {
        synchronized (f22685c) {
            try {
                if (f22683a != null) {
                    if (s2.f26723a) {
                        a8.b("finish keep-alive job");
                    }
                    f22683a.countDown();
                }
                if (f22684b) {
                    if (s2.f26723a) {
                        a8.b("finish queued keep-alive job");
                    }
                    f22684b = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onHandleWork(Intent intent) {
        synchronized (f22685c) {
            try {
                if (!f22684b) {
                    return;
                }
                f22683a = new CountDownLatch(1);
                if (s2.f26723a) {
                    a8.b("started keep-alive job");
                }
                Utilities.f22782e.d(d, 60000L);
                try {
                    f22683a.await();
                } catch (Throwable unused) {
                }
                Utilities.f22782e.a(d);
                synchronized (f22685c) {
                    f22683a = null;
                }
                if (s2.f26723a) {
                    a8.b("ended keep-alive job");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
