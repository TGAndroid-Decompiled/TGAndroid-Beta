package c8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class cg extends a8.a implements eg {
    public final bg x1(a7.b bVar, hg hgVar) {
        bg aVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f307c);
        int i7 = t.f5846a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        hgVar.writeToParcel(obtain, 0);
        Parcel r12 = r1(obtain, 1);
        IBinder readStrongBinder = r12.readStrongBinder();
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
        r12.recycle();
        return aVar;
    }
}
