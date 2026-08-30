package b6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
public final class e0 extends x {
    public final IBinder f1572g;
    public final g h;

    public e0(g gVar, int i10, IBinder iBinder, Bundle bundle) {
        super(gVar, i10, bundle);
        this.h = gVar;
        this.f1572g = iBinder;
    }

    @Override
    public final void a(y5.a aVar) {
        g gVar = this.h;
        n nVar = gVar.H;
        if (nVar != null) {
            ((com.google.android.gms.common.api.l) nVar.f1629a).onConnectionFailed(aVar);
        }
        gVar.z(aVar);
    }

    @Override
    public final boolean b() {
        IBinder iBinder = this.f1572g;
        try {
            m.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            g gVar = this.h;
            if (!gVar.v().equals(interfaceDescriptor)) {
                String v = gVar.v();
                Log.w("GmsClient", "service descriptor mismatch: " + v + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface q10 = gVar.q(iBinder);
            if (q10 == null || (!g.E(gVar, 2, 4, q10) && !g.E(gVar, 3, 4, q10))) {
                return false;
            }
            gVar.L = null;
            Bundle s6 = gVar.s();
            n nVar = gVar.G;
            if (nVar != null) {
                ((com.google.android.gms.common.api.k) nVar.f1629a).onConnected(s6);
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
