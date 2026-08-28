package b7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
public final class k extends a7.a implements q7.n {
    public static final int f1564c = 0;
    public final androidx.activity.o f1565b;

    public k(androidx.activity.o oVar) {
        super("com.google.android.gms.location.ILocationCallback", 1);
        this.f1565b = oVar;
    }

    @Override
    public final boolean I0(Parcel parcel, int i9) {
        androidx.activity.o oVar = this.f1565b;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    return false;
                }
                J0();
                return true;
            }
            f.b(parcel);
            oVar.e().a(new fa.c((LocationAvailability) f.a(parcel, LocationAvailability.CREATOR), 5));
            return true;
        }
        f.b(parcel);
        oVar.e().a(new xa.c((LocationResult) f.a(parcel, LocationResult.CREATOR), 6));
        return true;
    }

    public final void J0() {
        this.f1565b.e().a(new k5.i(this, 5));
    }

    public final void K0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.o oVar = this.f1565b;
        synchronized (oVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) oVar.f388b;
            if (pVar2 != pVar) {
                pVar2.f2872b = null;
                pVar2.f2873c = null;
                oVar.f388b = pVar;
            }
        }
    }
}
