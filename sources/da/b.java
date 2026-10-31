package da;

import android.os.SystemClock;
import android.util.Log;
import bi.o4;
import com.google.android.gms.tasks.TaskCompletionSource;
import ea.c;
import i5.d;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l5.r;
import x7.g8;
public final class b {
    public final double f5822a;
    public final double f5823b;
    public final long f5824c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f5825f;
    public final ThreadPoolExecutor f5826g;
    public final r h;
    public final g8 f5827i;
    public int f5828j;
    public long f5829k;

    public b(r rVar, c cVar, g8 g8Var) {
        double d = cVar.d;
        double d10 = cVar.e;
        this.f5822a = d;
        this.f5823b = d10;
        this.f5824c = cVar.f6465f * 1000;
        this.h = rVar;
        this.f5827i = g8Var;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f5825f = arrayBlockingQueue;
        this.f5826g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f5828j = 0;
        this.f5829k = 0L;
    }

    public final int a() {
        int max;
        if (this.f5829k == 0) {
            this.f5829k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f5829k) / this.f5824c);
        if (this.f5825f.size() == this.e) {
            max = Math.min(100, this.f5828j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f5828j - currentTimeMillis);
        }
        if (this.f5828j != max) {
            this.f5828j = max;
            this.f5829k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(x9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f53441b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new i5.a(null, bVar.f53440a, d.f8208c, null), new o4(this, taskCompletionSource, z10, bVar, 1));
    }
}
