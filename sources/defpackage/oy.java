package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
public final class oy implements Runnable {
    public static Handler f;
    public final x5d e;
    public volatile int b = 1;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final ng7 a = new ng7(this, new mg7(this, (byte) 0));

    public oy(x5d x5dVar) {
        this.e = x5dVar;
    }

    public final void a() {
        x5d x5dVar = this.e;
        int i = 0;
        for (h05 h05Var : x5dVar.j) {
            if (h05Var.a(x5dVar)) {
                i++;
            }
        }
        try {
            x5dVar.i.tryAcquire(i, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (oy.class) {
            handler = f;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                f = handler;
            }
        }
        handler.post(new tnd((Object) this, obj, false, (byte) 7));
    }

    @Override
    public final void run() {
        this.e.a();
    }
}
