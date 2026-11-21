package ha;

import a3.g;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l5.d;
import o5.r;
import q4.q;
public final class b {
    public final double f14132a;
    public final double f14133b;
    public final long f14134c;
    public final long d;
    public final int f14135e;
    public final ArrayBlockingQueue f14136f;
    public final ThreadPoolExecutor f14137g;
    public final r h;
    public final q f14138i;
    public int f14139j;
    public long f14140k;

    public b(r rVar, ia.b bVar, q qVar) {
        double d = bVar.d;
        double d2 = bVar.f16211e;
        this.f14132a = d;
        this.f14133b = d2;
        this.f14134c = bVar.f16212f * 1000;
        this.h = rVar;
        this.f14138i = qVar;
        this.d = SystemClock.elapsedRealtime();
        int i7 = (int) d;
        this.f14135e = i7;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i7);
        this.f14136f = arrayBlockingQueue;
        this.f14137g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f14139j = 0;
        this.f14140k = 0L;
    }

    public final int a() {
        int max;
        if (this.f14140k == 0) {
            this.f14140k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f14140k) / this.f14134c);
        if (this.f14136f.size() == this.f14135e) {
            max = Math.min(100, this.f14139j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f14139j - currentTimeMillis);
        }
        if (this.f14139j != max) {
            this.f14139j = max;
            this.f14140k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(aa.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f780b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new l5.a(null, bVar.f779a, d.f19702c, null), new g(this, taskCompletionSource, z10, bVar, 2));
    }
}
