package f7;

import android.os.Parcel;
public abstract class y extends a7.c implements z {
    public y() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 5);
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
        e.b(parcel);
        V((w) e.a(parcel, w.CREATOR));
        return true;
    }
}
