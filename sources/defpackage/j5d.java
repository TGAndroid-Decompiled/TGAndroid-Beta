package defpackage;

import android.os.Bundle;
public final class j5d implements f05, g05 {
    public final zo a;
    public final boolean b;
    public t3d c;

    public j5d(zo zoVar, boolean z) {
        this.a = zoVar;
        this.b = z;
    }

    @Override
    public final void onConnected(Bundle bundle) {
        ite.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnected(bundle);
    }

    @Override
    public final void onConnectionFailed(ot2 ot2Var) {
        zo zoVar = this.a;
        boolean z = this.b;
        ite.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        t3d t3dVar = this.c;
        t3dVar.a.lock();
        try {
            t3dVar.m.A1(ot2Var, zoVar, z);
        } finally {
            t3dVar.a.unlock();
        }
    }

    @Override
    public final void onConnectionSuspended(int i) {
        ite.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnectionSuspended(i);
    }
}
