package d7;

import android.os.Parcel;
public abstract class x extends c7.a implements y {
    public x() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 4);
    }

    @Override
    public final boolean I0(Parcel parcel, int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            zze();
            return true;
        }
        d.b(parcel);
        g0((v) d.a(parcel, v.CREATOR));
        return true;
    }
}
