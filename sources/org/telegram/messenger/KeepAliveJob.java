package org.telegram.messenger;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.support.JobIntentService;
public class KeepAliveJob extends JobIntentService {
    public static volatile CountDownLatch f21288a;
    public static volatile boolean f21289b;
    public static final Object f21290c = new Object();
    public static final ai.y1 d = new ai.y1(29);

    public static void a() {
        synchronized (f21290c) {
            try {
                if (f21288a != null) {
                    if (r2.f25040a) {
                        a8.b("finish keep-alive job");
                    }
                    f21288a.countDown();
                }
                if (f21289b) {
                    if (r2.f25040a) {
                        a8.b("finish queued keep-alive job");
                    }
                    f21289b = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onHandleWork(Intent intent) {
        synchronized (f21290c) {
            try {
                if (!f21289b) {
                    return;
                }
                f21288a = new CountDownLatch(1);
                if (r2.f25040a) {
                    a8.b("started keep-alive job");
                }
                Utilities.f21387e.e(d, 60000L);
                try {
                    f21288a.await();
                } catch (Throwable unused) {
                }
                Utilities.f21387e.a(d);
                synchronized (f21290c) {
                    f21288a = null;
                }
                if (r2.f25040a) {
                    a8.b("ended keep-alive job");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
