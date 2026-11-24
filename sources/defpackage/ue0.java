package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class ue0 extends b4 {
    public static final Parcelable.Creator<ue0> CREATOR = new rhe((byte) 15);
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
