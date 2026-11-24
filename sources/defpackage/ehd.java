package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;
public final class ehd implements OnCompleteListener, Runnable {
    public static final o59 d = new Handler(Looper.getMainLooper());
    public static final SparseArray e = new SparseArray(2);
    public static final AtomicInteger f = new AtomicInteger();
    public int a;
    public gnd b;
    public Task c;

    public final void a() {
        if (this.c != null && this.b != null) {
            e.delete(this.a);
            d.removeCallbacks(this);
            gnd gndVar = this.b;
            if (gndVar != null) {
                Task task = this.c;
                int i = gnd.d;
                gndVar.a(task);
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
