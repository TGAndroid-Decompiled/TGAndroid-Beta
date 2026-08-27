package l9;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t2.d;
import w2.p;

public final class c {

    public final double f15497a;

    public final double f15498b;

    public final long f15499c;
    public final long d;

    public final int f15500e;

    public final ArrayBlockingQueue f15501f;

    public final ThreadPoolExecutor f15502g;
    public final p h;

    public final xe.b f15503i;

    public int f15504j;

    public long f15505k;

    public c(p pVar, m9.a aVar, xe.b bVar) {
        double d = aVar.d;
        double d10 = aVar.f17884e;
        long j10 = ((long) aVar.f17885f) * 1000;
        this.f15497a = d;
        this.f15498b = d10;
        this.f15499c = j10;
        this.h = pVar;
        this.f15503i = bVar;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.f15500e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f15501f = arrayBlockingQueue;
        this.f15502g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f15504j = 0;
        this.f15505k = 0L;
    }

    public final int a() {
        if (this.f15505k == 0) {
            this.f15505k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f15505k) / this.f15499c);
        int iMin = this.f15501f.size() == this.f15500e ? Math.min(100, this.f15504j + iCurrentTimeMillis) : Math.max(0, this.f15504j - iCurrentTimeMillis);
        if (this.f15504j != iMin) {
            this.f15504j = iMin;
            this.f15505k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(f9.b bVar, TaskCompletionSource taskCompletionSource) {
        String str = "Sending report through Google DataTransport: " + bVar.f5924b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        this.h.a(new t2.a(null, bVar.f5923a, d.f48014c, null), new b(this, taskCompletionSource, SystemClock.elapsedRealtime() - this.d < 2000, bVar, 0));
    }
}
