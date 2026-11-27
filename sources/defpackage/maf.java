package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class maf extends v3d implements raf {
    public final kaf Z(br7 br7Var, zaf zafVar) {
        kaf v3dVar;
        Parcel R = R();
        int i = mld.a;
        R.writeStrongBinder(br7Var);
        R.writeInt(1);
        zafVar.writeToParcel(R, 0);
        Parcel T = T(R, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        if (readStrongBinder == null) {
            v3dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            if (queryLocalInterface instanceof kaf) {
                v3dVar = (kaf) queryLocalInterface;
            } else {
                v3dVar = new v3d(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", (byte) 7);
            }
        }
        T.recycle();
        return v3dVar;
    }
}
