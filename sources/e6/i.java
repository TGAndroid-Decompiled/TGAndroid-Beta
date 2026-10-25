package e6;

import a8.me;
import a8.ng;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.internal.cast.t6;
public final class i {
    public final c f9819a;

    public i(c cVar) {
        this.f9819a = cVar;
    }

    public final void a() {
        c cVar = this.f9819a;
        q qVar = cVar.e;
        if (qVar != null) {
            try {
                f6.h hVar = cVar.f9808j;
                if (hVar != null) {
                    hVar.u();
                }
                o oVar = (o) qVar;
                Parcel N0 = oVar.N0();
                int i10 = com.google.android.gms.internal.cast.t.f6896a;
                N0.writeInt(0);
                oVar.R0(N0, 1);
            } catch (RemoteException e) {
                c.f9803m.a(e, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
            }
            l4 l4Var = cVar.f9810l;
            if (l4Var != null) {
                me.D(l4Var.f6819a, new t6(new ng(3, 4)));
            }
        }
    }
}
