package d5;

import android.os.Handler;
import java.util.ArrayList;

public final class d0 {

    public static final ArrayList f4781b = new ArrayList(50);

    public final Handler f4782a;

    public d0(Handler handler) {
        this.f4782a = handler;
    }

    public static c0 b() {
        c0 c0Var;
        ArrayList arrayList = f4781b;
        synchronized (arrayList) {
            try {
                c0Var = arrayList.isEmpty() ? new c0() : (c0) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0Var;
    }

    public final c0 a(int i10, Object obj) {
        c0 c0VarB = b();
        c0VarB.f4780a = this.f4782a.obtainMessage(i10, obj);
        return c0VarB;
    }

    public final boolean c(Runnable runnable) {
        return this.f4782a.post(runnable);
    }

    public final boolean d(int i10) {
        return this.f4782a.sendEmptyMessage(i10);
    }
}
