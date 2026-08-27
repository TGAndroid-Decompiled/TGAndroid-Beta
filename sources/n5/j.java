package n5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.internal.cast.u6;

public final class j {

    public final c f18321a;

    public j(c cVar) {
        this.f18321a = cVar;
    }

    public final void a() {
        c cVar = this.f18321a;
        r rVar = cVar.f18304e;
        if (rVar == null) {
            return;
        }
        try {
            o5.h hVar = cVar.f18308j;
            if (hVar != null) {
                hVar.u();
            }
            p pVar = (p) rVar;
            Parcel parcelM0 = pVar.M0();
            int i10 = com.google.android.gms.internal.cast.t.f3660a;
            parcelM0.writeInt(0);
            pVar.Q0(parcelM0, 1);
        } catch (RemoteException e9) {
            c.f18302m.a(e9, "Unable to call %s on %s.", "onConnected", r.class.getSimpleName());
        }
        m4 m4Var = cVar.f18310l;
        if (m4Var != null) {
            af.h.E(m4Var.f3588a, new u6(new b6.a(3, 3)));
        }
    }
}
