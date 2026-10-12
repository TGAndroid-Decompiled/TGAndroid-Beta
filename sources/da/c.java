package da;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import i5.d;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l5.r;
import n6.o;
public final class c {
    public final double f6456a;
    public final double f6457b;
    public final long f6458c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f6459f;
    public final ThreadPoolExecutor f6460g;
    public final r h;
    public final o f6461i;
    public int f6462j;
    public long f6463k;

    public c(r rVar, ea.a aVar, o oVar) {
        double d = aVar.d;
        double d10 = aVar.e;
        this.f6456a = d;
        this.f6457b = d10;
        this.f6458c = aVar.f8662f * 1000;
        this.h = rVar;
        this.f6461i = oVar;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f6459f = arrayBlockingQueue;
        this.f6460g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f6462j = 0;
        this.f6463k = 0L;
    }

    public final int a() {
        int max;
        if (this.f6463k == 0) {
            this.f6463k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f6463k) / this.f6458c);
        if (this.f6459f.size() == this.e) {
            max = Math.min(100, this.f6462j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f6462j - currentTimeMillis);
        }
        if (this.f6462j != max) {
            this.f6462j = max;
            this.f6463k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(x9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f48279b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new i5.a(null, bVar.f48278a, d.f11321c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
