package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class x7f extends f1d implements c8f {
    public final v7f Z(eq7 eq7Var, k8f k8fVar) {
        v7f f1dVar;
        Parcel R = R();
        int i = wid.a;
        R.writeStrongBinder(eq7Var);
        R.writeInt(1);
        k8fVar.writeToParcel(R, 0);
        Parcel T = T(R, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        if (readStrongBinder == null) {
            f1dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            if (queryLocalInterface instanceof v7f) {
                f1dVar = (v7f) queryLocalInterface;
            } else {
                f1dVar = new f1d(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", (byte) 7);
            }
        }
        T.recycle();
        return f1dVar;
    }
}
