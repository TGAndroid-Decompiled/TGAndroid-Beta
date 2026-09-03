package f7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
public final class j extends a7.c implements u7.m {
    public static final int f6012c = 0;
    public final androidx.activity.o f6013b;

    public j(androidx.activity.o oVar) {
        super("com.google.android.gms.location.ILocationCallback", 5);
        this.f6013b = oVar;
    }

    @Override
    public final boolean I0(Parcel parcel, int i10) {
        androidx.activity.o oVar = this.f6013b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                J0();
                return true;
            }
            e.b(parcel);
            oVar.e().a(new ja.c((LocationAvailability) e.a(parcel, LocationAvailability.CREATOR), 10));
            return true;
        }
        e.b(parcel);
        oVar.e().a(new bb.b((LocationResult) e.a(parcel, LocationResult.CREATOR), 14));
        return true;
    }

    public final void J0() {
        this.f6013b.e().a(new o5.i(this, 17));
    }

    public final void K0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.o oVar = this.f6013b;
        synchronized (oVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) oVar.f333b;
            if (pVar2 != pVar) {
                pVar2.f2825b = null;
                pVar2.f2826c = null;
                oVar.f333b = pVar;
            }
        }
    }
}
