package o9;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v2.d;
import y2.p;
public final class c {
    public final double f16673a;
    public final double f16674b;
    public final long f16675c;
    public final long d;
    public final int f16676e;
    public final ArrayBlockingQueue f16677f;
    public final ThreadPoolExecutor f16678g;
    public final p h;
    public final f7.b f16679i;
    public int f16680j;
    public long f16681k;

    public c(p pVar, p9.a aVar, f7.b bVar) {
        double d = aVar.d;
        double d10 = aVar.f44251e;
        this.f16673a = d;
        this.f16674b = d10;
        this.f16675c = aVar.f44252f * 1000;
        this.h = pVar;
        this.f16679i = bVar;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.f16676e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f16677f = arrayBlockingQueue;
        this.f16678g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f16680j = 0;
        this.f16681k = 0L;
    }

    public final int a() {
        int max;
        if (this.f16681k == 0) {
            this.f16681k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f16681k) / this.f16675c);
        if (this.f16677f.size() == this.f16676e) {
            max = Math.min(100, this.f16680j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f16680j - currentTimeMillis);
        }
        if (this.f16680j != max) {
            this.f16680j = max;
            this.f16681k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(i9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z4;
        String str = "Sending report through Google DataTransport: " + bVar.f7938b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.h.a(new v2.a(null, bVar.f7937a, d.f48888c, null), new b(this, taskCompletionSource, z4, bVar, 0));
    }
}
