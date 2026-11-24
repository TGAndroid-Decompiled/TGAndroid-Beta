package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class ve0 extends b4 {
    public static final Parcelable.Creator<ve0> CREATOR = new c0f((byte) 5);
    public String a;
    public String b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        jte.s(parcel, r);
    }
}
