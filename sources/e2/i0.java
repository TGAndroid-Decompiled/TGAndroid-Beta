package e2;

import a8.yb;
import android.os.Handler;
import java.util.ArrayList;
public final class i0 {
    public static final ArrayList f9671b = new ArrayList(50);
    public final Handler f9672a;

    public i0(Handler handler) {
        this.f9672a = handler;
    }

    public static h0 c() {
        h0 h0Var;
        ArrayList arrayList = f9671b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    h0Var = new Object();
                } else {
                    h0Var = (h0) arrayList.remove(arrayList.size() - 1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h0Var;
    }

    public final h0 a(int i10) {
        h0 c10 = c();
        c10.f9668a = this.f9672a.obtainMessage(i10);
        return c10;
    }

    public final h0 b(int i10, Object obj) {
        h0 c10 = c();
        c10.f9668a = this.f9672a.obtainMessage(i10, obj);
        return c10;
    }

    public final boolean d(Runnable runnable) {
        return this.f9672a.post(runnable);
    }

    public final void e(int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        this.f9672a.removeMessages(i10);
    }

    public final boolean f(int i10) {
        return this.f9672a.sendEmptyMessage(i10);
    }
}
