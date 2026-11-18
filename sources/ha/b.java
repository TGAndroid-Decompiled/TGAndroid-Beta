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
    public final double f14106a;
    public final double f14107b;
    public final long f14108c;
    public final long d;
    public final int f14109e;
    public final ArrayBlockingQueue f14110f;
    public final ThreadPoolExecutor f14111g;
    public final r h;
    public final q f14112i;
    public int f14113j;
    public long f14114k;

    public b(r rVar, ia.b bVar, q qVar) {
        double d = bVar.d;
        double d2 = bVar.f16189e;
        this.f14106a = d;
        this.f14107b = d2;
        this.f14108c = bVar.f16190f * 1000;
        this.h = rVar;
        this.f14112i = qVar;
        this.d = SystemClock.elapsedRealtime();
        int i7 = (int) d;
        this.f14109e = i7;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i7);
        this.f14110f = arrayBlockingQueue;
        this.f14111g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f14113j = 0;
        this.f14114k = 0L;
    }

    public final int a() {
        int max;
        if (this.f14114k == 0) {
            this.f14114k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f14114k) / this.f14108c);
        if (this.f14110f.size() == this.f14109e) {
            max = Math.min(100, this.f14113j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f14113j - currentTimeMillis);
        }
        if (this.f14113j != max) {
            this.f14113j = max;
            this.f14114k = System.currentTimeMillis();
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
        this.h.a(new l5.a(null, bVar.f779a, d.f19677c, null), new g(this, taskCompletionSource, z10, bVar, 2));
    }
}
