package n6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
public final class c0 extends b8.b {
    public g f16671b;
    public final int f16672c;

    public c0(g gVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 7);
        this.f16671b = gVar;
        this.f16672c = i10;
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
                g gVar = this.f16671b;
                m.i(gVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                m.h(g0Var);
                gVar.Q = g0Var;
                if (gVar.C()) {
                    e eVar = g0Var.d;
                    n a2 = n.a();
                    if (eVar == null) {
                        oVar = null;
                    } else {
                        oVar = eVar.f16677a;
                    }
                    synchronized (a2) {
                        if (oVar == null) {
                            oVar = n.f16743c;
                        } else {
                            o oVar2 = (o) a2.f16744a;
                            if (oVar2 != null) {
                                if (oVar2.f16745a < oVar.f16745a) {
                                }
                            }
                        }
                        a2.f16744a = oVar;
                    }
                }
                Bundle bundle = g0Var.f16706a;
                m.i(this.f16671b, "onPostInitComplete can be called only once per call to getRemoteService");
                this.f16671b.B(readInt, readStrongBinder, bundle, this.f16672c);
                this.f16671b = null;
            } else {
                parcel.readInt();
                Bundle bundle2 = (Bundle) m7.a.a(parcel, Bundle.CREATOR);
                m7.a.b(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            m7.a.b(parcel);
            m.i(this.f16671b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f16671b.B(parcel.readInt(), parcel.readStrongBinder(), (Bundle) m7.a.a(parcel, Bundle.CREATOR), this.f16672c);
            this.f16671b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
