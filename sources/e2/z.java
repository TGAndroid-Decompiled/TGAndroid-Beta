package e2;

import android.os.Handler;
import java.util.ArrayList;
public final class z {
    public static final ArrayList f7242b = new ArrayList(50);
    public final Handler f7243a;

    public z(Handler handler) {
        this.f7243a = handler;
    }

    public static y b() {
        y yVar;
        ArrayList arrayList = f7242b;
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
        b10.f7241a = this.f7243a.obtainMessage(i10, obj);
        return b10;
    }

    public final boolean c(Runnable runnable) {
        return this.f7243a.post(runnable);
    }

    public final void d(int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d.b(z10);
        this.f7243a.removeMessages(i10);
    }

    public final boolean e(int i10) {
        return this.f7243a.sendEmptyMessage(i10);
    }
}
