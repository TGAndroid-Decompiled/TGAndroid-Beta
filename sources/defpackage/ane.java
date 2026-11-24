package defpackage;

import android.os.Parcel;
public abstract class ane extends dzc implements gse {
    public ane() {
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
        rgd.b(parcel);
        t((w5e) rgd.a(parcel, w5e.CREATOR));
        return true;
    }
}
