package a8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class v1 extends a implements x3 {
    public final z0 x1(a7.b bVar, y6 y6Var) {
        z0 aVar;
        Parcel p12 = p1();
        int i7 = g0.f404a;
        p12.writeStrongBinder(bVar);
        p12.writeInt(1);
        y6Var.writeToParcel(p12, 0);
        Parcel r12 = r1(p12, 1);
        IBinder readStrongBinder = r12.readStrongBinder();
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
        r12.recycle();
        return aVar;
    }
}
