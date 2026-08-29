package m9;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import g9.l;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v2.d;
import y2.p;
public final class c {
    public final double f16937a;
    public final double f16938b;
    public final long f16939c;
    public final long d;
    public final int f16940e;
    public final ArrayBlockingQueue f16941f;
    public final ThreadPoolExecutor f16942g;
    public final p h;
    public final l f16943i;
    public int f16944j;
    public long f16945k;

    public c(p pVar, n9.a aVar, l lVar) {
        double d = aVar.d;
        double d10 = aVar.f17167e;
        this.f16937a = d;
        this.f16938b = d10;
        this.f16939c = aVar.f17168f * 1000;
        this.h = pVar;
        this.f16943i = lVar;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.f16940e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f16941f = arrayBlockingQueue;
        this.f16942g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f16944j = 0;
        this.f16945k = 0L;
    }

    public final int a() {
        int max;
        if (this.f16945k == 0) {
            this.f16945k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f16945k) / this.f16939c);
        if (this.f16941f.size() == this.f16940e) {
            max = Math.min(100, this.f16944j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f16944j - currentTimeMillis);
        }
        if (this.f16944j != max) {
            this.f16944j = max;
            this.f16945k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(g9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f7147b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new v2.a(null, bVar.f7146a, d.f49330c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
