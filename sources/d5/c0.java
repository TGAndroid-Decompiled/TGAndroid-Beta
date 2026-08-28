package d5;

import android.os.Handler;
import java.util.ArrayList;
public final class c0 {
    public static final ArrayList f4336b = new ArrayList(50);
    public final Handler f4337a;

    public c0(Handler handler) {
        this.f4337a = handler;
    }

    public static b0 b() {
        b0 b0Var;
        ArrayList arrayList = f4336b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    b0Var = new Object();
                } else {
                    b0Var = (b0) arrayList.remove(arrayList.size() - 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b0Var;
    }

    public final b0 a(int i9, Object obj) {
        b0 b10 = b();
        b10.f4334a = this.f4337a.obtainMessage(i9, obj);
        return b10;
    }

    public final boolean c(Runnable runnable) {
        return this.f4337a.post(runnable);
    }

    public final boolean d(int i9) {
        return this.f4337a.sendEmptyMessage(i9);
    }
}
