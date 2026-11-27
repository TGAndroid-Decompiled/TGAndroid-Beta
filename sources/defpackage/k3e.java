package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
public final class k3e extends e9d {
    public final IBinder g;
    public final hg0 h;

    public k3e(hg0 hg0Var, int i, IBinder iBinder, Bundle bundle) {
        super(hg0Var, i, bundle);
        this.h = hg0Var;
        this.g = iBinder;
    }

    @Override
    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            xve.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            hg0 hg0Var = this.h;
            String l = hg0Var.l();
            j09 j09Var = hg0Var.t;
            if (!l.equals(interfaceDescriptor)) {
                String l2 = hg0Var.l();
                StringBuilder sb = new StringBuilder(l2.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(l2);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface b = hg0Var.b(iBinder);
            if (b == null || (!hg0Var.y(2, 4, b) && !hg0Var.y(3, 4, b))) {
                return false;
            }
            hg0Var.z = null;
            Bundle g = hg0Var.g();
            if (j09Var != null) {
                ((k05) j09Var.b).onConnected(g);
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override
    public final void b(ws2 ws2Var) {
        hg0 hg0Var = this.h;
        l09 l09Var = hg0Var.u;
        if (l09Var != null) {
            ((l05) l09Var.b).onConnectionFailed(ws2Var);
        }
        hg0Var.s(ws2Var);
    }
}
