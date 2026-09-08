package h8;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import n6.l;
public final class c {
    public final i8.f f10926a;
    public h f10927b;

    public c(i8.f fVar) {
        new HashMap();
        l.h(fVar);
        this.f10926a = fVar;
    }

    public final void a(int i10) {
        try {
            i8.f fVar = this.f10926a;
            Parcel O0 = fVar.O0();
            O0.writeInt(i10);
            fVar.S0(O0, 16);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
