package c7;

import android.os.Parcel;

public abstract class z extends b7.a implements a0 {
    public z() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 1);
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
        x xVar = (x) e.a(parcel, x.CREATOR);
        e.b(parcel);
        Z(xVar);
        return true;
    }
}
