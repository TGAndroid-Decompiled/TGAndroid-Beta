package f7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
public final class j extends a7.c implements u7.m {
    public static final int f6023c = 0;
    public final androidx.activity.o f6024b;

    public j(androidx.activity.o oVar) {
        super("com.google.android.gms.location.ILocationCallback", 5);
        this.f6024b = oVar;
    }

    @Override
    public final boolean I0(Parcel parcel, int i10) {
        androidx.activity.o oVar = this.f6024b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                J0();
                return true;
            }
            e.b(parcel);
            oVar.e().a(new ja.c((LocationAvailability) e.a(parcel, LocationAvailability.CREATOR), 9));
            return true;
        }
        e.b(parcel);
        oVar.e().a(new a3.c((LocationResult) e.a(parcel, LocationResult.CREATOR), 14));
        return true;
    }

    public final void J0() {
        this.f6024b.e().a(new o5.i(this, 17));
    }

    public final void K0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.o oVar = this.f6024b;
        synchronized (oVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) oVar.f318b;
            if (pVar2 != pVar) {
                pVar2.f2842b = null;
                pVar2.f2843c = null;
                oVar.f318b = pVar;
            }
        }
    }
}
