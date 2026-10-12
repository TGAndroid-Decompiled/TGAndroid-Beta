package ca;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import i5.d;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l5.s;
import n7.z0;
public final class c {
    public final double f4570a;
    public final double f4571b;
    public final long f4572c;
    public final long d;
    public final int f4573e;
    public final ArrayBlockingQueue f4574f;
    public final ThreadPoolExecutor f4575g;
    public final s h;
    public final z0 f4576i;
    public int f4577j;
    public long f4578k;

    public c(s sVar, da.b bVar, z0 z0Var) {
        double d = bVar.d;
        double d10 = bVar.f8227e;
        this.f4570a = d;
        this.f4571b = d10;
        this.f4572c = bVar.f8228f * 1000;
        this.h = sVar;
        this.f4576i = z0Var;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.f4573e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f4574f = arrayBlockingQueue;
        this.f4575g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f4577j = 0;
        this.f4578k = 0L;
    }

    public final int a() {
        int max;
        if (this.f4578k == 0) {
            this.f4578k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f4578k) / this.f4572c);
        if (this.f4574f.size() == this.f4573e) {
            max = Math.min(100, this.f4577j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f4577j - currentTimeMillis);
        }
        if (this.f4577j != max) {
            this.f4577j = max;
            this.f4578k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(w9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f50446b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new i5.a(null, bVar.f50445a, d.f12014c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
