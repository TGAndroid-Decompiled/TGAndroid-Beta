package g6;

import a8.r7;
import a8.wa;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.internal.cast.s6;
public final class i {
    public final c f13562a;

    public i(c cVar) {
        this.f13562a = cVar;
    }

    public final void a() {
        c cVar = this.f13562a;
        q qVar = cVar.f13545e;
        if (qVar != null) {
            try {
                h6.h hVar = cVar.f13549j;
                if (hVar != null) {
                    hVar.u();
                }
                o oVar = (o) qVar;
                Parcel P0 = oVar.P0();
                int i7 = com.google.android.gms.internal.cast.t.f6991a;
                P0.writeInt(0);
                oVar.T0(P0, 1);
            } catch (RemoteException e10) {
                c.f13543m.a(e10, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
            }
            l4 l4Var = cVar.f13551l;
            if (l4Var != null) {
                r7.K(l4Var.f6898a, new s6(new wa(3, 4)));
            }
        }
    }
}
