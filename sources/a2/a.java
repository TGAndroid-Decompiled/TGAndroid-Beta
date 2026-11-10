package a2;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.m;
import d6.d;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import m9.u;
public final class a implements Runnable {
    public static Handler f49f;
    public final d f53e;
    public volatile int f51b = 1;
    public final AtomicBoolean f52c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final c f50a = new c(this, new b(this, 0));

    public a(d dVar) {
        this.f53e = dVar;
    }

    public final void a() {
        d dVar = this.f53e;
        int i7 = 0;
        for (m mVar : dVar.f8205j) {
            if (mVar.b(dVar)) {
                i7++;
            }
        }
        try {
            dVar.f8204i.tryAcquire(i7, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f49f == null) {
                    f49f = new Handler(Looper.getMainLooper());
                }
                handler = f49f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new u(this, obj, false, 1));
    }

    @Override
    public final void run() {
        this.f53e.b();
    }
}
