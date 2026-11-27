package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class yxd extends v3d {
    public final agd Z() {
        agd v3dVar;
        Parcel Q = Q(R(), 4);
        IBinder readStrongBinder = Q.readStrongBinder();
        if (readStrongBinder == null) {
            v3dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (queryLocalInterface instanceof agd) {
                v3dVar = (agd) queryLocalInterface;
            } else {
                v3dVar = new v3d(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", (byte) 6);
            }
        }
        Q.recycle();
        return v3dVar;
    }

    public final b1f a0(br7 br7Var) {
        b1f v3dVar;
        Parcel R = R();
        jld.c(R, br7Var);
        R.writeInt(0);
        Parcel Q = Q(R, 3);
        IBinder readStrongBinder = Q.readStrongBinder();
        if (readStrongBinder == null) {
            v3dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (queryLocalInterface instanceof b1f) {
                v3dVar = (b1f) queryLocalInterface;
            } else {
                v3dVar = new v3d(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", (byte) 6);
            }
        }
        Q.recycle();
        return v3dVar;
    }

    public final gme b0() {
        gme v3dVar;
        Parcel Q = Q(R(), 5);
        IBinder readStrongBinder = Q.readStrongBinder();
        int i = sge.b;
        if (readStrongBinder == null) {
            v3dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            if (queryLocalInterface instanceof gme) {
                v3dVar = (gme) queryLocalInterface;
            } else {
                v3dVar = new v3d(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", (byte) 6);
            }
        }
        Q.recycle();
        return v3dVar;
    }
}
