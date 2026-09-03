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
    public static final AtomicInteger f9290f = new AtomicInteger();
    public int f9291a;
    public v f9292b;
    public Task f9293c;

    public final void a() {
        if (this.f9293c != null && this.f9292b != null) {
            e.delete(this.f9291a);
            d.removeCallbacks(this);
            v vVar = this.f9292b;
            if (vVar != null) {
                Task task = this.f9293c;
                int i10 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f9293c = task;
        a();
    }

    @Override
    public final void run() {
        e.delete(this.f9291a);
    }
}
