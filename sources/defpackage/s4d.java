package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class s4d extends b4 {
    public static final Parcelable.Creator<s4d> CREATOR = new j9d((byte) 13);
    public final String a;

    public s4d(String str) {
        this.a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.s(parcel, r);
    }
}
