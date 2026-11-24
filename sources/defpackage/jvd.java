package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class jvd extends f1d implements b8e {
    public final fpd Z(eq7 eq7Var, toe toeVar) {
        fpd f1dVar;
        Parcel R = R();
        int i = wid.a;
        R.writeStrongBinder(eq7Var);
        R.writeInt(1);
        toeVar.writeToParcel(R, 0);
        Parcel T = T(R, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        if (readStrongBinder == null) {
            f1dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            if (queryLocalInterface instanceof fpd) {
                f1dVar = (fpd) queryLocalInterface;
            } else {
                f1dVar = new f1d(readStrongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", (byte) 7);
            }
        }
        T.recycle();
        return f1dVar;
    }
}
