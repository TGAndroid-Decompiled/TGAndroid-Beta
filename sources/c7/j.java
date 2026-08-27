package c7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

public final class j extends b7.a implements r7.m {

    public static final int f2470c = 0;

    public final androidx.activity.n f2471b;

    public j(androidx.activity.n nVar) {
        super("com.google.android.gms.location.ILocationCallback", 1);
        this.f2471b = nVar;
    }

    @Override
    public final boolean I0(Parcel parcel, int i10) {
        androidx.activity.n nVar = this.f2471b;
        if (i10 == 1) {
            LocationResult locationResult = (LocationResult) e.a(parcel, LocationResult.CREATOR);
            e.b(parcel);
            nVar.e().a(new k5.i(locationResult, 6));
            return true;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return false;
            }
            J0();
            return true;
        }
        LocationAvailability locationAvailability = (LocationAvailability) e.a(parcel, LocationAvailability.CREATOR);
        e.b(parcel);
        nVar.e().a(new a9.i(locationAvailability, 8));
        return true;
    }

    public final void J0() {
        this.f2471b.e().a(new ae.b(this, 6));
    }

    public final void K0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.n nVar = this.f2471b;
        synchronized (nVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) nVar.f894b;
            if (pVar2 != pVar) {
                pVar2.f3317b = null;
                pVar2.f3318c = null;
                nVar.f894b = pVar;
            }
        }
    }
}
