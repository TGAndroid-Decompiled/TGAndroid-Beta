package f8;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import c2.u0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;
public final class u implements OnCompleteListener, Runnable {
    public static final u0 d = new Handler(Looper.getMainLooper());
    public static final SparseArray f5984e = new SparseArray(2);
    public static final AtomicInteger f5985f = new AtomicInteger();
    public int f5986a;
    public v f5987b;
    public Task f5988c;

    public final void a() {
        if (this.f5988c != null && this.f5987b != null) {
            f5984e.delete(this.f5986a);
            d.removeCallbacks(this);
            v vVar = this.f5987b;
            if (vVar != null) {
                Task task = this.f5988c;
                int i9 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f5988c = task;
        a();
    }

    @Override
    public final void run() {
        f5984e.delete(this.f5986a);
    }
}
