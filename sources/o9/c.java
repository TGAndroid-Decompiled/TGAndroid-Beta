package o9;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v2.d;
import y2.p;
public final class c {
    public final double f16490a;
    public final double f16491b;
    public final long f16492c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f16493f;
    public final ThreadPoolExecutor f16494g;
    public final p h;
    public final f7.b f16495i;
    public int f16496j;
    public long f16497k;

    public c(p pVar, p9.b bVar, f7.b bVar2) {
        double d = bVar.d;
        double d10 = bVar.e;
        this.f16490a = d;
        this.f16491b = d10;
        this.f16492c = bVar.f41087f * 1000;
        this.h = pVar;
        this.f16495i = bVar2;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f16493f = arrayBlockingQueue;
        this.f16494g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f16496j = 0;
        this.f16497k = 0L;
    }

    public final int a() {
        int max;
        if (this.f16497k == 0) {
            this.f16497k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f16497k) / this.f16492c);
        if (this.f16493f.size() == this.e) {
            max = Math.min(100, this.f16496j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f16496j - currentTimeMillis);
        }
        if (this.f16496j != max) {
            this.f16496j = max;
            this.f16497k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(i9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z4;
        String str = "Sending report through Google DataTransport: " + bVar.f7357b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.h.a(new v2.a(null, bVar.f7356a, d.f45626c, null), new b(this, taskCompletionSource, z4, bVar, 0));
    }
}
