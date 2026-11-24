package defpackage;

import android.os.Parcel;
public abstract class dpe extends e1d implements jue {
    public dpe() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", (byte) 8);
    }

    @Override
    public final boolean e(Parcel parcel, int i) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            zze();
            return true;
        }
        sid.b(parcel);
        t((z7e) sid.a(parcel, z7e.CREATOR));
        return true;
    }
}
