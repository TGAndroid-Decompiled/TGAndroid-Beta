package da;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import i5.d;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l5.s;
import n2.e;
public final class c {
    public final double f7912a;
    public final double f7913b;
    public final long f7914c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f7915f;
    public final ThreadPoolExecutor f7916g;
    public final s h;
    public final e f7917i;
    public int f7918j;
    public long f7919k;

    public c(s sVar, ea.a aVar, e eVar) {
        double d = aVar.d;
        double d10 = aVar.e;
        this.f7912a = d;
        this.f7913b = d10;
        this.f7914c = aVar.f8544f * 1000;
        this.h = sVar;
        this.f7917i = eVar;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f7915f = arrayBlockingQueue;
        this.f7916g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f7918j = 0;
        this.f7919k = 0L;
    }

    public final int a() {
        int max;
        if (this.f7919k == 0) {
            this.f7919k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f7919k) / this.f7914c);
        if (this.f7915f.size() == this.e) {
            max = Math.min(100, this.f7918j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f7918j - currentTimeMillis);
        }
        if (this.f7918j != max) {
            this.f7918j = max;
            this.f7919k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(x9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f49674b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new i5.a(null, bVar.f49673a, d.f12710c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
