package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
public final class dmd extends dzc implements bbf {
    public static final int c = 0;
    public final qx b;

    public dmd(qx qxVar) {
        super("com.google.android.gms.location.ILocationCallback", (byte) 8);
        this.b = qxVar;
    }

    public final void T() {
        this.b.h().a(new v39(this, (byte) 28));
    }

    public final void U(w56 w56Var) {
        qx qxVar = this.b;
        synchronized (qxVar) {
            w56 w56Var2 = (w56) qxVar.c;
            if (w56Var2 != w56Var) {
                w56Var2.b = null;
                qxVar.c = w56Var;
            }
        }
    }

    @Override
    public final boolean e(Parcel parcel, int i) {
        qx qxVar = this.b;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                T();
                return true;
            }
            LocationAvailability locationAvailability = (LocationAvailability) rgd.a(parcel, LocationAvailability.CREATOR);
            rgd.b(parcel);
            qxVar.h().a(new f6d((byte) 1));
            return true;
        }
        rgd.b(parcel);
        qxVar.h().a(new g29((LocationResult) rgd.a(parcel, LocationResult.CREATOR), (byte) 27));
        return true;
    }
}
