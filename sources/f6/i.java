package f6;

import android.os.Parcel;
import android.os.RemoteException;
import b8.ke;
import b8.kg;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.internal.cast.t6;
public final class i {
    public final c f11485a;

    public i(c cVar) {
        this.f11485a = cVar;
    }

    public final void a() {
        c cVar = this.f11485a;
        q qVar = cVar.f11469e;
        if (qVar != null) {
            try {
                g6.h hVar = cVar.f11473j;
                if (hVar != null) {
                    hVar.u();
                }
                o oVar = (o) qVar;
                Parcel P0 = oVar.P0();
                int i3 = com.google.android.gms.internal.cast.u.f7057a;
                P0.writeInt(0);
                oVar.T0(P0, 1);
            } catch (RemoteException e10) {
                c.f11467m.a(e10, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
            }
            m4 m4Var = cVar.f11475l;
            if (m4Var != null) {
                ke.P(m4Var.f6968a, new t6(new kg(3, 4)));
            }
        }
    }
}
