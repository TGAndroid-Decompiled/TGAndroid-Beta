package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class gi6 extends b4 {
    public static final Parcelable.Creator<gi6> CREATOR = new qyd((byte) 22);
    public final String a;

    public gi6(String str) {
        fre.i(str, "json must not be null");
        this.a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.s(parcel, r);
    }
}
