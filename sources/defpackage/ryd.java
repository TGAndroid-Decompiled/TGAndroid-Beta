package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class ryd extends b4 {
    public static final Parcelable.Creator<ryd> CREATOR = new qyd((byte) 8);
    public final String a;

    public ryd(String str) {
        this.a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.s(parcel, r);
    }
}
