package defpackage;

import android.os.Handler;
import java.util.ArrayList;
public final class cdb {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public cdb(Handler handler) {
        this.a = handler;
    }

    public static bdb d() {
        bdb bdbVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            if (arrayList.isEmpty()) {
                bdbVar = new Object();
            } else {
                bdbVar = (bdb) arrayList.remove(arrayList.size() - 1);
            }
        }
        return bdbVar;
    }

    public final bdb a(int i) {
        bdb d = d();
        d.a = this.a.obtainMessage(i);
        return d;
    }

    public final bdb b(int i, int i2, int i3) {
        bdb d = d();
        d.a = this.a.obtainMessage(i, i2, i3);
        return d;
    }

    public final bdb c(int i, Object obj) {
        bdb d = d();
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
        gre.f(z);
        this.a.removeMessages(i);
    }

    public final void h(int i) {
        this.a.sendEmptyMessage(i);
    }
}
