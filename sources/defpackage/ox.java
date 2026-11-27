package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
public final class ox implements Runnable {
    public static Handler f;
    public final m8d e;
    public volatile int b = 1;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final vg7 a = new vg7(this, new ug7(this, (byte) 0));

    public ox(m8d m8dVar) {
        this.e = m8dVar;
    }

    public final void a() {
        m8d m8dVar = this.e;
        int i = 0;
        for (m05 m05Var : m8dVar.j) {
            if (m05Var.a(m8dVar)) {
                i++;
            }
        }
        try {
            m8dVar.i.tryAcquire(i, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (ox.class) {
            handler = f;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                f = handler;
            }
        }
        handler.post(new iqd((Object) this, obj, false, (byte) 7));
    }

    @Override
    public final void run() {
        this.e.a();
    }
}
