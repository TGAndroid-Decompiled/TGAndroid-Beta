package j8;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;
public final class u implements OnCompleteListener, Runnable {
    public static final a7.e d = new Handler(Looper.getMainLooper());
    public static final SparseArray f9939e = new SparseArray(2);
    public static final AtomicInteger f9940f = new AtomicInteger();
    public int f9941a;
    public v f9942b;
    public Task f9943c;

    public final void a() {
        if (this.f9943c != null && this.f9942b != null) {
            f9939e.delete(this.f9941a);
            d.removeCallbacks(this);
            v vVar = this.f9942b;
            if (vVar != null) {
                Task task = this.f9943c;
                int i10 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f9943c = task;
        a();
    }

    @Override
    public final void run() {
        f9939e.delete(this.f9941a);
    }
}
