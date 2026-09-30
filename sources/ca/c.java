package ca;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import i5.d;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l5.r;
public final class c {
    public final double f4187a;
    public final double f4188b;
    public final long f4189c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f4190f;
    public final ThreadPoolExecutor f4191g;
    public final r h;
    public final o0.a f4192i;
    public int f4193j;
    public long f4194k;

    public c(r rVar, da.a aVar, o0.a aVar2) {
        double d = aVar.d;
        double d10 = aVar.e;
        this.f4187a = d;
        this.f4188b = d10;
        this.f4189c = aVar.f7574f * 1000;
        this.h = rVar;
        this.f4192i = aVar2;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f4190f = arrayBlockingQueue;
        this.f4191g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f4193j = 0;
        this.f4194k = 0L;
    }

    public final int a() {
        int max;
        if (this.f4194k == 0) {
            this.f4194k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f4194k) / this.f4189c);
        if (this.f4190f.size() == this.e) {
            max = Math.min(100, this.f4193j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f4193j - currentTimeMillis);
        }
        if (this.f4193j != max) {
            this.f4193j = max;
            this.f4194k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(w9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f45301b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new i5.a(null, bVar.f45300a, d.f10999c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
