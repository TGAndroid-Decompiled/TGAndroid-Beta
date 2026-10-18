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
    public final double f7913a;
    public final double f7914b;
    public final long f7915c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f7916f;
    public final ThreadPoolExecutor f7917g;
    public final s h;
    public final e f7918i;
    public int f7919j;
    public long f7920k;

    public c(s sVar, ea.a aVar, e eVar) {
        double d = aVar.d;
        double d10 = aVar.e;
        this.f7913a = d;
        this.f7914b = d10;
        this.f7915c = aVar.f8545f * 1000;
        this.h = sVar;
        this.f7918i = eVar;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f7916f = arrayBlockingQueue;
        this.f7917g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f7919j = 0;
        this.f7920k = 0L;
    }

    public final int a() {
        int max;
        if (this.f7920k == 0) {
            this.f7920k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f7920k) / this.f7915c);
        if (this.f7916f.size() == this.e) {
            max = Math.min(100, this.f7919j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f7919j - currentTimeMillis);
        }
        if (this.f7919j != max) {
            this.f7919j = max;
            this.f7920k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(x9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f49665b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new i5.a(null, bVar.f49664a, d.f12710c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
