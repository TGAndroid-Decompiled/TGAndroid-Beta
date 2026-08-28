package b7;

import android.os.Parcel;
public abstract class a0 extends a7.a implements b0 {
    public a0() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 1);
    }

    @Override
    public final boolean I0(Parcel parcel, int i9) {
        if (i9 != 1) {
            if (i9 != 2) {
                return false;
            }
            zze();
            return true;
        }
        f.b(parcel);
        x0((y) f.a(parcel, y.CREATOR));
        return true;
    }
}
