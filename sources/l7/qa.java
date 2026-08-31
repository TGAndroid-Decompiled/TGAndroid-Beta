package l7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class qa extends a7.a implements sa {
    public final pa U0(l6.b bVar, ua uaVar) {
        pa aVar;
        Parcel M0 = M0();
        int i10 = c0.f11816a;
        M0.writeStrongBinder(bVar);
        M0.writeInt(1);
        uaVar.writeToParcel(M0, 0);
        Parcel O0 = O0(M0, 1);
        IBinder readStrongBinder = O0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            if (queryLocalInterface instanceof pa) {
                aVar = (pa) queryLocalInterface;
            } else {
                aVar = new a7.a(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", 6);
            }
        }
        O0.recycle();
        return aVar;
    }
}
