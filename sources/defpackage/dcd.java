package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class dcd extends b4 {
    public static final Parcelable.Creator<dcd> CREATOR = new lbd((byte) 6);
    public final obd a;
    public final obd b;

    public dcd(obd obdVar, obd obdVar2) {
        this.a = obdVar;
        this.b = obdVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcd)) {
            return false;
        }
        dcd dcdVar = (dcd) obj;
        if (qe1.d(this.a, dcdVar.a) && qe1.d(this.b, dcdVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 2, this.a, i);
        mve.k(parcel, 3, this.b, i);
        mve.s(parcel, r);
    }
}
