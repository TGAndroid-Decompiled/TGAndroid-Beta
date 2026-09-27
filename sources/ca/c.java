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
    public final double f4182a;
    public final double f4183b;
    public final long f4184c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f4185f;
    public final ThreadPoolExecutor f4186g;
    public final r h;
    public final o0.a f4187i;
    public int f4188j;
    public long f4189k;

    public c(r rVar, da.a aVar, o0.a aVar2) {
        double d = aVar.d;
        double d10 = aVar.e;
        this.f4182a = d;
        this.f4183b = d10;
        this.f4184c = aVar.f7564f * 1000;
        this.h = rVar;
        this.f4187i = aVar2;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f4185f = arrayBlockingQueue;
        this.f4186g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f4188j = 0;
        this.f4189k = 0L;
    }

    public final int a() {
        int max;
        if (this.f4189k == 0) {
            this.f4189k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f4189k) / this.f4184c);
        if (this.f4185f.size() == this.e) {
            max = Math.min(100, this.f4188j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f4188j - currentTimeMillis);
        }
        if (this.f4188j != max) {
            this.f4188j = max;
            this.f4189k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(w9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f45238b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new i5.a(null, bVar.f45237a, d.f10988c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
