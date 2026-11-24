package defpackage;

import android.os.Handler;
import java.util.ArrayList;
public final class dfb {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public dfb(Handler handler) {
        this.a = handler;
    }

    public static cfb d() {
        cfb cfbVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            if (arrayList.isEmpty()) {
                cfbVar = new Object();
            } else {
                cfbVar = (cfb) arrayList.remove(arrayList.size() - 1);
            }
        }
        return cfbVar;
    }

    public final cfb a(int i) {
        cfb d = d();
        d.a = this.a.obtainMessage(i);
        return d;
    }

    public final cfb b(int i, int i2, int i3) {
        cfb d = d();
        d.a = this.a.obtainMessage(i, i2, i3);
        return d;
    }

    public final cfb c(int i, Object obj) {
        cfb d = d();
        d.a = this.a.obtainMessage(i, obj);
        return d;
    }

    public final void e(Runnable runnable) {
        this.a.post(runnable);
    }

    public final void f() {
        this.a.removeCallbacksAndMessages(null);
    }

    public final void g(int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        this.a.removeMessages(i);
    }

    public final void h(int i) {
        this.a.sendEmptyMessage(i);
    }
}
