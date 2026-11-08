package ha;

import a3.g;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l5.d;
import o5.r;
import q4.q;
public final class c {
    public final double f14432a;
    public final double f14433b;
    public final long f14434c;
    public final long d;
    public final int f14435e;
    public final ArrayBlockingQueue f14436f;
    public final ThreadPoolExecutor f14437g;
    public final r h;
    public final q f14438i;
    public int f14439j;
    public long f14440k;

    public c(r rVar, ia.b bVar, q qVar) {
        double d = bVar.d;
        double d2 = bVar.f15416e;
        this.f14432a = d;
        this.f14433b = d2;
        this.f14434c = bVar.f15417f * 1000;
        this.h = rVar;
        this.f14438i = qVar;
        this.d = SystemClock.elapsedRealtime();
        int i7 = (int) d;
        this.f14435e = i7;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i7);
        this.f14436f = arrayBlockingQueue;
        this.f14437g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f14439j = 0;
        this.f14440k = 0L;
    }

    public final int a() {
        int max;
        if (this.f14440k == 0) {
            this.f14440k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f14440k) / this.f14434c);
        if (this.f14436f.size() == this.f14435e) {
            max = Math.min(100, this.f14439j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f14439j - currentTimeMillis);
        }
        if (this.f14439j != max) {
            this.f14439j = max;
            this.f14440k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(aa.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z9;
        String str = "Sending report through Google DataTransport: " + bVar.f776b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.h.a(new l5.a(null, bVar.f775a, d.f18177c, null), new g(this, taskCompletionSource, z9, bVar, 1));
    }
}
