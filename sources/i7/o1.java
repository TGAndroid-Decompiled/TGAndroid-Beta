package i7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class o1 extends c7.a implements q3 {
    public final r0 U0(i6.b bVar, s6 s6Var) {
        r0 r0Var;
        Parcel parcelM0 = M0();
        int i10 = c0.f10602a;
        parcelM0.writeStrongBinder(bVar);
        parcelM0.writeInt(1);
        s6Var.writeToParcel(parcelM0, 0);
        Parcel parcelO0 = O0(parcelM0, 1);
        IBinder strongBinder = parcelO0.readStrongBinder();
        if (strongBinder == null) {
            r0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            r0Var = iInterfaceQueryLocalInterface instanceof r0 ? (r0) iInterfaceQueryLocalInterface : new r0(strongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", 5);
        }
        parcelO0.recycle();
        return r0Var;
    }
}
