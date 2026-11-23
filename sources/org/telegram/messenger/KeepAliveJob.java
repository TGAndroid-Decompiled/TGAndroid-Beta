package org.telegram.messenger;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.support.JobIntentService;
public class KeepAliveJob extends JobIntentService {
    public static volatile CountDownLatch f22675a;
    public static volatile boolean f22676b;
    public static final Object f22677c = new Object();
    public static final j2 d = new j2(3);

    public static void a() {
        synchronized (f22677c) {
            try {
                if (f22675a != null) {
                    if (s2.f26694a) {
                        a8.b("finish keep-alive job");
                    }
                    f22675a.countDown();
                }
                if (f22676b) {
                    if (s2.f26694a) {
                        a8.b("finish queued keep-alive job");
                    }
                    f22676b = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onHandleWork(Intent intent) {
        synchronized (f22677c) {
            try {
                if (!f22676b) {
                    return;
                }
                f22675a = new CountDownLatch(1);
                if (s2.f26694a) {
                    a8.b("started keep-alive job");
                }
                Utilities.f22774e.d(d, 60000L);
                try {
                    f22675a.await();
                } catch (Throwable unused) {
                }
                Utilities.f22774e.a(d);
                synchronized (f22677c) {
                    f22675a = null;
                }
                if (s2.f26694a) {
                    a8.b("ended keep-alive job");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
