package defpackage;

import android.os.Bundle;
public final class y7d implements k05, l05 {
    public final zn a;
    public final boolean b;
    public i6d c;

    public y7d(zn znVar, boolean z) {
        this.a = znVar;
        this.b = z;
    }

    @Override
    public final void onConnected(Bundle bundle) {
        xve.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnected(bundle);
    }

    @Override
    public final void onConnectionFailed(ws2 ws2Var) {
        zn znVar = this.a;
        boolean z = this.b;
        xve.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        i6d i6dVar = this.c;
        i6dVar.a.lock();
        try {
            i6dVar.m.x1(ws2Var, znVar, z);
        } finally {
            i6dVar.a.unlock();
        }
    }

    @Override
    public final void onConnectionSuspended(int i) {
        xve.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnectionSuspended(i);
    }
}
