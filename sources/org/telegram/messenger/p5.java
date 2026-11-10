package org.telegram.messenger;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
public final class p5 extends Thread {
    public volatile Handler f24521a;
    public final Object f24522b = new Object();
    public ArrayList f24523c = new ArrayList();
    public final CountDownLatch d = new CountDownLatch(1);
    public final int f24524e = -1000;

    public p5(String str) {
        setName(str);
        start();
    }

    public final void a(Runnable runnable) {
        Handler handler = this.f24521a;
        if (handler != null) {
            handler.removeCallbacks(runnable);
            return;
        }
        synchronized (this.f24522b) {
            try {
                ArrayList arrayList = this.f24523c;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (((o5) this.f24523c.get(size)).f24303b == runnable) {
                            this.f24523c.remove(size);
                        }
                    }
                    return;
                }
                this.f24521a.removeCallbacks(runnable);
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
        return this.f24521a;
    }

    public final void c(Runnable runnable) {
        SystemClock.elapsedRealtime();
        d(runnable, 0L);
    }

    public final boolean d(Runnable runnable, long j3) {
        Handler handler = this.f24521a;
        if (handler != null) {
            if (j3 <= 0) {
                return handler.post(runnable);
            }
            return handler.postDelayed(runnable, j3);
        }
        long max = Math.max(0L, j3) + SystemClock.uptimeMillis();
        synchronized (this.f24522b) {
            try {
                ArrayList arrayList = this.f24523c;
                if (arrayList != null) {
                    arrayList.add(new o5(0, max, runnable));
                    return true;
                }
                return this.f24521a.postAtTime(runnable, max);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        Looper.prepare();
        Handler handler = new Handler(Looper.myLooper(), new n5(this, 1));
        synchronized (this.f24522b) {
            for (int i7 = 0; i7 < this.f24523c.size(); i7++) {
                try {
                    o5 o5Var = (o5) this.f24523c.get(i7);
                    int i10 = o5Var.f24302a;
                    if (i10 == 0) {
                        handler.postAtTime(o5Var.f24303b, o5Var.f24304c);
                    } else if (i10 == 1) {
                        handler.postAtFrontOfQueue(o5Var.f24303b);
                    } else {
                        handler.sendMessageAtTime(null, o5Var.f24304c);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f24523c = null;
            this.f24521a = handler;
        }
        this.d.countDown();
        int i11 = this.f24524e;
        if (i11 != -1000) {
            Process.setThreadPriority(i11);
        }
        Looper.loop();
    }
}
