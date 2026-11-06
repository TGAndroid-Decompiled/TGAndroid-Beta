package c8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class cg extends a8.a implements eg {
    public final bg X0(a7.b bVar, hg hgVar) {
        bg aVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f307c);
        int i7 = t.f5843a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        hgVar.writeToParcel(obtain, 0);
        Parcel R0 = R0(obtain, 1);
        IBinder readStrongBinder = R0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
            if (queryLocalInterface instanceof bg) {
                aVar = (bg) queryLocalInterface;
            } else {
                aVar = new a8.a(readStrongBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter", 1);
            }
        }
        R0.recycle();
        return aVar;
    }
}
