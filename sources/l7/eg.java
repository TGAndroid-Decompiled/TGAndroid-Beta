package l7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class eg extends com.google.android.gms.internal.cast.a implements gg {
    public final dg U0(j6.b bVar, jg jgVar) {
        dg aVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3997c);
        int i10 = t.f14957a;
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
                aVar = new com.google.android.gms.internal.cast.a(readStrongBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter", 6);
            }
        }
        O0.recycle();
        return aVar;
    }
}
