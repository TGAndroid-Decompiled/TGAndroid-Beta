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
    public final double f13789a;
    public final double f13790b;
    public final long f13791c;
    public final long d;
    public final int f13792e;
    public final ArrayBlockingQueue f13793f;
    public final ThreadPoolExecutor f13794g;
    public final s h;
    public final q f13795i;
    public int f13796j;
    public long f13797k;

    public b(s sVar, ia.b bVar, q qVar) {
        double d = bVar.d;
        double d2 = bVar.f15871e;
        this.f13789a = d;
        this.f13790b = d2;
        this.f13791c = bVar.f15872f * 1000;
        this.h = sVar;
        this.f13795i = qVar;
        this.d = SystemClock.elapsedRealtime();
        int i7 = (int) d;
        this.f13792e = i7;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i7);
        this.f13793f = arrayBlockingQueue;
        this.f13794g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f13796j = 0;
        this.f13797k = 0L;
    }

    public final int a() {
        int max;
        if (this.f13797k == 0) {
            this.f13797k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f13797k) / this.f13791c);
        if (this.f13793f.size() == this.f13792e) {
            max = Math.min(100, this.f13796j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f13796j - currentTimeMillis);
        }
        if (this.f13796j != max) {
            this.f13796j = max;
            this.f13797k = System.currentTimeMillis();
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
        this.h.a(new l5.a(null, bVar.f779a, d.f19310c, null), new g(this, taskCompletionSource, z10, bVar, 1));
    }
}
