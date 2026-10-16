package da;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import i5.d;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l5.r;
public final class c {
    public final double f6459a;
    public final double f6460b;
    public final long f6461c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f6462f;
    public final ThreadPoolExecutor f6463g;
    public final r h;
    public final n3.b f6464i;
    public int f6465j;
    public long f6466k;

    public c(r rVar, ea.a aVar, n3.b bVar) {
        double d = aVar.d;
        double d10 = aVar.e;
        this.f6459a = d;
        this.f6460b = d10;
        this.f6461c = aVar.f8665f * 1000;
        this.h = rVar;
        this.f6464i = bVar;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f6462f = arrayBlockingQueue;
        this.f6463g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f6465j = 0;
        this.f6466k = 0L;
    }

    public final int a() {
        int max;
        if (this.f6466k == 0) {
            this.f6466k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f6466k) / this.f6461c);
        if (this.f6462f.size() == this.e) {
            max = Math.min(100, this.f6465j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f6465j - currentTimeMillis);
        }
        if (this.f6465j != max) {
            this.f6465j = max;
            this.f6466k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(x9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f48278b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new i5.a(null, bVar.f48277a, d.f11325c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
