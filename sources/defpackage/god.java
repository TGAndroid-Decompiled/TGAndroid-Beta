package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
public final class god extends e1d implements cdf {
    public static final int c = 0;
    public final ry b;

    public god(ry ryVar) {
        super("com.google.android.gms.location.ILocationCallback", (byte) 8);
        this.b = ryVar;
    }

    public final void T() {
        this.b.h().a(new fkd(this, (byte) 1));
    }

    public final void U(w76 w76Var) {
        ry ryVar = this.b;
        synchronized (ryVar) {
            w76 w76Var2 = (w76) ryVar.c;
            if (w76Var2 != w76Var) {
                w76Var2.b = null;
                ryVar.c = w76Var;
            }
        }
    }

    @Override
    public final boolean e(Parcel parcel, int i) {
        ry ryVar = this.b;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                T();
                return true;
            }
            LocationAvailability locationAvailability = (LocationAvailability) sid.a(parcel, LocationAvailability.CREATOR);
            sid.b(parcel);
            ryVar.h().a(new h8d((byte) 1));
            return true;
        }
        sid.b(parcel);
        ryVar.h().a(new et8((LocationResult) sid.a(parcel, LocationResult.CREATOR), (byte) 29));
        return true;
    }
}
