package ha;

import a3.g;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l5.d;
import o5.s;
import q4.q;
public final class b {
    public final double f14098a;
    public final double f14099b;
    public final long f14100c;
    public final long d;
    public final int f14101e;
    public final ArrayBlockingQueue f14102f;
    public final ThreadPoolExecutor f14103g;
    public final s h;
    public final q f14104i;
    public int f14105j;
    public long f14106k;

    public b(s sVar, ia.b bVar, q qVar) {
        double d = bVar.d;
        double d2 = bVar.f16277e;
        this.f14098a = d;
        this.f14099b = d2;
        this.f14100c = bVar.f16278f * 1000;
        this.h = sVar;
        this.f14104i = qVar;
        this.d = SystemClock.elapsedRealtime();
        int i7 = (int) d;
        this.f14101e = i7;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i7);
        this.f14102f = arrayBlockingQueue;
        this.f14103g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f14105j = 0;
        this.f14106k = 0L;
    }

    public final int a() {
        int max;
        if (this.f14106k == 0) {
            this.f14106k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f14106k) / this.f14100c);
        if (this.f14102f.size() == this.f14101e) {
            max = Math.min(100, this.f14105j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f14105j - currentTimeMillis);
        }
        if (this.f14105j != max) {
            this.f14105j = max;
            this.f14106k = System.currentTimeMillis();
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
        this.h.a(new l5.a(null, bVar.f779a, d.f19771c, null), new g(this, taskCompletionSource, z10, bVar, 2));
    }
}
