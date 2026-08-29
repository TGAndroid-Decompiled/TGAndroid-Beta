package d7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
public final class i extends c7.a implements s7.m {
    public static final int f5439c = 0;
    public final androidx.activity.n f5440b;

    public i(androidx.activity.n nVar) {
        super("com.google.android.gms.location.ILocationCallback", 4);
        this.f5440b = nVar;
    }

    @Override
    public final boolean I0(Parcel parcel, int i10) {
        androidx.activity.n nVar = this.f5440b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                J0();
                return true;
            }
            d.b(parcel);
            nVar.e().a(new ha.c((LocationAvailability) d.a(parcel, LocationAvailability.CREATOR), 13));
            return true;
        }
        d.b(parcel);
        nVar.e().a(new za.c((LocationResult) d.a(parcel, LocationResult.CREATOR), 11));
        return true;
    }

    public final void J0() {
        this.f5440b.e().a(new m5.i(this, 10));
    }

    public final void K0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.n nVar = this.f5440b;
        synchronized (nVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) nVar.f881b;
            if (pVar2 != pVar) {
                pVar2.f3886b = null;
                pVar2.f3887c = null;
                nVar.f881b = pVar;
            }
        }
    }
}
