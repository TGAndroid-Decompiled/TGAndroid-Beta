package k8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class d extends b8.a {
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
                aVar = new b8.a(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 10);
            }
        }
        O0.recycle();
        return aVar;
    }

    public final f Y0(z6.b bVar) {
        f aVar;
        Parcel P0 = P0();
        u7.b.c(P0, bVar);
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
                aVar = new b8.a(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 10);
            }
        }
        O0.recycle();
        return aVar;
    }

    public final u7.e Z0() {
        u7.e aVar;
        Parcel O0 = O0(P0(), 5);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i3 = u7.d.f55737b;
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            if (queryLocalInterface instanceof u7.e) {
                aVar = (u7.e) queryLocalInterface;
            } else {
                aVar = new b8.a(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 10);
            }
        }
        O0.recycle();
        return aVar;
    }
}
