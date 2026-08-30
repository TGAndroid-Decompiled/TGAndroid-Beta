package b6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
public final class c0 extends a7.c {
    public g f1562b;
    public final int f1563c;

    public c0(g gVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 0);
        this.f1562b = gVar;
        this.f1563c = i10;
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
                g gVar = this.f1562b;
                m.i(gVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                m.h(g0Var);
                gVar.N = g0Var;
                if (gVar.C()) {
                    e eVar = g0Var.d;
                    n a2 = n.a();
                    if (eVar == null) {
                        oVar = null;
                    } else {
                        oVar = eVar.f1568a;
                    }
                    synchronized (a2) {
                        if (oVar == null) {
                            oVar = n.f1628c;
                        } else {
                            o oVar2 = (o) a2.f1629a;
                            if (oVar2 != null) {
                                if (oVar2.f1630a < oVar.f1630a) {
                                }
                            }
                        }
                        a2.f1629a = oVar;
                    }
                }
                Bundle bundle = g0Var.f1594a;
                m.i(this.f1562b, "onPostInitComplete can be called only once per call to getRemoteService");
                this.f1562b.B(readInt, readStrongBinder, bundle, this.f1563c);
                this.f1562b = null;
            } else {
                parcel.readInt();
                Bundle bundle2 = (Bundle) a7.d.a(parcel, Bundle.CREATOR);
                a7.d.b(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            a7.d.b(parcel);
            m.i(this.f1562b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f1562b.B(parcel.readInt(), parcel.readStrongBinder(), (Bundle) a7.d.a(parcel, Bundle.CREATOR), this.f1563c);
            this.f1562b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
