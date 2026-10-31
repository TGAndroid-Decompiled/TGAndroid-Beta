package i8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class e extends a9.a {
    public final a X0() {
        a aVar;
        Parcel O0 = O0(P0(), 4);
        IBinder readStrongBinder = O0.readStrongBinder();
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
        O0.recycle();
        return aVar;
    }

    public final g Y0(x6.b bVar) {
        g aVar;
        Parcel P0 = P0();
        s7.b.c(P0, bVar);
        P0.writeInt(0);
        Parcel O0 = O0(P0, 3);
        IBinder readStrongBinder = O0.readStrongBinder();
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
        O0.recycle();
        return aVar;
    }

    public final s7.e Z0() {
        s7.e aVar;
        Parcel O0 = O0(P0(), 5);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i10 = s7.d.f48089b;
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
        O0.recycle();
        return aVar;
    }
}
