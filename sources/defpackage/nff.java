package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class nff extends ezc implements pff {
    public final lff Z(bo7 bo7Var, vff vffVar) {
        lff ezcVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i = wgd.a;
        obtain.writeStrongBinder(bo7Var);
        obtain.writeInt(1);
        vffVar.writeToParcel(obtain, 0);
        Parcel T = T(obtain, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        if (readStrongBinder == null) {
            ezcVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
            if (queryLocalInterface instanceof lff) {
                ezcVar = (lff) queryLocalInterface;
            } else {
                ezcVar = new ezc(readStrongBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter", (byte) 8);
            }
        }
        T.recycle();
        return ezcVar;
    }
}
