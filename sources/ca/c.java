package ca;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import i5.d;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l5.r;
import n7.z0;
public final class c {
    public final double f4571a;
    public final double f4572b;
    public final long f4573c;
    public final long d;
    public final int f4574e;
    public final ArrayBlockingQueue f4575f;
    public final ThreadPoolExecutor f4576g;
    public final r h;
    public final z0 f4577i;
    public int f4578j;
    public long f4579k;

    public c(r rVar, da.b bVar, z0 z0Var) {
        double d = bVar.d;
        double d10 = bVar.f8229e;
        this.f4571a = d;
        this.f4572b = d10;
        this.f4573c = bVar.f8230f * 1000;
        this.h = rVar;
        this.f4577i = z0Var;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.f4574e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f4575f = arrayBlockingQueue;
        this.f4576g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f4578j = 0;
        this.f4579k = 0L;
    }

    public final int a() {
        int max;
        if (this.f4579k == 0) {
            this.f4579k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f4579k) / this.f4573c);
        if (this.f4575f.size() == this.f4574e) {
            max = Math.min(100, this.f4578j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f4578j - currentTimeMillis);
        }
        if (this.f4578j != max) {
            this.f4578j = max;
            this.f4579k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(w9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f50340b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new i5.a(null, bVar.f50339a, d.f12015c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
