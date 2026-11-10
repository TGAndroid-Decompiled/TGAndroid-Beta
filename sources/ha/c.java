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
    public final double f14434a;
    public final double f14435b;
    public final long f14436c;
    public final long d;
    public final int f14437e;
    public final ArrayBlockingQueue f14438f;
    public final ThreadPoolExecutor f14439g;
    public final r h;
    public final q f14440i;
    public int f14441j;
    public long f14442k;

    public c(r rVar, ia.b bVar, q qVar) {
        double d = bVar.d;
        double d2 = bVar.f15418e;
        this.f14434a = d;
        this.f14435b = d2;
        this.f14436c = bVar.f15419f * 1000;
        this.h = rVar;
        this.f14440i = qVar;
        this.d = SystemClock.elapsedRealtime();
        int i7 = (int) d;
        this.f14437e = i7;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i7);
        this.f14438f = arrayBlockingQueue;
        this.f14439g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f14441j = 0;
        this.f14442k = 0L;
    }

    public final int a() {
        int max;
        if (this.f14442k == 0) {
            this.f14442k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f14442k) / this.f14436c);
        if (this.f14438f.size() == this.f14437e) {
            max = Math.min(100, this.f14441j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f14441j - currentTimeMillis);
        }
        if (this.f14441j != max) {
            this.f14441j = max;
            this.f14442k = System.currentTimeMillis();
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
        this.h.a(new l5.a(null, bVar.f775a, d.f18180c, null), new g(this, taskCompletionSource, z9, bVar, 1));
    }
}
