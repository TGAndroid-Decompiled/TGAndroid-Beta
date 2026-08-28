package h7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class o1 extends b7.a implements q3 {
    public final r0 U0(h6.b bVar, s6 s6Var) {
        r0 aVar;
        Parcel M0 = M0();
        int i9 = c0.f9893a;
        M0.writeStrongBinder(bVar);
        M0.writeInt(1);
        s6Var.writeToParcel(M0, 0);
        Parcel O0 = O0(M0, 1);
        IBinder readStrongBinder = O0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            if (queryLocalInterface instanceof r0) {
                aVar = (r0) queryLocalInterface;
            } else {
                aVar = new b7.a(readStrongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", 5);
            }
        }
        O0.recycle();
        return aVar;
    }
}
