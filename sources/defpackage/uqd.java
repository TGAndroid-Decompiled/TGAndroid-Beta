package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
public final class uqd extends u3d implements rff {
    public static final int c = 0;
    public final rx b;

    public uqd(rx rxVar) {
        super("com.google.android.gms.location.ILocationCallback", (byte) 8);
        this.b = rxVar;
    }

    public final void T() {
        this.b.j().a(new l09(this, (byte) 28));
    }

    public final void U(a86 a86Var) {
        rx rxVar = this.b;
        synchronized (rxVar) {
            a86 a86Var2 = (a86) rxVar.c;
            if (a86Var2 != a86Var) {
                a86Var2.b = null;
                rxVar.c = a86Var;
            }
        }
    }

    @Override
    public final boolean e(Parcel parcel, int i) {
        rx rxVar = this.b;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                T();
                return true;
            }
            LocationAvailability locationAvailability = (LocationAvailability) ild.a(parcel, LocationAvailability.CREATOR);
            ild.b(parcel);
            rxVar.j().a(new yad((byte) 1));
            return true;
        }
        ild.b(parcel);
        rxVar.j().a(new g9d((LocationResult) ild.a(parcel, LocationResult.CREATOR), (byte) 2));
        return true;
    }
}
