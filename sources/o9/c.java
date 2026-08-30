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
    public final double f16508a;
    public final double f16509b;
    public final long f16510c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f16511f;
    public final ThreadPoolExecutor f16512g;
    public final p h;
    public final f7.b f16513i;
    public int f16514j;
    public long f16515k;

    public c(p pVar, p9.a aVar, f7.b bVar) {
        double d = aVar.d;
        double d10 = aVar.e;
        this.f16508a = d;
        this.f16509b = d10;
        this.f16510c = aVar.f41064f * 1000;
        this.h = pVar;
        this.f16513i = bVar;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f16511f = arrayBlockingQueue;
        this.f16512g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f16514j = 0;
        this.f16515k = 0L;
    }

    public final int a() {
        int max;
        if (this.f16515k == 0) {
            this.f16515k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f16515k) / this.f16510c);
        if (this.f16511f.size() == this.e) {
            max = Math.min(100, this.f16514j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f16514j - currentTimeMillis);
        }
        if (this.f16514j != max) {
            this.f16514j = max;
            this.f16515k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(i9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z4;
        String str = "Sending report through Google DataTransport: " + bVar.f7375b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.h.a(new v2.a(null, bVar.f7374a, d.f45562c, null), new b(this, taskCompletionSource, z4, bVar, 0));
    }
}
