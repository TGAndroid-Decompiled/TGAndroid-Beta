package g6;

import a8.r7;
import a8.xa;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.internal.cast.s6;
public final class i {
    public final c f13257a;

    public i(c cVar) {
        this.f13257a = cVar;
    }

    public final void a() {
        c cVar = this.f13257a;
        q qVar = cVar.f13242e;
        if (qVar != null) {
            try {
                h6.h hVar = cVar.f13246j;
                if (hVar != null) {
                    hVar.u();
                }
                o oVar = (o) qVar;
                Parcel p12 = oVar.p1();
                int i7 = com.google.android.gms.internal.cast.t.f6695a;
                p12.writeInt(0);
                oVar.t1(p12, 1);
            } catch (RemoteException e10) {
                c.f13240m.a(e10, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
            }
            l4 l4Var = cVar.f13248l;
            if (l4Var != null) {
                r7.O(l4Var.f6602a, new s6(new xa(3, 4)));
            }
        }
    }
}
