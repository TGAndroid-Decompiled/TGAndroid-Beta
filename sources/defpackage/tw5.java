package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class tw5 extends b4 {
    public static final Parcelable.Creator<tw5> CREATOR = new igd((byte) 22);
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
