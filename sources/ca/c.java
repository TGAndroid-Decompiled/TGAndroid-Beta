package ca;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import i5.d;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l5.r;
import m5.e;
public final class c {
    public final double f4189a;
    public final double f4190b;
    public final long f4191c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f4192f;
    public final ThreadPoolExecutor f4193g;
    public final r h;
    public final e f4194i;
    public int f4195j;
    public long f4196k;

    public c(r rVar, da.a aVar, e eVar) {
        double d = aVar.d;
        double d10 = aVar.e;
        this.f4189a = d;
        this.f4190b = d10;
        this.f4191c = aVar.f7580f * 1000;
        this.h = rVar;
        this.f4194i = eVar;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f4192f = arrayBlockingQueue;
        this.f4193g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f4195j = 0;
        this.f4196k = 0L;
    }

    public final int a() {
        int max;
        if (this.f4196k == 0) {
            this.f4196k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f4196k) / this.f4191c);
        if (this.f4192f.size() == this.e) {
            max = Math.min(100, this.f4195j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f4195j - currentTimeMillis);
        }
        if (this.f4195j != max) {
            this.f4195j = max;
            this.f4196k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(w9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f45210b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new i5.a(null, bVar.f45209a, d.f10999c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
