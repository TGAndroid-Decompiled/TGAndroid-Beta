package e2;

import android.os.Handler;
import java.util.ArrayList;
import v7.u6;
public final class i0 {
    public static final ArrayList f8356b = new ArrayList(50);
    public final Handler f8357a;

    public i0(Handler handler) {
        this.f8357a = handler;
    }

    public static h0 c() {
        h0 h0Var;
        ArrayList arrayList = f8356b;
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
        c10.f8353a = this.f8357a.obtainMessage(i10);
        return c10;
    }

    public final h0 b(int i10, Object obj) {
        h0 c10 = c();
        c10.f8353a = this.f8357a.obtainMessage(i10, obj);
        return c10;
    }

    public final boolean d(Runnable runnable) {
        return this.f8357a.post(runnable);
    }

    public final void e(int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        this.f8357a.removeMessages(i10);
    }

    public final boolean f(int i10) {
        return this.f8357a.sendEmptyMessage(i10);
    }
}
