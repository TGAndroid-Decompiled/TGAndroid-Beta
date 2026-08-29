package j7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class p1 extends com.google.android.gms.internal.cast.a implements r3 {
    public final r0 U0(j6.b bVar, t6 t6Var) {
        r0 aVar;
        Parcel M0 = M0();
        int i10 = c0.f10975a;
        M0.writeStrongBinder(bVar);
        M0.writeInt(1);
        t6Var.writeToParcel(M0, 0);
        Parcel O0 = O0(M0, 1);
        IBinder readStrongBinder = O0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            if (queryLocalInterface instanceof r0) {
                aVar = (r0) queryLocalInterface;
            } else {
                aVar = new com.google.android.gms.internal.cast.a(readStrongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", 5);
            }
        }
        O0.recycle();
        return aVar;
    }
}
