package j8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class e extends a8.a {
    public final a V0() {
        a aVar;
        Parcel M0 = M0(N0(), 4);
        IBinder readStrongBinder = M0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (queryLocalInterface instanceof a) {
                aVar = (a) queryLocalInterface;
            } else {
                aVar = new a8.a(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 10);
            }
        }
        M0.recycle();
        return aVar;
    }

    public final g W0(y6.b bVar) {
        g aVar;
        Parcel N0 = N0();
        t7.b.c(N0, bVar);
        N0.writeInt(0);
        Parcel M0 = M0(N0, 3);
        IBinder readStrongBinder = M0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (queryLocalInterface instanceof g) {
                aVar = (g) queryLocalInterface;
            } else {
                aVar = new a8.a(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 10);
            }
        }
        M0.recycle();
        return aVar;
    }

    public final t7.e X0() {
        t7.e aVar;
        Parcel M0 = M0(N0(), 5);
        IBinder readStrongBinder = M0.readStrongBinder();
        int i10 = t7.d.f48758b;
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            if (queryLocalInterface instanceof t7.e) {
                aVar = (t7.e) queryLocalInterface;
            } else {
                aVar = new a8.a(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 10);
            }
        }
        M0.recycle();
        return aVar;
    }
}
