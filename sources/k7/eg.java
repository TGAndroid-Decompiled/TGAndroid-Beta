package k7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class eg extends c7.a implements gg {
    public final dg U0(i6.b bVar, jg jgVar) {
        dg dgVar;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f2457c);
        int i10 = t.f14952a;
        parcelObtain.writeStrongBinder(bVar);
        parcelObtain.writeInt(1);
        jgVar.writeToParcel(parcelObtain, 0);
        Parcel parcelO0 = O0(parcelObtain, 1);
        IBinder strongBinder = parcelO0.readStrongBinder();
        if (strongBinder == null) {
            dgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
            dgVar = iInterfaceQueryLocalInterface instanceof dg ? (dg) iInterfaceQueryLocalInterface : new dg(strongBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter", 6);
        }
        parcelO0.recycle();
        return dgVar;
    }
}
