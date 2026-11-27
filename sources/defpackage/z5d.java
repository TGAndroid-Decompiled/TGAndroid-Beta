package defpackage;

import android.os.Bundle;
import java.util.concurrent.locks.ReentrantLock;
public final class z5d implements k05, l05 {
    public final a6d a;

    public z5d(a6d a6dVar) {
        this.a = a6dVar;
    }

    @Override
    public final void onConnected(Bundle bundle) {
        a6d a6dVar = this.a;
        xve.h(a6dVar.I);
        xka xkaVar = a6dVar.w;
        xve.h(xkaVar);
        xkaVar.B(new y5d(a6dVar));
    }

    @Override
    public final void onConnectionFailed(ws2 ws2Var) {
        boolean z;
        a6d a6dVar = this.a;
        ReentrantLock reentrantLock = a6dVar.b;
        reentrantLock.lock();
        try {
            if (a6dVar.x && !ws2Var.b()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                a6dVar.f();
                a6dVar.b();
            } else {
                a6dVar.g(ws2Var);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public final void onConnectionSuspended(int i) {
    }
}
