package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
public final class to3 extends Thread {
    public volatile Handler a;
    public final Object b = new Object();
    public ArrayList c = new ArrayList();
    public final CountDownLatch d = new CountDownLatch(1);
    public final int e = -1000;

    public to3(String str) {
        setName(str);
        start();
    }

    public final void a(Runnable runnable) {
        Handler handler = this.a;
        if (handler != null) {
            handler.removeCallbacks(runnable);
            return;
        }
        synchronized (this.b) {
            ArrayList arrayList = this.c;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((so3) this.c.get(size)).b == runnable) {
                        this.c.remove(size);
                    }
                }
                return;
            }
            this.a.removeCallbacks(runnable);
        }
    }

    public final Handler b() {
        try {
            this.d.await();
        } catch (Exception e) {
            cc4.g(e, false);
        }
        return this.a;
    }

    public final void c(Runnable runnable) {
        SystemClock.elapsedRealtime();
        d(runnable, 0L);
    }

    public final boolean d(Runnable runnable, long j) {
        Handler handler = this.a;
        if (handler != null) {
            if (j <= 0) {
                return handler.post(runnable);
            }
            return handler.postDelayed(runnable, j);
        }
        long max = Math.max(0L, j) + SystemClock.uptimeMillis();
        synchronized (this.b) {
            ArrayList arrayList = this.c;
            if (arrayList != null) {
                arrayList.add(new so3(0, max, runnable));
                return true;
            }
            return this.a.postAtTime(runnable, max);
        }
    }

    @Override
    public final void run() {
        Looper.prepare();
        Handler handler = new Handler(Looper.myLooper(), new Object());
        synchronized (this.b) {
            for (int i = 0; i < this.c.size(); i++) {
                so3 so3Var = (so3) this.c.get(i);
                boolean z = so3Var.a;
                if (!z) {
                    handler.postAtTime(so3Var.b, so3Var.c);
                } else if (z) {
                    handler.postAtFrontOfQueue(so3Var.b);
                } else {
                    handler.sendMessageAtTime(null, so3Var.c);
                }
            }
            this.c = null;
            this.a = handler;
        }
        this.d.countDown();
        int i2 = this.e;
        if (i2 != -1000) {
            Process.setThreadPriority(i2);
        }
        Looper.loop();
    }
}
