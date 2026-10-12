package n6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
public final class c0 extends b8.b {
    public g f16062b;
    public final int f16063c;

    public c0(g gVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 7);
        this.f16062b = gVar;
        this.f16063c = i10;
    }

    @Override
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        n nVar;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                g0 g0Var = (g0) m7.a.a(parcel, g0.CREATOR);
                m7.a.b(parcel);
                g gVar = this.f16062b;
                l.i(gVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                l.h(g0Var);
                gVar.Q = g0Var;
                if (gVar.C()) {
                    e eVar = g0Var.d;
                    m a2 = m.a();
                    if (eVar == null) {
                        nVar = null;
                    } else {
                        nVar = eVar.f16068a;
                    }
                    synchronized (a2) {
                        if (nVar == null) {
                            nVar = m.f16125c;
                        } else {
                            n nVar2 = (n) a2.f16126a;
                            if (nVar2 != null) {
                                if (nVar2.f16127a < nVar.f16127a) {
                                }
                            }
                        }
                        a2.f16126a = nVar;
                    }
                }
                Bundle bundle = g0Var.f16094a;
                l.i(this.f16062b, "onPostInitComplete can be called only once per call to getRemoteService");
                this.f16062b.B(readInt, readStrongBinder, bundle, this.f16063c);
                this.f16062b = null;
            } else {
                parcel.readInt();
                Bundle bundle2 = (Bundle) m7.a.a(parcel, Bundle.CREATOR);
                m7.a.b(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            m7.a.b(parcel);
            l.i(this.f16062b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f16062b.B(parcel.readInt(), parcel.readStrongBinder(), (Bundle) m7.a.a(parcel, Bundle.CREATOR), this.f16063c);
            this.f16062b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
