package ca;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import i5.d;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l5.r;
import n7.z0;
public final class c {
    public final double f4715a;
    public final double f4716b;
    public final long f4717c;
    public final long d;
    public final int f4718e;
    public final ArrayBlockingQueue f4719f;
    public final ThreadPoolExecutor f4720g;
    public final r h;
    public final z0 f4721i;
    public int f4722j;
    public long f4723k;

    public c(r rVar, da.a aVar, z0 z0Var) {
        double d = aVar.d;
        double d10 = aVar.f6649e;
        this.f4715a = d;
        this.f4716b = d10;
        this.f4717c = aVar.f6650f * 1000;
        this.h = rVar;
        this.f4721i = z0Var;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.f4718e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f4719f = arrayBlockingQueue;
        this.f4720g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f4722j = 0;
        this.f4723k = 0L;
    }

    public final int a() {
        int max;
        if (this.f4723k == 0) {
            this.f4723k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f4723k) / this.f4717c);
        if (this.f4719f.size() == this.f4718e) {
            max = Math.min(100, this.f4722j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f4722j - currentTimeMillis);
        }
        if (this.f4722j != max) {
            this.f4722j = max;
            this.f4723k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(w9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f48376b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new i5.a(null, bVar.f48375a, d.f11861c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
