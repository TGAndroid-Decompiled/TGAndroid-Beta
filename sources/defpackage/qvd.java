package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
public final class qvd implements ServiceConnection {
    public final int a;
    public final hh0 b;

    public qvd(hh0 hh0Var, int i) {
        this.b = hh0Var;
        this.a = i;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        h7d h7dVar;
        hh0 hh0Var = this.b;
        if (iBinder == null) {
            hh0Var.z();
            return;
        }
        synchronized (hh0Var.m) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface != null && (queryLocalInterface instanceof h7d)) {
                h7dVar = (h7d) queryLocalInterface;
            } else {
                h7dVar = new h7d(iBinder);
            }
            hh0Var.n = h7dVar;
        }
        hh0 hh0Var2 = this.b;
        int i = this.a;
        h8e h8eVar = new h8e(hh0Var2, 0, null);
        rdd rddVar = hh0Var2.k;
        rddVar.sendMessage(rddVar.obtainMessage(7, i, -1, h8eVar));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        hh0 hh0Var = this.b;
        synchronized (hh0Var.m) {
            hh0Var.n = null;
        }
        hh0 hh0Var2 = this.b;
        int i = this.a;
        rdd rddVar = hh0Var2.k;
        rddVar.sendMessage(rddVar.obtainMessage(6, i, 1));
    }
}
