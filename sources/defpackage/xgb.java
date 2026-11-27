package defpackage;

import android.os.Handler;
import java.util.ArrayList;
public final class xgb {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public xgb(Handler handler) {
        this.a = handler;
    }

    public static wgb d() {
        wgb wgbVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            if (arrayList.isEmpty()) {
                wgbVar = new Object();
            } else {
                wgbVar = (wgb) arrayList.remove(arrayList.size() - 1);
            }
        }
        return wgbVar;
    }

    public final wgb a(int i) {
        wgb d = d();
        d.a = this.a.obtainMessage(i);
        return d;
    }

    public final wgb b(int i, int i2, int i3) {
        wgb d = d();
        d.a = this.a.obtainMessage(i, i2, i3);
        return d;
    }

    public final wgb c(int i, Object obj) {
        wgb d = d();
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
        yve.f(z);
        this.a.removeMessages(i);
    }

    public final void h(int i) {
        this.a.sendEmptyMessage(i);
    }
}
