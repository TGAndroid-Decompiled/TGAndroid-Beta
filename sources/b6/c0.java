package b6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
public final class c0 extends a7.c {
    public g f1689b;
    public final int f1690c;

    public c0(g gVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 0);
        this.f1689b = gVar;
        this.f1690c = i10;
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        o oVar;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                g0 g0Var = (g0) a7.d.a(parcel, g0.CREATOR);
                a7.d.b(parcel);
                g gVar = this.f1689b;
                m.i(gVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                m.h(g0Var);
                gVar.N = g0Var;
                if (gVar.C()) {
                    e eVar = g0Var.d;
                    n a2 = n.a();
                    if (eVar == null) {
                        oVar = null;
                    } else {
                        oVar = eVar.f1695a;
                    }
                    synchronized (a2) {
                        if (oVar == null) {
                            oVar = n.f1761c;
                        } else {
                            o oVar2 = (o) a2.f1762a;
                            if (oVar2 != null) {
                                if (oVar2.f1763a < oVar.f1763a) {
                                }
                            }
                        }
                        a2.f1762a = oVar;
                    }
                }
                Bundle bundle = g0Var.f1724a;
                m.i(this.f1689b, "onPostInitComplete can be called only once per call to getRemoteService");
                this.f1689b.B(readInt, readStrongBinder, bundle, this.f1690c);
                this.f1689b = null;
            } else {
                parcel.readInt();
                Bundle bundle2 = (Bundle) a7.d.a(parcel, Bundle.CREATOR);
                a7.d.b(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            a7.d.b(parcel);
            m.i(this.f1689b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f1689b.B(parcel.readInt(), parcel.readStrongBinder(), (Bundle) a7.d.a(parcel, Bundle.CREATOR), this.f1690c);
            this.f1689b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
