package n6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
public final class b0 extends b8.b {
    public g f13834b;
    public final int f13835c;

    public b0(g gVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 7);
        this.f13834b = gVar;
        this.f13835c = i10;
    }

    @Override
    public final boolean J0(int i10, Parcel parcel, Parcel parcel2) {
        n nVar;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                f0 f0Var = (f0) m7.a.a(parcel, f0.CREATOR);
                m7.a.b(parcel);
                g gVar = this.f13834b;
                l.i(gVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                l.h(f0Var);
                gVar.Q = f0Var;
                if (gVar.C()) {
                    e eVar = f0Var.d;
                    m a2 = m.a();
                    if (eVar == null) {
                        nVar = null;
                    } else {
                        nVar = eVar.f13842a;
                    }
                    synchronized (a2) {
                        if (nVar == null) {
                            nVar = m.f13898c;
                        } else {
                            n nVar2 = (n) a2.f13899a;
                            if (nVar2 != null) {
                                if (nVar2.f13900a < nVar.f13900a) {
                                }
                            }
                        }
                        a2.f13899a = nVar;
                    }
                }
                Bundle bundle = f0Var.f13857a;
                l.i(this.f13834b, "onPostInitComplete can be called only once per call to getRemoteService");
                this.f13834b.B(readInt, readStrongBinder, bundle, this.f13835c);
                this.f13834b = null;
            } else {
                parcel.readInt();
                Bundle bundle2 = (Bundle) m7.a.a(parcel, Bundle.CREATOR);
                m7.a.b(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            m7.a.b(parcel);
            l.i(this.f13834b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f13834b.B(parcel.readInt(), parcel.readStrongBinder(), (Bundle) m7.a.a(parcel, Bundle.CREATOR), this.f13835c);
            this.f13834b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
