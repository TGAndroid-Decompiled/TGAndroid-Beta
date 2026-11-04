package ga;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k5.d;
import n5.r;
public final class c {
    public final double f12190a;
    public final double f12191b;
    public final long f12192c;
    public final long d;
    public final int f12193e;
    public final ArrayBlockingQueue f12194f;
    public final ThreadPoolExecutor f12195g;
    public final r h;
    public final ua.b f12196i;
    public int f12197j;
    public long f12198k;

    public c(r rVar, ha.b bVar, ua.b bVar2) {
        double d = bVar.d;
        double d10 = bVar.f14370e;
        this.f12190a = d;
        this.f12191b = d10;
        this.f12192c = bVar.f14371f * 1000;
        this.h = rVar;
        this.f12196i = bVar2;
        this.d = SystemClock.elapsedRealtime();
        int i3 = (int) d;
        this.f12193e = i3;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i3);
        this.f12194f = arrayBlockingQueue;
        this.f12195g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f12197j = 0;
        this.f12198k = 0L;
    }

    public final int a() {
        int max;
        if (this.f12198k == 0) {
            this.f12198k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f12198k) / this.f12192c);
        if (this.f12194f.size() == this.f12193e) {
            max = Math.min(100, this.f12197j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f12197j - currentTimeMillis);
        }
        if (this.f12197j != max) {
            this.f12197j = max;
            this.f12198k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(z9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f60165b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new k5.a(null, bVar.f60164a, d.f16879c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
