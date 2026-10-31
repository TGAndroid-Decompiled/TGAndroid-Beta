package d6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.internal.cast.u6;
public final class i {
    public final c f5779a;

    public i(c cVar) {
        this.f5779a = cVar;
    }

    public final void a() {
        c cVar = this.f5779a;
        q qVar = cVar.e;
        if (qVar != null) {
            try {
                e6.h hVar = cVar.f5768j;
                if (hVar != null) {
                    hVar.u();
                }
                o oVar = (o) qVar;
                Parcel P0 = oVar.P0();
                int i10 = com.google.android.gms.internal.cast.u.f4789a;
                P0.writeInt(0);
                oVar.T0(P0, 1);
            } catch (RemoteException e) {
                c.f5763m.a(e, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
            }
            m4 m4Var = cVar.f5770l;
            if (m4Var != null) {
                bh.d.O(m4Var.f4712a, new u6(new a5.a(3, 3)));
            }
        }
    }
}
