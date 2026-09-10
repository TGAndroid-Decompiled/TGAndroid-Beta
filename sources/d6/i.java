package d6;

import android.os.Parcel;
import android.os.RemoteException;
import bi.u6;
import com.google.android.gms.internal.cast.q4;
import com.google.android.gms.internal.cast.y6;
public final class i {
    public final c f6320a;

    public i(c cVar) {
        this.f6320a = cVar;
    }

    public final void a() {
        c cVar = this.f6320a;
        q qVar = cVar.e;
        if (qVar != null) {
            try {
                e6.h hVar = cVar.f6309j;
                if (hVar != null) {
                    hVar.u();
                }
                o oVar = (o) qVar;
                Parcel O0 = oVar.O0();
                int i10 = com.google.android.gms.internal.cast.v.f5290a;
                O0.writeInt(0);
                oVar.S0(O0, 1);
            } catch (RemoteException e) {
                c.f6304m.a(e, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
            }
            q4 q4Var = cVar.f6311l;
            if (q4Var != null) {
                u6.D(q4Var.f5246a, new y6(new a5.a(3, 2)));
            }
        }
    }
}
