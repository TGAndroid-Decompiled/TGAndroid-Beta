package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;
public final class vld implements OnCompleteListener, Runnable {
    public static final b99 d = new Handler(Looper.getMainLooper());
    public static final SparseArray e = new SparseArray(2);
    public static final AtomicInteger f = new AtomicInteger();
    public int a;
    public xrd b;
    public Task c;

    public final void a() {
        if (this.c != null && this.b != null) {
            e.delete(this.a);
            d.removeCallbacks(this);
            xrd xrdVar = this.b;
            if (xrdVar != null) {
                Task task = this.c;
                int i = xrd.d;
                xrdVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.c = task;
        a();
    }

    @Override
    public final void run() {
        e.delete(this.a);
    }
}
