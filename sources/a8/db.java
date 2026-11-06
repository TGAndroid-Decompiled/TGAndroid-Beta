package a8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class db extends a implements fb {
    public final cb X0(a7.b bVar, hb hbVar) {
        cb aVar;
        Parcel P0 = P0();
        int i7 = g0.f404a;
        P0.writeStrongBinder(bVar);
        P0.writeInt(1);
        hbVar.writeToParcel(P0, 0);
        Parcel R0 = R0(P0, 1);
        IBinder readStrongBinder = R0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            if (queryLocalInterface instanceof cb) {
                aVar = (cb) queryLocalInterface;
            } else {
                aVar = new a(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", 0);
            }
        }
        R0.recycle();
        return aVar;
    }
}
