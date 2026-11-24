package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class o7d extends ezc {
    public final f8d Z(dd1 dd1Var, yi5 yi5Var, r5d r5dVar) {
        f8d ezcVar;
        Parcel R = R();
        jgd.c(R, dd1Var);
        jgd.d(R, yi5Var);
        jgd.d(R, r5dVar);
        Parcel T = T(R, 3);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = z7d.b;
        if (readStrongBinder == null) {
            ezcVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            if (queryLocalInterface instanceof f8d) {
                ezcVar = (f8d) queryLocalInterface;
            } else {
                ezcVar = new ezc(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession", (byte) 3);
            }
        }
        T.recycle();
        return ezcVar;
    }

    public final n9d a0(bo7 bo7Var, yi5 yi5Var, yi5 yi5Var2) {
        n9d ezcVar;
        Parcel R = R();
        jgd.d(R, bo7Var);
        jgd.d(R, yi5Var);
        jgd.d(R, yi5Var2);
        Parcel T = T(R, 5);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = e9d.b;
        if (readStrongBinder == null) {
            ezcVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            if (queryLocalInterface instanceof n9d) {
                ezcVar = (n9d) queryLocalInterface;
            } else {
                ezcVar = new ezc(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService", (byte) 3);
            }
        }
        T.recycle();
        return ezcVar;
    }

    public final gad b0(String str, String str2, r5d r5dVar) {
        gad ezcVar;
        Parcel R = R();
        R.writeString(str);
        R.writeString(str2);
        jgd.d(R, r5dVar);
        Parcel T = T(R, 2);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = cad.b;
        if (readStrongBinder == null) {
            ezcVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            if (queryLocalInterface instanceof gad) {
                ezcVar = (gad) queryLocalInterface;
            } else {
                ezcVar = new ezc(readStrongBinder, "com.google.android.gms.cast.framework.ISession", (byte) 3);
            }
        }
        T.recycle();
        return ezcVar;
    }

    public final xhe c0(bo7 bo7Var, r5d r5dVar, int i, int i2) {
        xhe ezcVar;
        Parcel R = R();
        jgd.d(R, bo7Var);
        jgd.d(R, r5dVar);
        R.writeInt(i);
        R.writeInt(i2);
        R.writeInt(0);
        R.writeLong(2097152L);
        R.writeInt(5);
        R.writeInt(333);
        R.writeInt(10000);
        Parcel T = T(R, 6);
        IBinder readStrongBinder = T.readStrongBinder();
        int i3 = jce.b;
        if (readStrongBinder == null) {
            ezcVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            if (queryLocalInterface instanceof xhe) {
                ezcVar = (xhe) queryLocalInterface;
            } else {
                ezcVar = new ezc(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", (byte) 3);
            }
        }
        T.recycle();
        return ezcVar;
    }

    public final xhe d0(bo7 bo7Var, bo7 bo7Var2, r5d r5dVar, int i, int i2) {
        xhe ezcVar;
        Parcel R = R();
        jgd.d(R, bo7Var);
        jgd.d(R, bo7Var2);
        jgd.d(R, r5dVar);
        R.writeInt(i);
        R.writeInt(i2);
        R.writeInt(0);
        R.writeLong(2097152L);
        R.writeInt(5);
        R.writeInt(333);
        R.writeInt(10000);
        Parcel T = T(R, 7);
        IBinder readStrongBinder = T.readStrongBinder();
        int i3 = jce.b;
        if (readStrongBinder == null) {
            ezcVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            if (queryLocalInterface instanceof xhe) {
                ezcVar = (xhe) queryLocalInterface;
            } else {
                ezcVar = new ezc(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", (byte) 3);
            }
        }
        T.recycle();
        return ezcVar;
    }
}
