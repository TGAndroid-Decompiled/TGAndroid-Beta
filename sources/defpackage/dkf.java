package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class dkf extends v3d implements fkf {
    public final bkf Z(br7 br7Var, lkf lkfVar) {
        bkf v3dVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i = nld.a;
        obtain.writeStrongBinder(br7Var);
        obtain.writeInt(1);
        lkfVar.writeToParcel(obtain, 0);
        Parcel T = T(obtain, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        if (readStrongBinder == null) {
            v3dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
            if (queryLocalInterface instanceof bkf) {
                v3dVar = (bkf) queryLocalInterface;
            } else {
                v3dVar = new v3d(readStrongBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter", (byte) 8);
            }
        }
        T.recycle();
        return v3dVar;
    }
}
