package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
public final class dyd implements ServiceConnection {
    public final int a;
    public final hg0 b;

    public dyd(hg0 hg0Var, int i) {
        this.b = hg0Var;
        this.a = i;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        y9d y9dVar;
        hg0 hg0Var = this.b;
        if (iBinder == null) {
            hg0Var.z();
            return;
        }
        synchronized (hg0Var.m) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface != null && (queryLocalInterface instanceof y9d)) {
                y9dVar = (y9d) queryLocalInterface;
            } else {
                y9dVar = new y9d(iBinder);
            }
            hg0Var.n = y9dVar;
        }
        hg0 hg0Var2 = this.b;
        int i = this.a;
        vae vaeVar = new vae(hg0Var2, 0, null);
        igd igdVar = hg0Var2.k;
        igdVar.sendMessage(igdVar.obtainMessage(7, i, -1, vaeVar));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        hg0 hg0Var = this.b;
        synchronized (hg0Var.m) {
            hg0Var.n = null;
        }
        hg0 hg0Var2 = this.b;
        int i = this.a;
        igd igdVar = hg0Var2.k;
        igdVar.sendMessage(igdVar.obtainMessage(6, i, 1));
    }
}
