package k9;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t2.d;
import w2.p;
public final class c {
    public final double f14716a;
    public final double f14717b;
    public final long f14718c;
    public final long d;
    public final int f14719e;
    public final ArrayBlockingQueue f14720f;
    public final ThreadPoolExecutor f14721g;
    public final p h;
    public final we.b f14722i;
    public int f14723j;
    public long f14724k;

    public c(p pVar, l9.a aVar, we.b bVar) {
        double d = aVar.d;
        double d9 = aVar.f16700e;
        this.f14716a = d;
        this.f14717b = d9;
        this.f14718c = aVar.f16701f * 1000;
        this.h = pVar;
        this.f14722i = bVar;
        this.d = SystemClock.elapsedRealtime();
        int i9 = (int) d;
        this.f14719e = i9;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i9);
        this.f14720f = arrayBlockingQueue;
        this.f14721g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f14723j = 0;
        this.f14724k = 0L;
    }

    public final int a() {
        int max;
        if (this.f14724k == 0) {
            this.f14724k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f14724k) / this.f14718c);
        if (this.f14720f.size() == this.f14719e) {
            max = Math.min(100, this.f14723j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f14723j - currentTimeMillis);
        }
        if (this.f14723j != max) {
            this.f14723j = max;
            this.f14724k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(e9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f4993b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new t2.a(null, bVar.f4992a, d.f47603c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
