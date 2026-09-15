package e2;

import android.os.Handler;
import java.util.ArrayList;
public final class z {
    public static final ArrayList f7937b = new ArrayList(50);
    public final Handler f7938a;

    public z(Handler handler) {
        this.f7938a = handler;
    }

    public static y b() {
        y yVar;
        ArrayList arrayList = f7937b;
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
        b10.f7936a = this.f7938a.obtainMessage(i10, obj);
        return b10;
    }

    public final boolean c(Runnable runnable) {
        return this.f7938a.post(runnable);
    }

    public final void d(int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d.b(z10);
        this.f7938a.removeMessages(i10);
    }

    public final boolean e(int i10) {
        return this.f7938a.sendEmptyMessage(i10);
    }
}
