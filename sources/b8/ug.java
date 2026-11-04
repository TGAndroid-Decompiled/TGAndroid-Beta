package b8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class ug extends a implements wg {
    public final tg X0(z6.b bVar, zg zgVar) {
        tg aVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2457c);
        int i3 = a0.f2458a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        zgVar.writeToParcel(obtain, 0);
        Parcel R0 = R0(obtain, 1);
        IBinder readStrongBinder = R0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
            if (queryLocalInterface instanceof tg) {
                aVar = (tg) queryLocalInterface;
            } else {
                aVar = new a(readStrongBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter", 0);
            }
        }
        R0.recycle();
        return aVar;
    }
}
