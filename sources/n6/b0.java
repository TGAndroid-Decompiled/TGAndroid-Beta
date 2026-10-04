package n6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
public final class b0 extends b8.b {
    public g f16649b;
    public final int f16650c;

    public b0(g gVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 7);
        this.f16649b = gVar;
        this.f16650c = i10;
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
                g gVar = this.f16649b;
                l.i(gVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                l.h(f0Var);
                gVar.Q = f0Var;
                if (gVar.C()) {
                    e eVar = f0Var.d;
                    m a2 = m.a();
                    if (eVar == null) {
                        nVar = null;
                    } else {
                        nVar = eVar.f16657a;
                    }
                    synchronized (a2) {
                        if (nVar == null) {
                            nVar = m.f16719c;
                        } else {
                            n nVar2 = (n) a2.f16720a;
                            if (nVar2 != null) {
                                if (nVar2.f16721a < nVar.f16721a) {
                                }
                            }
                        }
                        a2.f16720a = nVar;
                    }
                }
                Bundle bundle = f0Var.f16674a;
                l.i(this.f16649b, "onPostInitComplete can be called only once per call to getRemoteService");
                this.f16649b.B(readInt, readStrongBinder, bundle, this.f16650c);
                this.f16649b = null;
            } else {
                parcel.readInt();
                Bundle bundle2 = (Bundle) m7.a.a(parcel, Bundle.CREATOR);
                m7.a.b(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            m7.a.b(parcel);
            l.i(this.f16649b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f16649b.B(parcel.readInt(), parcel.readStrongBinder(), (Bundle) m7.a.a(parcel, Bundle.CREATOR), this.f16650c);
            this.f16649b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
