package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class s9d extends b4 {
    public static final Parcelable.Creator<s9d> CREATOR = new j9d((byte) 4);
    public String a;
    public Bundle b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.b(parcel, 3, this.b);
        jte.s(parcel, r);
    }
}
