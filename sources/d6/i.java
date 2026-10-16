package d6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.x6;
import com.google.android.gms.internal.cast.z5;
public final class i {
    public final c f6412a;

    public i(c cVar) {
        this.f6412a = cVar;
    }

    public final void a() {
        c cVar = this.f6412a;
        q qVar = cVar.e;
        if (qVar != null) {
            try {
                e6.h hVar = cVar.f6401j;
                if (hVar != null) {
                    hVar.u();
                }
                o oVar = (o) qVar;
                Parcel N0 = oVar.N0();
                int i10 = com.google.android.gms.internal.cast.v.f5349a;
                N0.writeInt(0);
                oVar.R0(N0, 1);
            } catch (RemoteException e) {
                c.f6396m.a(e, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
            }
            o4 o4Var = cVar.f6403l;
            if (o4Var != null) {
                z5.E(o4Var.f5290a, new x6(new a5.a(3, 2)));
            }
        }
    }
}
