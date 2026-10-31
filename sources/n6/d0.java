package n6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
public final class d0 extends w {
    public final IBinder f13562g;
    public final g h;

    public d0(g gVar, int i10, IBinder iBinder, Bundle bundle) {
        super(gVar, i10, bundle);
        this.h = gVar;
        this.f13562g = iBinder;
    }

    @Override
    public final void a(k6.a aVar) {
        g gVar = this.h;
        m mVar = gVar.K;
        if (mVar != null) {
            ((com.google.android.gms.common.api.l) mVar.f13620a).onConnectionFailed(aVar);
        }
        gVar.A(aVar);
    }

    @Override
    public final boolean b() {
        IBinder iBinder = this.f13562g;
        try {
            l.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            g gVar = this.h;
            if (!gVar.w().equals(interfaceDescriptor)) {
                String w9 = gVar.w();
                Log.w("GmsClient", "service descriptor mismatch: " + w9 + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface r10 = gVar.r(iBinder);
            if (r10 == null || (!g.F(gVar, 2, 4, r10) && !g.F(gVar, 3, 4, r10))) {
                return false;
            }
            gVar.O = null;
            Bundle t10 = gVar.t();
            m mVar = gVar.J;
            if (mVar != null) {
                ((com.google.android.gms.common.api.k) mVar.f13620a).onConnected(t10);
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
