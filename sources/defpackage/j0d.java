package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class j0d extends b4 {
    public static final Parcelable.Creator<j0d> CREATOR = new hv6((byte) 25);
    public final String a;

    public j0d(String str) {
        str.getClass();
        this.a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.s(parcel, r);
    }
}
