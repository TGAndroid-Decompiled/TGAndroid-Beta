package d6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.q4;
import com.google.android.gms.internal.cast.y6;
public final class i {
    public final c f7548a;

    public i(c cVar) {
        this.f7548a = cVar;
    }

    public final void a() {
        c cVar = this.f7548a;
        q qVar = cVar.e;
        if (qVar != null) {
            try {
                e6.h hVar = cVar.f7537j;
                if (hVar != null) {
                    hVar.u();
                }
                o oVar = (o) qVar;
                Parcel O0 = oVar.O0();
                int i10 = com.google.android.gms.internal.cast.v.f6516a;
                O0.writeInt(0);
                oVar.S0(O0, 1);
            } catch (RemoteException e) {
                c.f7532m.a(e, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
            }
            q4 q4Var = cVar.f7539l;
            if (q4Var != null) {
                cf.c.E(q4Var.f6472a, new y6(new a5.a(3, 2)));
            }
        }
    }
}
