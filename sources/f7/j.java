package f7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
public final class j extends a7.c implements u7.m {
    public static final int f6131c = 0;
    public final androidx.activity.o f6132b;

    public j(androidx.activity.o oVar) {
        super("com.google.android.gms.location.ILocationCallback", 5);
        this.f6132b = oVar;
    }

    @Override
    public final boolean I0(Parcel parcel, int i10) {
        androidx.activity.o oVar = this.f6132b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                J0();
                return true;
            }
            e.b(parcel);
            oVar.e().a(new o5.i((LocationAvailability) e.a(parcel, LocationAvailability.CREATOR), 13));
            return true;
        }
        e.b(parcel);
        oVar.e().a(new ja.c((LocationResult) e.a(parcel, LocationResult.CREATOR)));
        return true;
    }

    public final void J0() {
        this.f6132b.e().a(new y5.h(this, 16));
    }

    public final void K0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.o oVar = this.f6132b;
        synchronized (oVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) oVar.f356b;
            if (pVar2 != pVar) {
                pVar2.f2778b = null;
                pVar2.f2779c = null;
                oVar.f356b = pVar;
            }
        }
    }
}
