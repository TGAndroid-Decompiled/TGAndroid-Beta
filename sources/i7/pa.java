package i7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class pa extends c7.a implements ra {
    public final oa U0(i6.b bVar, ta taVar) {
        oa oaVar;
        Parcel parcelM0 = M0();
        int i10 = c0.f10602a;
        parcelM0.writeStrongBinder(bVar);
        parcelM0.writeInt(1);
        taVar.writeToParcel(parcelM0, 0);
        Parcel parcelO0 = O0(parcelM0, 1);
        IBinder strongBinder = parcelO0.readStrongBinder();
        if (strongBinder == null) {
            oaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            oaVar = iInterfaceQueryLocalInterface instanceof oa ? (oa) iInterfaceQueryLocalInterface : new oa(strongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", 5);
        }
        parcelO0.recycle();
        return oaVar;
    }
}
