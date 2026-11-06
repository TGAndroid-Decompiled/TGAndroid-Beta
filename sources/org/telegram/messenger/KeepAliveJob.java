package org.telegram.messenger;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.support.JobIntentService;
public class KeepAliveJob extends JobIntentService {
    public static volatile CountDownLatch f21235a;
    public static volatile boolean f21236b;
    public static final Object f21237c = new Object();
    public static final ai.m0 d = new ai.m0(25);

    public static void a() {
        synchronized (f21237c) {
            try {
                if (f21235a != null) {
                    if (r2.f25191a) {
                        a8.b("finish keep-alive job");
                    }
                    f21235a.countDown();
                }
                if (f21236b) {
                    if (r2.f25191a) {
                        a8.b("finish queued keep-alive job");
                    }
                    f21236b = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onHandleWork(Intent intent) {
        synchronized (f21237c) {
            try {
                if (!f21236b) {
                    return;
                }
                f21235a = new CountDownLatch(1);
                if (r2.f25191a) {
                    a8.b("started keep-alive job");
                }
                Utilities.f21333e.d(d, 60000L);
                try {
                    f21235a.await();
                } catch (Throwable unused) {
                }
                Utilities.f21333e.a(d);
                synchronized (f21237c) {
                    f21235a = null;
                }
                if (r2.f25191a) {
                    a8.b("ended keep-alive job");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
