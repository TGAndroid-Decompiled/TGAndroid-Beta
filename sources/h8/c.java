package h8;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import n6.m;
public final class c {
    public final i8.f f11033a;
    public h f11034b;

    public c(i8.f fVar) {
        new HashMap();
        m.h(fVar);
        this.f11033a = fVar;
    }

    public final void a(int i10) {
        try {
            i8.f fVar = this.f11033a;
            Parcel N0 = fVar.N0();
            N0.writeInt(i10);
            fVar.R0(N0, 16);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
