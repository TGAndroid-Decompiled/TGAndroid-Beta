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
    public final double f14135a;
    public final double f14136b;
    public final long f14137c;
    public final long d;
    public final int f14138e;
    public final ArrayBlockingQueue f14139f;
    public final ThreadPoolExecutor f14140g;
    public final r h;
    public final q f14141i;
    public int f14142j;
    public long f14143k;

    public b(r rVar, ia.b bVar, q qVar) {
        double d = bVar.d;
        double d2 = bVar.f16214e;
        this.f14135a = d;
        this.f14136b = d2;
        this.f14137c = bVar.f16215f * 1000;
        this.h = rVar;
        this.f14141i = qVar;
        this.d = SystemClock.elapsedRealtime();
        int i7 = (int) d;
        this.f14138e = i7;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i7);
        this.f14139f = arrayBlockingQueue;
        this.f14140g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f14142j = 0;
        this.f14143k = 0L;
    }

    public final int a() {
        int max;
        if (this.f14143k == 0) {
            this.f14143k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f14143k) / this.f14137c);
        if (this.f14139f.size() == this.f14138e) {
            max = Math.min(100, this.f14142j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f14142j - currentTimeMillis);
        }
        if (this.f14142j != max) {
            this.f14142j = max;
            this.f14143k = System.currentTimeMillis();
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
        this.h.a(new l5.a(null, bVar.f779a, d.f19705c, null), new g(this, taskCompletionSource, z10, bVar, 2));
    }
}
