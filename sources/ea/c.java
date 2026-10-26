package ea;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import j5.d;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m5.s;
import y9.l;
public final class c {
    public final double f9865a;
    public final double f9866b;
    public final long f9867c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f9868f;
    public final ThreadPoolExecutor f9869g;
    public final s h;
    public final l f9870i;
    public int f9871j;
    public long f9872k;

    public c(s sVar, fa.a aVar, l lVar) {
        double d = aVar.d;
        double d10 = aVar.e;
        this.f9865a = d;
        this.f9866b = d10;
        this.f9867c = aVar.f10373f * 1000;
        this.h = sVar;
        this.f9870i = lVar;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f9868f = arrayBlockingQueue;
        this.f9869g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f9871j = 0;
        this.f9872k = 0L;
    }

    public final int a() {
        int max;
        if (this.f9872k == 0) {
            this.f9872k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f9872k) / this.f9867c);
        if (this.f9868f.size() == this.e) {
            max = Math.min(100, this.f9871j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f9871j - currentTimeMillis);
        }
        if (this.f9871j != max) {
            this.f9871j = max;
            this.f9872k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(y9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f52416b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new j5.a(null, bVar.f52415a, d.f15515c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
