package org.telegram.messenger;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.support.JobIntentService;
public class KeepAliveJob extends JobIntentService {
    public static volatile CountDownLatch a;
    public static volatile boolean b;
    public static final Object c = new Object();
    public static final ql3 d = new ql3((byte) 16);

    public static void a() {
        synchronized (c) {
            if (a != null) {
                if (w01.a) {
                    fa4.b("finish keep-alive job");
                }
                a.countDown();
            }
            if (b) {
                if (w01.a) {
                    fa4.b("finish queued keep-alive job");
                }
                b = false;
            }
        }
    }

    @Override
    public final void onHandleWork(Intent intent) {
        synchronized (c) {
            if (!b) {
                return;
            }
            a = new CountDownLatch(1);
            if (w01.a) {
                fa4.b("started keep-alive job");
            }
            Utilities.e.d(d, 60000L);
            try {
                a.await();
            } catch (Throwable unused) {
            }
            Utilities.e.a(d);
            synchronized (c) {
                a = null;
            }
            if (w01.a) {
                fa4.b("ended keep-alive job");
            }
        }
    }
}
