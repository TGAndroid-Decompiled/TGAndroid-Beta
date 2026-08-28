package b7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import g7.p8;
public final class p extends y5.a {
    public static final Parcelable.Creator<p> CREATOR = new o(1);
    public final LocationRequest f1578a;

    public p(com.google.android.gms.location.LocationRequest r28, java.util.ArrayList r29, boolean r30, boolean r31, java.lang.String r32, boolean r33, boolean r34, java.lang.String r35, long r36) {
        throw new UnsupportedOperationException("Method not decompiled: b7.p.<init>(com.google.android.gms.location.LocationRequest, java.util.ArrayList, boolean, boolean, java.lang.String, boolean, boolean, java.lang.String, long):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return x5.l.l(this.f1578a, ((p) obj).f1578a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1578a.hashCode();
    }

    public final String toString() {
        return this.f1578a.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 1, this.f1578a, i9);
        p8.r(parcel, q10);
    }
}
