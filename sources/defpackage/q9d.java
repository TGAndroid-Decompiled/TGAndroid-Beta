package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class q9d extends f1d {
    public final had Z(le1 le1Var, xk5 xk5Var, t7d t7dVar) {
        had f1dVar;
        Parcel R = R();
        kid.c(R, le1Var);
        kid.d(R, xk5Var);
        kid.d(R, t7dVar);
        Parcel T = T(R, 3);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = bad.b;
        if (readStrongBinder == null) {
            f1dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            if (queryLocalInterface instanceof had) {
                f1dVar = (had) queryLocalInterface;
            } else {
                f1dVar = new f1d(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession", (byte) 3);
            }
        }
        T.recycle();
        return f1dVar;
    }

    public final pbd a0(eq7 eq7Var, xk5 xk5Var, xk5 xk5Var2) {
        pbd f1dVar;
        Parcel R = R();
        kid.d(R, eq7Var);
        kid.d(R, xk5Var);
        kid.d(R, xk5Var2);
        Parcel T = T(R, 5);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = gbd.b;
        if (readStrongBinder == null) {
            f1dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            if (queryLocalInterface instanceof pbd) {
                f1dVar = (pbd) queryLocalInterface;
            } else {
                f1dVar = new f1d(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService", (byte) 3);
            }
        }
        T.recycle();
        return f1dVar;
    }

    public final icd b0(String str, String str2, t7d t7dVar) {
        icd f1dVar;
        Parcel R = R();
        R.writeString(str);
        R.writeString(str2);
        kid.d(R, t7dVar);
        Parcel T = T(R, 2);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = ecd.b;
        if (readStrongBinder == null) {
            f1dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            if (queryLocalInterface instanceof icd) {
                f1dVar = (icd) queryLocalInterface;
            } else {
                f1dVar = new f1d(readStrongBinder, "com.google.android.gms.cast.framework.ISession", (byte) 3);
            }
        }
        T.recycle();
        return f1dVar;
    }

    public final yje c0(eq7 eq7Var, t7d t7dVar, int i, int i2) {
        yje f1dVar;
        Parcel R = R();
        kid.d(R, eq7Var);
        kid.d(R, t7dVar);
        R.writeInt(i);
        R.writeInt(i2);
        R.writeInt(0);
        R.writeLong(2097152L);
        R.writeInt(5);
        R.writeInt(333);
        R.writeInt(10000);
        Parcel T = T(R, 6);
        IBinder readStrongBinder = T.readStrongBinder();
        int i3 = kee.b;
        if (readStrongBinder == null) {
            f1dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            if (queryLocalInterface instanceof yje) {
                f1dVar = (yje) queryLocalInterface;
            } else {
                f1dVar = new f1d(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", (byte) 3);
            }
        }
        T.recycle();
        return f1dVar;
    }

    public final yje d0(eq7 eq7Var, eq7 eq7Var2, t7d t7dVar, int i, int i2) {
        yje f1dVar;
        Parcel R = R();
        kid.d(R, eq7Var);
        kid.d(R, eq7Var2);
        kid.d(R, t7dVar);
        R.writeInt(i);
        R.writeInt(i2);
        R.writeInt(0);
        R.writeLong(2097152L);
        R.writeInt(5);
        R.writeInt(333);
        R.writeInt(10000);
        Parcel T = T(R, 7);
        IBinder readStrongBinder = T.readStrongBinder();
        int i3 = kee.b;
        if (readStrongBinder == null) {
            f1dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            if (queryLocalInterface instanceof yje) {
                f1dVar = (yje) queryLocalInterface;
            } else {
                f1dVar = new f1d(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", (byte) 3);
            }
        }
        T.recycle();
        return f1dVar;
    }
}
