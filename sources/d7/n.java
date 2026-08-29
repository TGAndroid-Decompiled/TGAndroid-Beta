package d7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
public final class n extends a6.a {
    public static final Parcelable.Creator<n> CREATOR = new m(1);
    public final LocationRequest f5453a;

    public n(com.google.android.gms.location.LocationRequest r28, java.util.ArrayList r29, boolean r30, boolean r31, java.lang.String r32, boolean r33, boolean r34, java.lang.String r35, long r36) {
        throw new UnsupportedOperationException("Method not decompiled: d7.n.<init>(com.google.android.gms.location.LocationRequest, java.util.ArrayList, boolean, boolean, java.lang.String, boolean, boolean, java.lang.String, long):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return z5.l.l(this.f5453a, ((n) obj).f5453a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5453a.hashCode();
    }

    public final String toString() {
        return this.f5453a.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.k(parcel, 1, this.f5453a, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
