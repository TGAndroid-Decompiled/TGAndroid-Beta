package e2;

import android.os.Handler;
import java.util.ArrayList;
public final class z {
    public static final ArrayList f7939b = new ArrayList(50);
    public final Handler f7940a;

    public z(Handler handler) {
        this.f7940a = handler;
    }

    public static y b() {
        y yVar;
        ArrayList arrayList = f7939b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    yVar = new Object();
                } else {
                    yVar = (y) arrayList.remove(arrayList.size() - 1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yVar;
    }

    public final y a(int i10, Object obj) {
        y b10 = b();
        b10.f7938a = this.f7940a.obtainMessage(i10, obj);
        return b10;
    }

    public final boolean c(Runnable runnable) {
        return this.f7940a.post(runnable);
    }

    public final void d(int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d.b(z10);
        this.f7940a.removeMessages(i10);
    }

    public final boolean e(int i10) {
        return this.f7940a.sendEmptyMessage(i10);
    }
}
