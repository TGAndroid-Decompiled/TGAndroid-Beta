package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class hcd extends v3d {
    public final ycd Z(ld1 ld1Var, al5 al5Var, kad kadVar) {
        ycd v3dVar;
        Parcel R = R();
        ald.c(R, ld1Var);
        ald.d(R, al5Var);
        ald.d(R, kadVar);
        Parcel T = T(R, 3);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = scd.b;
        if (readStrongBinder == null) {
            v3dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            if (queryLocalInterface instanceof ycd) {
                v3dVar = (ycd) queryLocalInterface;
            } else {
                v3dVar = new v3d(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession", (byte) 3);
            }
        }
        T.recycle();
        return v3dVar;
    }

    public final ged a0(br7 br7Var, al5 al5Var, al5 al5Var2) {
        ged v3dVar;
        Parcel R = R();
        ald.d(R, br7Var);
        ald.d(R, al5Var);
        ald.d(R, al5Var2);
        Parcel T = T(R, 5);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = xdd.b;
        if (readStrongBinder == null) {
            v3dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            if (queryLocalInterface instanceof ged) {
                v3dVar = (ged) queryLocalInterface;
            } else {
                v3dVar = new v3d(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService", (byte) 3);
            }
        }
        T.recycle();
        return v3dVar;
    }

    public final zed b0(String str, String str2, kad kadVar) {
        zed v3dVar;
        Parcel R = R();
        R.writeString(str);
        R.writeString(str2);
        ald.d(R, kadVar);
        Parcel T = T(R, 2);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = ved.b;
        if (readStrongBinder == null) {
            v3dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            if (queryLocalInterface instanceof zed) {
                v3dVar = (zed) queryLocalInterface;
            } else {
                v3dVar = new v3d(readStrongBinder, "com.google.android.gms.cast.framework.ISession", (byte) 3);
            }
        }
        T.recycle();
        return v3dVar;
    }

    public final ome c0(br7 br7Var, kad kadVar, int i, int i2) {
        ome v3dVar;
        Parcel R = R();
        ald.d(R, br7Var);
        ald.d(R, kadVar);
        R.writeInt(i);
        R.writeInt(i2);
        R.writeInt(0);
        R.writeLong(2097152L);
        R.writeInt(5);
        R.writeInt(333);
        R.writeInt(10000);
        Parcel T = T(R, 6);
        IBinder readStrongBinder = T.readStrongBinder();
        int i3 = zge.b;
        if (readStrongBinder == null) {
            v3dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            if (queryLocalInterface instanceof ome) {
                v3dVar = (ome) queryLocalInterface;
            } else {
                v3dVar = new v3d(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", (byte) 3);
            }
        }
        T.recycle();
        return v3dVar;
    }

    public final ome d0(br7 br7Var, br7 br7Var2, kad kadVar, int i, int i2) {
        ome v3dVar;
        Parcel R = R();
        ald.d(R, br7Var);
        ald.d(R, br7Var2);
        ald.d(R, kadVar);
        R.writeInt(i);
        R.writeInt(i2);
        R.writeInt(0);
        R.writeLong(2097152L);
        R.writeInt(5);
        R.writeInt(333);
        R.writeInt(10000);
        Parcel T = T(R, 7);
        IBinder readStrongBinder = T.readStrongBinder();
        int i3 = zge.b;
        if (readStrongBinder == null) {
            v3dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            if (queryLocalInterface instanceof ome) {
                v3dVar = (ome) queryLocalInterface;
            } else {
                v3dVar = new v3d(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", (byte) 3);
            }
        }
        T.recycle();
        return v3dVar;
    }
}
