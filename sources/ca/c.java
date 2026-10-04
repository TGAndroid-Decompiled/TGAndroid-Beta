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
    public final double f4521a;
    public final double f4522b;
    public final long f4523c;
    public final long d;
    public final int f4524e;
    public final ArrayBlockingQueue f4525f;
    public final ThreadPoolExecutor f4526g;
    public final s h;
    public final o0.a f4527i;
    public int f4528j;
    public long f4529k;

    public c(s sVar, da.a aVar, o0.a aVar2) {
        double d = aVar.d;
        double d10 = aVar.f8177e;
        this.f4521a = d;
        this.f4522b = d10;
        this.f4523c = aVar.f8178f * 1000;
        this.h = sVar;
        this.f4527i = aVar2;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.f4524e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f4525f = arrayBlockingQueue;
        this.f4526g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f4528j = 0;
        this.f4529k = 0L;
    }

    public final int a() {
        int max;
        if (this.f4529k == 0) {
            this.f4529k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f4529k) / this.f4523c);
        if (this.f4525f.size() == this.f4524e) {
            max = Math.min(100, this.f4528j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f4528j - currentTimeMillis);
        }
        if (this.f4528j != max) {
            this.f4528j = max;
            this.f4529k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(w9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f48921b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new i5.a(null, bVar.f48920a, d.f11965c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
