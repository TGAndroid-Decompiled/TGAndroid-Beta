package j8;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;
public final class u implements OnCompleteListener, Runnable {
    public static final a7.e d = new Handler(Looper.getMainLooper());
    public static final SparseArray e = new SparseArray(2);
    public static final AtomicInteger f9308f = new AtomicInteger();
    public int f9309a;
    public v f9310b;
    public Task f9311c;

    public final void a() {
        if (this.f9311c != null && this.f9310b != null) {
            e.delete(this.f9309a);
            d.removeCallbacks(this);
            v vVar = this.f9310b;
            if (vVar != null) {
                Task task = this.f9311c;
                int i10 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f9311c = task;
        a();
    }

    @Override
    public final void run() {
        e.delete(this.f9309a);
    }
}
