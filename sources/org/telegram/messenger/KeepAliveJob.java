package org.telegram.messenger;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.support.JobIntentService;
public class KeepAliveJob extends JobIntentService {
    public static volatile CountDownLatch f21238a;
    public static volatile boolean f21239b;
    public static final Object f21240c = new Object();
    public static final ai.m0 d = new ai.m0(27);

    public static void a() {
        synchronized (f21240c) {
            try {
                if (f21238a != null) {
                    if (r2.f25212a) {
                        a8.b("finish keep-alive job");
                    }
                    f21238a.countDown();
                }
                if (f21239b) {
                    if (r2.f25212a) {
                        a8.b("finish queued keep-alive job");
                    }
                    f21239b = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onHandleWork(Intent intent) {
        synchronized (f21240c) {
            try {
                if (!f21239b) {
                    return;
                }
                f21238a = new CountDownLatch(1);
                if (r2.f25212a) {
                    a8.b("started keep-alive job");
                }
                Utilities.f21336e.d(d, 60000L);
                try {
                    f21238a.await();
                } catch (Throwable unused) {
                }
                Utilities.f21336e.a(d);
                synchronized (f21240c) {
                    f21238a = null;
                }
                if (r2.f25212a) {
                    a8.b("ended keep-alive job");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
