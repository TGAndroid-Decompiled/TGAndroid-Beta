package f7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import j7.f5;
public final class o extends c6.a {
    public static final Parcelable.Creator<o> CREATOR = new n(1);
    public final LocationRequest f6035a;

    public o(com.google.android.gms.location.LocationRequest r28, java.util.ArrayList r29, boolean r30, boolean r31, java.lang.String r32, boolean r33, boolean r34, java.lang.String r35, long r36) {
        throw new UnsupportedOperationException("Method not decompiled: f7.o.<init>(com.google.android.gms.location.LocationRequest, java.util.ArrayList, boolean, boolean, java.lang.String, boolean, boolean, java.lang.String, long):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return b6.m.l(this.f6035a, ((o) obj).f6035a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6035a.hashCode();
    }

    public final String toString() {
        return this.f6035a.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 1, this.f6035a, i10);
        f5.r(parcel, q10);
    }
}
