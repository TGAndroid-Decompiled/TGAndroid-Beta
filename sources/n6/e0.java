package n6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
public final class e0 extends x {
    public final IBinder f16682g;
    public final g h;

    public e0(g gVar, int i10, IBinder iBinder, Bundle bundle) {
        super(gVar, i10, bundle);
        this.h = gVar;
        this.f16682g = iBinder;
    }

    @Override
    public final void a(k6.a aVar) {
        g gVar = this.h;
        n nVar = gVar.K;
        if (nVar != null) {
            ((com.google.android.gms.common.api.l) nVar.f16744a).onConnectionFailed(aVar);
        }
        gVar.z(aVar);
    }

    @Override
    public final boolean b() {
        IBinder iBinder = this.f16682g;
        try {
            m.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            g gVar = this.h;
            if (!gVar.v().equals(interfaceDescriptor)) {
                String v = gVar.v();
                Log.w("GmsClient", "service descriptor mismatch: " + v + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface q6 = gVar.q(iBinder);
            if (q6 == null || (!g.E(gVar, 2, 4, q6) && !g.E(gVar, 3, 4, q6))) {
                return false;
            }
            gVar.O = null;
            Bundle s10 = gVar.s();
            n nVar = gVar.J;
            if (nVar != null) {
                ((com.google.android.gms.common.api.k) nVar.f16744a).onConnected(s10);
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
