package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class r6c extends b4 {
    public static final Parcelable.Creator<r6c> CREATOR = new rhe((byte) 29);
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
