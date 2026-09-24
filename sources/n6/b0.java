package n6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
public final class b0 extends b8.b {
    public g f15217b;
    public final int f15218c;

    public b0(g gVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 7);
        this.f15217b = gVar;
        this.f15218c = i10;
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
                g gVar = this.f15217b;
                l.i(gVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                l.h(f0Var);
                gVar.Q = f0Var;
                if (gVar.C()) {
                    e eVar = f0Var.d;
                    m a2 = m.a();
                    if (eVar == null) {
                        nVar = null;
                    } else {
                        nVar = eVar.f15225a;
                    }
                    synchronized (a2) {
                        if (nVar == null) {
                            nVar = m.f15281c;
                        } else {
                            n nVar2 = (n) a2.f15282a;
                            if (nVar2 != null) {
                                if (nVar2.f15283a < nVar.f15283a) {
                                }
                            }
                        }
                        a2.f15282a = nVar;
                    }
                }
                Bundle bundle = f0Var.f15240a;
                l.i(this.f15217b, "onPostInitComplete can be called only once per call to getRemoteService");
                this.f15217b.B(readInt, readStrongBinder, bundle, this.f15218c);
                this.f15217b = null;
            } else {
                parcel.readInt();
                Bundle bundle2 = (Bundle) m7.a.a(parcel, Bundle.CREATOR);
                m7.a.b(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            m7.a.b(parcel);
            l.i(this.f15217b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f15217b.B(parcel.readInt(), parcel.readStrongBinder(), (Bundle) m7.a.a(parcel, Bundle.CREATOR), this.f15218c);
            this.f15217b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
