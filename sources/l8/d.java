package l8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class d extends a8.a {
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
                aVar = new a8.a(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 11);
            }
        }
        O0.recycle();
        return aVar;
    }

    public final f Y0(a7.b bVar) {
        f aVar;
        Parcel P0 = P0();
        v7.b.c(P0, bVar);
        P0.writeInt(0);
        Parcel O0 = O0(P0, 3);
        IBinder readStrongBinder = O0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (queryLocalInterface instanceof f) {
                aVar = (f) queryLocalInterface;
            } else {
                aVar = new a8.a(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 11);
            }
        }
        O0.recycle();
        return aVar;
    }

    public final v7.e Z0() {
        v7.e aVar;
        Parcel O0 = O0(P0(), 5);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i7 = v7.d.f57131b;
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            if (queryLocalInterface instanceof v7.e) {
                aVar = (v7.e) queryLocalInterface;
            } else {
                aVar = new a8.a(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 11);
            }
        }
        O0.recycle();
        return aVar;
    }
}
