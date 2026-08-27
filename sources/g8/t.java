package g8;

import android.os.Looper;
import android.util.SparseArray;
import c2.t0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;

public final class t implements OnCompleteListener, Runnable {
    public static final t0 d = new t0(Looper.getMainLooper());

    public static final SparseArray f6784e = new SparseArray(2);

    public static final AtomicInteger f6785f = new AtomicInteger();

    public int f6786a;

    public u f6787b;

    public Task f6788c;

    public final void a() {
        if (this.f6788c == null || this.f6787b == null) {
            return;
        }
        f6784e.delete(this.f6786a);
        d.removeCallbacks(this);
        u uVar = this.f6787b;
        if (uVar != null) {
            Task task = this.f6788c;
            int i10 = u.d;
            uVar.a(task);
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f6788c = task;
        a();
    }

    @Override
    public final void run() {
        f6784e.delete(this.f6786a);
    }
}
