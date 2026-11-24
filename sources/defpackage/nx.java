package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
public final class nx implements Runnable {
    public static Handler f;
    public final v3d e;
    public volatile int b = 1;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final le7 a = new le7(this, new ke7(this, (byte) 0));

    public nx(v3d v3dVar) {
        this.e = v3dVar;
    }

    public final void a() {
        v3d v3dVar = this.e;
        int i = 0;
        for (gy4 gy4Var : v3dVar.j) {
            if (gy4Var.a(v3dVar)) {
                i++;
            }
        }
        try {
            v3dVar.i.tryAcquire(i, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (nx.class) {
            handler = f;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                f = handler;
            }
        }
        handler.post(new rld((Object) this, obj, false, (byte) 7));
    }

    @Override
    public final void run() {
        this.e.a();
    }
}
