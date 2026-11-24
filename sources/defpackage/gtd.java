package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class gtd extends ezc implements y5e {
    public final cnd Z(bo7 bo7Var, qme qmeVar) {
        cnd ezcVar;
        Parcel R = R();
        int i = vgd.a;
        R.writeStrongBinder(bo7Var);
        R.writeInt(1);
        qmeVar.writeToParcel(R, 0);
        Parcel T = T(R, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        if (readStrongBinder == null) {
            ezcVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            if (queryLocalInterface instanceof cnd) {
                ezcVar = (cnd) queryLocalInterface;
            } else {
                ezcVar = new ezc(readStrongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", (byte) 7);
            }
        }
        T.recycle();
        return ezcVar;
    }
}
