package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
public final class x0e extends p6d {
    public final IBinder g;
    public final hh0 h;

    public x0e(hh0 hh0Var, int i, IBinder iBinder, Bundle bundle) {
        super(hh0Var, i, bundle);
        this.h = hh0Var;
        this.g = iBinder;
    }

    @Override
    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            ite.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            hh0 hh0Var = this.h;
            String l = hh0Var.l();
            cf9 cf9Var = hh0Var.t;
            if (!l.equals(interfaceDescriptor)) {
                String l2 = hh0Var.l();
                StringBuilder sb = new StringBuilder(l2.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(l2);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface b = hh0Var.b(iBinder);
            if (b == null || (!hh0Var.y(2, 4, b) && !hh0Var.y(3, 4, b))) {
                return false;
            }
            hh0Var.z = null;
            Bundle g = hh0Var.g();
            if (cf9Var != null) {
                ((f05) cf9Var.b).onConnected(g);
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override
    public final void b(ot2 ot2Var) {
        hh0 hh0Var = this.h;
        oo8 oo8Var = hh0Var.u;
        if (oo8Var != null) {
            ((g05) oo8Var.b).onConnectionFailed(ot2Var);
        }
        hh0Var.s(ot2Var);
    }
}
