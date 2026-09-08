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
    public final double f4742a;
    public final double f4743b;
    public final long f4744c;
    public final long d;
    public final int f4745e;
    public final ArrayBlockingQueue f4746f;
    public final ThreadPoolExecutor f4747g;
    public final r h;
    public final z0 f4748i;
    public int f4749j;
    public long f4750k;

    public c(r rVar, da.a aVar, z0 z0Var) {
        double d = aVar.d;
        double d10 = aVar.f6676e;
        this.f4742a = d;
        this.f4743b = d10;
        this.f4744c = aVar.f6677f * 1000;
        this.h = rVar;
        this.f4748i = z0Var;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.f4745e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f4746f = arrayBlockingQueue;
        this.f4747g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f4749j = 0;
        this.f4750k = 0L;
    }

    public final int a() {
        int max;
        if (this.f4750k == 0) {
            this.f4750k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f4750k) / this.f4744c);
        if (this.f4746f.size() == this.f4745e) {
            max = Math.min(100, this.f4749j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f4749j - currentTimeMillis);
        }
        if (this.f4749j != max) {
            this.f4749j = max;
            this.f4750k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(w9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f48405b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new i5.a(null, bVar.f48404a, d.f11887c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
