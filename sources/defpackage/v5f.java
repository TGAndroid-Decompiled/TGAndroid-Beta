package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class v5f extends ezc implements a6f {
    public final t5f Z(bo7 bo7Var, i6f i6fVar) {
        t5f ezcVar;
        Parcel R = R();
        int i = vgd.a;
        R.writeStrongBinder(bo7Var);
        R.writeInt(1);
        i6fVar.writeToParcel(R, 0);
        Parcel T = T(R, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        if (readStrongBinder == null) {
            ezcVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            if (queryLocalInterface instanceof t5f) {
                ezcVar = (t5f) queryLocalInterface;
            } else {
                ezcVar = new ezc(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", (byte) 7);
            }
        }
        T.recycle();
        return ezcVar;
    }
}
