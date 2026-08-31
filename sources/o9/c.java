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
    public final double f16671a;
    public final double f16672b;
    public final long f16673c;
    public final long d;
    public final int f16674e;
    public final ArrayBlockingQueue f16675f;
    public final ThreadPoolExecutor f16676g;
    public final p h;
    public final f7.b f16677i;
    public int f16678j;
    public long f16679k;

    public c(p pVar, p9.a aVar, f7.b bVar) {
        double d = aVar.d;
        double d10 = aVar.f44220e;
        this.f16671a = d;
        this.f16672b = d10;
        this.f16673c = aVar.f44221f * 1000;
        this.h = pVar;
        this.f16677i = bVar;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.f16674e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f16675f = arrayBlockingQueue;
        this.f16676g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f16678j = 0;
        this.f16679k = 0L;
    }

    public final int a() {
        int max;
        if (this.f16679k == 0) {
            this.f16679k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f16679k) / this.f16673c);
        if (this.f16675f.size() == this.f16674e) {
            max = Math.min(100, this.f16678j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f16678j - currentTimeMillis);
        }
        if (this.f16678j != max) {
            this.f16678j = max;
            this.f16679k = System.currentTimeMillis();
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
        this.h.a(new v2.a(null, bVar.f7937a, d.f48852c, null), new b(this, taskCompletionSource, z4, bVar, 0));
    }
}
