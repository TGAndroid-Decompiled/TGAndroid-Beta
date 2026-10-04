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
    public final double f4522a;
    public final double f4523b;
    public final long f4524c;
    public final long d;
    public final int f4525e;
    public final ArrayBlockingQueue f4526f;
    public final ThreadPoolExecutor f4527g;
    public final s h;
    public final o0.a f4528i;
    public int f4529j;
    public long f4530k;

    public c(s sVar, da.a aVar, o0.a aVar2) {
        double d = aVar.d;
        double d10 = aVar.f8178e;
        this.f4522a = d;
        this.f4523b = d10;
        this.f4524c = aVar.f8179f * 1000;
        this.h = sVar;
        this.f4528i = aVar2;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.f4525e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f4526f = arrayBlockingQueue;
        this.f4527g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f4529j = 0;
        this.f4530k = 0L;
    }

    public final int a() {
        int max;
        if (this.f4530k == 0) {
            this.f4530k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f4530k) / this.f4524c);
        if (this.f4526f.size() == this.f4525e) {
            max = Math.min(100, this.f4529j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f4529j - currentTimeMillis);
        }
        if (this.f4529j != max) {
            this.f4529j = max;
            this.f4530k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(w9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f48930b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new i5.a(null, bVar.f48929a, d.f11966c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
