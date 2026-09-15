package ca;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import i5.d;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l5.s;
public final class c {
    public final double f4183a;
    public final double f4184b;
    public final long f4185c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f4186f;
    public final ThreadPoolExecutor f4187g;
    public final s h;
    public final o0.a f4188i;
    public int f4189j;
    public long f4190k;

    public c(s sVar, da.a aVar, o0.a aVar2) {
        double d = aVar.d;
        double d10 = aVar.e;
        this.f4183a = d;
        this.f4184b = d10;
        this.f4185c = aVar.f7575f * 1000;
        this.h = sVar;
        this.f4188i = aVar2;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f4186f = arrayBlockingQueue;
        this.f4187g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f4189j = 0;
        this.f4190k = 0L;
    }

    public final int a() {
        int max;
        if (this.f4190k == 0) {
            this.f4190k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f4190k) / this.f4185c);
        if (this.f4186f.size() == this.e) {
            max = Math.min(100, this.f4189j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f4189j - currentTimeMillis);
        }
        if (this.f4189j != max) {
            this.f4189j = max;
            this.f4190k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(w9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f44912b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new i5.a(null, bVar.f44911a, d.f10995c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
