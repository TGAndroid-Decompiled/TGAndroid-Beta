package i8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class e extends a9.a {
    public final a W0() {
        a aVar;
        Parcel N0 = N0(O0(), 4);
        IBinder readStrongBinder = N0.readStrongBinder();
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
        N0.recycle();
        return aVar;
    }

    public final g X0(x6.b bVar) {
        g aVar;
        Parcel O0 = O0();
        s7.b.c(O0, bVar);
        O0.writeInt(0);
        Parcel N0 = N0(O0, 3);
        IBinder readStrongBinder = N0.readStrongBinder();
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
        N0.recycle();
        return aVar;
    }

    public final s7.e Y0() {
        s7.e aVar;
        Parcel N0 = N0(O0(), 5);
        IBinder readStrongBinder = N0.readStrongBinder();
        int i10 = s7.d.f41804b;
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
        N0.recycle();
        return aVar;
    }
}
