package defpackage;

import android.os.Bundle;
public final class h3d implements ey4, fy4 {
    public final yn a;
    public final boolean b;
    public r1d c;

    public h3d(yn ynVar, boolean z) {
        this.a = ynVar;
        this.b = z;
    }

    @Override
    public final void onConnected(Bundle bundle) {
        fre.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnected(bundle);
    }

    @Override
    public final void onConnectionFailed(ds2 ds2Var) {
        yn ynVar = this.a;
        boolean z = this.b;
        fre.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        r1d r1dVar = this.c;
        r1dVar.a.lock();
        try {
            r1dVar.m.a1(ds2Var, ynVar, z);
        } finally {
            r1dVar.a.unlock();
        }
    }

    @Override
    public final void onConnectionSuspended(int i) {
        fre.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnectionSuspended(i);
    }
}
