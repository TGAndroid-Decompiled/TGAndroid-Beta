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
    public final double f7915a;
    public final double f7916b;
    public final long f7917c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f7918f;
    public final ThreadPoolExecutor f7919g;
    public final s h;
    public final e f7920i;
    public int f7921j;
    public long f7922k;

    public c(s sVar, ea.a aVar, e eVar) {
        double d = aVar.d;
        double d10 = aVar.e;
        this.f7915a = d;
        this.f7916b = d10;
        this.f7917c = aVar.f8547f * 1000;
        this.h = sVar;
        this.f7920i = eVar;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f7918f = arrayBlockingQueue;
        this.f7919g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f7921j = 0;
        this.f7922k = 0L;
    }

    public final int a() {
        int max;
        if (this.f7922k == 0) {
            this.f7922k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f7922k) / this.f7917c);
        if (this.f7918f.size() == this.e) {
            max = Math.min(100, this.f7921j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f7921j - currentTimeMillis);
        }
        if (this.f7921j != max) {
            this.f7921j = max;
            this.f7922k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(x9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f49712b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new i5.a(null, bVar.f49711a, d.f12712c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
