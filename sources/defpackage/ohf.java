package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class ohf extends f1d implements qhf {
    public final mhf Z(eq7 eq7Var, whf whfVar) {
        mhf f1dVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i = xid.a;
        obtain.writeStrongBinder(eq7Var);
        obtain.writeInt(1);
        whfVar.writeToParcel(obtain, 0);
        Parcel T = T(obtain, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        if (readStrongBinder == null) {
            f1dVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
            if (queryLocalInterface instanceof mhf) {
                f1dVar = (mhf) queryLocalInterface;
            } else {
                f1dVar = new f1d(readStrongBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter", (byte) 8);
            }
        }
        T.recycle();
        return f1dVar;
    }
}
