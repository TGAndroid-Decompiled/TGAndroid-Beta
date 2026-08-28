package n5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.w6;
public final class i {
    public final c f18495a;

    public i(c cVar) {
        this.f18495a = cVar;
    }

    public final void a() {
        c cVar = this.f18495a;
        q qVar = cVar.f18477e;
        if (qVar != null) {
            try {
                o5.h hVar = cVar.f18481j;
                if (hVar != null) {
                    hVar.u();
                }
                o oVar = (o) qVar;
                Parcel M0 = oVar.M0();
                int i9 = com.google.android.gms.internal.cast.u.f3239a;
                M0.writeInt(0);
                oVar.Q0(M0, 1);
            } catch (RemoteException e10) {
                c.f18475m.a(e10, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
            }
            o4 o4Var = cVar.f18483l;
            if (o4Var != null) {
                b3.b.D(o4Var.f3178a, new w6(new a6.a(3, 3)));
            }
        }
    }
}
