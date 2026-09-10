package ca;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import i5.d;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l5.r;
import og.u0;
public final class c {
    public final double f4602a;
    public final double f4603b;
    public final long f4604c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f4605f;
    public final ThreadPoolExecutor f4606g;
    public final r h;
    public final u0 f4607i;
    public int f4608j;
    public long f4609k;

    public c(r rVar, da.a aVar, u0 u0Var) {
        double d = aVar.d;
        double d10 = aVar.e;
        this.f4602a = d;
        this.f4603b = d10;
        this.f4604c = aVar.f6351f * 1000;
        this.h = rVar;
        this.f4607i = u0Var;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f4605f = arrayBlockingQueue;
        this.f4606g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f4608j = 0;
        this.f4609k = 0L;
    }

    public final int a() {
        int max;
        if (this.f4609k == 0) {
            this.f4609k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f4609k) / this.f4604c);
        if (this.f4605f.size() == this.e) {
            max = Math.min(100, this.f4608j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f4608j - currentTimeMillis);
        }
        if (this.f4608j != max) {
            this.f4608j = max;
            this.f4609k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(w9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f43871b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new i5.a(null, bVar.f43870a, d.f10479c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
