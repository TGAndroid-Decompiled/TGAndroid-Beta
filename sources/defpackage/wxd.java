package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class wxd extends v3d implements oae {
    public final trd Z(br7 br7Var, hre hreVar) {
        trd v3dVar;
        Parcel R = R();
        int i = mld.a;
        R.writeStrongBinder(br7Var);
        R.writeInt(1);
        hreVar.writeToParcel(R, 0);
        Parcel T = T(R, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        if (readStrongBinder == null) {
            v3dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            if (queryLocalInterface instanceof trd) {
                v3dVar = (trd) queryLocalInterface;
            } else {
                v3dVar = new v3d(readStrongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", (byte) 7);
            }
        }
        T.recycle();
        return v3dVar;
    }
}
