package d6;

import android.os.Parcel;
import android.os.RemoteException;
import ci.u5;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.w6;
public final class i {
    public final c f8195a;

    public i(c cVar) {
        this.f8195a = cVar;
    }

    public final void a() {
        c cVar = this.f8195a;
        q qVar = cVar.f8180e;
        if (qVar != null) {
            try {
                e6.h hVar = cVar.f8184j;
                if (hVar != null) {
                    hVar.u();
                }
                o oVar = (o) qVar;
                Parcel N0 = oVar.N0();
                int i10 = com.google.android.gms.internal.cast.v.f7022a;
                N0.writeInt(0);
                oVar.R0(N0, 1);
            } catch (RemoteException e7) {
                c.f8178m.a(e7, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
            }
            o4 o4Var = cVar.f8186l;
            if (o4Var != null) {
                u5.E(o4Var.f6953a, new w6(new a5.a(3, 2)));
            }
        }
    }
}
