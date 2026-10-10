package ca;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import i5.d;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l5.r;
import org.telegram.ui.ActionBar.b5;
public final class c {
    public final double f4572a;
    public final double f4573b;
    public final long f4574c;
    public final long d;
    public final int f4575e;
    public final ArrayBlockingQueue f4576f;
    public final ThreadPoolExecutor f4577g;
    public final r h;
    public final b5 f4578i;
    public int f4579j;
    public long f4580k;

    public c(r rVar, da.b bVar, b5 b5Var) {
        double d = bVar.d;
        double d10 = bVar.f8230e;
        this.f4572a = d;
        this.f4573b = d10;
        this.f4574c = bVar.f8231f * 1000;
        this.h = rVar;
        this.f4578i = b5Var;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.f4575e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f4576f = arrayBlockingQueue;
        this.f4577g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f4579j = 0;
        this.f4580k = 0L;
    }

    public final int a() {
        int max;
        if (this.f4580k == 0) {
            this.f4580k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f4580k) / this.f4574c);
        if (this.f4576f.size() == this.f4575e) {
            max = Math.min(100, this.f4579j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f4579j - currentTimeMillis);
        }
        if (this.f4579j != max) {
            this.f4579j = max;
            this.f4580k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(w9.b bVar, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        String str = "Sending report through Google DataTransport: " + bVar.f50263b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.a(new i5.a(null, bVar.f50262a, d.f12016c, null), new b(this, taskCompletionSource, z10, bVar, 0));
    }
}
