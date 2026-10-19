package h8;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import n6.l;
public final class c {
    public final i8.f f11684a;
    public h f11685b;

    public c(i8.f fVar) {
        new HashMap();
        l.h(fVar);
        this.f11684a = fVar;
    }

    public final void a(int i10) {
        try {
            i8.f fVar = this.f11684a;
            Parcel N0 = fVar.N0();
            N0.writeInt(i10);
            fVar.R0(N0, 16);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
