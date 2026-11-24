package defpackage;

import android.os.Bundle;
import java.util.concurrent.locks.ReentrantLock;
public final class i1d implements ey4, fy4 {
    public final j1d a;

    public i1d(j1d j1dVar) {
        this.a = j1dVar;
    }

    @Override
    public final void onConnected(Bundle bundle) {
        j1d j1dVar = this.a;
        fre.h(j1dVar.I);
        eha ehaVar = j1dVar.w;
        fre.h(ehaVar);
        ehaVar.B(new h1d(j1dVar));
    }

    @Override
    public final void onConnectionFailed(ds2 ds2Var) {
        boolean z;
        j1d j1dVar = this.a;
        ReentrantLock reentrantLock = j1dVar.b;
        reentrantLock.lock();
        try {
            if (j1dVar.x && !ds2Var.b()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                j1dVar.f();
                j1dVar.b();
            } else {
                j1dVar.g(ds2Var);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public final void onConnectionSuspended(int i) {
    }
}
