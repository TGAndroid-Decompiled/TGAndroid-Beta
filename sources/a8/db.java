package a8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class db extends a implements fb {
    public final cb x1(a7.b bVar, hb hbVar) {
        cb aVar;
        Parcel p12 = p1();
        int i7 = g0.f404a;
        p12.writeStrongBinder(bVar);
        p12.writeInt(1);
        hbVar.writeToParcel(p12, 0);
        Parcel r12 = r1(p12, 1);
        IBinder readStrongBinder = r12.readStrongBinder();
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
        r12.recycle();
        return aVar;
    }
}
