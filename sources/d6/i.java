package d6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.q4;
import com.google.android.gms.internal.cast.y6;
public final class i {
    public final c f8145a;

    public i(c cVar) {
        this.f8145a = cVar;
    }

    public final void a() {
        c cVar = this.f8145a;
        q qVar = cVar.f8130e;
        if (qVar != null) {
            try {
                e6.h hVar = cVar.f8134j;
                if (hVar != null) {
                    hVar.u();
                }
                o oVar = (o) qVar;
                Parcel O0 = oVar.O0();
                int i10 = com.google.android.gms.internal.cast.v.f7013a;
                O0.writeInt(0);
                oVar.S0(O0, 1);
            } catch (RemoteException e7) {
                c.f8128m.a(e7, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
            }
            q4 q4Var = cVar.f8136l;
            if (q4Var != null) {
                cf.c.B(q4Var.f6961a, new y6(new a5.a(3, 2)));
            }
        }
    }
}
