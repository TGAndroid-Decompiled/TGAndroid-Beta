package d6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.x6;
import com.google.android.gms.internal.cast.z5;
public final class i {
    public final c f7865a;

    public i(c cVar) {
        this.f7865a = cVar;
    }

    public final void a() {
        c cVar = this.f7865a;
        q qVar = cVar.e;
        if (qVar != null) {
            try {
                e6.h hVar = cVar.f7854j;
                if (hVar != null) {
                    hVar.u();
                }
                o oVar = (o) qVar;
                Parcel N0 = oVar.N0();
                int i10 = com.google.android.gms.internal.cast.v.f6801a;
                N0.writeInt(0);
                oVar.R0(N0, 1);
            } catch (RemoteException e) {
                c.f7849m.a(e, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
            }
            o4 o4Var = cVar.f7856l;
            if (o4Var != null) {
                z5.D(o4Var.f6742a, new x6(new a5.a(3, 2)));
            }
        }
    }
}
