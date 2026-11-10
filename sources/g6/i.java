package g6;

import a8.r7;
import a8.wa;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.internal.cast.s6;
public final class i {
    public final c f13564a;

    public i(c cVar) {
        this.f13564a = cVar;
    }

    public final void a() {
        c cVar = this.f13564a;
        q qVar = cVar.f13547e;
        if (qVar != null) {
            try {
                h6.h hVar = cVar.f13551j;
                if (hVar != null) {
                    hVar.u();
                }
                o oVar = (o) qVar;
                Parcel p12 = oVar.p1();
                int i7 = com.google.android.gms.internal.cast.t.f6994a;
                p12.writeInt(0);
                oVar.t1(p12, 1);
            } catch (RemoteException e10) {
                c.f13545m.a(e10, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
            }
            l4 l4Var = cVar.f13553l;
            if (l4Var != null) {
                r7.K(l4Var.f6901a, new s6(new wa(3, 4)));
            }
        }
    }
}
