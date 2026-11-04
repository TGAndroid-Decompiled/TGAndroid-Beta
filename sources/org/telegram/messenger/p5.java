package org.telegram.messenger;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
public final class p5 extends Thread {
    public volatile Handler f24701a;
    public final Object f24702b = new Object();
    public ArrayList f24703c = new ArrayList();
    public final CountDownLatch d = new CountDownLatch(1);
    public final int f24704e = -1000;

    public p5(String str) {
        setName(str);
        start();
    }

    public final void a(Runnable runnable) {
        Handler handler = this.f24701a;
        if (handler != null) {
            handler.removeCallbacks(runnable);
            return;
        }
        synchronized (this.f24702b) {
            try {
                ArrayList arrayList = this.f24703c;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (((o5) this.f24703c.get(size)).f24501b == runnable) {
                            this.f24703c.remove(size);
                        }
                    }
                    return;
                }
                this.f24701a.removeCallbacks(runnable);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Handler b() {
        try {
            this.d.await();
        } catch (Exception e10) {
            a8.g(e10, false);
        }
        return this.f24701a;
    }

    public final void c(Runnable runnable) {
        SystemClock.elapsedRealtime();
        e(runnable, 0L);
    }

    public final boolean e(Runnable runnable, long j10) {
        Handler handler = this.f24701a;
        if (handler != null) {
            if (j10 <= 0) {
                return handler.post(runnable);
            }
            return handler.postDelayed(runnable, j10);
        }
        long max = Math.max(0L, j10) + SystemClock.uptimeMillis();
        synchronized (this.f24702b) {
            try {
                ArrayList arrayList = this.f24703c;
                if (arrayList != null) {
                    arrayList.add(new o5(0, max, runnable));
                    return true;
                }
                return this.f24701a.postAtTime(runnable, max);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        Looper.prepare();
        Handler handler = new Handler(Looper.myLooper(), new n5(this, 1));
        synchronized (this.f24702b) {
            for (int i3 = 0; i3 < this.f24703c.size(); i3++) {
                try {
                    o5 o5Var = (o5) this.f24703c.get(i3);
                    int i10 = o5Var.f24500a;
                    if (i10 == 0) {
                        handler.postAtTime(o5Var.f24501b, o5Var.f24502c);
                    } else if (i10 == 1) {
                        handler.postAtFrontOfQueue(o5Var.f24501b);
                    } else {
                        handler.sendMessageAtTime(null, o5Var.f24502c);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f24703c = null;
            this.f24701a = handler;
        }
        this.d.countDown();
        int i11 = this.f24704e;
        if (i11 != -1000) {
            Process.setThreadPriority(i11);
        }
        Looper.loop();
    }
}
