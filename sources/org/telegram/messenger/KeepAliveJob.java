package org.telegram.messenger;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.support.JobIntentService;
public class KeepAliveJob extends JobIntentService {
    public static volatile CountDownLatch f22317a;
    public static volatile boolean f22318b;
    public static final Object f22319c = new Object();
    public static final c6 d = new c6(1);

    public static void a() {
        synchronized (f22319c) {
            try {
                if (f22317a != null) {
                    if (r2.f26206a) {
                        a8.b("finish keep-alive job");
                    }
                    f22317a.countDown();
                }
                if (f22318b) {
                    if (r2.f26206a) {
                        a8.b("finish queued keep-alive job");
                    }
                    f22318b = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onHandleWork(Intent intent) {
        synchronized (f22319c) {
            try {
                if (!f22318b) {
                    return;
                }
                f22317a = new CountDownLatch(1);
                if (r2.f26206a) {
                    a8.b("started keep-alive job");
                }
                Utilities.f22416e.d(d, 60000L);
                try {
                    f22317a.await();
                } catch (Throwable unused) {
                }
                Utilities.f22416e.a(d);
                synchronized (f22319c) {
                    f22317a = null;
                }
                if (r2.f26206a) {
                    a8.b("ended keep-alive job");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
