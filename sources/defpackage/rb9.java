package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class rb9 {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final g5c h;
    public final ym4 i;
    public int j;
    public long k;

    public rb9(g5c g5cVar, hba hbaVar, ym4 ym4Var) {
        double d = hbaVar.d;
        double d2 = hbaVar.e;
        this.a = d;
        this.b = d2;
        this.c = hbaVar.f * 1000;
        this.h = g5cVar;
        this.i = ym4Var;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }

    public final int a() {
        int max;
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.c);
        int size = this.f.size();
        int i = this.j;
        if (size == this.e) {
            max = Math.min(100, i + currentTimeMillis);
        } else {
            max = Math.max(0, i - currentTimeMillis);
        }
        if (this.j != max) {
            this.j = max;
            this.k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(d80 d80Var, TaskCompletionSource taskCompletionSource) {
        boolean z;
        String str = "Sending report through Google DataTransport: " + d80Var.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z = true;
        } else {
            z = false;
        }
        this.h.a(new p90(null, d80Var.a, pm8.c, null), new ag(this, taskCompletionSource, z, d80Var, (byte) 6));
    }
}
