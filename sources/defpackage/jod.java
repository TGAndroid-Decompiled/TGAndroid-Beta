package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
public final class jod extends b4 {
    public static final Parcelable.Creator<jod> CREATOR = new igd((byte) 28);
    public final LocationRequest a;

    public jod(com.google.android.gms.location.LocationRequest r26, java.util.ArrayList r27, boolean r28, boolean r29, java.lang.String r30, boolean r31, boolean r32, java.lang.String r33, long r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jod.<init>(com.google.android.gms.location.LocationRequest, java.util.ArrayList, boolean, boolean, java.lang.String, boolean, boolean, java.lang.String, long):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jod) {
            return cqe.a(this.a, ((jod) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 1, this.a, i);
        jte.s(parcel, r);
    }
}
