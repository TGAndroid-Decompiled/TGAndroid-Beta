package defpackage;

import android.os.Parcel;
public abstract class rre extends u3d implements xwe {
    public rre() {
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
        ild.b(parcel);
        t((mae) ild.a(parcel, mae.CREATOR));
        return true;
    }
}
