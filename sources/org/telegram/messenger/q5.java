package org.telegram.messenger;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
public final class q5 extends Thread {
    public volatile Handler f26360a;
    public final Object f26361b = new Object();
    public ArrayList f26362c = new ArrayList();
    public final CountDownLatch d = new CountDownLatch(1);
    public final int f26363e = -1000;

    public q5(String str) {
        setName(str);
        start();
    }

    public final void a(Runnable runnable) {
        Handler handler = this.f26360a;
        if (handler != null) {
            handler.removeCallbacks(runnable);
            return;
        }
        synchronized (this.f26361b) {
            try {
                ArrayList arrayList = this.f26362c;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (((p5) this.f26362c.get(size)).f26195b == runnable) {
                            this.f26362c.remove(size);
                        }
                    }
                    return;
                }
                this.f26360a.removeCallbacks(runnable);
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
        return this.f26360a;
    }

    public final void c(Runnable runnable) {
        SystemClock.elapsedRealtime();
        d(runnable, 0L);
    }

    public final boolean d(Runnable runnable, long j3) {
        Handler handler = this.f26360a;
        if (handler != null) {
            if (j3 <= 0) {
                return handler.post(runnable);
            }
            return handler.postDelayed(runnable, j3);
        }
        long max = Math.max(0L, j3) + SystemClock.uptimeMillis();
        synchronized (this.f26361b) {
            try {
                ArrayList arrayList = this.f26362c;
                if (arrayList != null) {
                    arrayList.add(new p5(0, max, runnable));
                    return true;
                }
                return this.f26360a.postAtTime(runnable, max);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        Looper.prepare();
        Handler handler = new Handler(Looper.myLooper(), new o5(this, 1));
        synchronized (this.f26361b) {
            for (int i7 = 0; i7 < this.f26362c.size(); i7++) {
                try {
                    p5 p5Var = (p5) this.f26362c.get(i7);
                    int i10 = p5Var.f26194a;
                    if (i10 == 0) {
                        handler.postAtTime(p5Var.f26195b, p5Var.f26196c);
                    } else if (i10 == 1) {
                        handler.postAtFrontOfQueue(p5Var.f26195b);
                    } else {
                        handler.sendMessageAtTime(null, p5Var.f26196c);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f26362c = null;
            this.f26360a = handler;
        }
        this.d.countDown();
        int i11 = this.f26363e;
        if (i11 != -1000) {
            Process.setThreadPriority(i11);
        }
        Looper.loop();
    }
}
