package j7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class eg extends b7.a implements gg {
    public final dg U0(h6.b bVar, jg jgVar) {
        dg aVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f1550c);
        int i9 = t.f14098a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        jgVar.writeToParcel(obtain, 0);
        Parcel O0 = O0(obtain, 1);
        IBinder readStrongBinder = O0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
            if (queryLocalInterface instanceof dg) {
                aVar = (dg) queryLocalInterface;
            } else {
                aVar = new b7.a(readStrongBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter", 6);
            }
        }
        O0.recycle();
        return aVar;
    }
}
