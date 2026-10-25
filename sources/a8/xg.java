package a8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class xg extends a implements zg {
    public final wg V0(y6.b bVar, ch chVar) {
        wg aVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f344c);
        int i10 = a0.f345a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        chVar.writeToParcel(obtain, 0);
        Parcel P0 = P0(obtain, 1);
        IBinder readStrongBinder = P0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
            if (queryLocalInterface instanceof wg) {
                aVar = (wg) queryLocalInterface;
            } else {
                aVar = new a(readStrongBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter", 0);
            }
        }
        P0.recycle();
        return aVar;
    }
}
