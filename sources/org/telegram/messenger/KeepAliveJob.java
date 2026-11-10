package org.telegram.messenger;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.support.JobIntentService;
public class KeepAliveJob extends JobIntentService {
    public static volatile CountDownLatch f21243a;
    public static volatile boolean f21244b;
    public static final Object f21245c = new Object();
    public static final ai.m0 d = new ai.m0(27);

    public static void a() {
        synchronized (f21245c) {
            try {
                if (f21243a != null) {
                    if (r2.f25216a) {
                        a8.b("finish keep-alive job");
                    }
                    f21243a.countDown();
                }
                if (f21244b) {
                    if (r2.f25216a) {
                        a8.b("finish queued keep-alive job");
                    }
                    f21244b = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onHandleWork(Intent intent) {
        synchronized (f21245c) {
            try {
                if (!f21244b) {
                    return;
                }
                f21243a = new CountDownLatch(1);
                if (r2.f25216a) {
                    a8.b("started keep-alive job");
                }
                Utilities.f21341e.d(d, 60000L);
                try {
                    f21243a.await();
                } catch (Throwable unused) {
                }
                Utilities.f21341e.a(d);
                synchronized (f21245c) {
                    f21243a = null;
                }
                if (r2.f25216a) {
                    a8.b("ended keep-alive job");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
