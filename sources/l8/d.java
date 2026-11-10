package l8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class d extends a8.a {
    public final a x1() {
        a aVar;
        Parcel o12 = o1(p1(), 4);
        IBinder readStrongBinder = o12.readStrongBinder();
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
        o12.recycle();
        return aVar;
    }

    public final f y1(a7.b bVar) {
        f aVar;
        Parcel p12 = p1();
        v7.b.c(p12, bVar);
        p12.writeInt(0);
        Parcel o12 = o1(p12, 3);
        IBinder readStrongBinder = o12.readStrongBinder();
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
        o12.recycle();
        return aVar;
    }

    public final v7.e z1() {
        v7.e aVar;
        Parcel o12 = o1(p1(), 5);
        IBinder readStrongBinder = o12.readStrongBinder();
        int i7 = v7.d.f57256b;
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
        o12.recycle();
        return aVar;
    }
}
