package h2;

import a8.la;
import android.os.Handler;
import java.util.ArrayList;
public final class i0 {
    public static final ArrayList f13796b = new ArrayList(50);
    public final Handler f13797a;

    public i0(Handler handler) {
        this.f13797a = handler;
    }

    public static h0 c() {
        h0 h0Var;
        ArrayList arrayList = f13796b;
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

    public final h0 a(int i7) {
        h0 c10 = c();
        c10.f13793a = this.f13797a.obtainMessage(i7);
        return c10;
    }

    public final h0 b(int i7, Object obj) {
        h0 c10 = c();
        c10.f13793a = this.f13797a.obtainMessage(i7, obj);
        return c10;
    }

    public final boolean d(Runnable runnable) {
        return this.f13797a.post(runnable);
    }

    public final void e(int i7) {
        boolean z10;
        if (i7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        this.f13797a.removeMessages(i7);
    }

    public final boolean f(int i7) {
        return this.f13797a.sendEmptyMessage(i7);
    }
}
