package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class lvd extends f1d {
    public final jdd Z() {
        jdd f1dVar;
        Parcel Q = Q(R(), 4);
        IBinder readStrongBinder = Q.readStrongBinder();
        if (readStrongBinder == null) {
            f1dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (queryLocalInterface instanceof jdd) {
                f1dVar = (jdd) queryLocalInterface;
            } else {
                f1dVar = new f1d(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", (byte) 6);
            }
        }
        Q.recycle();
        return f1dVar;
    }

    public final mye a0(eq7 eq7Var) {
        mye f1dVar;
        Parcel R = R();
        tid.c(R, eq7Var);
        R.writeInt(0);
        Parcel Q = Q(R, 3);
        IBinder readStrongBinder = Q.readStrongBinder();
        if (readStrongBinder == null) {
            f1dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (queryLocalInterface instanceof mye) {
                f1dVar = (mye) queryLocalInterface;
            } else {
                f1dVar = new f1d(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", (byte) 6);
            }
        }
        Q.recycle();
        return f1dVar;
    }

    public final qje b0() {
        qje f1dVar;
        Parcel Q = Q(R(), 5);
        IBinder readStrongBinder = Q.readStrongBinder();
        int i = dee.b;
        if (readStrongBinder == null) {
            f1dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            if (queryLocalInterface instanceof qje) {
                f1dVar = (qje) queryLocalInterface;
            } else {
                f1dVar = new f1d(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", (byte) 6);
            }
        }
        Q.recycle();
        return f1dVar;
    }
}
