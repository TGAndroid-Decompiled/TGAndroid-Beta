package n6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
public final class c0 extends b8.b {
    public g f16707b;
    public final int f16708c;

    public c0(g gVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 7);
        this.f16707b = gVar;
        this.f16708c = i10;
    }

    @Override
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        o oVar;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                g0 g0Var = (g0) m7.a.a(parcel, g0.CREATOR);
                m7.a.b(parcel);
                g gVar = this.f16707b;
                m.i(gVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                m.h(g0Var);
                gVar.Q = g0Var;
                if (gVar.C()) {
                    e eVar = g0Var.d;
                    n a2 = n.a();
                    if (eVar == null) {
                        oVar = null;
                    } else {
                        oVar = eVar.f16713a;
                    }
                    synchronized (a2) {
                        if (oVar == null) {
                            oVar = n.f16779c;
                        } else {
                            o oVar2 = (o) a2.f16780a;
                            if (oVar2 != null) {
                                if (oVar2.f16781a < oVar.f16781a) {
                                }
                            }
                        }
                        a2.f16780a = oVar;
                    }
                }
                Bundle bundle = g0Var.f16742a;
                m.i(this.f16707b, "onPostInitComplete can be called only once per call to getRemoteService");
                this.f16707b.B(readInt, readStrongBinder, bundle, this.f16708c);
                this.f16707b = null;
            } else {
                parcel.readInt();
                Bundle bundle2 = (Bundle) m7.a.a(parcel, Bundle.CREATOR);
                m7.a.b(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            m7.a.b(parcel);
            m.i(this.f16707b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f16707b.B(parcel.readInt(), parcel.readStrongBinder(), (Bundle) m7.a.a(parcel, Bundle.CREATOR), this.f16708c);
            this.f16707b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
