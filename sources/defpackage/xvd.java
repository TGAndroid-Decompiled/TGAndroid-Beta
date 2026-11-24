package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class xvd extends b4 {
    public static final Parcelable.Creator<xvd> CREATOR = new rpd((byte) 25);
    public final int a;
    public final String b;

    public xvd(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.l(parcel, 3, this.b);
        jte.s(parcel, r);
    }
}
