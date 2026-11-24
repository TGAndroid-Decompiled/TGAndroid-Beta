package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class itd extends ezc {
    public final hbd Z() {
        hbd ezcVar;
        Parcel Q = Q(R(), 4);
        IBinder readStrongBinder = Q.readStrongBinder();
        if (readStrongBinder == null) {
            ezcVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (queryLocalInterface instanceof hbd) {
                ezcVar = (hbd) queryLocalInterface;
            } else {
                ezcVar = new ezc(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", (byte) 6);
            }
        }
        Q.recycle();
        return ezcVar;
    }

    public final kwe a0(bo7 bo7Var) {
        kwe ezcVar;
        Parcel R = R();
        sgd.c(R, bo7Var);
        R.writeInt(0);
        Parcel Q = Q(R, 3);
        IBinder readStrongBinder = Q.readStrongBinder();
        if (readStrongBinder == null) {
            ezcVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (queryLocalInterface instanceof kwe) {
                ezcVar = (kwe) queryLocalInterface;
            } else {
                ezcVar = new ezc(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", (byte) 6);
            }
        }
        Q.recycle();
        return ezcVar;
    }

    public final phe b0() {
        phe ezcVar;
        Parcel Q = Q(R(), 5);
        IBinder readStrongBinder = Q.readStrongBinder();
        int i = cce.b;
        if (readStrongBinder == null) {
            ezcVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            if (queryLocalInterface instanceof phe) {
                ezcVar = (phe) queryLocalInterface;
            } else {
                ezcVar = new ezc(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", (byte) 6);
            }
        }
        Q.recycle();
        return ezcVar;
    }
}
