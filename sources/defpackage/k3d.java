package defpackage;

import android.os.Bundle;
import java.util.concurrent.locks.ReentrantLock;
public final class k3d implements f05, g05 {
    public final l3d a;

    public k3d(l3d l3dVar) {
        this.a = l3dVar;
    }

    @Override
    public final void onConnected(Bundle bundle) {
        l3d l3dVar = this.a;
        ite.h(l3dVar.I);
        gja gjaVar = l3dVar.w;
        ite.h(gjaVar);
        gjaVar.B(new j3d(l3dVar));
    }

    @Override
    public final void onConnectionFailed(ot2 ot2Var) {
        boolean z;
        l3d l3dVar = this.a;
        ReentrantLock reentrantLock = l3dVar.b;
        reentrantLock.lock();
        try {
            if (l3dVar.x && !ot2Var.b()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                l3dVar.f();
                l3dVar.b();
            } else {
                l3dVar.g(ot2Var);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public final void onConnectionSuspended(int i) {
    }
}
