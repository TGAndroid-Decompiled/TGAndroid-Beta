package o6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
public final class b0 extends c8.b {
    public g f19096b;
    public final int f19097c;

    public b0(g gVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 7);
        this.f19096b = gVar;
        this.f19097c = i10;
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
                f0 f0Var = (f0) n7.a.a(parcel, f0.CREATOR);
                n7.a.b(parcel);
                g gVar = this.f19096b;
                l.i(gVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                l.h(f0Var);
                gVar.Q = f0Var;
                if (gVar.C()) {
                    e eVar = f0Var.d;
                    m a2 = m.a();
                    if (eVar == null) {
                        nVar = null;
                    } else {
                        nVar = eVar.f19104a;
                    }
                    synchronized (a2) {
                        if (nVar == null) {
                            nVar = m.f19160c;
                        } else {
                            n nVar2 = (n) a2.f19161a;
                            if (nVar2 != null) {
                                if (nVar2.f19162a < nVar.f19162a) {
                                }
                            }
                        }
                        a2.f19161a = nVar;
                    }
                }
                Bundle bundle = f0Var.f19119a;
                l.i(this.f19096b, "onPostInitComplete can be called only once per call to getRemoteService");
                this.f19096b.B(readInt, readStrongBinder, bundle, this.f19097c);
                this.f19096b = null;
            } else {
                parcel.readInt();
                Bundle bundle2 = (Bundle) n7.a.a(parcel, Bundle.CREATOR);
                n7.a.b(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            n7.a.b(parcel);
            l.i(this.f19096b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f19096b.B(parcel.readInt(), parcel.readStrongBinder(), (Bundle) n7.a.a(parcel, Bundle.CREATOR), this.f19097c);
            this.f19096b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
