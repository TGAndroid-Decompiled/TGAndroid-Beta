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
    public final double f4180a;
    public final double f4181b;
    public final long f4182c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f4183f;
    public final ThreadPoolExecutor f4184g;
    public final r h;
    public final o0.a f4185i;
    public int f4186j;
    public long f4187k;

    public c(r rVar, da.a aVar, o0.a aVar2) {
        double d = aVar.d;
        double d10 = aVar.e;
        this.f4180a = d;
        this.f4181b = d10;
        this.f4182c = aVar.f7562f * 1000;
        this.h = rVar;
        this.f4185i = aVar2;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f4183f = arrayBlockingQueue;
        this.f4184g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f4186j = 0;
        this.f4187k = 0L;
    }

    public final int a() {
        int max;
        if (this.f4187k == 0) {
            this.f4187k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f4187k) / this.f4182c);
        if (this.f4183f.size() == this.e) {
            max = Math.min(100, this.f4186j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f4186j - currentTimeMillis);
        }
        if (this.f4186j != max) {
            this.f4186j = max;
            this.f4187k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(w9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f45179b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new i5.a(null, bVar.f45178a, d.f10985c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
