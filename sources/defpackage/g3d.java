package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;
public final class g3d implements fh0 {
    public final WeakReference a;
    public final zo b;
    public final boolean c;

    public g3d(l3d l3dVar, zo zoVar, boolean z) {
        this.a = new WeakReference(l3dVar);
        this.b = zoVar;
        this.c = z;
    }

    @Override
    public final void a(ot2 ot2Var) {
        boolean z;
        l3d l3dVar = (l3d) this.a.get();
        if (l3dVar == null) {
            return;
        }
        ReentrantLock reentrantLock = l3dVar.b;
        if (Looper.myLooper() == l3dVar.a.o.h) {
            z = true;
        } else {
            z = false;
        }
        ite.j("onReportServiceBinding must be called on the GoogleApiClient handler thread", z);
        reentrantLock.lock();
        try {
            if (l3dVar.i(0)) {
                if (!ot2Var.c()) {
                    l3dVar.d(ot2Var, this.b, this.c);
                }
                if (l3dVar.j()) {
                    l3dVar.b();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
