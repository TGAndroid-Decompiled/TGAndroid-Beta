package i8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class e extends a9.a {
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
                aVar = new a9.a(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 9);
            }
        }
        M0.recycle();
        return aVar;
    }

    public final g W0(x6.b bVar) {
        g aVar;
        Parcel N0 = N0();
        s7.b.c(N0, bVar);
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
                aVar = new a9.a(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 9);
            }
        }
        M0.recycle();
        return aVar;
    }

    public final s7.e X0() {
        s7.e aVar;
        Parcel M0 = M0(N0(), 5);
        IBinder readStrongBinder = M0.readStrongBinder();
        int i10 = s7.d.f47905b;
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            if (queryLocalInterface instanceof s7.e) {
                aVar = (s7.e) queryLocalInterface;
            } else {
                aVar = new a9.a(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 9);
            }
        }
        M0.recycle();
        return aVar;
    }
}
