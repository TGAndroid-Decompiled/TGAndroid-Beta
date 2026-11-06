package a8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class v1 extends a implements x3 {
    public final z0 X0(a7.b bVar, y6 y6Var) {
        z0 aVar;
        Parcel P0 = P0();
        int i7 = g0.f404a;
        P0.writeStrongBinder(bVar);
        P0.writeInt(1);
        y6Var.writeToParcel(P0, 0);
        Parcel R0 = R0(P0, 1);
        IBinder readStrongBinder = R0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            if (queryLocalInterface instanceof z0) {
                aVar = (z0) queryLocalInterface;
            } else {
                aVar = new a(readStrongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", 0);
            }
        }
        R0.recycle();
        return aVar;
    }
}
