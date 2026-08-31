package n7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class fg extends a7.a implements hg {
    public final eg U0(l6.b bVar, kg kgVar) {
        eg aVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f136c);
        int i10 = t.f15730a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        kgVar.writeToParcel(obtain, 0);
        Parcel O0 = O0(obtain, 1);
        IBinder readStrongBinder = O0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
            if (queryLocalInterface instanceof eg) {
                aVar = (eg) queryLocalInterface;
            } else {
                aVar = new a7.a(readStrongBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter", 7);
            }
        }
        O0.recycle();
        return aVar;
    }
}
