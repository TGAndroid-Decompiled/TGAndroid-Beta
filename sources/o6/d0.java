package o6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
public final class d0 extends w {
    public final IBinder f19103g;
    public final g h;

    public d0(g gVar, int i10, IBinder iBinder, Bundle bundle) {
        super(gVar, i10, bundle);
        this.h = gVar;
        this.f19103g = iBinder;
    }

    @Override
    public final void a(l6.a aVar) {
        g gVar = this.h;
        m mVar = gVar.K;
        if (mVar != null) {
            ((com.google.android.gms.common.api.l) mVar.f19161a).onConnectionFailed(aVar);
        }
        gVar.z(aVar);
    }

    @Override
    public final boolean b() {
        IBinder iBinder = this.f19103g;
        try {
            l.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            g gVar = this.h;
            if (!gVar.v().equals(interfaceDescriptor)) {
                String v = gVar.v();
                Log.w("GmsClient", "service descriptor mismatch: " + v + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface q5 = gVar.q(iBinder);
            if (q5 == null || (!g.E(gVar, 2, 4, q5) && !g.E(gVar, 3, 4, q5))) {
                return false;
            }
            gVar.O = null;
            Bundle s10 = gVar.s();
            m mVar = gVar.J;
            if (mVar != null) {
                ((com.google.android.gms.common.api.k) mVar.f19161a).onConnected(s10);
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
