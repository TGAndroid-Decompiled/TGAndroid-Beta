package h8;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import c2.v0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;
public final class t implements OnCompleteListener, Runnable {
    public static final v0 d = new Handler(Looper.getMainLooper());
    public static final SparseArray f7931e = new SparseArray(2);
    public static final AtomicInteger f7932f = new AtomicInteger();
    public int f7933a;
    public u f7934b;
    public Task f7935c;

    public final void a() {
        if (this.f7935c != null && this.f7934b != null) {
            f7931e.delete(this.f7933a);
            d.removeCallbacks(this);
            u uVar = this.f7934b;
            if (uVar != null) {
                Task task = this.f7935c;
                int i10 = u.d;
                uVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f7935c = task;
        a();
    }

    @Override
    public final void run() {
        f7931e.delete(this.f7933a);
    }
}
