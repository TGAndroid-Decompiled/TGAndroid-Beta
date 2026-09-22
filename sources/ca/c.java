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
    public final double f4185a;
    public final double f4186b;
    public final long f4187c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f4188f;
    public final ThreadPoolExecutor f4189g;
    public final s h;
    public final o0.a f4190i;
    public int f4191j;
    public long f4192k;

    public c(s sVar, da.a aVar, o0.a aVar2) {
        double d = aVar.d;
        double d10 = aVar.e;
        this.f4185a = d;
        this.f4186b = d10;
        this.f4187c = aVar.f7577f * 1000;
        this.h = sVar;
        this.f4190i = aVar2;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f4188f = arrayBlockingQueue;
        this.f4189g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f4191j = 0;
        this.f4192k = 0L;
    }

    public final int a() {
        int max;
        if (this.f4192k == 0) {
            this.f4192k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f4192k) / this.f4187c);
        if (this.f4188f.size() == this.e) {
            max = Math.min(100, this.f4191j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f4191j - currentTimeMillis);
        }
        if (this.f4191j != max) {
            this.f4191j = max;
            this.f4192k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(w9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f44908b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new i5.a(null, bVar.f44907a, d.f10997c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
