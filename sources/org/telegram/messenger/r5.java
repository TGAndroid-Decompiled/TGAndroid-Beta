package org.telegram.messenger;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
public final class r5 extends Thread {
    public volatile Handler f17903a;
    public final Object f17904b = new Object();
    public ArrayList f17905c = new ArrayList();
    public final CountDownLatch d = new CountDownLatch(1);
    public final int e = -1000;

    public r5(String str) {
        setName(str);
        start();
    }

    public final void a(Runnable runnable) {
        Handler handler = this.f17903a;
        if (handler != null) {
            handler.removeCallbacks(runnable);
            return;
        }
        synchronized (this.f17904b) {
            try {
                ArrayList arrayList = this.f17905c;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (((q5) this.f17905c.get(size)).f17746b == runnable) {
                            this.f17905c.remove(size);
                        }
                    }
                    return;
                }
                this.f17903a.removeCallbacks(runnable);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Handler b() {
        try {
            this.d.await();
        } catch (Exception e) {
            f8.g(e, false);
        }
        return this.f17903a;
    }

    public final void c(Runnable runnable) {
        SystemClock.elapsedRealtime();
        d(runnable, 0L);
    }

    public final boolean d(Runnable runnable, long j10) {
        Handler handler = this.f17903a;
        if (handler != null) {
            if (j10 <= 0) {
                return handler.post(runnable);
            }
            return handler.postDelayed(runnable, j10);
        }
        long max = Math.max(0L, j10) + SystemClock.uptimeMillis();
        synchronized (this.f17904b) {
            try {
                ArrayList arrayList = this.f17905c;
                if (arrayList != null) {
                    arrayList.add(new q5(0, max, runnable));
                    return true;
                }
                return this.f17903a.postAtTime(runnable, max);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        Looper.prepare();
        Handler handler = new Handler(Looper.myLooper(), new p5(this, 1));
        synchronized (this.f17904b) {
            for (int i10 = 0; i10 < this.f17905c.size(); i10++) {
                try {
                    q5 q5Var = (q5) this.f17905c.get(i10);
                    int i11 = q5Var.f17745a;
                    if (i11 == 0) {
                        handler.postAtTime(q5Var.f17746b, q5Var.f17747c);
                    } else if (i11 == 1) {
                        handler.postAtFrontOfQueue(q5Var.f17746b);
                    } else {
                        handler.sendMessageAtTime(null, q5Var.f17747c);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f17905c = null;
            this.f17903a = handler;
        }
        this.d.countDown();
        int i12 = this.e;
        if (i12 != -1000) {
            Process.setThreadPriority(i12);
        }
        Looper.loop();
    }
}
