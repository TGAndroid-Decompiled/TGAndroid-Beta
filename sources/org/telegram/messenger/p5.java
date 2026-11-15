package org.telegram.messenger;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
public final class p5 extends Thread {
    public volatile Handler f25898a;
    public final Object f25899b = new Object();
    public ArrayList f25900c = new ArrayList();
    public final CountDownLatch d = new CountDownLatch(1);
    public final int f25901e = -1000;

    public p5(String str) {
        setName(str);
        start();
    }

    public final void a(Runnable runnable) {
        Handler handler = this.f25898a;
        if (handler != null) {
            handler.removeCallbacks(runnable);
            return;
        }
        synchronized (this.f25899b) {
            try {
                ArrayList arrayList = this.f25900c;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (((o5) this.f25900c.get(size)).f25725b == runnable) {
                            this.f25900c.remove(size);
                        }
                    }
                    return;
                }
                this.f25898a.removeCallbacks(runnable);
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
        return this.f25898a;
    }

    public final void c(Runnable runnable) {
        SystemClock.elapsedRealtime();
        d(runnable, 0L);
    }

    public final boolean d(Runnable runnable, long j3) {
        Handler handler = this.f25898a;
        if (handler != null) {
            if (j3 <= 0) {
                return handler.post(runnable);
            }
            return handler.postDelayed(runnable, j3);
        }
        long max = Math.max(0L, j3) + SystemClock.uptimeMillis();
        synchronized (this.f25899b) {
            try {
                ArrayList arrayList = this.f25900c;
                if (arrayList != null) {
                    arrayList.add(new o5(0, max, runnable));
                    return true;
                }
                return this.f25898a.postAtTime(runnable, max);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        Looper.prepare();
        Handler handler = new Handler(Looper.myLooper(), new n5(this, 1));
        synchronized (this.f25899b) {
            for (int i7 = 0; i7 < this.f25900c.size(); i7++) {
                try {
                    o5 o5Var = (o5) this.f25900c.get(i7);
                    int i10 = o5Var.f25724a;
                    if (i10 == 0) {
                        handler.postAtTime(o5Var.f25725b, o5Var.f25726c);
                    } else if (i10 == 1) {
                        handler.postAtFrontOfQueue(o5Var.f25725b);
                    } else {
                        handler.sendMessageAtTime(null, o5Var.f25726c);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f25900c = null;
            this.f25898a = handler;
        }
        this.d.countDown();
        int i11 = this.f25901e;
        if (i11 != -1000) {
            Process.setThreadPriority(i11);
        }
        Looper.loop();
    }
}
