package d6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.q4;
import com.google.android.gms.internal.cast.y6;
public final class i {
    public final c f6642a;

    public i(c cVar) {
        this.f6642a = cVar;
    }

    public final void a() {
        c cVar = this.f6642a;
        q qVar = cVar.f6627e;
        if (qVar != null) {
            try {
                e6.h hVar = cVar.f6631j;
                if (hVar != null) {
                    hVar.u();
                }
                o oVar = (o) qVar;
                Parcel O0 = oVar.O0();
                int i10 = com.google.android.gms.internal.cast.v.f5514a;
                O0.writeInt(0);
                oVar.S0(O0, 1);
            } catch (RemoteException e7) {
                c.f6625m.a(e7, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
            }
            q4 q4Var = cVar.f6633l;
            if (q4Var != null) {
                cf.c.y(q4Var.f5462a, new y6(new a5.a(3, 2)));
            }
        }
    }
}
