package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class xzc extends b4 {
    public static final Parcelable.Creator<xzc> CREATOR = new hv6((byte) 21);
    public final String a;

    public xzc(String str) {
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
