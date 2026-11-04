package g2;

import android.os.Handler;
import b8.zb;
import java.util.ArrayList;
public final class j0 {
    public static final ArrayList f11856b = new ArrayList(50);
    public final Handler f11857a;

    public j0(Handler handler) {
        this.f11857a = handler;
    }

    public static i0 c() {
        i0 i0Var;
        ArrayList arrayList = f11856b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    i0Var = new Object();
                } else {
                    i0Var = (i0) arrayList.remove(arrayList.size() - 1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i0Var;
    }

    public final i0 a(int i3) {
        i0 c2 = c();
        c2.f11853a = this.f11857a.obtainMessage(i3);
        return c2;
    }

    public final i0 b(int i3, Object obj) {
        i0 c2 = c();
        c2.f11853a = this.f11857a.obtainMessage(i3, obj);
        return c2;
    }

    public final boolean d(Runnable runnable) {
        return this.f11857a.post(runnable);
    }

    public final void e(int i3) {
        boolean z10;
        if (i3 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        this.f11857a.removeMessages(i3);
    }

    public final boolean f(int i3) {
        return this.f11857a.sendEmptyMessage(i3);
    }
}
