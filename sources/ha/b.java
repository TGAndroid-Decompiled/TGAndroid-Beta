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
    public final double f14103a;
    public final double f14104b;
    public final long f14105c;
    public final long d;
    public final int f14106e;
    public final ArrayBlockingQueue f14107f;
    public final ThreadPoolExecutor f14108g;
    public final r h;
    public final q f14109i;
    public int f14110j;
    public long f14111k;

    public b(r rVar, ia.b bVar, q qVar) {
        double d = bVar.d;
        double d2 = bVar.f16186e;
        this.f14103a = d;
        this.f14104b = d2;
        this.f14105c = bVar.f16187f * 1000;
        this.h = rVar;
        this.f14109i = qVar;
        this.d = SystemClock.elapsedRealtime();
        int i7 = (int) d;
        this.f14106e = i7;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i7);
        this.f14107f = arrayBlockingQueue;
        this.f14108g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f14110j = 0;
        this.f14111k = 0L;
    }

    public final int a() {
        int max;
        if (this.f14111k == 0) {
            this.f14111k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f14111k) / this.f14105c);
        if (this.f14107f.size() == this.f14106e) {
            max = Math.min(100, this.f14110j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f14110j - currentTimeMillis);
        }
        if (this.f14110j != max) {
            this.f14110j = max;
            this.f14111k = System.currentTimeMillis();
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
        this.h.a(new l5.a(null, bVar.f779a, d.f19674c, null), new g(this, taskCompletionSource, z10, bVar, 2));
    }
}
