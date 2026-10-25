package i8;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import o6.l;
public final class c {
    public final j8.f f13885a;
    public h f13886b;

    public c(j8.f fVar) {
        new HashMap();
        l.h(fVar);
        this.f13885a = fVar;
    }

    public final void a(int i10) {
        try {
            j8.f fVar = this.f13885a;
            Parcel N0 = fVar.N0();
            N0.writeInt(i10);
            fVar.R0(N0, 16);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
