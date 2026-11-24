package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;
public final class e1d implements eg0 {
    public final WeakReference a;
    public final yn b;
    public final boolean c;

    public e1d(j1d j1dVar, yn ynVar, boolean z) {
        this.a = new WeakReference(j1dVar);
        this.b = ynVar;
        this.c = z;
    }

    @Override
    public final void a(ds2 ds2Var) {
        boolean z;
        j1d j1dVar = (j1d) this.a.get();
        if (j1dVar == null) {
            return;
        }
        ReentrantLock reentrantLock = j1dVar.b;
        if (Looper.myLooper() == j1dVar.a.o.h) {
            z = true;
        } else {
            z = false;
        }
        fre.j("onReportServiceBinding must be called on the GoogleApiClient handler thread", z);
        reentrantLock.lock();
        try {
            if (j1dVar.j(0)) {
                if (!ds2Var.c()) {
                    j1dVar.d(ds2Var, this.b, this.c);
                }
                if (j1dVar.k()) {
                    j1dVar.b();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
