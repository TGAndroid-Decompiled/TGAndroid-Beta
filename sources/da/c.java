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
    public final double f7924a;
    public final double f7925b;
    public final long f7926c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f7927f;
    public final ThreadPoolExecutor f7928g;
    public final s h;
    public final e f7929i;
    public int f7930j;
    public long f7931k;

    public c(s sVar, ea.a aVar, e eVar) {
        double d = aVar.d;
        double d10 = aVar.e;
        this.f7924a = d;
        this.f7925b = d10;
        this.f7926c = aVar.f8551f * 1000;
        this.h = sVar;
        this.f7929i = eVar;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f7927f = arrayBlockingQueue;
        this.f7928g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f7930j = 0;
        this.f7931k = 0L;
    }

    public final int a() {
        int max;
        if (this.f7931k == 0) {
            this.f7931k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f7931k) / this.f7926c);
        if (this.f7927f.size() == this.e) {
            max = Math.min(100, this.f7930j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f7930j - currentTimeMillis);
        }
        if (this.f7930j != max) {
            this.f7930j = max;
            this.f7931k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(x9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f50116b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new i5.a(null, bVar.f50115a, d.f12742c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
