package f5;

import android.os.Handler;
import java.util.ArrayList;
public final class a0 {
    public static final ArrayList f6567b = new ArrayList(50);
    public final Handler f6568a;

    public a0(Handler handler) {
        this.f6568a = handler;
    }

    public static z b() {
        z zVar;
        ArrayList arrayList = f6567b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    zVar = new Object();
                } else {
                    zVar = (z) arrayList.remove(arrayList.size() - 1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zVar;
    }

    public final z a(int i10, Object obj) {
        z b10 = b();
        b10.f6647a = this.f6568a.obtainMessage(i10, obj);
        return b10;
    }

    public final boolean c(Runnable runnable) {
        return this.f6568a.post(runnable);
    }

    public final boolean d(int i10) {
        return this.f6568a.sendEmptyMessage(i10);
    }
}
